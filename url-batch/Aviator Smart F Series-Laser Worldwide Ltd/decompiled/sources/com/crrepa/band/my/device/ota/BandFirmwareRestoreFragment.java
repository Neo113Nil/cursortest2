package com.crrepa.band.my.device.ota;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentBandFirmwareUpgradeBinding;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class BandFirmwareRestoreFragment extends BaseFragement implements j1.a {
    private static final int REQUEST_ENABLE_BT = 1;
    private FragmentBandFirmwareUpgradeBinding binding;
    private final com.crrepa.band.my.device.ota.presenter.b presenter = new com.crrepa.band.my.device.ota.presenter.b();
    private final com.crrepa.band.my.device.ota.anim.a upgradeAnimation = new com.crrepa.band.my.device.ota.anim.a();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        onDoneClick();
    }

    public static BandFirmwareRestoreFragment newInstance() {
        return new BandFirmwareRestoreFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 1) {
            if (i9 == -1) {
                this.presenter.restore(requireContext());
            } else if (i9 == 0) {
                onDoneClick();
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public boolean onBackPressedSupport() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentBandFirmwareUpgradeBinding.inflate(layoutInflater);
        this.presenter.setView(this);
        this.binding.btnUpgradeComplete.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandFirmwareRestoreFragment.this.lambda$onCreateView$0(view);
            }
        });
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.destroy();
    }

    public void onDoneClick() {
        pop();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.presenter.restore(requireContext());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // j1.a
    public void playUpgradeAnimation() {
        this.upgradeAnimation.play(this.binding.ivUpgradeAnimation);
    }

    @Override // j1.a
    public void renderBluetoothDisable() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    @Override // j1.a
    public void renderStartUpgrade() {
        this.binding.tvUpgradeState.setText(R.string.restore_dfu_band);
    }

    @Override // j1.a
    public void renderUpgradeComplete() {
        this.binding.tvUpgradeState.setText(R.string.restore_complete);
        this.binding.btnUpgradeComplete.setVisibility(0);
    }

    @Override // j1.a
    public void renderUpgradeError() {
        String string = getString(R.string.restore_error);
        this.binding.tvUpgradeState.setText(string);
        r0.showLong(requireContext(), string);
        onDoneClick();
    }

    @Override // j1.a
    public void renderUpgradePercent(int i8) {
        if (isVisible()) {
            this.binding.pbUpgradePercent.setProgress(i8);
        }
    }

    @Override // j1.a
    public void stopUpgradeAnimation() {
        this.upgradeAnimation.stop();
    }
}
