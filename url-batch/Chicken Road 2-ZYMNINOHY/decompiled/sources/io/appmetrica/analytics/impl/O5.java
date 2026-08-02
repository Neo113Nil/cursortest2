package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class O5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC0790m9 enumC0790m9;
        Bundle readBundle = parcel.readBundle(B6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i4 = readBundle.getInt("CounterReport.Source");
            EnumC0790m9[] values = EnumC0790m9.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    enumC0790m9 = EnumC0790m9.NATIVE;
                    break;
                }
                enumC0790m9 = values[i5];
                if (enumC0790m9.f12352a == i4) {
                    break;
                }
                i5++;
            }
        } else {
            enumC0790m9 = null;
        }
        P5 p5 = new P5("", "", 0);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = readBundle.getInt("CounterReport.Type", -1);
        p5.f10798e = readBundle.getInt("CounterReport.CustomType");
        p5.f10795b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        p5.f10796c = readBundle.getString("CounterReport.Environment");
        p5.f10794a = readBundle.getString("CounterReport.Event");
        p5.f10799f = P5.a(readBundle);
        p5.f10800g = readBundle.getInt("CounterReport.TRUNCATED");
        p5.f10801h = readBundle.getString("CounterReport.ProfileID");
        p5.f10802i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        p5.f10803j = readBundle.getLong("CounterReport.CreationTimestamp");
        p5.f10804k = EnumC0559da.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        p5.f10805l = enumC0790m9;
        p5.f10806m = readBundle.getBundle("CounterReport.Payload");
        p5.n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        p5.o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        p5.f10807p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return p5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new P5[i4];
    }
}
