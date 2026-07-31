package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0091c7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0355me f1192a;
    public final C0297k7 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0091c7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0373n7 fromModel(C0142e7 c0142e7) {
        C0373n7 c0373n7 = new C0373n7();
        Integer num = c0142e7.f1232a;
        if (num != null) {
            c0373n7.f1391a = num.intValue();
        }
        String str = c0142e7.b;
        if (str != null) {
            c0373n7.b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0142e7.c;
        if (str2 != null) {
            c0373n7.c = StringUtils.correctIllFormedString(str2);
        }
        Long l = c0142e7.d;
        if (l != null) {
            c0373n7.d = l.longValue();
        }
        C0271j7 c0271j7 = c0142e7.e;
        if (c0271j7 != null) {
            c0373n7.e = this.b.fromModel(c0271j7);
        }
        String str3 = c0142e7.f;
        if (str3 != null) {
            c0373n7.f = str3;
        }
        String str4 = c0142e7.g;
        if (str4 != null) {
            c0373n7.g = str4;
        }
        Long l2 = c0142e7.h;
        if (l2 != null) {
            c0373n7.h = l2.longValue();
        }
        Integer num2 = c0142e7.i;
        if (num2 != null) {
            c0373n7.i = num2.intValue();
        }
        Integer num3 = c0142e7.j;
        if (num3 != null) {
            c0373n7.j = num3.intValue();
        }
        String str5 = c0142e7.k;
        if (str5 != null) {
            c0373n7.k = str5;
        }
        J8 j8 = c0142e7.l;
        if (j8 != null) {
            c0373n7.l = j8.f903a;
        }
        String str6 = c0142e7.m;
        if (str6 != null) {
            c0373n7.m = str6;
        }
        EnumC0145ea enumC0145ea = c0142e7.n;
        if (enumC0145ea != null) {
            c0373n7.n = enumC0145ea.f1235a;
        }
        EnumC0375n9 enumC0375n9 = c0142e7.o;
        if (enumC0375n9 != null) {
            c0373n7.o = enumC0375n9.f1393a;
        }
        Boolean bool = c0142e7.p;
        if (bool != null) {
            c0373n7.p = this.f1192a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Integer num4 = c0142e7.q;
        if (num4 != null) {
            c0373n7.q = num4.intValue();
        }
        byte[] bArr = c0142e7.r;
        if (bArr != null) {
            c0373n7.r = bArr;
        }
        return c0373n7;
    }

    public C0091c7(C0355me c0355me, C0297k7 c0297k7) {
        this.f1192a = c0355me;
        this.b = c0297k7;
    }

    public /* synthetic */ C0091c7(C0355me c0355me, C0297k7 c0297k7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0355me() : c0355me, (i & 2) != 0 ? new C0297k7(null, 1, null) : c0297k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0142e7 toModel(C0373n7 c0373n7) {
        Long l;
        EnumC0375n9 enumC0375n9;
        C0373n7 c0373n72 = new C0373n7();
        Integer valueOf = Integer.valueOf(c0373n7.f1391a);
        Integer num = valueOf.intValue() != c0373n72.f1391a ? valueOf : null;
        String str = c0373n7.b;
        String str2 = !Intrinsics.areEqual(str, c0373n72.b) ? str : null;
        String str3 = c0373n7.c;
        String str4 = !Intrinsics.areEqual(str3, c0373n72.c) ? str3 : null;
        Long valueOf2 = Long.valueOf(c0373n7.d);
        Long l2 = valueOf2.longValue() != c0373n72.d ? valueOf2 : null;
        C0271j7 model = this.b.toModel(c0373n7.e);
        String str5 = c0373n7.f;
        String str6 = !Intrinsics.areEqual(str5, c0373n72.f) ? str5 : null;
        String str7 = c0373n7.g;
        String str8 = !Intrinsics.areEqual(str7, c0373n72.g) ? str7 : null;
        Long valueOf3 = Long.valueOf(c0373n7.h);
        if (valueOf3.longValue() == c0373n72.h) {
            valueOf3 = null;
        }
        Integer valueOf4 = Integer.valueOf(c0373n7.i);
        Integer num2 = valueOf4.intValue() != c0373n72.i ? valueOf4 : null;
        Integer valueOf5 = Integer.valueOf(c0373n7.j);
        Integer num3 = valueOf5.intValue() != c0373n72.j ? valueOf5 : null;
        String str9 = c0373n7.k;
        String str10 = !Intrinsics.areEqual(str9, c0373n72.k) ? str9 : null;
        Integer valueOf6 = Integer.valueOf(c0373n7.l);
        if (valueOf6.intValue() == c0373n72.l) {
            valueOf6 = null;
        }
        J8 a2 = valueOf6 != null ? J8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0373n7.m;
        String str12 = !Intrinsics.areEqual(str11, c0373n72.m) ? str11 : null;
        Integer valueOf7 = Integer.valueOf(c0373n7.n);
        if (valueOf7.intValue() == c0373n72.n) {
            valueOf7 = null;
        }
        EnumC0145ea a3 = valueOf7 != null ? EnumC0145ea.a(Integer.valueOf(valueOf7.intValue())) : null;
        Integer valueOf8 = Integer.valueOf(c0373n7.o);
        if (valueOf8.intValue() == c0373n72.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0375n9[] values = EnumC0375n9.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC0375n9 = values[i];
                    l = valueOf3;
                    if (enumC0375n9.f1393a == intValue) {
                        break;
                    }
                    i++;
                    valueOf3 = l;
                } else {
                    l = valueOf3;
                    enumC0375n9 = EnumC0375n9.NATIVE;
                    break;
                }
            }
        } else {
            l = valueOf3;
            enumC0375n9 = null;
        }
        Boolean a4 = this.f1192a.a(c0373n7.p);
        Integer valueOf9 = Integer.valueOf(c0373n7.q);
        Integer num4 = valueOf9.intValue() != c0373n72.q ? valueOf9 : null;
        byte[] bArr = c0373n7.r;
        return new C0142e7(num, str2, str4, l2, model, str6, str8, l, num2, num3, str10, a2, str12, a3, enumC0375n9, a4, num4, !Arrays.equals(bArr, c0373n72.r) ? bArr : null);
    }
}
