package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o9 {

    /* renamed from: k, reason: collision with root package name */
    private static final String f18495k = "1.0.6";

    /* renamed from: l, reason: collision with root package name */
    public static String f18496l = "";

    /* renamed from: a, reason: collision with root package name */
    private final of f18497a;

    /* renamed from: b, reason: collision with root package name */
    private String f18498b;

    /* renamed from: c, reason: collision with root package name */
    private String f18499c;

    /* renamed from: d, reason: collision with root package name */
    private String f18500d;

    /* renamed from: e, reason: collision with root package name */
    private String f18501e;

    /* renamed from: f, reason: collision with root package name */
    private ContextProvider f18502f;

    /* renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f18503g;

    /* renamed from: h, reason: collision with root package name */
    public String f18504h;

    /* renamed from: i, reason: collision with root package name */
    private String f18505i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18506j;

    class a implements InterfaceC1430b {
        a() {
        }

        @Override // com.ironsource.InterfaceC1430b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" ");
                    sb.append("(");
                    sb.append(thread.getState().toString());
                    sb.append(")");
                    sb.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            o9.f18496l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC1430b
        public void b() {
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f18508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18509b;

        b(Context context, String str) {
            this.f18508a = context;
            this.f18509b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String p4 = o9.this.f18497a.p(this.f18508a);
                if (!TextUtils.isEmpty(p4)) {
                    o9.this.f18499c = p4;
                }
                String a4 = o9.this.f18497a.a(this.f18508a);
                if (!TextUtils.isEmpty(a4)) {
                    o9.this.f18501e = a4;
                }
                SharedPreferences.Editor edit = this.f18508a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", o9.this.f18499c);
                edit.putString("sId", this.f18509b);
                edit.apply();
            } catch (Exception e4) {
                IronLog.INTERNAL.error(e4.toString());
            }
        }
    }

    class c extends p9 {
        c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile o9 f18512a = new o9(null);

        private d() {
        }
    }

    private o9() {
        this.f18506j = false;
        this.f18497a = nm.S().f();
        this.f18502f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f18503g = defaultUncaughtExceptionHandler;
        this.f18505i = " ";
        this.f18504h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new m9(defaultUncaughtExceptionHandler));
    }

    static List<lc> c() {
        return null;
    }

    public static o9 d() {
        return d.f18512a;
    }

    Context a() {
        return this.f18502f.getApplicationContext();
    }

    public String b() {
        return f18495k;
    }

    String e() {
        return this.f18505i;
    }

    /* synthetic */ o9(a aVar) {
        this();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                return networkCapabilities.hasTransport(1) ? x8.f20294b : networkCapabilities.hasTransport(0) ? x8.f20299g : "none";
            } catch (Exception e4) {
                IronLog.INTERNAL.error(e4.toString());
                return "none";
            }
        }
        return "none";
    }

    private void a(Context context, HashSet<String> hashSet) {
        String a4 = a(a());
        if (a4.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f18499c);
        String string2 = sharedPreferences.getString("sId", this.f18500d);
        List<lc> b4 = fa.b();
        IronLog.INTERNAL.verbose("reportList size " + b4.size());
        for (lc lcVar : b4) {
            JSONObject jSONObject = new JSONObject();
            String b5 = lcVar.b();
            String e4 = lcVar.e();
            String d4 = lcVar.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo z4 = this.f18497a.z(context);
                if (z4 != null) {
                    jSONObject2.put("availRam", this.f18497a.c(z4));
                    jSONObject2.put(ge.f16508x, this.f18497a.b(z4));
                    jSONObject2.put(ge.f16511y, this.f18497a.a(z4));
                }
                String i4 = this.f18497a.i();
                if (i4 != null) {
                    jSONObject2.put(ge.f16514z, i4);
                }
                jSONObject2.put("crashDate", b5);
                jSONObject2.put("stacktraceCrash", e4);
                jSONObject2.put("crashType", d4);
                jSONObject2.put("CrashReporterVersion", f18495k);
                jSONObject2.put(b9.i.f15576q, "8.8.0");
                jSONObject2.put(b9.i.f15585x, this.f18497a.b(context));
                jSONObject2.put(b9.i.f15541W, C1442c4.b(context, packageName));
                jSONObject2.put(b9.i.f15570n, this.f18497a.p());
                jSONObject2.put("network", a4);
                jSONObject2.put(b9.i.f15574p, this.f18497a.l());
                jSONObject2.put(b9.i.f15566l, this.f18497a.e());
                jSONObject2.put("totalRam", this.f18497a.h(context));
                jSONObject2.put("deviceOS", this.f18497a.m());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put(b9.i.f15564k, this.f18497a.g());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f18501e)) {
                    jSONObject2.put(b9.i.f15531M, Boolean.parseBoolean(this.f18501e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e5) {
                            IronLog.INTERNAL.error(e5.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        fa.a();
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f18506j);
        if (!this.f18506j || th == null) {
            return;
        }
        new lc(new n9(th).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z4, String str3, int i4, boolean z5) {
        Context applicationContext = this.f18502f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f18505i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f18504h = str;
            }
            this.f18500d = str3;
            if (z4) {
                new C1423a(i4).a(z5).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f18506j = true;
        IronLog.INTERNAL.verbose("initialized");
    }
}
