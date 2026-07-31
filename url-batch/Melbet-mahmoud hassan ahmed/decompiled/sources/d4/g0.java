package d4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile g0 f15670j;

    /* renamed from: a, reason: collision with root package name */
    private final String f15671a;

    /* renamed from: b, reason: collision with root package name */
    protected final v3.d f15672b;

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f15673c;

    /* renamed from: d, reason: collision with root package name */
    private final f4.a f15674d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Pair<Object, Object>> f15675e;

    /* renamed from: f, reason: collision with root package name */
    private int f15676f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15677g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15678h;

    /* renamed from: i, reason: collision with root package name */
    private volatile p0 f15679i;

    protected g0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f15671a = (str == null || !r(str2, str3)) ? "FA" : str;
        this.f15672b = v3.g.d();
        this.f15673c = l0.a().a(new s(this), 1);
        this.f15674d = new f4.a(this);
        this.f15675e = new ArrayList();
        try {
            if (g4.b.a(context, "google_app_id", g4.a.a(context)) != null && !n()) {
                this.f15678h = null;
                this.f15677g = true;
                Log.w(this.f15671a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (r(str2, str3)) {
            this.f15678h = str2;
        } else {
            this.f15678h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f15671a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f15671a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        o(new h(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f15671a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new f0(this));
        }
    }

    protected static final boolean n() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(x xVar) {
        this.f15673c.execute(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Exception exc, boolean z6, boolean z7) {
        this.f15677g |= z6;
        if (z6) {
            Log.w(this.f15671a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z7) {
            c(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f15671a, "Error with data collection. Data lost.", exc);
    }

    private final void q(String str, String str2, Bundle bundle, boolean z6, boolean z7, Long l7) {
        o(new v(this, l7, str, str2, bundle, z6, z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(String str, String str2) {
        return (str2 == null || str == null || n()) ? false : true;
    }

    public static g0 s(Context context, String str, String str2, String str3, Bundle bundle) {
        r3.o.i(context);
        if (f15670j == null) {
            synchronized (g0.class) {
                if (f15670j == null) {
                    f15670j = new g0(context, str, str2, str3, bundle);
                }
            }
        }
        return f15670j;
    }

    public final void A(Activity activity, String str, String str2) {
        o(new f(this, activity, str, str2));
    }

    public final void B(Bundle bundle) {
        o(new g(this, bundle));
    }

    public final void C(String str) {
        o(new i(this, str));
    }

    public final void D(String str) {
        o(new j(this, str));
    }

    public final String E() {
        m0 m0Var = new m0();
        o(new k(this, m0Var));
        return m0Var.q0(500L);
    }

    public final String F() {
        m0 m0Var = new m0();
        o(new l(this, m0Var));
        return m0Var.q0(50L);
    }

    public final long G() {
        m0 m0Var = new m0();
        o(new m(this, m0Var));
        Long l7 = (Long) m0.B3(m0Var.O0(500L), Long.class);
        if (l7 != null) {
            return l7.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f15672b.b()).nextLong();
        int i7 = this.f15676f + 1;
        this.f15676f = i7;
        return nextLong + i7;
    }

    public final String H() {
        m0 m0Var = new m0();
        o(new n(this, m0Var));
        return m0Var.q0(500L);
    }

    public final String a() {
        m0 m0Var = new m0();
        o(new o(this, m0Var));
        return m0Var.q0(500L);
    }

    public final Map<String, Object> b(String str, String str2, boolean z6) {
        m0 m0Var = new m0();
        o(new p(this, str, str2, z6, m0Var));
        Bundle O0 = m0Var.O0(5000L);
        if (O0 == null || O0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(O0.size());
        for (String str3 : O0.keySet()) {
            Object obj = O0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void c(int i7, String str, Object obj, Object obj2, Object obj3) {
        o(new q(this, false, 5, str, obj, null, null));
    }

    public final Bundle d(Bundle bundle, boolean z6) {
        m0 m0Var = new m0();
        o(new r(this, bundle, m0Var));
        if (z6) {
            return m0Var.O0(5000L);
        }
        return null;
    }

    public final int e(String str) {
        m0 m0Var = new m0();
        o(new t(this, str, m0Var));
        Integer num = (Integer) m0.B3(m0Var.O0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String f() {
        return this.f15678h;
    }

    public final f4.a t() {
        return this.f15674d;
    }

    protected final p0 u(Context context, boolean z6) {
        try {
            return o0.q0(DynamiteModule.e(context, DynamiteModule.f2494g, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e7) {
            p(e7, true, false);
            return null;
        }
    }

    public final void v(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, null);
    }

    public final void w(String str, String str2, Object obj, boolean z6) {
        o(new w(this, str, str2, obj, z6));
    }

    public final void x(Bundle bundle) {
        o(new c(this, bundle));
    }

    public final void y(String str, String str2, Bundle bundle) {
        o(new d(this, str, str2, bundle));
    }

    public final List<Bundle> z(String str, String str2) {
        m0 m0Var = new m0();
        o(new e(this, str, str2, m0Var));
        List<Bundle> list = (List) m0.B3(m0Var.O0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
