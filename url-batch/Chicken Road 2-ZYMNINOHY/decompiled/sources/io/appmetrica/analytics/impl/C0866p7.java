package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866p7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0769le f12566a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0866p7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0840o7 fromModel(C0917r7 c0917r7) {
        C0840o7 c0840o7 = new C0840o7();
        Long l4 = c0917r7.f12650a;
        if (l4 != null) {
            c0840o7.f12501a = l4.longValue();
        }
        Long l5 = c0917r7.f12651b;
        if (l5 != null) {
            c0840o7.f12502b = l5.longValue();
        }
        Boolean bool = c0917r7.f12652c;
        if (bool != null) {
            c0840o7.f12503c = this.f12566a.fromModel(bool).intValue();
        }
        return c0840o7;
    }

    public C0866p7(C0769le c0769le) {
        this.f12566a = c0769le;
    }

    public /* synthetic */ C0866p7(C0769le c0769le, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C0769le() : c0769le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0917r7 toModel(C0840o7 c0840o7) {
        C0840o7 c0840o72 = new C0840o7();
        long j4 = c0840o7.f12501a;
        Long valueOf = Long.valueOf(j4);
        if (j4 == c0840o72.f12501a) {
            valueOf = null;
        }
        long j5 = c0840o7.f12502b;
        return new C0917r7(valueOf, j5 != c0840o72.f12502b ? Long.valueOf(j5) : null, this.f12566a.a(c0840o7.f12503c));
    }
}
