package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import q2.InterfaceC4877a;
import s2.BinderC4996d;
import s2.C4997e;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3858rh extends InterfaceC4877a, InterfaceC2524Dl, InterfaceC2566Gc, InterfaceC2651Lc, InterfaceC3725p8, p2.g {
    void A0(Context context);

    ArrayList B();

    void B0(String str, AbstractC2791Tg abstractC2791Tg);

    BinderC4996d C0();

    void E0(String str, InterfaceC2990bc interfaceC2990bc);

    C3276gq F0();

    int G();

    boolean G0();

    void H0(int i, boolean z8, boolean z9);

    void I0(int i);

    Ut J();

    void J0(W2.b bVar);

    void K0(String str, Rx rx);

    void L0(boolean z8);

    void M0(long j9, boolean z8);

    void N0(String str, InterfaceC2990bc interfaceC2990bc);

    void O(int i);

    void O0(boolean z8, int i, String str, boolean z9, boolean z10);

    String P();

    void P0();

    void Q0(Ut ut, Wt wt);

    void S();

    C3348i7 S0();

    void T0(int i);

    boolean U0();

    void V0(C4997e c4997e, boolean z8, boolean z9, String str);

    C3280gu W0();

    r X0();

    void Y0(boolean z8);

    C3330hq Z();

    boolean Z0();

    InterfaceC3152eb a1();

    View b0();

    void b1();

    void c0(ViewTreeObserverOnGlobalLayoutListenerC3433jn viewTreeObserverOnGlobalLayoutListenerC3433jn);

    void c1();

    boolean canGoBack();

    void d0(boolean z8, int i, String str, String str2, boolean z9);

    void d1(boolean z8);

    void destroy();

    W2.b e0();

    void e1(BinderC2554Fh binderC2554Fh);

    void f0(C3276gq c3276gq);

    BinderC2554Fh g();

    Context g0();

    boolean g1();

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    Activity h();

    void h0(int i);

    void h1(boolean z8);

    void i0(String str, String str2);

    boolean i1();

    boolean isAttachedToWindow();

    S0.s j();

    C2588Hh j0();

    void j1(InterfaceC3152eb interfaceC3152eb);

    void k();

    void k0(F8 f82);

    F8 l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    int m();

    C2881Yl n();

    void n0();

    void o0(C3330hq c3330hq);

    void onPause();

    void onResume();

    String p();

    void p0(BinderC4996d binderC4996d);

    void q0(BinderC4996d binderC4996d);

    int r();

    boolean r0();

    WebView s();

    J3.a s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0(boolean z8);

    void v0(int i, boolean z8);

    C5107a w();

    BinderC4996d w0();

    Wt x0();

    void y0();

    void z0(String str, String str2);
}
