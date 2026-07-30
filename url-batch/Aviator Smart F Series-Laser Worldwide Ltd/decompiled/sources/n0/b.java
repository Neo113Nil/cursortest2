package n0;

import com.crrepa.band.my.model.band.BaseBandModel;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static a create() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand != null) {
            return connectBand.isHsMcu() ? new com.crrepa.band.my.ble.band.ota.hs.a() : connectBand.isRealTek() ? new com.crrepa.band.my.ble.band.ota.rtk.a() : connectBand.isSifli() ? new com.crrepa.band.my.ble.band.ota.sfl.a() : (connectBand.isJieli() || connectBand.isBluetrum()) ? new p0.a() : connectBand.isHisilicon() ? new o0.a() : new q0.a();
        }
        f.d("connectBand is null!");
        return new q0.a();
    }

    public static a create(int i8) {
        if (i8 == 2) {
            return new com.crrepa.band.my.ble.band.ota.hs.a();
        }
        if (i8 != 5) {
            return null;
        }
        return new com.crrepa.band.my.ble.band.ota.sfl.a();
    }
}
