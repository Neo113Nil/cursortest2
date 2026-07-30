package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.anythink.core.api.ErrorCode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ym, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4241ym extends AbstractBinderC3799qb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC2678Mm {

    /* renamed from: I, reason: collision with root package name */
    public static final C3675oC f35393I;

    /* renamed from: B, reason: collision with root package name */
    public C3648nm f35395B;

    /* renamed from: C, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC3779q8 f35396C;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC3529lb f35398E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f35399F;

    /* renamed from: H, reason: collision with root package name */
    public GestureDetector f35401H;

    /* renamed from: u, reason: collision with root package name */
    public final String f35402u;

    /* renamed from: w, reason: collision with root package name */
    public FrameLayout f35404w;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f35405x;

    /* renamed from: y, reason: collision with root package name */
    public final C3157eg f35406y;

    /* renamed from: z, reason: collision with root package name */
    public View f35407z;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f35403v = new HashMap();

    /* renamed from: D, reason: collision with root package name */
    public V2.a f35397D = null;

    /* renamed from: G, reason: collision with root package name */
    public boolean f35400G = false;

    /* renamed from: A, reason: collision with root package name */
    public final int f35394A = 261710000;

    static {
        SB sb = UB.f27942u;
        Object[] objArr = {ErrorCode.loadInShowingFilter, "1009", "3010"};
        PA.o(objArr, 3);
        f35393I = UB.p(objArr, 3);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC4241ym(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f35404w = frameLayout;
        this.f35405x = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = ErrorCode.loadCappingError;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f35402u = str;
        C2837Wb c2837Wb = p2.j.f39798C.f39800B;
        ViewTreeObserverOnGlobalLayoutListenerC3480kg viewTreeObserverOnGlobalLayoutListenerC3480kg = new ViewTreeObserverOnGlobalLayoutListenerC3480kg(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3480kg.f29483n).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3480kg.v1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC3534lg viewTreeObserverOnScrollChangedListenerC3534lg = new ViewTreeObserverOnScrollChangedListenerC3534lg(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3534lg.f29483n).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC3534lg.v1(viewTreeObserver2);
        }
        this.f35406y = AbstractC3212fg.f30743f;
        this.f35396C = new ViewOnAttachStateChangeListenerC3779q8(this.f35404w.getContext(), this.f35404w);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final /* synthetic */ View A0() {
        return this.f35404w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized View G0(String str) {
        WeakReference weakReference;
        if (!this.f35400G && (weakReference = (WeakReference) this.f35403v.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final synchronized void G3() {
        int u7;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue()) {
            C3648nm c3648nm = this.f35395B;
            synchronized (c3648nm) {
                u7 = c3648nm.f33007n.u();
            }
            if (u7 != 0) {
                this.f35401H = new GestureDetector(this.f35404w.getContext(), new GestureDetectorOnGestureListenerC2525Dm(this.f35395B, this));
            }
        }
    }

    public final synchronized void H3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f35405x.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f35405x.getContext();
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
                    } catch (IllegalArgumentException e6) {
                        u2.i.g("Encountered invalid base64 watermark.", e6);
                    }
                }
            }
            this.f35405x.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void L1(V2.a aVar, String str) {
        N0((View) V2.b.A0(aVar), str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized V2.a N(String str) {
        return new V2.b(G0(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized void N0(View view, String str) {
        if (!this.f35400G) {
            if (view == null) {
                this.f35403v.remove(str);
                return;
            }
            this.f35403v.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (w8.a.n(this.f35394A)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void Q1(V2.a aVar) {
        if (this.f35400G) {
            return;
        }
        this.f35397D = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void b2(InterfaceC3529lb interfaceC3529lb) {
        if (!this.f35400G) {
            this.f35399F = true;
            this.f35398E = interfaceC3529lb;
            C3648nm c3648nm = this.f35395B;
            if (c3648nm != null) {
                C3756pm c3756pm = c3648nm.f33001F;
                synchronized (c3756pm) {
                    c3756pm.f33505a = interfaceC3529lb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void c() {
        try {
            if (this.f35400G) {
                return;
            }
            C3648nm c3648nm = this.f35395B;
            if (c3648nm != null) {
                c3648nm.r(this);
                this.f35395B = null;
            }
            this.f35403v.clear();
            this.f35404w.removeAllViews();
            this.f35405x.removeAllViews();
            this.f35403v = null;
            this.f35404w = null;
            this.f35405x = null;
            this.f35407z = null;
            this.f35396C = null;
            this.f35400G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final ViewOnAttachStateChangeListenerC3779q8 e() {
        return this.f35396C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized Map h() {
        return this.f35403v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized Map j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void k0(V2.a aVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized Map l() {
        return this.f35403v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void l2(V2.a aVar) {
        onTouch(this.f35404w, (MotionEvent) V2.b.A0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized String m() {
        return this.f35402u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void n1(V2.a aVar) {
        C3648nm c3648nm = this.f35395B;
        View view = (View) V2.b.A0(aVar);
        synchronized (c3648nm) {
            c3648nm.f33007n.a(view);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean v6;
        C3648nm c3648nm = this.f35395B;
        if (c3648nm != null) {
            synchronized (c3648nm) {
                v6 = c3648nm.f33007n.v();
            }
            if (v6) {
                C3648nm c3648nm2 = this.f35395B;
                synchronized (c3648nm2) {
                    c3648nm2.f33007n.y();
                }
                this.f35395B.s(view, this.f35404w, l(), h(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C3648nm c3648nm = this.f35395B;
        if (c3648nm != null) {
            FrameLayout frameLayout = this.f35404w;
            c3648nm.t(frameLayout, l(), h(), C3648nm.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C3648nm c3648nm = this.f35395B;
        if (c3648nm != null) {
            FrameLayout frameLayout = this.f35404w;
            c3648nm.t(frameLayout, l(), h(), C3648nm.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int u7;
        C3648nm c3648nm = this.f35395B;
        if (c3648nm != null) {
            FrameLayout frameLayout = this.f35404w;
            synchronized (c3648nm) {
                c3648nm.f33007n.w(frameLayout, motionEvent);
            }
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue() && this.f35401H != null) {
                C3648nm c3648nm2 = this.f35395B;
                synchronized (c3648nm2) {
                    u7 = c3648nm2.f33007n.u();
                }
                if (u7 != 0) {
                    this.f35401H.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final V2.a p() {
        return this.f35397D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized JSONObject q() {
        JSONObject d2;
        C3648nm c3648nm = this.f35395B;
        if (c3648nm == null) {
            return null;
        }
        FrameLayout frameLayout = this.f35404w;
        Map l9 = l();
        Map h9 = h();
        synchronized (c3648nm) {
            d2 = c3648nm.f33007n.d(frameLayout, l9, h9, c3648nm.k());
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final FrameLayout q3() {
        return this.f35405x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized JSONObject r() {
        JSONObject j9;
        C3648nm c3648nm = this.f35395B;
        if (c3648nm == null) {
            return null;
        }
        FrameLayout frameLayout = this.f35404w;
        Map l9 = l();
        Map h9 = h();
        synchronized (c3648nm) {
            j9 = c3648nm.f33007n.j(frameLayout, l9, h9, c3648nm.k());
        }
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final synchronized void w2(V2.a aVar) {
        if (this.f35400G) {
            return;
        }
        Object A02 = V2.b.A0(aVar);
        if (!(A02 instanceof C3648nm)) {
            int i = t2.C.f40822b;
            u2.i.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C3648nm c3648nm = this.f35395B;
        if (c3648nm != null) {
            c3648nm.r(this);
        }
        synchronized (this) {
            this.f35406y.execute(new RunnableC3376ij(7, this));
            C3648nm c3648nm2 = (C3648nm) A02;
            this.f35395B = c3648nm2;
            c3648nm2.q(this);
            this.f35395B.f(this.f35404w);
            C3648nm c3648nm3 = this.f35395B;
            FrameLayout frameLayout = this.f35405x;
            C3330hq k6 = c3648nm3.f33006m.k();
            if (c3648nm3.f33009p.c() && k6 != null && frameLayout != null) {
                C3431jl c3431jl = p2.j.f39798C.f39823x;
                Wv wv = k6.f31272a;
                c3431jl.getClass();
                C3431jl.r(new RunnableC3167eq(wv, frameLayout, 0));
            }
            if (this.f35399F) {
                C3756pm c3756pm = this.f35395B.f33001F;
                InterfaceC3529lb interfaceC3529lb = this.f35398E;
                synchronized (c3756pm) {
                    c3756pm.f33505a = interfaceC3529lb;
                }
            }
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31496M4)).booleanValue() && !TextUtils.isEmpty(this.f35395B.f33009p.e())) {
                H3(this.f35395B.f33009p.e());
            }
            G3();
        }
    }
}
