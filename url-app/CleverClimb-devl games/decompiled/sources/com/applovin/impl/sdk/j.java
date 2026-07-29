package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    protected static Context f3289a;
    private com.applovin.impl.sdk.c.c A;
    private t B;
    private a C;
    private o D;
    private PostbackServiceImpl E;
    private com.applovin.impl.sdk.network.d F;
    private MediationServiceImpl G;
    private final Object H = new Object();
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private AppLovinSdk.SdkInitializationListener M;
    private AppLovinSdk.SdkInitializationListener N;

    /* renamed from: b, reason: collision with root package name */
    protected com.applovin.impl.sdk.b.c f3290b;

    /* renamed from: c, reason: collision with root package name */
    private String f3291c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<Activity> f3292d;
    private long e;
    private AppLovinSdkSettings f;
    private String g;
    private AppLovinAdServiceImpl h;
    private NativeAdServiceImpl i;
    private EventServiceImpl j;
    private UserServiceImpl k;
    private VariableServiceImpl l;
    private AppLovinSdk m;
    private p n;
    private com.applovin.impl.sdk.d.q o;
    private com.applovin.impl.sdk.network.a p;
    private com.applovin.impl.sdk.c.h q;
    private com.applovin.impl.sdk.c.j r;
    private k s;
    private com.applovin.impl.sdk.b.e t;
    private com.applovin.impl.sdk.c.f u;
    private i v;
    private d w;
    private q x;
    private n y;
    private com.applovin.impl.sdk.ad.e z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private void T() {
        int i = 90103;
        i = 90103;
        try {
            try {
                if (((Integer) b(com.applovin.impl.sdk.b.d.f3008b, 0)).intValue() < 90103) {
                    Log.i("AppLovinSdk", "SDK has been updated since last run. Continuing...");
                    v().c();
                    v().a();
                } else {
                    Log.d("AppLovinSdk", "SDK has not been updated since last run. Continuing...");
                }
            } catch (Exception e) {
                u().b("AppLovinSdk", "Unable to check for SDK update", e);
            }
        } finally {
            a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<Integer>>) com.applovin.impl.sdk.b.d.f3008b, (com.applovin.impl.sdk.b.d<Integer>) Integer.valueOf(i));
        }
    }

    public static Context x() {
        return f3289a;
    }

    public boolean A() {
        return this.L;
    }

    public com.applovin.impl.sdk.network.a B() {
        return this.p;
    }

    public com.applovin.impl.sdk.d.q C() {
        return this.o;
    }

    public com.applovin.impl.sdk.c.h D() {
        return this.q;
    }

    public com.applovin.impl.sdk.c.j E() {
        return this.r;
    }

    public com.applovin.impl.sdk.network.d F() {
        return this.F;
    }

    public k G() {
        return this.s;
    }

    public com.applovin.impl.sdk.c.f H() {
        return this.u;
    }

    public i I() {
        return this.v;
    }

    public PostbackServiceImpl J() {
        return this.E;
    }

    public AppLovinSdk K() {
        return this.m;
    }

    public d L() {
        return this.w;
    }

    public q M() {
        return this.x;
    }

    public n N() {
        return this.y;
    }

    public com.applovin.impl.sdk.ad.e O() {
        return this.z;
    }

    public com.applovin.impl.sdk.c.c P() {
        return this.A;
    }

    public t Q() {
        return this.B;
    }

    public o R() {
        return this.D;
    }

    public a S() {
        return this.C;
    }

    public MediationServiceImpl a(Activity activity) {
        this.G.maybeInitialize(activity);
        return this.G;
    }

    public <ST> com.applovin.impl.sdk.b.b<ST> a(String str, com.applovin.impl.sdk.b.b<ST> bVar) {
        return this.f3290b.a(str, bVar);
    }

    public <T> T a(com.applovin.impl.sdk.b.b<T> bVar) {
        return (T) this.f3290b.a(bVar);
    }

    public <T> T a(com.applovin.impl.sdk.b.d<T> dVar) {
        return (T) b(dVar, null);
    }

    public <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        return (T) this.t.a(str, t, cls, sharedPreferences);
    }

    public void a() {
        synchronized (this.H) {
            if (!this.I && !this.J) {
                b();
            }
        }
    }

    public void a(long j) {
        this.v.a(j);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.t.a(sharedPreferences);
    }

    public <T> void a(com.applovin.impl.sdk.b.d<T> dVar, T t) {
        this.t.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<T>>) dVar, (com.applovin.impl.sdk.b.d<T>) t);
    }

    public <T> void a(com.applovin.impl.sdk.b.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.t.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<T>>) dVar, (com.applovin.impl.sdk.b.d<T>) t, sharedPreferences);
    }

    public void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.M = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            sdkInitializationListener.onSdkInitialized(new SdkConfigurationImpl(this));
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.m = appLovinSdk;
    }

    public void a(String str) {
        this.f3290b.a(com.applovin.impl.sdk.b.b.ei, str);
        this.f3290b.a();
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        com.applovin.impl.sdk.b.e eVar;
        com.applovin.impl.sdk.b.d<String> dVar;
        String bool;
        this.f3291c = str;
        this.e = System.currentTimeMillis();
        this.f = appLovinSdkSettings;
        f3289a = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f3292d = new WeakReference<>((Activity) context);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                this.n = new p(this);
                this.t = new com.applovin.impl.sdk.b.e(this);
                this.f3290b = new com.applovin.impl.sdk.b.c(this);
                this.f3290b.b();
                this.u = new com.applovin.impl.sdk.c.f(this);
                this.u.b();
                T();
                this.y = new n(this);
                this.w = new d(this);
                this.x = new q(this);
                this.z = new com.applovin.impl.sdk.ad.e(this);
                this.j = new EventServiceImpl(this);
                this.k = new UserServiceImpl(this);
                this.l = new VariableServiceImpl(this);
                this.A = new com.applovin.impl.sdk.c.c(this);
                this.o = new com.applovin.impl.sdk.d.q(this);
                this.p = new com.applovin.impl.sdk.network.a(this);
                this.q = new com.applovin.impl.sdk.c.h(this);
                this.r = new com.applovin.impl.sdk.c.j(this);
                this.s = new k(this);
                this.C = new a(this, context);
                this.h = new AppLovinAdServiceImpl(this);
                this.i = new NativeAdServiceImpl(this);
                this.B = new t(this);
                this.D = new o(this);
                this.E = new PostbackServiceImpl(this);
                this.F = new com.applovin.impl.sdk.network.d(this);
                this.G = new MediationServiceImpl(this);
                this.v = new i(this);
                if (TextUtils.isEmpty(str)) {
                    this.K = true;
                    Log.e("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
                    StringWriter stringWriter = new StringWriter();
                    new Throwable("").printStackTrace(new PrintWriter(stringWriter));
                    Log.e("AppLovinSdk", "Called with an invalid SDK key from: " + stringWriter.toString());
                }
                if (t()) {
                    a(false);
                } else {
                    if (((Boolean) this.f3290b.a(com.applovin.impl.sdk.b.b.X)).booleanValue()) {
                        appLovinSdkSettings.setTestAdsEnabled(com.applovin.impl.sdk.e.l.b(context));
                        appLovinSdkSettings.setVerboseLogging(com.applovin.impl.sdk.e.l.c(context));
                        v().a(appLovinSdkSettings);
                        v().a();
                    }
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    if (TextUtils.isEmpty((String) this.t.b((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.f3007a, (com.applovin.impl.sdk.b.d<String>) null, defaultSharedPreferences))) {
                        this.L = true;
                        eVar = this.t;
                        dVar = com.applovin.impl.sdk.b.d.f3007a;
                        bool = Boolean.toString(true);
                    } else {
                        eVar = this.t;
                        dVar = com.applovin.impl.sdk.b.d.f3007a;
                        bool = Boolean.toString(false);
                    }
                    eVar.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) dVar, (com.applovin.impl.sdk.b.d<String>) bool, defaultSharedPreferences);
                    if (TextUtils.isEmpty((String) a(com.applovin.impl.sdk.b.d.f3009c))) {
                        a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.f3009c, (com.applovin.impl.sdk.b.d<String>) String.valueOf(((int) (Math.random() * 100.0d)) + 1));
                    }
                    b();
                }
            } catch (Throwable th) {
                Log.e("AppLovinSdk", "Failed to load AppLovin SDK, ad serving will be disabled", th);
                a(false);
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        this.t.a(str, (String) t, editor);
    }

    public <T> void a(String str, T t, SharedPreferences sharedPreferences) {
        this.t.a(str, (String) t, sharedPreferences);
    }

    public void a(boolean z) {
        synchronized (this.H) {
            this.I = false;
            this.J = z;
        }
        C().b();
    }

    public <T> T b(com.applovin.impl.sdk.b.d<T> dVar, T t) {
        return (T) this.t.b(dVar, t);
    }

    public <T> T b(com.applovin.impl.sdk.b.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) this.t.b((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<T>>) dVar, (com.applovin.impl.sdk.b.d<T>) t, sharedPreferences);
    }

    public List<String> b(com.applovin.impl.sdk.b.b bVar) {
        return this.f3290b.b(bVar);
    }

    public void b() {
        synchronized (this.H) {
            this.I = true;
            C().a();
            C().a(new com.applovin.impl.sdk.d.k(this), q.a.MAIN);
        }
    }

    public <T> void b(com.applovin.impl.sdk.b.d<T> dVar) {
        this.t.a(dVar);
    }

    public void b(String str) {
        com.applovin.impl.sdk.e.k.a(str);
    }

    public void c(String str) {
        this.g = str;
    }

    public boolean c() {
        boolean z;
        synchronized (this.H) {
            z = this.I;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.H) {
            z = this.J;
        }
        return z;
    }

    public void e() {
        if (this.M != null) {
            this.n.a("AppLovinSdk", "Calling back publisher's initialization completion listener...");
            final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.M;
            if (d()) {
                this.M = null;
                this.N = null;
            } else {
                if (this.N == sdkInitializationListener) {
                    return;
                }
                if (((Boolean) a(com.applovin.impl.sdk.b.b.ab)).booleanValue()) {
                    this.M = null;
                } else {
                    this.N = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(new SdkConfigurationImpl(j.this));
                }
            });
        }
    }

    public void f() {
        long b2 = this.q.b(com.applovin.impl.sdk.c.g.g);
        this.f3290b.c();
        this.f3290b.a();
        this.q.a();
        this.A.b();
        this.r.b();
        this.q.b(com.applovin.impl.sdk.c.g.g, b2 + 1);
        b();
    }

    public boolean g() {
        Iterator<String> it = com.applovin.impl.sdk.e.c.a((String) a(com.applovin.impl.sdk.b.b.ej)).iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(Build.MANUFACTURER)) {
                return true;
            }
        }
        return false;
    }

    public void h() {
        this.B.a(f3289a);
    }

    public boolean i() {
        return this.B.d();
    }

    boolean j() {
        return this.B.e();
    }

    public String k() {
        return com.applovin.impl.sdk.e.k.a();
    }

    public AppLovinSdkSettings l() {
        return this.f;
    }

    public String m() {
        return this.g;
    }

    public AppLovinAdServiceImpl n() {
        return this.h;
    }

    public NativeAdServiceImpl o() {
        return this.i;
    }

    public AppLovinEventService p() {
        return this.j;
    }

    public AppLovinUserService q() {
        return this.k;
    }

    public VariableServiceImpl r() {
        return this.l;
    }

    public String s() {
        return this.f3291c;
    }

    public boolean t() {
        return this.K;
    }

    public p u() {
        return this.n;
    }

    public com.applovin.impl.sdk.b.c v() {
        return this.f3290b;
    }

    public Context w() {
        return f3289a;
    }

    public Activity y() {
        if (this.f3292d != null) {
            return this.f3292d.get();
        }
        return null;
    }

    public long z() {
        return this.e;
    }
}
