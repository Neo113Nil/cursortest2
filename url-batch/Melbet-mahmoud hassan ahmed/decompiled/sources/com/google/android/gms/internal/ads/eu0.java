package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public interface eu0 extends yu, pi1, vt0, da0, cv0, gv0, qa0, zn, kv0, y2.l, nv0, ov0, tq0, pv0 {
    @Override // com.google.android.gms.internal.ads.vt0
    rr2 A();

    cc3<String> A0();

    @Override // com.google.android.gms.internal.ads.tq0
    void B(String str, ts0 ts0Var);

    void B0(x3.a aVar);

    boolean C0();

    @Override // com.google.android.gms.internal.ads.cv0
    ur2 D();

    tv0 E0();

    void F(boolean z6);

    void F0(Context context);

    void G(z2.o oVar);

    void G0(String str, t70<? super eu0> t70Var);

    void H();

    void H0(String str, t70<? super eu0> t70Var);

    @Override // com.google.android.gms.internal.ads.nv0
    gb I();

    void I0(int i7);

    Context J();

    void J0();

    np K();

    void K0();

    WebView L();

    void L0(boolean z6);

    void N(rr2 rr2Var, ur2 ur2Var);

    boolean N0();

    void O(String str, v3.m<t70<? super eu0>> mVar);

    boolean O0(boolean z6, int i7);

    z2.o P();

    void P0();

    String Q0();

    void R(np npVar);

    void S(String str, String str2, String str3);

    void U();

    void V0(a40 a40Var);

    void W();

    void W0(boolean z6);

    void X0(y30 y30Var);

    void Y(boolean z6);

    boolean a1();

    @Override // com.google.android.gms.internal.ads.pv0
    View c0();

    boolean canGoBack();

    boolean d0();

    void d1(boolean z6);

    void destroy();

    void e1(z2.o oVar);

    a40 f0();

    void g0();

    @Override // com.google.android.gms.internal.ads.gv0, com.google.android.gms.internal.ads.tq0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h0(vv0 vv0Var);

    x3.a i0();

    @Override // com.google.android.gms.internal.ads.gv0, com.google.android.gms.internal.ads.tq0
    Activity j();

    @Override // com.google.android.gms.internal.ads.ov0, com.google.android.gms.internal.ads.tq0
    po0 l();

    boolean l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0(boolean z6);

    void measure(int i7, int i8);

    @Override // com.google.android.gms.internal.ads.tq0
    z10 n();

    @Override // com.google.android.gms.internal.ads.tq0
    y2.a o();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.tq0
    bv0 p();

    boolean s0();

    @Override // com.google.android.gms.internal.ads.tq0
    void setBackgroundColor(int i7);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0(int i7);

    z2.o u();

    WebViewClient v();

    void v0();

    @Override // com.google.android.gms.internal.ads.mv0
    vv0 w();

    @Override // com.google.android.gms.internal.ads.tq0
    void x(bv0 bv0Var);
}
