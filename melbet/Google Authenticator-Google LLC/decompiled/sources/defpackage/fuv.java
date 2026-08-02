package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuv implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public fuv(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = 2;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Map b = ((jrz) this.a).b();
                hfk hfkVar = new hfk();
                for (Map.Entry entry : b.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw new NullPointerException("Null type");
                    }
                    fut futVar = (fut) entry.getValue();
                    if (futVar == null) {
                        throw new NullPointerException("Null provider");
                    }
                    hfkVar.c(new fuu(str, futVar));
                }
                hfm g = hfkVar.g();
                g.getClass();
                return g;
            case 1:
                return new gpg((fuq) this.a.b(), 1);
            case 2:
                return new cbp(((jrz) this.a).b());
            case 3:
                return new kee((iwq) this.a.b(), null);
            case 4:
                return new fvd((iwq) this.a.b(), 0);
            case 5:
                return new ggr((iwq) this.a.b(), i2);
            case 6:
                final fvw b2 = ((fvx) this.a).b();
                return new fut() { // from class: fwa
                    @Override // defpackage.fut
                    public final hvi a() {
                        gty aC = hoq.aC(94, "GmsAccounts.getAccounts()");
                        final fvw fvwVar = fvw.this;
                        try {
                            hvi aN = hnu.aN(gvx.b(new htq() { // from class: fvt
                                /* JADX WARN: Type inference failed for: r11v1, types: [hac, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r14v0, types: [hac, java.lang.Object] */
                                @Override // defpackage.htq
                                public final hvi a() {
                                    ddi v;
                                    ddi v2;
                                    int i3;
                                    Account[] i4;
                                    Account[] h;
                                    gty aC2 = hoq.aC(99, "GoogleAuthUtilWrapper.getAccounts");
                                    fvw fvwVar2 = fvw.this;
                                    try {
                                        chp chpVar = fvwVar2.f;
                                        try {
                                            cir cirVar = (cir) chpVar.b.bB();
                                            Object obj = chpVar.a;
                                            if (cis.b(((Context) obj).getPackageName())) {
                                                try {
                                                    cir.a(cll.a.b(cirVar.b, new cmw[0]));
                                                    ((hkf) ((hkf) cir.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 131, "GoogleAuthClientWrapper.java")).u("Using GoogleAuthClient for getAccounts for 1p app: %s", ((Context) obj).getPackageName());
                                                    int i5 = hel.d;
                                                    hel helVar = his.a;
                                                    try {
                                                        ciq ciqVar = cirVar.b;
                                                        ggb a = chy.a();
                                                        a.i("com.google");
                                                        h = cis.c(((chz) cir.a(ciqVar.b(a.h()))).a);
                                                    } catch (InterruptedException e) {
                                                        Thread.currentThread().interrupt();
                                                        throw new RemoteException("Fetching accounts was interrupted. ".concat(e.toString()));
                                                    } catch (ExecutionException e2) {
                                                        if (e2.getCause() instanceof RemoteException) {
                                                            throw ((RemoteException) e2.getCause());
                                                        }
                                                        if (e2.getCause() instanceof cmc) {
                                                            throw ((cmc) e2.getCause());
                                                        }
                                                        if (e2.getCause() instanceof cmb) {
                                                            throw ((cmb) e2.getCause());
                                                        }
                                                        throw new RemoteException("Unexpected error was thrown by GoogleAuthClient when fetching accounts. ".concat(e2.toString()));
                                                    }
                                                } catch (InterruptedException | ExecutionException unused) {
                                                    ((hkf) ((hkf) cir.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 134, "GoogleAuthClientWrapper.java")).u("Using GoogleAuthUtil for getAccounts for 1p app: %s", ((Context) obj).getPackageName());
                                                    String str2 = chi.a;
                                                    h = cho.h((Context) obj);
                                                }
                                            } else {
                                                String str3 = chi.a;
                                                h = cho.h((Context) obj);
                                            }
                                            v = dih.w(h);
                                        } catch (RemoteException | cmb | cmc e3) {
                                            v = dih.v(e3);
                                        }
                                        hvi d = dih.d(v);
                                        aC2.b(d);
                                        ixf.j(aC2, null);
                                        aC2 = hoq.aC(100, "GoogleAuthUtilWrapper.getAccounts of G1 feature");
                                        try {
                                            chp chpVar2 = fvwVar2.f;
                                            String[] strArr = {fei.a};
                                            try {
                                                cir cirVar2 = (cir) chpVar2.b.bB();
                                                Object obj2 = chpVar2.a;
                                                if (cis.b(((Context) obj2).getPackageName())) {
                                                    try {
                                                        i3 = 343;
                                                        try {
                                                            cir.a(cll.a.b(cirVar2.b, new cmw[0]));
                                                            ((hkf) ((hkf) cir.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 201, "GoogleAuthClientWrapper.java")).u("Using GoogleAuthClient for getAccounts for 1p app: %s", ((Context) obj2).getPackageName());
                                                            int i6 = hel.d;
                                                            List list = his.a;
                                                            try {
                                                                ciq ciqVar2 = cirVar2.b;
                                                                ggb a2 = chy.a();
                                                                a2.b = hel.p(strArr);
                                                                a2.i("com.google");
                                                                list = ((chz) cir.a(ciqVar2.b(a2.h()))).a;
                                                            } catch (InterruptedException e4) {
                                                                Thread.currentThread().interrupt();
                                                                throw new IOException(e4);
                                                            } catch (ExecutionException e5) {
                                                                cis.a(e5, "Unexpected error was thrown by GoogleAuthClient when fetching accounts.");
                                                            }
                                                            i4 = cis.c(list);
                                                        } catch (InterruptedException | ExecutionException unused2) {
                                                            ((hkf) ((hkf) cir.a.e().g(csl.a, Integer.valueOf(i3))).i("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 204, "GoogleAuthClientWrapper.java")).u("Using GoogleAuthUtil for getAccounts for 1p app: %s", ((Context) obj2).getPackageName());
                                                            String str4 = chi.a;
                                                            i4 = cho.i((Context) obj2, strArr);
                                                            v2 = dih.w(i4);
                                                            hvi d2 = dih.d(v2);
                                                            aC2.b(d2);
                                                            ixf.j(aC2, null);
                                                            return hnu.aY(d, d2).a(gvx.i(new bsp(d, d2, 14)), fvwVar2.b);
                                                        }
                                                    } catch (InterruptedException | ExecutionException unused3) {
                                                        i3 = 343;
                                                    }
                                                } else {
                                                    String str5 = chi.a;
                                                    i4 = cho.i((Context) obj2, strArr);
                                                }
                                                v2 = dih.w(i4);
                                            } catch (chh | IOException e6) {
                                                v2 = dih.v(e6);
                                            }
                                            hvi d22 = dih.d(v2);
                                            aC2.b(d22);
                                            ixf.j(aC2, null);
                                            return hnu.aY(d, d22).a(gvx.i(new bsp(d, d22, 14)), fvwVar2.b);
                                        } finally {
                                        }
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                            }), fvwVar.b);
                            aC = hoq.aC(103, "GoogleOwnersProvider.loadOwners");
                            try {
                                hvi b3 = fvwVar.d.b();
                                aC.b(b3);
                                ixf.j(aC, null);
                                b3.getClass();
                                hvi g2 = hso.g(b3, Throwable.class, gvx.c(new bwu(19)), huf.a);
                                hvi b4 = hnu.aY(aN, g2).b(gvx.b(new cap(fvwVar, g2, aN, 8)), fvwVar.c);
                                aC.b(b4);
                                ixf.j(aC, null);
                                return b4;
                            } finally {
                            }
                        } finally {
                        }
                    }
                };
            case 7:
                return new die((Executor) this.a.b());
            case 8:
                final ikm b3 = ((fxr) this.a).b();
                return new fum() { // from class: fxq
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
                    @Override // defpackage.fum
                    public final hvi a(fun funVar) {
                        ikm ikmVar = ikm.this;
                        return hnu.aN(new bwr(ikmVar, funVar.a, 17, null), ikmVar.a);
                    }
                };
            case 9:
                return new kee(((fxr) this.a).b(), null);
            case 10:
                gpo gpoVar = new gpo();
                gpoVar.c(3L, TimeUnit.DAYS);
                gpq gpqVar = new gpq();
                gpqVar.a = gps.ON_CHARGER;
                gpqVar.b(4L, TimeUnit.DAYS);
                gpoVar.b(gpqVar.a());
                return hoq.aS(gpoVar.a(), this.a);
            case 11:
                return new fvd(((fyf) this.a).b(), i);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new fhr();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new fze(((jrk) this.a).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                final gva gvaVar = (gva) this.a.b();
                return new dlg() { // from class: fzx
                    @Override // defpackage.dlg
                    public final Runnable a(Runnable runnable) {
                        return gta.u() ? gvx.h(runnable) : new gbm(gva.this, runnable, 1);
                    }
                };
            case 15:
                return new gbg((Looper) this.a.b());
            case 16:
                ((jrk) this.a).b();
                return new gak();
            case 17:
                Object obj = ((gam) this.a.b()).e;
                obj.getClass();
                return obj;
            case 18:
                return new iyi((cbp) ((jrx) this.a).a);
            case 19:
                glu gluVar = (glu) this.a.b();
                gluVar.getClass();
                return new gbl(new eqn(gluVar, 2), gluVar, gluVar.L());
            default:
                bd bdVar = (bd) ((jrx) this.a).a;
                bdVar.getClass();
                return new gbl(new eqn(bdVar, 3), bdVar, bdVar.L());
        }
    }
}
