package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gfu implements Closeable, gef {
    public final gdp a;
    final /* synthetic */ gfv b;
    private final Executor c;
    private final gew d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private boolean f = false;

    public gfu(gfv gfvVar, gew gewVar, Executor executor) {
        this.b = gfvVar;
        this.d = gewVar;
        this.c = executor;
        this.a = gewVar.a();
    }

    @Override // defpackage.gef
    public final void a(gee geeVar) {
        if (geeVar.b.ordinal() != 0) {
            return;
        }
        boolean andSet = this.e.getAndSet(true);
        if (fao.g()) {
            b();
        } else {
            if (andSet) {
                return;
            }
            this.c.execute(gvx.h(new gfm(this, 3)));
        }
    }

    public final void b() {
        fao.c();
        if (this.f) {
            return;
        }
        gfv gfvVar = this.b;
        if (gfvVar.f == null || !gfvVar.c) {
            return;
        }
        if (this.e.getAndSet(false)) {
            hnu hnuVar = gfvVar.f;
            gew gewVar = this.d;
            fao.c();
            gfb gfbVar = (gfb) hnuVar;
            gfe gfeVar = gfbVar.b;
            if (gfeVar.b == null) {
                throw new gfd();
            }
            aer aerVar = gfeVar.a;
            if (!aerVar.L().c.equals(aek.d) && !aerVar.L().c.equals(aek.e)) {
                throw new gfc();
            }
            gfo gfoVar = gfeVar.b;
            gex gexVar = gfbVar.a;
            fao.c();
            hrz hrzVar = (hrz) gfoVar.b.get(gexVar);
            hoq.I(hrzVar != null, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
            fao.c();
            Object obj = hrzVar.a;
            obj.getClass();
            gfp gfpVar = (gfp) obj;
            hrzVar.a = new gfp(gzp.h(gewVar), gfpVar.b, gfpVar.c, gfpVar.d);
            fao.c();
            gfoVar.d.execute(gvx.h(new evb(gfoVar, hrzVar, 14)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fao.c();
        this.f = true;
    }
}
