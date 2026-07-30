package com.crrepa.band.my.device.ota.presenter;

import android.content.Context;
import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.a0;

/* loaded from: classes2.dex */
public class d implements f {
    private j1.c view;

    private void hideRestoreTextview() {
        this.view.hideRestoreTextview();
    }

    private void showBandDisconnectedHint() {
        this.view.renderBandDisconnectedHint();
    }

    private void showBetaHint(int i8) {
        if (i8 == 1) {
            this.view.renderBetaHintText();
        }
    }

    private void showChangeNotes(String str) {
        this.view.renderChangeNotes(str);
    }

    private void showFirmwareVersion(String str) {
        this.view.renderFirmwareVersion(str);
    }

    private void showLowBatteryHint() {
        this.view.renderLowBatteryHint();
    }

    private void showNetErrorHint() {
        this.view.renderNetErrorHint();
    }

    private void startUpgradeFragment() {
        this.view.startUpgradeFragment();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(j1.c cVar) {
        this.view = cVar;
    }

    public void showNewFirmwareInfo(BandFirmwareModel bandFirmwareModel) {
        if (bandFirmwareModel == null) {
            return;
        }
        showBetaHint(bandFirmwareModel.getType());
        showFirmwareVersion(bandFirmwareModel.getVersion());
        showChangeNotes(bandFirmwareModel.getChangeNote());
    }

    public void startUpgrade(Context context) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            showBandDisconnectedHint();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            showLowBatteryHint();
        } else if (!a0.isNetworkConnected(context)) {
            showNetErrorHint();
        } else {
            hideRestoreTextview();
            startUpgradeFragment();
        }
    }
}
