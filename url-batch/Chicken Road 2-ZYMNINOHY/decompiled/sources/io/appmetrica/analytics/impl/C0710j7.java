package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710j7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0769le f12104a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0710j7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0814n7 fromModel(C0685i7 c0685i7) {
        C0814n7 c0814n7 = new C0814n7();
        Boolean bool = c0685i7.f12019a;
        if (bool != null) {
            c0814n7.f12397a = this.f12104a.fromModel(bool).intValue();
        }
        Double d4 = c0685i7.f12021c;
        if (d4 != null) {
            c0814n7.f12399c = d4.doubleValue();
        }
        Double d5 = c0685i7.f12020b;
        if (d5 != null) {
            c0814n7.f12398b = d5.doubleValue();
        }
        Long l4 = c0685i7.f12026h;
        if (l4 != null) {
            c0814n7.f12404h = l4.longValue();
        }
        Integer num = c0685i7.f12024f;
        if (num != null) {
            c0814n7.f12402f = num.intValue();
        }
        Integer num2 = c0685i7.f12023e;
        if (num2 != null) {
            c0814n7.f12401e = num2.intValue();
        }
        Integer num3 = c0685i7.f12025g;
        if (num3 != null) {
            c0814n7.f12403g = num3.intValue();
        }
        Integer num4 = c0685i7.f12022d;
        if (num4 != null) {
            c0814n7.f12400d = num4.intValue();
        }
        String str = c0685i7.f12027i;
        if (str != null) {
            c0814n7.f12405i = str;
        }
        String str2 = c0685i7.f12028j;
        if (str2 != null) {
            c0814n7.f12406j = str2;
        }
        return c0814n7;
    }

    public C0710j7(C0769le c0769le) {
        this.f12104a = c0769le;
    }

    public /* synthetic */ C0710j7(C0769le c0769le, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C0769le() : c0769le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0685i7 toModel(C0814n7 c0814n7) {
        if (c0814n7 == null) {
            return new C0685i7(null, null, null, null, null, null, null, null, null, null);
        }
        C0814n7 c0814n72 = new C0814n7();
        Boolean a3 = this.f12104a.a(c0814n7.f12397a);
        double d4 = c0814n7.f12399c;
        Double valueOf = Double.valueOf(d4);
        if (d4 == c0814n72.f12399c) {
            valueOf = null;
        }
        double d5 = c0814n7.f12398b;
        Double valueOf2 = !(d5 == c0814n72.f12398b) ? Double.valueOf(d5) : null;
        long j4 = c0814n7.f12404h;
        Long valueOf3 = j4 != c0814n72.f12404h ? Long.valueOf(j4) : null;
        int i4 = c0814n7.f12402f;
        Integer valueOf4 = i4 != c0814n72.f12402f ? Integer.valueOf(i4) : null;
        int i5 = c0814n7.f12401e;
        Integer valueOf5 = i5 != c0814n72.f12401e ? Integer.valueOf(i5) : null;
        int i6 = c0814n7.f12403g;
        Integer valueOf6 = i6 != c0814n72.f12403g ? Integer.valueOf(i6) : null;
        int i7 = c0814n7.f12400d;
        Integer valueOf7 = i7 != c0814n72.f12400d ? Integer.valueOf(i7) : null;
        String str = c0814n7.f12405i;
        String str2 = !kotlin.jvm.internal.i.a(str, c0814n72.f12405i) ? str : null;
        String str3 = c0814n7.f12406j;
        return new C0685i7(a3, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !kotlin.jvm.internal.i.a(str3, c0814n72.f12406j) ? str3 : null);
    }
}
