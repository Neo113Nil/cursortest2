package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102x7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0979se f9568a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1102x7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1076w7 fromModel(C1152z7 c1152z7) {
        C1076w7 c1076w7 = new C1076w7();
        Long l2 = c1152z7.f9620a;
        if (l2 != null) {
            c1076w7.f9506a = l2.longValue();
        }
        Long l6 = c1152z7.f9621b;
        if (l6 != null) {
            c1076w7.f9507b = l6.longValue();
        }
        Boolean bool = c1152z7.f9622c;
        if (bool != null) {
            c1076w7.f9508c = this.f9568a.fromModel(bool).intValue();
        }
        return c1076w7;
    }

    public C1102x7(C0979se c0979se) {
        this.f9568a = c0979se;
    }

    public /* synthetic */ C1102x7(C0979se c0979se, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0979se() : c0979se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1152z7 toModel(C1076w7 c1076w7) {
        C1076w7 c1076w72 = new C1076w7();
        long j2 = c1076w7.f9506a;
        Long valueOf = Long.valueOf(j2);
        if (j2 == c1076w72.f9506a) {
            valueOf = null;
        }
        long j6 = c1076w7.f9507b;
        return new C1152z7(valueOf, j6 != c1076w72.f9507b ? Long.valueOf(j6) : null, this.f9568a.a(c1076w7.f9508c));
    }
}
