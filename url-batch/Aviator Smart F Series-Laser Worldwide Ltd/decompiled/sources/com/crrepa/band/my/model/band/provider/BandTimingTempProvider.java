package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.type.CRPTimingTempState;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandTimingTempProvider {
    private static final int TIMING_TEMP_DISABLE = 0;
    private static final int TIMING_TEMP_ENABLE = 1;
    private static final int TIMING_TEMP_NONE = -1;

    /* renamed from: com.crrepa.band.my.model.band.provider.BandTimingTempProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPTimingTempState;

        static {
            int[] iArr = new int[CRPTimingTempState.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPTimingTempState = iArr;
            try {
                iArr[CRPTimingTempState.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPTimingTempState[CRPTimingTempState.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private BandTimingTempProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.TEMP_TIMING_STATE);
    }

    public static boolean getTimingTempState() {
        return g.getInstance().getInt(BaseParamNames.TEMP_TIMING_STATE, -1) == 1;
    }

    public static boolean hasTemp() {
        return g.getInstance().contains(BaseParamNames.TEMP_TIMING_STATE);
    }

    public static boolean hasTimingTemp() {
        return g.getInstance().getInt(BaseParamNames.TEMP_TIMING_STATE, -1) != -1;
    }

    public static void saveTimingTempState(CRPTimingTempState cRPTimingTempState) {
        int i8 = AnonymousClass1.$SwitchMap$com$crrepa$ble$conn$type$CRPTimingTempState[cRPTimingTempState.ordinal()];
        g.getInstance().putInt(BaseParamNames.TEMP_TIMING_STATE, i8 != 1 ? i8 != 2 ? -1 : 0 : 1);
    }

    public static void saveTimingTempState(boolean z7) {
        g.getInstance().putInt(BaseParamNames.TEMP_TIMING_STATE, z7 ? 1 : 0);
    }
}
