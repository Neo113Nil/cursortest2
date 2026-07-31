package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ko1 {

    /* renamed from: a, reason: collision with root package name */
    private final et1 f7562a;

    /* renamed from: b, reason: collision with root package name */
    private final rr1 f7563b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f7564c = null;

    public ko1(et1 et1Var, rr1 rr1Var) {
        this.f7562a = et1Var;
        this.f7563b = rr1Var;
    }

    private static final int f(Context context, String str, int i7) {
        try {
            i7 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        qw.b();
        return bo0.s(context, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(final View view, final WindowManager windowManager) {
        eu0 a7 = this.f7562a.a(pv.h(), null, null);
        View view2 = (View) a7;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a7.G0("/sendMessageToSdk", new t70() { // from class: com.google.android.gms.internal.ads.fo1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                ko1.this.b((eu0) obj, map);
            }
        });
        a7.G0("/hideValidatorOverlay", new t70() { // from class: com.google.android.gms.internal.ads.ho1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                ko1.this.c(windowManager, view, (eu0) obj, map);
            }
        });
        a7.G0("/open", new f80(null, null, null, null, null));
        this.f7563b.j(new WeakReference(a7), "/loadNativeAdPolicyViolations", new t70() { // from class: com.google.android.gms.internal.ads.go1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                ko1.this.e(view, windowManager, (eu0) obj, map);
            }
        });
        this.f7563b.j(new WeakReference(a7), "/showValidatorOverlay", new t70() { // from class: com.google.android.gms.internal.ads.io1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                io0.b("Show native ad policy validator overlay.");
                ((eu0) obj).c0().setVisibility(0);
            }
        });
        return (View) a7;
    }

    final /* synthetic */ void b(eu0 eu0Var, Map map) {
        this.f7563b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, eu0 eu0Var, Map map) {
        io0.b("Hide native ad policy validator overlay.");
        eu0Var.c0().setVisibility(8);
        if (eu0Var.c0().getWindowToken() != null) {
            windowManager.removeView(eu0Var.c0());
        }
        eu0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f7564c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f7564c);
    }

    final /* synthetic */ void d(Map map, boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f7563b.g("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void e(final View view, final WindowManager windowManager, final eu0 eu0Var, final Map map) {
        eu0Var.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.jo1
            @Override // com.google.android.gms.internal.ads.rv0
            public final void c(boolean z6) {
                ko1.this.d(map, z6);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int f7 = f(context, (String) map.get("validator_width"), ((Integer) sw.c().b(m10.R5)).intValue());
        int f8 = f(context, (String) map.get("validator_height"), ((Integer) sw.c().b(m10.S5)).intValue());
        int f9 = f(context, (String) map.get("validator_x"), 0);
        int f10 = f(context, (String) map.get("validator_y"), 0);
        eu0Var.h0(vv0.b(f7, f8));
        try {
            eu0Var.L().getSettings().setUseWideViewPort(((Boolean) sw.c().b(m10.T5)).booleanValue());
            eu0Var.L().getSettings().setLoadWithOverviewMode(((Boolean) sw.c().b(m10.U5)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams b7 = a3.e1.b();
        b7.x = f9;
        b7.y = f10;
        windowManager.updateViewLayout(eu0Var.c0(), b7);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i7 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - f10;
            this.f7564c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.eo1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    eu0 eu0Var2 = eu0Var;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = b7;
                    int i8 = i7;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || eu0Var2.c0().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i8;
                    windowManager2.updateViewLayout(eu0Var2.c0(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f7564c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        eu0Var.loadUrl(str2);
    }
}
