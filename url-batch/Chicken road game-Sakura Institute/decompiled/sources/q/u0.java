package q;

import android.os.Build;
import android.view.View;
import com.android.installreferrer.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f7347u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a f7348a = b.c("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final a f7349b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7350c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7351d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7352e;

    /* renamed from: f, reason: collision with root package name */
    public final a f7353f;

    /* renamed from: g, reason: collision with root package name */
    public final a f7354g;

    /* renamed from: h, reason: collision with root package name */
    public final a f7355h;

    /* renamed from: i, reason: collision with root package name */
    public final a f7356i;

    /* renamed from: j, reason: collision with root package name */
    public final r0 f7357j;

    /* renamed from: k, reason: collision with root package name */
    public final r0 f7358k;

    /* renamed from: l, reason: collision with root package name */
    public final r0 f7359l;

    /* renamed from: m, reason: collision with root package name */
    public final r0 f7360m;

    /* renamed from: n, reason: collision with root package name */
    public final r0 f7361n;

    /* renamed from: o, reason: collision with root package name */
    public final r0 f7362o;

    /* renamed from: p, reason: collision with root package name */
    public final r0 f7363p;

    /* renamed from: q, reason: collision with root package name */
    public final r0 f7364q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7365r;

    /* renamed from: s, reason: collision with root package name */
    public int f7366s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f7367t;

    public u0(View view) {
        a c4 = b.c("displayCutout", 128);
        this.f7349b = c4;
        a c6 = b.c("ime", 8);
        this.f7350c = c6;
        a c9 = b.c("mandatorySystemGestures", 32);
        this.f7351d = c9;
        this.f7352e = b.c("navigationBars", 2);
        this.f7353f = b.c("statusBars", 1);
        a c10 = b.c("systemBars", 7);
        this.f7354g = c10;
        a c11 = b.c("systemGestures", 16);
        this.f7355h = c11;
        a c12 = b.c("tappableElement", 64);
        this.f7356i = c12;
        r0 r0Var = new r0(new c0(0, 0, 0, 0), "waterfall");
        this.f7357j = r0Var;
        new p0(new p0(c10, c6), c4);
        new p0(new p0(new p0(c12, c9), c11), r0Var);
        this.f7358k = b.d("captionBarIgnoringVisibility", 4);
        this.f7359l = b.d("navigationBarsIgnoringVisibility", 2);
        this.f7360m = b.d("statusBarsIgnoringVisibility", 1);
        this.f7361n = b.d("systemBarsIgnoringVisibility", 7);
        this.f7362o = b.d("tappableElementIgnoringVisibility", 64);
        this.f7363p = b.d("imeAnimationTarget", 8);
        this.f7364q = b.d("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f7365r = bool != null ? bool.booleanValue() : true;
        this.f7367t = new a0(this);
    }

    public static void a(u0 u0Var, b3.t0 t0Var) {
        boolean z8 = false;
        u0Var.f7348a.f(t0Var, 0);
        u0Var.f7350c.f(t0Var, 0);
        u0Var.f7349b.f(t0Var, 0);
        u0Var.f7352e.f(t0Var, 0);
        u0Var.f7353f.f(t0Var, 0);
        u0Var.f7354g.f(t0Var, 0);
        u0Var.f7355h.f(t0Var, 0);
        u0Var.f7356i.f(t0Var, 0);
        u0Var.f7351d.f(t0Var, 0);
        u0Var.f7358k.f(c.e(t0Var.f1367a.g(4)));
        u0Var.f7359l.f(c.e(t0Var.f1367a.g(2)));
        u0Var.f7360m.f(c.e(t0Var.f1367a.g(1)));
        u0Var.f7361n.f(c.e(t0Var.f1367a.g(7)));
        u0Var.f7362o.f(c.e(t0Var.f1367a.g(64)));
        b3.e e9 = t0Var.f1367a.e();
        if (e9 != null) {
            u0Var.f7357j.f(c.e(Build.VERSION.SDK_INT >= 30 ? v2.c.c(b3.d.b(e9.f1318a)) : v2.c.f9101e));
        }
        synchronized (q0.n.f7427b) {
            i.b0 b0Var = ((q0.b) q0.n.f7434i.get()).f7390h;
            if (b0Var != null) {
                if (b0Var.h()) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            q0.n.a();
        }
    }
}
