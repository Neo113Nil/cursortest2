package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gh3 extends xg3 {
    public String A;
    public long B;
    public String C;
    public String o;
    public String p;
    public int q;
    public String r;
    public String s;
    public long t;
    public final long u;
    public final long v;
    public List w;
    public String x;
    public int y;
    public String z;

    public gh3(pj3 pj3Var, long j, long j2) {
        super(pj3Var);
        this.B = 0L;
        this.C = null;
        this.u = j;
        this.v = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cs3 A(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean z2;
        String str3;
        Class<?> loadClass;
        long a;
        boolean z3;
        String str4;
        pj3 pj3Var;
        boolean z4;
        int i;
        int i2;
        long j3;
        ApplicationInfo b;
        tg3 tg3Var;
        int i3;
        v();
        String C = C();
        String D = D();
        x();
        String str5 = this.p;
        x();
        long j4 = this.q;
        x();
        ll3.v(this.r);
        String str6 = this.r;
        pj3 pj3Var2 = (pj3) this.m;
        ec3 ec3Var = pj3Var2.p;
        vh3 vh3Var = pj3Var2.r;
        ec3 ec3Var2 = pj3Var2.p;
        Context context = pj3Var2.m;
        zq3 zq3Var = pj3Var2.u;
        qi3 qi3Var = pj3Var2.q;
        ec3Var.B();
        x();
        v();
        long j5 = this.t;
        long j6 = 0;
        if (j5 == 0) {
            pj3.k(zq3Var);
            pj3 pj3Var3 = (pj3) zq3Var.m;
            String packageName = context.getPackageName();
            zq3Var.v();
            ll3.s(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest N = zq3.N();
            long j7 = -1;
            if (N == null) {
                vh3 vh3Var2 = pj3Var3.r;
                pj3.m(vh3Var2);
                vh3Var2.r.b("Could not get MD5 instance");
                str2 = str5;
                j = j4;
            } else {
                if (packageManager != null) {
                    try {
                        if (zq3Var.a0(context, packageName)) {
                            str2 = str5;
                            j = j4;
                            j7 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j4;
                                try {
                                    Signature[] signatureArr = i93.a(context).c(64, pj3Var3.m.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        vh3 vh3Var3 = pj3Var3.r;
                                        pj3.m(vh3Var3);
                                        vh3Var3.u.b("Could not get signatures");
                                    } else {
                                        j7 = zq3.O(N.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    vh3 vh3Var4 = pj3Var3.r;
                                    pj3.m(vh3Var4);
                                    vh3Var4.r.c(e, "Package name not found");
                                    j2 = 0;
                                    this.t = j2;
                                    boolean b2 = pj3Var2.b();
                                    pj3.k(qi3Var);
                                    boolean z5 = !qi3Var.D;
                                    v();
                                    if (pj3Var2.b()) {
                                    }
                                    z2 = b2;
                                    str3 = null;
                                    pj3.k(qi3Var);
                                    a = qi3Var.r.a();
                                    long j8 = j2;
                                    long j9 = pj3Var2.P;
                                    if (a != 0) {
                                    }
                                    x();
                                    int i4 = this.y;
                                    Boolean I = ec3Var2.I("google_analytics_adid_collection_enabled");
                                    if (I != null) {
                                    }
                                    pj3.k(qi3Var);
                                    qi3Var.v();
                                    long j10 = j9;
                                    boolean z6 = qi3Var.A().getBoolean("deferred_analytics_collection", z);
                                    Boolean valueOf = Boolean.valueOf(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true) != sk3.GRANTED);
                                    List list = this.w;
                                    String g = qi3Var.D().g();
                                    if (this.x == null) {
                                    }
                                    String str7 = this.x;
                                    if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean I2 = ec3Var2.I("google_analytics_sgtm_upload_enabled");
                                    if (I2 == null) {
                                    }
                                    pj3.k(zq3Var);
                                    pj3Var = (pj3) zq3Var.m;
                                    String str8 = str4;
                                    String C2 = C();
                                    boolean z7 = r3;
                                    if (pj3Var.m.getPackageManager() == null) {
                                    }
                                    pj3.k(qi3Var);
                                    int i5 = qi3Var.D().b;
                                    pj3.k(qi3Var);
                                    qi3Var.v();
                                    String str9 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).b;
                                    vr3.a();
                                    tg3Var = ug3.Q0;
                                    if (ec3Var2.G(null, tg3Var)) {
                                    }
                                    vr3.a();
                                    if (ec3Var2.G(null, tg3Var)) {
                                    }
                                    String str10 = ec3Var2.o;
                                    String valueOf2 = String.valueOf(xk3.h(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j11 = pj3Var2.P;
                                    pj3.j(pj3Var2.G);
                                    return new cs3(C, D, str2, j, str6, 133005L, j8, str, z2, z3, str3, j10, i4, z4, z6, valueOf, this.u, list, g, str7, str8, z7, j3, i5, str9, i3, j6, str10, valueOf2, j11, in1.e(pj3Var2.G.B()));
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j4;
                                vh3 vh3Var42 = pj3Var3.r;
                                pj3.m(vh3Var42);
                                vh3Var42.r.c(e, "Package name not found");
                                j2 = 0;
                                this.t = j2;
                                boolean b22 = pj3Var2.b();
                                pj3.k(qi3Var);
                                boolean z52 = !qi3Var.D;
                                v();
                                if (pj3Var2.b()) {
                                }
                                z2 = b22;
                                str3 = null;
                                pj3.k(qi3Var);
                                a = qi3Var.r.a();
                                long j82 = j2;
                                long j92 = pj3Var2.P;
                                if (a != 0) {
                                }
                                x();
                                int i42 = this.y;
                                Boolean I3 = ec3Var2.I("google_analytics_adid_collection_enabled");
                                if (I3 != null) {
                                }
                                pj3.k(qi3Var);
                                qi3Var.v();
                                long j102 = j92;
                                boolean z62 = qi3Var.A().getBoolean("deferred_analytics_collection", z);
                                Boolean valueOf3 = Boolean.valueOf(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true) != sk3.GRANTED);
                                List list2 = this.w;
                                String g2 = qi3Var.D().g();
                                if (this.x == null) {
                                }
                                String str72 = this.x;
                                if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
                                }
                                Boolean I22 = ec3Var2.I("google_analytics_sgtm_upload_enabled");
                                if (I22 == null) {
                                }
                                pj3.k(zq3Var);
                                pj3Var = (pj3) zq3Var.m;
                                String str82 = str4;
                                String C22 = C();
                                boolean z72 = r3;
                                if (pj3Var.m.getPackageManager() == null) {
                                }
                                pj3.k(qi3Var);
                                int i52 = qi3Var.D().b;
                                pj3.k(qi3Var);
                                qi3Var.v();
                                String str92 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).b;
                                vr3.a();
                                tg3Var = ug3.Q0;
                                if (ec3Var2.G(null, tg3Var)) {
                                }
                                vr3.a();
                                if (ec3Var2.G(null, tg3Var)) {
                                }
                                String str102 = ec3Var2.o;
                                String valueOf22 = String.valueOf(xk3.h(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j112 = pj3Var2.P;
                                pj3.j(pj3Var2.G);
                                return new cs3(C, D, str2, j, str6, 133005L, j82, str, z2, z3, str3, j102, i42, z4, z62, valueOf3, this.u, list2, g2, str72, str82, z72, j3, i52, str92, i3, j6, str102, valueOf22, j112, in1.e(pj3Var2.G.B()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j4;
                }
                j2 = 0;
                this.t = j2;
            }
            j2 = j7;
            this.t = j2;
        } else {
            str2 = str5;
            j = j4;
            z = false;
            j2 = j5;
        }
        boolean b222 = pj3Var2.b();
        pj3.k(qi3Var);
        boolean z522 = !qi3Var.D;
        v();
        if (pj3Var2.b()) {
            if (!ec3Var2.G(null, ug3.H0)) {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    z2 = b222;
                    try {
                        Object[] objArr = {context};
                        str3 = null;
                        Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                        if (invoke != null) {
                            try {
                                str3 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                pj3.m(vh3Var);
                                vh3Var.w.b("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        pj3.m(vh3Var);
                        vh3Var.v.b("Failed to obtain Firebase Analytics instance");
                    }
                    pj3.k(qi3Var);
                    a = qi3Var.r.a();
                    long j822 = j2;
                    long j922 = pj3Var2.P;
                    if (a != 0) {
                        j922 = Math.min(j922, a);
                    }
                    x();
                    int i422 = this.y;
                    Boolean I32 = ec3Var2.I("google_analytics_adid_collection_enabled");
                    boolean z8 = (I32 != null || I32.booleanValue()) ? true : z;
                    pj3.k(qi3Var);
                    qi3Var.v();
                    long j1022 = j922;
                    boolean z622 = qi3Var.A().getBoolean("deferred_analytics_collection", z);
                    Boolean valueOf32 = Boolean.valueOf(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true) != sk3.GRANTED);
                    List list22 = this.w;
                    String g22 = qi3Var.D().g();
                    if (this.x == null) {
                        pj3.k(zq3Var);
                        this.x = zq3Var.p0();
                    }
                    String str722 = this.x;
                    if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
                        v();
                        if (this.B == 0) {
                            z3 = z522;
                        } else {
                            pj3Var2.w.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.B;
                            z3 = z522;
                            if (this.A != null && currentTimeMillis > 86400000 && this.C == null) {
                                B();
                            }
                        }
                        if (this.A == null) {
                            B();
                        }
                        str4 = this.A;
                    } else {
                        z3 = z522;
                        str4 = null;
                    }
                    Boolean I222 = ec3Var2.I("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = I222 == null ? false : I222.booleanValue();
                    pj3.k(zq3Var);
                    pj3Var = (pj3) zq3Var.m;
                    String str822 = str4;
                    String C222 = C();
                    boolean z722 = booleanValue;
                    if (pj3Var.m.getPackageManager() == null) {
                        z4 = z8;
                        j3 = 0;
                    } else {
                        try {
                            z4 = z8;
                            i = 0;
                            try {
                                b = i93.a(pj3Var.m).b(0, C222);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                vh3 vh3Var5 = pj3Var.r;
                                pj3.m(vh3Var5);
                                vh3Var5.x.c(C222, "PackageManager failed to find running app: app_id");
                                i2 = i;
                                j3 = i2;
                                pj3.k(qi3Var);
                                int i522 = qi3Var.D().b;
                                pj3.k(qi3Var);
                                qi3Var.v();
                                String str922 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).b;
                                vr3.a();
                                tg3Var = ug3.Q0;
                                if (ec3Var2.G(null, tg3Var)) {
                                }
                                vr3.a();
                                if (ec3Var2.G(null, tg3Var)) {
                                }
                                String str1022 = ec3Var2.o;
                                String valueOf222 = String.valueOf(xk3.h(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j1122 = pj3Var2.P;
                                pj3.j(pj3Var2.G);
                                return new cs3(C, D, str2, j, str6, 133005L, j822, str, z2, z3, str3, j1022, i422, z4, z622, valueOf32, this.u, list22, g22, str722, str822, z722, j3, i522, str922, i3, j6, str1022, valueOf222, j1122, in1.e(pj3Var2.G.B()));
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            z4 = z8;
                            i = 0;
                        }
                        if (b != null) {
                            i2 = b.targetSdkVersion;
                            j3 = i2;
                        }
                        i2 = i;
                        j3 = i2;
                    }
                    pj3.k(qi3Var);
                    int i5222 = qi3Var.D().b;
                    pj3.k(qi3Var);
                    qi3Var.v();
                    String str9222 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).b;
                    vr3.a();
                    tg3Var = ug3.Q0;
                    if (ec3Var2.G(null, tg3Var)) {
                        i3 = 0;
                    } else {
                        pj3.k(zq3Var);
                        i3 = zq3.R();
                    }
                    vr3.a();
                    if (ec3Var2.G(null, tg3Var)) {
                        pj3.k(zq3Var);
                        j6 = zq3Var.S();
                    }
                    String str10222 = ec3Var2.o;
                    String valueOf2222 = String.valueOf(xk3.h(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j11222 = pj3Var2.P;
                    pj3.j(pj3Var2.G);
                    return new cs3(C, D, str2, j, str6, 133005L, j822, str, z2, z3, str3, j1022, i422, z4, z622, valueOf32, this.u, list22, g22, str722, str822, z722, j3, i5222, str9222, i3, j6, str10222, valueOf2222, j11222, in1.e(pj3Var2.G.B()));
                }
                z2 = b222;
                str3 = null;
                pj3.k(qi3Var);
                a = qi3Var.r.a();
                long j8222 = j2;
                long j9222 = pj3Var2.P;
                if (a != 0) {
                }
                x();
                int i4222 = this.y;
                Boolean I322 = ec3Var2.I("google_analytics_adid_collection_enabled");
                if (I322 != null) {
                }
                pj3.k(qi3Var);
                qi3Var.v();
                long j10222 = j9222;
                boolean z6222 = qi3Var.A().getBoolean("deferred_analytics_collection", z);
                Boolean valueOf322 = Boolean.valueOf(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true) != sk3.GRANTED);
                List list222 = this.w;
                String g222 = qi3Var.D().g();
                if (this.x == null) {
                }
                String str7222 = this.x;
                if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
                }
                Boolean I2222 = ec3Var2.I("google_analytics_sgtm_upload_enabled");
                if (I2222 == null) {
                }
                pj3.k(zq3Var);
                pj3Var = (pj3) zq3Var.m;
                String str8222 = str4;
                String C2222 = C();
                boolean z7222 = booleanValue;
                if (pj3Var.m.getPackageManager() == null) {
                }
                pj3.k(qi3Var);
                int i52222 = qi3Var.D().b;
                pj3.k(qi3Var);
                qi3Var.v();
                String str92222 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).b;
                vr3.a();
                tg3Var = ug3.Q0;
                if (ec3Var2.G(null, tg3Var)) {
                }
                vr3.a();
                if (ec3Var2.G(null, tg3Var)) {
                }
                String str102222 = ec3Var2.o;
                String valueOf22222 = String.valueOf(xk3.h(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true)));
                long j112222 = pj3Var2.P;
                pj3.j(pj3Var2.G);
                return new cs3(C, D, str2, j, str6, 133005L, j8222, str, z2, z3, str3, j10222, i4222, z4, z6222, valueOf322, this.u, list222, g222, str7222, str8222, z7222, j3, i52222, str92222, i3, j6, str102222, valueOf22222, j112222, in1.e(pj3Var2.G.B()));
            }
            pj3.m(vh3Var);
            vh3Var.z.b("Disabled IID for tests.");
        }
        z2 = b222;
        str3 = null;
        pj3.k(qi3Var);
        a = qi3Var.r.a();
        long j82222 = j2;
        long j92222 = pj3Var2.P;
        if (a != 0) {
        }
        x();
        int i42222 = this.y;
        Boolean I3222 = ec3Var2.I("google_analytics_adid_collection_enabled");
        if (I3222 != null) {
        }
        pj3.k(qi3Var);
        qi3Var.v();
        long j102222 = j92222;
        boolean z62222 = qi3Var.A().getBoolean("deferred_analytics_collection", z);
        Boolean valueOf3222 = Boolean.valueOf(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true) != sk3.GRANTED);
        List list2222 = this.w;
        String g2222 = qi3Var.D().g();
        if (this.x == null) {
        }
        String str72222 = this.x;
        if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
        }
        Boolean I22222 = ec3Var2.I("google_analytics_sgtm_upload_enabled");
        if (I22222 == null) {
        }
        pj3.k(zq3Var);
        pj3Var = (pj3) zq3Var.m;
        String str82222 = str4;
        String C22222 = C();
        boolean z72222 = booleanValue;
        if (pj3Var.m.getPackageManager() == null) {
        }
        pj3.k(qi3Var);
        int i522222 = qi3Var.D().b;
        pj3.k(qi3Var);
        qi3Var.v();
        String str922222 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).b;
        vr3.a();
        tg3Var = ug3.Q0;
        if (ec3Var2.G(null, tg3Var)) {
        }
        vr3.a();
        if (ec3Var2.G(null, tg3Var)) {
        }
        String str1022222 = ec3Var2.o;
        String valueOf222222 = String.valueOf(xk3.h(ec3Var2.L("google_analytics_default_allow_ad_personalization_signals", true)));
        long j1122222 = pj3Var2.P;
        pj3.j(pj3Var2.G);
        return new cs3(C, D, str2, j, str6, 133005L, j82222, str, z2, z3, str3, j102222, i42222, z4, z62222, valueOf3222, this.u, list2222, g2222, str72222, str82222, z72222, j3, i522222, str922222, i3, j6, str1022222, valueOf222222, j1122222, in1.e(pj3Var2.G.B()));
    }

    public final void B() {
        String format;
        v();
        pj3 pj3Var = (pj3) this.m;
        qi3 qi3Var = pj3Var.q;
        vh3 vh3Var = pj3Var.r;
        pj3.k(qi3Var);
        if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zq3 zq3Var = pj3Var.u;
            pj3.k(zq3Var);
            zq3Var.u0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            pj3.m(vh3Var);
            vh3Var.y.b("Analytics Storage consent is not granted");
            format = null;
        }
        pj3.m(vh3Var);
        vh3Var.y.b("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.A = format;
        pj3Var.w.getClass();
        this.B = System.currentTimeMillis();
    }

    public final String C() {
        x();
        ll3.v(this.o);
        return this.o;
    }

    public final String D() {
        v();
        x();
        ll3.v(this.z);
        return this.z;
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return true;
    }
}
