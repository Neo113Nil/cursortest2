package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0297k7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0355me f1337a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0297k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0398o7 fromModel(C0271j7 c0271j7) {
        C0398o7 c0398o7 = new C0398o7();
        Boolean bool = c0271j7.f1317a;
        if (bool != null) {
            c0398o7.f1409a = this.f1337a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Double d = c0271j7.c;
        if (d != null) {
            c0398o7.c = d.doubleValue();
        }
        Double d2 = c0271j7.b;
        if (d2 != null) {
            c0398o7.b = d2.doubleValue();
        }
        Long l = c0271j7.h;
        if (l != null) {
            c0398o7.h = l.longValue();
        }
        Integer num = c0271j7.f;
        if (num != null) {
            c0398o7.f = num.intValue();
        }
        Integer num2 = c0271j7.e;
        if (num2 != null) {
            c0398o7.e = num2.intValue();
        }
        Integer num3 = c0271j7.g;
        if (num3 != null) {
            c0398o7.g = num3.intValue();
        }
        Integer num4 = c0271j7.d;
        if (num4 != null) {
            c0398o7.d = num4.intValue();
        }
        String str = c0271j7.i;
        if (str != null) {
            c0398o7.i = str;
        }
        String str2 = c0271j7.j;
        if (str2 != null) {
            c0398o7.j = str2;
        }
        return c0398o7;
    }

    public C0297k7(C0355me c0355me) {
        this.f1337a = c0355me;
    }

    public /* synthetic */ C0297k7(C0355me c0355me, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0355me() : c0355me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0271j7 toModel(C0398o7 c0398o7) {
        if (c0398o7 == null) {
            return new C0271j7(null, null, null, null, null, null, null, null, null, null);
        }
        C0398o7 c0398o72 = new C0398o7();
        Boolean a2 = this.f1337a.a(c0398o7.f1409a);
        Double valueOf = Double.valueOf(c0398o7.c);
        if (valueOf.doubleValue() == c0398o72.c) {
            valueOf = null;
        }
        Double valueOf2 = Double.valueOf(c0398o7.b);
        Double d = !(valueOf2.doubleValue() == c0398o72.b) ? valueOf2 : null;
        Long valueOf3 = Long.valueOf(c0398o7.h);
        Long l = valueOf3.longValue() != c0398o72.h ? valueOf3 : null;
        Integer valueOf4 = Integer.valueOf(c0398o7.f);
        Integer num = valueOf4.intValue() != c0398o72.f ? valueOf4 : null;
        Integer valueOf5 = Integer.valueOf(c0398o7.e);
        Integer num2 = valueOf5.intValue() != c0398o72.e ? valueOf5 : null;
        Integer valueOf6 = Integer.valueOf(c0398o7.g);
        Integer num3 = valueOf6.intValue() != c0398o72.g ? valueOf6 : null;
        Integer valueOf7 = Integer.valueOf(c0398o7.d);
        Integer num4 = valueOf7.intValue() != c0398o72.d ? valueOf7 : null;
        String str = c0398o7.i;
        String str2 = !Intrinsics.areEqual(str, c0398o72.i) ? str : null;
        String str3 = c0398o7.j;
        return new C0271j7(a2, d, valueOf, num4, num2, num, num3, l, str2, !Intrinsics.areEqual(str3, c0398o72.j) ? str3 : null);
    }
}
