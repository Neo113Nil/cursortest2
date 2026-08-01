package f8;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.fd;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.jd;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.oc;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.sc;
import com.google.android.gms.internal.measurement.u5;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.vc;
import com.google.android.gms.internal.measurement.wc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import m.t1;
import s7.b2;
import s7.c2;
import s7.d1;
import s7.d2;
import s7.e1;
import s7.e2;
import s7.f1;
import s7.g1;
import s7.g2;
import s7.g3;
import s7.h1;
import s7.j3;
import s7.j4;
import s7.k3;
import s7.l3;
import s7.o1;
import s7.o3;
import s7.p4;
import s7.q1;
import s7.q2;
import s7.r4;
import s7.t3;
import s7.v2;
import s7.w1;
import s7.x3;
import s7.y1;
import s7.y2;
import s7.z1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4152d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4153e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4154i;

    public j0(q2 q2Var, f6 f6Var) {
        this.f4152d = 18;
        this.f4153e = f6Var;
        Objects.requireNonNull(q2Var);
        this.f4154i = q2Var;
    }

    private final void a() {
        try {
            ((Runnable) this.f4154i).run();
            synchronized (((d6.l) this.f4153e).f3642s) {
                ((d6.l) this.f4153e).a();
            }
        } catch (Throwable th) {
            synchronized (((d6.l) this.f4153e).f3642s) {
                ((d6.l) this.f4153e).a();
                throw th;
            }
        }
    }

    private final void b() {
        int i3 = 0;
        while (true) {
            try {
                ((Runnable) this.f4153e).run();
            } catch (Throwable th) {
                ge.a0.o(th, kotlin.coroutines.g.f5592d);
            }
            Runnable P = ((le.h) this.f4154i).P();
            if (P == null) {
                return;
            }
            try {
                this.f4153e = P;
                i3++;
                if (i3 >= 16) {
                    le.h hVar = (le.h) this.f4154i;
                    if (le.b.i(hVar.f5979r, hVar)) {
                        le.h hVar2 = (le.h) this.f4154i;
                        le.b.h(hVar2.f5979r, hVar2, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                le.h hVar3 = (le.h) this.f4154i;
                synchronized (hVar3.f5982u) {
                    le.h.f5977v.decrementAndGet(hVar3);
                    throw th2;
                }
            }
        }
    }

    private final void c() {
        try {
            e();
        } catch (Error e2) {
            synchronized (((m8.j) this.f4154i).f6604e) {
                ((m8.j) this.f4154i).f6605i = 1;
                throw e2;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:23|(1:25)(9:260|261|262|263|(1:265)(2:286|(4:288|267|268|(27:270|(1:272)(1:284)|273|274|276|277|278|27|28|(2:30|(2:32|(2:34|(2:36|(2:38|(2:40|(1:42)(1:253))(1:254))(1:255))(1:256))(1:257))(1:258))(1:259)|43|44|45|(1:47)(1:250)|48|(1:50)(1:249)|51|(1:53)|55|(1:57)(2:246|(7:248|(3:238|239|(1:241)(1:242))|(5:61|(1:63)(3:229|(3:232|(1:234)(1:235)|230)|236)|(1:65)(1:228)|66|(36:68|(1:70)(1:225)|71|(1:73)|74|(1:76)(1:224)|77|(1:79)|(3:223|81|(1:83))|84|(3:218|219|(19:221|98|(1:100)(1:214)|101|(1:103)|104|(2:208|(1:213))(1:108)|109|(3:204|(1:206)|207)|113|(1:115)|116|(1:120)|121|(3:123|(7:125|(1:127)(1:160)|128|(1:130)|131|(4:135|(1:137)|138|(1:140))|141)(1:161)|142)(10:162|(4:164|(2:167|(6:169|(1:171)(1:201)|172|(1:174)|175|176))|202|176)(1:203)|177|(1:179)|180|181|182|183|184|(5:186|(1:188)(1:196)|(1:192)|(1:194)|195))|143|(3:145|(1:147)(1:156)|(5:149|(1:151)|152|(1:154)|155))|157|158))(1:87)|88|(1:(1:215)(24:97|98|(0)(0)|101|(0)|104|(1:106)|208|(1:213)|109|(1:111)|204|(0)|207|113|(0)|116|(2:118|120)|121|(0)(0)|143|(0)|157|158))(1:217)|216|(0)(0)|101|(0)|104|(0)|208|(0)|109|(0)|204|(0)|207|113|(0)|116|(0)|121|(0)(0)|143|(0)|157|158)(2:226|227))|237|(0)(0)|66|(0)(0)))|58|(0)|(0)|237|(0)(0)|66|(0)(0))))|266|267|268|(0))|26|27|28|(0)(0)|43|44|45|(0)(0)|48|(0)(0)|51|(0)|55|(0)(0)|58|(0)|(0)|237|(0)(0)|66|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:260|(2:261|262)|263|(1:265)(2:286|(4:288|267|268|(27:270|(1:272)(1:284)|273|274|276|277|278|27|28|(2:30|(2:32|(2:34|(2:36|(2:38|(2:40|(1:42)(1:253))(1:254))(1:255))(1:256))(1:257))(1:258))(1:259)|43|44|45|(1:47)(1:250)|48|(1:50)(1:249)|51|(1:53)|55|(1:57)(2:246|(7:248|(3:238|239|(1:241)(1:242))|(5:61|(1:63)(3:229|(3:232|(1:234)(1:235)|230)|236)|(1:65)(1:228)|66|(36:68|(1:70)(1:225)|71|(1:73)|74|(1:76)(1:224)|77|(1:79)|(3:223|81|(1:83))|84|(3:218|219|(19:221|98|(1:100)(1:214)|101|(1:103)|104|(2:208|(1:213))(1:108)|109|(3:204|(1:206)|207)|113|(1:115)|116|(1:120)|121|(3:123|(7:125|(1:127)(1:160)|128|(1:130)|131|(4:135|(1:137)|138|(1:140))|141)(1:161)|142)(10:162|(4:164|(2:167|(6:169|(1:171)(1:201)|172|(1:174)|175|176))|202|176)(1:203)|177|(1:179)|180|181|182|183|184|(5:186|(1:188)(1:196)|(1:192)|(1:194)|195))|143|(3:145|(1:147)(1:156)|(5:149|(1:151)|152|(1:154)|155))|157|158))(1:87)|88|(1:(1:215)(24:97|98|(0)(0)|101|(0)|104|(1:106)|208|(1:213)|109|(1:111)|204|(0)|207|113|(0)|116|(2:118|120)|121|(0)(0)|143|(0)|157|158))(1:217)|216|(0)(0)|101|(0)|104|(0)|208|(0)|109|(0)|204|(0)|207|113|(0)|116|(0)|121|(0)(0)|143|(0)|157|158)(2:226|227))|237|(0)(0)|66|(0)(0)))|58|(0)|(0)|237|(0)(0)|66|(0)(0))))|266|267|268|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0270, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0271, code lost:
    
        s7.q1.l(r13);
        r13.f9050t.c(s7.v0.A(r14), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01a5, code lost:
    
        r5 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03f1, code lost:
    
        if (r11.P() == 1) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x024f A[Catch: IllegalStateException -> 0x0270, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:45:0x0246, B:48:0x0255, B:51:0x025d, B:53:0x0261, B:250:0x024f), top: B:44:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0188 A[Catch: NameNotFoundException -> 0x01a5, TryCatch #3 {NameNotFoundException -> 0x01a5, blocks: (B:268:0x017d, B:270:0x0188, B:272:0x0194), top: B:267:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0261 A[Catch: IllegalStateException -> 0x0270, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:45:0x0246, B:48:0x0255, B:51:0x025d, B:53:0x0261, B:250:0x024f), top: B:44:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032f  */
    /* JADX WARN: Type inference failed for: r0v44, types: [s7.p2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        s7.m0 m0Var;
        String str;
        String str2;
        PackageManager packageManager;
        int i3;
        String str3;
        PackageInfo packageInfo;
        int g;
        List<String> list;
        Bundle E;
        Integer valueOf;
        v2 v2Var;
        q1 q1Var;
        s7.t0 t0Var;
        p4 p4Var;
        c2 c2Var;
        boolean z10;
        c2 c2Var2;
        q1 q1Var2;
        z1 I;
        z1 I2;
        Boolean F;
        d1 d1Var;
        h1 h1Var;
        q1 q1Var3;
        p4 p4Var2;
        b7.o0 o0Var;
        s7.v0 v0Var;
        s7.t0 t0Var2;
        String str4;
        Bundle bundle;
        q1 q1Var4 = (q1) this.f4154i;
        e2 e2Var = (e2) this.f4153e;
        o1 o1Var = q1Var4.f8938u;
        s7.v0 v0Var2 = q1Var4.f8937t;
        f1 f1Var = q1Var4.f8936s;
        p4 p4Var3 = q1Var4.f8940w;
        q1.l(o1Var);
        o1Var.s();
        s7.g gVar = q1Var4.f8935r;
        ((q1) gVar.f1478d).getClass();
        s7.p pVar = new s7.p(q1Var4);
        pVar.v();
        q1Var4.G = pVar;
        n6 n6Var = e2Var.f8672d;
        long j = n6Var == null ? 0L : n6Var.f2570d;
        String str5 = "";
        if (n6Var != null && (bundle = n6Var.f2573r) != null) {
            str5 = bundle.getString("runtime_google_app_id", "");
        }
        s7.m0 m0Var2 = new s7.m0(q1Var4, e2Var.f8671c, j, str5);
        m0Var2.u();
        q1Var4.H = m0Var2;
        s7.o0 o0Var2 = new s7.o0(q1Var4);
        o0Var2.u();
        q1Var4.E = o0Var2;
        l3 l3Var = new l3(q1Var4);
        l3Var.u();
        q1Var4.F = l3Var;
        boolean z11 = p4Var3.f9095e;
        q1 q1Var5 = (q1) p4Var3.f1478d;
        if (z11) {
            kotlin.collections.i0.l("Can't initialize twice");
            return;
        }
        p4Var3.s();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                s7.v0 v0Var3 = ((q1) p4Var3.f1478d).f8937t;
                q1.l(v0Var3);
                v0Var3.f9053w.a("Utils falling back to Random for random id");
            }
        }
        p4Var3.f8921r.set(nextLong);
        q1Var5.Q.incrementAndGet();
        p4Var3.f9095e = true;
        if (f1Var.f9095e) {
            kotlin.collections.i0.l("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences = ((q1) f1Var.f1478d).f8932d.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        f1Var.f8682i = sharedPreferences;
        boolean z12 = sharedPreferences.getBoolean("has_been_opened", false);
        f1Var.F = z12;
        if (!z12) {
            SharedPreferences.Editor edit = f1Var.f8682i.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        f1Var.f8684s = new e1(f1Var, Math.max(0L, ((Long) s7.e0.f8614d.a(null)).longValue()));
        ((q1) f1Var.f1478d).Q.incrementAndGet();
        f1Var.f9095e = true;
        s7.m0 m0Var3 = q1Var4.H;
        if (m0Var3.f8703e) {
            kotlin.collections.i0.l("Can't initialize twice");
            return;
        }
        q1 q1Var6 = (q1) m0Var3.f1478d;
        s7.v0 v0Var4 = q1Var6.f8937t;
        s7.v0 v0Var5 = q1Var6.f8937t;
        q1.l(v0Var4);
        v0Var4.B.c(Long.valueOf(m0Var3.f8838x), Long.valueOf(m0Var3.f8837w), "sdkVersion bundled with app, dynamiteVersion");
        Context context = q1Var6.f8932d;
        String packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        String str6 = "";
        String str7 = "Unknown";
        String str8 = "unknown";
        if (packageManager2 == null) {
            q1.l(v0Var5);
            m0Var = m0Var2;
            str = "Can't initialize twice";
            v0Var5.f9050t.b(s7.v0.A(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            m0Var = m0Var2;
            str = "Can't initialize twice";
            try {
                str8 = packageManager2.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                q1.l(v0Var5);
                v0Var5.f9050t.b(s7.v0.A(packageName), "Error retrieving app installer package name. appId");
            }
            String str9 = str8;
            if (str9 == null) {
                str9 = "manual_install";
            } else if ("com.android.vending".equals(str9)) {
                str8 = "";
                packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                    str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    try {
                        i3 = packageInfo.versionCode;
                        packageManager = packageManager2;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        str7 = str3;
                        q1.l(v0Var5);
                        packageManager = packageManager2;
                        v0Var5.f9050t.c(s7.v0.A(packageName), str2, "Error retrieving package info. appId, appName");
                        i3 = Integer.MIN_VALUE;
                        str3 = str7;
                        String str10 = str8;
                        m0Var3.f8831i = packageName;
                        m0Var3.f8834t = str10;
                        m0Var3.f8832r = str3;
                        m0Var3.f8833s = i3;
                        m0Var3.f8835u = str2;
                        m0Var3.f8836v = 0L;
                        g = q1Var6.g();
                        if (g == 0) {
                        }
                        m0Var3.C = "";
                        str4 = m0Var3.A;
                        if (TextUtils.isEmpty(str4)) {
                        }
                        if (!TextUtils.isEmpty(str4)) {
                        }
                        m0Var3.C = str6;
                        if (g == 0) {
                        }
                        list = null;
                        m0Var3.f8839y = null;
                        s7.g gVar2 = q1Var6.f8935r;
                        q1 q1Var7 = (q1) gVar2.f1478d;
                        c7.c0.d("analytics.safelisted_events");
                        E = gVar2.E();
                        if (E == null) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        if (list != null) {
                        }
                        m0Var3.f8839y = list;
                        if (packageManager != null) {
                        }
                        ((q1) m0Var3.f1478d).Q.incrementAndGet();
                        m0Var3.f8703e = true;
                        v2Var = new v2(q1Var4);
                        v2Var.u();
                        q1Var4.I = v2Var;
                        if (v2Var.f8703e) {
                        }
                    }
                    String str102 = str8;
                    m0Var3.f8831i = packageName;
                    m0Var3.f8834t = str102;
                    m0Var3.f8832r = str3;
                    m0Var3.f8833s = i3;
                    m0Var3.f8835u = str2;
                    m0Var3.f8836v = 0L;
                    g = q1Var6.g();
                    if (g == 0) {
                        q1.l(v0Var5);
                        v0Var5.B.a("App measurement collection enabled");
                    } else if (g == 1) {
                        q1.l(v0Var5);
                        v0Var5.f9056z.a("App measurement deactivated via the manifest");
                    } else if (g == 3) {
                        q1.l(v0Var5);
                        v0Var5.f9056z.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                    } else if (g == 4) {
                        q1.l(v0Var5);
                        v0Var5.f9056z.a("App measurement disabled via the manifest");
                    } else if (g == 6) {
                        q1.l(v0Var5);
                        v0Var5.f9055y.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                    } else if (g == 7) {
                        q1.l(v0Var5);
                        v0Var5.f9056z.a("App measurement disabled via the global data collection setting");
                    } else if (g != 8) {
                        q1.l(v0Var5);
                        v0Var5.f9056z.a("App measurement disabled");
                        q1.l(v0Var5);
                        v0Var5.f9051u.a("Invalid scion state in identity");
                    } else {
                        q1.l(v0Var5);
                        v0Var5.f9056z.a("App measurement disabled due to denied storage consent");
                    }
                    m0Var3.C = "";
                    str4 = m0Var3.A;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = d2.b(context, q1Var6.D);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str6 = str4;
                    }
                    m0Var3.C = str6;
                    if (g == 0) {
                        q1.l(v0Var5);
                        v0Var5.B.c(m0Var3.f8831i, m0Var3.C, "App measurement enabled for app package, google app id");
                    }
                    list = null;
                    m0Var3.f8839y = null;
                    s7.g gVar22 = q1Var6.f8935r;
                    q1 q1Var72 = (q1) gVar22.f1478d;
                    c7.c0.d("analytics.safelisted_events");
                    E = gVar22.E();
                    if (E == null) {
                        s7.v0 v0Var6 = q1Var72.f8937t;
                        q1.l(v0Var6);
                        v0Var6.f9050t.a("Failed to load metadata: Metadata bundle is null");
                    } else if (E.containsKey("analytics.safelisted_events")) {
                        valueOf = Integer.valueOf(E.getInt("analytics.safelisted_events"));
                        if (valueOf != null) {
                            try {
                                String[] stringArray = q1Var72.f8932d.getResources().getStringArray(valueOf.intValue());
                                if (stringArray != null) {
                                    list = Arrays.asList(stringArray);
                                }
                            } catch (Resources.NotFoundException e2) {
                                s7.v0 v0Var7 = q1Var72.f8937t;
                                q1.l(v0Var7);
                                v0Var7.f9050t.b(e2, "Failed to load string array from metadata: resource not found");
                            }
                        }
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (String str11 : list) {
                                    p4 p4Var4 = q1Var6.f8940w;
                                    q1.j(p4Var4);
                                    if (!p4Var4.w0("safelisted event", str11)) {
                                        break;
                                    }
                                }
                            } else {
                                q1.l(v0Var5);
                                v0Var5.f9055y.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                m0Var3.B = i7.a.W(context) ? 1 : 0;
                            } else {
                                m0Var3.B = 0;
                            }
                            ((q1) m0Var3.f1478d).Q.incrementAndGet();
                            m0Var3.f8703e = true;
                            v2Var = new v2(q1Var4);
                            v2Var.u();
                            q1Var4.I = v2Var;
                            if (v2Var.f8703e) {
                                kotlin.collections.i0.l(str);
                                return;
                            }
                            v2Var.f9061i = (JobScheduler) ((q1) v2Var.f1478d).f8932d.getSystemService("jobscheduler");
                            ((q1) v2Var.f1478d).Q.incrementAndGet();
                            v2Var.f8703e = true;
                            q1.l(v0Var2);
                            s7.t0 t0Var3 = v0Var2.A;
                            s7.t0 t0Var4 = v0Var2.f9056z;
                            s7.t0 t0Var5 = v0Var2.B;
                            s7.t0 t0Var6 = v0Var2.f9050t;
                            gVar.y();
                            t0Var4.b(161000L, "App measurement initialized, version");
                            q1.l(v0Var2);
                            t0Var4.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            String y3 = m0Var.y();
                            if (p4Var3.X(y3, gVar.f8700i)) {
                                q1.l(v0Var2);
                                t0Var4.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                q1.l(v0Var2);
                                t0Var4.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(y3)));
                            }
                            q1.l(v0Var2);
                            t0Var3.a("Debug-level message logging enabled");
                            int i10 = q1Var4.O;
                            AtomicInteger atomicInteger = q1Var4.Q;
                            if (i10 != atomicInteger.get()) {
                                q1.l(v0Var2);
                                t0Var6.c(Integer.valueOf(q1Var4.O), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            q1Var4.J = true;
                            long j3 = q1Var4.R;
                            final q2 q2Var = q1Var4.A;
                            o1 o1Var2 = q1Var4.f8938u;
                            q1.l(o1Var2);
                            o1Var2.s();
                            q1.i(q1Var4.I);
                            int x10 = q1Var4.I.x();
                            i4.a();
                            boolean D = gVar.D(null, s7.e0.P0);
                            boolean z13 = x10 == 2;
                            if (D) {
                                p4Var3.s();
                            }
                            if (z13) {
                                z13 = true;
                                p4Var3.s();
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                boolean z14 = z13;
                                k7.e.L(q1Var5.f8932d, new a6.d(q1Var5), intentFilter);
                                s7.v0 v0Var8 = q1Var5.f8937t;
                                q1.l(v0Var8);
                                v0Var8.A.a("Registered app receiver");
                                if (z14) {
                                    q1.i(q1Var4.I);
                                    q1Var4.I.w(((Long) s7.e0.C.a(null)).longValue());
                                }
                            }
                            b7.o0 o0Var3 = f1Var.f8686u;
                            c2 z15 = f1Var.z();
                            int i11 = z15.f8557b;
                            z1 I3 = gVar.I("google_analytics_default_allow_ad_storage", false);
                            z1 I4 = gVar.I("google_analytics_default_allow_analytics_storage", false);
                            b2 b2Var = b2.ANALYTICS_STORAGE;
                            z1 z1Var = z1.UNINITIALIZED;
                            if (I3 == z1Var && I4 == z1Var) {
                                q1Var = q1Var4;
                                t0Var = t0Var6;
                                p4Var = p4Var3;
                            } else {
                                q1Var = q1Var4;
                                t0Var = t0Var6;
                                p4Var = p4Var3;
                                if (c2.l(-10, f1Var.w().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(b2.class);
                                    enumMap.put((EnumMap) b2.AD_STORAGE, (b2) I3);
                                    enumMap.put((EnumMap) b2Var, (b2) I4);
                                    c2Var = new c2(enumMap, -10);
                                    z10 = false;
                                    if (c2Var != null) {
                                        q1.k(q2Var);
                                        q2Var.O(c2Var, true);
                                        c2Var2 = c2Var;
                                    } else {
                                        c2Var2 = z15;
                                    }
                                    q1.k(q2Var);
                                    q1Var2 = (q1) q2Var.f1478d;
                                    q2Var.S(c2Var2);
                                    f1Var.s();
                                    int i12 = s7.o.b(f1Var.w().getString("dma_consent_settings", null)).f8887a;
                                    I = gVar.I("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (I != z1Var) {
                                        q1.l(v0Var2);
                                        t0Var5.b(I, "Default ad personalization consent from Manifest");
                                    }
                                    I2 = gVar.I("google_analytics_default_allow_ad_user_data", true);
                                    if (I2 == z1Var && c2.l(-10, i12)) {
                                        q1.k(q2Var);
                                        EnumMap enumMap2 = new EnumMap(b2.class);
                                        enumMap2.put((EnumMap) b2.AD_USER_DATA, (b2) I2);
                                        q2Var.N(new s7.o(enumMap2, -10, (Boolean) null, (String) null), true);
                                    } else if (!TextUtils.isEmpty(q1Var.q().z()) && (i12 == 0 || i12 == 30)) {
                                        q1.k(q2Var);
                                        q2Var.N(new s7.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                    }
                                    F = gVar.F("google_analytics_tcf_data_enabled");
                                    if (F != null || F.booleanValue()) {
                                        q1.l(v0Var2);
                                        t0Var3.a("TCF client enabled.");
                                        q1.k(q2Var);
                                        q2Var.s();
                                        s7.v0 v0Var9 = q1Var2.f8937t;
                                        q1.l(v0Var9);
                                        v0Var9.A.a("Register tcfPrefChangeListener.");
                                        if (q2Var.H == null) {
                                            q2Var.I = new g2(q2Var, q1Var2, 2);
                                            q2Var.H = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: s7.p2
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str12) {
                                                    q2 q2Var2 = q2.this;
                                                    q2Var2.getClass();
                                                    if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        v0 v0Var10 = ((q1) q2Var2.f1478d).f8937t;
                                                        q1.l(v0Var10);
                                                        v0Var10.B.a("IABTCF_TCString change picked up in listener.");
                                                        g2 g2Var = q2Var2.I;
                                                        c7.c0.g(g2Var);
                                                        g2Var.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        f1 f1Var2 = q1Var2.f8936s;
                                        q1.j(f1Var2);
                                        f1Var2.x().registerOnSharedPreferenceChangeListener(q2Var.H);
                                        q1.k(q2Var);
                                        q2Var.y();
                                    }
                                    d1Var = f1Var.f8685t;
                                    if (d1Var.a() == 0) {
                                        q1.l(v0Var2);
                                        t0Var5.b(Long.valueOf(j3), "Persisting first open");
                                        d1Var.b(j3);
                                    }
                                    q1.k(q2Var);
                                    h1Var = q2Var.E;
                                    if (h1Var.e() && h1Var.d()) {
                                        f1 f1Var3 = h1Var.f8724e.f8936s;
                                        q1.j(f1Var3);
                                        f1Var3.K.e(null);
                                    }
                                    if (q1Var.h()) {
                                        q1Var3 = q1Var;
                                        p4Var2 = p4Var;
                                        if (TextUtils.isEmpty(q1Var3.q().z())) {
                                            o0Var = o0Var3;
                                        } else {
                                            String z16 = q1Var3.q().z();
                                            f1Var.s();
                                            String string = f1Var.w().getString("gmp_app_id", null);
                                            boolean isEmpty = TextUtils.isEmpty(z16);
                                            boolean isEmpty2 = TextUtils.isEmpty(string);
                                            if (!isEmpty && !isEmpty2) {
                                                c7.c0.g(z16);
                                                if (!z16.equals(string)) {
                                                    q1.l(v0Var2);
                                                    t0Var4.a("Rechecking which service to use due to a GMP App Id change");
                                                    f1Var.s();
                                                    f1Var.s();
                                                    Boolean valueOf2 = f1Var.w().contains("measurement_enabled") ? Boolean.valueOf(f1Var.w().getBoolean("measurement_enabled", true)) : null;
                                                    SharedPreferences.Editor edit2 = f1Var.w().edit();
                                                    edit2.clear();
                                                    edit2.apply();
                                                    if (valueOf2 != null) {
                                                        f1Var.s();
                                                        SharedPreferences.Editor edit3 = f1Var.w().edit();
                                                        edit3.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                        edit3.apply();
                                                    }
                                                    q1Var3.n().w();
                                                    q1Var3.F.A();
                                                    q1Var3.F.y();
                                                    d1Var.b(j3);
                                                    o0Var = o0Var3;
                                                    o0Var.e(null);
                                                    String z17 = q1Var3.q().z();
                                                    f1Var.s();
                                                    SharedPreferences.Editor edit4 = f1Var.w().edit();
                                                    edit4.putString("gmp_app_id", z17);
                                                    edit4.apply();
                                                }
                                            }
                                            o0Var = o0Var3;
                                            String z172 = q1Var3.q().z();
                                            f1Var.s();
                                            SharedPreferences.Editor edit42 = f1Var.w().edit();
                                            edit42.putString("gmp_app_id", z172);
                                            edit42.apply();
                                        }
                                        if (!f1Var.z().i(b2Var)) {
                                            o0Var.e(null);
                                        }
                                        q1.k(q2Var);
                                        q2Var.f8948u.set(o0Var.d());
                                        try {
                                            q1Var5.f8932d.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        } catch (ClassNotFoundException unused4) {
                                            b7.o0 o0Var4 = f1Var.J;
                                            if (!TextUtils.isEmpty(o0Var4.d())) {
                                                q1.l(v0Var2);
                                                v0Var = v0Var2;
                                                v0Var.f9053w.a("Remote config removed with active feature rollouts");
                                                o0Var4.e(null);
                                            }
                                        }
                                        v0Var = v0Var2;
                                        if (!TextUtils.isEmpty(q1Var3.q().z())) {
                                            boolean c10 = q1Var3.c();
                                            SharedPreferences sharedPreferences2 = f1Var.f8682i;
                                            if (!(sharedPreferences2 == null ? z10 : sharedPreferences2.contains("deferred_analytics_collection")) && !gVar.G()) {
                                                f1Var.A(!c10);
                                            }
                                            if (c10) {
                                                q1.k(q2Var);
                                                q2Var.E();
                                            }
                                            t3 t3Var = q1Var3.f8939v;
                                            q1.k(t3Var);
                                            t3Var.f9028s.B();
                                            q1Var3.o().w(new AtomicReference());
                                            q1Var3.o().x(f1Var.M.d());
                                        }
                                    } else {
                                        if (q1Var.c()) {
                                            p4Var2 = p4Var;
                                            if (p4Var2.V("android.permission.INTERNET")) {
                                                t0Var2 = t0Var;
                                            } else {
                                                q1.l(v0Var2);
                                                t0Var2 = t0Var;
                                                t0Var2.a("App is missing INTERNET permission");
                                            }
                                            if (!p4Var2.V("android.permission.ACCESS_NETWORK_STATE")) {
                                                q1.l(v0Var2);
                                                t0Var2.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            q1Var3 = q1Var;
                                            Context context2 = q1Var3.f8932d;
                                            if (!i7.b.a(context2).f() && !gVar.v()) {
                                                if (!p4.n0(context2)) {
                                                    q1.l(v0Var2);
                                                    t0Var2.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!p4.N(context2)) {
                                                    q1.l(v0Var2);
                                                    t0Var2.a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            q1.l(v0Var2);
                                            t0Var2.a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            q1Var3 = q1Var;
                                            p4Var2 = p4Var;
                                        }
                                        v0Var = v0Var2;
                                    }
                                    i4.a();
                                    if (gVar.D(null, s7.e0.P0)) {
                                        p4Var2.s();
                                        if (p4Var2.P() == 1 ? true : z10) {
                                            long intValue = ((Integer) s7.e0.f8657w0.a(null)).intValue();
                                            long nextInt = new Random().nextInt(5000);
                                            q1Var3.f8942y.getClass();
                                            long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                            if (max > 500) {
                                                q1.l(v0Var);
                                                t0Var5.b(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            q1.k(q2Var);
                                            q2Var.s();
                                            if (q2Var.f8953z == null) {
                                                q2Var.f8953z = new g2(q2Var, q1Var2, 0);
                                            }
                                            q2Var.f8953z.b(max);
                                        }
                                    }
                                    f1Var.C.b(true);
                                    return;
                                }
                            }
                            if (TextUtils.isEmpty(q1Var.q().z())) {
                                z10 = false;
                            } else {
                                if (i11 != 0 && i11 != 30 && i11 != 10 && i11 != 40) {
                                    c2Var = null;
                                    z10 = false;
                                    if (c2Var != null) {
                                    }
                                    q1.k(q2Var);
                                    q1Var2 = (q1) q2Var.f1478d;
                                    q2Var.S(c2Var2);
                                    f1Var.s();
                                    int i122 = s7.o.b(f1Var.w().getString("dma_consent_settings", null)).f8887a;
                                    I = gVar.I("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (I != z1Var) {
                                    }
                                    I2 = gVar.I("google_analytics_default_allow_ad_user_data", true);
                                    if (I2 == z1Var) {
                                    }
                                    if (!TextUtils.isEmpty(q1Var.q().z())) {
                                        q1.k(q2Var);
                                        q2Var.N(new s7.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                    }
                                    F = gVar.F("google_analytics_tcf_data_enabled");
                                    if (F != null) {
                                    }
                                    q1.l(v0Var2);
                                    t0Var3.a("TCF client enabled.");
                                    q1.k(q2Var);
                                    q2Var.s();
                                    s7.v0 v0Var92 = q1Var2.f8937t;
                                    q1.l(v0Var92);
                                    v0Var92.A.a("Register tcfPrefChangeListener.");
                                    if (q2Var.H == null) {
                                    }
                                    f1 f1Var22 = q1Var2.f8936s;
                                    q1.j(f1Var22);
                                    f1Var22.x().registerOnSharedPreferenceChangeListener(q2Var.H);
                                    q1.k(q2Var);
                                    q2Var.y();
                                    d1Var = f1Var.f8685t;
                                    if (d1Var.a() == 0) {
                                    }
                                    q1.k(q2Var);
                                    h1Var = q2Var.E;
                                    if (h1Var.e()) {
                                        f1 f1Var32 = h1Var.f8724e.f8936s;
                                        q1.j(f1Var32);
                                        f1Var32.K.e(null);
                                    }
                                    if (q1Var.h()) {
                                    }
                                    i4.a();
                                    if (gVar.D(null, s7.e0.P0)) {
                                    }
                                    f1Var.C.b(true);
                                    return;
                                }
                                q1.k(q2Var);
                                z10 = false;
                                q2Var.O(new c2(-10), false);
                            }
                            c2Var = null;
                            if (c2Var != null) {
                            }
                            q1.k(q2Var);
                            q1Var2 = (q1) q2Var.f1478d;
                            q2Var.S(c2Var2);
                            f1Var.s();
                            int i1222 = s7.o.b(f1Var.w().getString("dma_consent_settings", null)).f8887a;
                            I = gVar.I("google_analytics_default_allow_ad_personalization_signals", true);
                            if (I != z1Var) {
                            }
                            I2 = gVar.I("google_analytics_default_allow_ad_user_data", true);
                            if (I2 == z1Var) {
                            }
                            if (!TextUtils.isEmpty(q1Var.q().z())) {
                            }
                            F = gVar.F("google_analytics_tcf_data_enabled");
                            if (F != null) {
                            }
                            q1.l(v0Var2);
                            t0Var3.a("TCF client enabled.");
                            q1.k(q2Var);
                            q2Var.s();
                            s7.v0 v0Var922 = q1Var2.f8937t;
                            q1.l(v0Var922);
                            v0Var922.A.a("Register tcfPrefChangeListener.");
                            if (q2Var.H == null) {
                            }
                            f1 f1Var222 = q1Var2.f8936s;
                            q1.j(f1Var222);
                            f1Var222.x().registerOnSharedPreferenceChangeListener(q2Var.H);
                            q1.k(q2Var);
                            q2Var.y();
                            d1Var = f1Var.f8685t;
                            if (d1Var.a() == 0) {
                            }
                            q1.k(q2Var);
                            h1Var = q2Var.E;
                            if (h1Var.e()) {
                            }
                            if (q1Var.h()) {
                            }
                            i4.a();
                            if (gVar.D(null, s7.e0.P0)) {
                            }
                            f1Var.C.b(true);
                            return;
                        }
                        m0Var3.f8839y = list;
                        if (packageManager != null) {
                        }
                        ((q1) m0Var3.f1478d).Q.incrementAndGet();
                        m0Var3.f8703e = true;
                        v2Var = new v2(q1Var4);
                        v2Var.u();
                        q1Var4.I = v2Var;
                        if (v2Var.f8703e) {
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    if (list != null) {
                    }
                    m0Var3.f8839y = list;
                    if (packageManager != null) {
                    }
                    ((q1) m0Var3.f1478d).Q.incrementAndGet();
                    m0Var3.f8703e = true;
                    v2Var = new v2(q1Var4);
                    v2Var.u();
                    q1Var4.I = v2Var;
                    if (v2Var.f8703e) {
                    }
                }
            }
            str8 = str9;
            packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
            }
        }
        packageManager = packageManager2;
        i3 = Integer.MIN_VALUE;
        str2 = "Unknown";
        str3 = str2;
        String str1022 = str8;
        m0Var3.f8831i = packageName;
        m0Var3.f8834t = str1022;
        m0Var3.f8832r = str3;
        m0Var3.f8833s = i3;
        m0Var3.f8835u = str2;
        m0Var3.f8836v = 0L;
        g = q1Var6.g();
        if (g == 0) {
        }
        m0Var3.C = "";
        str4 = m0Var3.A;
        if (TextUtils.isEmpty(str4)) {
        }
        if (!TextUtils.isEmpty(str4)) {
        }
        m0Var3.C = str6;
        if (g == 0) {
        }
        list = null;
        m0Var3.f8839y = null;
        s7.g gVar222 = q1Var6.f8935r;
        q1 q1Var722 = (q1) gVar222.f1478d;
        c7.c0.d("analytics.safelisted_events");
        E = gVar222.E();
        if (E == null) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        if (list != null) {
        }
        m0Var3.f8839y = list;
        if (packageManager != null) {
        }
        ((q1) m0Var3.f1478d).Q.incrementAndGet();
        m0Var3.f8703e = true;
        v2Var = new v2(q1Var4);
        v2Var.u();
        q1Var4.I = v2Var;
        if (v2Var.f8703e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        ((java.lang.Runnable) r10.f4153e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        m8.j.f6602t.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f4153e), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r10.f4153e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r1 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        ((java.lang.Runnable) r10.f4153e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0112, code lost:
    
        r10.f4153e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00eb, code lost:
    
        r4 = f8.w0.f4191t;
        r5 = java.util.logging.Level.SEVERE;
        r6 = java.lang.String.valueOf((java.lang.Runnable) r10.f4153e);
        r8 = new java.lang.StringBuilder(r6.length() + 35);
        r8.append("Exception while executing runnable ");
        r8.append(r6);
        r4.log(r5, r8.toString(), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d1, code lost:
    
        if (r1 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        switch (this.f4152d) {
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    try {
                        synchronized (((w0) this.f4154i).f4193e) {
                            if (!z10) {
                                w0 w0Var = (w0) this.f4154i;
                                if (w0Var.f4194i != 4) {
                                    w0Var.f4195r++;
                                    w0Var.f4194i = 4;
                                    z10 = true;
                                }
                            }
                            Runnable runnable = (Runnable) ((w0) this.f4154i).f4193e.poll();
                            this.f4153e = runnable;
                            if (runnable == null) {
                                ((w0) this.f4154i).f4194i = 1;
                                break;
                            }
                        }
                        if (!z11) {
                            return;
                        }
                    } finally {
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                return;
            default:
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    try {
                        synchronized (((m8.j) this.f4154i).f6604e) {
                            if (!z12) {
                                m8.j jVar = (m8.j) this.f4154i;
                                if (jVar.f6605i != 4) {
                                    jVar.f6606r++;
                                    jVar.f6605i = 4;
                                    z12 = true;
                                }
                            }
                            Runnable runnable2 = (Runnable) ((m8.j) this.f4154i).f6604e.poll();
                            this.f4153e = runnable2;
                            if (runnable2 == null) {
                                ((m8.j) this.f4154i).f6605i = 1;
                                break;
                            }
                        }
                        if (!z13) {
                            return;
                        }
                    } finally {
                    }
                }
                Thread.currentThread().interrupt();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable o6;
        c7.j jVar;
        boolean z10;
        boolean z11;
        c7.j q0Var;
        l.d dVar;
        t1 t1Var;
        m.g gVar;
        Long valueOf;
        boolean contains;
        c6.p pVar = null;
        int i3 = 1;
        switch (this.f4152d) {
            case 0:
                c6.e eVar = (c6.e) this.f4154i;
                ListenableFuture listenableFuture = (ListenableFuture) this.f4153e;
                if ((listenableFuture instanceof r) && (o6 = ((r) listenableFuture).o()) != null) {
                    eVar.m(o6);
                    return;
                }
                try {
                    l0.b(listenableFuture);
                    q2 q2Var = (q2) eVar.f1815i;
                    q2Var.s();
                    q1 q1Var = (q1) q2Var.f1478d;
                    f1 f1Var = q1Var.f8936s;
                    q1.j(f1Var);
                    SparseArray y3 = f1Var.y();
                    x3 x3Var = (x3) eVar.f1814e;
                    y3.put(x3Var.f9106i, Long.valueOf(x3Var.f9105e));
                    f1 f1Var2 = q1Var.f8936s;
                    q1.j(f1Var2);
                    int[] iArr = new int[y3.size()];
                    long[] jArr = new long[y3.size()];
                    for (int i10 = 0; i10 < y3.size(); i10++) {
                        iArr[i10] = y3.keyAt(i10);
                        jArr[i10] = ((Long) y3.valueAt(i10)).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putIntArray("uriSources", iArr);
                    bundle.putLongArray("uriTimestamps", jArr);
                    f1Var2.B.e(bundle);
                    q2Var.f8950w = false;
                    q2Var.f8951x = 1;
                    s7.v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.A.b(x3Var.f9104d, "Successfully registered trigger URI");
                    q2Var.R();
                    return;
                } catch (Error e2) {
                    e = e2;
                    eVar.m(e);
                    return;
                } catch (RuntimeException e9) {
                    e = e9;
                    eVar.m(e);
                    return;
                } catch (ExecutionException e10) {
                    eVar.m(e10.getCause());
                    return;
                }
            case 1:
                u5.e eVar2 = ((b6.a) this.f4154i).f1216d.f9654f;
                String str = (String) this.f4153e;
                synchronized (eVar2.f9632z) {
                    try {
                        u5.o oVar = (u5.o) eVar2.f9626t.get(str);
                        if (oVar == null) {
                            oVar = (u5.o) eVar2.f9627u.get(str);
                        }
                        if (oVar != null) {
                            pVar = oVar.f9664s;
                        }
                    } finally {
                    }
                }
                if (pVar == null || !pVar.b()) {
                    return;
                }
                synchronized (((b6.a) this.f4154i).f1218i) {
                    ((b6.a) this.f4154i).f1221t.put(g8.b.A(pVar), pVar);
                    ((b6.a) this.f4154i).f1222u.add(pVar);
                    b6.a aVar = (b6.a) this.f4154i;
                    aVar.f1223v.g(aVar.f1222u);
                }
                return;
            case 2:
                z6.b bVar = (z6.b) this.f4153e;
                b7.d0 d0Var = (b7.d0) this.f4154i;
                b7.d dVar2 = d0Var.f1280f;
                c7.i iVar = d0Var.f1275a;
                b7.b0 b0Var = (b7.b0) dVar2.j.get(d0Var.f1276b);
                if (b0Var == null) {
                    return;
                }
                if (!bVar.c()) {
                    b0Var.l(bVar, null);
                    return;
                }
                d0Var.f1279e = true;
                if (iVar.s()) {
                    if (!d0Var.f1279e || (jVar = d0Var.f1277c) == null) {
                        return;
                    }
                    iVar.k(jVar, d0Var.f1278d);
                    return;
                }
                try {
                    iVar.k(null, iVar.s() ? iVar.E : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e11) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e11);
                    iVar.e("Failed to get service from broker.");
                    b0Var.l(new z6.b(10, null, null), null);
                    return;
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                b7.f fVar = (b7.f) this.f4153e;
                v5 v5Var = (v5) this.f4154i;
                b7.e eVar3 = fVar.f1286b;
                if (eVar3 == null) {
                    return;
                }
                l5 l5Var = eVar3.f1281a;
                v5Var.getClass();
                try {
                    byte[] bArr = (byte[]) v5Var.f2870e;
                    c1 c1Var = c1.f2180a;
                    int i11 = com.google.android.gms.internal.measurement.q0.f2690a;
                    wc u2 = wc.u(bArr, c1.f2181b);
                    Iterator it = ((fd) l5Var.f2500i).f2293f.iterator();
                    boolean z12 = false;
                    while (it.hasNext()) {
                        sc scVar = (sc) it.next();
                        List t6 = u2.t();
                        scVar.getClass();
                        v5 v5Var2 = vc.f2884i;
                        v5Var2.getClass();
                        if (t6 == null || t6.isEmpty()) {
                            z10 = false;
                        } else {
                            Iterator it2 = t6.iterator();
                            z10 = false;
                            while (it2.hasNext()) {
                                oc ocVar = (oc) ((ConcurrentHashMap) v5Var2.f2870e).get((String) it2.next());
                                if (ocVar != null) {
                                    vc vcVar = ocVar.f2647a;
                                    if (vcVar.f2889e) {
                                        b7.h hVar = vcVar.f2885a;
                                        if (hVar != null && (hVar.f1292a || ((md) hVar.f1296e).f2539a == 3 || vcVar.f2891h.P())) {
                                            synchronized (vcVar) {
                                                try {
                                                    b7.h hVar2 = vcVar.f2885a;
                                                    if (hVar2 != null) {
                                                        if (!hVar2.f1292a) {
                                                            if (!(((md) hVar2.f1296e).f2539a == 3)) {
                                                                if (vcVar.f2891h.P()) {
                                                                }
                                                            }
                                                        }
                                                        vcVar.f2885a = null;
                                                        ((AtomicInteger) vcVar.g.f2870e).incrementAndGet();
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z10 |= z11;
                                }
                            }
                        }
                        if (z10 && !z12) {
                            ((jd) l5Var.f2499e).a();
                            z12 = true;
                        }
                    }
                    return;
                } catch (v1 unused) {
                    return;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                b7.q0 q0Var2 = (b7.q0) this.f4154i;
                u7.e eVar4 = (u7.e) this.f4153e;
                q0Var2.getClass();
                z6.b bVar2 = eVar4.f9680e;
                if (bVar2.c()) {
                    c7.w wVar = eVar4.f9681i;
                    c7.c0.g(wVar);
                    z6.b bVar3 = wVar.f1996i;
                    if (!bVar3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        q0Var2.f1338k.b(bVar3);
                        q0Var2.j.d();
                        return;
                    }
                    b7.d0 d0Var2 = q0Var2.f1338k;
                    IBinder iBinder = wVar.f1995e;
                    if (iBinder == null) {
                        q0Var = null;
                    } else {
                        int i12 = c7.a.f1870e;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        q0Var = queryLocalInterface instanceof c7.j ? (c7.j) queryLocalInterface : new c7.q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    Set set = q0Var2.f1336h;
                    d0Var2.getClass();
                    if (q0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        d0Var2.b(new z6.b(4, null, null));
                    } else {
                        d0Var2.f1277c = q0Var;
                        d0Var2.f1278d = set;
                        if (d0Var2.f1279e) {
                            d0Var2.f1275a.k(q0Var, set);
                        }
                    }
                } else {
                    q0Var2.f1338k.b(bVar2);
                }
                q0Var2.j.d();
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                a();
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((d6.q) this.f4154i).f3655d.f3948d instanceof e6.a) {
                    return;
                }
                try {
                    t5.g gVar2 = (t5.g) ((e6.j) this.f4153e).get();
                    if (gVar2 == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((d6.q) this.f4154i).f3657i.f1841c + ") but did not provide ForegroundInfo");
                    }
                    t5.o.d().a(d6.q.f3654u, "Updating notification for " + ((d6.q) this.f4154i).f3657i.f1841c);
                    d6.q qVar = (d6.q) this.f4154i;
                    e6.j jVar2 = qVar.f3655d;
                    d6.s sVar = qVar.f3659s;
                    Context context = qVar.f3656e;
                    UUID id2 = qVar.f3658r.getId();
                    sVar.getClass();
                    e6.j jVar3 = new e6.j();
                    sVar.f3667a.a(new d6.r(sVar, jVar3, id2, gVar2, context, 0));
                    jVar2.k(jVar3);
                    return;
                } catch (Throwable th) {
                    ((d6.q) this.f4154i).f3655d.j(th);
                    return;
                }
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    e();
                    return;
                } catch (Error e12) {
                    synchronized (((w0) this.f4154i).f4193e) {
                        ((w0) this.f4154i).f4194i = 1;
                        throw e12;
                    }
                }
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((ge.h) this.f4154i).B((ge.w0) this.f4153e, Unit.f5554a);
                return;
            case 9:
                d9.c cVar = (d9.c) this.f4153e;
                Typeface typeface = (Typeface) this.f4154i;
                m.u uVar = (m.u) cVar.f3701e;
                if (uVar != null) {
                    uVar.c(typeface);
                    return;
                }
                return;
            case 10:
                ((l3.e) this.f4153e).accept(this.f4154i);
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                b();
                return;
            case 12:
                m.g gVar3 = (m.g) this.f4153e;
                m.j jVar4 = (m.j) this.f4154i;
                l.i iVar2 = jVar4.f6100i;
                if (iVar2 != null && (dVar = iVar2.f5669e) != null && (t1Var = ((ActionMenuView) dVar.f5643e).H) != null) {
                    Toolbar toolbar = t1Var.f6182a;
                    m.j jVar5 = toolbar.f444d.G;
                    if (jVar5 == null || (gVar = jVar5.F) == null || !gVar.b()) {
                        Iterator it3 = ((CopyOnWriteArrayList) toolbar.U.f5643e).iterator();
                        if (it3.hasNext()) {
                            ((f4.h) it3.next()).getClass();
                            throw null;
                        }
                    }
                }
                ActionMenuView actionMenuView = jVar4.f6104u;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!gVar3.b()) {
                        if (gVar3.f5713e != null) {
                            gVar3.d(0, 0, false, false);
                        }
                    }
                    jVar4.F = gVar3;
                }
                jVar4.H = null;
                return;
            case 13:
                c();
                return;
            case 14:
                y1 y1Var = (y1) this.f4153e;
                y1Var.a();
                if (k5.c.l()) {
                    y1Var.d().B(this);
                    return;
                }
                s7.n nVar = (s7.n) this.f4154i;
                r3 = nVar.f8861c != 0;
                nVar.f8861c = 0L;
                if (r3) {
                    nVar.a();
                    return;
                }
                return;
            case 15:
                g1 g1Var = (g1) this.f4154i;
                q1 q1Var2 = g1Var.f8705b.f8724e;
                o1 o1Var = q1Var2.f8938u;
                q1.l(o1Var);
                o1Var.s();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", g1Var.f8704a);
                try {
                    s5 s5Var = (s5) ((u5) this.f4153e);
                    Parcel F = s5Var.F();
                    r5.b(F, bundle2);
                    Parcel E = s5Var.E(F, 1);
                    Bundle bundle3 = (Bundle) r5.a(E, Bundle.CREATOR);
                    E.recycle();
                    if (bundle3 == null) {
                        s7.v0 v0Var2 = q1Var2.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e13) {
                    s7.v0 v0Var3 = q1Var2.f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9050t.b(e13.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                o1 o1Var2 = q1Var2.f8938u;
                q1.l(o1Var2);
                o1Var2.s();
                throw new IllegalStateException("Unexpected call on client side");
            case 16:
                d();
                return;
            case 17:
                w1 w1Var = (w1) this.f4154i;
                w1Var.f9082d.V();
                s7.e eVar5 = (s7.e) this.f4153e;
                Object b10 = eVar5.f8596i.b();
                j4 j4Var = w1Var.f9082d;
                if (b10 == null) {
                    j4Var.getClass();
                    String str2 = eVar5.f8594d;
                    c7.c0.g(str2);
                    r4 Q = j4Var.Q(str2);
                    if (Q != null) {
                        j4Var.a0(eVar5, Q);
                        return;
                    }
                    return;
                }
                j4Var.getClass();
                String str3 = eVar5.f8594d;
                c7.c0.g(str3);
                r4 Q2 = j4Var.Q(str3);
                if (Q2 != null) {
                    j4Var.Z(eVar5, Q2);
                    return;
                }
                return;
            case 18:
                f6 f6Var = (f6) this.f4153e;
                q2 q2Var2 = (q2) this.f4154i;
                t3 t3Var = ((q1) q2Var2.f1478d).f8939v;
                q1.k(t3Var);
                q1 q1Var3 = (q1) t3Var.f1478d;
                f1 f1Var3 = q1Var3.f8936s;
                f1 f1Var4 = q1Var3.f8936s;
                q1.j(f1Var3);
                if (f1Var3.z().i(b2.ANALYTICS_STORAGE)) {
                    q1.j(f1Var4);
                    q1Var3.f8942y.getClass();
                    if (!f1Var4.B(System.currentTimeMillis())) {
                        q1.j(f1Var4);
                        if (f1Var4.E.a() != 0) {
                            q1.j(f1Var4);
                            valueOf = Long.valueOf(f1Var4.E.a());
                            if (valueOf == null) {
                                p4 p4Var = ((q1) q2Var2.f1478d).f8940w;
                                q1.j(p4Var);
                                p4Var.g0(f6Var, valueOf.longValue());
                                return;
                            } else {
                                try {
                                    f6Var.j(null);
                                    return;
                                } catch (RemoteException e14) {
                                    s7.v0 v0Var4 = ((q1) q2Var2.f1478d).f8937t;
                                    q1.l(v0Var4);
                                    v0Var4.f9050t.b(e14, "getSessionId failed with exception");
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    s7.v0 v0Var5 = q1Var3.f8937t;
                    q1.l(v0Var5);
                    v0Var5.f9055y.a("Analytics storage consent denied; will not get session id");
                }
                valueOf = null;
                if (valueOf == null) {
                }
            case 19:
                ((q2) this.f4154i).J((Boolean) this.f4153e, true);
                return;
            case 20:
                q2 q2Var3 = (q2) this.f4154i;
                q1 q1Var4 = (q1) q2Var3.f1478d;
                f1 f1Var5 = q1Var4.f8936s;
                s7.v0 v0Var6 = q1Var4.f8937t;
                q1.j(f1Var5);
                f1Var5.s();
                f1Var5.s();
                s7.o b11 = s7.o.b(f1Var5.w().getString("dma_consent_settings", null));
                s7.o oVar2 = (s7.o) this.f4153e;
                int i13 = oVar2.f8887a;
                if (!c2.l(i13, b11.f8887a)) {
                    q1.l(v0Var6);
                    v0Var6.f9056z.b(Integer.valueOf(i13), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor edit = f1Var5.w().edit();
                edit.putString("dma_consent_settings", oVar2.f8888b);
                edit.apply();
                q1.l(v0Var6);
                v0Var6.B.b(oVar2, "Setting DMA consent(FE)");
                q1 q1Var5 = (q1) q2Var3.f1478d;
                if (q1Var5.o().C()) {
                    l3 o10 = q1Var5.o();
                    o10.s();
                    o10.t();
                    o10.G(new j3(o10, i3));
                    return;
                }
                l3 o11 = q1Var5.o();
                o11.s();
                o11.t();
                if (o11.B()) {
                    o11.G(new g3(o11, o11.I(false)));
                    return;
                }
                return;
            case 21:
                q2 q2Var4 = ((AppMeasurementDynamiteService) this.f4154i).f3062d.A;
                q1.k(q2Var4);
                c6.s sVar2 = (c6.s) this.f4153e;
                q2Var4.s();
                q2Var4.t();
                c6.s sVar3 = q2Var4.f8945r;
                if (sVar2 != sVar3) {
                    c7.c0.i("EventInterceptor already set.", sVar3 == null);
                }
                q2Var4.f8945r = sVar2;
                return;
            case 22:
                q2 q2Var5 = (q2) this.f4153e;
                q2Var5.s();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<x3> list = (List) this.f4154i;
                f1 f1Var6 = ((q1) q2Var5.f1478d).f8936s;
                q1.j(f1Var6);
                SparseArray y10 = f1Var6.y();
                for (x3 x3Var2 : list) {
                    int i14 = x3Var2.f9106i;
                    contains = y10.contains(i14);
                    if (!contains || ((Long) y10.get(i14)).longValue() < x3Var2.f9105e) {
                        q2Var5.Q().add(x3Var2);
                    }
                }
                q2Var5.R();
                return;
            case 23:
                q1 q1Var6 = (q1) ((q2) this.f4153e).f1478d;
                s7.m0 q3 = q1Var6.q();
                String str4 = (String) this.f4154i;
                String str5 = q3.F;
                if (str5 != null && !str5.equals(str4)) {
                    r3 = true;
                }
                q3.F = str4;
                if (r3) {
                    q1Var6.q().x();
                    return;
                }
                return;
            case 24:
                l3 l3Var = (l3) this.f4154i;
                s7.h0 h0Var = l3Var.f8813r;
                q1 q1Var7 = (q1) l3Var.f1478d;
                if (h0Var == null) {
                    s7.v0 v0Var7 = q1Var7.f8937t;
                    q1.l(v0Var7);
                    v0Var7.f9050t.a("Failed to send current screen to service");
                    return;
                }
                try {
                    y2 y2Var = (y2) this.f4153e;
                    if (y2Var == null) {
                        h0Var.l(0L, null, null, q1Var7.f8932d.getPackageName());
                    } else {
                        h0Var.l(y2Var.f9128c, y2Var.f9126a, y2Var.f9127b, q1Var7.f8932d.getPackageName());
                    }
                    l3Var.F();
                    return;
                } catch (RemoteException e15) {
                    s7.v0 v0Var8 = ((q1) l3Var.f1478d).f8937t;
                    q1.l(v0Var8);
                    v0Var8.f9050t.b(e15, "Failed to send current screen to the service");
                    return;
                }
            case 25:
                ((k3) this.f4154i).f8796c.D((ComponentName) this.f4153e);
                return;
            case 26:
                l3 l3Var2 = ((k3) this.f4154i).f8796c;
                l3Var2.f8813r = null;
                if (((z6.b) this.f4153e).f10867e != 7777) {
                    l3Var2.H();
                    return;
                }
                if (l3Var2.f8816u == null) {
                    l3Var2.f8816u = Executors.newScheduledThreadPool(1);
                }
                l3Var2.f8816u.schedule(new b7.k(14, this), ((Long) s7.e0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 27:
                j4 j4Var2 = (j4) this.f4153e;
                j4Var2.V();
                Runnable runnable = (Runnable) this.f4154i;
                j4Var2.d().s();
                if (j4Var2.D == null) {
                    j4Var2.D = new ArrayList();
                }
                j4Var2.D.add(runnable);
                j4Var2.q();
                return;
            case 28:
                l.d dVar3 = (l.d) this.f4153e;
                JobParameters jobParameters = (JobParameters) this.f4154i;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((o3) ((Service) dVar3.f5643e)).c(jobParameters);
                return;
            default:
                ge.h hVar3 = (ge.h) this.f4154i;
                try {
                    hd.l lVar = hd.n.f4511e;
                    hVar3.resumeWith(((ListenableFuture) this.f4153e).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        hVar3.n(cause);
                        return;
                    } else {
                        hd.l lVar2 = hd.n.f4511e;
                        hVar3.resumeWith(new hd.m(cause));
                        return;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f4152d) {
            case 0:
                a1.n nVar = new a1.n(j0.class.getSimpleName());
                c6.e eVar = (c6.e) this.f4154i;
                c6.s sVar = new c6.s();
                ((c6.s) nVar.f42r).f1869e = sVar;
                nVar.f42r = sVar;
                sVar.f1868d = eVar;
                return nVar.toString();
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Runnable runnable = (Runnable) this.f4153e;
                if (runnable != null) {
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("SequentialExecutorWorker{running=");
                    sb2.append(valueOf);
                    sb2.append("}");
                    return sb2.toString();
                }
                int i3 = ((w0) this.f4154i).f4194i;
                String str = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
                StringBuilder sb3 = new StringBuilder(str.length() + 32);
                sb3.append("SequentialExecutorWorker{state=");
                sb3.append(str);
                sb3.append("}");
                return sb3.toString();
            case 13:
                Runnable runnable2 = (Runnable) this.f4153e;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb4 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((m8.j) this.f4154i).f6605i;
                sb4.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb4.append("}");
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j0(int i3, Object obj, Object obj2, boolean z10) {
        this.f4152d = i3;
        this.f4154i = obj;
        this.f4153e = obj2;
    }

    public /* synthetic */ j0(Executor executor, int i3) {
        this.f4152d = i3;
        this.f4154i = executor;
    }

    public j0(l.d dVar, j4 j4Var, Runnable runnable) {
        this.f4152d = 27;
        this.f4153e = j4Var;
        this.f4154i = runnable;
    }

    public j0(g1 g1Var, u5 u5Var, g1 g1Var2) {
        this.f4152d = 15;
        this.f4153e = u5Var;
        this.f4154i = g1Var;
    }

    public /* synthetic */ j0(int i3, Object obj, Object obj2) {
        this.f4152d = i3;
        this.f4153e = obj;
        this.f4154i = obj2;
    }

    public j0(l3 l3Var, y2 y2Var) {
        this.f4152d = 24;
        this.f4153e = y2Var;
        Objects.requireNonNull(l3Var);
        this.f4154i = l3Var;
    }
}
