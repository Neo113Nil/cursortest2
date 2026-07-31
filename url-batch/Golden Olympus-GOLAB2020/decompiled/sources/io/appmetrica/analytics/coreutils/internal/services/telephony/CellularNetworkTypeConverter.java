package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class CellularNetworkTypeConverter {

    @NotNull
    public static final CellularNetworkTypeConverter INSTANCE = new CellularNetworkTypeConverter();

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray f37067a;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, "unknown");
        sparseArray.put(7, "1xRTT");
        sparseArray.put(4, "CDMA");
        sparseArray.put(2, "EDGE");
        sparseArray.put(14, "eHRPD");
        sparseArray.put(5, "EVDO rev.0");
        sparseArray.put(6, "EVDO rev.A");
        sparseArray.put(1, "GPRS");
        sparseArray.put(8, "HSDPA");
        sparseArray.put(10, "HSPA");
        sparseArray.put(15, "HSPA+");
        sparseArray.put(9, "HSUPA");
        sparseArray.put(11, "iDen");
        sparseArray.put(3, "UMTS");
        sparseArray.put(13, "LTE");
        sparseArray.put(16, "GSM");
        sparseArray.put(17, "TD_SCDMA");
        sparseArray.put(18, "IWLAN");
        if (AndroidUtils.isApiAchieved(29)) {
            sparseArray.put(20, "NR");
        }
        f37067a = sparseArray;
    }

    private CellularNetworkTypeConverter() {
    }

    @NotNull
    public static final String convert(@Nullable Integer num) {
        String str;
        return (num == null || (str = (String) f37067a.get(num.intValue())) == null) ? "unknown" : str;
    }
}
