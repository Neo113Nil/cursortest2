package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPMuslimPrayerAsrCalculationType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerCalculationType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPMuslimPrayerCalculationInfo {
    private CRPMuslimPrayerAsrCalculationType asrType;
    private List<CRPMuslimPrayerCalculationType> supportedCalculationTypeList;
    private CRPMuslimPrayerCalculationType type;

    public CRPMuslimPrayerAsrCalculationType getAsrType() {
        return this.asrType;
    }

    public List<CRPMuslimPrayerCalculationType> getSupportedCalculationTypeList() {
        if (this.supportedCalculationTypeList == null) {
            ArrayList arrayList = new ArrayList();
            this.supportedCalculationTypeList = arrayList;
            arrayList.add(CRPMuslimPrayerCalculationType.JAFARI);
            this.supportedCalculationTypeList.add(CRPMuslimPrayerCalculationType.KARACHI);
            this.supportedCalculationTypeList.add(CRPMuslimPrayerCalculationType.MWL);
            this.supportedCalculationTypeList.add(CRPMuslimPrayerCalculationType.ISNA);
            this.supportedCalculationTypeList.add(CRPMuslimPrayerCalculationType.MAKKAH);
        }
        return this.supportedCalculationTypeList;
    }

    public CRPMuslimPrayerCalculationType getType() {
        return this.type;
    }

    public void setAsrType(CRPMuslimPrayerAsrCalculationType cRPMuslimPrayerAsrCalculationType) {
        this.asrType = cRPMuslimPrayerAsrCalculationType;
    }

    public void setSupportedCalculationTypeList(List<CRPMuslimPrayerCalculationType> list) {
        this.supportedCalculationTypeList = list;
    }

    public void setType(CRPMuslimPrayerCalculationType cRPMuslimPrayerCalculationType) {
        this.type = cRPMuslimPrayerCalculationType;
    }

    public String toString() {
        return "CRPMuslimPrayerCalculationInfo{type=" + this.type + ", asrType=" + this.asrType + ", supportedCalculationTypeList=" + this.supportedCalculationTypeList + '}';
    }
}
