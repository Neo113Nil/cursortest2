package c2;

import com.crrepa.band.my.model.band.BaseBandModel;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    public static boolean hasWeatherTempSystem() {
        BaseBandModel connectBand;
        if (u.isSimplified() || (connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand()) == null) {
            return false;
        }
        return connectBand.hasWeatherTempSystem();
    }
}
