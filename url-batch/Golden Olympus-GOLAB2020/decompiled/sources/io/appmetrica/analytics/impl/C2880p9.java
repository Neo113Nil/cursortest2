package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2880p9 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f39607h;

    /* renamed from: i, reason: collision with root package name */
    public static final C2880p9 f39608i;

    /* renamed from: a, reason: collision with root package name */
    public final Md f39609a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2921qo f39610b;

    /* renamed from: c, reason: collision with root package name */
    public final R8 f39611c;

    /* renamed from: d, reason: collision with root package name */
    public final O9 f39612d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2909qc f39613e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2729je f39614f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2700ia f39615g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC3114ya.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC3114ya.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC3114ya.UNKNOWN, -1);
        f39607h = Collections.unmodifiableMap(hashMap);
        f39608i = new C2880p9(new C2603ej(), new Ym(), new C2936re(), new C2577dj(), new Ea(), new Fa(), new Da());
    }

    public C2880p9(C2854o9 c2854o9) {
        this(c2854o9.f39560a, c2854o9.f39561b, c2854o9.f39562c, c2854o9.f39563d, c2854o9.f39564e, c2854o9.f39565f, c2854o9.f39566g);
    }

    public final C3139z9 a(C2647g9 c2647g9, C3095xh c3095xh) {
        C3139z9 c3139z9 = new C3139z9();
        C3113y9 a4 = this.f39614f.a(c2647g9.f39067l, c2647g9.f39068m);
        C3009u9 a5 = this.f39613e.a(c2647g9.f39062g);
        if (a4 != null) {
            c3139z9.f40357g = a4;
        }
        if (a5 != null) {
            c3139z9.f40356f = a5;
        }
        String a6 = this.f39609a.a(c2647g9.f39056a);
        if (a6 != null) {
            c3139z9.f40354d = a6;
        }
        c3139z9.f40355e = this.f39610b.a(c2647g9, c3095xh);
        String str = c2647g9.f39065j;
        if (str != null) {
            c3139z9.f40358h = str;
        }
        Integer a7 = this.f39612d.a(c2647g9);
        if (a7 != null) {
            c3139z9.f40353c = a7.intValue();
        }
        Long l4 = c2647g9.f39058c;
        if (l4 != null) {
            c3139z9.f40351a = l4.longValue();
        }
        Long l5 = c2647g9.f39059d;
        if (l5 != null) {
            c3139z9.f40364n = l5.longValue();
        }
        Long l6 = c2647g9.f39060e;
        if (l6 != null) {
            c3139z9.f40365o = l6.longValue();
        }
        Long l7 = c2647g9.f39061f;
        if (l7 != null) {
            c3139z9.f40352b = l7.longValue();
        }
        Integer num = c2647g9.f39066k;
        if (num != null) {
            c3139z9.f40359i = num.intValue();
        }
        c3139z9.f40360j = this.f39611c.a(c2647g9.f39070o);
        E7 e7 = c2647g9.f39062g;
        c3139z9.f40361k = e7 != null ? new D6().a(e7.f37407a) : -1;
        String str2 = c2647g9.f39069n;
        if (str2 != null) {
            c3139z9.f40362l = str2.getBytes();
        }
        EnumC3114ya enumC3114ya = c2647g9.f39071p;
        Integer num2 = enumC3114ya != null ? (Integer) f39607h.get(enumC3114ya) : null;
        if (num2 != null) {
            c3139z9.f40363m = num2.intValue();
        }
        H9 h9 = c2647g9.f39072q;
        if (h9 != null) {
            int ordinal = h9.ordinal();
            if (ordinal == 0) {
                c3139z9.f40366p = 0;
            } else if (ordinal == 1) {
                c3139z9.f40366p = 1;
            } else if (ordinal == 2) {
                c3139z9.f40366p = 2;
            }
        }
        Boolean bool = c2647g9.f39073r;
        if (bool != null) {
            c3139z9.f40367q = bool.booleanValue();
        }
        if (c2647g9.f39074s != null) {
            c3139z9.f40368r = r6.intValue();
        }
        c3139z9.f40369s = ((Da) this.f39615g).a(c2647g9.f39075t);
        return c3139z9;
    }

    public C2880p9(Md md, InterfaceC2921qo interfaceC2921qo, R8 r8, O9 o9, InterfaceC2909qc interfaceC2909qc, InterfaceC2729je interfaceC2729je, InterfaceC2700ia interfaceC2700ia) {
        this.f39609a = md;
        this.f39610b = interfaceC2921qo;
        this.f39611c = r8;
        this.f39612d = o9;
        this.f39613e = interfaceC2909qc;
        this.f39614f = interfaceC2729je;
        this.f39615g = interfaceC2700ia;
    }

    public static C2854o9 a() {
        return new C2854o9(f39608i);
    }
}
