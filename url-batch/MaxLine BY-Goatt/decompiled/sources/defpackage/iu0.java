package defpackage;

import android.app.Application;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
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
import android.view.View;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iu0 implements Runnable {
    public final /* synthetic */ int m;
    public Object n;
    public final Object o;

    public iu0(jm3 jm3Var, je3 je3Var) {
        this.m = 24;
        this.n = je3Var;
        Objects.requireNonNull(jm3Var);
        this.o = jm3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:18|(1:20)(9:270|271|272|273|(1:275)(2:296|(4:298|277|278|(27:280|(1:282)(1:294)|283|284|286|287|288|22|23|(2:25|(2:27|(2:29|(2:31|(2:33|(2:35|(1:37)(1:263))(1:264))(1:265))(1:266))(1:267))(1:268))(1:269)|38|39|40|(1:42)(1:260)|43|(1:45)|47|48|(1:50)(2:257|(8:259|(3:250|251|(6:253|(5:55|(1:57)(3:241|(3:244|(1:246)(1:247)|242)|248)|(1:59)(1:240)|60|(9:62|(1:64)(1:237)|65|(1:67)|68|(1:70)(1:236)|71|(1:73)|(34:234|75|(1:77)(2:229|(1:231)(1:232))|78|(1:80)|81|(2:226|(18:228|(1:97)(1:225)|98|(1:100)|101|(2:203|(2:209|(2:216|(2:217|(1:224)(2:219|(2:221|222)(1:223))))(0))(1:208))(1:105)|106|(3:199|(1:201)|202)|110|(1:112)(1:198)|113|(1:117)|118|(3:120|(7:122|(1:124)(1:154)|125|(1:127)|128|(4:132|(1:134)|135|(1:137))|138)(1:155)|139)(10:156|(4:158|(2:161|(6:163|(1:165)(1:195)|166|(1:168)|169|170))|196|170)(1:197)|171|(1:173)|174|175|176|177|178|(5:180|(1:182)(1:190)|(1:186)|(1:188)|189))|140|(2:142|(5:144|(1:146)|147|(1:149)|150))|151|152))(1:84)|85|(1:94)|95|(0)(0)|98|(0)|101|(1:103)|203|(1:206)|209|(4:212|214|216|(3:217|(0)(0)|223))(0)|106|(1:108)|199|(0)|202|110|(0)(0)|113|(2:115|117)|118|(0)(0)|140|(0)|151|152)(32:235|81|(0)|226|(0)|85|(1:94)|95|(0)(0)|98|(0)|101|(0)|203|(0)|209|(0)(0)|106|(0)|199|(0)|202|110|(0)(0)|113|(0)|118|(0)(0)|140|(0)|151|152))(2:238|239))|249|(0)(0)|60|(0)(0)))|53|(0)|249|(0)(0)|60|(0)(0)))|51|(0)|53|(0)|249|(0)(0)|60|(0)(0))))|276|277|278|(0))|21|22|23|(0)(0)|38|39|40|(0)(0)|43|(0)|47|48|(0)(0)|51|(0)|53|(0)|249|(0)(0)|60|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:270|(2:271|272)|273|(1:275)(2:296|(4:298|277|278|(27:280|(1:282)(1:294)|283|284|286|287|288|22|23|(2:25|(2:27|(2:29|(2:31|(2:33|(2:35|(1:37)(1:263))(1:264))(1:265))(1:266))(1:267))(1:268))(1:269)|38|39|40|(1:42)(1:260)|43|(1:45)|47|48|(1:50)(2:257|(8:259|(3:250|251|(6:253|(5:55|(1:57)(3:241|(3:244|(1:246)(1:247)|242)|248)|(1:59)(1:240)|60|(9:62|(1:64)(1:237)|65|(1:67)|68|(1:70)(1:236)|71|(1:73)|(34:234|75|(1:77)(2:229|(1:231)(1:232))|78|(1:80)|81|(2:226|(18:228|(1:97)(1:225)|98|(1:100)|101|(2:203|(2:209|(2:216|(2:217|(1:224)(2:219|(2:221|222)(1:223))))(0))(1:208))(1:105)|106|(3:199|(1:201)|202)|110|(1:112)(1:198)|113|(1:117)|118|(3:120|(7:122|(1:124)(1:154)|125|(1:127)|128|(4:132|(1:134)|135|(1:137))|138)(1:155)|139)(10:156|(4:158|(2:161|(6:163|(1:165)(1:195)|166|(1:168)|169|170))|196|170)(1:197)|171|(1:173)|174|175|176|177|178|(5:180|(1:182)(1:190)|(1:186)|(1:188)|189))|140|(2:142|(5:144|(1:146)|147|(1:149)|150))|151|152))(1:84)|85|(1:94)|95|(0)(0)|98|(0)|101|(1:103)|203|(1:206)|209|(4:212|214|216|(3:217|(0)(0)|223))(0)|106|(1:108)|199|(0)|202|110|(0)(0)|113|(2:115|117)|118|(0)(0)|140|(0)|151|152)(32:235|81|(0)|226|(0)|85|(1:94)|95|(0)(0)|98|(0)|101|(0)|203|(0)|209|(0)(0)|106|(0)|199|(0)|202|110|(0)(0)|113|(0)|118|(0)(0)|140|(0)|151|152))(2:238|239))|249|(0)(0)|60|(0)(0)))|53|(0)|249|(0)(0)|60|(0)(0)))|51|(0)|53|(0)|249|(0)(0)|60|(0)(0))))|276|277|278|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0251, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0252, code lost:
    
        defpackage.pj3.m(r15);
        r15.r.d(defpackage.vh3.E(r5), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x018e, code lost:
    
        r6 = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03d4, code lost:
    
        if (r10.S() == 1) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x058c A[EDGE_INSN: B:224:0x058c->B:106:0x058c BREAK  A[LOOP:0: B:217:0x0577->B:223:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0293 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0171 A[Catch: NameNotFoundException -> 0x018e, TryCatch #3 {NameNotFoundException -> 0x018e, blocks: (B:278:0x0166, B:280:0x0171, B:282:0x017d), top: B:277:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0241 A[Catch: IllegalStateException -> 0x0251, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0251, blocks: (B:40:0x022f, B:43:0x023d, B:45:0x0241), top: B:39:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04c9  */
    /* JADX WARN: Type inference failed for: r0v46, types: [hm3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        gh3 gh3Var;
        pj3 pj3Var;
        String str;
        PackageManager packageManager;
        int i;
        String str2;
        PackageInfo packageInfo;
        int g;
        Bundle H;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        pm3 pm3Var;
        g10 g10Var;
        vh3 vh3Var;
        pj3 pj3Var2;
        g10 g10Var2;
        sk3 L;
        sk3 sk3Var;
        zq3 zq3Var;
        long j;
        xk3 xk3Var;
        pj3 pj3Var3;
        sk3 L2;
        sk3 L3;
        Bundle bundle;
        Iterator it;
        Boolean I;
        li3 li3Var;
        long j2;
        ti3 ti3Var;
        pj3 pj3Var4;
        zq3 zq3Var2;
        w50 w50Var;
        vh3 vh3Var2;
        g10 g10Var3;
        String o;
        pj3 pj3Var5 = (pj3) this.o;
        el3 el3Var = (el3) this.n;
        lj3 lj3Var = pj3Var5.s;
        vh3 vh3Var3 = pj3Var5.r;
        qi3 qi3Var = pj3Var5.q;
        zq3 zq3Var3 = pj3Var5.u;
        pj3.m(lj3Var);
        lj3Var.v();
        ec3 ec3Var = pj3Var5.p;
        ((pj3) ec3Var.m).getClass();
        ed3 ed3Var = new ed3(pj3Var5);
        ed3Var.z();
        pj3Var5.E = ed3Var;
        ye3 ye3Var = el3Var.d;
        gh3 gh3Var2 = new gh3(pj3Var5, el3Var.c, ye3Var == null ? 0L : ye3Var.m);
        gh3Var2.y();
        pj3Var5.F = gh3Var2;
        lh3 lh3Var = new lh3(pj3Var5);
        lh3Var.y();
        pj3Var5.C = lh3Var;
        jo3 jo3Var = new jo3(pj3Var5);
        jo3Var.y();
        pj3Var5.D = jo3Var;
        boolean z = zq3Var3.n;
        pj3 pj3Var6 = (pj3) zq3Var3.m;
        if (z) {
            lh.g("Can't initialize twice");
            return;
        }
        zq3Var3.v();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                vh3 vh3Var4 = ((pj3) zq3Var3.m).r;
                pj3.m(vh3Var4);
                vh3Var4.u.b("Utils falling back to Random for random id");
            }
        }
        zq3Var3.p.set(nextLong);
        pj3Var6.O.incrementAndGet();
        zq3Var3.n = true;
        if (qi3Var.n) {
            lh.g("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences = ((pj3) qi3Var.m).m.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        qi3Var.o = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        qi3Var.D = z2;
        if (!z2) {
            SharedPreferences.Editor edit = qi3Var.o.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        qi3Var.q = new ni3(qi3Var, Math.max(0L, ((Long) ug3.d.a(null)).longValue()));
        ((pj3) qi3Var.m).O.incrementAndGet();
        qi3Var.n = true;
        gh3 gh3Var3 = pj3Var5.F;
        if (gh3Var3.n) {
            lh.g("Can't initialize twice");
            return;
        }
        pj3 pj3Var7 = (pj3) gh3Var3.m;
        vh3 vh3Var5 = pj3Var7.r;
        vh3 vh3Var6 = pj3Var7.r;
        pj3.m(vh3Var5);
        vh3Var5.z.d(Long.valueOf(gh3Var3.v), Long.valueOf(gh3Var3.u), "sdkVersion bundled with app, dynamiteVersion");
        Context context = pj3Var7.m;
        String packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        String str3 = BuildConfig.FLAVOR;
        String str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String str5 = "unknown";
        if (packageManager2 == null) {
            pj3.m(vh3Var6);
            gh3Var = gh3Var2;
            pj3Var = pj3Var6;
            vh3Var6.r.c(vh3.E(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            gh3Var = gh3Var2;
            pj3Var = pj3Var6;
            try {
                str5 = packageManager2.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                pj3.m(vh3Var6);
                vh3Var6.r.c(vh3.E(packageName), "Error retrieving app installer package name. appId");
            }
            String str6 = str5;
            if (str6 == null) {
                str6 = "manual_install";
            } else if ("com.android.vending".equals(str6)) {
                str5 = BuildConfig.FLAVOR;
                packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                    str = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    try {
                        str2 = packageInfo.versionName;
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    try {
                        i = packageInfo.versionCode;
                        packageManager = packageManager2;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        str4 = str2;
                        pj3.m(vh3Var6);
                        packageManager = packageManager2;
                        vh3Var6.r.d(vh3.E(packageName), str, "Error retrieving package info. appId, appName");
                        i = Integer.MIN_VALUE;
                        str2 = str4;
                        String str7 = str5;
                        gh3Var3.o = packageName;
                        gh3Var3.r = str7;
                        gh3Var3.p = str2;
                        gh3Var3.q = i;
                        gh3Var3.s = str;
                        gh3Var3.t = 0L;
                        g = pj3Var7.g();
                        if (g == 0) {
                        }
                        gh3Var3.z = BuildConfig.FLAVOR;
                        o = th2.o(context, pj3Var7.B);
                        if (!TextUtils.isEmpty(o)) {
                        }
                        gh3Var3.z = str3;
                        if (g == 0) {
                        }
                        gh3Var3.w = null;
                        ec3 ec3Var2 = pj3Var7.p;
                        pj3 pj3Var8 = (pj3) ec3Var2.m;
                        ll3.s("analytics.safelisted_events");
                        H = ec3Var2.H();
                        if (H == null) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        asList = null;
                        if (asList != null) {
                        }
                        gh3Var3.w = asList;
                        if (packageManager == null) {
                        }
                        ((pj3) gh3Var3.m).O.incrementAndGet();
                        gh3Var3.n = true;
                        pm3Var = new pm3(pj3Var5);
                        pm3Var.y();
                        pj3Var5.G = pm3Var;
                        if (!pm3Var.n) {
                        }
                    }
                    String str72 = str5;
                    gh3Var3.o = packageName;
                    gh3Var3.r = str72;
                    gh3Var3.p = str2;
                    gh3Var3.q = i;
                    gh3Var3.s = str;
                    gh3Var3.t = 0L;
                    g = pj3Var7.g();
                    if (g == 0) {
                        pj3.m(vh3Var6);
                        vh3Var6.z.b("App measurement collection enabled");
                    } else if (g == 1) {
                        pj3.m(vh3Var6);
                        vh3Var6.x.b("App measurement deactivated via the manifest");
                    } else if (g == 3) {
                        pj3.m(vh3Var6);
                        vh3Var6.x.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                    } else if (g == 4) {
                        pj3.m(vh3Var6);
                        vh3Var6.x.b("App measurement disabled via the manifest");
                    } else if (g == 6) {
                        pj3.m(vh3Var6);
                        vh3Var6.w.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                    } else if (g == 7) {
                        pj3.m(vh3Var6);
                        vh3Var6.x.b("App measurement disabled via the global data collection setting");
                    } else if (g != 8) {
                        pj3.m(vh3Var6);
                        vh3Var6.x.b("App measurement disabled");
                        pj3.m(vh3Var6);
                        vh3Var6.s.b("Invalid scion state in identity");
                    } else {
                        pj3.m(vh3Var6);
                        vh3Var6.x.b("App measurement disabled due to denied storage consent");
                    }
                    gh3Var3.z = BuildConfig.FLAVOR;
                    o = th2.o(context, pj3Var7.B);
                    if (!TextUtils.isEmpty(o)) {
                        str3 = o;
                    }
                    gh3Var3.z = str3;
                    if (g == 0) {
                        pj3.m(vh3Var6);
                        vh3Var6.z.d(gh3Var3.o, gh3Var3.z, "App measurement enabled for app package, google app id");
                    }
                    gh3Var3.w = null;
                    ec3 ec3Var22 = pj3Var7.p;
                    pj3 pj3Var82 = (pj3) ec3Var22.m;
                    ll3.s("analytics.safelisted_events");
                    H = ec3Var22.H();
                    if (H == null) {
                        vh3 vh3Var7 = pj3Var82.r;
                        pj3.m(vh3Var7);
                        vh3Var7.r.b("Failed to load metadata: Metadata bundle is null");
                    } else if (H.containsKey("analytics.safelisted_events")) {
                        valueOf = Integer.valueOf(H.getInt("analytics.safelisted_events"));
                        if (valueOf != null) {
                            try {
                                stringArray = pj3Var82.m.getResources().getStringArray(valueOf.intValue());
                            } catch (Resources.NotFoundException e) {
                                vh3 vh3Var8 = pj3Var82.r;
                                pj3.m(vh3Var8);
                                vh3Var8.r.c(e, "Failed to load string array from metadata: resource not found");
                            }
                            if (stringArray != null) {
                                asList = Arrays.asList(stringArray);
                                if (asList != null) {
                                    if (!asList.isEmpty()) {
                                        for (String str8 : asList) {
                                            zq3 zq3Var4 = pj3Var7.u;
                                            pj3.k(zq3Var4);
                                            if (!zq3Var4.y0("safelisted event", str8)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        pj3.m(vh3Var6);
                                        vh3Var6.w.b("Safelisted event list is empty. Ignoring");
                                    }
                                    if (packageManager == null) {
                                        gh3Var3.y = k31.p(context) ? 1 : 0;
                                    } else {
                                        gh3Var3.y = 0;
                                    }
                                    ((pj3) gh3Var3.m).O.incrementAndGet();
                                    gh3Var3.n = true;
                                    pm3Var = new pm3(pj3Var5);
                                    pm3Var.y();
                                    pj3Var5.G = pm3Var;
                                    if (!pm3Var.n) {
                                        lh.g("Can't initialize twice");
                                        return;
                                    }
                                    pm3Var.o = (JobScheduler) ((pj3) pm3Var.m).m.getSystemService("jobscheduler");
                                    ((pj3) pm3Var.m).O.incrementAndGet();
                                    pm3Var.n = true;
                                    pj3.m(vh3Var3);
                                    g10 g10Var4 = vh3Var3.y;
                                    g10 g10Var5 = vh3Var3.x;
                                    g10 g10Var6 = vh3Var3.z;
                                    g10 g10Var7 = vh3Var3.r;
                                    ec3Var.B();
                                    g10Var5.c(133005L, "App measurement initialized, version");
                                    pj3.m(vh3Var3);
                                    g10Var5.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    String C = gh3Var.C();
                                    if (zq3Var3.X(C, ec3Var.o)) {
                                        pj3.m(vh3Var3);
                                        g10Var5.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        pj3.m(vh3Var3);
                                        g10Var5.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(C)));
                                    }
                                    pj3.m(vh3Var3);
                                    g10Var4.b("Debug-level message logging enabled");
                                    int i2 = pj3Var5.M;
                                    AtomicInteger atomicInteger = pj3Var5.O;
                                    if (i2 != atomicInteger.get()) {
                                        pj3.m(vh3Var3);
                                        g10Var7.d(Integer.valueOf(pj3Var5.M), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                    }
                                    pj3Var5.H = true;
                                    long j3 = pj3Var5.P;
                                    final jm3 jm3Var = pj3Var5.y;
                                    lj3 lj3Var2 = pj3Var5.s;
                                    pj3.m(lj3Var2);
                                    lj3Var2.v();
                                    pj3.j(pj3Var5.G);
                                    int B = pj3Var5.G.B();
                                    vr3.a();
                                    boolean G = ec3Var.G(null, ug3.Q0);
                                    boolean z3 = B == 2;
                                    if (G) {
                                        zq3Var3.v();
                                    }
                                    if (!z3) {
                                        g10Var = g10Var7;
                                        vh3Var = vh3Var3;
                                        pj3Var2 = pj3Var;
                                        g10Var2 = g10Var5;
                                        w50 w50Var2 = qi3Var.s;
                                        xk3 D = qi3Var.D();
                                        int i3 = D.b;
                                        L = ec3Var.L("google_analytics_default_allow_ad_storage", false);
                                        sk3 L4 = ec3Var.L("google_analytics_default_allow_analytics_storage", false);
                                        sk3Var = sk3.UNINITIALIZED;
                                        pj3 pj3Var9 = pj3Var2;
                                        vk3 vk3Var = vk3.ANALYTICS_STORAGE;
                                        if (L == sk3Var) {
                                        }
                                        zq3Var = zq3Var3;
                                        j = j3;
                                        if (xk3.l(-10, qi3Var.A().getInt("consent_source", 100))) {
                                        }
                                        if (!TextUtils.isEmpty(pj3Var5.r().D())) {
                                            pj3.l(jm3Var);
                                            jm3Var.S(new xk3(-10), false);
                                        }
                                        xk3Var = null;
                                        if (xk3Var != null) {
                                        }
                                        pj3.l(jm3Var);
                                        pj3Var3 = (pj3) jm3Var.m;
                                        jm3Var.A(xk3Var);
                                        qi3Var.v();
                                        int i4 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).a;
                                        L2 = ec3Var.L("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (L2 != sk3Var) {
                                        }
                                        L3 = ec3Var.L("google_analytics_default_allow_ad_user_data", true);
                                        if (L3 == sk3Var) {
                                        }
                                        if (TextUtils.isEmpty(pj3Var5.r().D())) {
                                        }
                                        if (TextUtils.isEmpty(pj3Var5.r().D())) {
                                        }
                                        I = ec3Var.I("google_analytics_tcf_data_enabled");
                                        if (I != null) {
                                        }
                                        pj3.m(vh3Var);
                                        g10Var4.b("TCF client enabled.");
                                        pj3.l(jm3Var);
                                        jm3Var.v();
                                        vh3 vh3Var9 = pj3Var3.r;
                                        pj3.m(vh3Var9);
                                        vh3Var9.y.b("Register tcfPrefChangeListener.");
                                        if (jm3Var.G == null) {
                                        }
                                        qi3 qi3Var2 = pj3Var3.q;
                                        pj3.k(qi3Var2);
                                        qi3Var2.B().registerOnSharedPreferenceChangeListener(jm3Var.G);
                                        pj3.l(jm3Var);
                                        jm3Var.C();
                                        li3Var = qi3Var.r;
                                        if (li3Var.a() == 0) {
                                        }
                                        pj3.l(jm3Var);
                                        ti3Var = jm3Var.D;
                                        if (ti3Var.e()) {
                                        }
                                        if (pj3Var5.h()) {
                                        }
                                        vr3.a();
                                        if (ec3Var.G(null, ug3.Q0)) {
                                        }
                                        qi3Var.A.b(true);
                                        return;
                                    }
                                    z3 = true;
                                    zq3Var3.v();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    boolean z4 = z3;
                                    pj3Var2 = pj3Var;
                                    nf nfVar = new nf(pj3Var2);
                                    vh3Var = vh3Var3;
                                    Context context2 = pj3Var2.m;
                                    g10Var2 = g10Var5;
                                    int i5 = Build.VERSION.SDK_INT;
                                    g10Var = g10Var7;
                                    if (i5 >= 33) {
                                        k31.u(context2, nfVar, intentFilter);
                                    } else if (i5 >= 26) {
                                        k31.t(context2, nfVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(nfVar, intentFilter, null, null);
                                    }
                                    vh3 vh3Var10 = pj3Var2.r;
                                    pj3.m(vh3Var10);
                                    vh3Var10.y.b("Registered app receiver");
                                    if (z4) {
                                        pj3.j(pj3Var5.G);
                                        pj3Var5.G.A(((Long) ug3.C.a(null)).longValue());
                                    }
                                    w50 w50Var22 = qi3Var.s;
                                    xk3 D2 = qi3Var.D();
                                    int i32 = D2.b;
                                    L = ec3Var.L("google_analytics_default_allow_ad_storage", false);
                                    sk3 L42 = ec3Var.L("google_analytics_default_allow_analytics_storage", false);
                                    sk3Var = sk3.UNINITIALIZED;
                                    pj3 pj3Var92 = pj3Var2;
                                    vk3 vk3Var2 = vk3.ANALYTICS_STORAGE;
                                    if (L == sk3Var || L42 != sk3Var) {
                                        zq3Var = zq3Var3;
                                        j = j3;
                                        if (xk3.l(-10, qi3Var.A().getInt("consent_source", 100))) {
                                            EnumMap enumMap = new EnumMap(vk3.class);
                                            enumMap.put((EnumMap) vk3.AD_STORAGE, (vk3) L);
                                            enumMap.put((EnumMap) vk3Var2, (vk3) L42);
                                            xk3Var = new xk3(enumMap, -10);
                                            if (xk3Var != null) {
                                                pj3.l(jm3Var);
                                                jm3Var.S(xk3Var, true);
                                            } else {
                                                xk3Var = D2;
                                            }
                                            pj3.l(jm3Var);
                                            pj3Var3 = (pj3) jm3Var.m;
                                            jm3Var.A(xk3Var);
                                            qi3Var.v();
                                            int i42 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).a;
                                            L2 = ec3Var.L("google_analytics_default_allow_ad_personalization_signals", true);
                                            if (L2 != sk3Var) {
                                                pj3.m(vh3Var);
                                                g10Var6.c(L2, "Default ad personalization consent from Manifest");
                                            }
                                            L3 = ec3Var.L("google_analytics_default_allow_ad_user_data", true);
                                            if (L3 == sk3Var && xk3.l(-10, i42)) {
                                                pj3.l(jm3Var);
                                                EnumMap enumMap2 = new EnumMap(vk3.class);
                                                enumMap2.put((EnumMap) vk3.AD_USER_DATA, (vk3) L3);
                                                jm3Var.R(new vc3(enumMap2, -10, (Boolean) null, (String) null), true);
                                            } else if (TextUtils.isEmpty(pj3Var5.r().D()) && (i42 == 0 || i42 == 30)) {
                                                pj3.l(jm3Var);
                                                jm3Var.R(new vc3((Boolean) null, -10, (Boolean) null, (String) null), true);
                                            } else if (TextUtils.isEmpty(pj3Var5.r().D()) && ye3Var != null && (bundle = ye3Var.p) != null && xk3.l(30, i42)) {
                                                vc3 c = vc3.c(30, bundle);
                                                it = c.e.values().iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        break;
                                                    }
                                                    if (((sk3) it.next()) != sk3Var) {
                                                        pj3.l(jm3Var);
                                                        jm3Var.R(c, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            I = ec3Var.I("google_analytics_tcf_data_enabled");
                                            if (I != null || I.booleanValue()) {
                                                pj3.m(vh3Var);
                                                g10Var4.b("TCF client enabled.");
                                                pj3.l(jm3Var);
                                                jm3Var.v();
                                                vh3 vh3Var92 = pj3Var3.r;
                                                pj3.m(vh3Var92);
                                                vh3Var92.y.b("Register tcfPrefChangeListener.");
                                                if (jm3Var.G == null) {
                                                    jm3Var.H = new hl3(jm3Var, pj3Var3, 2);
                                                    jm3Var.G = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: hm3
                                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str9) {
                                                            jm3 jm3Var2 = jm3.this;
                                                            pj3 pj3Var10 = (pj3) jm3Var2.m;
                                                            ec3 ec3Var3 = pj3Var10.p;
                                                            vh3 vh3Var11 = pj3Var10.r;
                                                            if (!ec3Var3.G(null, ug3.Z0)) {
                                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                    pj3.m(vh3Var11);
                                                                    vh3Var11.z.b("IABTCF_TCString change picked up in listener.");
                                                                    hl3 hl3Var = jm3Var2.H;
                                                                    ll3.v(hl3Var);
                                                                    hl3Var.b(500L);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                pj3.m(vh3Var11);
                                                                vh3Var11.z.b("IABTCF_TCString change picked up in listener.");
                                                                hl3 hl3Var2 = jm3Var2.H;
                                                                ll3.v(hl3Var2);
                                                                hl3Var2.b(500L);
                                                            }
                                                        }
                                                    };
                                                }
                                                qi3 qi3Var22 = pj3Var3.q;
                                                pj3.k(qi3Var22);
                                                qi3Var22.B().registerOnSharedPreferenceChangeListener(jm3Var.G);
                                                pj3.l(jm3Var);
                                                jm3Var.C();
                                            }
                                            li3Var = qi3Var.r;
                                            if (li3Var.a() == 0) {
                                                pj3.m(vh3Var);
                                                g10Var6.c(Long.valueOf(j), "Persisting first open");
                                                j2 = j;
                                                li3Var.b(j2);
                                            } else {
                                                j2 = j;
                                            }
                                            pj3.l(jm3Var);
                                            ti3Var = jm3Var.D;
                                            if (ti3Var.e() && ti3Var.d()) {
                                                qi3 qi3Var3 = ti3Var.n.q;
                                                pj3.k(qi3Var3);
                                                qi3Var3.I.e(null);
                                            }
                                            if (pj3Var5.h()) {
                                                pj3Var4 = pj3Var5;
                                                zq3Var2 = zq3Var;
                                                if (TextUtils.isEmpty(pj3Var4.r().D())) {
                                                    w50Var = w50Var22;
                                                } else {
                                                    String D3 = pj3Var4.r().D();
                                                    qi3Var.v();
                                                    String string = qi3Var.A().getString("gmp_app_id", null);
                                                    boolean isEmpty = TextUtils.isEmpty(D3);
                                                    boolean isEmpty2 = TextUtils.isEmpty(string);
                                                    if (!isEmpty && !isEmpty2) {
                                                        ll3.v(D3);
                                                        if (!D3.equals(string)) {
                                                            pj3.m(vh3Var);
                                                            g10Var2.b("Rechecking which service to use due to a GMP App Id change");
                                                            qi3Var.v();
                                                            qi3Var.v();
                                                            Boolean valueOf2 = qi3Var.A().contains("measurement_enabled") ? Boolean.valueOf(qi3Var.A().getBoolean("measurement_enabled", true)) : null;
                                                            SharedPreferences.Editor edit2 = qi3Var.A().edit();
                                                            edit2.clear();
                                                            edit2.apply();
                                                            if (valueOf2 != null) {
                                                                qi3Var.v();
                                                                SharedPreferences.Editor edit3 = qi3Var.A().edit();
                                                                edit3.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                                edit3.apply();
                                                            }
                                                            pj3Var4.o().A();
                                                            pj3Var4.D.E();
                                                            pj3Var4.D.C();
                                                            li3Var.b(j2);
                                                            w50Var = w50Var22;
                                                            w50Var.e(null);
                                                            String D4 = pj3Var4.r().D();
                                                            qi3Var.v();
                                                            SharedPreferences.Editor edit4 = qi3Var.A().edit();
                                                            edit4.putString("gmp_app_id", D4);
                                                            edit4.apply();
                                                        }
                                                    }
                                                    w50Var = w50Var22;
                                                    String D42 = pj3Var4.r().D();
                                                    qi3Var.v();
                                                    SharedPreferences.Editor edit42 = qi3Var.A().edit();
                                                    edit42.putString("gmp_app_id", D42);
                                                    edit42.apply();
                                                }
                                                if (!qi3Var.D().i(vk3Var2)) {
                                                    w50Var.e(null);
                                                }
                                                pj3.l(jm3Var);
                                                jm3Var.s.set(w50Var.d());
                                                try {
                                                    pj3Var92.m.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                } catch (ClassNotFoundException unused4) {
                                                    w50 w50Var3 = qi3Var.H;
                                                    if (!TextUtils.isEmpty(w50Var3.d())) {
                                                        pj3.m(vh3Var);
                                                        vh3Var2 = vh3Var;
                                                        vh3Var2.u.b("Remote config removed with active feature rollouts");
                                                        w50Var3.e(null);
                                                    }
                                                }
                                                vh3Var2 = vh3Var;
                                                if (!TextUtils.isEmpty(pj3Var4.r().D())) {
                                                    boolean b = pj3Var4.b();
                                                    SharedPreferences sharedPreferences2 = qi3Var.o;
                                                    if (!(sharedPreferences2 == null ? false : sharedPreferences2.contains("deferred_analytics_collection")) && !ec3Var.J()) {
                                                        qi3Var.F(!b);
                                                    }
                                                    if (b) {
                                                        pj3.l(jm3Var);
                                                        jm3Var.I();
                                                    }
                                                    ep3 ep3Var = pj3Var4.t;
                                                    pj3.l(ep3Var);
                                                    ep3Var.q.q();
                                                    pj3Var4.p().A(new AtomicReference());
                                                    pj3Var4.p().B(qi3Var.K.G());
                                                }
                                            } else {
                                                if (pj3Var5.b()) {
                                                    zq3Var2 = zq3Var;
                                                    if (zq3Var2.U("android.permission.INTERNET")) {
                                                        g10Var3 = g10Var;
                                                    } else {
                                                        pj3.m(vh3Var);
                                                        g10Var3 = g10Var;
                                                        g10Var3.b("App is missing INTERNET permission");
                                                    }
                                                    if (!zq3Var2.U("android.permission.ACCESS_NETWORK_STATE")) {
                                                        pj3.m(vh3Var);
                                                        g10Var3.b("App is missing ACCESS_NETWORK_STATE permission");
                                                    }
                                                    pj3Var4 = pj3Var5;
                                                    Context context3 = pj3Var4.m;
                                                    if (!i93.a(context3).d() && !ec3Var.z()) {
                                                        if (!zq3.n0(context3)) {
                                                            pj3.m(vh3Var);
                                                            g10Var3.b("AppMeasurementReceiver not registered/enabled");
                                                        }
                                                        if (!zq3.P(context3)) {
                                                            pj3.m(vh3Var);
                                                            g10Var3.b("AppMeasurementService not registered/enabled");
                                                        }
                                                    }
                                                    pj3.m(vh3Var);
                                                    g10Var3.b("Uploading is not possible. App measurement disabled");
                                                } else {
                                                    pj3Var4 = pj3Var5;
                                                    zq3Var2 = zq3Var;
                                                }
                                                vh3Var2 = vh3Var;
                                            }
                                            vr3.a();
                                            if (ec3Var.G(null, ug3.Q0)) {
                                                zq3Var2.v();
                                                if (zq3Var2.S() == 1) {
                                                    long intValue = ((Integer) ug3.x0.a(null)).intValue();
                                                    long nextInt = new Random().nextInt(5000);
                                                    pj3Var4.w.getClass();
                                                    long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                    if (max > 500) {
                                                        pj3.m(vh3Var2);
                                                        g10Var6.c(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                    }
                                                    pj3.l(jm3Var);
                                                    jm3Var.v();
                                                    if (jm3Var.x == null) {
                                                        jm3Var.x = new hl3(jm3Var, pj3Var3, 0);
                                                    }
                                                    jm3Var.x.b(max);
                                                }
                                            }
                                            qi3Var.A.b(true);
                                            return;
                                        }
                                    } else {
                                        j = j3;
                                        zq3Var = zq3Var3;
                                    }
                                    if (!TextUtils.isEmpty(pj3Var5.r().D()) && (i32 == 0 || i32 == 30 || i32 == 10 || i32 == 40)) {
                                        pj3.l(jm3Var);
                                        jm3Var.S(new xk3(-10), false);
                                    }
                                    xk3Var = null;
                                    if (xk3Var != null) {
                                    }
                                    pj3.l(jm3Var);
                                    pj3Var3 = (pj3) jm3Var.m;
                                    jm3Var.A(xk3Var);
                                    qi3Var.v();
                                    int i422 = vc3.b(qi3Var.A().getString("dma_consent_settings", null)).a;
                                    L2 = ec3Var.L("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (L2 != sk3Var) {
                                    }
                                    L3 = ec3Var.L("google_analytics_default_allow_ad_user_data", true);
                                    if (L3 == sk3Var) {
                                    }
                                    if (TextUtils.isEmpty(pj3Var5.r().D())) {
                                    }
                                    if (TextUtils.isEmpty(pj3Var5.r().D())) {
                                        vc3 c2 = vc3.c(30, bundle);
                                        it = c2.e.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                            }
                                        }
                                    }
                                    I = ec3Var.I("google_analytics_tcf_data_enabled");
                                    if (I != null) {
                                    }
                                    pj3.m(vh3Var);
                                    g10Var4.b("TCF client enabled.");
                                    pj3.l(jm3Var);
                                    jm3Var.v();
                                    vh3 vh3Var922 = pj3Var3.r;
                                    pj3.m(vh3Var922);
                                    vh3Var922.y.b("Register tcfPrefChangeListener.");
                                    if (jm3Var.G == null) {
                                    }
                                    qi3 qi3Var222 = pj3Var3.q;
                                    pj3.k(qi3Var222);
                                    qi3Var222.B().registerOnSharedPreferenceChangeListener(jm3Var.G);
                                    pj3.l(jm3Var);
                                    jm3Var.C();
                                    li3Var = qi3Var.r;
                                    if (li3Var.a() == 0) {
                                    }
                                    pj3.l(jm3Var);
                                    ti3Var = jm3Var.D;
                                    if (ti3Var.e()) {
                                        qi3 qi3Var32 = ti3Var.n.q;
                                        pj3.k(qi3Var32);
                                        qi3Var32.I.e(null);
                                    }
                                    if (pj3Var5.h()) {
                                    }
                                    vr3.a();
                                    if (ec3Var.G(null, ug3.Q0)) {
                                    }
                                    qi3Var.A.b(true);
                                    return;
                                }
                                gh3Var3.w = asList;
                                if (packageManager == null) {
                                }
                                ((pj3) gh3Var3.m).O.incrementAndGet();
                                gh3Var3.n = true;
                                pm3Var = new pm3(pj3Var5);
                                pm3Var.y();
                                pj3Var5.G = pm3Var;
                                if (!pm3Var.n) {
                                }
                            }
                        }
                        asList = null;
                        if (asList != null) {
                        }
                        gh3Var3.w = asList;
                        if (packageManager == null) {
                        }
                        ((pj3) gh3Var3.m).O.incrementAndGet();
                        gh3Var3.n = true;
                        pm3Var = new pm3(pj3Var5);
                        pm3Var.y();
                        pj3Var5.G = pm3Var;
                        if (!pm3Var.n) {
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    asList = null;
                    if (asList != null) {
                    }
                    gh3Var3.w = asList;
                    if (packageManager == null) {
                    }
                    ((pj3) gh3Var3.m).O.incrementAndGet();
                    gh3Var3.n = true;
                    pm3Var = new pm3(pj3Var5);
                    pm3Var.y();
                    pj3Var5.G = pm3Var;
                    if (!pm3Var.n) {
                    }
                }
            }
            str5 = str6;
            packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
            }
        }
        packageManager = packageManager2;
        i = Integer.MIN_VALUE;
        str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        str2 = str;
        String str722 = str5;
        gh3Var3.o = packageName;
        gh3Var3.r = str722;
        gh3Var3.p = str2;
        gh3Var3.q = i;
        gh3Var3.s = str;
        gh3Var3.t = 0L;
        g = pj3Var7.g();
        if (g == 0) {
        }
        gh3Var3.z = BuildConfig.FLAVOR;
        o = th2.o(context, pj3Var7.B);
        if (!TextUtils.isEmpty(o)) {
        }
        gh3Var3.z = str3;
        if (g == 0) {
        }
        gh3Var3.w = null;
        ec3 ec3Var222 = pj3Var7.p;
        pj3 pj3Var822 = (pj3) ec3Var222.m;
        ll3.s("analytics.safelisted_events");
        H = ec3Var222.H();
        if (H == null) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        asList = null;
        if (asList != null) {
        }
        gh3Var3.w = asList;
        if (packageManager == null) {
        }
        ((pj3) gh3Var3.m).O.incrementAndGet();
        gh3Var3.n = true;
        pm3Var = new pm3(pj3Var5);
        pm3Var.y();
        pj3Var5.G = pm3Var;
        if (!pm3Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dk1 dk1Var;
        nz0 nz0Var;
        Long valueOf;
        nz0 nz0Var2 = null;
        int i = 0;
        r5 = null;
        Object[] objArr = null;
        int i2 = 1;
        switch (this.m) {
            case 0:
                tt1 tt1Var = (tt1) this.o;
                try {
                    s93.F((bf1) this.n);
                    jm3 jm3Var = (jm3) tt1Var.o;
                    jm3Var.v();
                    tt1Var.v();
                    jm3Var.u = false;
                    jm3Var.v = 1;
                    vh3 vh3Var = ((pj3) jm3Var.m).r;
                    pj3.m(vh3Var);
                    vh3Var.y.c(((ip3) tt1Var.n).m, "Successfully registered trigger URI");
                    jm3Var.V();
                    return;
                } catch (Error e) {
                    e = e;
                    tt1Var.q(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    tt1Var.q(e);
                    return;
                } catch (ExecutionException e3) {
                    tt1Var.q(e3.getCause());
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.n;
                bo2 bo2Var = (bo2) this.o;
                if (arrayList.contains(bo2Var)) {
                    arrayList.remove(bo2Var);
                    in1.a(bo2Var.c.mView, bo2Var.a);
                    return;
                }
                return;
            case 2:
                b3 b3Var = (b3) this.n;
                e3 e3Var = (e3) this.o;
                fk1 fk1Var = e3Var.o;
                if (fk1Var != null && (dk1Var = fk1Var.e) != null) {
                    dk1Var.k(fk1Var);
                }
                View view = (View) e3Var.t;
                if (view != null && view.getWindowToken() != null) {
                    if (!b3Var.b()) {
                        if (b3Var.e != null) {
                            b3Var.d(0, 0, false, false);
                        }
                    }
                    e3Var.E = b3Var;
                }
                e3Var.G = null;
                return;
            case 3:
                ((q3) this.n).m = this.o;
                return;
            case 4:
                ((Application) this.n).unregisterActivityLifecycleCallbacks((q3) this.o);
                return;
            case 5:
                Object obj = this.o;
                Object obj2 = this.n;
                try {
                    Method method = r3.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        r3.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 6:
                ot2 ot2Var = (ot2) this.n;
                Typeface typeface = (Typeface) this.o;
                sg sgVar = (sg) ot2Var.n;
                if (sgVar != null) {
                    sgVar.m(typeface);
                    return;
                }
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                vs0.b((View) this.n, (Rect) this.o);
                return;
            case 8:
                ((c90) this.n).d();
                if (as0.G(2)) {
                    Log.v("FragmentManager", "Transition for operation " + ((bo2) this.o) + "has completed");
                    return;
                }
                return;
            case 9:
                ((fs) this.n).E((bx0) this.o, Unit.a);
                return;
            case 10:
                od1 od1Var = (od1) this.o;
                t40 t40Var = od1Var.p;
                while (true) {
                    try {
                        ((Runnable) this.n).run();
                    } catch (Throwable th2) {
                        zm3.B(th2, h.m);
                    }
                    Runnable R = od1Var.R();
                    if (R == null) {
                        return;
                    }
                    this.n = R;
                    i++;
                    if (i >= 16 && t40Var.P(od1Var)) {
                        t40Var.N(od1Var, this);
                        return;
                    }
                }
                break;
            case 11:
                ((vp0) this.n).accept(this.o);
                return;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((fs) this.o).E((fj0) this.n, Unit.a);
                return;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                c10 c10Var = (c10) this.n;
                my1 my1Var = (my1) this.o;
                ce ceVar = (ce) my1Var.n;
                aa3 aa3Var = (aa3) ((wv0) my1Var.r).v.get((oe) my1Var.o);
                if (aa3Var == null) {
                    return;
                }
                if (c10Var.n != 0) {
                    aa3Var.o(c10Var, null);
                    return;
                }
                my1Var.m = true;
                if (ceVar.k()) {
                    if (!my1Var.m || (nz0Var = (nz0) my1Var.p) == null) {
                        return;
                    }
                    ceVar.l(nz0Var, (Set) my1Var.q);
                    return;
                }
                try {
                    ceVar.l(null, ceVar.b());
                    return;
                } catch (SecurityException e5) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e5);
                    ceVar.c("Failed to get service from broker.");
                    aa3Var.o(new c10(10), null);
                    return;
                }
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ja3 ja3Var = (ja3) this.o;
                ua3 ua3Var = (ua3) this.n;
                c10 c10Var2 = ua3Var.n;
                if (c10Var2.n == 0) {
                    cb3 cb3Var = ua3Var.o;
                    ll3.v(cb3Var);
                    c10 c10Var3 = cb3Var.o;
                    if (c10Var3.n != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c10Var3)), new Exception());
                        ja3Var.n.a(c10Var3);
                        ja3Var.m.o();
                        return;
                    }
                    my1 my1Var2 = ja3Var.n;
                    IBinder iBinder = cb3Var.n;
                    if (iBinder != null) {
                        int i3 = q2.h;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        nz0Var2 = queryLocalInterface instanceof nz0 ? (nz0) queryLocalInterface : new ws3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = ja3Var.k;
                    my1Var2.getClass();
                    if (nz0Var2 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        my1Var2.a(new c10(4));
                    } else {
                        my1Var2.p = nz0Var2;
                        my1Var2.q = set;
                        if (my1Var2.m) {
                            ((ce) my1Var2.n).l(nz0Var2, set);
                        }
                    }
                } else {
                    ja3Var.n.a(c10Var2);
                }
                ja3Var.m.o();
                return;
            case 15:
                qk3 qk3Var = (qk3) this.n;
                qk3Var.f();
                if (dq2.j()) {
                    qk3Var.c().F(this);
                    return;
                }
                uc3 uc3Var = (uc3) this.o;
                Object[] objArr2 = uc3Var.c != 0 ? 1 : null;
                uc3Var.c = 0L;
                if (objArr2 != null) {
                    uc3Var.a();
                    return;
                }
                return;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                jt2 jt2Var = (jt2) this.n;
                boolean k = jt2Var.k();
                te3 te3Var = (te3) this.o;
                ys3 ys3Var = te3Var.p;
                if (k) {
                    ys3Var.r();
                    return;
                }
                try {
                    ys3Var.q(te3Var.o.g(jt2Var));
                    return;
                } catch (mc2 e6) {
                    if (e6.getCause() instanceof Exception) {
                        ys3Var.p((Exception) e6.getCause());
                        return;
                    } else {
                        ys3Var.p(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ys3Var.p(e7);
                    return;
                }
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                te3 te3Var2 = (te3) this.o;
                ys3 ys3Var2 = te3Var2.p;
                try {
                    jt2 jt2Var2 = (jt2) te3Var2.o.g((jt2) this.n);
                    if (jt2Var2 == null) {
                        te3Var2.c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    of3 of3Var = lt2.b;
                    jt2Var2.e(of3Var, te3Var2);
                    jt2Var2.d(of3Var, te3Var2);
                    jt2Var2.a(of3Var, te3Var2);
                    return;
                } catch (mc2 e8) {
                    if (e8.getCause() instanceof Exception) {
                        ys3Var2.p((Exception) e8.getCause());
                        return;
                    } else {
                        ys3Var2.p(e8);
                        return;
                    }
                } catch (Exception e9) {
                    ys3Var2.p(e9);
                    return;
                }
            case 18:
                si3 si3Var = (si3) this.o;
                pj3 pj3Var = si3Var.n.n;
                lj3 lj3Var = pj3Var.s;
                pj3.m(lj3Var);
                lj3Var.v();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", si3Var.m);
                try {
                    pd3 pd3Var = (pd3) ((rd3) this.n);
                    Parcel d = pd3Var.d();
                    od3.b(d, bundle);
                    Parcel c = pd3Var.c(d, 1);
                    Bundle bundle2 = (Bundle) od3.a(c, Bundle.CREATOR);
                    c.recycle();
                    if (bundle2 == null) {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.b("Install Referrer Service returned a null response");
                    }
                } catch (Exception e10) {
                    vh3 vh3Var3 = pj3Var.r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.c(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                lj3 lj3Var2 = pj3Var.s;
                pj3.m(lj3Var2);
                lj3Var2.v();
                throw new IllegalStateException("Unexpected call on client side");
            case 19:
                synchronized (((ei3) this.o).o) {
                    ((uu1) ((ei3) this.o).p).onComplete((jt2) this.n);
                }
                return;
            case 20:
                gq3 gq3Var = (gq3) this.n;
                IBinder iBinder2 = (IBinder) this.o;
                synchronized (gq3Var) {
                    if (iBinder2 == null) {
                        gq3Var.a("Null service connection");
                    } else {
                        try {
                            gq3Var.o = new tt1(iBinder2);
                            gq3Var.m = 2;
                            ((ScheduledExecutorService) gq3Var.r.c).execute(new kk3(gq3Var, i));
                        } catch (RemoteException e11) {
                            gq3Var.a(e11.getMessage());
                        }
                    }
                }
                return;
            case 21:
                a();
                return;
            case 22:
                mk3 mk3Var = (mk3) this.o;
                mk3Var.g.B();
                yb3 yb3Var = (yb3) this.n;
                Object a = yb3Var.o.a();
                oq3 oq3Var = mk3Var.g;
                if (a == null) {
                    oq3Var.getClass();
                    String str = yb3Var.m;
                    ll3.v(str);
                    cs3 Q = oq3Var.Q(str);
                    if (Q != null) {
                        oq3Var.a0(yb3Var, Q);
                        return;
                    }
                    return;
                }
                oq3Var.getClass();
                String str2 = yb3Var.m;
                ll3.v(str2);
                cs3 Q2 = oq3Var.Q(str2);
                if (Q2 != null) {
                    oq3Var.Z(yb3Var, Q2);
                    return;
                }
                return;
            case 23:
                synchronized (((ei3) this.o).o) {
                    xu1 xu1Var = (xu1) ((ei3) this.o).p;
                    Exception h = ((jt2) this.n).h();
                    ll3.v(h);
                    xu1Var.c(h);
                }
                return;
            case 24:
                je3 je3Var = (je3) this.n;
                jm3 jm3Var2 = (jm3) this.o;
                ep3 ep3Var = ((pj3) jm3Var2.m).t;
                pj3.l(ep3Var);
                pj3 pj3Var2 = (pj3) ep3Var.m;
                qi3 qi3Var = pj3Var2.q;
                qi3 qi3Var2 = pj3Var2.q;
                pj3.k(qi3Var);
                if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
                    pj3.k(qi3Var2);
                    pj3Var2.w.getClass();
                    if (!qi3Var2.G(System.currentTimeMillis())) {
                        pj3.k(qi3Var2);
                        if (qi3Var2.C.a() != 0) {
                            pj3.k(qi3Var2);
                            valueOf = Long.valueOf(qi3Var2.C.a());
                            if (valueOf == null) {
                                zq3 zq3Var = ((pj3) jm3Var2.m).u;
                                pj3.k(zq3Var);
                                zq3Var.g0(je3Var, valueOf.longValue());
                                return;
                            } else {
                                try {
                                    je3Var.m(null);
                                    return;
                                } catch (RemoteException e12) {
                                    vh3 vh3Var4 = ((pj3) jm3Var2.m).r;
                                    pj3.m(vh3Var4);
                                    vh3Var4.r.c(e12, "getSessionId failed with exception");
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    vh3 vh3Var5 = pj3Var2.r;
                    pj3.m(vh3Var5);
                    vh3Var5.w.b("Analytics storage consent denied; will not get session id");
                }
                valueOf = null;
                if (valueOf == null) {
                }
            case Constants.MAX_TREE_DEPTH /* 25 */:
                ((jm3) this.o).N((Boolean) this.n, true);
                return;
            case 26:
                jm3 jm3Var3 = (jm3) this.o;
                pj3 pj3Var3 = (pj3) jm3Var3.m;
                qi3 qi3Var3 = pj3Var3.q;
                vh3 vh3Var6 = pj3Var3.r;
                pj3.k(qi3Var3);
                qi3Var3.v();
                qi3Var3.v();
                vc3 b = vc3.b(qi3Var3.A().getString("dma_consent_settings", null));
                vc3 vc3Var = (vc3) this.n;
                int i4 = vc3Var.a;
                if (!xk3.l(i4, b.a)) {
                    pj3.m(vh3Var6);
                    vh3Var6.x.c(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor edit = qi3Var3.A().edit();
                edit.putString("dma_consent_settings", vc3Var.b);
                edit.apply();
                pj3.m(vh3Var6);
                vh3Var6.z.c(vc3Var, "Setting DMA consent(FE)");
                pj3 pj3Var4 = (pj3) jm3Var3.m;
                if (pj3Var4.p().G()) {
                    jo3 p = pj3Var4.p();
                    p.v();
                    p.x();
                    p.K(new do3(p, i2));
                    return;
                }
                jo3 p2 = pj3Var4.p();
                p2.v();
                p2.x();
                if (p2.F()) {
                    p2.K(new ln3(p2, p2.M(false)));
                    return;
                }
                return;
            case 27:
                jm3 jm3Var4 = ((AppMeasurementDynamiteService) this.o).g.y;
                pj3.l(jm3Var4);
                tt1 tt1Var2 = (tt1) this.n;
                jm3Var4.v();
                jm3Var4.x();
                al3 al3Var = jm3Var4.p;
                if (tt1Var2 != al3Var) {
                    ll3.x(al3Var == null, "EventInterceptor already set.");
                }
                jm3Var4.p = tt1Var2;
                return;
            case 28:
                pj3 pj3Var5 = (pj3) ((jm3) this.n).m;
                gh3 r = pj3Var5.r();
                String str3 = (String) this.o;
                String str4 = r.C;
                if (str4 != null && !str4.equals(str3)) {
                    objArr = 1;
                }
                r.C = str3;
                if (objArr != null) {
                    pj3Var5.r().B();
                    return;
                }
                return;
            default:
                synchronized (((ei3) this.o).o) {
                    ((ev1) ((ei3) this.o).p).onSuccess(((jt2) this.n).i());
                }
                return;
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                mh mhVar = new mh(iu0.class.getSimpleName());
                tt1 tt1Var = (tt1) this.o;
                t21 t21Var = new t21(27);
                ((t21) mhVar.p).o = t21Var;
                mhVar.p = t21Var;
                t21Var.n = tt1Var;
                return mhVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ iu0(int i, Object obj, Object obj2, boolean z) {
        this.m = i;
        this.o = obj;
        this.n = obj2;
    }

    public /* synthetic */ iu0(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj2;
        this.o = obj3;
    }

    public iu0(si3 si3Var, rd3 rd3Var, si3 si3Var2) {
        this.m = 18;
        this.n = rd3Var;
        this.o = si3Var;
    }

    public /* synthetic */ iu0(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }
}
