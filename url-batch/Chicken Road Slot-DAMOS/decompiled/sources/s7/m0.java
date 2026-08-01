package s7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 extends g0 {
    public final String A;
    public int B;
    public String C;
    public String D;
    public long E;
    public String F;

    /* renamed from: i, reason: collision with root package name */
    public String f8831i;

    /* renamed from: r, reason: collision with root package name */
    public String f8832r;

    /* renamed from: s, reason: collision with root package name */
    public int f8833s;

    /* renamed from: t, reason: collision with root package name */
    public String f8834t;

    /* renamed from: u, reason: collision with root package name */
    public String f8835u;

    /* renamed from: v, reason: collision with root package name */
    public long f8836v;

    /* renamed from: w, reason: collision with root package name */
    public final long f8837w;

    /* renamed from: x, reason: collision with root package name */
    public final long f8838x;

    /* renamed from: y, reason: collision with root package name */
    public List f8839y;

    /* renamed from: z, reason: collision with root package name */
    public String f8840z;

    public m0(q1 q1Var, long j, long j3, String str) {
        super(q1Var);
        this.E = 0L;
        this.F = null;
        this.f8837w = j;
        this.f8838x = j3;
        this.A = str;
    }

    @Override // s7.g0
    public final boolean v() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r4 w(String str) {
        String str2;
        String str3;
        boolean z10;
        long j;
        boolean z11;
        Class<?> loadClass;
        long j3;
        String str4;
        long a9;
        long j10;
        String str5;
        q1 q1Var;
        boolean z12;
        int i3;
        int i10;
        long j11;
        ApplicationInfo d10;
        d0 d0Var;
        String str6;
        int i11;
        long j12;
        int extensionVersion;
        s();
        String y3 = y();
        String z13 = z();
        t();
        String str7 = this.f8832r;
        t();
        long j13 = this.f8833s;
        t();
        c7.c0.g(this.f8834t);
        String str8 = this.f8834t;
        q1 q1Var2 = (q1) this.f1478d;
        g gVar = q1Var2.f8935r;
        v0 v0Var = q1Var2.f8937t;
        g gVar2 = q1Var2.f8935r;
        Context context = q1Var2.f8932d;
        p4 p4Var = q1Var2.f8940w;
        f1 f1Var = q1Var2.f8936s;
        gVar.y();
        t();
        s();
        long j14 = this.f8836v;
        if (j14 == 0) {
            q1.j(p4Var);
            q1 q1Var3 = (q1) p4Var.f1478d;
            String packageName = context.getPackageName();
            p4Var.s();
            c7.c0.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            z10 = false;
            MessageDigest L = p4.L();
            long j15 = -1;
            if (L == null) {
                v0 v0Var2 = q1Var3.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.a("Could not get MD5 instance");
                str2 = z13;
                str3 = str7;
            } else {
                if (packageManager != null) {
                    try {
                        if (p4Var.a0(context, packageName)) {
                            str2 = z13;
                            str3 = str7;
                            j15 = 0;
                        } else {
                            str2 = z13;
                            try {
                                str3 = str7;
                                try {
                                    Signature[] signatureArr = i7.b.a(context).e(64, q1Var3.f8932d.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        v0 v0Var3 = q1Var3.f8937t;
                                        q1.l(v0Var3);
                                        v0Var3.f9053w.a("Could not get signatures");
                                    } else {
                                        j15 = p4.M(L.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e2) {
                                    e = e2;
                                    v0 v0Var4 = q1Var3.f8937t;
                                    q1.l(v0Var4);
                                    v0Var4.f9050t.b(e, "Package name not found");
                                    j = 0;
                                    this.f8836v = j;
                                    boolean c10 = q1Var2.c();
                                    q1.j(f1Var);
                                    boolean z14 = !f1Var.F;
                                    s();
                                    if (q1Var2.c()) {
                                    }
                                    j3 = j;
                                    str4 = null;
                                    q1.j(f1Var);
                                    a9 = f1Var.f8685t.a();
                                    long j16 = q1Var2.R;
                                    if (a9 != 0) {
                                    }
                                    t();
                                    int i12 = this.B;
                                    Boolean F = gVar2.F("google_analytics_adid_collection_enabled");
                                    if (F != null) {
                                    }
                                    q1.j(f1Var);
                                    f1Var.s();
                                    String str9 = str4;
                                    boolean z15 = f1Var.w().getBoolean("deferred_analytics_collection", z10);
                                    Boolean valueOf = Boolean.valueOf(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true) == z1.GRANTED);
                                    List list = this.f8839y;
                                    String g = f1Var.z().g();
                                    if (this.f8840z == null) {
                                    }
                                    String str10 = this.f8840z;
                                    boolean z16 = r3;
                                    if (f1Var.z().i(b2.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean F2 = gVar2.F("google_analytics_sgtm_upload_enabled");
                                    if (F2 != null) {
                                    }
                                    q1.j(p4Var);
                                    q1Var = (q1) p4Var.f1478d;
                                    String y10 = y();
                                    String str11 = str5;
                                    if (q1Var.f8932d.getPackageManager() != null) {
                                    }
                                    q1.j(f1Var);
                                    int i13 = f1Var.z().f8557b;
                                    q1.j(f1Var);
                                    f1Var.s();
                                    String str12 = o.b(f1Var.w().getString("dma_consent_settings", null)).f8888b;
                                    com.google.android.gms.internal.measurement.i4.a();
                                    d0Var = e0.P0;
                                    if (gVar2.D(null, d0Var)) {
                                    }
                                    i11 = 0;
                                    com.google.android.gms.internal.measurement.i4.a();
                                    if (gVar2.D(null, d0Var)) {
                                    }
                                    String str13 = gVar2.f8700i;
                                    int i14 = i11;
                                    String valueOf2 = String.valueOf(c2.h(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j17 = q1Var2.R;
                                    q1.i(q1Var2.I);
                                    if (gVar2.D(null, e0.f8619e1)) {
                                    }
                                    return new r4(y3, str2, str3, j13, str8, 161000L, j3, str, z11, z14, str9, j10, i12, z16, z15, valueOf, this.f8837w, list, g, str10, str11, z12, j11, i13, str6, i14, j12, str13, valueOf2, j17, v4.a.c(q1Var2.I.x()), gVar2.D(null, e0.f8619e1) ? q1Var2.S : 0L);
                                }
                            } catch (PackageManager.NameNotFoundException e9) {
                                e = e9;
                                str3 = str7;
                                v0 v0Var42 = q1Var3.f8937t;
                                q1.l(v0Var42);
                                v0Var42.f9050t.b(e, "Package name not found");
                                j = 0;
                                this.f8836v = j;
                                boolean c102 = q1Var2.c();
                                q1.j(f1Var);
                                boolean z142 = !f1Var.F;
                                s();
                                if (q1Var2.c()) {
                                }
                                j3 = j;
                                str4 = null;
                                q1.j(f1Var);
                                a9 = f1Var.f8685t.a();
                                long j162 = q1Var2.R;
                                if (a9 != 0) {
                                }
                                t();
                                int i122 = this.B;
                                Boolean F3 = gVar2.F("google_analytics_adid_collection_enabled");
                                if (F3 != null) {
                                }
                                q1.j(f1Var);
                                f1Var.s();
                                String str92 = str4;
                                boolean z152 = f1Var.w().getBoolean("deferred_analytics_collection", z10);
                                Boolean valueOf3 = Boolean.valueOf(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true) == z1.GRANTED);
                                List list2 = this.f8839y;
                                String g2 = f1Var.z().g();
                                if (this.f8840z == null) {
                                }
                                String str102 = this.f8840z;
                                boolean z162 = r3;
                                if (f1Var.z().i(b2.ANALYTICS_STORAGE)) {
                                }
                                Boolean F22 = gVar2.F("google_analytics_sgtm_upload_enabled");
                                if (F22 != null) {
                                }
                                q1.j(p4Var);
                                q1Var = (q1) p4Var.f1478d;
                                String y102 = y();
                                String str112 = str5;
                                if (q1Var.f8932d.getPackageManager() != null) {
                                }
                                q1.j(f1Var);
                                int i132 = f1Var.z().f8557b;
                                q1.j(f1Var);
                                f1Var.s();
                                String str122 = o.b(f1Var.w().getString("dma_consent_settings", null)).f8888b;
                                com.google.android.gms.internal.measurement.i4.a();
                                d0Var = e0.P0;
                                if (gVar2.D(null, d0Var)) {
                                }
                                i11 = 0;
                                com.google.android.gms.internal.measurement.i4.a();
                                if (gVar2.D(null, d0Var)) {
                                }
                                String str132 = gVar2.f8700i;
                                int i142 = i11;
                                String valueOf22 = String.valueOf(c2.h(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j172 = q1Var2.R;
                                q1.i(q1Var2.I);
                                if (gVar2.D(null, e0.f8619e1)) {
                                }
                                return new r4(y3, str2, str3, j13, str8, 161000L, j3, str, z11, z142, str92, j10, i122, z162, z152, valueOf3, this.f8837w, list2, g2, str102, str112, z12, j11, i132, str6, i142, j12, str132, valueOf22, j172, v4.a.c(q1Var2.I.x()), gVar2.D(null, e0.f8619e1) ? q1Var2.S : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        e = e10;
                        str2 = z13;
                    }
                } else {
                    str2 = z13;
                    str3 = str7;
                }
                j = 0;
                this.f8836v = j;
            }
            j = j15;
            this.f8836v = j;
        } else {
            str2 = z13;
            str3 = str7;
            z10 = false;
            j = j14;
        }
        boolean c1022 = q1Var2.c();
        q1.j(f1Var);
        boolean z1422 = !f1Var.F;
        s();
        if (q1Var2.c()) {
            z11 = c1022;
            if (gVar2.D(null, e0.H0)) {
                q1.l(v0Var);
                v0Var.B.a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    j3 = j;
                    try {
                        Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                        if (invoke == null) {
                            str4 = null;
                        } else {
                            try {
                                str4 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                q1.l(v0Var);
                                v0Var.f9055y.a("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        q1.l(v0Var);
                        v0Var.f9054x.a("Failed to obtain Firebase Analytics instance");
                    }
                    q1.j(f1Var);
                    a9 = f1Var.f8685t.a();
                    long j1622 = q1Var2.R;
                    if (a9 != 0) {
                        j1622 = Math.min(j1622, a9);
                    }
                    t();
                    int i1222 = this.B;
                    Boolean F32 = gVar2.F("google_analytics_adid_collection_enabled");
                    boolean z17 = (F32 != null || F32.booleanValue()) ? true : z10;
                    q1.j(f1Var);
                    f1Var.s();
                    String str922 = str4;
                    boolean z1522 = f1Var.w().getBoolean("deferred_analytics_collection", z10);
                    Boolean valueOf32 = Boolean.valueOf(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true) == z1.GRANTED);
                    List list22 = this.f8839y;
                    String g22 = f1Var.z().g();
                    if (this.f8840z == null) {
                        q1.j(p4Var);
                        this.f8840z = p4Var.p0();
                    }
                    String str1022 = this.f8840z;
                    boolean z1622 = z17;
                    if (f1Var.z().i(b2.ANALYTICS_STORAGE)) {
                        j10 = j1622;
                        str5 = null;
                    } else {
                        s();
                        j10 = j1622;
                        if (this.E != 0) {
                            q1Var2.f8942y.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.E;
                            if (this.D != null && currentTimeMillis > 86400000 && this.F == null) {
                                x();
                            }
                        }
                        if (this.D == null) {
                            x();
                        }
                        str5 = this.D;
                    }
                    Boolean F222 = gVar2.F("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = F222 != null ? false : F222.booleanValue();
                    q1.j(p4Var);
                    q1Var = (q1) p4Var.f1478d;
                    String y1022 = y();
                    String str1122 = str5;
                    if (q1Var.f8932d.getPackageManager() != null) {
                        z12 = booleanValue;
                        j11 = 0;
                    } else {
                        try {
                            z12 = booleanValue;
                            i3 = 0;
                            try {
                                d10 = i7.b.a(q1Var.f8932d).d(0, y1022);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                v0 v0Var5 = q1Var.f8937t;
                                q1.l(v0Var5);
                                v0Var5.f9056z.b(y1022, "PackageManager failed to find running app: app_id");
                                i10 = i3;
                                j11 = i10;
                                q1.j(f1Var);
                                int i1322 = f1Var.z().f8557b;
                                q1.j(f1Var);
                                f1Var.s();
                                String str1222 = o.b(f1Var.w().getString("dma_consent_settings", null)).f8888b;
                                com.google.android.gms.internal.measurement.i4.a();
                                d0Var = e0.P0;
                                if (gVar2.D(null, d0Var)) {
                                }
                                i11 = 0;
                                com.google.android.gms.internal.measurement.i4.a();
                                if (gVar2.D(null, d0Var)) {
                                }
                                String str1322 = gVar2.f8700i;
                                int i1422 = i11;
                                String valueOf222 = String.valueOf(c2.h(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j1722 = q1Var2.R;
                                q1.i(q1Var2.I);
                                if (gVar2.D(null, e0.f8619e1)) {
                                }
                                return new r4(y3, str2, str3, j13, str8, 161000L, j3, str, z11, z1422, str922, j10, i1222, z1622, z1522, valueOf32, this.f8837w, list22, g22, str1022, str1122, z12, j11, i1322, str6, i1422, j12, str1322, valueOf222, j1722, v4.a.c(q1Var2.I.x()), gVar2.D(null, e0.f8619e1) ? q1Var2.S : 0L);
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            z12 = booleanValue;
                            i3 = 0;
                        }
                        if (d10 != null) {
                            i10 = d10.targetSdkVersion;
                            j11 = i10;
                        }
                        i10 = i3;
                        j11 = i10;
                    }
                    q1.j(f1Var);
                    int i13222 = f1Var.z().f8557b;
                    q1.j(f1Var);
                    f1Var.s();
                    String str12222 = o.b(f1Var.w().getString("dma_consent_settings", null)).f8888b;
                    com.google.android.gms.internal.measurement.i4.a();
                    d0Var = e0.P0;
                    if (gVar2.D(null, d0Var)) {
                        q1.j(p4Var);
                        str6 = str12222;
                        if (Build.VERSION.SDK_INT >= 30) {
                            extensionVersion = SdkExtensions.getExtensionVersion(30);
                            if (extensionVersion > 3) {
                                i11 = SdkExtensions.getExtensionVersion(1000000);
                                com.google.android.gms.internal.measurement.i4.a();
                                if (gVar2.D(null, d0Var)) {
                                    j12 = 0;
                                } else {
                                    q1.j(p4Var);
                                    j12 = p4Var.P();
                                }
                                String str13222 = gVar2.f8700i;
                                int i14222 = i11;
                                String valueOf2222 = String.valueOf(c2.h(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j17222 = q1Var2.R;
                                q1.i(q1Var2.I);
                                return new r4(y3, str2, str3, j13, str8, 161000L, j3, str, z11, z1422, str922, j10, i1222, z1622, z1522, valueOf32, this.f8837w, list22, g22, str1022, str1122, z12, j11, i13222, str6, i14222, j12, str13222, valueOf2222, j17222, v4.a.c(q1Var2.I.x()), gVar2.D(null, e0.f8619e1) ? q1Var2.S : 0L);
                            }
                        }
                    } else {
                        str6 = str12222;
                    }
                    i11 = 0;
                    com.google.android.gms.internal.measurement.i4.a();
                    if (gVar2.D(null, d0Var)) {
                    }
                    String str132222 = gVar2.f8700i;
                    int i142222 = i11;
                    String valueOf22222 = String.valueOf(c2.h(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j172222 = q1Var2.R;
                    q1.i(q1Var2.I);
                    if (gVar2.D(null, e0.f8619e1)) {
                    }
                    return new r4(y3, str2, str3, j13, str8, 161000L, j3, str, z11, z1422, str922, j10, i1222, z1622, z1522, valueOf32, this.f8837w, list22, g22, str1022, str1122, z12, j11, i13222, str6, i142222, j12, str132222, valueOf22222, j172222, v4.a.c(q1Var2.I.x()), gVar2.D(null, e0.f8619e1) ? q1Var2.S : 0L);
                }
            }
        } else {
            z11 = c1022;
        }
        j3 = j;
        str4 = null;
        q1.j(f1Var);
        a9 = f1Var.f8685t.a();
        long j16222 = q1Var2.R;
        if (a9 != 0) {
        }
        t();
        int i12222 = this.B;
        Boolean F322 = gVar2.F("google_analytics_adid_collection_enabled");
        if (F322 != null) {
        }
        q1.j(f1Var);
        f1Var.s();
        String str9222 = str4;
        boolean z15222 = f1Var.w().getBoolean("deferred_analytics_collection", z10);
        Boolean valueOf322 = Boolean.valueOf(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true) == z1.GRANTED);
        List list222 = this.f8839y;
        String g222 = f1Var.z().g();
        if (this.f8840z == null) {
        }
        String str10222 = this.f8840z;
        boolean z16222 = z17;
        if (f1Var.z().i(b2.ANALYTICS_STORAGE)) {
        }
        Boolean F2222 = gVar2.F("google_analytics_sgtm_upload_enabled");
        if (F2222 != null) {
        }
        q1.j(p4Var);
        q1Var = (q1) p4Var.f1478d;
        String y10222 = y();
        String str11222 = str5;
        if (q1Var.f8932d.getPackageManager() != null) {
        }
        q1.j(f1Var);
        int i132222 = f1Var.z().f8557b;
        q1.j(f1Var);
        f1Var.s();
        String str122222 = o.b(f1Var.w().getString("dma_consent_settings", null)).f8888b;
        com.google.android.gms.internal.measurement.i4.a();
        d0Var = e0.P0;
        if (gVar2.D(null, d0Var)) {
        }
        i11 = 0;
        com.google.android.gms.internal.measurement.i4.a();
        if (gVar2.D(null, d0Var)) {
        }
        String str1322222 = gVar2.f8700i;
        int i1422222 = i11;
        String valueOf222222 = String.valueOf(c2.h(gVar2.I("google_analytics_default_allow_ad_personalization_signals", true)));
        long j1722222 = q1Var2.R;
        q1.i(q1Var2.I);
        if (gVar2.D(null, e0.f8619e1)) {
        }
        return new r4(y3, str2, str3, j13, str8, 161000L, j3, str, z11, z1422, str9222, j10, i12222, z16222, z15222, valueOf322, this.f8837w, list222, g222, str10222, str11222, z12, j11, i132222, str6, i1422222, j12, str1322222, valueOf222222, j1722222, v4.a.c(q1Var2.I.x()), gVar2.D(null, e0.f8619e1) ? q1Var2.S : 0L);
    }

    public final void x() {
        String format;
        s();
        q1 q1Var = (q1) this.f1478d;
        f1 f1Var = q1Var.f8936s;
        v0 v0Var = q1Var.f8937t;
        q1.j(f1Var);
        if (f1Var.z().i(b2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            p4 p4Var = q1Var.f8940w;
            q1.j(p4Var);
            p4Var.r0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            q1.l(v0Var);
            v0Var.A.a("Analytics Storage consent is not granted");
            format = null;
        }
        q1.l(v0Var);
        v0Var.A.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.D = format;
        q1Var.f8942y.getClass();
        this.E = System.currentTimeMillis();
    }

    public final String y() {
        t();
        c7.c0.g(this.f8831i);
        return this.f8831i;
    }

    public final String z() {
        s();
        t();
        c7.c0.g(this.C);
        return this.C;
    }
}
