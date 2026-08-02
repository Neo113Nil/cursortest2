package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951x7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0828se f8612a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0951x7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0925w7 fromModel(C1001z7 c1001z7) {
        C0925w7 c0925w7 = new C0925w7();
        Long l3 = c1001z7.f8663a;
        if (l3 != null) {
            c0925w7.f8552a = l3.longValue();
        }
        Long l4 = c1001z7.f8664b;
        if (l4 != null) {
            c0925w7.f8553b = l4.longValue();
        }
        Boolean bool = c1001z7.f8665c;
        if (bool != null) {
            c0925w7.f8554c = this.f8612a.fromModel(bool).intValue();
        }
        return c0925w7;
    }

    public C0951x7(C0828se c0828se) {
        this.f8612a = c0828se;
    }

    public /* synthetic */ C0951x7(C0828se c0828se, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0828se() : c0828se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1001z7 toModel(C0925w7 c0925w7) {
        C0925w7 c0925w72 = new C0925w7();
        long j3 = c0925w7.f8552a;
        Long valueOf = Long.valueOf(j3);
        if (j3 == c0925w72.f8552a) {
            valueOf = null;
        }
        long j4 = c0925w7.f8553b;
        return new C1001z7(valueOf, j4 != c0925w72.f8553b ? Long.valueOf(j4) : null, this.f8612a.a(c0925w7.f8554c));
    }
}
