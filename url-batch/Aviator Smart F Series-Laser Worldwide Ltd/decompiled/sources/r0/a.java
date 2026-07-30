package r0;

import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static BandFirmwareModel toBandFirmwareModel(CRPFirmwareVersionInfo cRPFirmwareVersionInfo) {
        return new BandFirmwareModel(cRPFirmwareVersionInfo.getType(), cRPFirmwareVersionInfo.getVersion(), u.isZH() ? cRPFirmwareVersionInfo.getChangeNotes() : cRPFirmwareVersionInfo.getChangeNotesEn(), cRPFirmwareVersionInfo.getMcu(), cRPFirmwareVersionInfo.isTpUpgrade());
    }
}
