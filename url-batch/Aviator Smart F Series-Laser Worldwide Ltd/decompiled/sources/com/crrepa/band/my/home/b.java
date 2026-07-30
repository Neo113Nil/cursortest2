package com.crrepa.band.my.home;

import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    void dismissUserBondingDialog();

    void renderEnableBluetoothDialog();

    void renderFirmwareRestoreDialog();

    void renderNetworkUnavailable();

    void renderNewAppDialog(boolean z7, String str, String str2);

    void renderPairingCodeDialog(int i8);

    void renderPairingCodeResult(String str, boolean z7);

    void renderTabLayout(int[] iArr);

    void renderUserBondingDialog();

    void renderViewPager(List<Fragment> list);
}
