package g3;

import a3.e1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.an0;
import com.google.android.gms.internal.ads.bt2;
import com.google.android.gms.internal.ads.bw0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.cy2;
import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.e43;
import com.google.android.gms.internal.ads.fa1;
import com.google.android.gms.internal.ads.fn0;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.ib3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.is2;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.mg1;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.sh0;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.vv1;
import com.google.android.gms.internal.ads.wv1;
import com.google.android.gms.internal.ads.ww2;
import com.google.android.gms.internal.ads.xa3;
import com.google.android.gms.internal.ads.xw2;
import com.google.android.gms.internal.ads.ym0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f0 extends an0 {
    protected static final List<String> D = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    protected static final List<String> E = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List<String> F = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    protected static final List<String> G = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int H = 0;
    private final po0 A;
    private String B;

    /* renamed from: f, reason: collision with root package name */
    private final bw0 f16618f;

    /* renamed from: g, reason: collision with root package name */
    private Context f16619g;

    /* renamed from: h, reason: collision with root package name */
    private final gb f16620h;

    /* renamed from: i, reason: collision with root package name */
    private final bt2<rr1> f16621i;

    /* renamed from: j, reason: collision with root package name */
    private final dc3 f16622j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f16623k;

    /* renamed from: l, reason: collision with root package name */
    private sh0 f16624l;

    /* renamed from: p, reason: collision with root package name */
    private final l f16628p;

    /* renamed from: q, reason: collision with root package name */
    private final wv1 f16629q;

    /* renamed from: r, reason: collision with root package name */
    private final xw2 f16630r;

    /* renamed from: s, reason: collision with root package name */
    private final cy2 f16631s;

    /* renamed from: m, reason: collision with root package name */
    private Point f16625m = new Point();

    /* renamed from: n, reason: collision with root package name */
    private Point f16626n = new Point();

    /* renamed from: o, reason: collision with root package name */
    private final Set<WebView> f16627o = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: z, reason: collision with root package name */
    private final AtomicInteger f16638z = new AtomicInteger(0);

    /* renamed from: t, reason: collision with root package name */
    private final boolean f16632t = ((Boolean) sw.c().b(m10.f8345y5)).booleanValue();

    /* renamed from: u, reason: collision with root package name */
    private final boolean f16633u = ((Boolean) sw.c().b(m10.f8338x5)).booleanValue();

    /* renamed from: v, reason: collision with root package name */
    private final boolean f16634v = ((Boolean) sw.c().b(m10.f8352z5)).booleanValue();

    /* renamed from: w, reason: collision with root package name */
    private final boolean f16635w = ((Boolean) sw.c().b(m10.B5)).booleanValue();

    /* renamed from: x, reason: collision with root package name */
    private final String f16636x = (String) sw.c().b(m10.A5);

    /* renamed from: y, reason: collision with root package name */
    private final String f16637y = (String) sw.c().b(m10.C5);
    private final String C = (String) sw.c().b(m10.D5);

    public f0(bw0 bw0Var, Context context, gb gbVar, bt2<rr1> bt2Var, dc3 dc3Var, ScheduledExecutorService scheduledExecutorService, wv1 wv1Var, xw2 xw2Var, cy2 cy2Var, po0 po0Var) {
        this.f16618f = bw0Var;
        this.f16619g = context;
        this.f16620h = gbVar;
        this.f16621i = bt2Var;
        this.f16622j = dc3Var;
        this.f16623k = scheduledExecutorService;
        this.f16628p = bw0Var.u();
        this.f16629q = wv1Var;
        this.f16630r = xw2Var;
        this.f16631s = cy2Var;
        this.A = po0Var;
    }

    private final q A6(Context context, String str, String str2, pv pvVar, kv kvVar) {
        p v6 = this.f16618f.v();
        fa1 fa1Var = new fa1();
        fa1Var.c(context);
        is2 is2Var = new is2();
        if (str == null) {
            str = "adUnitId";
        }
        is2Var.H(str);
        if (kvVar == null) {
            kvVar = new lv().a();
        }
        is2Var.d(kvVar);
        if (pvVar == null) {
            pvVar = new pv();
        }
        is2Var.G(pvVar);
        fa1Var.f(is2Var.f());
        v6.b(fa1Var.g());
        h0 h0Var = new h0();
        h0Var.a(str2);
        v6.a(new j0(h0Var, null));
        new mg1();
        return v6.c();
    }

    private final cc3<String> B6(final String str) {
        final rr1[] rr1VarArr = new rr1[1];
        cc3 n7 = rb3.n(this.f16621i.a(), new xa3() { // from class: g3.x
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return f0.this.K6(rr1VarArr, str, (rr1) obj);
            }
        }, this.f16622j);
        n7.b(new Runnable() { // from class: g3.y
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.V6(rr1VarArr);
            }
        }, this.f16622j);
        return rb3.f(rb3.m((ib3) rb3.o(ib3.E(n7), ((Integer) sw.c().b(m10.F5)).intValue(), TimeUnit.MILLISECONDS, this.f16623k), new e43() { // from class: g3.u
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                int i7 = f0.H;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f16622j), Exception.class, new e43() { // from class: g3.t
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                int i7 = f0.H;
                io0.e("", (Exception) obj);
                return null;
            }
        }, this.f16622j);
    }

    private static boolean C6(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (path.contains(it.next())) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith(it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri D6(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i7 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i7) + str + "=" + str2 + "&" + uri2.substring(i7));
    }

    private final boolean I() {
        Map<String, WeakReference<View>> map;
        sh0 sh0Var = this.f16624l;
        return (sh0Var == null || (map = sh0Var.f11824g) == null || map.isEmpty()) ? false : true;
    }

    static /* bridge */ /* synthetic */ void U6(f0 f0Var, String str, String str2, String str3) {
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
                xw2 xw2Var = f0Var.f16630r;
                ww2 b7 = ww2.b(str);
                b7.a(str2, str3);
                xw2Var.a(b7);
                return;
            }
            vv1 a7 = f0Var.f16629q.a();
            a7.b("action", str);
            a7.b(str2, str3);
            a7.f();
        }
    }

    static boolean x6(Uri uri) {
        return C6(uri, F, G);
    }

    static final /* synthetic */ Uri y6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? D6(uri, "nas", str) : uri;
    }

    static final /* synthetic */ ArrayList z6(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (x6(uri) && !TextUtils.isEmpty(str)) {
                uri = D6(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    final /* synthetic */ Uri G6(Uri uri, x3.a aVar) {
        try {
            uri = this.f16620h.a(uri, this.f16619g, (View) x3.b.O0(aVar), null);
        } catch (hb e7) {
            io0.h("", e7);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void I1(final List<Uri> list, final x3.a aVar, ph0 ph0Var) {
        if (!((Boolean) sw.c().b(m10.E5)).booleanValue()) {
            try {
                ph0Var.u("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                io0.e("", e7);
                return;
            }
        }
        cc3 E2 = this.f16622j.E(new Callable() { // from class: g3.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f0.this.R6(list, aVar);
            }
        });
        if (I()) {
            E2 = rb3.n(E2, new xa3() { // from class: g3.w
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    return f0.this.M6((ArrayList) obj);
                }
            }, this.f16622j);
        } else {
            io0.f("Asset view map is empty.");
        }
        rb3.r(E2, new c0(this, ph0Var), this.f16618f.d());
    }

    final /* synthetic */ cc3 K6(rr1[] rr1VarArr, String str, rr1 rr1Var) {
        rr1VarArr[0] = rr1Var;
        Context context = this.f16619g;
        sh0 sh0Var = this.f16624l;
        Map<String, WeakReference<View>> map = sh0Var.f11824g;
        JSONObject d7 = e1.d(context, map, map, sh0Var.f11823f);
        JSONObject g7 = e1.g(this.f16619g, this.f16624l.f11823f);
        JSONObject f7 = e1.f(this.f16624l.f11823f);
        JSONObject e7 = e1.e(this.f16619g, this.f16624l.f11823f);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d7);
        jSONObject.put("ad_view_signal", g7);
        jSONObject.put("scroll_view_signal", f7);
        jSONObject.put("lock_screen_signal", e7);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", e1.c(null, this.f16619g, this.f16626n, this.f16625m));
        }
        return rr1Var.d(str, jSONObject);
    }

    final /* synthetic */ cc3 L6(final Uri uri) {
        return rb3.m(B6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new e43() { // from class: g3.r
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return f0.y6(uri, (String) obj);
            }
        }, this.f16622j);
    }

    final /* synthetic */ cc3 M6(final ArrayList arrayList) {
        return rb3.m(B6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new e43() { // from class: g3.s
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return f0.z6(arrayList, (String) obj);
            }
        }, this.f16622j);
    }

    final /* synthetic */ ArrayList R6(List list, x3.a aVar) {
        String c7 = this.f16620h.c() != null ? this.f16620h.c().c(this.f16619g, (View) x3.b.O0(aVar), null) : "";
        if (TextUtils.isEmpty(c7)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (x6(uri)) {
                uri = D6(uri, "ms", c7);
            } else {
                io0.g("Not a Google URL: ".concat(String.valueOf(uri)));
            }
            arrayList.add(uri);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void V6(rr1[] rr1VarArr) {
        rr1 rr1Var = rr1VarArr[0];
        if (rr1Var != null) {
            this.f16621i.b(rb3.i(rr1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void a2(sh0 sh0Var) {
        this.f16624l = sh0Var;
        this.f16621i.c(1);
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void b4(x3.a aVar, fn0 fn0Var, ym0 ym0Var) {
        Context context = (Context) x3.b.O0(aVar);
        this.f16619g = context;
        rb3.r(A6(context, fn0Var.f5159f, fn0Var.f5160g, fn0Var.f5161h, fn0Var.f5162i).a(), new b0(this, ym0Var), this.f16618f.d());
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void g0(x3.a aVar) {
        if (((Boolean) sw.c().b(m10.E5)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) x3.b.O0(aVar);
            sh0 sh0Var = this.f16624l;
            this.f16625m = e1.a(motionEvent, sh0Var == null ? null : sh0Var.f11823f);
            if (motionEvent.getAction() == 0) {
                this.f16626n = this.f16625m;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f16625m;
            obtain.setLocation(point.x, point.y);
            this.f16620h.d(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void g3(List<Uri> list, final x3.a aVar, ph0 ph0Var) {
        try {
            if (!((Boolean) sw.c().b(m10.E5)).booleanValue()) {
                ph0Var.u("The updating URL feature is not enabled.");
                return;
            }
            if (list.size() != 1) {
                ph0Var.u("There should be only 1 click URL.");
                return;
            }
            final Uri uri = list.get(0);
            if (C6(uri, D, E)) {
                cc3 E2 = this.f16622j.E(new Callable() { // from class: g3.z
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f0.this.G6(uri, aVar);
                    }
                });
                if (I()) {
                    E2 = rb3.n(E2, new xa3() { // from class: g3.v
                        @Override // com.google.android.gms.internal.ads.xa3
                        public final cc3 c(Object obj) {
                            return f0.this.L6((Uri) obj);
                        }
                    }, this.f16622j);
                } else {
                    io0.f("Asset view map is empty.");
                }
                rb3.r(E2, new d0(this, ph0Var), this.f16618f.d());
                return;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Not a Google URL: ");
            sb.append(valueOf);
            io0.g(sb.toString());
            ph0Var.N2(list);
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.bn0
    @SuppressLint({"AddJavascriptInterface"})
    public final void i0(x3.a aVar) {
        if (((Boolean) sw.c().b(m10.S6)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                io0.g("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) sw.c().b(m10.T6)).booleanValue()) {
                rb3.r(A6(this.f16619g, null, r2.b.BANNER.name(), null, null).a(), new e0(this), this.f16618f.d());
            }
            WebView webView = (WebView) x3.b.O0(aVar);
            if (webView == null) {
                io0.d("The webView cannot be null.");
            } else if (this.f16627o.contains(webView)) {
                io0.f("This webview has already been registered.");
            } else {
                this.f16627o.add(webView);
                webView.addJavascriptInterface(new a(webView, this.f16620h), "gmaSdk");
            }
        }
    }
}
