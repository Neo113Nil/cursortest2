package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idp implements idh {
    private static final Duration c = Duration.ofMinutes(5);
    private static final Duration d = Duration.ofHours(1);
    private static final hkh e = hkh.l("com/google/frameworks/client/data/android/auth/impl/AuthContextManagerImpl");
    private static final gzl f = new gzl(" ");
    private final Context h;
    private final idk i;
    private final boolean j;
    private final ifv l;
    private final boolean m;
    private final Handler n;
    private final iel o;
    private final AtomicReference g = new AtomicReference();
    private final hvl k = new hug();
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public idp(Context context, idk idkVar, boolean z, boolean z2, Handler handler, ifv ifvVar, iel ielVar) {
        this.h = context.getApplicationContext();
        this.i = idkVar;
        this.j = z;
        this.l = ifvVar;
        this.m = z2;
        this.n = handler;
        this.o = ielVar;
    }

    private static final String g(Set set) {
        return "oauth2:".concat(f.c(set));
    }

    @Override // defpackage.idh
    public final iyi a(idf idfVar, Set set) {
        return b(idfVar, null, set);
    }

    @Override // defpackage.idh
    public final iyi b(idf idfVar, String str, Set set) {
        Runnable runnable;
        idp idpVar;
        hvi hviVar;
        ido idoVar = new ido(new Account(idfVar.b, "com.google"), g(set));
        Map map = this.b;
        synchronized (map) {
            hvi hviVar2 = (hvi) map.get(idoVar);
            runnable = null;
            boolean z = false;
            if (hviVar2 == null) {
                idpVar = this;
                hvj hvjVar = new hvj(new bqi(idpVar, str, idoVar, 7, null));
                hvjVar.c(new evb(idpVar, idoVar, 20, z ? 1 : 0), idpVar.k);
                map.put(idoVar, hvjVar);
                runnable = hvjVar;
                hviVar = hvjVar;
            } else {
                idpVar = this;
                hviVar = hviVar2;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        try {
            return (iyi) hviVar.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            idi idiVar = cause instanceof idi ? (idi) cause : new idi("Failed to refresh token", cause);
            if (!idpVar.m) {
                throw idiVar;
            }
            ((hkf) ((hkf) ((hkf) e.f()).h(idiVar)).i("com/google/frameworks/client/data/android/auth/impl/AuthContextManagerImpl", "forceRefreshAuthTokenFix", (char) 205, "AuthContextManagerImpl.java")).s("forceRefreshAuthToken failed");
            throw idiVar;
        }
    }

    @Override // defpackage.idh
    public final iyi c(idf idfVar, Set set) {
        iyi e2;
        try {
            gty aC = hoq.aC(282, "AuthContextManagerImpl#getAuthToken");
            try {
                ido idoVar = new ido(new Account(idfVar.b, "com.google"), g(set));
                synchronized (this.a) {
                    e2 = e(idoVar);
                }
                aC.close();
                return e2;
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (idi e3) {
            throw e3;
        } catch (Throwable th3) {
            throw new idi("Failed to get auth token", th3);
        }
    }

    public final void d(String str) {
        this.i.a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (j$.time.Duration.between(r0.c, j$.time.Instant.now()).compareTo(defpackage.idp.d.minus(defpackage.idp.c)) < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (j$.time.Duration.between(j$.time.Instant.now(), r1).compareTo(defpackage.idp.c) > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
    
        d((java.lang.String) r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [hac, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iyi e(ido idoVar) {
        iyi iyiVar = (iyi) this.a.get(idoVar);
        if (iyiVar != null) {
            ?? r1 = iyiVar.b;
            if (r1 == 0) {
                iwq d2 = this.l.d();
                if (d2 != null && d2.d()) {
                    iee o = d2.o();
                    ikj ikjVar = (ikj) d2.a;
                    ((fea) o.a.bB()).b(ikjVar.b, ikjVar.a);
                }
            }
        }
        return f(idoVar);
    }

    public final iyi f(ido idoVar) {
        ifv ifvVar = this.l;
        ifvVar.a("attempt");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.o.j()) {
                AtomicReference atomicReference = this.g;
                if (a.j(atomicReference, new idn(this, 0))) {
                    AccountManager.get(this.h).addOnAccountsUpdatedListener((OnAccountsUpdateListener) atomicReference.get(), this.n, false, new String[]{"com.google"});
                }
            }
            iyi b = this.i.b(idoVar.a, idoVar.b);
            if (this.j || b.b != null) {
                this.a.put(idoVar, b);
            }
            ifvVar.a("success");
            ifvVar.b(SystemClock.elapsedRealtime() - elapsedRealtime);
            return b;
        } catch (Exception e2) {
            ifv ifvVar2 = this.l;
            ifvVar2.a("failure");
            ifvVar2.b(SystemClock.elapsedRealtime() - elapsedRealtime);
            if (!this.m) {
                throw e2;
            }
            ((hkf) ((hkf) ((hkf) e.f()).h(e2)).i("com/google/frameworks/client/data/android/auth/impl/AuthContextManagerImpl", "getNewAuthToken", (char) 246, "AuthContextManagerImpl.java")).s("getNewAuthToken failed");
            throw e2;
        }
    }
}
