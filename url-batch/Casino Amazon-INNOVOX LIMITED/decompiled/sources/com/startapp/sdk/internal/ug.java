package com.startapp.sdk.internal;

import android.telephony.CellInfo;
import java.util.Comparator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ug implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CellInfo cellInfo = (CellInfo) obj;
        CellInfo cellInfo2 = (CellInfo) obj2;
        if (cellInfo.isRegistered() == cellInfo2.isRegistered()) {
            return vg.a(cellInfo2) - vg.a(cellInfo);
        }
        if (cellInfo.isRegistered()) {
            return -1;
        }
        return cellInfo2.isRegistered() ? 1 : 0;
    }
}
