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
        EnumC0849t9 enumC0849t9;
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i3 = readBundle.getInt("CounterReport.Source");
            EnumC0849t9[] values = EnumC0849t9.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    enumC0849t9 = EnumC0849t9.NATIVE;
                    break;
                }
                enumC0849t9 = values[i4];
                if (enumC0849t9.f8364a == i3) {
                    break;
                }
                i4++;
            }
        } else {
            enumC0849t9 = null;
        }
        W5 w5 = new W5("", "", 0);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = readBundle.getInt("CounterReport.Type", -1);
        w5.f6819e = readBundle.getInt("CounterReport.CustomType");
        w5.f6816b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        w5.f6817c = readBundle.getString("CounterReport.Environment");
        w5.f6815a = readBundle.getString("CounterReport.Event");
        w5.f = W5.a(readBundle);
        w5.f6820g = readBundle.getInt("CounterReport.TRUNCATED");
        w5.f6821h = readBundle.getString("CounterReport.ProfileID");
        w5.f6822i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        w5.f6823j = readBundle.getLong("CounterReport.CreationTimestamp");
        w5.f6824k = EnumC0617ka.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        w5.f6825l = enumC0849t9;
        w5.f6826m = readBundle.getBundle("CounterReport.Payload");
        w5.f6827n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        w5.o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        w5.f6828p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return w5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new W5[i3];
    }
}
