package r1;

import com.crrepa.band.my.model.band.BaseBandModel;

/* loaded from: classes2.dex */
public interface a {
    void renderBluetoothDisable();

    void renderBondComplete();

    void renderBondFail();

    void renderLocationServiceDisable();

    void renderNotSupportBle();

    void renderPairingCode(int i8);

    void renderPairingCodeResult(String str, boolean z7);

    void renderRestoreFirmware(String str);

    void renderScanComplete();

    void renderScanDevice(BaseBandModel baseBandModel);

    void renderScanFail();
}
