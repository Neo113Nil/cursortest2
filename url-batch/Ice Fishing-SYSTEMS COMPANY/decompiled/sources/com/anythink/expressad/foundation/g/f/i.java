package com.anythink.expressad.foundation.g.f;

import android.os.Process;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19518a = "i";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f19519b;

    /* renamed from: c, reason: collision with root package name */
    private h f19520c;

    /* renamed from: d, reason: collision with root package name */
    private c f19521d;

    public i(SSLSocketFactory sSLSocketFactory, c cVar) {
        com.anythink.expressad.foundation.g.f.e.b bVar = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        this.f19519b = bVar;
        this.f19520c = new com.anythink.expressad.foundation.g.f.f.a(bVar, cVar);
        this.f19521d = cVar;
    }

    private void b(j jVar) {
        try {
            this.f19521d.c(jVar);
            if (jVar.f()) {
                jVar.c();
                this.f19521d.b(jVar);
                this.f19521d.a(jVar);
            } else {
                this.f19521d.d(jVar);
                this.f19521d.a((j<?>) jVar, jVar.a(this.f19520c.a(jVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e6) {
            this.f19521d.a((j<?>) jVar, j.a(e6));
        } catch (Exception e9) {
            e9.getMessage();
            this.f19521d.a((j<?>) jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public final void a(j jVar) {
        Process.setThreadPriority(10);
        try {
            this.f19521d.c(jVar);
            if (jVar.f()) {
                jVar.c();
                this.f19521d.b(jVar);
                this.f19521d.a(jVar);
            } else {
                this.f19521d.d(jVar);
                this.f19521d.a((j<?>) jVar, jVar.a(this.f19520c.a(jVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e6) {
            this.f19521d.a((j<?>) jVar, j.a(e6));
        } catch (Exception e9) {
            e9.getMessage();
            this.f19521d.a((j<?>) jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public i(SSLSocketFactory sSLSocketFactory, c cVar, com.anythink.expressad.foundation.g.f.e.a aVar) {
        if (aVar == null) {
            this.f19519b = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        } else {
            this.f19519b = aVar;
        }
        this.f19520c = new com.anythink.expressad.foundation.g.f.f.a(this.f19519b, cVar);
        this.f19521d = cVar;
    }
}
