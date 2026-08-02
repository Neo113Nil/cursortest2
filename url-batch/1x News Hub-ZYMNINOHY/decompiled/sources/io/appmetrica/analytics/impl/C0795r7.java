package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795r7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0828se f8210a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0795r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0899v7 fromModel(C0770q7 c0770q7) {
        C0899v7 c0899v7 = new C0899v7();
        Boolean bool = c0770q7.f8129a;
        if (bool != null) {
            c0899v7.f8494a = this.f8210a.fromModel(bool).intValue();
        }
        Double d3 = c0770q7.f8131c;
        if (d3 != null) {
            c0899v7.f8496c = d3.doubleValue();
        }
        Double d4 = c0770q7.f8130b;
        if (d4 != null) {
            c0899v7.f8495b = d4.doubleValue();
        }
        Long l3 = c0770q7.f8135h;
        if (l3 != null) {
            c0899v7.f8500h = l3.longValue();
        }
        Integer num = c0770q7.f;
        if (num != null) {
            c0899v7.f = num.intValue();
        }
        Integer num2 = c0770q7.f8133e;
        if (num2 != null) {
            c0899v7.f8498e = num2.intValue();
        }
        Integer num3 = c0770q7.f8134g;
        if (num3 != null) {
            c0899v7.f8499g = num3.intValue();
        }
        Integer num4 = c0770q7.f8132d;
        if (num4 != null) {
            c0899v7.f8497d = num4.intValue();
        }
        String str = c0770q7.f8136i;
        if (str != null) {
            c0899v7.f8501i = str;
        }
        String str2 = c0770q7.f8137j;
        if (str2 != null) {
            c0899v7.f8502j = str2;
        }
        return c0899v7;
    }

    public C0795r7(C0828se c0828se) {
        this.f8210a = c0828se;
    }

    public /* synthetic */ C0795r7(C0828se c0828se, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0828se() : c0828se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0770q7 toModel(C0899v7 c0899v7) {
        if (c0899v7 == null) {
            return new C0770q7(null, null, null, null, null, null, null, null, null, null);
        }
        C0899v7 c0899v72 = new C0899v7();
        Boolean a3 = this.f8210a.a(c0899v7.f8494a);
        double d3 = c0899v7.f8496c;
        Double valueOf = Double.valueOf(d3);
        if (d3 == c0899v72.f8496c) {
            valueOf = null;
        }
        double d4 = c0899v7.f8495b;
        Double valueOf2 = !(d4 == c0899v72.f8495b) ? Double.valueOf(d4) : null;
        long j3 = c0899v7.f8500h;
        Long valueOf3 = j3 != c0899v72.f8500h ? Long.valueOf(j3) : null;
        int i3 = c0899v7.f;
        Integer valueOf4 = i3 != c0899v72.f ? Integer.valueOf(i3) : null;
        int i4 = c0899v7.f8498e;
        Integer valueOf5 = i4 != c0899v72.f8498e ? Integer.valueOf(i4) : null;
        int i5 = c0899v7.f8499g;
        Integer valueOf6 = i5 != c0899v72.f8499g ? Integer.valueOf(i5) : null;
        int i6 = c0899v7.f8497d;
        Integer valueOf7 = i6 != c0899v72.f8497d ? Integer.valueOf(i6) : null;
        String str = c0899v7.f8501i;
        String str2 = !kotlin.jvm.internal.j.a(str, c0899v72.f8501i) ? str : null;
        String str3 = c0899v7.f8502j;
        return new C0770q7(a3, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !kotlin.jvm.internal.j.a(str3, c0899v72.f8502j) ? str3 : null);
    }
}
