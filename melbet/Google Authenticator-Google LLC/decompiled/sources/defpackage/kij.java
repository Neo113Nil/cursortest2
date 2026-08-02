package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kij extends ixd {
    final kii a;
    final kaq b;
    final /* synthetic */ kiq c;

    public kij(kiq kiqVar, kii kiiVar, kaq kaqVar) {
        this.c = kiqVar;
        this.a = kiiVar;
        kaqVar.getClass();
        this.b = kaqVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ixd
    public final kbq a(kao kaoVar) {
        kiz kizVar;
        Object obj;
        kiq kiqVar = this.c;
        kbw kbwVar = kiqVar.m;
        kbwVar.c();
        if (kiqVar.r != this.b) {
            return kbq.b;
        }
        kbs kbsVar = kaoVar.a;
        if (!kbsVar.d()) {
            v(kbsVar.a());
            return kbsVar.a();
        }
        Object c = kbsVar.c();
        jwy jwyVar = kiqVar.G;
        jwt jwtVar = kaoVar.b;
        jwyVar.b(1, "Resolved address: {0}, config={1}", c, jwtVar);
        if (kiqVar.T != 2) {
            jwyVar.b(2, "Address resolved: {0}", c);
            kiqVar.T = 2;
        }
        kam kamVar = kaoVar.c;
        jym jymVar = (jym) jwtVar.a(jym.a);
        kiz kizVar2 = (kamVar == null || (obj = kamVar.b) == null) ? null : (kiz) obj;
        kbq kbqVar = kamVar != null ? kamVar.a : null;
        if (kiqVar.M) {
            if (kizVar2 == null) {
                kizVar2 = kiqVar.K;
                if (kizVar2 != null) {
                    kiqVar.I.c(kizVar2.a());
                    jwyVar.a(2, "Received no service config, using default service config");
                } else if (kbqVar == null) {
                    kin kinVar = kiqVar.I;
                    kizVar2 = kiq.d;
                    kinVar.c(null);
                } else {
                    if (!kiqVar.L) {
                        jwyVar.a(2, "Fallback to error due to invalid first service config without default config");
                        kbq kbqVar2 = kamVar.a;
                        hoq.y(!kbqVar2.g(), "the error status must not be OK");
                        kbwVar.execute(new kga(this, kbqVar2, 14, null));
                        return kbqVar2;
                    }
                    kizVar2 = kiqVar.J;
                }
            } else if (jymVar != null) {
                kiqVar.I.c(jymVar);
                if (kizVar2.a() != null) {
                    jwyVar.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                }
            } else {
                kiqVar.I.c(kizVar2.a());
            }
            if (!kizVar2.equals(kiqVar.J)) {
                jwyVar.b(2, "Service config changed{0}", kizVar2 == kiq.d ? " to empty" : "");
                kiqVar.J = kizVar2;
                kiqVar.R.a = kizVar2.a;
            }
            try {
                kiqVar.L = true;
            } catch (RuntimeException e) {
                jyp jypVar = this.c.g;
                kiq.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", "[" + String.valueOf(jypVar) + "] Unexpected exception from parsing service config", (Throwable) e);
            }
            kizVar = kizVar2;
        } else {
            if (kizVar2 != null) {
                jwyVar.a(2, "Service config from name resolver discarded by channel settings");
            }
            kizVar = kiqVar.K;
            if (kizVar == null) {
                kizVar = kiq.d;
            }
            if (jymVar != null) {
                jwyVar.a(2, "Config selector from name resolver discarded by channel settings");
            }
            kiqVar.I.c(kizVar.a());
        }
        jwt jwtVar2 = kaoVar.b;
        kii kiiVar = this.a;
        if (kiiVar != this.c.t) {
            return kbq.b;
        }
        kdw kdwVar = new kdw(jwtVar2);
        jws jwsVar = jym.a;
        Object obj2 = kdwVar.a;
        if (obj2 == null) {
            ((IdentityHashMap) kdwVar.b).remove(jwsVar);
        } else if (((jwt) obj2).b.containsKey(jwsVar)) {
            kdwVar.b(0).remove(jwsVar);
        }
        Map map = kizVar.c;
        if (map != null) {
            kdwVar.c(jzk.a, map);
            kdwVar.a();
        }
        return kiiVar.a.a(new jzg(kbsVar.c(), kdwVar.a(), kizVar.b));
    }

    public final void v(kbq kbqVar) {
        Logger logger = kiq.a;
        Level level = Level.WARNING;
        kiq kiqVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{kiqVar.g, kbqVar});
        kin kinVar = kiqVar.I;
        if (kinVar.a.get() == kiq.e) {
            kiq kiqVar2 = kinVar.c;
            kiz kizVar = kiqVar2.K;
            if (kizVar != null) {
                kinVar.c(kizVar.a());
                kiqVar2.J = kizVar;
                kiqVar2.G.a(4, "Initial Name Resolution error, using default service config");
            } else {
                kinVar.c(null);
            }
        }
        if (kiqVar.T != 3) {
            kiqVar.G.b(3, "Failed to resolve name: {0}", kbqVar);
            kiqVar.T = 3;
        }
        kii kiiVar = this.a;
        if (kiiVar != kiqVar.t) {
            return;
        }
        kiiVar.a.b(kbqVar);
    }
}
