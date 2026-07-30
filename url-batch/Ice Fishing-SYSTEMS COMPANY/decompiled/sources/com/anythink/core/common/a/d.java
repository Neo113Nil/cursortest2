package com.anythink.core.common.a;

import com.anythink.core.common.d.t;
import com.anythink.core.common.h.r;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f12301b;

    /* renamed from: a, reason: collision with root package name */
    final String f12302a = d.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.e.i f12303c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.e.h f12304d;

    private d() {
        if (t.b().g() != null) {
            this.f12303c = com.anythink.core.common.e.i.a(com.anythink.core.common.e.e.a(t.b().g()));
            this.f12304d = com.anythink.core.common.e.h.a(com.anythink.core.common.e.e.a(t.b().g()));
        }
    }

    public final void c(final r rVar) {
        if (rVar.aG() != 1) {
            rVar.aG();
        } else if (rVar.K() != 1 && rVar.K() != 4) {
            rVar.K();
        } else {
            t.b();
            t.c(new Runnable() { // from class: com.anythink.core.common.a.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    rVar.aE();
                    k kVar = new k();
                    kVar.f12345a = rVar.aD();
                    kVar.f12346b = rVar.aE();
                    kVar.f12347c = rVar.I();
                    d.this.f12304d.a(kVar);
                }
            });
        }
    }

    public static d a() {
        if (f12301b == null) {
            synchronized (d.class) {
                try {
                    if (f12301b == null) {
                        f12301b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12301b;
    }

    public final void b(final r rVar) {
        rVar.aE();
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.d.2
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = new l();
                lVar.f12345a = rVar.aD();
                lVar.f12346b = rVar.aE();
                lVar.f12348c = rVar.aF();
                lVar.f12349d = 1;
                d.this.f12303c.b(lVar);
            }
        });
    }

    public final void b() {
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.d.3
            @Override // java.lang.Runnable
            public final void run() {
                d.this.f12303c.a();
            }
        });
    }

    public final List<j> b(int i) {
        return this.f12304d.a(i);
    }

    public final void a(final r rVar) {
        rVar.aE();
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = new l();
                lVar.f12345a = rVar.aD();
                lVar.f12346b = rVar.aE();
                lVar.f12348c = rVar.aF();
                lVar.f12349d = 0;
                d.this.f12303c.a(lVar);
            }
        });
    }

    public final List<j> a(int i) {
        return this.f12303c.a(i);
    }
}
