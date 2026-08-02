package defpackage;

import android.content.BroadcastReceiver;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gfm implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gfm(gtp gtpVar, int i) {
        this.b = i;
        this.a = gtpVar;
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r1v27, types: [ggs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v35, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v48, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v49, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v70, types: [java.lang.AutoCloseable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                gfo gfoVar = (gfo) this.a;
                hjr it = gfoVar.b.values().iterator();
                while (it.hasNext()) {
                    gfoVar.d((hrz) it.next());
                }
                return;
            case 1:
                fao.c();
                gfo gfoVar2 = (gfo) this.a;
                hoq.I(gfoVar2.h == 1, "Duplicate or leaked callback task.");
                int i = hel.d;
                heg hegVar = new heg(4);
                gfoVar2.h = 2;
                Set set = gfoVar2.f;
                qj qjVar = new qj((qk) set);
                while (qjVar.hasNext()) {
                    hrz hrzVar = (hrz) qjVar.next();
                    fao.c();
                    Object obj = hrzVar.a;
                    obj.getClass();
                    hoq.I(((gfp) obj).c.f(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
                    gfp gfpVar = (gfp) hrzVar.a;
                    hrzVar.a = gfpVar.a((gft) gfpVar.c.b());
                    hegVar.h(new gfn((gex) ((hir) gfoVar2.b).d.get(hrzVar), (gft) ((gfp) hrzVar.a).d.b()));
                }
                set.clear();
                hel g = hegVar.g();
                int i2 = ((his) g).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    gfn gfnVar = (gfn) g.get(i3);
                    try {
                        gfo.a(gfnVar.a, gfnVar.b);
                    } catch (Throwable th) {
                        gfoVar2.c.execute(gvx.h(new fnh(th, 20)));
                    }
                }
                return;
            case 2:
                gfo gfoVar3 = (gfo) this.a;
                gfoVar3.h = 3;
                qj qjVar2 = new qj((qk) gfoVar3.g);
                while (qjVar2.hasNext()) {
                    ((hvi) qjVar2.next()).cancel(false);
                }
                gfoVar3.g = null;
                return;
            case 3:
                ((gfu) this.a).b();
                return;
            case 4:
                Object obj2 = this.a;
                try {
                    if (((Optional) ((jrx) ((fym) obj2).d).a).isPresent()) {
                        final fym fymVar = (fym) obj2;
                        ((etd) ((fym) obj2).a).h.a(iac.TIKTOK, new evq() { // from class: ghq
                            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
                            @Override // defpackage.evq
                            public final boolean a(List list) {
                                fym fymVar2;
                                list.getClass();
                                ArrayList<String> arrayList = new ArrayList();
                                Iterator it2 = list.iterator();
                                while (true) {
                                    fymVar2 = fym.this;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    Object obj3 = fymVar2.e;
                                    ((String) next).getClass();
                                    ((cfe) obj3).c();
                                    arrayList.add(next);
                                }
                                if (arrayList.isEmpty()) {
                                    return false;
                                }
                                for (String str : arrayList) {
                                    Object obj4 = fymVar2.c;
                                    str.getClass();
                                    if (((cfe) obj4).a.contains(str)) {
                                        return true;
                                    }
                                }
                                return false;
                            }
                        });
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ((hkf) ((hkf) ((hkh) ((fym) obj2).b.a()).f()).h(th2).i("com/google/apps/tiktok/experiments/phenotype/PackageChangedListener", "maybeRegisterListener$<anonymous>", 42, "PackageChangedListener.kt")).s("Failed to register flag update listener");
                    return;
                }
            case 5:
                for (iwq iwqVar : ((giq) this.a).d.values()) {
                    if (iwqVar.i()) {
                        fao.c();
                        for (ghn ghnVar : iwqVar.a.values()) {
                            if (ghnVar.d()) {
                                try {
                                    ghh ghhVar = (ghh) hnu.aR(ghnVar.q.c());
                                    ghhVar.c();
                                    ghm b = ghhVar.b();
                                    hnu.bw(ghnVar.m.b().b(b.a, b.c), "Failed to commit to config");
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e.getCause());
                                }
                            }
                        }
                    }
                }
                return;
            case 6:
                ((giq) this.a).a = false;
                return;
            case 7:
                Object obj3 = this.a;
                if (gta.u()) {
                    ((gjl) obj3).a(false);
                    return;
                }
                gtt f = ((gva) ((gjl) obj3).j.b()).f("StartupAfterPackageReplacedUnlock", 183);
                try {
                    ((gjl) obj3).a(false);
                    ixf.j(f, null);
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ixf.j(f, th3);
                        throw th4;
                    }
                }
            case 8:
                ?? r7 = this.a;
                if (r7.isCancelled()) {
                    return;
                }
                fao.e(gvx.h(new gfm((Object) r7, 9)));
                return;
            case 9:
                try {
                    hnu.aR(this.a);
                    return;
                } catch (ExecutionException e2) {
                    if (e2.getCause() instanceof fvb) {
                        ((hkf) ((hkf) ((hkf) gon.a.f()).h(e2)).i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "crashOnException", (char) 300, "IntentFilterAcledReceiver.java")).s("Got unexpected accountId. Was the account removed?");
                        return;
                    }
                    if (!(e2.getCause() instanceof TimeoutException)) {
                        gwd.k(e2.getCause());
                        return;
                    }
                    Throwable cause = e2.getCause();
                    int i4 = gwd.a;
                    gsv.b(cause);
                    guq b2 = gta.b();
                    gwd gwdVar = new gwd(cause, gwd.l(b2, null));
                    gwd.i(b2, gwdVar);
                    gwd.g(b2, gwdVar);
                    throw gwdVar;
                } catch (Throwable th5) {
                    gwd.k(th5);
                    return;
                }
            case 10:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 11:
                gqn.k(this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                gqn.j(this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((gsh) this.a).a = null;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                ((gwl) this.a).g.cancel(false);
                return;
            case 16:
                Object obj4 = this.a;
                HashMap hashMap = gvx.b;
                synchronized (hashMap) {
                }
                return;
            case 17:
                Object obj5 = ((gsg) this.a).a;
                synchronized (gvx.c) {
                    if (ksp.b(gvx.d, obj5)) {
                        gvx.d = null;
                    }
                }
                return;
            case 18:
                ((Future) ((AtomicReference) this.a).get()).cancel(false);
                return;
            case 19:
                hvh hvhVar = htz.a;
                try {
                    this.a.close();
                    return;
                } catch (Exception e3) {
                    hnu.az(e3);
                    htz.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e3);
                    return;
                }
            default:
                Object obj6 = this.a;
                hty htyVar = hty.c;
                hty htyVar2 = hty.d;
                htx htxVar = (htx) obj6;
                htxVar.b(htyVar, htyVar2);
                htxVar.c();
                htxVar.b(htyVar2, hty.e);
                return;
        }
        while (true) {
            try {
                try {
                    Object obj7 = this.a;
                    if (((gtp) obj7).c.isShutdown()) {
                        try {
                            ((gtp) this.a).c.execute(this);
                            return;
                        } catch (RejectedExecutionException e4) {
                            Iterator it2 = gtp.a.keySet().iterator();
                            while (it2.hasNext()) {
                                ((gto) it2.next()).a.p(e4);
                            }
                            return;
                        }
                    }
                    gtn gtnVar = ((gto) ((gtp) obj7).b.remove()).a;
                    int i5 = gtn.b;
                    gtnVar.o(null);
                } catch (RejectedExecutionException e5) {
                    Iterator it3 = gtp.a.keySet().iterator();
                    while (it3.hasNext()) {
                        ((gto) it3.next()).a.p(e5);
                    }
                    return;
                }
            } catch (InterruptedException unused) {
                ((gtp) this.a).c.execute(this);
                return;
            } catch (Throwable th6) {
                try {
                    ((gtp) this.a).c.execute(this);
                    throw th6;
                } catch (RejectedExecutionException e6) {
                    Iterator it4 = gtp.a.keySet().iterator();
                    while (it4.hasNext()) {
                        ((gto) it4.next()).a.p(e6);
                    }
                    throw th6;
                }
            }
        }
    }

    public /* synthetic */ gfm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
