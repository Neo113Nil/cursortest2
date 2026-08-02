package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class U8 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f11036h;

    /* renamed from: i, reason: collision with root package name */
    public static final U8 f11037i;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1079xd f11038a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0986to f11039b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1100y8 f11040c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0971t9 f11041d;

    /* renamed from: e, reason: collision with root package name */
    public final Vb f11042e;

    /* renamed from: f, reason: collision with root package name */
    public final Ud f11043f;

    /* renamed from: g, reason: collision with root package name */
    public final N9 f11044g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0559da.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0559da.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0559da.UNKNOWN, -1);
        f11036h = Collections.unmodifiableMap(hashMap);
        f11037i = new U8(new Ri(), new Zm(), new C0537ce(), new Qi(), new C0713ja(), new C0739ka(), new C0688ia());
    }

    public U8(T8 t8) {
        this(t8.f10981a, t8.f10982b, t8.f10983c, t8.f10984d, t8.f10985e, t8.f10986f, t8.f10987g);
    }

    public final C0583e9 a(N8 n8, C0746kh c0746kh) {
        C0583e9 c0583e9 = new C0583e9();
        C0558d9 a3 = this.f11043f.a(n8.f10704l, n8.f10705m);
        Z8 a4 = this.f11042e.a(n8.f10699g);
        if (a3 != null) {
            c0583e9.f11771g = a3;
        }
        if (a4 != null) {
            c0583e9.f11770f = a4;
        }
        String a5 = this.f11038a.a(n8.f10693a);
        if (a5 != null) {
            c0583e9.f11768d = a5;
        }
        c0583e9.f11769e = this.f11039b.a(n8, c0746kh);
        String str = n8.f10702j;
        if (str != null) {
            c0583e9.f11772h = str;
        }
        Integer a6 = this.f11041d.a(n8);
        if (a6 != null) {
            c0583e9.f11767c = a6.intValue();
        }
        Long l4 = n8.f10695c;
        if (l4 != null) {
            c0583e9.f11765a = l4.longValue();
        }
        Long l5 = n8.f10696d;
        if (l5 != null) {
            c0583e9.n = l5.longValue();
        }
        Long l6 = n8.f10697e;
        if (l6 != null) {
            c0583e9.o = l6.longValue();
        }
        Long l7 = n8.f10698f;
        if (l7 != null) {
            c0583e9.f11766b = l7.longValue();
        }
        Integer num = n8.f10703k;
        if (num != null) {
            c0583e9.f11773i = num.intValue();
        }
        c0583e9.f11774j = this.f11040c.a(n8.o);
        C0685i7 c0685i7 = n8.f10699g;
        c0583e9.f11775k = c0685i7 != null ? new C0658h6().a(c0685i7.f12019a) : -1;
        String str2 = n8.n;
        if (str2 != null) {
            c0583e9.f11776l = str2.getBytes();
        }
        EnumC0559da enumC0559da = n8.f10706p;
        Integer num2 = enumC0559da != null ? (Integer) f11036h.get(enumC0559da) : null;
        if (num2 != null) {
            c0583e9.f11777m = num2.intValue();
        }
        EnumC0790m9 enumC0790m9 = n8.f10707q;
        if (enumC0790m9 != null) {
            int ordinal = enumC0790m9.ordinal();
            if (ordinal == 0) {
                c0583e9.f11778p = 0;
            } else if (ordinal == 1) {
                c0583e9.f11778p = 1;
            } else if (ordinal == 2) {
                c0583e9.f11778p = 2;
            }
        }
        Boolean bool = n8.f10708r;
        if (bool != null) {
            c0583e9.f11779q = bool.booleanValue();
        }
        if (n8.f10709s != null) {
            c0583e9.f11780r = r6.intValue();
        }
        c0583e9.f11781s = ((C0688ia) this.f11044g).a(n8.f10710t);
        return c0583e9;
    }

    public U8(InterfaceC1079xd interfaceC1079xd, InterfaceC0986to interfaceC0986to, InterfaceC1100y8 interfaceC1100y8, InterfaceC0971t9 interfaceC0971t9, Vb vb, Ud ud, N9 n9) {
        this.f11038a = interfaceC1079xd;
        this.f11039b = interfaceC0986to;
        this.f11040c = interfaceC1100y8;
        this.f11041d = interfaceC0971t9;
        this.f11042e = vb;
        this.f11043f = ud;
        this.f11044g = n9;
    }

    public static T8 a() {
        return new T8(f11037i);
    }
}
