package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Network;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvw {
    public static final hkh a = hkh.l("com/google/apps/tiktok/account/data/google/GmsAccounts");
    public final hvl b;
    public final hvl c;
    public final egc d;
    public final koe e;
    public final chp f;
    public final ciw g;

    public fvw(chp chpVar, hvl hvlVar, hvl hvlVar2, egc egcVar, ciw ciwVar, koe koeVar) {
        hvlVar.getClass();
        hvlVar2.getClass();
        egcVar.getClass();
        koeVar.getClass();
        this.f = chpVar;
        this.b = hvlVar;
        this.c = hvlVar2;
        this.d = egcVar;
        this.g = ciwVar;
        this.e = koeVar;
    }

    public final hvi a(final String str) {
        gty aC = hoq.aC(95, "GmsAccounts.getAccountId");
        try {
            htq b = gvx.b(new bwr(this, str, 13));
            hvl hvlVar = this.b;
            hvi g = hso.g(hnu.aN(b, hvlVar), chh.class, gvx.c(new htr() { // from class: fvu
                /* JADX WARN: Removed duplicated region for block: B:109:0x0107 A[Catch: chh -> 0x02bf, IOException -> 0x02c1, all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:3:0x003a, B:5:0x0041, B:7:0x005c, B:9:0x0064, B:12:0x006f, B:13:0x0087, B:15:0x0088, B:19:0x00a9, B:22:0x00bb, B:24:0x00c4, B:28:0x010f, B:31:0x0133, B:39:0x0138, B:41:0x014a, B:44:0x0162, B:46:0x017c, B:47:0x0185, B:49:0x018d, B:50:0x018f, B:52:0x01a0, B:53:0x01a2, B:54:0x0228, B:34:0x02ba, B:35:0x02cc, B:55:0x01a8, B:57:0x01aa, B:58:0x01c7, B:60:0x01cd, B:65:0x01e5, B:67:0x01ff, B:68:0x0209, B:70:0x0211, B:71:0x0213, B:73:0x0222, B:74:0x0224, B:75:0x0238, B:76:0x0247, B:82:0x0249, B:83:0x0257, B:85:0x0259, B:86:0x0268, B:87:0x0269, B:88:0x0270, B:33:0x02b0, B:89:0x0271, B:90:0x027d, B:92:0x027f, B:96:0x00d9, B:99:0x00e3, B:101:0x00e7, B:102:0x00f6, B:107:0x0103, B:109:0x0107, B:115:0x02c8, B:105:0x00ee, B:113:0x028f), top: B:2:0x003a }] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r9v0, types: [hac, java.lang.Object] */
                @Override // defpackage.htr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final hvi a(Object obj) {
                    fvw fvwVar;
                    ddi v;
                    cir cirVar;
                    Object obj2;
                    Bundle bundle;
                    jsr jsrVar;
                    String packageName;
                    ciq ciqVar;
                    cll cllVar;
                    String str2;
                    ddi b2;
                    boolean z;
                    String c;
                    cid cidVar;
                    cib a2;
                    chh chhVar = (chh) obj;
                    chhVar.getClass();
                    ((hkf) ((hkf) fvw.a.e()).h(chhVar).i("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$<anonymous>$<anonymous>", 374, "GmsAccounts.kt")).s("Fast Auth.getAccountId() Failed");
                    gty aC2 = hoq.aC(97, "GoogleAuthUtilWrapper.getToken");
                    fvw fvwVar2 = fvw.this;
                    String str3 = str;
                    try {
                        chp chpVar = fvwVar2.f;
                        Account account = new Account(str3, "com.google");
                        try {
                            cirVar = (cir) chpVar.b.bB();
                            obj2 = chpVar.a;
                            bundle = new Bundle();
                            jsrVar = jsr.a;
                            if (jsrVar.bB().d() && !account.type.equals("com.google") && !account.type.equals("com.google.work")) {
                                throw new IllegalArgumentException("Account type " + account.type + " is not supported.");
                            }
                            packageName = ((Context) obj2).getPackageName();
                            ciqVar = cirVar.b;
                            cllVar = cll.a;
                        } catch (chh | IOException e) {
                            e = e;
                            fvwVar = fvwVar2;
                        }
                        try {
                        } catch (chh e2) {
                            e = e2;
                            v = dih.v(e);
                            hvi d = dih.d(v);
                            aC2.b(d);
                            ixf.j(aC2, null);
                            fvw fvwVar3 = fvwVar;
                            return hti.f(hti.g(hvc.v(d), gvx.c(new egl(fvwVar3, str3, 13)), fvwVar3.b), gvx.a(new esh(15)), huf.a);
                        } catch (IOException e3) {
                            e = e3;
                            v = dih.v(e);
                            hvi d2 = dih.d(v);
                            aC2.b(d2);
                            ixf.j(aC2, null);
                            fvw fvwVar32 = fvwVar;
                            return hti.f(hti.g(hvc.v(d2), gvx.c(new egl(fvwVar32, str3, 13)), fvwVar32.b), gvx.a(new esh(15)), huf.a);
                        }
                        if (jsrVar.bB().f() && !jsrVar.bB().a().b.contains(packageName)) {
                            fvwVar = jsr.c() ? 1 : 0;
                            if (fvwVar == null) {
                                try {
                                    try {
                                        if (jsrVar.bB().h()) {
                                            fvwVar = fvwVar2;
                                            b2 = cllVar.c(huf.a, ciqVar, new cmw[0]);
                                        } else {
                                            fvwVar = fvwVar2;
                                            b2 = cllVar.b(ciqVar, new cmw[0]);
                                        }
                                        dih.x(b2);
                                        z = true;
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        if (e instanceof InterruptedException) {
                                            Thread.currentThread().interrupt();
                                        }
                                        z = false;
                                        ((hkf) ((hkf) cis.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 150, "MigrationUtils.java")).w("Using %s for getToken for 1p app: %s", true != z ? "GoogleAuthUtil" : "GoogleAuthClient", packageName);
                                        if (z) {
                                        }
                                        String str4 = chi.a;
                                        str2 = cho.d((Context) obj2, account, "oauth2:https://www.googleapis.com/auth/userinfo.email", bundle);
                                        v = dih.w(str2);
                                        hvi d22 = dih.d(v);
                                        aC2.b(d22);
                                        ixf.j(aC2, null);
                                        fvw fvwVar322 = fvwVar;
                                        return hti.f(hti.g(hvc.v(d22), gvx.c(new egl(fvwVar322, str3, 13)), fvwVar322.b), gvx.a(new esh(15)), huf.a);
                                    } catch (ExecutionException e5) {
                                        e = e5;
                                        if (e instanceof InterruptedException) {
                                        }
                                        z = false;
                                        ((hkf) ((hkf) cis.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 150, "MigrationUtils.java")).w("Using %s for getToken for 1p app: %s", true != z ? "GoogleAuthUtil" : "GoogleAuthClient", packageName);
                                        if (z) {
                                        }
                                        String str42 = chi.a;
                                        str2 = cho.d((Context) obj2, account, "oauth2:https://www.googleapis.com/auth/userinfo.email", bundle);
                                        v = dih.w(str2);
                                        hvi d222 = dih.d(v);
                                        aC2.b(d222);
                                        ixf.j(aC2, null);
                                        fvw fvwVar3222 = fvwVar;
                                        return hti.f(hti.g(hvc.v(d222), gvx.c(new egl(fvwVar3222, str3, 13)), fvwVar3222.b), gvx.a(new esh(15)), huf.a);
                                    }
                                } catch (InterruptedException | ExecutionException e6) {
                                    e = e6;
                                    fvwVar = fvwVar2;
                                }
                            } else if (cllVar.l((Context) obj2, 234200000) == 0) {
                                fvwVar = fvwVar2;
                                z = true;
                            } else {
                                fvwVar = fvwVar2;
                                z = false;
                            }
                            ((hkf) ((hkf) cis.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 150, "MigrationUtils.java")).w("Using %s for getToken for 1p app: %s", true != z ? "GoogleAuthUtil" : "GoogleAuthClient", packageName);
                            if (z) {
                                try {
                                    String str5 = account.name;
                                    String str6 = chi.a;
                                    c = cho.c((Context) obj2, str5);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new IOException();
                                } catch (ExecutionException e7) {
                                    cis.a(e7, "Unexpected exception while fetching token.");
                                    String str7 = chi.a;
                                    str2 = cho.d((Context) obj2, account, "oauth2:https://www.googleapis.com/auth/userinfo.email", bundle);
                                }
                                if (TextUtils.isEmpty(c)) {
                                    throw new IOException("Could not fetch gaia id for account.");
                                }
                                if (jsr.a.bB().g()) {
                                    cia a3 = cib.a();
                                    a3.b = c;
                                    a3.e(true);
                                    a3.c = hel.q("oauth2:https://www.googleapis.com/auth/userinfo.email".replaceFirst("^oauth2:", ""));
                                    String string = bundle.getString("delegatee_user_id");
                                    if (string != null) {
                                        int i = bundle.getInt("delegation_type", 0);
                                        a3.d = string;
                                        a3.c(i);
                                    }
                                    String string2 = bundle.getString(chi.a);
                                    if (string2 != null) {
                                        a3.e = string2;
                                    }
                                    a3.d(bundle.getBoolean("suppressProgressScreen"));
                                    Network network = (Network) pj.h(bundle, "networkToUse", Network.class);
                                    if (network != null) {
                                        a3.f = network;
                                    }
                                    a2 = a3.a();
                                } else {
                                    ciq ciqVar2 = cirVar.b;
                                    try {
                                        ggb a4 = chy.a();
                                        a4.i(account.type);
                                        Iterator it = ((chz) dih.x(ciqVar2.b(a4.h()))).a.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                cidVar = null;
                                                break;
                                            }
                                            cid cidVar2 = (cid) it.next();
                                            if (cidVar2.c.equals(account.name)) {
                                                cidVar = cidVar2;
                                                break;
                                            }
                                        }
                                        if (cidVar == null) {
                                            throw new IOException("Account not found: ".concat(String.valueOf(account.name)));
                                        }
                                        cia a5 = cib.a();
                                        a5.a = cidVar;
                                        a5.e(true);
                                        a5.c = hel.q("oauth2:https://www.googleapis.com/auth/userinfo.email".replaceFirst("^oauth2:", ""));
                                        String string3 = bundle.getString("delegatee_user_id");
                                        if (string3 != null) {
                                            int i2 = bundle.getInt("delegation_type", 0);
                                            a5.d = string3;
                                            a5.c(i2);
                                        }
                                        String string4 = bundle.getString(chi.a);
                                        if (string4 != null) {
                                            a5.e = string4;
                                        }
                                        a5.d(bundle.getBoolean("suppressProgressScreen"));
                                        Network network2 = (Network) bundle.getParcelable("networkToUse");
                                        if (network2 != null) {
                                            a5.f = network2;
                                        }
                                        a2 = a5.a();
                                    } catch (InterruptedException e8) {
                                        Thread.currentThread().interrupt();
                                        throw new IOException("Fetching accounts was interrupted", e8);
                                    } catch (ExecutionException e9) {
                                        throw new IOException("Account not found: ".concat(String.valueOf(account.name)), e9);
                                    }
                                }
                                str2 = ((cic) dih.x(cirVar.b.c(a2))).a;
                                v = dih.w(str2);
                                hvi d2222 = dih.d(v);
                                aC2.b(d2222);
                                ixf.j(aC2, null);
                                fvw fvwVar32222 = fvwVar;
                                return hti.f(hti.g(hvc.v(d2222), gvx.c(new egl(fvwVar32222, str3, 13)), fvwVar32222.b), gvx.a(new esh(15)), huf.a);
                            }
                            String str422 = chi.a;
                            str2 = cho.d((Context) obj2, account, "oauth2:https://www.googleapis.com/auth/userinfo.email", bundle);
                            v = dih.w(str2);
                            hvi d22222 = dih.d(v);
                            aC2.b(d22222);
                            ixf.j(aC2, null);
                            fvw fvwVar322222 = fvwVar;
                            return hti.f(hti.g(hvc.v(d22222), gvx.c(new egl(fvwVar322222, str3, 13)), fvwVar322222.b), gvx.a(new esh(15)), huf.a);
                        }
                        fvwVar = fvwVar2;
                        ((hkf) ((hkf) cis.a.e().g(csl.a, 343)).i("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 124, "MigrationUtils.java")).u("Using GoogleAuthUtil for getToken for 1p app: %s", packageName);
                        String str4222 = chi.a;
                        str2 = cho.d((Context) obj2, account, "oauth2:https://www.googleapis.com/auth/userinfo.email", bundle);
                        v = dih.w(str2);
                        hvi d222222 = dih.d(v);
                        aC2.b(d222222);
                        ixf.j(aC2, null);
                        fvw fvwVar3222222 = fvwVar;
                        return hti.f(hti.g(hvc.v(d222222), gvx.c(new egl(fvwVar3222222, str3, 13)), fvwVar3222222.b), gvx.a(new esh(15)), huf.a);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ixf.j(aC2, th);
                            throw th2;
                        }
                    }
                }
            }), hvlVar);
            aC.b(g);
            ixf.j(aC, null);
            return g;
        } finally {
        }
    }
}
