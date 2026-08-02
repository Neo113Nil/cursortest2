package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527c4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0478a7 f11570a;

    /* renamed from: b, reason: collision with root package name */
    public C0947sb f11571b;

    /* renamed from: c, reason: collision with root package name */
    public C0973tb f11572c;

    /* renamed from: d, reason: collision with root package name */
    public Zb f11573d;

    public C0527c4(File file) {
        this.f11570a = new C0478a7(file);
    }

    public final synchronized Ha a(Context context) {
        C0973tb c0973tb;
        c0973tb = this.f11572c;
        if (c0973tb == null) {
            c0973tb = new C0973tb(c(context));
            this.f11572c = c0973tb;
        }
        return c0973tb;
    }

    public final synchronized Ha b(Context context) {
        return c(context);
    }

    public final Ha c(Context context) {
        Zb zb;
        C0947sb c0947sb = this.f11571b;
        if (c0947sb != null) {
            return c0947sb;
        }
        synchronized (this) {
            zb = this.f11573d;
            if (zb == null) {
                C0478a7 c0478a7 = this.f11570a;
                String a3 = new Z6(c0478a7.f11430a, c0478a7.f11431b, true).a(context, new N3());
                M6 m6 = AbstractC1045w5.f12921c;
                m6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0967t5.f12767a);
                C0675hn c0675hn = m6.f10631c;
                W6 w6 = m6.f10629a;
                S6 s6 = w6.f11166c;
                T6 t6 = w6.f11167d;
                C0869pa c0869pa = new C0869pa(false);
                c0869pa.a(112, new O3());
                C0752kn c0752kn = new C0752kn("service database", hashMap);
                c0675hn.getClass();
                zb = new Zb(context, a3, new Y9(a3), new C0700in(s6, t6, c0869pa, c0752kn));
                this.f11573d = zb;
            }
        }
        C0947sb c0947sb2 = new C0947sb(zb);
        this.f11571b = c0947sb2;
        return c0947sb2;
    }
}
