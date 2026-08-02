package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ghf(Optional optional, ScheduledExecutorService scheduledExecutorService, iwq iwqVar, iwq iwqVar2, Map map, etp etpVar, cfe cfeVar, etd etdVar) {
        optional.getClass();
        scheduledExecutorService.getClass();
        iwqVar.getClass();
        iwqVar2.getClass();
        map.getClass();
        etdVar.getClass();
        this.a = optional;
        this.b = scheduledExecutorService;
        this.g = iwqVar;
        this.h = iwqVar2;
        this.c = map;
        this.d = etpVar;
        this.e = cfeVar;
        this.f = etdVar;
    }

    public static jxu e(fun funVar, Set set) {
        hvi aI;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                aI = ((fup) it.next()).a(funVar);
                arrayList.add(aI);
            } catch (Exception e) {
                aI = hnu.aI(e);
            }
            gaj.d(104, aI, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return hnu.aV(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final String f(Class cls) {
        String str = (String) this.c.get(cls);
        cls.toString();
        str.getClass();
        return str;
    }

    private final void g(gca gcaVar, ate ateVar) {
        hjr it = gcaVar.i.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            ateVar.d.add(str);
        }
        gzp gzpVar = gcaVar.j;
        if (gzpVar.f()) {
            gzp gzpVar2 = gcaVar.k;
            if (gzpVar2.f()) {
                gby gbyVar = (gby) gzpVar2.b();
                long j = gbyVar.a;
                TimeUnit timeUnit = gbyVar.b;
                Object b = gzpVar.b();
                ateVar.a = true;
                axt axtVar = ateVar.c;
                axtVar.m = (art) b;
                long millis = timeUnit.toMillis(j);
                if (millis > 18000000) {
                    asq.a().e(axt.a, "Backoff delay duration exceeds maximum value");
                }
                if (millis < 10000) {
                    asq.a().e(axt.a, "Backoff delay duration less than minimum value");
                }
                axtVar.n = ksl.j(millis, 10000L, 18000000L);
            }
        }
        gzp gzpVar3 = gcaVar.e;
        if (gzpVar3.f() && (ateVar instanceof asy)) {
            asy asyVar = (asy) ateVar;
            long longValue = ((Long) gzpVar3.b()).longValue();
            if (longValue == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            axt axtVar2 = asyVar.c;
            axtVar2.u = longValue;
            axtVar2.v = 1;
        }
        brn brnVar = new brn((char[]) null, (char[]) null);
        brnVar.y(gcaVar.f);
        gzp gzpVar4 = gcaVar.l;
        if (gzpVar4.f()) {
            ComponentName componentName = (ComponentName) ((Map) ((gzs) this.a).a).get(gzpVar4.b());
            brnVar.A("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            brnVar.A("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        ateVar.d(brnVar.x());
        String f = f(gcaVar.a);
        int length = f.length();
        Pattern pattern = gcv.a;
        ateVar.c.x = "TikTokWorker#".concat(String.valueOf(f.substring(Math.max(0, length - 114))));
    }

    private final bvw h(gca gcaVar, gby gbyVar) {
        hoq.H(gcaVar.g.f());
        asy asyVar = new asy(TikTokListenableWorker.class, gbyVar.a, gbyVar.b);
        g(gcaVar, asyVar);
        asyVar.b(gcaVar.b);
        gby gbyVar2 = gcaVar.d;
        asyVar.c(gbyVar2.a, gbyVar2.b);
        return asyVar.e();
    }

    private final bvw i(gca gcaVar) {
        hoq.H(!gcaVar.g.f());
        asr asrVar = new asr(TikTokListenableWorker.class);
        asrVar.b(gcaVar.b);
        gby gbyVar = gcaVar.d;
        asrVar.c(gbyVar.a, gbyVar.b);
        asrVar.d(gcaVar.f);
        g(gcaVar, asrVar);
        return asrVar.e();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [etp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final hvi a(String str, boolean z) {
        str.getClass();
        guc gucVar = gub.a;
        gty aB = hoq.aB(156, "Fetching experiments for device", gucVar, true);
        try {
            aB = hoq.aB(157, "PhenotypeApi.getConfigurationSnapshot", gucVar, true);
            try {
                hvi c = this.d.c(str, "");
                if (z) {
                    c = gwd.a(c, 25L, TimeUnit.SECONDS, this.b);
                }
                aB.b(c);
                ixf.j(aB, null);
                hvi g = hti.g(c, gvx.c(new egl(this, str, 19)), huf.a);
                aB.b(g);
                ixf.j(aB, null);
                hvi d = ((etd) this.f).f.d(false);
                fyc fycVar = new fyc(new dvm(17), 16);
                huf hufVar = huf.a;
                return hti.f(hnu.bx(ixc.D(new hvi[]{hoq.ao(d, cnf.class, fycVar, hufVar), g})), gvx.a(new fyc(g, 15)), hufVar);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gce, java.lang.Object] */
    public final hvi b(UUID uuid) {
        return ((iyi) this.e).f(this.d.b(uuid), new gcs(0));
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [gce, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [gce, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gce, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [gce, java.lang.Object] */
    public final hvi c(gca gcaVar) {
        hvi f;
        int i;
        if (((Boolean) ((gzp) this.h).d(false)).booleanValue()) {
            return hnu.aI(new RuntimeException("Worker enqueueing is disabled."));
        }
        hfm hfmVar = gcaVar.i;
        Pattern pattern = gcv.a;
        hjr it = hfmVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (gcv.a.matcher(str).matches()) {
                throw new gck("Tag " + str + " is reserved by AccountWorkManager.");
            }
        }
        hjr it2 = hfmVar.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (gcv.b.matcher(str2).matches()) {
                throw new gck("Tag " + str2 + " is reserved by TikTokWorkManager.");
            }
        }
        gzp gzpVar = gcaVar.l;
        int i2 = 1;
        if (gzpVar.f()) {
            hoq.I(!((String) gzpVar.b()).equals(((Context) this.f).getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
            hoq.I(((gzp) this.g).f(), "You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
            hoq.K(((Map) ((gzs) this.a).a).containsKey(gzpVar.b()), "You must generate remote worker services using java/com/google/apps/tiktok/contrib/work/codegen/generated_remote_worker_service.bzl before targeting them by process name and include the service target in every scheduling process's dagger deps. Could not find [%s]", gzpVar.b());
            hoq.y(Collections.disjoint(gcaVar.f.a().keySet(), hfm.q("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME")), "You may not specify RemoteListenableWorker arguments at the same time as TikTok's targetProcess feature.");
        }
        hjn hjnVar = new hjn("TikTokWorker#".concat(f(gcaVar.a)));
        gbw gbwVar = new gbw(gcaVar);
        hfmVar.getClass();
        gbwVar.d(new hjg(hfmVar, hjnVar));
        gca a = gbwVar.a();
        Object obj = this.e;
        gzp gzpVar2 = a.g;
        if (gzpVar2.f()) {
            hoq.H(gzpVar2.f());
            gzp gzpVar3 = a.h;
            if (gzpVar3.f()) {
                hoq.H(gzpVar2.f());
                hoq.H(gzpVar3.f());
                gby gbyVar = ((gbx) gzpVar2.b()).a;
                gzpVar2.b();
                bvw h = h(a, gbyVar);
                f = hti.f(this.d.e(((gbz) gzpVar3.b()).a, ((gbz) gzpVar3.b()).b, h), new fyc(h, 5), huf.a);
            } else {
                hoq.H(gzpVar2.f());
                hoq.H(!gzpVar3.f());
                gby gbyVar2 = ((gbx) gzpVar2.b()).a;
                gzpVar2.b();
                bvw h2 = h(a, gbyVar2);
                f = hti.f(this.d.d(h2), new fyc(h2, 6), huf.a);
            }
        } else {
            hoq.H(!gzpVar2.f());
            gzp gzpVar4 = a.h;
            if (gzpVar4.f()) {
                hoq.H(!gzpVar2.f());
                hoq.H(gzpVar4.f());
                bvw i3 = i(a);
                ?? r6 = this.d;
                String str3 = ((gbz) gzpVar4.b()).a;
                int i4 = ((gbz) gzpVar4.b()).b - 1;
                if (i4 == 0) {
                    i = 1;
                } else {
                    if (i4 != 1) {
                        throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
                    }
                    i = 2;
                }
                f = hti.f(r6.f(str3, i, i3), new fyc(i3, 3), huf.a);
            } else {
                hoq.H(!gzpVar2.f());
                hoq.H(!gzpVar4.f());
                bvw i5 = i(a);
                f = hti.f(this.d.d(i5), new fyc(i5, 4), huf.a);
            }
        }
        return ((iyi) obj).f(f, new gcs(i2));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gce, java.lang.Object] */
    public final hvi d(String str) {
        return hti.f(this.d.g(new brn(ixc.L(new String[]{str}), (char[]) null)), new fxn(6), this.b);
    }

    public ghf(iyi iyiVar, hvl hvlVar, hvl hvlVar2, koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4, koe koeVar5) {
        this.f = iyiVar;
        this.d = hvlVar;
        this.e = hvlVar2;
        this.c = koeVar;
        this.a = koeVar2;
        this.b = koeVar5;
        this.g = koeVar3;
        this.h = koeVar4;
    }

    public ghf(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8) {
        this.d = jsbVar;
        this.g = jsbVar2;
        this.a = jsbVar3;
        this.c = jsbVar4;
        this.f = jsbVar5;
        this.e = jsbVar6;
        this.h = jsbVar7;
        this.b = jsbVar8;
    }

    public ghf(Context context, gce gceVar, Map map, Executor executor, gzp gzpVar, gzp gzpVar2, iyi iyiVar, gzp gzpVar3) {
        this.f = context;
        this.d = gceVar;
        this.c = map;
        this.b = executor;
        this.a = gzpVar;
        this.g = gzpVar2;
        this.e = iyiVar;
        this.h = gzpVar3;
    }
}
