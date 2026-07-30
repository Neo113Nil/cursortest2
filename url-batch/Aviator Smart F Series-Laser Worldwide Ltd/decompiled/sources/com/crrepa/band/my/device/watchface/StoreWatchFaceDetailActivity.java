package com.crrepa.band.my.device.watchface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.ActivityStoreWatchFaceDetailBinding;
import com.crrepa.band.my.device.watchface.adapter.StoreWatchFaceSimilarAdapter;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceDetailBean;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.Collection;

/* loaded from: classes2.dex */
public class StoreWatchFaceDetailActivity extends BaseVBActivity<ActivityStoreWatchFaceDetailBinding> implements x1.e {
    private static final int WATCH_FACE_DELETE_CODE = 18;
    private static final String WATCH_FACE_ID = "WATCH_FACE_ID";
    private String binFileUrl;
    private StoreWatchFaceDetailBean detailBean;
    private boolean downloadedWatchFace = false;
    private final com.crrepa.band.my.device.watchface.presenter.j presenter = new com.crrepa.band.my.device.watchface.presenter.j();
    private String previewUrl;
    private MaterialDialog timeoutDialog;
    private boolean uploaded;
    private int watchFaceId;

    private void cancelTimeoutDialog() {
        MaterialDialog materialDialog = this.timeoutDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        com.orhanobut.logger.f.d("cancel TimeoutDialog");
        this.timeoutDialog.dismiss();
    }

    public static Intent getCallingIntent(Context context, int i8) {
        Intent intent = new Intent(context, (Class<?>) StoreWatchFaceDetailActivity.class);
        intent.putExtra(WATCH_FACE_ID, i8);
        return intent;
    }

    private void initImgRound() {
        ((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview.setBorderWidth(R.dimen.watch_face_box_width);
        ((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview.setBorderColor(-16777216);
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        boolean isCircleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        boolean isRoundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        if (isCircleScreen) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview.setOval(true);
        } else if (isRoundedRectangleScreen) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview.setCornerRadius(connectBand.getRoundedRadius());
        } else {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview.setBorderCornerRadius(connectBand.getRoundedRadius());
        }
        ((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
    }

    private void initListener() {
        ((ActivityStoreWatchFaceDetailBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceDetailActivity.this.lambda$initListener$0(view);
            }
        });
        ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowApply.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceDetailActivity.this.lambda$initListener$1(view);
            }
        });
        ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowSkipEditWatchFace.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceDetailActivity.this.lambda$initListener$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            com.moyoung.dafit.module.common.utils.r0.showLong(getApplicationContext(), getString(R.string.band_setting_send_fail));
        } else if (BandBatteryProvider.isOtaLowBattery()) {
            com.moyoung.dafit.module.common.utils.r0.showLong(getApplicationContext(), getString(R.string.measure_low_battery_hint));
        } else {
            this.uploaded = true;
            uploadWatchFace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        startActivityForResult(DownloadWatchFaceEditActivity.getCallingIntent(this), 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderNetError$5(View view) {
        requestWatchFaceDetailBeanV3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderOperationBtn$6(Boolean bool) {
        if (bool.booleanValue()) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowSkipEditWatchFace.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSimilarWatchFaceList$7(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        if (this.uploaded) {
            return;
        }
        startActivity(getCallingIntent(this, ((StoreWatchFaceBean) baseQuickAdapter.getData().get(i8)).getId()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTimeoutDialog$3(MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        uploadWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTimeoutDialog$4(MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        finish();
    }

    @SuppressLint({"CheckResult"})
    private void renderOperationBtn() {
        if (this.detailBean == null || this.downloadedWatchFace) {
            return;
        }
        int availableStorage = BandStorageProvider.getAvailableStorage();
        com.orhanobut.logger.f.d("availableStorage: " + availableStorage);
        if (availableStorage <= 0) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowSkipEditWatchFace.setVisibility(8);
            ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowApply.setVisibility(0);
        } else if (availableStorage < this.detailBean.getSize()) {
            com.moyoung.dafit.module.common.utils.r0.showShort(getApplicationContext(), R.string.watch_face_no_storage_space);
            Observable.just(Boolean.valueOf(com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace())).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchface.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    StoreWatchFaceDetailActivity.this.lambda$renderOperationBtn$6((Boolean) obj);
                }
            });
        } else {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowSkipEditWatchFace.setVisibility(8);
            ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowApply.setVisibility(0);
        }
    }

    private void requestWatchFaceDetailBeanV3() {
        getPageLoadingUI().show();
        ((ActivityStoreWatchFaceDetailBinding) this.binding).rlNetError.setVisibility(8);
        this.presenter.requestWatchFaceDetailBeanV3(getApplicationContext(), this.watchFaceId);
    }

    private void showSimilarWatchFaceList(StoreWatchFaceDetailBean storeWatchFaceDetailBean) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_watch_face);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        StoreWatchFaceSimilarAdapter storeWatchFaceSimilarAdapter = new StoreWatchFaceSimilarAdapter();
        recyclerView.setAdapter(storeWatchFaceSimilarAdapter);
        if (storeWatchFaceDetailBean.getFace_list() == null || storeWatchFaceDetailBean.getFace_list().size() == 0) {
            storeWatchFaceSimilarAdapter.setEmptyView(getLayoutInflater().inflate(R.layout.view_empty_similar_watch_face, (ViewGroup) recyclerView, false));
        } else {
            storeWatchFaceSimilarAdapter.addData((Collection) storeWatchFaceDetailBean.getFace_list());
            storeWatchFaceSimilarAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.watchface.a0
                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                    StoreWatchFaceDetailActivity.this.lambda$showSimilarWatchFaceList$7(baseQuickAdapter, view, i8);
                }
            });
        }
    }

    private void showTimeoutDialog() {
        MaterialDialog materialDialog = this.timeoutDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            this.timeoutDialog = new MaterialDialog.e(this).title(R.string.watch_face_timeout).content(R.string.watch_face_timeout_hint).positiveText(R.string.retry).negativeText(R.string.abort).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.watchface.x
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog2, DialogAction dialogAction) {
                    StoreWatchFaceDetailActivity.this.lambda$showTimeoutDialog$3(materialDialog2, dialogAction);
                }
            }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.watchface.y
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog2, DialogAction dialogAction) {
                    StoreWatchFaceDetailActivity.this.lambda$showTimeoutDialog$4(materialDialog2, dialogAction);
                }
            }).cancelable(false).canceledOnTouchOutside(false).show();
        } else {
            com.orhanobut.logger.f.d("TimeoutDialog is showing");
        }
    }

    private void uploadWatchFace() {
        this.presenter.uploadWatchFace(this, this.binFileUrl, this.watchFaceId);
    }

    @Override // x1.e
    public void hindWatchFaceUploadButton() {
        ((ActivityStoreWatchFaceDetailBinding) this.binding).shadowApply.setVisibility(4);
    }

    @Override // x1.e
    public void hindWatchFaceUploadContent() {
        ((ActivityStoreWatchFaceDetailBinding) this.binding).tvUploadProgress.setVisibility(8);
        ((ActivityStoreWatchFaceDetailBinding) this.binding).pbWatchFace.setVisibility(8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        initListener();
        initImgRound();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        this.watchFaceId = getIntent().getIntExtra(WATCH_FACE_ID, -1);
        requestWatchFaceDetailBeanV3();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1 && i8 == 18) {
            renderOperationBtn();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.uploaded) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        cancelTimeoutDialog();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "表盘详情");
    }

    @Override // x1.e
    public void renderDownloadReported() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.watch_face_download_success));
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // x1.e
    public void renderIsDownloadedWatchFace(boolean z7) {
        this.downloadedWatchFace = z7;
        if (z7) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvIsDownloaded.setVisibility(0);
        } else {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvIsDownloaded.setVisibility(8);
        }
    }

    @Override // x1.e
    public void renderNetError() {
        getPageLoadingUI().hide();
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.net_disonnected));
        ((ActivityStoreWatchFaceDetailBinding) this.binding).rlNetError.setVisibility(0);
        ((ActivityStoreWatchFaceDetailBinding) this.binding).btnRefresh.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceDetailActivity.this.lambda$renderNetError$5(view);
            }
        });
    }

    @Override // x1.e
    public void renderUploadComplete() {
        this.presenter.saveWatchFaceInfo(this.watchFaceId, this.previewUrl);
        this.presenter.pushDownloads(this.watchFaceId);
    }

    @Override // x1.e
    public void renderUploadFail() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.watch_face_download_fail));
        finish();
    }

    @Override // x1.e
    public void renderUploadTimeout() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isRealtek()) {
            renderUploadFail();
        } else {
            showTimeoutDialog();
        }
    }

    @Override // x1.e
    public void renderWatchFaceUploadHint(String str) {
    }

    @Override // x1.e
    public void renderWatchFaceUploadPercent(int i8) {
        ((ActivityStoreWatchFaceDetailBinding) this.binding).pbWatchFace.setProgress(i8);
        ((ActivityStoreWatchFaceDetailBinding) this.binding).tvUploadProgress.setText(i8 + getString(R.string.percent_unit));
    }

    public void setWatchFacePreview(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand instanceof CustomizeBandModel) {
            ((CustomizeBandModel) connectBand).loadWatchFaceStorePreview(((ActivityStoreWatchFaceDetailBinding) this.binding).ivWatchFacePreview, str);
        }
    }

    @Override // x1.e
    public void showWatchFaceDetail(StoreWatchFaceDetailBean storeWatchFaceDetailBean) {
        getPageLoadingUI().hide();
        this.detailBean = storeWatchFaceDetailBean;
        this.binFileUrl = storeWatchFaceDetailBean.getFile();
        this.previewUrl = storeWatchFaceDetailBean.getPreview();
        setWatchFacePreview(storeWatchFaceDetailBean.getPreview());
        ((ActivityStoreWatchFaceDetailBinding) this.binding).tvName.setText(storeWatchFaceDetailBean.getName());
        ((ActivityStoreWatchFaceDetailBinding) this.binding).tvFileSize.setText(com.moyoung.dafit.module.common.utils.l0.getStorageSize(storeWatchFaceDetailBean.getSize()));
        ((ActivityStoreWatchFaceDetailBinding) this.binding).tvPrice.setText(R.string.watch_face_price_free);
        if (storeWatchFaceDetailBean.getUploader() != null) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvDesigner.setVisibility(0);
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvDesigner.setText(getString(R.string.watch_face_design_by) + cn.hutool.core.text.l.SPACE + storeWatchFaceDetailBean.getUploader());
        }
        if (com.moyoung.dafit.module.common.utils.u.isSimplified() && !TextUtils.isEmpty(storeWatchFaceDetailBean.getRemark_cn())) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvDescription.setText(storeWatchFaceDetailBean.getRemark_cn());
        } else if (!TextUtils.isEmpty(storeWatchFaceDetailBean.getRemark_en())) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvDescription.setText(storeWatchFaceDetailBean.getRemark_en());
        } else if (TextUtils.isEmpty(storeWatchFaceDetailBean.getRemark_lang())) {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvDescription.setText(getString(R.string.watch_face_no_description));
        } else {
            ((ActivityStoreWatchFaceDetailBinding) this.binding).tvDescription.setText(storeWatchFaceDetailBean.getRemark_lang());
        }
        renderOperationBtn();
        showSimilarWatchFaceList(storeWatchFaceDetailBean);
    }

    @Override // x1.e
    public void showWatchFaceUploadContent() {
        ((ActivityStoreWatchFaceDetailBinding) this.binding).tvUploadProgress.setVisibility(0);
        ((ActivityStoreWatchFaceDetailBinding) this.binding).pbWatchFace.setVisibility(0);
    }
}
