package com.crrepa.band.my.device.ota;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityBandUpgradeBinding;
import com.crrepa.band.my.databinding.BandDataAppbarBinding;
import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.band.my.model.db.proxy.RecoverDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandUpgradeActivity extends BaseActivity {
    private static final String FIRMWARE_RESTORE = "firmware_restore";
    private static final String FIRMWARE_VERSION = "firmware_version";
    private static final String FORCED_UPGRADE = "forced_upgrade";
    private ActivityBandUpgradeBinding binding;

    public static Intent getCallingIntent(Context context, BandFirmwareModel bandFirmwareModel, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) BandUpgradeActivity.class);
        intent.putExtra("firmware_version", bandFirmwareModel);
        intent.putExtra(FORCED_UPGRADE, z7);
        return intent;
    }

    public static Intent getRestoreCallingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) BandUpgradeActivity.class);
        intent.putExtra(FIRMWARE_RESTORE, true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        hideRestoreTextview();
        start(BandFirmwareRestoreFragment.newInstance());
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(this.binding.titleBar.appbar);
        BandDataAppbarBinding bandDataAppbarBinding = this.binding.titleBar;
        bVar.addTitleScrollEvent(bandDataAppbarBinding.tvTitle, bandDataAppbarBinding.tvExpandedTitle);
        setSupportActionBar(this.binding.titleBar.toolbar);
    }

    private void setTitle() {
        this.binding.titleBar.tvTitle.setText(R.string.firmware_upgrade);
        this.binding.titleBar.tvExpandedTitle.setText(R.string.firmware_upgrade);
        this.binding.titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    private void showFirmwareVersionFragment() {
        BandFirmwareModel bandFirmwareModel = (BandFirmwareModel) getIntent().getParcelableExtra("firmware_version");
        loadRootFragment(R.id.band_upgrade_content, bandFirmwareModel == null ? BandLatestVersionFragment.newInstance() : getIntent().getBooleanExtra(FORCED_UPGRADE, false) ? BandFirmwareUpgradeFragment.newInstance(bandFirmwareModel.isTpUpgrade()) : BandNewVersionFragment.newInstance(bandFirmwareModel));
    }

    private void showRestoreTextview() {
        if (new RecoverDaoProxy().hasRecoverBand()) {
            this.binding.titleBar.tvEdit.setVisibility(0);
            this.binding.titleBar.tvEdit.setText(R.string.restore);
        }
    }

    public void hideRestoreTextview() {
        this.binding.titleBar.tvEdit.setVisibility(8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        me.yokeyword.fragmentation.d topFragment = getTopFragment();
        if ((topFragment instanceof BandFirmwareUpgradeFragment) || (topFragment instanceof BandFirmwareRestoreFragment)) {
            return;
        }
        super.onBackPressedSupport();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityBandUpgradeBinding inflate = ActivityBandUpgradeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        setActionBar();
        setTitle();
        if (getIntent().getBooleanExtra(FIRMWARE_RESTORE, false)) {
            loadRootFragment(R.id.band_upgrade_content, BandFirmwareRestoreFragment.newInstance());
        } else {
            showRestoreTextview();
            showFirmwareVersionFragment();
        }
        this.binding.titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandUpgradeActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.titleBar.tvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandUpgradeActivity.this.lambda$onCreate$1(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "固件升级");
    }
}
