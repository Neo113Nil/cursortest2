package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class V8 {
    public static final Map h;
    public static final V8 i;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0653yd f1086a;
    public final uo b;
    public final InterfaceC0673z8 c;
    public final InterfaceC0549u9 d;
    public final Wb e;
    public final Vd f;
    public final O9 g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0145ea.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0145ea.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0145ea.UNKNOWN, -1);
        h = Collections.unmodifiableMap(hashMap);
        i = new V8(new Si(), new C0055an(), new C0124de(), new Ri(), new C0300ka(), new C0326la(), new C0274ja());
    }

    public V8(U8 u8) {
        this(u8.f1073a, u8.b, u8.c, u8.d, u8.e, u8.f, u8.g);
    }

    public final C0170f9 a(O8 o8, C0333lh c0333lh) {
        C0170f9 c0170f9 = new C0170f9();
        C0144e9 a2 = this.f.a(o8.l, o8.m);
        C0041a9 a3 = this.e.a(o8.g);
        if (a2 != null) {
            c0170f9.g = a2;
        }
        if (a3 != null) {
            c0170f9.f = a3;
        }
        String a4 = this.f1086a.a(o8.f985a);
        if (a4 != null) {
            c0170f9.d = a4;
        }
        c0170f9.e = this.b.a(o8, c0333lh);
        String str = o8.j;
        if (str != null) {
            c0170f9.h = str;
        }
        Integer a5 = this.d.a(o8);
        if (a5 != null) {
            c0170f9.c = a5.intValue();
        }
        Long l = o8.c;
        if (l != null) {
            c0170f9.f1254a = l.longValue();
        }
        Long l2 = o8.d;
        if (l2 != null) {
            c0170f9.n = l2.longValue();
        }
        Long l3 = o8.e;
        if (l3 != null) {
            c0170f9.o = l3.longValue();
        }
        Long l4 = o8.f;
        if (l4 != null) {
            c0170f9.b = l4.longValue();
        }
        Integer num = o8.k;
        if (num != null) {
            c0170f9.i = num.intValue();
        }
        c0170f9.j = this.c.a(o8.o);
        C0271j7 c0271j7 = o8.g;
        c0170f9.k = c0271j7 != null ? new C0245i6().a(c0271j7.f1317a) : -1;
        String str2 = o8.n;
        if (str2 != null) {
            c0170f9.l = str2.getBytes();
        }
        EnumC0145ea enumC0145ea = o8.p;
        Integer num2 = enumC0145ea != null ? (Integer) h.get(enumC0145ea) : null;
        if (num2 != null) {
            c0170f9.m = num2.intValue();
        }
        EnumC0375n9 enumC0375n9 = o8.q;
        if (enumC0375n9 != null) {
            int ordinal = enumC0375n9.ordinal();
            if (ordinal == 0) {
                c0170f9.p = 0;
            } else if (ordinal == 1) {
                c0170f9.p = 1;
            } else if (ordinal == 2) {
                c0170f9.p = 2;
            }
        }
        Boolean bool = o8.r;
        if (bool != null) {
            c0170f9.q = bool.booleanValue();
        }
        if (o8.s != null) {
            c0170f9.r = r6.intValue();
        }
        c0170f9.s = ((C0274ja) this.g).a(o8.t);
        return c0170f9;
    }

    public V8(InterfaceC0653yd interfaceC0653yd, uo uoVar, InterfaceC0673z8 interfaceC0673z8, InterfaceC0549u9 interfaceC0549u9, Wb wb, Vd vd, O9 o9) {
        this.f1086a = interfaceC0653yd;
        this.b = uoVar;
        this.c = interfaceC0673z8;
        this.d = interfaceC0549u9;
        this.e = wb;
        this.f = vd;
        this.g = o9;
    }

    public static U8 a() {
        return new U8(i);
    }
}
