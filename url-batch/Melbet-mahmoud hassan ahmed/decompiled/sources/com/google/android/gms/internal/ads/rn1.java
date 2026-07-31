package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rn1 {

    /* renamed from: a, reason: collision with root package name */
    private final a3.t1 f11265a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f11266b;

    /* renamed from: c, reason: collision with root package name */
    private final wm1 f11267c;

    /* renamed from: d, reason: collision with root package name */
    private final rm1 f11268d;

    /* renamed from: e, reason: collision with root package name */
    private final co1 f11269e;

    /* renamed from: f, reason: collision with root package name */
    private final ko1 f11270f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f11271g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f11272h;

    /* renamed from: i, reason: collision with root package name */
    private final b40 f11273i;

    /* renamed from: j, reason: collision with root package name */
    private final om1 f11274j;

    public rn1(a3.t1 t1Var, ks2 ks2Var, wm1 wm1Var, rm1 rm1Var, co1 co1Var, ko1 ko1Var, Executor executor, Executor executor2, om1 om1Var) {
        this.f11265a = t1Var;
        this.f11266b = ks2Var;
        this.f11273i = ks2Var.f7623i;
        this.f11267c = wm1Var;
        this.f11268d = rm1Var;
        this.f11269e = co1Var;
        this.f11270f = ko1Var;
        this.f11271g = executor;
        this.f11272h = executor2;
        this.f11274j = om1Var;
    }

    private static void g(RelativeLayout.LayoutParams layoutParams, int i7) {
        if (i7 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i7 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i7 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean h(ViewGroup viewGroup, boolean z6) {
        View N = z6 ? this.f11268d.N() : this.f11268d.O();
        if (N == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (N.getParent() instanceof ViewGroup) {
            ((ViewGroup) N.getParent()).removeView(N);
        }
        viewGroup.addView(N, ((Boolean) sw.c().b(m10.f8321v2)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        a3.t1 t1Var;
        String str;
        String valueOf;
        boolean z6 = viewGroup != null;
        if (this.f11268d.N() != null) {
            if (this.f11268d.K() == 2 || this.f11268d.K() == 1) {
                t1Var = this.f11265a;
                str = this.f11266b.f7620f;
                valueOf = String.valueOf(this.f11268d.K());
            } else {
                if (this.f11268d.K() != 6) {
                    return;
                }
                this.f11265a.a0(this.f11266b.f7620f, "2", z6);
                t1Var = this.f11265a;
                str = this.f11266b.f7620f;
                valueOf = "1";
            }
            t1Var.a0(str, valueOf, z6);
        }
    }

    final /* synthetic */ void b(mo1 mo1Var) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        k40 a7;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        if (this.f11267c.e() || this.f11267c.d()) {
            String[] strArr = {"1098", "3011"};
            for (int i7 = 0; i7 < 2; i7++) {
                View q02 = mo1Var.q0(strArr[i7]);
                if (q02 != null && (q02 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) q02;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = mo1Var.d().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f11268d.M() != null) {
            view = this.f11268d.M();
            b40 b40Var = this.f11273i;
            if (b40Var != null && viewGroup == null) {
                g(layoutParams, b40Var.f3206j);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.f11268d.T() instanceof w30) {
            w30 w30Var = (w30) this.f11268d.T();
            if (viewGroup == null) {
                g(layoutParams, w30Var.c());
            }
            View x30Var = new x30(context, w30Var, layoutParams);
            x30Var.setContentDescription((CharSequence) sw.c().b(m10.f8307t2));
            view = x30Var;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                u2.i iVar = new u2.i(mo1Var.d().getContext());
                iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                iVar.addView(view);
                FrameLayout f7 = mo1Var.f();
                if (f7 != null) {
                    f7.addView(iVar);
                }
            }
            mo1Var.C3(mo1Var.j(), view, true);
        }
        e73<String> e73Var = mn1.f8642s;
        int size = e73Var.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                viewGroup2 = null;
                break;
            }
            View q03 = mo1Var.q0(e73Var.get(i8));
            i8++;
            if (q03 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) q03;
                break;
            }
        }
        this.f11272h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nn1
            @Override // java.lang.Runnable
            public final void run() {
                rn1.this.a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (h(viewGroup2, true)) {
            if (this.f11268d.Z() != null) {
                this.f11268d.Z().V0(new qn1(mo1Var, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) sw.c().b(m10.Z6)).booleanValue() && h(viewGroup2, false)) {
            if (this.f11268d.X() != null) {
                this.f11268d.X().V0(new qn1(mo1Var, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View d7 = mo1Var.d();
        Context context2 = d7 != null ? d7.getContext() : null;
        if (context2 == null || (a7 = this.f11274j.a()) == null) {
            return;
        }
        try {
            x3.a h7 = a7.h();
            if (h7 == null || (drawable = (Drawable) x3.b.O0(h7)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            x3.a i9 = mo1Var.i();
            if (i9 != null) {
                if (((Boolean) sw.c().b(m10.D4)).booleanValue()) {
                    scaleType = (ImageView.ScaleType) x3.b.O0(i9);
                    imageView.setScaleType(scaleType);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
            imageView.setScaleType(scaleType);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            io0.g("Could not get main image drawable");
        }
    }

    public final void c(mo1 mo1Var) {
        if (mo1Var == null || this.f11269e == null || mo1Var.f() == null || !this.f11267c.f()) {
            return;
        }
        try {
            mo1Var.f().addView(this.f11269e.a());
        } catch (qu0 e7) {
            a3.r1.l("web view can not be obtained", e7);
        }
    }

    public final void d(mo1 mo1Var) {
        if (mo1Var == null) {
            return;
        }
        Context context = mo1Var.d().getContext();
        if (a3.e1.h(context, this.f11267c.f13866a)) {
            if (!(context instanceof Activity)) {
                io0.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f11270f == null || mo1Var.f() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f11270f.a(mo1Var.f(), windowManager), a3.e1.b());
            } catch (qu0 e7) {
                a3.r1.l("web view can not be obtained", e7);
            }
        }
    }

    public final void e(final mo1 mo1Var) {
        this.f11271g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.on1
            @Override // java.lang.Runnable
            public final void run() {
                rn1.this.b(mo1Var);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return h(viewGroup, true);
    }
}
