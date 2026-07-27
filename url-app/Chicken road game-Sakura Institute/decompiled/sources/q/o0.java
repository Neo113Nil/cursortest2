package q;

import Q.C0268d;
import a1.AbstractC0389d;
import a1.C0383T;
import a1.C0390e;
import android.os.Build;
import android.view.View;
import com.chicken.road.kedro.laqer.R;
import i.C0661B;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f9297u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C1022a f9298a = C1023b.c(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final C1022a f9299b;

    /* renamed from: c, reason: collision with root package name */
    public final C1022a f9300c;

    /* renamed from: d, reason: collision with root package name */
    public final C1022a f9301d;

    /* renamed from: e, reason: collision with root package name */
    public final C1022a f9302e;

    /* renamed from: f, reason: collision with root package name */
    public final C1022a f9303f;

    /* renamed from: g, reason: collision with root package name */
    public final C1022a f9304g;

    /* renamed from: h, reason: collision with root package name */
    public final C1022a f9305h;

    /* renamed from: i, reason: collision with root package name */
    public final C1022a f9306i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f9307j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f9308k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f9309l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f9310m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f9311n;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f9312o;

    /* renamed from: p, reason: collision with root package name */
    public final l0 f9313p;

    /* renamed from: q, reason: collision with root package name */
    public final l0 f9314q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9315r;

    /* renamed from: s, reason: collision with root package name */
    public int f9316s;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC1012P f9317t;

    public o0(View view) {
        C1022a c4 = C1023b.c(128, "displayCutout");
        this.f9299b = c4;
        C1022a c5 = C1023b.c(8, "ime");
        this.f9300c = c5;
        C1022a c6 = C1023b.c(32, "mandatorySystemGestures");
        this.f9301d = c6;
        this.f9302e = C1023b.c(2, "navigationBars");
        this.f9303f = C1023b.c(1, "statusBars");
        C1022a c7 = C1023b.c(7, "systemBars");
        this.f9304g = c7;
        C1022a c8 = C1023b.c(16, "systemGestures");
        this.f9305h = c8;
        C1022a c9 = C1023b.c(64, "tappableElement");
        this.f9306i = c9;
        l0 l0Var = new l0(AbstractC1024c.i(V0.c.f4142e), "waterfall");
        this.f9307j = l0Var;
        new j0(new j0(c7, c5), c4);
        new j0(new j0(new j0(c9, c6), c8), l0Var);
        this.f9308k = C1023b.d(4, "captionBarIgnoringVisibility");
        this.f9309l = C1023b.d(2, "navigationBarsIgnoringVisibility");
        this.f9310m = C1023b.d(1, "statusBarsIgnoringVisibility");
        this.f9311n = C1023b.d(7, "systemBarsIgnoringVisibility");
        this.f9312o = C1023b.d(64, "tappableElementIgnoringVisibility");
        this.f9313p = C1023b.d(8, "imeAnimationTarget");
        this.f9314q = C1023b.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f9315r = bool != null ? bool.booleanValue() : true;
        this.f9317t = new RunnableC1012P(this);
    }

    public static void a(o0 o0Var, C0383T c0383t) {
        boolean z4 = false;
        o0Var.f9298a.f(c0383t, 0);
        o0Var.f9300c.f(c0383t, 0);
        o0Var.f9299b.f(c0383t, 0);
        o0Var.f9302e.f(c0383t, 0);
        o0Var.f9303f.f(c0383t, 0);
        o0Var.f9304g.f(c0383t, 0);
        o0Var.f9305h.f(c0383t, 0);
        o0Var.f9306i.f(c0383t, 0);
        o0Var.f9301d.f(c0383t, 0);
        o0Var.f9308k.f(AbstractC1024c.i(c0383t.f4871a.g(4)));
        o0Var.f9309l.f(AbstractC1024c.i(c0383t.f4871a.g(2)));
        o0Var.f9310m.f(AbstractC1024c.i(c0383t.f4871a.g(1)));
        o0Var.f9311n.f(AbstractC1024c.i(c0383t.f4871a.g(7)));
        o0Var.f9312o.f(AbstractC1024c.i(c0383t.f4871a.g(64)));
        C0390e e4 = c0383t.f4871a.e();
        if (e4 != null) {
            o0Var.f9307j.f(AbstractC1024c.i(Build.VERSION.SDK_INT >= 30 ? V0.c.c(AbstractC0389d.b(e4.f4879a)) : V0.c.f4142e));
        }
        synchronized (Q.q.f3878b) {
            C0661B c0661b = ((C0268d) Q.q.f3885i.get()).f3839h;
            if (c0661b != null) {
                if (c0661b.h()) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Q.q.a();
        }
    }
}
