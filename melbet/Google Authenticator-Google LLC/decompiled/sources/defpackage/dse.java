package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dse {
    public ScheduledExecutorService a;
    public Context b;
    public dsg c;
    public dov d;
    public drz e;
    public ebv f;
    public efc g;
    public ebr h;
    public final gzp i;
    public dpd j;
    public dpd k;
    public ExecutorService l;
    public dme m;
    public efu n;
    public final gzp o;
    public final gzp p;
    public fwm q;

    public dse() {
        gyf gyfVar = gyf.a;
        this.i = gyfVar;
        this.o = gyfVar;
        this.p = gyfVar;
    }

    public final Context a() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"applicationContext\" has not been set");
    }

    public final dov b() {
        dov dovVar = this.d;
        if (dovVar != null) {
            return dovVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    public final dsg c() {
        dsg dsgVar = this.c;
        if (dsgVar != null) {
            return dsgVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    public final ebv d() {
        ebv ebvVar = this.f;
        if (ebvVar != null) {
            return ebvVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    public final gzp e() {
        dpd dpdVar = this.j;
        return dpdVar == null ? gyf.a : gzp.h(dpdVar);
    }

    public final void f() {
        if (this.h == null) {
            throw new IllegalStateException("Property \"configuration\" has not been set");
        }
    }
}
