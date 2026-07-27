package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class V5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC1000t9 enumC1000t9;
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i2 = readBundle.getInt("CounterReport.Source");
            EnumC1000t9[] values = EnumC1000t9.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    enumC1000t9 = EnumC1000t9.NATIVE;
                    break;
                }
                enumC1000t9 = values[i3];
                if (enumC1000t9.f9307a == i2) {
                    break;
                }
                i3++;
            }
        } else {
            enumC1000t9 = null;
        }
        W5 w5 = new W5("", "", 0);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = readBundle.getInt("CounterReport.Type", -1);
        w5.f7652e = readBundle.getInt("CounterReport.CustomType");
        w5.f7649b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        w5.f7650c = readBundle.getString("CounterReport.Environment");
        w5.f7648a = readBundle.getString("CounterReport.Event");
        w5.f7653f = W5.a(readBundle);
        w5.f7654g = readBundle.getInt("CounterReport.TRUNCATED");
        w5.f7655h = readBundle.getString("CounterReport.ProfileID");
        w5.f7656i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        w5.f7657j = readBundle.getLong("CounterReport.CreationTimestamp");
        w5.f7658k = EnumC0768ka.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        w5.f7659l = enumC1000t9;
        w5.f7660m = readBundle.getBundle("CounterReport.Payload");
        w5.f7661n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        w5.f7662o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        w5.f7663p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return w5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new W5[i2];
    }
}
