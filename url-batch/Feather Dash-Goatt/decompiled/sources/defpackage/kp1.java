package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.feathherdashh.dashgame.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kp1 {
    public static final WeakHashMap w = new WeakHashMap();
    public final i7 a;
    public final i7 b;
    public final i7 c;
    public final i7 d;
    public final i7 e;
    public final i7 f;
    public final i7 g;
    public final i7 h;
    public final i7 i;
    public final hm1 j;
    public final av0 k;
    public final dl1 l;
    public final hm1 m;
    public final hm1 n;
    public final hm1 o;
    public final hm1 p;
    public final hm1 q;
    public final hm1 r;
    public final hm1 s;
    public final boolean t;
    public int u;
    public final g90 v;

    public kp1(View view) {
        i7 d = sc1.d(4, "captionBar");
        this.a = d;
        i7 d2 = sc1.d(128, "displayCutout");
        this.b = d2;
        i7 d3 = sc1.d(8, "ime");
        this.c = d3;
        i7 d4 = sc1.d(32, "mandatorySystemGestures");
        this.d = d4;
        i7 d5 = sc1.d(2, "navigationBars");
        this.e = d5;
        i7 d6 = sc1.d(1, "statusBars");
        this.f = d6;
        i7 d7 = sc1.d(519, "systemBars");
        this.g = d7;
        i7 d8 = sc1.d(16, "systemGestures");
        this.h = d8;
        i7 d9 = sc1.d(64, "tappableElement");
        this.i = d9;
        hm1 hm1Var = new hm1(new i90(0, 0, 0, 0), "waterfall");
        this.j = hm1Var;
        this.k = gb0.F(null);
        this.l = new dl1(new dl1(d7, d3), d2);
        new dl1(new dl1(new dl1(d9, d4), d8), hm1Var);
        this.m = sc1.e(4, "captionBarIgnoringVisibility");
        this.n = sc1.e(2, "navigationBarsIgnoringVisibility");
        this.o = sc1.e(1, "statusBarsIgnoringVisibility");
        this.p = sc1.e(519, "systemBarsIgnoringVisibility");
        this.q = sc1.e(64, "tappableElementIgnoringVisibility");
        this.r = new hm1(new i90(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new hm1(new i90(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new g90(this);
        int i = ln1.a;
        ip1 a = in1.a(view);
        if (a != null) {
            fp1 fp1Var = a.a;
            d.f(fp1Var.q(4));
            d2.f(fp1Var.q(128));
            d3.f(fp1Var.q(8));
            d4.f(fp1Var.q(32));
            d5.f(fp1Var.q(2));
            d6.f(fp1Var.q(1));
            d7.f(fp1Var.q(519));
            d8.f(fp1Var.q(16));
            d9.f(fp1Var.q(64));
        }
    }

    public static void b(kp1 kp1Var, ip1 ip1Var) {
        boolean z = false;
        kp1Var.a.g(ip1Var, 0);
        kp1Var.c.g(ip1Var, 0);
        kp1Var.b.g(ip1Var, 0);
        kp1Var.e.g(ip1Var, 0);
        kp1Var.f.g(ip1Var, 0);
        kp1Var.g.g(ip1Var, 0);
        kp1Var.h.g(ip1Var, 0);
        kp1Var.i.g(ip1Var, 0);
        kp1Var.d.g(ip1Var, 0);
        kp1Var.m.f(ca0.w(ip1Var.a.h(4)));
        kp1Var.n.f(ca0.w(ip1Var.a.h(2)));
        kp1Var.o.f(ca0.w(ip1Var.a.h(1)));
        kp1Var.p.f(ca0.w(ip1Var.a.h(519)));
        kp1Var.q.f(ca0.w(ip1Var.a.h(64)));
        ms f = ip1Var.a.f();
        kp1Var.j.f(ca0.w(f != null ? c90.b(f.a.getWaterfallInsets()) : c90.e));
        c6 c6Var = null;
        if (f != null) {
            Path b = Build.VERSION.SDK_INT >= 31 ? d8.b(f.a) : null;
            if (b != null) {
                c6Var = new c6(b);
            }
        }
        kp1Var.k.setValue(c6Var);
        synchronized (pb1.c) {
            wn0 wn0Var = pb1.j.h;
            if (wn0Var != null) {
                if (wn0Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            pb1.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            int i = ln1.a;
            g90 g90Var = this.v;
            hn1.a(view, g90Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(g90Var);
            view.setWindowInsetsAnimationCallback(g90Var != null ? new to1(g90Var) : null);
        }
        this.u++;
    }
}
