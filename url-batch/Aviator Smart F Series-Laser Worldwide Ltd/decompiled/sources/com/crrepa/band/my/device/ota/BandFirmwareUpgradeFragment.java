package com.crrepa.band.my.device.ota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.FragmentBandFirmwareUpgradeBinding;
import com.moyoung.dafit.module.common.baseui.BaseFragement;

/* loaded from: classes2.dex */
public class BandFirmwareUpgradeFragment extends BaseFragement implements j1.b {
    private static final String TP_UPGRADE = "tp_upgrade";
    private FragmentBandFirmwareUpgradeBinding binding;
    private final com.crrepa.band.my.device.ota.presenter.c upgradePresenter = new com.crrepa.band.my.device.ota.presenter.c();
    private final com.crrepa.band.my.device.ota.anim.a upgradeAnimation = new com.crrepa.band.my.device.ota.anim.a();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        startHomeActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderLowStorage$1() {
        showFailedDialog(R.string.device_upgrad_hisilicon_no_memory_tips);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showFailedDialog$2(MaterialDialog materialDialog, DialogAction dialogAction) {
        startHomeActivity();
    }

    public static BandFirmwareUpgradeFragment newInstance(boolean z7) {
        BandFirmwareUpgradeFragment bandFirmwareUpgradeFragment = new BandFirmwareUpgradeFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(TP_UPGRADE, z7);
        bandFirmwareUpgradeFragment.setArguments(bundle);
        return bandFirmwareUpgradeFragment;
    }

    private void showFailedDialog(@StringRes int i8) {
        new MaterialDialog.e(requireContext()).content(i8).positiveText(R.string.done).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.ota.c
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                BandFirmwareUpgradeFragment.this.lambda$showFailedDialog$2(materialDialog, dialogAction);
            }
        }).cancelable(false).build().show();
    }

    private void startHomeActivity() {
        requireContext().startActivity(MainActivity.getCallingIntent(requireContext()));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentBandFirmwareUpgradeBinding.inflate(layoutInflater);
        this.upgradePresenter.setView(this);
        this.binding.btnUpgradeComplete.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandFirmwareUpgradeFragment.this.lambda$onCreateView$0(view);
            }
        });
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.upgradePresenter.destroy();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.upgradePresenter.startUpgrade(getArguments().getBoolean(TP_UPGRADE, false));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.upgradePresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.upgradePresenter.resume();
    }

    @Override // j1.b
    public void playUpgradeAnimation() {
        this.upgradeAnimation.play(this.binding.ivUpgradeAnimation);
    }

    @Override // j1.b
    public void renderDownloadFirmwareStarting() {
        this.binding.tvUpgradeState.setText(R.string.firmware_downloading);
    }

    @Override // j1.b
    public void renderLowStorage() {
        this.binding.tvUpgradeState.post(new Runnable() { // from class: com.crrepa.band.my.device.ota.d
            @Override // java.lang.Runnable
            public final void run() {
                BandFirmwareUpgradeFragment.this.lambda$renderLowStorage$1();
            }
        });
    }

    @Override // j1.b
    public void renderUpgradeCompleted() {
        this.binding.btnUpgradeComplete.setVisibility(0);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            this.binding.tvUpgradeState.setText(R.string.device_upgrad_hisilicon_success_tips);
        } else {
            this.binding.tvUpgradeState.setText(R.string.firmware_upgrade_complete);
        }
        this.binding.tvUpgradePercent.setText(getString(R.string.percent_format, String.valueOf(100)));
    }

    @Override // j1.b
    public void renderUpgradeError(boolean z7, int i8) {
        int i9;
        if (z7) {
            i9 = i8 == 17 ? R.string.firmware_download_fail : R.string.firmware_upgrade_fail;
            this.binding.tvUpgradeState.setText(i9);
        } else {
            i9 = R.string.firmware_restore_hint;
        }
        showFailedDialog(i9);
    }

    @Override // j1.b
    public void renderUpgradeProgressChanged(int i8) {
        if (isVisible()) {
            this.binding.pbUpgradePercent.setProgress(i8);
            this.binding.tvUpgradePercent.setText(getString(R.string.percent_format, String.valueOf(i8)));
        }
    }

    @Override // j1.b
    public void renderUpgradeProgressStarting() {
        this.binding.tvUpgradeState.setText(R.string.firmware_upgradeing);
        this.binding.tvUpgradePercent.setText(getString(R.string.percent_format, String.valueOf(0)));
    }

    @Override // j1.b
    public void stopUpgradeAnimation() {
        this.upgradeAnimation.stop();
    }
}
