package defpackage;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keh implements kfr {
    public final String a;
    public kja b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final kmt g;
    public jwt h;
    public final keb i;
    public boolean j;
    public kbq k;
    public boolean l;
    private final jyp m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public keh(keb kebVar, InetSocketAddress inetSocketAddress, String str, String str2, jwt jwtVar, Executor executor, int i, kmt kmtVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = jyp.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        Charset charset = khd.a;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-cronet/1.84.0-SNAPSHOT");
        this.a = sb.toString();
        this.f = i;
        this.e = executor;
        this.i = kebVar;
        this.g = kmtVar;
        jwt jwtVar2 = jwt.a;
        kdw kdwVar = new kdw(jwt.a);
        kdwVar.c(kgy.a, kbe.c);
        kdwVar.c(kgy.b, jwtVar);
        this.h = kdwVar.a();
    }

    @Override // defpackage.kfj
    public final /* bridge */ /* synthetic */ kfg a(kae kaeVar, kaa kaaVar, jww jwwVar, jxb[] jxbVarArr) {
        String str = "https://" + this.o + "/".concat(kaeVar.b);
        jwt jwtVar = this.h;
        kmm kmmVar = new kmm(jxbVarArr);
        for (jxb jxbVar : jxbVarArr) {
            jxbVar.d(jwtVar);
        }
        return new keg(this, str, kaaVar, kaeVar, kmmVar, jwwVar).a;
    }

    @Override // defpackage.kjb
    public final Runnable b(kja kjaVar) {
        this.b = kjaVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new iaq(this, 14, null);
    }

    @Override // defpackage.jyv
    public final jyp c() {
        return this.m;
    }

    public final void d(kef kefVar, kbq kbqVar) {
        synchronized (this.c) {
            if (this.d.remove(kefVar)) {
                kbn kbnVar = kbqVar.o;
                boolean z = true;
                if (kbnVar != kbn.CANCELLED && kbnVar != kbn.DEADLINE_EXCEEDED) {
                    z = false;
                }
                kefVar.r.f(kbqVar, z, new kaa());
                f();
            }
        }
    }

    @Override // defpackage.kjb
    public final void e(kbq kbqVar) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                kja kjaVar = this.b;
                khs khsVar = (khs) kjaVar;
                khu khuVar = khsVar.c;
                jwy jwyVar = khuVar.d;
                kfr kfrVar = khsVar.a;
                kmk kmkVar = kmk.SUBCHANNEL_SHUTDOWN;
                jwyVar.b(2, "{0} SHUTDOWN with {1}", kfrVar.c(), khu.j(kbqVar));
                khsVar.b = true;
                khuVar.g.execute(new kfu(kjaVar, kmkVar, kbqVar, 3));
                synchronized (this.c) {
                    this.j = true;
                    this.k = kbqVar;
                }
                f();
            }
        }
    }

    final void f() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                kja kjaVar = this.b;
                khs khsVar = (khs) kjaVar;
                hoq.I(khsVar.b, "transportShutdown() must be called before transportTerminated().");
                khu khuVar = khsVar.c;
                jwy jwyVar = khuVar.d;
                kfr kfrVar = khsVar.a;
                jwyVar.b(2, "{0} Terminated", kfrVar.c());
                jyl.c(khuVar.c.e, kfrVar);
                kbw kbwVar = khuVar.g;
                kbwVar.execute(new kga(khuVar, kfrVar, 13, null));
                Iterator it = khuVar.f.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                kbwVar.execute(new kgf(kjaVar, 11));
            }
        }
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
