package defpackage;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import j$.time.Instant;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwr implements htq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bwr(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dkl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v55, types: [ftd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v95, types: [htr, java.lang.Object] */
    @Override // defpackage.htq
    public final hvi a() {
        int A;
        hvi aI;
        gty aC;
        int i = 18;
        int i2 = 19;
        int i3 = 17;
        int i4 = 11;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                return ((bww) this.a).e.b(((fuf) hnu.aR(this.b)).a, false, false);
            case 1:
                return ((car) hnu.aR(this.a)).d((List) hnu.aR(this.b), Long.valueOf(Instant.now().toEpochMilli())).a;
            case 2:
                return hnu.aG(hdb.c((Iterable) hnu.aR(this.b)).d(new bpf(this.a, i4)).e());
            case 3:
                return ((car) hnu.aR(this.a)).d((List) hnu.aR(this.b), Long.valueOf(Instant.now().toEpochMilli())).a;
            case 4:
                dkf dkfVar = (dkf) this.a;
                Set set = dkfVar.b;
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dkh) it.next()).a(this.b));
                }
                jxu aX = hnu.aX(arrayList);
                avc avcVar = new avc(arrayList, 4);
                hvl hvlVar = dkfVar.a;
                hvi a = aX.a(avcVar, hvlVar);
                gzp gzpVar = dkfVar.c;
                return gzpVar.f() ? hti.g(((dkg) gzpVar.b()).a(), new bpn(a, i), hvlVar) : a;
            case 5:
                return hnu.aJ((InputStream) ((iyi) ((fwm) this.b).b).r((Uri) this.a, new fbq(0)));
            case 6:
                eqd eqdVar = (eqd) this.a;
                return eqdVar.b(((eqb) eqdVar.d.b()).c(this.b));
            case 7:
                Object obj = this.a;
                eqm eqmVar = (eqm) obj;
                if (!((emi) eqmVar.a).c(null)) {
                    return hve.a;
                }
                Object obj2 = this.b;
                lfk lfkVar = (lfk) ((jkj) obj2).b;
                int i5 = lfkVar.v;
                int A2 = a.A(i5);
                if (((A2 != 0 && A2 == 3) || ((A = a.A(i5)) != 0 && A == 2)) && (lfkVar.b & 16) == 0) {
                    return hve.a;
                }
                eqg eqgVar = (eqg) eqmVar.b.b();
                gzp gzpVar2 = eqgVar.b;
                gzp gzpVar3 = eqgVar.a;
                gyf gyfVar = gyf.a;
                hvi aJ = hnu.aJ(gyfVar);
                hvi aJ2 = hnu.aJ(gyfVar);
                return hnu.aW(aJ, aJ2).b(new fca(obj, obj2, aJ, aJ2, 1), huf.a);
            case 8:
                Object obj3 = this.b;
                fcn fcnVar = (fcn) obj3;
                Uri uri = (Uri) hnu.aR(fcnVar.b);
                fbe fbeVar = new fbe((Closeable) fcnVar.m.r(uri, new fbo(false, false)));
                Object obj4 = this.a;
                try {
                    try {
                        ((fcn) obj3).c(uri);
                        aI = hve.a;
                    } catch (IOException e) {
                        aI = fcn.e(e) ? hnu.aI(e) : ((fby) obj4).a(e, ((fcn) obj3).e);
                    }
                    hvi b = fcn.b(aI, fbeVar.a(), ((fcn) obj3).c);
                    fbeVar.close();
                    return b;
                } finally {
                }
            case 9:
                return this.b.c((frv) this.a);
            case 10:
                ftg ftgVar = (ftg) this.b.b();
                return hti.f(ftgVar.a((ftk) this.a), new euy(ftgVar, i4), huf.a);
            case 11:
                final hvw hvwVar = new hvw();
                AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: fve
                    @Override // android.accounts.AccountManagerCallback
                    public final void run(AccountManagerFuture accountManagerFuture) {
                        iyi.k(hvw.this, accountManagerFuture);
                    }
                };
                fvh fvhVar = (fvh) this.b;
                Activity activity = fvhVar.d;
                Bundle bundle = fvhVar.c;
                String str = fvhVar.b;
                String str2 = fvhVar.a;
                iyi iyiVar = (iyi) this.a;
                final AccountManagerFuture<Bundle> addAccount = ((AccountManager) iyiVar.a).addAccount(str2, str, null, bundle, activity, accountManagerCallback, (Handler) iyiVar.b);
                hvwVar.c(new Runnable() { // from class: fvf
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (hvw.this.isCancelled()) {
                            addAccount.cancel(true);
                        }
                    }
                }, huf.a);
                return hvwVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.a;
                Object obj6 = this.b;
                aC = hoq.aC(102, "AccountDataServiceClient.getAccountNameFromAccountId");
                try {
                    hvi d = dih.d(((fvw) obj5).g.a((String) obj6));
                    aC.b(d);
                    ixf.j(aC, null);
                    return d;
                } finally {
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj7 = this.a;
                Object obj8 = this.b;
                aC = hoq.aC(96, "Fast GoogleAuthUtilWrapper.getAccountId");
                try {
                    hvi d2 = dih.d(((fvw) obj7).f.a((String) obj8));
                    aC.b(d2);
                    ixf.j(aC, null);
                    return d2;
                } finally {
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((iyi) ((ghf) this.b).f).i(new euy(this.a, i3), huf.a);
            case 15:
                return ghf.e((fun) this.a, ((jsd) ((ghf) this.b).a).b()).a(new bws(7), huf.a);
            case 16:
                iyi iyiVar2 = ((fwv) this.a).d;
                File file = new File(((Context) iyiVar2.c).getApplicationInfo().dataDir, "shared_prefs/accounts.xml");
                if (!file.exists()) {
                    file = new File(String.valueOf(file.getPath()).concat(".bak"));
                }
                return file.exists() ? hoq.at(((fcu) iyiVar2.a).d(), new euy(this.b, i2), huf.a) : hnu.aJ(false);
            case 17:
                String a2 = fxl.a((frv) this.a);
                ArrayList arrayList2 = new ArrayList();
                ikm ikmVar = (ikm) this.b;
                hjr it2 = ((gpj) ikmVar.b).a().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ikmVar.c(new File((File) it2.next(), a2)));
                }
                return hnu.aX(arrayList2).a(new bws(i2), huf.a);
            case 18:
                return this.a.a(this.b);
            case 19:
                fym fymVar = (fym) this.b;
                ewg ewgVar = ((etd) fymVar.b).f;
                Object obj9 = fymVar.e;
                ghj ghjVar = (ghj) this.a;
                return hoq.ao(ewgVar.c(((cfe) obj9).e(ghjVar.a)).e ? ((ett) fymVar.d).b().b(ghjVar.b) : ((ett) fymVar.d).b().a(ghjVar.b.c), etq.class, new fyc(new dvm(18), i3), huf.a);
            default:
                Object obj10 = this.b;
                return hti.g(((ghn) obj10).q.c(), gvx.c(new egl(obj10, this.a, 20, bArr)), huf.a);
        }
    }

    public /* synthetic */ bwr(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
