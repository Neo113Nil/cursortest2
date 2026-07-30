package com.crrepa.band.my.device.ota;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentBandLatestVersionBinding;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.moyoung.dafit.module.common.baseui.BaseFragement;

/* loaded from: classes2.dex */
public class BandLatestVersionFragment extends BaseFragement {
    private FragmentBandLatestVersionBinding binding;

    public static BandLatestVersionFragment newInstance() {
        return new BandLatestVersionFragment();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FragmentBandLatestVersionBinding inflate = FragmentBandLatestVersionBinding.inflate(layoutInflater);
        this.binding = inflate;
        return inflate.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        String address = BandInfoManager.getAddress();
        this.binding.tvDeviceMacaddr.setText(address);
        if (!TextUtils.isEmpty(address)) {
            this.binding.tvDeviceMacaddr.setVisibility(0);
            this.binding.tvDeviceMacaddr.setText(String.format(getString(R.string.firmware_address), address));
        }
        String firmwareVersion = BandInfoManager.getFirmwareVersion();
        if (TextUtils.isEmpty(firmwareVersion)) {
            return;
        }
        this.binding.tvDeviceFirmwareVersion.setVisibility(0);
        this.binding.tvDeviceFirmwareVersion.setText(firmwareVersion);
    }
}
