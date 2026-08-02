package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384b9 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f7065h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0384b9 f7066i;

    /* renamed from: a, reason: collision with root package name */
    public final Ed f7067a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0916vo f7068b;

    /* renamed from: c, reason: collision with root package name */
    public final D8 f7069c;

    /* renamed from: d, reason: collision with root package name */
    public final A9 f7070d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0413cc f7071e;
    public final InterfaceC0389be f;

    /* renamed from: g, reason: collision with root package name */
    public final U9 f7072g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0617ka.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0617ka.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0617ka.UNKNOWN, -1);
        f7065h = Collections.unmodifiableMap(hashMap);
        f7066i = new C0384b9(new Wi(), new C0424cn(), new C0595je(), new Vi(), new C0773qa(), new C0798ra(), new C0747pa());
    }

    public C0384b9(C0358a9 c0358a9) {
        this(c0358a9.f6991a, c0358a9.f6992b, c0358a9.f6993c, c0358a9.f6994d, c0358a9.f6995e, c0358a9.f, c0358a9.f6996g);
    }

    public final C0642l9 a(S8 s8, C0754ph c0754ph) {
        C0642l9 c0642l9 = new C0642l9();
        C0616k9 a3 = this.f.a(s8.f6621l, s8.f6622m);
        C0513g9 a4 = this.f7071e.a(s8.f6616g);
        if (a3 != null) {
            c0642l9.f7804g = a3;
        }
        if (a4 != null) {
            c0642l9.f = a4;
        }
        String a5 = this.f7067a.a(s8.f6611a);
        if (a5 != null) {
            c0642l9.f7802d = a5;
        }
        c0642l9.f7803e = this.f7068b.a(s8, c0754ph);
        String str = s8.f6619j;
        if (str != null) {
            c0642l9.f7805h = str;
        }
        Integer a6 = this.f7070d.a(s8);
        if (a6 != null) {
            c0642l9.f7801c = a6.intValue();
        }
        Long l3 = s8.f6613c;
        if (l3 != null) {
            c0642l9.f7799a = l3.longValue();
        }
        Long l4 = s8.f6614d;
        if (l4 != null) {
            c0642l9.f7811n = l4.longValue();
        }
        Long l5 = s8.f6615e;
        if (l5 != null) {
            c0642l9.o = l5.longValue();
        }
        Long l6 = s8.f;
        if (l6 != null) {
            c0642l9.f7800b = l6.longValue();
        }
        Integer num = s8.f6620k;
        if (num != null) {
            c0642l9.f7806i = num.intValue();
        }
        c0642l9.f7807j = this.f7069c.a(s8.o);
        C0770q7 c0770q7 = s8.f6616g;
        c0642l9.f7808k = c0770q7 != null ? new C0717o6().a(c0770q7.f8129a) : -1;
        String str2 = s8.f6623n;
        if (str2 != null) {
            c0642l9.f7809l = str2.getBytes();
        }
        EnumC0617ka enumC0617ka = s8.f6624p;
        Integer num2 = enumC0617ka != null ? (Integer) f7065h.get(enumC0617ka) : null;
        if (num2 != null) {
            c0642l9.f7810m = num2.intValue();
        }
        EnumC0849t9 enumC0849t9 = s8.f6625q;
        if (enumC0849t9 != null) {
            int ordinal = enumC0849t9.ordinal();
            if (ordinal == 0) {
                c0642l9.f7812p = 0;
            } else if (ordinal == 1) {
                c0642l9.f7812p = 1;
            } else if (ordinal == 2) {
                c0642l9.f7812p = 2;
            }
        }
        Boolean bool = s8.f6626r;
        if (bool != null) {
            c0642l9.f7813q = bool.booleanValue();
        }
        if (s8.f6627s != null) {
            c0642l9.f7814r = r6.intValue();
        }
        c0642l9.f7815s = ((C0747pa) this.f7072g).a(s8.f6628t);
        return c0642l9;
    }

    public C0384b9(Ed ed, InterfaceC0916vo interfaceC0916vo, D8 d8, A9 a9, InterfaceC0413cc interfaceC0413cc, InterfaceC0389be interfaceC0389be, U9 u9) {
        this.f7067a = ed;
        this.f7068b = interfaceC0916vo;
        this.f7069c = d8;
        this.f7070d = a9;
        this.f7071e = interfaceC0413cc;
        this.f = interfaceC0389be;
        this.f7072g = u9;
    }

    public static C0358a9 a() {
        return new C0358a9(f7066i);
    }
}
