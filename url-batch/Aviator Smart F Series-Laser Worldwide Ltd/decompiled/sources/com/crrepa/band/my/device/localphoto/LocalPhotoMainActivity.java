package com.crrepa.band.my.device.localphoto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityLocalPhotoMainBinding;
import com.crrepa.band.my.device.localphoto.adapter.LocalPhotoSavedPhotoAdapter;
import com.crrepa.band.my.device.localphoto.model.LocalImageModel;
import com.crrepa.band.my.device.localphoto.model.LocalPhotoSavedBean;
import com.crrepa.band.my.device.localphoto.model.PhotoDeleteFailedEvent;
import com.crrepa.band.my.device.localphoto.model.PhotoDeleteSucceedEvent;
import com.crrepa.band.my.device.localphoto.model.PhotoInfoUpdatedEvent;
import com.crrepa.band.my.device.localphoto.model.SavedPhotoInfoEvent;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class LocalPhotoMainActivity extends BaseVBActivity<ActivityLocalPhotoMainBinding> {
    public static final int MAX_COUNT = 100;
    private final LocalPhotoSavedPhotoAdapter photoAdapter = new LocalPhotoSavedPhotoAdapter();
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private boolean isDeletingState = false;
    private boolean isAddingState = false;

    private void deleteUnmatchedFileList() {
        this.disposableList.add(LocalImageModel.deleteUnmatchedFileList().subscribeOn(Schedulers.io()).subscribe());
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) LocalPhotoMainActivity.class);
    }

    private void hideEditMode() {
        this.photoAdapter.setEditMode(false);
        ((ActivityLocalPhotoMainBinding) this.binding).shadowAdd.setVisibility(0);
        ((ActivityLocalPhotoMainBinding) this.binding).shadowDelete.setVisibility(8);
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setText(R.string.edit);
        ((ActivityLocalPhotoMainBinding) this.binding).tvSelectAll.setVisibility(8);
        ((ActivityLocalPhotoMainBinding) this.binding).cbSelectAll.setVisibility(8);
        ((ActivityLocalPhotoMainBinding) this.binding).cbSelectAll.setChecked(false);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void initPhotoRv() {
        ((ActivityLocalPhotoMainBinding) this.binding).rvPhoto.setItemAnimator(null);
        ((ActivityLocalPhotoMainBinding) this.binding).rvPhoto.setLayoutManager(new GridLayoutManager((Context) this, 3, 1, false));
        ((ActivityLocalPhotoMainBinding) this.binding).rvPhoto.setAdapter(this.photoAdapter);
        this.photoAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.localphoto.i
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                LocalPhotoMainActivity.this.lambda$initPhotoRv$9(baseQuickAdapter, view, i8);
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void initScrollingTitle() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityLocalPhotoMainBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityLocalPhotoMainBinding) vb).appbar.tvTitle, ((ActivityLocalPhotoMainBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityLocalPhotoMainBinding) this.binding).appbar.toolbar);
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvTitle.setText(R.string.device_local_photo_title);
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvExpandedTitle.setText(R.string.device_local_photo_title);
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoMainActivity.this.lambda$initScrollingTitle$7(view);
            }
        });
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setText(R.string.edit);
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setTextColor(ContextCompat.getColor(this, R.color.main));
        ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoMainActivity.this.lambda$initScrollingTitle$8(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
        } else {
            LocalPhotoSelectedActivity.start(this);
            this.isAddingState = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        showDeleteConfirmDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        if (((ActivityLocalPhotoMainBinding) this.binding).cbSelectAll.isChecked()) {
            this.photoAdapter.selectAll();
        } else {
            this.photoAdapter.unSelectAll();
        }
        renderDeleteBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initPhotoRv$9(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        if (this.photoAdapter.isEditMode()) {
            LocalPhotoSavedBean localPhotoSavedBean = (LocalPhotoSavedBean) baseQuickAdapter.getData().get(i8);
            if (localPhotoSavedBean.isChecked()) {
                localPhotoSavedBean.resetCheckIndex();
            } else {
                localPhotoSavedBean.checkedIndex = this.photoAdapter.getCheckedPhotoNameList().size();
            }
            this.photoAdapter.notifyItemChanged(i8);
            ((ActivityLocalPhotoMainBinding) this.binding).cbSelectAll.setChecked(this.photoAdapter.isAllSelected());
            renderDeleteBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$7(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$8(View view) {
        this.photoAdapter.setEditMode(!r2.isEditMode());
        if (!this.photoAdapter.isEditMode()) {
            hideEditMode();
        } else {
            ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setText(R.string.done);
            renderDeleteBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$3(List list) {
        getPageLoadingUI().hide();
        Log.d("querySavedPhotoBeanList", "photoBeanList=" + list);
        renderSavedPhotoList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$4(Throwable th) {
        getPageLoadingUI().hide();
        Log.d("querySavedPhotoBeanList", "error:" + th);
        renderSavedPhotoList(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteConfirmDialog$5() {
        getPageLoadingUI().show();
        this.isDeletingState = true;
        i4.getInstance().deleteLocalPhoto(this.photoAdapter.getCheckedPhotoNameList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showDeleteConfirmDialog$6() {
    }

    private void renderBandDisconnected() {
        r0.showShort(this, getString(R.string.band_setting_send_fail));
    }

    private void renderDeleteBtn() {
        ((ActivityLocalPhotoMainBinding) this.binding).shadowAdd.setVisibility(8);
        ((ActivityLocalPhotoMainBinding) this.binding).shadowDelete.setVisibility(0);
        ((ActivityLocalPhotoMainBinding) this.binding).shadowDelete.setEnabled(x0.isNotEmpty(this.photoAdapter.getCheckedPhotoNameList()));
    }

    private void renderPhotoLimitTips() {
        int photoSavedCount = l.getPhotoSavedCount();
        ((ActivityLocalPhotoMainBinding) this.binding).tvLimitTips.setText(getString(R.string.device_local_photo_explain_text, String.valueOf(100), String.valueOf(photoSavedCount), String.valueOf(100)));
        if (photoSavedCount >= 100) {
            ((ActivityLocalPhotoMainBinding) this.binding).shadowAdd.setEnabled(false);
            ((ActivityLocalPhotoMainBinding) this.binding).tvAdd.setEnabled(false);
        } else {
            ((ActivityLocalPhotoMainBinding) this.binding).shadowAdd.setEnabled(true);
            ((ActivityLocalPhotoMainBinding) this.binding).tvAdd.setEnabled(true);
        }
    }

    private void renderSavedPhotoList(List<LocalPhotoSavedBean> list) {
        if (x0.isEmpty(list)) {
            ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setVisibility(8);
            ((ActivityLocalPhotoMainBinding) this.binding).rlEmpty.setVisibility(0);
            ((ActivityLocalPhotoMainBinding) this.binding).rvPhoto.setVisibility(8);
            this.photoAdapter.setNewData(new ArrayList());
        } else {
            ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.setVisibility(0);
            ((ActivityLocalPhotoMainBinding) this.binding).rlEmpty.setVisibility(8);
            ((ActivityLocalPhotoMainBinding) this.binding).rvPhoto.setVisibility(0);
            this.photoAdapter.setNewData(list);
        }
        renderPhotoLimitTips();
    }

    private void showDeleteConfirmDialog() {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
            return;
        }
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(getString(R.string.device_local_photo_delete_music_alert_title));
        customConfirmDialog.show();
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.device.localphoto.g
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                LocalPhotoMainActivity.this.lambda$showDeleteConfirmDialog$5();
            }
        });
        customConfirmDialog.setOnCancelClick(new BaseCustomConfirmDialog.a() { // from class: com.crrepa.band.my.device.localphoto.h
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.a
            public final void onCancel() {
                LocalPhotoMainActivity.lambda$showDeleteConfirmDialog$6();
            }
        });
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, (Class<?>) LocalPhotoMainActivity.class));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        i4.getInstance().queryLocalPhotoInfo();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setColorNoTranslucent(this, 0);
        initScrollingTitle();
        initPhotoRv();
        renderPhotoLimitTips();
        ((ActivityLocalPhotoMainBinding) this.binding).shadowAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoMainActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityLocalPhotoMainBinding) this.binding).shadowDelete.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoMainActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityLocalPhotoMainBinding) this.binding).cbSelectAll.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localphoto.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalPhotoMainActivity.this.lambda$initBinding$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"NotifyDataSetChanged"})
    protected void loadData() {
        if (this.photoAdapter.isEditMode()) {
            getPageLoadingUI().hide();
        } else if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
            getPageLoadingUI().hide();
        } else {
            this.disposableList.add(LocalImageModel.querySavedPhotoBeanList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localphoto.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LocalPhotoMainActivity.this.lambda$loadData$3((List) obj);
                }
            }, new Consumer() { // from class: com.crrepa.band.my.device.localphoto.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LocalPhotoMainActivity.this.lambda$loadData$4((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.photoAdapter.isEditMode()) {
            ((ActivityLocalPhotoMainBinding) this.binding).appbar.tvEdit.performClick();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.disposableList.clear();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(m0.a aVar) {
        getPageLoadingUI().hide();
        if (aVar.getState() == 2) {
            i4.getInstance().queryLocalPhotoInfo();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.isAddingState = false;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(SavedPhotoInfoEvent savedPhotoInfoEvent) {
        getPageLoadingUI().show();
        i4.getInstance().queryLocalPhotoInfo();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PhotoInfoUpdatedEvent photoInfoUpdatedEvent) {
        if (this.isDeletingState || this.isAddingState) {
            return;
        }
        loadData();
        deleteUnmatchedFileList();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PhotoDeleteSucceedEvent photoDeleteSucceedEvent) {
        this.isDeletingState = false;
        hideEditMode();
        i4.getInstance().queryLocalPhotoInfo();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PhotoDeleteFailedEvent photoDeleteFailedEvent) {
        this.isDeletingState = false;
        hideEditMode();
        i4.getInstance().queryLocalPhotoInfo();
    }
}
