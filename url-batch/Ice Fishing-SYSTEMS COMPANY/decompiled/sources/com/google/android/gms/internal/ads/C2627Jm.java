package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2627Jm implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25795n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2661Lm f25796u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f25797v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WindowManager f25798w;

    public /* synthetic */ C2627Jm(C2661Lm c2661Lm, WindowManager windowManager, FrameLayout frameLayout) {
        this.f25796u = c2661Lm;
        this.f25798w = windowManager;
        this.f25797v = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.Km] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        C2661Lm c2661Lm = this.f25796u;
        switch (this.f25795n) {
            case 0:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                c2661Lm.getClass();
                int i = t2.C.f40822b;
                u2.i.a("Hide native ad policy validator overlay.");
                interfaceC3858rh.b0().setVisibility(8);
                if (interfaceC3858rh.b0().getWindowToken() != null) {
                    this.f25798w.removeView(interfaceC3858rh.b0());
                }
                interfaceC3858rh.destroy();
                ViewTreeObserver viewTreeObserver = this.f25797v.getViewTreeObserver();
                if (c2661Lm.f26213c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(c2661Lm.f26213c);
                    break;
                }
                break;
            default:
                final InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) obj;
                c2661Lm.getClass();
                interfaceC3858rh2.j0().f25412z = new C2593Hm(1, c2661Lm, map);
                if (map != null) {
                    final FrameLayout frameLayout = this.f25797v;
                    Context context = frameLayout.getContext();
                    String str = (String) map.get("validator_width");
                    C3151ea c3151ea = AbstractC3368ia.l9;
                    q2.r rVar = q2.r.f40116e;
                    int b9 = C2661Lm.b(context, str, ((Integer) rVar.f40119c.a(c3151ea)).intValue());
                    String str2 = (String) map.get("validator_height");
                    C3151ea c3151ea2 = AbstractC3368ia.m9;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                    int b10 = C2661Lm.b(context, str2, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue());
                    int b11 = C2661Lm.b(context, (String) map.get("validator_x"), 0);
                    int b12 = C2661Lm.b(context, (String) map.get("validator_y"), 0);
                    interfaceC3858rh2.J0(new W2.b(1, b9, b10));
                    try {
                        interfaceC3858rh2.s().getSettings().setUseWideViewPort(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.n9)).booleanValue());
                        interfaceC3858rh2.s().getSettings().setLoadWithOverviewMode(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.o9)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams v6 = w8.a.v();
                    v6.x = b11;
                    v6.y = b12;
                    View b02 = interfaceC3858rh2.b0();
                    final WindowManager windowManager = this.f25798w;
                    windowManager.updateViewLayout(b02, v6);
                    final String str3 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (frameLayout.getGlobalVisibleRect(rect)) {
                        final int i4 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - b12;
                        c2661Lm.f26213c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.Km
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (frameLayout.getGlobalVisibleRect(rect2)) {
                                    InterfaceC3858rh interfaceC3858rh3 = interfaceC3858rh2;
                                    if (interfaceC3858rh3.b0().getWindowToken() == null) {
                                        return;
                                    }
                                    String str4 = str3;
                                    boolean equals = "1".equals(str4);
                                    WindowManager.LayoutParams layoutParams = v6;
                                    int i9 = i4;
                                    if (equals || "2".equals(str4)) {
                                        layoutParams.y = rect2.bottom - i9;
                                    } else {
                                        layoutParams.y = rect2.top - i9;
                                    }
                                    windowManager.updateViewLayout(interfaceC3858rh3.b0(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = frameLayout.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(c2661Lm.f26213c);
                        }
                    }
                    String str4 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str4)) {
                        interfaceC3858rh2.loadUrl(str4);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C2627Jm(C2661Lm c2661Lm, FrameLayout frameLayout, WindowManager windowManager) {
        this.f25796u = c2661Lm;
        this.f25797v = frameLayout;
        this.f25798w = windowManager;
    }
}
