package a3;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.e10;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.ht1;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.ads.kj0;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.rr2;
import com.google.android.gms.internal.ads.s33;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.ur2;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.zv3;
import g.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: i, reason: collision with root package name */
    public static final s33 f72i = new s1(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    private static boolean f73j = false;

    /* renamed from: e, reason: collision with root package name */
    private String f78e;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<Pattern> f74a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<Pattern> f75b = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private boolean f76c = true;

    /* renamed from: d, reason: collision with root package name */
    private final Object f77d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f79f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f80g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f81h = Executors.newSingleThreadExecutor();

    public static int A(int i7) {
        if (i7 >= 5000) {
            return i7;
        }
        if (i7 <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i7);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        io0.g(sb.toString());
        return 60000;
    }

    public static final boolean B(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return x(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, C(context));
    }

    private static KeyguardManager C(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle D(Context context) {
        try {
            return w3.c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
            r1.l("Error getting metadata", e7);
            return null;
        }
    }

    private static String E(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private final JSONArray F(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            G(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void G(JSONArray jSONArray, Object obj) {
        Object F;
        if (obj instanceof Bundle) {
            F = M((Bundle) obj);
        } else if (obj instanceof Map) {
            F = N((Map) obj);
        } else {
            if (!(obj instanceof Collection)) {
                if (!(obj instanceof Object[])) {
                    jSONArray.put(obj);
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                for (Object obj2 : (Object[]) obj) {
                    G(jSONArray2, obj2);
                }
                jSONArray.put(jSONArray2);
                return;
            }
            F = F((Collection) obj);
        }
        jSONArray.put(F);
    }

    private final void H(JSONObject jSONObject, String str, Object obj) {
        Collection<?> asList;
        Object F;
        if (obj instanceof Bundle) {
            F = M((Bundle) obj);
        } else if (obj instanceof Map) {
            F = N((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else {
                if (!(obj instanceof Object[])) {
                    jSONObject.put(str, obj);
                    return;
                }
                asList = Arrays.asList((Object[]) obj);
            }
            F = F(asList);
        }
        jSONObject.put(str, F);
    }

    private static boolean I(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static void U(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            wo0.f13894a.execute(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long a(View view) {
        float f7 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f7 = Math.min(f7, view2.getAlpha());
            view = view2.getParent();
        } while (f7 > 0.0f);
        return Math.round((f7 >= 0.0f ? f7 : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", y2.t.q().L(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new u0(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e7) {
            io0.h("Could not fetch MRAID JS.", e7);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b0(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final int c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (v3.l.k()) {
            if (((Boolean) sw.c().b(m10.f8247l6)).booleanValue()) {
                return 0;
            }
        }
        return telephonyManager.getNetworkType();
    }

    @TargetApi(18)
    public static final void c0(Context context, Intent intent) {
        if (intent != null && v3.l.d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final String d() {
        Resources d7 = y2.t.p().d();
        return d7 != null ? d7.getString(w2.b.f23013n) : "Test Ad";
    }

    public static final String d0(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return E(D(context));
    }

    public static final x0 e(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                io0.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof x0 ? (x0) queryLocalInterface : new v0(iBinder);
        } catch (Exception e7) {
            y2.t.p().s(e7, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    static final String e0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final boolean f(Context context, String str) {
        Context a7 = kj0.a(context);
        return w3.c.a(a7).b(str, a7.getPackageName()) == 0;
    }

    public static final String f0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final boolean g(String str) {
        if (!ho0.l()) {
            return false;
        }
        if (!((Boolean) sw.c().b(m10.f8336x3)).booleanValue()) {
            return false;
        }
        String str2 = (String) sw.c().b(m10.f8350z3);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) sw.c().b(m10.f8343y3);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final DisplayMetrics g0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    @TargetApi(16)
    public static final boolean h(Context context) {
        KeyguardManager C;
        return context != null && v3.l.b() && (C = C(context)) != null && C.isKeyguardLocked();
    }

    protected static final int[] h0() {
        return new int[]{0, 0};
    }

    public static final boolean i(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            io0.e("Error loading class.", th);
            y2.t.p().s(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean j(Context context) {
        boolean z6;
        if (v3.l.j()) {
            if (((Boolean) sw.c().b(m10.f8231j6)).booleanValue()) {
                synchronized (g2.class) {
                    z6 = f73j;
                }
                return z6;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean k(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean l(Context context) {
        Bundle D = D(context);
        return TextUtils.isEmpty(E(D)) && !TextUtils.isEmpty(D.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean m(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void n(View view, int i7, MotionEvent motionEvent) {
        String str;
        int i8;
        int i9;
        int i10;
        String str2;
        rr2 A;
        ur2 D;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof ht1) {
                view2 = ((ht1) view2).getChildAt(0);
            }
            if ((view2 instanceof u2.n) || (view2 instanceof f3.e)) {
                str = "NATIVE";
                i8 = 1;
            } else {
                str = "UNKNOWN";
                i8 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i10 = rect.width();
                i9 = rect.height();
            } else {
                i9 = 0;
                i10 = 0;
            }
            y2.t.q();
            long a7 = a(view2);
            view2.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof cv0) || (D = ((cv0) view2).D()) == null) {
                str2 = "none";
            } else {
                str2 = D.f12947b;
                int hashCode = view2.hashCode();
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                sb.append(str2);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if ((view2 instanceof vt0) && (A = ((vt0) view2).A()) != null) {
                str = rr2.a(A.f11369b);
                i8 = A.f11377f;
                str3 = A.F;
            }
            io0.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i8), view2.getClass().getName(), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i10), Integer.valueOf(i9), Long.valueOf(a7), Integer.toString(i7, 2)));
        } catch (Exception e7) {
            io0.e("Failure getting view location.", e7);
        }
    }

    public static final void o(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new f1(context, str, (String) it.next()).b();
        }
    }

    public static final void p(Context context, Throwable th) {
        if (context != null) {
            try {
                if (j30.f6955b.e().booleanValue()) {
                    v3.f.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void q(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int r(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            io0.g("Could not parse value:".concat(e7.toString()));
            return 0;
        }
    }

    public static final Map<String, String> s(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse t(HttpURLConnection httpURLConnection) {
        y2.t.q();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        y2.t.q();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i7 = 1;
                while (true) {
                    if (i7 >= split.length) {
                        break;
                    }
                    if (split[i7].trim().startsWith("charset")) {
                        String[] split2 = split[i7].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i7++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return y2.t.r().m(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] u(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? h0() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    protected static final String v(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return e0();
        }
    }

    public static final int[] w(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] h02 = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? h0() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{qw.b().b(activity, h02[0]), qw.b().b(activity, h02[1])};
    }

    public static final boolean x(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z6 = y2.t.q().f76c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || b0(view);
        long a7 = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z6)) {
            if (!((Boolean) sw.c().b(m10.W0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) sw.c().b(m10.c7)).booleanValue()) {
                    return true;
                }
                if (a7 >= ((Integer) sw.c().b(m10.e7)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @TargetApi(18)
    public static final void y(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            c0(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            io0.b(sb.toString());
        } catch (ActivityNotFoundException e7) {
            io0.e("No browser is found.", e7);
        }
    }

    public static final int[] z(Activity activity) {
        int[] u6 = u(activity);
        return new int[]{qw.b().b(activity, u6[0]), qw.b().b(activity, u6[1])};
    }

    public final cc3<Map<String, String>> J(final Uri uri) {
        return rb3.k(new Callable() { // from class: a3.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                s33 s33Var = g2.f72i;
                y2.t.q();
                return g2.s(uri2);
            }
        }, this.f81h);
    }

    public final String L(Context context, String str) {
        synchronized (this.f77d) {
            String str2 = this.f78e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return e0();
            }
            try {
                this.f78e = y2.t.r().d(context);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.f78e)) {
                qw.b();
                if (bo0.p()) {
                    this.f78e = v(context);
                } else {
                    this.f78e = null;
                    f72i.post(new z1(this, context));
                    while (this.f78e == null) {
                        try {
                            this.f77d.wait();
                        } catch (InterruptedException unused2) {
                            String e02 = e0();
                            this.f78e = e02;
                            String valueOf = String.valueOf(e02);
                            io0.g(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                        }
                    }
                }
            }
            String valueOf2 = String.valueOf(this.f78e);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 10 + str.length());
            sb.append(valueOf2);
            sb.append(" (Mobile; ");
            sb.append(str);
            this.f78e = sb.toString();
            try {
                if (w3.c.a(context).g()) {
                    this.f78e = String.valueOf(this.f78e).concat(";aia");
                }
            } catch (Exception e7) {
                y2.t.p().s(e7, "AdUtil.getUserAgent");
            }
            String concat = String.valueOf(this.f78e).concat(")");
            this.f78e = concat;
            return concat;
        }
    }

    public final JSONObject M(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            H(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject N(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                H(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e7) {
            String valueOf = String.valueOf(e7.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject O(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return M(bundle);
        } catch (JSONException e7) {
            io0.e("Error converting Bundle to JSON", e7);
            return null;
        }
    }

    public final void S(Context context, String str, boolean z6, HttpURLConnection httpURLConnection, boolean z7, int i7) {
        int A = A(i7);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(A);
        sb.append(" milliseconds.");
        io0.f(sb.toString());
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        httpURLConnection.setRequestProperty("User-Agent", L(context, str));
        httpURLConnection.setUseCaches(false);
    }

    @TargetApi(26)
    public final void T(Context context) {
        if (v3.l.j()) {
            if (((Boolean) sw.c().b(m10.f8231j6)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new b2(this));
            }
        }
    }

    public final void V(Context context, String str, String str2, Bundle bundle, boolean z6) {
        y2.t.q();
        bundle.putString("device", f0());
        bundle.putString("eids", TextUtils.join(",", m10.a()));
        qw.b();
        bo0.r(context, str, "gmob-apps", bundle, true, new a2(this, context, str));
    }

    public final boolean W(String str) {
        return I(str, this.f74a, (String) sw.c().b(m10.W));
    }

    public final boolean X(String str) {
        return I(str, this.f75b, (String) sw.c().b(m10.X));
    }

    public final boolean Y(Context context) {
        if (this.f80g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new d2(this, null), intentFilter);
        this.f80g = true;
        return true;
    }

    public final boolean Z(Context context) {
        if (this.f79f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new f2(this, null), intentFilter);
        this.f79f = true;
        return true;
    }

    @TargetApi(18)
    public final int a0(Context context, Uri uri) {
        int i7;
        if (context == null) {
            r1.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!v3.l.d()) {
            r1.k("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i7 = 1;
        } else if (context instanceof Activity) {
            i7 = 0;
        } else {
            r1.k("Chrome Custom Tabs can only work with Activity context.");
            i7 = 2;
        }
        e10<Boolean> e10Var = m10.f8180d3;
        Boolean bool = (Boolean) sw.c().b(e10Var);
        e10<Boolean> e10Var2 = m10.f8188e3;
        if (true == bool.equals(sw.c().b(e10Var2))) {
            i7 = 9;
        }
        if (i7 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i7;
        }
        if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
            l20 l20Var = new l20();
            l20Var.e(new y1(this, l20Var, context, uri));
            l20Var.b((Activity) context);
        }
        if (!((Boolean) sw.c().b(e10Var2)).booleanValue()) {
            return 5;
        }
        g.c a7 = new c.a().a();
        a7.f16206a.setPackage(zv3.a(context));
        a7.a(context, uri);
        return 5;
    }
}
