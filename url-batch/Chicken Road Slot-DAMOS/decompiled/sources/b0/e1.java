package b0;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.appsflyer.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import n0.j1;
import o3.h1;
import o3.k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: v, reason: collision with root package name */
    public static final WeakHashMap f818v = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a f819a;

    /* renamed from: b, reason: collision with root package name */
    public final a f820b;

    /* renamed from: c, reason: collision with root package name */
    public final a f821c;

    /* renamed from: d, reason: collision with root package name */
    public final a f822d;

    /* renamed from: e, reason: collision with root package name */
    public final a f823e;

    /* renamed from: f, reason: collision with root package name */
    public final a f824f;
    public final a g;

    /* renamed from: h, reason: collision with root package name */
    public final a f825h;

    /* renamed from: i, reason: collision with root package name */
    public final a f826i;
    public final b1 j;

    /* renamed from: k, reason: collision with root package name */
    public final j1 f827k;

    /* renamed from: l, reason: collision with root package name */
    public final b1 f828l;

    /* renamed from: m, reason: collision with root package name */
    public final b1 f829m;

    /* renamed from: n, reason: collision with root package name */
    public final b1 f830n;

    /* renamed from: o, reason: collision with root package name */
    public final b1 f831o;

    /* renamed from: p, reason: collision with root package name */
    public final b1 f832p;

    /* renamed from: q, reason: collision with root package name */
    public final b1 f833q;

    /* renamed from: r, reason: collision with root package name */
    public final b1 f834r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f835s;

    /* renamed from: t, reason: collision with root package name */
    public int f836t;

    /* renamed from: u, reason: collision with root package name */
    public final f0 f837u;

    public e1(View view) {
        a c10 = t.c(4, "captionBar");
        this.f819a = c10;
        a c11 = t.c(128, "displayCutout");
        this.f820b = c11;
        a c12 = t.c(8, "ime");
        this.f821c = c12;
        a c13 = t.c(32, "mandatorySystemGestures");
        this.f822d = c13;
        a c14 = t.c(2, "navigationBars");
        this.f823e = c14;
        a c15 = t.c(1, "statusBars");
        this.f824f = c15;
        a c16 = t.c(519, "systemBars");
        this.g = c16;
        a c17 = t.c(16, "systemGestures");
        this.f825h = c17;
        a c18 = t.c(64, "tappableElement");
        this.f826i = c18;
        b1 b1Var = new b1(new h0(0, 0, 0, 0), "waterfall");
        this.j = b1Var;
        this.f827k = n0.h.r(null);
        new a1(new a1(new a1(c16, c12), c11), new a1(new a1(new a1(c18, c13), c17), b1Var));
        this.f828l = t.d(4, "captionBarIgnoringVisibility");
        this.f829m = t.d(2, "navigationBarsIgnoringVisibility");
        this.f830n = t.d(1, "statusBarsIgnoringVisibility");
        this.f831o = t.d(519, "systemBarsIgnoringVisibility");
        this.f832p = t.d(64, "tappableElementIgnoringVisibility");
        this.f833q = new b1(new h0(0, 0, 0, 0), "imeAnimationTarget");
        this.f834r = new b1(new h0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f835s = bool != null ? bool.booleanValue() : false;
        this.f837u = new f0(this);
        Field field = o3.c0.f7378a;
        k1 a9 = o3.x.a(view);
        if (a9 != null) {
            h1 h1Var = a9.f7415a;
            c10.f(h1Var.u(4));
            c11.f(h1Var.u(128));
            c12.f(h1Var.u(8));
            c13.f(h1Var.u(32));
            c14.f(h1Var.u(2));
            c15.f(h1Var.u(1));
            c16.f(h1Var.u(519));
            c17.f(h1Var.u(16));
            c18.f(h1Var.u(64));
        }
    }

    public static void b(e1 e1Var, k1 k1Var) {
        boolean z10 = false;
        e1Var.f819a.g(k1Var, 0);
        e1Var.f821c.g(k1Var, 0);
        e1Var.f820b.g(k1Var, 0);
        e1Var.f823e.g(k1Var, 0);
        e1Var.f824f.g(k1Var, 0);
        e1Var.g.g(k1Var, 0);
        e1Var.f825h.g(k1Var, 0);
        e1Var.f826i.g(k1Var, 0);
        e1Var.f822d.g(k1Var, 0);
        e1Var.f828l.f(i.k(k1Var.f7415a.j(4)));
        e1Var.f829m.f(i.k(k1Var.f7415a.j(2)));
        e1Var.f830n.f(i.k(k1Var.f7415a.j(1)));
        e1Var.f831o.f(i.k(k1Var.f7415a.j(519)));
        e1Var.f832p.f(i.k(k1Var.f7415a.j(64)));
        o3.d h10 = k1Var.f7415a.h();
        e1Var.j.f(i.k(h10 != null ? h10.a() : h3.b.f4442e));
        k1.g gVar = null;
        if (h10 != null) {
            Path a9 = Build.VERSION.SDK_INT >= 31 ? e3.m.a(h10.f7384a) : null;
            if (a9 != null) {
                gVar = new k1.g(a9);
            }
        }
        e1Var.f827k.setValue(gVar);
        synchronized (b1.r.f1030c) {
            s.i0 i0Var = b1.r.j.f959h;
            if (i0Var != null) {
                if (i0Var.h()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            b1.r.a();
        }
    }

    public final void a(View view) {
        if (this.f836t == 0) {
            Field field = o3.c0.f7378a;
            f0 f0Var = this.f837u;
            o3.w.c(view, f0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(f0Var);
            o3.c0.f(view, f0Var);
        }
        this.f836t++;
    }
}
