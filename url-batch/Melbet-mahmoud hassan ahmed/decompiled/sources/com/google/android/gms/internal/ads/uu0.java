package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uu0 extends FrameLayout implements eu0 {

    /* renamed from: f, reason: collision with root package name */
    private final eu0 f12987f;

    /* renamed from: g, reason: collision with root package name */
    private final hq0 f12988g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f12989h;

    /* JADX WARN: Multi-variable type inference failed */
    public uu0(eu0 eu0Var) {
        super(eu0Var.getContext());
        this.f12989h = new AtomicBoolean();
        this.f12987f = eu0Var;
        this.f12988g = new hq0(eu0Var.J(), this, this);
        addView((View) eu0Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.vt0
    public final rr2 A() {
        return this.f12987f.A();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final cc3<String> A0() {
        return this.f12987f.A0();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final void B(String str, ts0 ts0Var) {
        this.f12987f.B(str, ts0Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void B0(x3.a aVar) {
        this.f12987f.B0(aVar);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void C() {
        this.f12987f.C();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean C0() {
        return this.f12987f.C0();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.cv0
    public final ur2 D() {
        return this.f12987f.D();
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final ts0 D0(String str) {
        return this.f12987f.D0(str);
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void E(z2.f fVar, boolean z6) {
        this.f12987f.E(fVar, z6);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final tv0 E0() {
        return ((yu0) this.f12987f).h1();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void F(boolean z6) {
        this.f12987f.F(z6);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void F0(Context context) {
        this.f12987f.F0(context);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void G(z2.o oVar) {
        this.f12987f.G(oVar);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void G0(String str, t70<? super eu0> t70Var) {
        this.f12987f.G0(str, t70Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void H() {
        setBackgroundColor(0);
        this.f12987f.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void H0(String str, t70<? super eu0> t70Var) {
        this.f12987f.H0(str, t70Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.nv0
    public final gb I() {
        return this.f12987f.I();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void I0(int i7) {
        this.f12987f.I0(i7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final Context J() {
        return this.f12987f.J();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void J0() {
        eu0 eu0Var = this.f12987f;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(y2.t.s().e()));
        hashMap.put("app_volume", String.valueOf(y2.t.s().a()));
        yu0 yu0Var = (yu0) eu0Var;
        hashMap.put("device_volume", String.valueOf(a3.g.b(yu0Var.getContext())));
        yu0Var.t("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final np K() {
        return this.f12987f.K();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void K0() {
        this.f12987f.K0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final WebView L() {
        return (WebView) this.f12987f;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void L0(boolean z6) {
        this.f12987f.L0(z6);
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        eu0 eu0Var = this.f12987f;
        if (eu0Var != null) {
            eu0Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void M0(int i7) {
        this.f12987f.M0(i7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void N(rr2 rr2Var, ur2 ur2Var) {
        this.f12987f.N(rr2Var, ur2Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean N0() {
        return this.f12987f.N0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void O(String str, v3.m<t70<? super eu0>> mVar) {
        this.f12987f.O(str, mVar);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean O0(boolean z6, int i7) {
        if (!this.f12989h.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) sw.c().b(m10.A0)).booleanValue()) {
            return false;
        }
        if (this.f12987f.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f12987f.getParent()).removeView((View) this.f12987f);
        }
        this.f12987f.O0(z6, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final z2.o P() {
        return this.f12987f.P();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void P0() {
        this.f12987f.P0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final String Q0() {
        return this.f12987f.Q0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void R(np npVar) {
        this.f12987f.R(npVar);
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void R0(boolean z6, int i7, String str, String str2, boolean z7) {
        this.f12987f.R0(z6, i7, str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void S(String str, String str2, String str3) {
        this.f12987f.S(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void S0(boolean z6, int i7, String str, boolean z7) {
        this.f12987f.S0(z6, i7, str, z7);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void T(int i7) {
        this.f12987f.T(i7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void U() {
        this.f12988g.d();
        this.f12987f.U();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void V0(a40 a40Var) {
        this.f12987f.V0(a40Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void W() {
        this.f12987f.W();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void W0(boolean z6) {
        this.f12987f.W0(z6);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void X0(y30 y30Var) {
        this.f12987f.X0(y30Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void Y(boolean z6) {
        this.f12987f.Y(z6);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void Z(boolean z6) {
        this.f12987f.Z(false);
    }

    @Override // y2.l
    public final void Z0() {
        this.f12987f.Z0();
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void a(String str, String str2) {
        this.f12987f.a("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void a0() {
        this.f12987f.a0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean a1() {
        return this.f12989h.get();
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void b(String str) {
        ((yu0) this.f12987f).m1(str);
    }

    @Override // y2.l
    public final void b0() {
        this.f12987f.b0();
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void b1(String str, JSONObject jSONObject) {
        ((yu0) this.f12987f).a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.pv0
    public final View c0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void c1(a3.x0 x0Var, o42 o42Var, wv1 wv1Var, xw2 xw2Var, String str, String str2, int i7) {
        this.f12987f.c1(x0Var, o42Var, wv1Var, xw2Var, str, str2, i7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean canGoBack() {
        return this.f12987f.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int d() {
        return this.f12987f.d();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean d0() {
        return this.f12987f.d0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void d1(boolean z6) {
        this.f12987f.d1(z6);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void destroy() {
        final x3.a i02 = i0();
        if (i02 == null) {
            this.f12987f.destroy();
            return;
        }
        s33 s33Var = a3.g2.f72i;
        s33Var.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tu0
            @Override // java.lang.Runnable
            public final void run() {
                y2.t.i().zze(x3.a.this);
            }
        });
        final eu0 eu0Var = this.f12987f;
        eu0Var.getClass();
        s33Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.su0
            @Override // java.lang.Runnable
            public final void run() {
                eu0.this.destroy();
            }
        }, ((Integer) sw.c().b(m10.C3)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int e() {
        return this.f12987f.e();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void e1(z2.o oVar) {
        this.f12987f.e1(oVar);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int f() {
        return this.f12987f.f();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final a40 f0() {
        return this.f12987f.f0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void g0() {
        TextView textView = new TextView(getContext());
        y2.t.q();
        textView.setText(a3.g2.d());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void goBack() {
        this.f12987f.goBack();
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int h() {
        return ((Boolean) sw.c().b(m10.f8328w2)).booleanValue() ? this.f12987f.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void h0(vv0 vv0Var) {
        this.f12987f.h0(vv0Var);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int i() {
        return ((Boolean) sw.c().b(m10.f8328w2)).booleanValue() ? this.f12987f.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final x3.a i0() {
        return this.f12987f.i0();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.gv0, com.google.android.gms.internal.ads.tq0
    public final Activity j() {
        return this.f12987f.j();
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void j0(int i7) {
        this.f12987f.j0(i7);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void k0(boolean z6, long j7) {
        this.f12987f.k0(z6, j7);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.ov0, com.google.android.gms.internal.ads.tq0
    public final po0 l() {
        return this.f12987f.l();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean l0() {
        return this.f12987f.l0();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void loadData(String str, String str2, String str3) {
        this.f12987f.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f12987f.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void loadUrl(String str) {
        this.f12987f.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final y10 m() {
        return this.f12987f.m();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void m0(boolean z6) {
        this.f12987f.m0(z6);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final z10 n() {
        return this.f12987f.n();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final y2.a o() {
        return this.f12987f.o();
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void o0(xn xnVar) {
        this.f12987f.o0(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void onPause() {
        this.f12988g.e();
        this.f12987f.onPause();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void onResume() {
        this.f12987f.onResume();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final bv0 p() {
        return this.f12987f.p();
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void p0(boolean z6, int i7, boolean z7) {
        this.f12987f.p0(z6, i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final String q() {
        return this.f12987f.q();
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void r() {
        eu0 eu0Var = this.f12987f;
        if (eu0Var != null) {
            eu0Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void s(String str, JSONObject jSONObject) {
        this.f12987f.s(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean s0() {
        return this.f12987f.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.eu0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12987f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.eu0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f12987f.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f12987f.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f12987f.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void t(String str, Map<String, ?> map) {
        this.f12987f.t(str, map);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void t0(int i7) {
        this.f12987f.t0(i7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final z2.o u() {
        return this.f12987f.u();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final WebViewClient v() {
        return this.f12987f.v();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void v0() {
        this.f12987f.v0();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.mv0
    public final vv0 w() {
        return this.f12987f.w();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final void x(bv0 bv0Var) {
        this.f12987f.x(bv0Var);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final String y() {
        return this.f12987f.y();
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final hq0 y0() {
        return this.f12988g;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void z0(int i7) {
        this.f12988g.f(i7);
    }
}
