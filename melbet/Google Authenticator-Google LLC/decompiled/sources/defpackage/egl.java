package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class egl implements htr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ egl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v25, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v35, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [hvl, java.lang.Object] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        hvi g;
        hvi f;
        int i = 9;
        int i2 = 14;
        int i3 = 1;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj2 = this.a;
                    if (!it.hasNext()) {
                        final ekx ekxVar = (ekx) obj2;
                        return hoq.aU(arrayList).s(new Callable() { // from class: egk
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r7v0 */
                            /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r7v9 */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                boolean z;
                                boolean z2;
                                ikc ikcVar;
                                List list2 = list;
                                int size = list2.size();
                                heg d = hel.d(size);
                                ekx ekxVar2 = ekx.this;
                                ?? r7 = 0;
                                int i4 = 0;
                                while (i4 < size) {
                                    List list3 = arrayList;
                                    efz a = ega.a();
                                    a.b(((Account) list2.get(i4)).name);
                                    hvi hviVar = (hvi) list3.get(i4);
                                    hoq.H(hviVar.isDone());
                                    try {
                                        try {
                                            int i5 = hvb.a;
                                            int i6 = hva.a;
                                            Iterator it2 = huz.b.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    hoq.C(!RuntimeException.class.isAssignableFrom(MdiOwnersLoader$MdiException.class), "Futures.getChecked exception type (%s) must not be a RuntimeException", MdiOwnersLoader$MdiException.class);
                                                    try {
                                                        hvb.a(MdiOwnersLoader$MdiException.class, new Exception());
                                                        z2 = true;
                                                    } catch (Throwable unused) {
                                                        z2 = r7;
                                                    }
                                                    hoq.C(z2, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", MdiOwnersLoader$MdiException.class);
                                                    Set set = huz.b;
                                                    if (set.size() > 1000) {
                                                        set.clear();
                                                    }
                                                    set.add(new WeakReference(MdiOwnersLoader$MdiException.class));
                                                } else if (MdiOwnersLoader$MdiException.class.equals(((WeakReference) it2.next()).get())) {
                                                    break;
                                                }
                                            }
                                            try {
                                                ikcVar = (ikc) hviVar.get();
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                                throw hvb.a(MdiOwnersLoader$MdiException.class, e);
                                            } catch (ExecutionException e2) {
                                                Throwable cause = e2.getCause();
                                                if (cause instanceof Error) {
                                                    throw new huh((Error) cause);
                                                }
                                                if (cause instanceof RuntimeException) {
                                                    throw new hwe(cause);
                                                }
                                                throw hvb.a(MdiOwnersLoader$MdiException.class, cause);
                                            }
                                        } catch (Throwable th) {
                                            ((fwm) ((gzs) ekxVar2.a).a).v("OK", (String) ekxVar2.d);
                                            throw th;
                                        }
                                    } catch (MdiOwnersLoader$MdiException | hwe e3) {
                                        Throwable cause2 = e3.getCause();
                                        String aj = dih.aj(cause2);
                                        cmm cmmVar = (cmm) dih.ak(cause2, cmm.class);
                                        if (cmmVar != null) {
                                            int a2 = cmmVar.a();
                                            aj = a.Y(a2, "ApiException-");
                                            if (a2 == 17) {
                                                throw new ExecutionException(new MdiNotAvailableException$ApiNotConnectedException(cause2));
                                            }
                                            if (a2 == 10) {
                                                throw new ExecutionException(new MdiNotAvailableException$DeveloperErrorException(cause2));
                                            }
                                        }
                                        z = false;
                                        Log.w("OneGoogle", String.format("Failed to load profile data. exception: %s", aj));
                                        ((fwm) ((gzs) ekxVar2.a).a).v(aj, (String) ekxVar2.d);
                                    }
                                    if (ikcVar == null) {
                                        a.e(r7);
                                        ((fwm) ((gzs) ekxVar2.a).a).v("Absent", (String) ekxVar2.d);
                                    } else if (ikcVar.b.size() <= 0) {
                                        Log.w("OneGoogle", "GetPeopleResponse contains no persons");
                                        ((fwm) ((gzs) ekxVar2.a).a).v("NoPerson", (String) ekxVar2.d);
                                    } else {
                                        frq frqVar = ((ikd) ikcVar.b.get(r7)).b;
                                        if (frqVar == null) {
                                            frqVar = frq.a;
                                        }
                                        if (frqVar.b.size() > 0) {
                                            fru fruVar = (fru) frqVar.b.get(r7);
                                            a.d = fruVar.c;
                                            jkt jktVar = fruVar.d;
                                            jku jkuVar = fru.a;
                                            a.d(new jkv(jktVar, jkuVar).contains(frs.GOOGLE_ONE_USER));
                                            a.g = true != new jkv(fruVar.d, jkuVar).contains(frs.GOOGLE_FAMILY_CHILD_USER) ? 3 : 2;
                                            a.c(true != new jkv(fruVar.d, jkuVar).contains(frs.GOOGLE_APPS_USER) ? 3 : 2);
                                        }
                                        if (frqVar.c.size() > 0) {
                                            frp frpVar = (frp) frqVar.c.get(0);
                                            int i7 = frpVar.b;
                                            a.a = (i7 & 2) != 0 ? frpVar.c : null;
                                            a.b = (i7 & 64) != 0 ? frpVar.d : null;
                                            a.c = (i7 & 128) != 0 ? frpVar.e : null;
                                        }
                                        frt m = dih.m(ikcVar);
                                        if (m != null) {
                                            if (m.e) {
                                                a.f = m.d;
                                            } else {
                                                a.e = m.d;
                                            }
                                        }
                                        if (frqVar.e.size() == 1) {
                                            int a3 = frn.a(((fro) frqVar.e.get(0)).b);
                                            if (a3 != 0 && a3 != 1) {
                                                int i8 = 2;
                                                if (a3 != 2) {
                                                    i8 = 4;
                                                    if (a3 == 4) {
                                                        a.h = 3;
                                                    }
                                                }
                                                a.h = i8;
                                            }
                                            a.h = 1;
                                        }
                                        ((fwm) ((gzs) ekxVar2.a).a).v("OK", (String) ekxVar2.d);
                                        z = false;
                                        d.h(a.a());
                                        i4++;
                                        r7 = z;
                                    }
                                    z = r7;
                                    d.h(a.a());
                                    i4++;
                                    r7 = z;
                                }
                                return d.g();
                            }
                        }, huf.a);
                    }
                    arrayList.add((hvi) this.b.a(((jdd) ((ekx) obj2).b).a((Account) it.next())));
                }
            case 1:
                egc egcVar = (egc) obj;
                ((AtomicReference) ((ehe) this.a).b).set(egcVar);
                return (hvi) this.b.a(egcVar);
            case 2:
                egp egpVar = (egp) this.a;
                egpVar.g((egi) obj);
                return (hvi) this.b.a(egpVar.a);
            case 3:
                jkl jklVar = (jkl) ((esd) obj).C();
                if (!jklVar.b.M()) {
                    jklVar.t();
                }
                Object obj3 = this.a;
                Object obj4 = this.b;
                esd esdVar = (esd) jklVar.b;
                obj4.getClass();
                esdVar.c = (lgv) obj4;
                esdVar.b |= 1;
                gka gkaVar = (gka) obj3;
                return ((ClearcutMetricSnapshotTransmitter) gkaVar.b).a((Context) gkaVar.c, (esd) jklVar.q());
            case 4:
                int i4 = ((etq) obj).a;
                if ((i4 == 29501 || i4 == 29537 || i4 == 29538 || i4 == 29539 || i4 == 29540 || i4 == 29541 || i4 == 29542 || i4 == 29543 || i4 == 29544 || i4 == 29547) && ((iwq) this.b).n()) {
                    ((evi) this.a).a();
                }
                return hve.a;
            case 5:
                int i5 = evo.a;
                int i6 = hel.d;
                heg hegVar = new heg(4);
                Context context = ((etd) this.a).c;
                hegVar.h(context);
                int i7 = djl.a;
                hegVar.h(djl.a(context));
                hel g2 = hegVar.g();
                int i8 = ((his) g2).c;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object obj5 = this.b;
                    File file = new File(String.valueOf(((Context) g2.get(i9)).getFilesDir()) + "/phenotype/shared/" + ((String) obj5));
                    if (file.exists()) {
                        i3 = evo.a(file) ? 1 : 0;
                    }
                }
                return i3 != 0 ? hve.a : hnu.aI(new IOException("Unable to remove snapshots for removed user"));
            case 6:
                evs evsVar = (evs) this.a;
                return ((etp) evsVar.a.bB()).f(new evr(evsVar, (evt) this.b));
            case 7:
                Object obj6 = this.a;
                return hti.g(this.b, gvx.c(new doj(obj6, i)), ((fcn) obj6).c);
            case 8:
                return hnu.aJ(((fcn) this.b).c((Uri) this.a));
            case 9:
                return hnu.aJ(((fcn) this.b).i((Uri) this.a));
            case 10:
                Object obj7 = this.a;
                fcr fcrVar = (fcr) obj7;
                fcrVar.c((Uri) hnu.aR(fcrVar.a), obj);
                Object obj8 = fcrVar.d;
                ?? r10 = this.b;
                synchronized (obj8) {
                    ((fcr) obj7).e = r10;
                }
                return hnu.aJ(obj);
            case 11:
                ?? r11 = this.b;
                ArrayList arrayList2 = new ArrayList(r11.size());
                Iterator it2 = r11.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new bwr((ftd) it2.next(), this.a, i, bArr));
                }
                int i10 = 8;
                bwt bwtVar = new bwt(i10);
                huf hufVar = huf.a;
                return hti.f(fhr.u(arrayList2, bwtVar, hufVar), gvx.a(new esh(i10)), hufVar);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Pair pair = (Pair) obj;
                Object obj9 = this.b;
                Object obj10 = this.a;
                gty aC = hoq.aC(89, "AccountUiService handle selection result");
                if (pair != null) {
                    try {
                        if (pair.first instanceof fze) {
                            Intent intent = (Intent) pair.second;
                            g = hti.f(hnu.aJ(intent), gvx.a(new euy(obj10, 12)), huf.a);
                            aC.b(g);
                        } else if (pair.first instanceof fth) {
                            frv frvVar = (frv) pair.second;
                            g = hti.g(((fto) obj9).b.f(frvVar), gvx.c(new evv((fto) obj9, (frx) obj10, (fth) pair.first, frvVar, 2)), huf.a);
                            aC.b(g);
                        }
                        aC.close();
                        return g;
                    } finally {
                    }
                }
                g = hnu.aJ(new fry(null, ful.a, null, null, (frx) obj10));
                aC.b(g);
                aC.close();
                return g;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((String) obj).getClass();
                Object obj11 = this.a;
                Object obj12 = this.b;
                gty aC2 = hoq.aC(98, "GoogleAuthUtilWrapper.getAccountId");
                try {
                    hvi d = dih.d(((fvw) obj11).f.a((String) obj12));
                    aC2.b(d);
                    ixf.j(aC2, null);
                    return d;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ixf.j(aC2, th);
                        throw th2;
                    }
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj13 = this.b;
                Set b = ((jsd) ((ghf) obj13).b).b();
                Object obj14 = this.a;
                return ghf.e((fun) obj14, b).b(gvx.b(new bwr(obj13, obj14, 15, bArr)), huf.a);
            case 15:
                Object obj15 = this.a;
                frv frvVar2 = (frv) obj15;
                fxf a = fwm.a((fxd) obj, frvVar2);
                int x = a.x(a.e);
                if (x != 0 && x == 2) {
                    return hnu.aJ(null);
                }
                Object obj16 = this.b;
                fun funVar = new fun(frvVar2, iyi.j(a).b);
                Set b2 = ((jsd) ((ghf) obj16).c).b();
                ArrayList arrayList3 = new ArrayList(b2.size());
                Iterator it3 = b2.iterator();
                while (it3.hasNext()) {
                    try {
                        Object obj17 = ((kee) it3.next()).a;
                        arrayList3.add(((ikm) obj17).a.submit(new evb(obj17, funVar.a, 6, bArr)));
                    } catch (Exception e) {
                        arrayList3.add(hnu.aI(e));
                    }
                }
                jxu aX = hnu.aX(arrayList3);
                htq b3 = gvx.b(new bwr(obj16, obj15, i2, bArr));
                huf hufVar2 = huf.a;
                return hti.g(aX.b(b3, hufVar2), gvx.c(new egl(obj16, funVar, i2, bArr)), hufVar2);
            case 16:
                hfm f2 = hnu.i(this.b, (Set) obj).f();
                ikm ikmVar = ((fxo) this.a).h;
                return ikmVar.f(ikmVar.d(f2, null, true));
            case 17:
                fye fyeVar = (fye) this.b;
                fwm fwmVar = fyeVar.c;
                frv frvVar3 = (frv) this.a;
                return hti.f(fwmVar.f(frvVar3), gvx.a(new grt(fyeVar, (fyg) obj, frvVar3, i3)), huf.a);
            case 18:
                return ((fzp) this.b).q.e((frv) this.a);
            case 19:
                etn etnVar = (etn) obj;
                gty aB = hoq.aB(158, "ConsistencyTierState.setNewValues", gub.a, true);
                Object obj18 = this.b;
                Object obj19 = this.a;
                try {
                    ggh gghVar = (ggh) ((ghf) obj19).c.get(obj18);
                    if (gghVar != null) {
                        int ordinal = gghVar.ordinal();
                        if (ordinal == 0) {
                            Object obj20 = ((ghf) obj19).h;
                            etnVar.getClass();
                            f = hti.f(((iwq) obj20).g((String) obj18, etnVar), gvx.a(new fyc(obj19, i2)), huf.a);
                        } else if (ordinal == 2) {
                            Object obj21 = ((ghf) obj19).g;
                            etnVar.getClass();
                            f = ((iwq) obj21).g((String) obj18, etnVar);
                        }
                        aB.b(f);
                        ixf.j(aB, null);
                        return f;
                    }
                    throw new UnsupportedOperationException();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ixf.j(aB, th3);
                        throw th4;
                    }
                }
            default:
                gzf a2 = gvx.a(new fyc(this.a, 19));
                Object obj22 = this.b;
                huf hufVar3 = huf.a;
                return hoq.at(((ghn) obj22).t.a(a2, hufVar3), gvx.a(new fyc((ghh) obj, 20)), hufVar3);
        }
    }

    public /* synthetic */ egl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
