package com.anythink.core.common.m.d;

import com.anythink.core.common.m.d.d;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static e f14759b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14760c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f14761a = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private volatile com.anythink.core.common.m.d.a.c f14762d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.anythink.core.common.m.d.a.c f14763e;

    private e() {
    }

    public static e a() {
        if (f14759b == null) {
            synchronized (e.class) {
                try {
                    if (f14759b == null) {
                        f14759b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14759b;
    }

    public final void a(d dVar, d.a aVar) {
        com.anythink.core.common.m.d.a.c cVar;
        int c4 = dVar.c();
        synchronized (f14760c) {
            try {
                if (c4 == 6) {
                    if (this.f14763e == null) {
                        this.f14763e = new com.anythink.core.common.m.d.a.b();
                    }
                    cVar = this.f14763e;
                } else {
                    if (this.f14762d == null) {
                        this.f14762d = new com.anythink.core.common.m.d.a.a();
                    }
                    cVar = this.f14762d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.b(dVar, aVar);
        } else if (aVar != null) {
            aVar.a((Throwable) new Exception("socketUploadData is null."));
        }
    }
}
