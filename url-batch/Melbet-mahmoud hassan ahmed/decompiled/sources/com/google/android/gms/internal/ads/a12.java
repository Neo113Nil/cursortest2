package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a12 extends u02 {

    /* renamed from: g, reason: collision with root package name */
    private String f2548g;

    /* renamed from: h, reason: collision with root package name */
    private int f2549h = 1;

    public a12(Context context) {
        this.f12538f = new gi0(context, y2.t.u().b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.u02, r3.c.b
    public final void E(o3.b bVar) {
        io0.b("Cannot connect to remote service, fallback to local instance.");
        this.f12533a.f(new k12(1));
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        bp0<InputStream> bp0Var;
        k12 k12Var;
        synchronized (this.f12534b) {
            if (!this.f12536d) {
                this.f12536d = true;
                try {
                    int i7 = this.f2549h;
                    if (i7 == 2) {
                        this.f12538f.i0().h2(this.f12537e, new t02(this));
                    } else if (i7 == 3) {
                        this.f12538f.i0().Z0(this.f2548g, new t02(this));
                    } else {
                        this.f12533a.f(new k12(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    bp0Var = this.f12533a;
                    k12Var = new k12(1);
                    bp0Var.f(k12Var);
                } catch (Throwable th) {
                    y2.t.p().s(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    bp0Var = this.f12533a;
                    k12Var = new k12(1);
                    bp0Var.f(k12Var);
                }
            }
        }
    }

    public final cc3<InputStream> b(vi0 vi0Var) {
        synchronized (this.f12534b) {
            int i7 = this.f2549h;
            if (i7 != 1 && i7 != 2) {
                return rb3.h(new k12(2));
            }
            if (this.f12535c) {
                return this.f12533a;
            }
            this.f2549h = 2;
            this.f12535c = true;
            this.f12537e = vi0Var;
            this.f12538f.q();
            this.f12533a.b(new Runnable() { // from class: com.google.android.gms.internal.ads.y02
                @Override // java.lang.Runnable
                public final void run() {
                    a12.this.a();
                }
            }, wo0.f13899f);
            return this.f12533a;
        }
    }

    public final cc3<InputStream> c(String str) {
        synchronized (this.f12534b) {
            int i7 = this.f2549h;
            if (i7 != 1 && i7 != 3) {
                return rb3.h(new k12(2));
            }
            if (this.f12535c) {
                return this.f12533a;
            }
            this.f2549h = 3;
            this.f12535c = true;
            this.f2548g = str;
            this.f12538f.q();
            this.f12533a.b(new Runnable() { // from class: com.google.android.gms.internal.ads.z02
                @Override // java.lang.Runnable
                public final void run() {
                    a12.this.a();
                }
            }, wo0.f13899f);
            return this.f12533a;
        }
    }
}
