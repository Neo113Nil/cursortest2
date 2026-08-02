package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpy implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public bpy(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                Context b = ((jrk) this.a).b();
                return new bpx(b);
            case 1:
                return new bou(((jrk) this.a).b(), (cji) this.b.b());
            case 2:
                gpl a = gpm.a();
                a.a = "how_it_works_proto_data_store";
                a.d(bsj.a);
                return ((gpn) this.b).b().b(a.a(), (iyi) this.a.b());
            case 3:
                gpl a2 = gpm.a();
                a2.a = "LoginRequirement";
                a2.d(btj.a);
                return ((fxu) this.b).b().m(a2.a(), (iyi) this.a.b());
            case 4:
                gpl a3 = gpm.a();
                a3.a = "first_time_consent";
                a3.d(bti.a);
                return ((gpn) this.b).b().b(a3.a(), (iyi) this.a.b());
            case 5:
                gpl a4 = gpm.a();
                a4.a = "syncing_icon_proto_data_store";
                a4.d(bxd.a);
                return ((fxu) this.b).b().m(a4.a(), (iyi) this.a.b());
            case 6:
                gpl a5 = gpm.a();
                a5.a = "staged_migration_data_store";
                a5.d(caf.a);
                return ((gpn) this.b).b().b(a5.a(), (iyi) this.a.b());
            case 7:
                gpl a6 = gpm.a();
                a6.a = "database_migration_proto_data_store";
                a6.d(cbf.a);
                return ((gpn) this.b).b().b(a6.a(), (iyi) this.a.b());
            case 8:
                Context b2 = ((jrk) this.a).b();
                hvl hvlVar = (hvl) this.b.b();
                dev a7 = deu.a.a(b2);
                dfl dflVar = dfl.a;
                hvlVar.getClass();
                fym fymVar = dfl.b;
                if (fymVar == null) {
                    synchronized (dflVar) {
                        fymVar = dfl.b;
                        if (fymVar == null) {
                            fcy fcyVar = fcy.a;
                            HashMap hashMap = new HashMap();
                            iyi iyiVar = new iyi(ixc.b(new fat(new gwh(b2.getApplicationContext(), (byte[]) null))));
                            exf.n(fcp.a, hashMap);
                            fym fymVar2 = new fym(hvlVar, iyiVar, fcyVar, hashMap);
                            dfl.b = fymVar2;
                            fymVar = fymVar2;
                        }
                    }
                }
                det detVar = new det(fymVar);
                det detVar2 = a7.h;
                if (detVar2 == null) {
                    a7.h = detVar;
                    a7.b.registerActivityLifecycleCallbacks((dey) a7.f.a());
                    afh.a.g.a((dfb) a7.g.a());
                    hnu.aS(a7.e().e(), new ckt(a7, 2), huf.a);
                    return a7;
                }
                if (ksp.b(detVar, detVar2)) {
                    return a7;
                }
                throw new IllegalStateException("PrivacyScreenConfig doesn't match previous call: " + detVar + " != " + a7.h);
            case 9:
                return new iyi((Context) ((jrx) this.b).a, ((cfa) this.a).b());
            case 10:
                return new cgp(cgb.a, ((cgt) this.a).b(), this.b);
            case 11:
                return new dgi(((dfp) this.a).a(), this.b);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jsb jsbVar = this.a;
                bst b3 = ((dfy) this.b).b();
                ThreadFactory threadFactory = (ThreadFactory) jsbVar.b();
                final hvw hvwVar = new hvw();
                b3.a(dja.d("Lite", new dgs(threadFactory, 0))).newThread(new Runnable() { // from class: dfr
                    @Override // java.lang.Runnable
                    public final void run() {
                        hvw hvwVar2 = hvw.this;
                        try {
                            Looper.prepare();
                            hvwVar2.o(Looper.myLooper());
                            Looper.loop();
                            if ("robolectric".equals(Build.FINGERPRINT)) {
                                return;
                            }
                            fao.e(new cov(2));
                        } catch (Throwable th) {
                            hvwVar2.o(Looper.myLooper());
                            throw th;
                        }
                    }
                }).start();
                try {
                    Looper looper = (Looper) a.n(hvwVar);
                    looper.getClass();
                    return looper;
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new dha(((dfz) this.a).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new dih();
            case 15:
                Set set = (Set) ((jrx) this.a).a;
                dlk dlkVar = (dlk) this.b.b();
                hln hlnVar = dlz.a;
                hfk hfkVar = new hfk();
                hfkVar.j(set);
                hfkVar.c(dlkVar.j);
                return new cka(hfkVar.g());
            case 16:
                return new fwm((Object) ((eie) this.a).b(), (Object) ((jrk) this.b).b(), (byte[]) null);
            case 17:
                return new dzq(((dzt) this.a).b(), new dzr(), (ExecutorService) this.b.b());
            case 18:
                SharedPreferences sharedPreferences = (SharedPreferences) ((hac) ((jri) this.a).a().d(new efm(((jrk) this.b).b(), 19))).bB();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 19:
                if (!fao.g()) {
                    emg emgVar = (emg) this.b.b();
                    if (!emg.b()) {
                        hkf hkfVar = (hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                        Object obj = emgVar.a;
                        hkfVar.u("Primes init triggered from background in package: %s", obj);
                        if (!emgVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", obj));
                        }
                    }
                }
                return new eim(((eip) this.a).b());
            default:
                eiv eivVar = (eiv) this.a.b();
                hvm hvmVar = eivVar.a;
                cbp b4 = ((dgm) this.b).b();
                if (hvmVar == null) {
                    int i = eivVar.c;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new eit(eivVar.b), new eis());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                    hvmVar = b4.d(hnu.aC(scheduledThreadPoolExecutor));
                }
                hvmVar.getClass();
                return hvmVar;
        }
    }

    public bpy(jsb jsbVar, jsb jsbVar2, int i, char[] cArr) {
        this.c = i;
        this.b = jsbVar;
        this.a = jsbVar2;
    }
}
