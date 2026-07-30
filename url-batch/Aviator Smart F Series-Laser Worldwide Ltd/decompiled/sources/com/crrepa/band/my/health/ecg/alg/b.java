package com.crrepa.band.my.health.ecg.alg;

import com.crrepa.ble.conn.type.CRPEcgMeasureType;

/* loaded from: classes2.dex */
public class b {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPEcgMeasureType;

        static {
            int[] iArr = new int[CRPEcgMeasureType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPEcgMeasureType = iArr;
            try {
                iArr[CRPEcgMeasureType.TYHX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private b() {
    }

    public static com.crrepa.band.my.health.ecg.alg.a create() {
        CRPEcgMeasureType ecgType = com.crrepa.band.my.ble.band.utils.a.getInstance().getEcgType();
        if (ecgType == null) {
            return null;
        }
        return a.$SwitchMap$com$crrepa$ble$conn$type$CRPEcgMeasureType[ecgType.ordinal()] != 1 ? new d() : new e();
    }
}
