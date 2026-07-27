package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946r7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0979se f9144a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0946r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1050v7 fromModel(C0921q7 c0921q7) {
        C1050v7 c1050v7 = new C1050v7();
        Boolean bool = c0921q7.f9059a;
        if (bool != null) {
            c1050v7.f9445a = this.f9144a.fromModel(bool).intValue();
        }
        Double d6 = c0921q7.f9061c;
        if (d6 != null) {
            c1050v7.f9447c = d6.doubleValue();
        }
        Double d7 = c0921q7.f9060b;
        if (d7 != null) {
            c1050v7.f9446b = d7.doubleValue();
        }
        Long l2 = c0921q7.f9066h;
        if (l2 != null) {
            c1050v7.f9452h = l2.longValue();
        }
        Integer num = c0921q7.f9064f;
        if (num != null) {
            c1050v7.f9450f = num.intValue();
        }
        Integer num2 = c0921q7.f9063e;
        if (num2 != null) {
            c1050v7.f9449e = num2.intValue();
        }
        Integer num3 = c0921q7.f9065g;
        if (num3 != null) {
            c1050v7.f9451g = num3.intValue();
        }
        Integer num4 = c0921q7.f9062d;
        if (num4 != null) {
            c1050v7.f9448d = num4.intValue();
        }
        String str = c0921q7.f9067i;
        if (str != null) {
            c1050v7.f9453i = str;
        }
        String str2 = c0921q7.f9068j;
        if (str2 != null) {
            c1050v7.f9454j = str2;
        }
        return c1050v7;
    }

    public C0946r7(C0979se c0979se) {
        this.f9144a = c0979se;
    }

    public /* synthetic */ C0946r7(C0979se c0979se, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0979se() : c0979se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0921q7 toModel(C1050v7 c1050v7) {
        if (c1050v7 == null) {
            return new C0921q7(null, null, null, null, null, null, null, null, null, null);
        }
        C1050v7 c1050v72 = new C1050v7();
        Boolean a6 = this.f9144a.a(c1050v7.f9445a);
        double d6 = c1050v7.f9447c;
        Double valueOf = !((d6 > c1050v72.f9447c ? 1 : (d6 == c1050v72.f9447c ? 0 : -1)) == 0) ? Double.valueOf(d6) : null;
        double d7 = c1050v7.f9446b;
        Double valueOf2 = !(d7 == c1050v72.f9446b) ? Double.valueOf(d7) : null;
        long j2 = c1050v7.f9452h;
        Long valueOf3 = j2 != c1050v72.f9452h ? Long.valueOf(j2) : null;
        int i2 = c1050v7.f9450f;
        Integer valueOf4 = i2 != c1050v72.f9450f ? Integer.valueOf(i2) : null;
        int i3 = c1050v7.f9449e;
        Integer valueOf5 = i3 != c1050v72.f9449e ? Integer.valueOf(i3) : null;
        int i6 = c1050v7.f9451g;
        Integer valueOf6 = i6 != c1050v72.f9451g ? Integer.valueOf(i6) : null;
        int i7 = c1050v7.f9448d;
        Integer valueOf7 = i7 != c1050v72.f9448d ? Integer.valueOf(i7) : null;
        String str = c1050v7.f9453i;
        String str2 = !kotlin.jvm.internal.i.a(str, c1050v72.f9453i) ? str : null;
        String str3 = c1050v7.f9454j;
        return new C0921q7(a6, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !kotlin.jvm.internal.i.a(str3, c1050v72.f9454j) ? str3 : null);
    }
}
