package t2;

import O.InterfaceC0362y;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC2789Te;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3298hB;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2662Ln;
import com.google.android.gms.internal.ads.C2707Oh;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3851ra;
import com.google.android.gms.internal.ads.C3905sa;
import com.google.android.gms.internal.ads.C4035uw;
import com.google.android.gms.internal.ads.CN;
import com.google.android.gms.internal.ads.InterfaceC3352iB;
import com.google.android.gms.internal.ads.InterfaceC3858rh;
import com.google.android.gms.internal.ads.RunnableC3068d;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import com.google.android.gms.internal.ads.TA;
import com.google.android.gms.internal.ads.Ut;
import com.google.android.gms.internal.ads.Wt;
import com.google.android.gms.internal.ads.XC;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4846f;
import q2.C4907p;
import t0.AbstractC5051n;
import u2.C5107a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: l, reason: collision with root package name */
    public static final D f40858l = new D(Looper.getMainLooper(), 3);

    /* renamed from: g, reason: collision with root package name */
    public String f40865g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f40866h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f40859a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f40860b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f40861c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f40862d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f40863e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f40864f = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40867j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f40868k = Executors.newSingleThreadExecutor();

    public static final String A(Context context, String str) {
        Context context2;
        if (str == null) {
            p2.j.f39798C.f39808h.d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31678h)).booleanValue()) {
                return N();
            }
            str = C5107a.a().f41217n;
        }
        String str2 = null;
        try {
            if (T7.v.f3168c == null) {
                T7.v.f3168c = new T7.v();
            }
            T7.v vVar = T7.v.f3168c;
            if (TextUtils.isEmpty(vVar.f3170b)) {
                AtomicBoolean atomicBoolean = L2.h.f1727a;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                vVar.f3170b = (String) K3.b.G(context, new B2.y(2, context2, context));
            }
            str2 = vVar.f3170b;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = N();
        }
        String o9 = D.y.o(new StringBuilder(String.valueOf(str2).length() + 10 + String.valueOf(str).length()), str2, " (Mobile; ", str);
        try {
            if (U2.c.a(context).f()) {
                StringBuilder sb = new StringBuilder(o9.length() + 4);
                sb.append(o9);
                sb.append(";aia");
                o9 = sb.toString();
            }
        } catch (Exception e6) {
            p2.j.f39798C.f39808h.d("AdUtil.getUserAgent", e6);
        }
        return o9.concat(")");
    }

    public static ArrayList H() {
        C3151ea c3151ea = AbstractC3368ia.f31613a;
        ArrayList C7 = q2.r.f40116e.f40117a.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = C7.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.bumptech.glide.manager.o d2 = com.bumptech.glide.manager.o.d(new TA(','));
            str.getClass();
            Iterator g9 = ((InterfaceC3352iB) d2.f23625w).g(d2, str);
            while (true) {
                AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
                if (abstractC3298hB.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) abstractC3298hB.next()));
                    } catch (NumberFormatException unused) {
                        C.k("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static S0.c I(Context context) {
        LocaleList systemLocales;
        LocaleList systemLocales2;
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new S0.c(18, locale.getLanguage(), locale.getCountry());
        }
        S0.c cVar = new S0.c(18, Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager d2 = P.e.d(context.getSystemService(P.e.l()));
            if (d2 != null) {
                systemLocales = d2.getSystemLocales();
                if (!systemLocales.isEmpty()) {
                    systemLocales2 = d2.getSystemLocales();
                    Locale locale2 = systemLocales2.get(0);
                    return new S0.c(18, locale2.getLanguage(), locale2.getCountry());
                }
            }
            return cVar;
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.d("AdUtil.getSystemDefaultLocale", th);
            return cVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean K(View view) {
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

    public static final void L(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String M(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return x(y(context));
    }

    public static final String N() {
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

    public static final String O() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : D.y.o(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap P(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e6) {
            p2.j.f39798C.f39808h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e6);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long Q(View view) {
        float f6 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f6 = Math.min(f6, view2.getAlpha());
            view = view2.getParent();
        } while (f6 > 0.0f);
        return Math.round((f6 >= 0.0f ? f6 : 0.0f) * 100.0f);
    }

    public static final int a(View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof InterfaceC0362y) {
                return 4;
            }
            C3151ea c3151ea = AbstractC3368ia.d9;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                String str = (String) rVar.f40119c.a(AbstractC3368ia.e9);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final u b(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                int i = C.f40822b;
                u2.i.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof u ? (u) queryLocalInterface : new t(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 2);
        } catch (Exception e6) {
            p2.j.f39798C.f39808h.d("Failed to instantiate WorkManagerUtil", e6);
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        int i = AbstractC2789Te.f27792a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return U2.c.a(context).f3280n.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        try {
            if (S2.b.f2971h == null) {
                S2.b.f2971h = Boolean.valueOf(S2.b.g() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return S2.b.f2971h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean e(String str) {
        if (u2.f.c()) {
            C3151ea c3151ea = AbstractC3368ia.f31647d6;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                String str2 = (String) rVar.f40119c.a(AbstractC3368ia.f6);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.e6);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = C.f40822b;
            u2.i.d("Error loading class.", th);
            p2.j.f39798C.f39808h.d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean g(Context context) {
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

    public static final boolean h(Context context) {
        try {
            Bundle y6 = y(context);
            String string = y6.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(x(y6))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
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

    public static final void j(int i, View view) {
        String str;
        int i4;
        int i9;
        int i10;
        String str2;
        String str3;
        String str4;
        Ut J;
        Wt x02;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof C2662Ln) {
                view2 = ((C2662Ln) view2).getChildAt(0);
            }
            if (view2 instanceof NativeAdView) {
                str = "NATIVE";
                i4 = 1;
            } else {
                str = "UNKNOWN";
                i4 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i10 = rect.width();
                i9 = rect.height();
            } else {
                i9 = 0;
                i10 = 0;
            }
            G g9 = p2.j.f39798C.f39803c;
            long Q3 = Q(view2);
            view2.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str5 = "none";
            if (!(view2 instanceof InterfaceC3858rh) || (x02 = ((InterfaceC3858rh) view2).x0()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = x02.f28491b;
                int hashCode = view2.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof InterfaceC3858rh) || (J = ((InterfaceC3858rh) view2).J()) == null) {
                str4 = str2;
            } else {
                str4 = Ut.a(J.f28141b);
                i4 = J.f28147e;
                str5 = J.f28114E;
            }
            Locale locale = Locale.US;
            String str6 = "<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str3 + ", format=" + str4 + ", impType=" + i4 + ", class=" + view2.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i10 + ", vHeight=" + i9 + ", alpha=" + Q3 + ", state=" + Integer.toString(i, 2) + ">";
            int i13 = C.f40822b;
            u2.i.e(str6);
        } catch (Exception e6) {
            int i14 = C.f40822b;
            u2.i.d("Failure getting view location.", e6);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        W3.e eVar = p2.j.f39798C.f39806f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, Ut ut, C3165eo c3165eo) {
        C2593Hm a9 = c3165eo.a();
        a9.r(NativeAdvancedJsUtils.f18064p, "can_show");
        p2.j jVar = p2.j.f39798C;
        G g9 = jVar.f39803c;
        a9.r("foreground", true != g(context) ? "1" : "0");
        a9.r("fg_al", true == jVar.f39807g.p() ? "1" : "0");
        if (ut != null) {
            List list = ut.f28175t;
            if (!list.isEmpty()) {
                a9.r("ancn", (String) list.get(0));
            }
            a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, Ut.a(ut.f28141b));
        }
        a9.s();
    }

    public static final boolean m(Ut ut) {
        return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xe)).booleanValue() && ut != null && ut.f28147e == 4;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e6) {
            String concat = "Could not parse value:".concat(e6.toString());
            int i = C.f40822b;
            u2.i.f(concat);
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31825x)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        C4907p c4907p = C4907p.f40108g;
        return new int[]{c4907p.f40109a.h(activity, iArr[0]), c4907p.f40109a.h(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z8 = p2.j.f39798C.f39803c.f40863e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view);
        long Q3 = Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z8)) {
            C3151ea c3151ea = AbstractC3368ia.f31554T1;
            q2.r rVar = q2.r.f40116e;
            if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                C3151ea c3151ea2 = AbstractC3368ia.Xb;
                if (!((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue() || Q3 >= ((Integer) r6.a(AbstractC3368ia.Zb)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.uc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e6) {
            int i = C.f40822b;
            u2.i.g("", e6);
            p2.j.f39798C.f39808h.d("AdUtil.startActivityWithUnknownContext", e6);
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            L(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            String sb2 = sb.toString();
            int i = C.f40822b;
            u2.i.a(sb2);
        } catch (ActivityNotFoundException e6) {
            int i4 = C.f40822b;
            u2.i.d("No browser is found.", e6);
        }
    }

    public static int u(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String d2 = AbstractC5051n.d(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.", new StringBuilder(String.valueOf(i).length() + 86));
        int i4 = C.f40822b;
        u2.i.f(d2);
        return 60000;
    }

    public static final void v(Context context, Intent intent, C3165eo c3165eo, String str) {
        C3151ea c3151ea = AbstractC3368ia.Ce;
        q2.r rVar = q2.r.f40116e;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar.f40119c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue() || !(context instanceof C2707Oh)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.Ee))) {
                s(context, intent);
                return;
            }
            ((C2707Oh) context).a(intent);
            if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.De)).booleanValue() || c3165eo == null) {
                return;
            }
            C2593Hm a9 = c3165eo.a();
            a9.r(NativeAdvancedJsUtils.f18064p, "hila");
            if (str == null) {
                str = "";
            }
            a9.r("gqi", str);
            a9.v();
        } catch (ActivityNotFoundException e6) {
            e = e6;
            int i = C.f40822b;
            u2.i.d("Error occurred while starting activity for result", e);
            p2.j.f39798C.f39808h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (SecurityException e9) {
            e = e9;
            int i4 = C.f40822b;
            u2.i.d("Error occurred while starting activity for result", e);
            p2.j.f39798C.f39808h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (Exception e10) {
            int i9 = C.f40822b;
            u2.i.d("Error occurred while starting activity for result", e10);
            p2.j.f39798C.f39808h.d("AdUtil.startActivityForResult", e10);
            s(context, intent);
        }
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static Bundle y(Context context) {
        try {
            return U2.c.a(context).c(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e6) {
            C.l("Error getting metadata", e6);
            return null;
        }
    }

    public static final void z(com.bumptech.glide.manager.n nVar, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        Intent intent = (Intent) nVar.f23618u;
        if (i >= 0) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i4 = bundle.getInt("cbp", -1);
        if (i4 < 0 || i4 > 2) {
            return;
        }
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i4);
    }

    public final void B(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int u7 = u(i);
        String d2 = AbstractC5051n.d(u7, "HTTP timeout: ", " milliseconds.", new StringBuilder(String.valueOf(u7).length() + 28));
        int i4 = C.f40822b;
        u2.i.e(d2);
        httpURLConnection.setConnectTimeout(u7);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(u7);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void C(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC3368ia.a(context);
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new Q0.d(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new Q0.d(this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void D(Context context) {
        if (this.f40867j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC3368ia.a(context);
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C4035uw(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C4035uw(1), intentFilter, 4);
        }
        this.f40867j = true;
    }

    public final String E(Context context, String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Gc)).booleanValue()) {
            if (this.f40866h != null) {
                return this.f40866h;
            }
            String A8 = A(context, str);
            if (str != null) {
                this.f40866h = A8;
            }
            return A8;
        }
        synchronized (this.f40864f) {
            try {
                String str2 = this.f40865g;
                if (str2 != null) {
                    return str2;
                }
                String A9 = A(context, str);
                if (str != null) {
                    this.f40865g = A9;
                }
                return A9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F(String str) {
        return w(str, this.f40859a, (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31492M0));
    }

    public final boolean G(String str) {
        return w(str, this.f40860b, (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31501N0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (u2.d.r() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J(Context context, Uri uri, Bundle bundle) {
        String c4;
        if (context == null) {
            C.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        C3151ea c3151ea = AbstractC3368ia.f31848z5;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (booleanValue) {
            C3851ra c3851ra = p2.j.f39798C.f39813n;
            if (c3851ra.f34044w == null) {
                AbstractC3212fg.f30738a.execute(new RunnableC3068d(13, c3851ra));
            }
            com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n(c3851ra.f34044w);
            z(nVar, bundle);
            S0.l b9 = nVar.b();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31506N5)).booleanValue()) {
                u2.d dVar = C4907p.f40108g.f40109a;
            }
            ((Intent) b9.f2910u).setPackage(XC.c(context));
            b9.q(context, uri);
            return 5;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31830x5)).booleanValue()) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(uri);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return 9;
        }
        C3905sa c3905sa = new C3905sa();
        c3905sa.f34249d = new S0.i(this, c3905sa, bundle, context, uri);
        Activity activity = (Activity) context;
        if (c3905sa.f34247b == null && (c4 = XC.c(activity)) != null) {
            CN cn = new CN(c3905sa);
            c3905sa.f34248c = cn;
            AbstractC4846f.a(activity, c4, cn);
        }
        return 5;
    }
}
