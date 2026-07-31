package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ze implements k3.a {
    public a7 a;
    public final u8 b;
    public final i3 c;
    public final gg d;
    public final AtomicReference e;
    public final u7 f;
    public final EndpointRepository g;
    public final zg h;
    public int i = 1;
    public int j = 0;
    public long k = 0;
    public k3 l = null;
    public AtomicInteger m = null;

    public synchronized void b() {
        sg sgVar;
        try {
            try {
                xb.c("Sdk Version = 9.12.1, Commit: 046e4d88fb5334ad97b395fba791da746b7830e2", null);
                sgVar = (sg) this.e.get();
                a(sgVar);
            } catch (Exception e) {
                if (this.i == 2) {
                    xb.a("Change state to COOLDOWN", null);
                    this.i = 4;
                    this.l = null;
                }
                xb.b("prefetch", e);
            }
            if (!sgVar.g() && !sgVar.f()) {
                if (this.i == 3) {
                    if (this.m.get() > 0) {
                        return;
                    }
                    xb.a("Change state to COOLDOWN", null);
                    this.i = 4;
                    this.m = null;
                }
                if (this.i == 4) {
                    if (this.k - System.nanoTime() > 0) {
                        xb.a("Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires", null);
                        return;
                    }
                    xb.a("Change state to IDLE", null);
                    this.i = 1;
                    this.j = 0;
                    this.k = 0L;
                }
                if (this.i != 1) {
                    return;
                }
                if (!sgVar.k()) {
                    xb.b("Did not prefetch because neither native nor webview are enabled.", null);
                    return;
                }
                URL endPointUrl = this.g.getEndPointUrl(EndpointRepository.EndPoint.PREFETCH);
                s3 s3Var = new s3(e3.c.c, com.chartboost.sdk.internal.Networking.b.a(endPointUrl), endPointUrl.getPath(), this.d.a(), af.e, null, this, this.f.a(), this.h);
                s3Var.b("cache_assets", this.b.e());
                s3Var.s = true;
                xb.a("Change state to AWAIT_PREFETCH_RESPONSE", null);
                this.i = 2;
                this.j = 2;
                this.k = System.nanoTime() + TimeUnit.MINUTES.toNanos(sgVar.w);
                this.l = s3Var;
                this.c.a(s3Var);
                return;
            }
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public ze(a7 a7Var, u8 u8Var, i3 i3Var, gg ggVar, AtomicReference atomicReference, u7 u7Var, EndpointRepository endpointRepository, zg zgVar) {
        this.a = a7Var;
        this.b = u8Var;
        this.c = i3Var;
        this.d = ggVar;
        this.e = atomicReference;
        this.f = u7Var;
        this.g = endpointRepository;
        this.h = zgVar;
    }

    public final synchronized void a() {
        try {
            int i = this.i;
            if (i == 2) {
                xb.a("Change state to COOLDOWN", null);
                this.i = 4;
                this.l = null;
            } else if (i == 3) {
                xb.a("Change state to COOLDOWN", null);
                this.i = 4;
                AtomicInteger atomicInteger = this.m;
                this.m = null;
                if (atomicInteger != null) {
                    this.a.a(atomicInteger);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(sg sgVar) {
        boolean z = sgVar.r;
        if (this.j != 2 || z) {
            return;
        }
        xb.a("Change state to IDLE", null);
        this.i = 1;
        this.j = 0;
        this.k = 0L;
        this.l = null;
        AtomicInteger atomicInteger = this.m;
        this.m = null;
        if (atomicInteger != null) {
            this.a.a(atomicInteger);
        }
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public synchronized void a(k3 k3Var, CBError cBError) {
        String str = "Prefetch failure";
        if (cBError != null) {
            try {
                str = cBError.getErrorDesc();
            } catch (Throwable th) {
                throw th;
            }
        }
        String str2 = str;
        p7 a = this.f.a();
        if (a != null) {
            a.mo3222track(new l7(si.f.d, str2, "", "", null));
        }
        if (this.i != 2) {
            return;
        }
        if (k3Var != this.l) {
            return;
        }
        this.l = null;
        xb.a("Change state to COOLDOWN", null);
        this.i = 4;
    }

    @Override // com.chartboost.sdk.impl.k3.a
    public synchronized void a(k3 k3Var, JSONObject jSONObject) {
        try {
        } catch (Exception e) {
            xb.b("prefetch onSuccess", e);
        }
        if (this.i != 2) {
            return;
        }
        if (k3Var != this.l) {
            return;
        }
        xb.a("Change state to DOWNLOAD_ASSETS", null);
        this.i = 3;
        this.l = null;
        this.m = new AtomicInteger();
        if (jSONObject != null) {
            xb.a("Got Asset list for Prefetch from server: " + jSONObject, null);
            this.a.a(af.f, u1.b(jSONObject, ((sg) this.e.get()).o), this.m, null, "");
        }
    }
}
