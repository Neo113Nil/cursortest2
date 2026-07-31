package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mn1 extends p40 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mo1 {

    /* renamed from: s, reason: collision with root package name */
    public static final e73<String> f8642s = e73.z("2011", "1009", "3010");

    /* renamed from: f, reason: collision with root package name */
    private final String f8643f;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f8645h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f8646i;

    /* renamed from: j, reason: collision with root package name */
    private final dc3 f8647j;

    /* renamed from: k, reason: collision with root package name */
    private View f8648k;

    /* renamed from: m, reason: collision with root package name */
    private mm1 f8650m;

    /* renamed from: n, reason: collision with root package name */
    private ao f8651n;

    /* renamed from: p, reason: collision with root package name */
    private k40 f8653p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8654q;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, WeakReference<View>> f8644g = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private x3.a f8652o = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8655r = false;

    /* renamed from: l, reason: collision with root package name */
    private final int f8649l = 214106000;

    public mn1(FrameLayout frameLayout, FrameLayout frameLayout2, int i7) {
        this.f8645h = frameLayout;
        this.f8646i = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f8643f = str;
        y2.t.y();
        jp0.a(frameLayout, this);
        y2.t.y();
        jp0.b(frameLayout, this);
        this.f8647j = wo0.f13898e;
        this.f8651n = new ao(this.f8645h.getContext(), this.f8645h);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void q() {
        this.f8647j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ln1
            @Override // java.lang.Runnable
            public final void run() {
                mn1.this.t();
            }
        });
    }

    private final synchronized void s6(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f8646i.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f8646i.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e7) {
                    io0.h("Encountered invalid base64 watermark.", e7);
                }
            }
        }
        this.f8646i.addView(frameLayout);
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void B1(x3.a aVar) {
        if (this.f8655r) {
            return;
        }
        Object O0 = x3.b.O0(aVar);
        if (!(O0 instanceof mm1)) {
            io0.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.s(this);
        }
        q();
        mm1 mm1Var2 = (mm1) O0;
        this.f8650m = mm1Var2;
        mm1Var2.r(this);
        this.f8650m.j(this.f8645h);
        this.f8650m.H(this.f8646i);
        if (this.f8654q) {
            this.f8650m.A().b(this.f8653p);
        }
        if (!((Boolean) sw.c().b(m10.f8342y2)).booleanValue() || TextUtils.isEmpty(this.f8650m.C())) {
            return;
        }
        s6(this.f8650m.C());
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized void C3(String str, View view, boolean z6) {
        if (this.f8655r) {
            return;
        }
        if (view == null) {
            this.f8644g.remove(str);
            return;
        }
        this.f8644g.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (a3.e1.i(this.f8649l)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void K2(x3.a aVar, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final void L0(x3.a aVar) {
        onTouch(this.f8645h, (MotionEvent) x3.b.O0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void T5(x3.a aVar) {
        if (this.f8655r) {
            return;
        }
        this.f8652o = aVar;
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void U1(String str, x3.a aVar) {
        C3(str, (View) x3.b.O0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void c() {
        if (this.f8655r) {
            return;
        }
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.s(this);
            this.f8650m = null;
        }
        this.f8644g.clear();
        this.f8645h.removeAllViews();
        this.f8646i.removeAllViews();
        this.f8644g = null;
        this.f8645h = null;
        this.f8646i = null;
        this.f8648k = null;
        this.f8651n = null;
        this.f8655r = true;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final /* synthetic */ View d() {
        return this.f8645h;
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void e5(k40 k40Var) {
        if (this.f8655r) {
            return;
        }
        this.f8654q = true;
        this.f8653p = k40Var;
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.A().b(k40Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final FrameLayout f() {
        return this.f8646i;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final ao h() {
        return this.f8651n;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final x3.a i() {
        return this.f8652o;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized String j() {
        return this.f8643f;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized Map<String, WeakReference<View>> k() {
        return this.f8644g;
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized void k3(x3.a aVar) {
        this.f8650m.m((View) x3.b.O0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized JSONObject l() {
        mm1 mm1Var = this.f8650m;
        if (mm1Var == null) {
            return null;
        }
        return mm1Var.F(this.f8645h, k(), o());
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized Map<String, WeakReference<View>> m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized JSONObject n() {
        mm1 mm1Var = this.f8650m;
        if (mm1Var == null) {
            return null;
        }
        return mm1Var.E(this.f8645h, k(), o());
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized Map<String, WeakReference<View>> o() {
        return this.f8644g;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.I();
            this.f8650m.Q(view, this.f8645h, k(), o(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.O(this.f8645h, k(), o(), mm1.w(this.f8645h));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.O(this.f8645h, k(), o(), mm1.w(this.f8645h));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        mm1 mm1Var = this.f8650m;
        if (mm1Var != null) {
            mm1Var.k(view, motionEvent, this.f8645h);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized View q0(String str) {
        if (this.f8655r) {
            return null;
        }
        WeakReference<View> weakReference = this.f8644g.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final synchronized x3.a s(String str) {
        return x3.b.B3(q0(str));
    }

    final /* synthetic */ void t() {
        if (this.f8648k == null) {
            View view = new View(this.f8645h.getContext());
            this.f8648k = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f8645h != this.f8648k.getParent()) {
            this.f8645h.addView(this.f8648k);
        }
    }
}
