package com.crrepa.band.my.device.appmarket;

import com.crrepa.band.my.device.appmarket.model.AppMarketAppDetailResp;

/* loaded from: classes2.dex */
public interface u {
    void hideOperationBtn();

    void initInstallUI();

    void initInstalledUI();

    void initUpdateUI();

    void renderAppDetail(AppMarketAppDetailResp.Data data, boolean z7);

    void renderBandDisconnected();

    void renderDownloadingUI(int i8);

    void renderInstallFailed();

    void renderInstallSucceed();

    void renderInstallingUI(int i8);

    void renderLowPower();

    void renderLowStorage();

    void renderNetError();

    void renderUninstallFailed();

    void renderUninstallSucceed();

    void renderUninstallingUI();

    void resetDownloadingUI();

    void resetInstallingUI();
}
