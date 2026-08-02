package io.appmetrica.analytics.impl;

import b2.C0190d;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ld implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Kd f6277a = new Kd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f6278b = c2.p.c0(new C0190d(NativeCrashSource.UNKNOWN, 0), new C0190d(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0407c6 fromModel(Rd rd) {
        C0407c6 c0407c6 = new C0407c6();
        c0407c6.f = 1;
        C0381b6 c0381b6 = new C0381b6();
        c0381b6.f7063a = rd.f6550a;
        C0484f6 c0484f6 = new C0484f6();
        Integer num = (Integer) f6278b.get(rd.f6551b.f6404a);
        if (num != null) {
            c0484f6.f7302a = num.intValue();
        }
        String str = rd.f6551b.f6405b;
        if (str == null) {
            str = "";
        }
        c0484f6.f7303b = str;
        c0381b6.f7064b = c0484f6;
        c0407c6.f7127g = c0381b6;
        return c0407c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Rd a(C0407c6 c0407c6) {
        throw new UnsupportedOperationException();
    }
}
