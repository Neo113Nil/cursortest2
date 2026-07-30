package com.crrepa.band.my.device.appmarket;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.databinding.ActivityAppMarketAppDetailBinding;
import com.crrepa.band.my.device.appmarket.adapter.AppMarketAppPreviewAdapter;
import com.crrepa.band.my.device.appmarket.model.AppMarketAppDetailResp;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import com.squareup.picasso.Picasso;
import java.util.Objects;

/* loaded from: classes2.dex */
public class AppMarketAppDetailActivity extends BaseVBActivity<ActivityAppMarketAppDetailBinding> implements u {
    private static final String KEY_VERSION_ID = "key_version_id";
    private final b presenter = new b(this);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        if (((ActivityAppMarketAppDetailBinding) this.binding).pb.getVisibility() != 0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        showUninstallConfirmDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        showUninstallConfirmDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        this.presenter.downloadBinFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        this.presenter.downloadBinFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstallUI$7() {
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowInstall.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUpdateUI$6() {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowUpdate.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderDownloadingUI$8(int i8) {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgress(i8);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setText(i8 + "% " + getString(R.string.device_app_market_state_downloading_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderInstallFailed$10() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(getString(R.string.device_app_market_failed_installation_tips, ((ActivityAppMarketAppDetailBinding) this.binding).includeBaseMsg.tvTitle.getText().toString()));
        customConfirmDialog.hideCancelTv();
        customConfirmDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderInstallSucceed$9() {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setVisibility(8);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvInstalled.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(4);
        r0.showShort(getApplicationContext(), getString(R.string.device_app_market_app_installed_tips));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderInstallingUI$11(int i8) {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setText(i8 + "% " + getString(R.string.device_app_market_state_installing_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderNetError$5() {
        r0.showShort(getApplicationContext(), R.string.net_disonnected);
    }

    private void showUninstallConfirmDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(R.string.device_app_market_uninstalling_pop_tips);
        final b bVar = this.presenter;
        Objects.requireNonNull(bVar);
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.device.appmarket.m
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                b.this.uninstallApp();
            }
        });
        customConfirmDialog.show();
    }

    public static void start(Context context, int i8) {
        Intent intent = new Intent();
        intent.putExtra(KEY_VERSION_ID, i8);
        intent.setClass(context, AppMarketAppDetailActivity.class);
        context.startActivity(intent);
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void hideOperationBtn() {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvInstalled.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvUninstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowInstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowUpdate.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(4);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        getWindow().addFlags(128);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketAppDetailActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketAppDetailActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityAppMarketAppDetailBinding) this.binding).tvUninstall.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketAppDetailActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowInstall.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketAppDetailActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowUpdate.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketAppDetailActivity.this.lambda$initBinding$4(view);
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void initInstallUI() {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.k
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$initInstallUI$7();
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void initInstalledUI() {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvUninstall.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(4);
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void initUpdateUI() {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.j
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$initUpdateUI$6();
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        this.presenter.requestAppDetail(getIntent().getIntExtra(KEY_VERSION_ID, -1));
        this.presenter.queryAppAvailableSize();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((ActivityAppMarketAppDetailBinding) this.binding).pb.getVisibility() != 0) {
            super.onBackPressed();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        getWindow().clearFlags(128);
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    @SuppressLint({"SetTextI18n"})
    public void renderAppDetail(AppMarketAppDetailResp.Data data, boolean z7) {
        AppMarketAppDetailResp.AppBean appBean = data.app;
        if (appBean != null) {
            ((ActivityAppMarketAppDetailBinding) this.binding).includeBaseMsg.tvTitle.setText(appBean.name);
            ((ActivityAppMarketAppDetailBinding) this.binding).includeBaseMsg.tvDescription.setMaxLines(2);
            ((ActivityAppMarketAppDetailBinding) this.binding).includeBaseMsg.tvDescription.setText(appBean.description);
            ((ActivityAppMarketAppDetailBinding) this.binding).tvDeveloper.setText(appBean.developer);
            ((ActivityAppMarketAppDetailBinding) this.binding).tvDeveloperTitle.setText(((Object) ((ActivityAppMarketAppDetailBinding) this.binding).tvDeveloperTitle.getText()) + ":");
            ((ActivityAppMarketAppDetailBinding) this.binding).tvIntroduction.setText(Html.fromHtml(appBean.intro));
            Picasso.get().load(appBean.logo).resize(com.moyoung.dafit.module.common.utils.o.dp2px(this, 50.0f), com.moyoung.dafit.module.common.utils.o.dp2px(this, 50.0f)).centerCrop().placeholder(R.drawable.shape_net_img_placeholder).into(((ActivityAppMarketAppDetailBinding) this.binding).includeBaseMsg.ivLogo);
        }
        AppMarketAppDetailResp.VersionBean versionBean = data.version;
        if (versionBean != null) {
            ((ActivityAppMarketAppDetailBinding) this.binding).includeBaseMsg.tvSize.setText(versionBean.getBinSizeWithUnit());
            ((ActivityAppMarketAppDetailBinding) this.binding).tvVersion.setText(versionBean.version_name);
            ((ActivityAppMarketAppDetailBinding) this.binding).tvVersionTitle.setText(((Object) ((ActivityAppMarketAppDetailBinding) this.binding).tvVersionTitle.getText()) + ":");
            ((ActivityAppMarketAppDetailBinding) this.binding).tvReleaseDate.setText(com.moyoung.dafit.module.common.utils.m.format(versionBean.release_time * 1000, "yyyy.MM.dd"));
            ((ActivityAppMarketAppDetailBinding) this.binding).tvReleaseDateTitle.setText(((Object) ((ActivityAppMarketAppDetailBinding) this.binding).tvReleaseDateTitle.getText()) + ":");
            String str = versionBean.changelog;
            if (z7 && x0.isNotEmpty(str)) {
                ((ActivityAppMarketAppDetailBinding) this.binding).tvUpdateMsg.setText(Html.fromHtml(str));
            } else {
                ((ActivityAppMarketAppDetailBinding) this.binding).tvUpdateMsg.setVisibility(8);
            }
            ((ActivityAppMarketAppDetailBinding) this.binding).rvPreview.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 0, false));
            AppMarketAppPreviewAdapter appMarketAppPreviewAdapter = new AppMarketAppPreviewAdapter();
            appMarketAppPreviewAdapter.setNewData(versionBean.preview);
            ((ActivityAppMarketAppDetailBinding) this.binding).rvPreview.setAdapter(appMarketAppPreviewAdapter);
        }
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderBandDisconnected() {
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.common_device_disconnected_tips);
        if (((ActivityAppMarketAppDetailBinding) this.binding).pb.getVisibility() == 0 || ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.getVisibility() == 0) {
            finish();
        }
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderDownloadingUI(final int i8) {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.i
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$renderDownloadingUI$8(i8);
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderInstallFailed() {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.f
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$renderInstallFailed$10();
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderInstallSucceed() {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.g
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$renderInstallSucceed$9();
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderInstallingUI(final int i8) {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.l
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$renderInstallingUI$11(i8);
            }
        });
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgress(i8);
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderLowPower() {
        r0.showLong(getString(R.string.measure_low_battery_hint));
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderLowStorage() {
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.common_device_no_memory_tips);
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderNetError() {
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.post(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.h
            @Override // java.lang.Runnable
            public final void run() {
                AppMarketAppDetailActivity.this.lambda$renderNetError$5();
            }
        });
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderUninstallFailed() {
        r0.showShort(getApplicationContext(), getString(R.string.device_app_market_app_uninstall_failed_tips));
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderUninstallSucceed() {
        r0.showShort(getApplicationContext(), getString(R.string.device_app_market_app_uninstalled_tips));
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void renderUninstallingUI() {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvUninstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvInstalled.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowUpdate.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgressDrawable(getResources().getDrawable(R.drawable.progressbar_horizontal_app_market_unloading));
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgress(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setText(R.string.device_app_market_state_uninstalling_title);
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void resetDownloadingUI() {
        ((ActivityAppMarketAppDetailBinding) this.binding).tvTitleUninstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowInstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowUpdate.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgressDrawable(getResources().getDrawable(R.drawable.progressbar_horizontal_app_market_downloading));
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgress(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setText("0% " + getString(R.string.device_app_market_state_downloading_title));
    }

    @Override // com.crrepa.band.my.device.appmarket.u
    public void resetInstallingUI() {
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowInstall.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).shadowUpdate.setVisibility(4);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setVisibility(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgressDrawable(getResources().getDrawable(R.drawable.progressbar_horizontal_app_market_downloading));
        ((ActivityAppMarketAppDetailBinding) this.binding).pb.setProgress(0);
        ((ActivityAppMarketAppDetailBinding) this.binding).tvProgress.setText("0% " + getString(R.string.device_app_market_state_installing_title));
    }
}
