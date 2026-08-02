package com.google.android.apps.authenticator2.osmigrationtargetservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import defpackage.brr;
import defpackage.bzt;
import defpackage.bzu;
import defpackage.cka;
import defpackage.fao;
import defpackage.ges;
import defpackage.gjg;
import defpackage.glp;
import defpackage.gsw;
import defpackage.gta;
import defpackage.gtd;
import defpackage.gtt;
import defpackage.gtu;
import defpackage.gty;
import defpackage.gua;
import defpackage.gub;
import defpackage.guc;
import defpackage.gul;
import defpackage.guq;
import defpackage.gut;
import defpackage.hnu;
import defpackage.hoq;
import defpackage.hpx;
import defpackage.ifz;
import defpackage.ixa;
import defpackage.ixc;
import defpackage.jed;
import defpackage.kce;
import defpackage.kci;
import defpackage.kcj;
import defpackage.kck;
import defpackage.ksp;
import defpackage.kuq;
import j$.lang.Iterable$EL;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TargetEndpointService extends bzt implements gjg {
    public cka a;
    private boolean b;
    private boolean c;
    private brr d;
    private final jed e = new jed(this);

    @Deprecated
    public TargetEndpointService() {
        fao.c();
    }

    @Override // defpackage.gjg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final brr z() {
        brr brrVar = this.d;
        if (brrVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.c) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return brrVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, jpt] */
    @Override // defpackage.aeu, android.app.Service
    public final IBinder onBind(Intent intent) {
        guc gucVar;
        gut gswVar;
        kck kciVar;
        jed jedVar = this.e;
        Object obj = jedVar.a;
        if (intent == null || hoq.aN(intent) == null) {
            gucVar = gub.a;
            gucVar.getClass();
        } else {
            gucVar = guc.d(hoq.aH((Context) obj));
            gucVar.getClass();
        }
        Class<?> cls = obj.getClass();
        guq b = gta.b();
        String concat = String.valueOf(cls.getName()).concat(".onBind");
        if (intent == null) {
            gswVar = hoq.aO((Service) obj, concat);
        } else {
            guq aN = hoq.aN(intent);
            if (aN == null) {
                gswVar = hoq.aO((Service) obj, concat);
            } else {
                gta.f(aN);
                gswVar = new gsw(5);
            }
        }
        gtu gtuVar = new gtu(hoq.aB(232, jedVar.d("onBind"), gucVar, true), gswVar, b);
        try {
            cka ckaVar = this.a;
            if (ckaVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            Iterable$EL.forEach((Set) ckaVar.a.b(), new ges(3));
            super.onBind(intent);
            brr z = z();
            ?? r13 = z.b;
            ifz ifzVar = (ifz) r13.b();
            HashMap hashMap = new HashMap();
            PackageManager packageManager = ((Context) z.a).getPackageManager();
            packageManager.getClass();
            if (!Build.TYPE.equals("eng") && !Build.TYPE.equals("userdebug")) {
                if (Build.TAGS != null) {
                    String str = Build.TAGS;
                    str.getClass();
                    if (!ksp.m(str, "dev-keys", false)) {
                        String str2 = Build.TAGS;
                        str2.getClass();
                        if (ksp.m(str2, "test-keys", false)) {
                        }
                    }
                }
                kciVar = kcj.a(packageManager, "com.google.android.apps.restore", hpx.g.h("56BE132B780656FE2444CD34326EB5D7AAC91D2096ABF0FE673A99270622EC87"));
                hashMap.put("com.google.android.libraries.restore.osmigration.systemappapi.TargetService", kciVar);
                kuq e = ixa.e(hashMap);
                kce kceVar = new kce();
                kceVar.b();
                ifzVar.b(e, kceVar.a());
                IBinder a = ((ifz) r13.b()).a();
                gtuVar.close();
                return a;
            }
            hpx hpxVar = hpx.g;
            kciVar = new kci(new kck[]{kcj.b(packageManager, "com.google.android.apps.restore", ixc.D(new byte[][]{hpxVar.h("CE74646CCC647C1640C4571023E1CF71B90E4D1D07167C184BE29136449E4C7F"), hpxVar.h("56BE132B780656FE2444CD34326EB5D7AAC91D2096ABF0FE673A99270622EC87")})), kcj.a(packageManager, "com.google.android.apps.restore.experimental.osmigration.devapp", hpxVar.h("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1"))});
            hashMap.put("com.google.android.libraries.restore.osmigration.systemappapi.TargetService", kciVar);
            kuq e2 = ixa.e(hashMap);
            kce kceVar2 = new kce();
            kceVar2.b();
            ifzVar.b(e2, kceVar2.a());
            IBinder a2 = ((ifz) r13.b()).a();
            gtuVar.close();
            return a2;
        } catch (Throwable th) {
            try {
                gtuVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bzt, defpackage.aeu, android.app.Service
    public final void onCreate() {
        final gtt gttVar;
        final jed jedVar = this.e;
        guc c = jedVar.c();
        final guq b = gta.b();
        if (gta.u()) {
            gttVar = null;
        } else {
            guq e = gta.e();
            if (e != null) {
                gtd gtdVar = new gtd(2);
                gta.f(e);
                gua b2 = guc.b();
                b2.a(gul.c, gtdVar);
                jedVar.b = hoq.aB(231, "Creating ".concat(String.valueOf(jedVar.a.getClass().getSimpleName())), ((guc) b2).f(), true);
                gttVar = e;
            } else {
                Object obj = jedVar.a;
                gttVar = hoq.aG((Context) obj).c(230, "Creating ".concat(String.valueOf(obj.getClass().getSimpleName())), gul.a);
            }
        }
        final gty aB = hoq.aB(233, jedVar.d("onCreate"), c, true);
        gut gutVar = new gut() { // from class: gtv
            /* JADX WARN: Type inference failed for: r0v2, types: [gut, java.lang.Object] */
            @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                aB.close();
                ?? r0 = jed.this.b;
                if (r0 != 0) {
                    r0.close();
                }
                gut gutVar2 = gttVar;
                if (gutVar2 != null) {
                    gutVar2.close();
                }
                gta.f(b);
            }
        };
        try {
            this.b = true;
            hoq.H(getApplication() instanceof glp);
            if (this.d == null) {
                if (!this.b) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.c) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                gty aC = hoq.aC(48, "CreateComponent");
                try {
                    C();
                    aC.close();
                    gty aC2 = hoq.aC(49, "CreatePeer");
                    try {
                        this.d = ((bzu) hnu.bh(this, bzu.class)).a();
                        aC2.close();
                    } finally {
                    }
                } finally {
                }
            }
            super.onCreate();
            this.b = false;
            gutVar.close();
        } catch (Throwable th) {
            try {
                gutVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jpt] */
    @Override // defpackage.aeu, android.app.Service
    public final void onDestroy() {
        gtt gttVar;
        jed jedVar = this.e;
        guc c = jedVar.c();
        guq b = gta.b();
        if (gta.u()) {
            gttVar = null;
        } else {
            Object obj = jedVar.a;
            gttVar = hoq.aG((Context) obj).c(229, "Destroying ".concat(String.valueOf(obj.getClass().getSimpleName())), gul.a);
        }
        gtu gtuVar = new gtu(hoq.aB(234, jedVar.d("onDestroy"), c, true), gttVar, b);
        try {
            cka ckaVar = this.a;
            if (ckaVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            Iterable$EL.forEach((Set) ckaVar.a.b(), new ges(4));
            super.onDestroy();
            this.c = true;
            gtuVar.close();
        } catch (Throwable th) {
            try {
                gtuVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
