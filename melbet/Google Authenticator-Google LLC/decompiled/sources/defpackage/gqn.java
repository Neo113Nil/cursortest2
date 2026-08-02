package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqn implements gqc {
    public static final hkh a = hkh.l("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final hvm b;
    public final hvl c;
    public final gaj d;
    public final gqh e;
    public final Map f;
    public final hvi g;
    public final Object h = new Object();
    public final qi i;
    public final Map j;
    public final Map k;
    private final Context l;
    private final gzp m;
    private final boolean n;
    private final Map o;
    private final boolean p;
    private final gqu q;
    private final gzp r;
    private final String s;
    private final AtomicReference t;
    private final grq u;
    private final fwm v;

    public gqn(Context context, hvm hvmVar, hvl hvlVar, fwm fwmVar, gaj gajVar, gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gqh gqhVar, Map map, Map map2, Map map3, grq grqVar, gqu gquVar, gzp gzpVar4, Map map4, gzp gzpVar5) {
        qi qiVar = new qi();
        this.i = qiVar;
        this.j = new qi();
        this.k = new qi();
        this.t = new AtomicReference();
        this.l = context;
        this.b = hvmVar;
        this.c = hvlVar;
        this.v = fwmVar;
        this.d = gajVar;
        this.m = gzpVar;
        this.n = ((Boolean) gzpVar2.d((Boolean) gzpVar3.d(false))).booleanValue();
        this.e = gqhVar;
        this.f = map3;
        this.u = grqVar;
        this.o = map4;
        this.p = ((Boolean) gzpVar5.d(false)).booleanValue();
        hoq.I(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.g = gqhVar.c();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            gpt a2 = gpt.a((String) entry.getKey());
            jkj k = gsc.a.k();
            gsb gsbVar = a2.a;
            if (!k.b.M()) {
                k.t();
            }
            gsc gscVar = (gsc) k.b;
            gsbVar.getClass();
            gscVar.c = gsbVar;
            gscVar.b |= 1;
            p(new gqs((gsc) k.q()), entry, hashMap);
        }
        qiVar.putAll(hashMap);
        this.q = gquVar;
        this.r = gzpVar4;
        this.s = hoq.aT();
    }

    public static /* synthetic */ void j(hvi hviVar) {
        try {
            hnu.aR(hviVar);
        } catch (CancellationException e) {
            ((hkf) ((hkf) ((hkf) a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 698, "SyncManagerImpl.java")).s("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((hkf) ((hkf) ((hkf) a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 696, "SyncManagerImpl.java")).s("Error scheduling next sync wakeup");
        }
    }

    public static /* synthetic */ void k(hvi hviVar) {
        try {
            hnu.aR(hviVar);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 799, "SyncManagerImpl.java")).s("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((hkf) ((hkf) ((hkf) a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 803, "SyncManagerImpl.java")).s("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final hvi n() {
        return hoq.at(((fwm) ((gzs) this.m).a).h(), new fxn(14), this.b);
    }

    private final hvi o() {
        hvw hvwVar = new hvw();
        AtomicReference atomicReference = this.t;
        if (a.j(atomicReference, hvwVar)) {
            hvwVar.q(hoq.at(n(), new gia(this, 19), this.b));
        }
        return hnu.aK((hvi) atomicReference.get());
    }

    private static final void p(gqs gqsVar, Map.Entry entry, Map map) {
        try {
            gpv gpvVar = (gpv) ((koe) entry.getValue()).b();
            if (gpvVar.b) {
                map.put(gqsVar, gpvVar);
            }
        } catch (RuntimeException e) {
            ((hkf) ((hkf) ((hkf) a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 915, "SyncManagerImpl.java")).u("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new igk(igj.a, entry.getKey()));
        }
    }

    @Override // defpackage.gqc
    public final hvi a() {
        ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 600, "SyncManagerImpl.java")).s("#poke(). Scheduling workers.");
        return this.u.a(f(hnu.aJ(hjb.a)), new gcs(3));
    }

    @Override // defpackage.gqc
    public final hvi b() {
        ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 200, "SyncManagerImpl.java")).s("#sync(). Running Synclets and scheduling next sync.");
        long epochMilli = Instant.now().toEpochMilli();
        gqh gqhVar = this.e;
        hvi a2 = this.u.a(hoq.ax(gqhVar.c.submit(gvx.i(new gqg(gqhVar, epochMilli, 0))), new fxs(this, 15), this.b), new gcs(4));
        a2.c(new cov(8), huf.a);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ hvi c(hvi hviVar, Map map) {
        Throwable th;
        boolean z;
        gpv gpvVar;
        try {
            z = ((Boolean) hnu.aR(hviVar)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            z = false;
        }
        Throwable th2 = th;
        if (!z) {
            ((hkf) ((hkf) ((hkf) a.g()).h(th2)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", (char) 346, "SyncManagerImpl.java")).s("Failed preparing sync datastore for sync. Aborting sync attempt.");
            long epochMilli = Instant.now().toEpochMilli();
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(this.e.d((gqs) it.next(), epochMilli, false));
            }
            return hoq.aw(hnu.aG(arrayList), new gnq(this, map, 5), this.b);
        }
        hoq.H(o().isDone());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            gqs gqsVar = (gqs) entry.getKey();
            gqm gqmVar = (gqm) entry.getValue();
            hvw hvwVar = gqmVar.a;
            StringBuilder sb = new StringBuilder("Synclet: ");
            sb.append(gqsVar.b.b());
            if (gqsVar.a()) {
                sb.append(" ");
                sb.append(gqsVar.c.a);
            }
            guc gucVar = gub.a;
            try {
                gzp gzpVar = this.r;
                if (gzpVar.f()) {
                    gucVar = ((gpw) gzpVar.b()).a();
                }
            } catch (RuntimeException e2) {
                ((hkf) ((hkf) ((hkf) a.g()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "startSyncletRunSpan", (char) 542, "SyncManagerImpl.java")).s("Failed to get SpanExtras for synclet");
            }
            if (gqsVar.a()) {
                gua c = gucVar.c();
                frw.a(c, gqsVar.c);
                gucVar = ((guc) c).f();
            }
            gty aB = hoq.aB(207, sb.toString(), gucVar, true);
            try {
                synchronized (this.h) {
                    gpvVar = (gpv) this.i.get(gqsVar);
                }
                if (gpvVar == null) {
                    hvwVar.cancel(false);
                } else {
                    cap capVar = new cap(this, gqsVar, gpvVar, 17, null);
                    grq l = gqsVar.a() ? ((gql) hnu.bq(this.l, gql.class, gqsVar.c)).l() : this.u;
                    gpt gptVar = gqsVar.b;
                    ikj ikjVar = new ikj(gqmVar.b, Duration.ofMillis(gpvVar.a().a));
                    Set b = ((jsd) l.a).b();
                    hfk i = hfm.i(b.size());
                    Iterator it2 = b.iterator();
                    while (it2.hasNext()) {
                        i.c(new grp((ldt) it2.next(), gptVar, ikjVar));
                    }
                    hvi m = l.b.m(capVar, i.g());
                    gaj.d(210, m, "Synclet sync() failed for synckey: %s", new igk(igj.a, gptVar));
                    hvwVar.q(m);
                }
                cap capVar2 = new cap(this, (hvi) hvwVar, gqsVar, 16);
                hvm hvmVar = this.b;
                hvi ax = hoq.ax(hvwVar, capVar2, hvmVar);
                ax.c(new gbm(this, gqsVar, ax, 9), hvmVar);
                aB.b(ax);
                aB.close();
                arrayList2.add(ax);
            } finally {
            }
        }
        return hti.f(hnu.aO(arrayList2), new fxn(12), huf.a);
    }

    public final /* synthetic */ hvi d(hvi hviVar, gqs gqsVar) {
        int i = 1;
        boolean z = false;
        try {
            hnu.aR(hviVar);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 484, "SyncManagerImpl.java")).u("Sync cancelled from timeout and will be retried later: %s", gqsVar.b.b());
            }
        }
        long epochMilli = Instant.now().toEpochMilli();
        return hoq.aw(this.e.d(gqsVar, epochMilli, z), new grl(epochMilli, i), this.b);
    }

    public final hvi e() {
        ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 739, "SyncManagerImpl.java")).s("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
        hvi h = h(n());
        gqh gqhVar = this.e;
        hvi submit = gqhVar.c.submit(gvx.i(new gqe(gqhVar, 0)));
        brn aX = hoq.aX(h, submit);
        cap capVar = new cap(this, h, submit, 18);
        hvm hvmVar = this.b;
        hvi t = aX.t(capVar, hvmVar);
        if (!this.n) {
            this.t.set(t);
        }
        hvi aQ = hnu.aQ(t, 10L, TimeUnit.SECONDS, hvmVar);
        hvj hvjVar = new hvj(gvx.h(new gfm(aQ, 11)));
        aQ.c(hvjVar, huf.a);
        return hvjVar;
    }

    public final hvi f(hvi hviVar) {
        byte[] bArr = null;
        if (this.n) {
            return hnu.aW(hviVar, hnu.aK(hnu.aW(hviVar, this.g, o()).b(gvx.b(new gib(this, hviVar, 9, bArr)), this.c))).a(gvx.i(new bws(11)), huf.a);
        }
        hvi hviVar2 = this.g;
        gja gjaVar = new gja(this, hviVar, 5, bArr);
        hvm hvmVar = this.b;
        hvi aK = hnu.aK(hoq.au(hviVar2, gjaVar, hvmVar));
        this.d.b(aK, "SyncManager: Scheduling in parallel");
        aK.c(new gfm(aK, 12), hvmVar);
        return hti.f(hviVar, gvx.a(new fxn(16)), huf.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Set] */
    public final hvi g(hvi hviVar, long j) {
        HashMap hashMap;
        hjb hjbVar = hjb.a;
        try {
            hjbVar = (Set) hnu.aR(hviVar);
        } catch (CancellationException | ExecutionException e) {
            ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 681, "SyncManagerImpl.java")).s("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
        }
        synchronized (this.h) {
            hashMap = new HashMap(this.i);
        }
        Collection.EL.removeIf(hashMap.entrySet(), new gqj(this, 0));
        return hoq.au(this.q.a(hjbVar, j, hashMap), new gja(this, hashMap, 4, null), huf.a);
    }

    public final hvi h(hvi hviVar) {
        return hoq.au(o(), new gjt(hviVar, 4), huf.a);
    }

    public final void i(Set set) {
        synchronized (this.h) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                frv frvVar = (frv) it.next();
                qi qiVar = this.i;
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((her) ((gqk) hnu.bq(this.l, gqk.class, frvVar)).e()).entrySet()) {
                    gpt a2 = gpt.a((String) entry.getKey());
                    int i = frvVar.a;
                    jkj k = gsc.a.k();
                    gsb gsbVar = a2.a;
                    if (!k.b.M()) {
                        k.t();
                    }
                    jkp jkpVar = k.b;
                    gsc gscVar = (gsc) jkpVar;
                    gsbVar.getClass();
                    gscVar.c = gsbVar;
                    gscVar.b |= 1;
                    if (!jkpVar.M()) {
                        k.t();
                    }
                    gsc gscVar2 = (gsc) k.b;
                    gscVar2.b |= 2;
                    gscVar2.d = i;
                    p(new gqs((gsc) k.q()), entry, hashMap);
                }
                qiVar.putAll(hashMap);
            }
        }
    }

    public final /* synthetic */ void l(gqs gqsVar, hvi hviVar) {
        synchronized (this.h) {
            try {
                this.k.put(gqsVar, (Long) hnu.aR(hviVar));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final boolean m(Map.Entry entry) {
        if (!this.p) {
            return this.v.l();
        }
        if (((gpv) entry.getValue()).a().d) {
            return true;
        }
        Set set = (Set) ((koe) Map.EL.getOrDefault(this.o, ((gqs) entry.getKey()).b.b(), new eig(12))).b();
        hoq.y(Collection.EL.stream(set).noneMatch(new eoe(3)), "Custom override processes should not start with ':'. Correct example: 'custom_process' or '' for the Android default process");
        return set.isEmpty() ? this.v.l() : set.contains(this.s);
    }
}
