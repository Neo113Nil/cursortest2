package io.appmetrica.analytics.impl;

import c3.C0292d;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ed implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Dd f10250a = new Dd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f10251b = d3.t.C(new C0292d(NativeCrashSource.UNKNOWN, 0), new C0292d(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 fromModel(Kd kd) {
        V5 v5 = new V5();
        v5.f11104f = 1;
        U5 u5 = new U5();
        u5.f11034a = kd.f10525a;
        Y5 y5 = new Y5();
        Integer num = (Integer) f10251b.get(kd.f10526b.f10364a);
        if (num != null) {
            y5.f11288a = num.intValue();
        }
        String str = kd.f10526b.f10365b;
        if (str == null) {
            str = "";
        }
        y5.f11289b = str;
        u5.f11035b = y5;
        v5.f11105g = u5;
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Kd a(V5 v5) {
        throw new UnsupportedOperationException();
    }
}
