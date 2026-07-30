package com.crrepa.band.my.profile.about;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityAboutUsBinding;
import com.crrepa.band.my.databinding.BandDataAppbarBinding;
import com.crrepa.band.my.device.ota.BandUpgradeActivity;
import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.b0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class AboutUsActivity extends BaseActivity implements g {
    private ActivityAboutUsBinding binding;
    private final f aboutUsPresenter = new f();
    private final b0 noDoubleClickHelper = new b0();

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) AboutUsActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        this.aboutUsPresenter.startAppScore(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        if (this.noDoubleClickHelper.isDoubleClick()) {
            return;
        }
        this.aboutUsPresenter.checkBetaFirmwareUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(View view) {
        onPrivacyPolicyClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$4(View view) {
        onSoftwareLicenseClicked();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(this.binding.titleBar.appbar);
        BandDataAppbarBinding bandDataAppbarBinding = this.binding.titleBar;
        bVar.addTitleScrollEvent(bandDataAppbarBinding.tvTitle, bandDataAppbarBinding.tvExpandedTitle);
        setSupportActionBar(this.binding.titleBar.toolbar);
    }

    private void setAppVerison() {
        String appVersion = com.moyoung.dafit.module.common.utils.f.getAppVersion(this);
        int i8 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(BaseParamNames.BAND_CONFIG_VERSION, 0);
        if (i8 != 0) {
            appVersion = appVersion + "-" + i8;
        }
        if (TextUtils.isEmpty(appVersion)) {
            return;
        }
        this.binding.tvAppVerison.setText(appVersion);
    }

    private void setTitle() {
        this.binding.titleBar.tvTitle.setText(R.string.about);
        this.binding.titleBar.tvExpandedTitle.setText(R.string.about);
        this.binding.titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    private void showPrivacyPolicy() {
        this.binding.privacyPolicy.setVisibility(0);
        if (u.isSimplified()) {
            this.binding.softwareLicense.setVisibility(0);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityAboutUsBinding inflate = ActivityAboutUsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.aboutUsPresenter.setView(this);
        setActionBar();
        setTitle();
        setAppVerison();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
            this.binding.rlBetaFirmwareUpdate.setVisibility(0);
        }
        this.binding.titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.about.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutUsActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.appScore.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.about.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutUsActivity.this.lambda$onCreate$1(view);
            }
        });
        this.binding.rlBetaFirmwareUpdate.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.about.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutUsActivity.this.lambda$onCreate$2(view);
            }
        });
        this.binding.privacyPolicy.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.about.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutUsActivity.this.lambda$onCreate$3(view);
            }
        });
        this.binding.softwareLicense.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.about.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutUsActivity.this.lambda$onCreate$4(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.aboutUsPresenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.aboutUsPresenter.pause();
    }

    public void onPrivacyPolicyClicked() {
        com.crrepa.band.my.home.guidance.privacy.b.startPrivacyWeb(getString(R.string.privacy_policy), this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.aboutUsPresenter.resume();
        s0.logPage(getClass(), "关于");
    }

    public void onSoftwareLicenseClicked() {
        com.crrepa.band.my.home.guidance.privacy.b.startTermsOfServiceWeb(getString(R.string.software_license), this);
    }

    @Override // com.crrepa.band.my.profile.about.g
    public void renderBetaFirmwareUpdate(BandFirmwareModel bandFirmwareModel) {
        startActivity(BandUpgradeActivity.getCallingIntent(this, bandFirmwareModel, false));
    }
}
