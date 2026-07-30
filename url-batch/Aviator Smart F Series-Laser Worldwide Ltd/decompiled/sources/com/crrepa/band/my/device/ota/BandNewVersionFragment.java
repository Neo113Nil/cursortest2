package com.crrepa.band.my.device.ota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentBandNewVersionBinding;
import com.crrepa.band.my.model.BandFirmwareModel;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class BandNewVersionFragment extends BaseFragement implements j1.c {
    public static final String FIRMWARE_VERSION = "firmware_version";
    private final com.crrepa.band.my.device.ota.presenter.d bandNewVersionPresenter = new com.crrepa.band.my.device.ota.presenter.d();
    private FragmentBandNewVersionBinding binding;

    private BandFirmwareModel getBandFirmwareModel() {
        return (BandFirmwareModel) getArguments().getParcelable(FIRMWARE_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        this.bandNewVersionPresenter.startUpgrade(getContext());
    }

    public static BandNewVersionFragment newInstance(BandFirmwareModel bandFirmwareModel) {
        BandNewVersionFragment bandNewVersionFragment = new BandNewVersionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(FIRMWARE_VERSION, bandFirmwareModel);
        bandNewVersionFragment.setArguments(bundle);
        return bandNewVersionFragment;
    }

    @Override // j1.c
    public void hideRestoreTextview() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BandUpgradeActivity) {
            ((BandUpgradeActivity) activity).hideRestoreTextview();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentBandNewVersionBinding.inflate(layoutInflater);
        this.bandNewVersionPresenter.setView(this);
        this.binding.btnFirmwareUpgrade.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ota.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandNewVersionFragment.this.lambda$onCreateView$0(view);
            }
        });
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.bandNewVersionPresenter.destroy();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.bandNewVersionPresenter.showNewFirmwareInfo(getBandFirmwareModel());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.bandNewVersionPresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.bandNewVersionPresenter.resume();
    }

    @Override // j1.c
    public void renderBandDisconnectedHint() {
        r0.showLong(getContext(), getString(R.string.band_setting_send_fail));
    }

    @Override // j1.c
    public void renderBetaHintText() {
        this.binding.tvFirmwareBetaHint.setVisibility(0);
    }

    @Override // j1.c
    public void renderChangeNotes(String str) {
        this.binding.tvFirmwareDescribe.setText(str);
    }

    @Override // j1.c
    public void renderFirmwareVersion(String str) {
        this.binding.tvFirmwareVersion.setText(str);
    }

    @Override // j1.c
    public void renderLowBatteryHint() {
        r0.showLong(getContext(), getString(R.string.measure_low_battery_hint));
    }

    @Override // j1.c
    public void renderNetErrorHint() {
        r0.showLong(getContext(), getString(R.string.net_disonnected));
    }

    @Override // j1.c
    public void startUpgradeFragment() {
        start(BandFirmwareUpgradeFragment.newInstance(getBandFirmwareModel().isTpUpgrade()));
    }
}
