package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fl0 implements ml0 {

    /* renamed from: m, reason: collision with root package name */
    private static final List<Future<Void>> f5137m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f5138n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final qt3 f5139a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<String, lu3> f5140b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f5143e;

    /* renamed from: f, reason: collision with root package name */
    boolean f5144f;

    /* renamed from: g, reason: collision with root package name */
    private final jl0 f5145g;

    /* renamed from: l, reason: collision with root package name */
    private final il0 f5150l;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f5141c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f5142d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f5146h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet<String> f5147i = new HashSet<>();

    /* renamed from: j, reason: collision with root package name */
    private boolean f5148j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5149k = false;

    public fl0(Context context, po0 po0Var, jl0 jl0Var, String str, il0 il0Var, byte[] bArr) {
        r3.o.j(jl0Var, "SafeBrowsing config is not present.");
        this.f5143e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5140b = new LinkedHashMap<>();
        this.f5150l = il0Var;
        this.f5145g = jl0Var;
        Iterator<String> it = jl0Var.f7164j.iterator();
        while (it.hasNext()) {
            this.f5147i.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.f5147i.remove("cookie".toLowerCase(Locale.ENGLISH));
        qt3 F = pu3.F();
        F.E(9);
        F.A(str);
        F.y(str);
        st3 F2 = tt3.F();
        String str2 = this.f5145g.f7160f;
        if (str2 != null) {
            F2.r(str2);
        }
        F.x(F2.o());
        nu3 F3 = ou3.F();
        F3.t(w3.c.a(this.f5143e).g());
        String str3 = po0Var.f10301f;
        if (str3 != null) {
            F3.r(str3);
        }
        long a7 = o3.f.f().a(this.f5143e);
        if (a7 > 0) {
            F3.s(a7);
        }
        F.w(F3.o());
        this.f5139a = F;
    }

    @Override // com.google.android.gms.internal.ads.ml0
    public final void Q(String str) {
        synchronized (this.f5146h) {
            if (str == null) {
                this.f5139a.u();
            } else {
                this.f5139a.v(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ml0
    public final void a(String str, Map<String, String> map, int i7) {
        synchronized (this.f5146h) {
            if (i7 == 3) {
                this.f5149k = true;
            }
            if (this.f5140b.containsKey(str)) {
                if (i7 == 3) {
                    this.f5140b.get(str).v(ku3.a(3));
                }
                return;
            }
            lu3 G = mu3.G();
            int a7 = ku3.a(i7);
            if (a7 != 0) {
                G.v(a7);
            }
            G.s(this.f5140b.size());
            G.u(str);
            wt3 F = zt3.F();
            if (this.f5147i.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.f5147i.contains(key.toLowerCase(Locale.ENGLISH))) {
                        ut3 F2 = vt3.F();
                        F2.r(uo3.L(key));
                        F2.s(uo3.L(value));
                        F.r(F2.o());
                    }
                }
            }
            G.t(F.o());
            this.f5140b.put(str, G);
        }
    }

    @Override // com.google.android.gms.internal.ads.ml0
    public final void b() {
        synchronized (this.f5146h) {
            this.f5140b.keySet();
            cc3 i7 = rb3.i(Collections.emptyMap());
            xa3 xa3Var = new xa3() { // from class: com.google.android.gms.internal.ads.bl0
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    return fl0.this.d((Map) obj);
                }
            };
            dc3 dc3Var = wo0.f13899f;
            cc3 n7 = rb3.n(i7, xa3Var, dc3Var);
            cc3 o7 = rb3.o(n7, 10L, TimeUnit.SECONDS, wo0.f13897d);
            rb3.r(n7, new el0(this, o7), dc3Var);
            f5137m.add(o7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.f5145g.f7162h && !this.f5148j) {
            y2.t.q();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e7) {
                    e = e7;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e8) {
                    e = e8;
                    io0.e("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        io0.g("Width or height of view is zero");
                    } catch (RuntimeException e9) {
                        io0.e("Fail to capture the webview", e9);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                ll0.a("Failed to capture the webview bitmap.");
            } else {
                this.f5148j = true;
                a3.g2.U(new Runnable() { // from class: com.google.android.gms.internal.ads.cl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fl0.this.f(bitmap2);
                    }
                });
            }
        }
    }

    final /* synthetic */ cc3 d(Map map) {
        lu3 lu3Var;
        cc3 m7;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f5146h) {
                            int length = optJSONArray.length();
                            synchronized (this.f5146h) {
                                lu3Var = this.f5140b.get(str);
                            }
                            if (lu3Var == null) {
                                String valueOf = String.valueOf(str);
                                ll0.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i7 = 0; i7 < length; i7++) {
                                    lu3Var.r(optJSONArray.getJSONObject(i7).getString("threat_type"));
                                }
                                this.f5144f = (length > 0) | this.f5144f;
                            }
                        }
                    }
                }
            } catch (JSONException e7) {
                if (i30.f6517b.e().booleanValue()) {
                    io0.c("Failed to get SafeBrowsing metadata", e7);
                }
                return rb3.h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f5144f) {
            synchronized (this.f5146h) {
                this.f5139a.E(10);
            }
        }
        boolean z6 = this.f5144f;
        if (!(z6 && this.f5145g.f7166l) && (!(this.f5149k && this.f5145g.f7165k) && (z6 || !this.f5145g.f7163i))) {
            return rb3.i(null);
        }
        synchronized (this.f5146h) {
            Iterator<lu3> it = this.f5140b.values().iterator();
            while (it.hasNext()) {
                this.f5139a.t(it.next().o());
            }
            this.f5139a.r(this.f5141c);
            this.f5139a.s(this.f5142d);
            if (ll0.b()) {
                String C = this.f5139a.C();
                String B = this.f5139a.B();
                StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 53 + String.valueOf(B).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(C);
                sb.append("\n  clickUrl: ");
                sb.append(B);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (mu3 mu3Var : this.f5139a.D()) {
                    sb2.append("    [");
                    sb2.append(mu3Var.F());
                    sb2.append("] ");
                    sb2.append(mu3Var.I());
                }
                ll0.a(sb2.toString());
            }
            cc3<String> b7 = new a3.u0(this.f5143e).b(1, this.f5145g.f7161g, null, this.f5139a.o().d());
            if (ll0.b()) {
                b7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.dl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ll0.a("Pinged SB successfully.");
                    }
                }, wo0.f13894a);
            }
            m7 = rb3.m(b7, new e43() { // from class: com.google.android.gms.internal.ads.al0
                @Override // com.google.android.gms.internal.ads.e43
                public final Object apply(Object obj) {
                    int i8 = fl0.f5138n;
                    return null;
                }
            }, wo0.f13899f);
        }
        return m7;
    }

    final /* synthetic */ void f(Bitmap bitmap) {
        ro3 H = uo3.H();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, H);
        synchronized (this.f5146h) {
            qt3 qt3Var = this.f5139a;
            eu3 F = gu3.F();
            F.r(H.f());
            F.s("image/png");
            F.t(2);
            qt3Var.z(F.o());
        }
    }

    @Override // com.google.android.gms.internal.ads.ml0
    public final boolean h() {
        return v3.l.e() && this.f5145g.f7162h && !this.f5148j;
    }

    @Override // com.google.android.gms.internal.ads.ml0
    public final jl0 zza() {
        return this.f5145g;
    }
}
