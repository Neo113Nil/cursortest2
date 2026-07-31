package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2747k6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        H9 h9;
        Bundle readBundle = parcel.readBundle(W6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i4 = readBundle.getInt("CounterReport.Source");
            H9[] values = H9.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    h9 = H9.NATIVE;
                    break;
                }
                h9 = values[i5];
                if (h9.f37634a == i4) {
                    break;
                }
                i5++;
            }
        } else {
            h9 = null;
        }
        C2773l6 c2773l6 = new C2773l6("", "", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = readBundle.getInt("CounterReport.Type", -1);
        c2773l6.f39380e = readBundle.getInt("CounterReport.CustomType");
        c2773l6.f39377b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        c2773l6.f39378c = readBundle.getString("CounterReport.Environment");
        c2773l6.f39376a = readBundle.getString("CounterReport.Event");
        c2773l6.f39381f = C2773l6.a(readBundle);
        c2773l6.f39382g = readBundle.getInt("CounterReport.TRUNCATED");
        c2773l6.f39383h = readBundle.getString("CounterReport.ProfileID");
        c2773l6.f39384i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        c2773l6.f39385j = readBundle.getLong("CounterReport.CreationTimestamp");
        c2773l6.f39386k = EnumC3114ya.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        c2773l6.f39387l = h9;
        c2773l6.f39388m = readBundle.getBundle("CounterReport.Payload");
        c2773l6.f39389n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c2773l6.f39390o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        c2773l6.f39391p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return c2773l6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new C2773l6[i4];
    }
}
