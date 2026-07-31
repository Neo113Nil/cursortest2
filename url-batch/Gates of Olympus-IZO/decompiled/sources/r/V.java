package r;

import a1.AbstractC0166d;
import a1.C0167e;
import android.os.Build;
import android.view.View;
import com.gates.olympus.miruv.R;
import j.C0475A;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f7028u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0804a f7029a = C0805b.b("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final C0804a f7030b;

    /* renamed from: c, reason: collision with root package name */
    public final C0804a f7031c;

    /* renamed from: d, reason: collision with root package name */
    public final C0804a f7032d;

    /* renamed from: e, reason: collision with root package name */
    public final C0804a f7033e;

    /* renamed from: f, reason: collision with root package name */
    public final C0804a f7034f;

    /* renamed from: g, reason: collision with root package name */
    public final C0804a f7035g;

    /* renamed from: h, reason: collision with root package name */
    public final C0804a f7036h;

    /* renamed from: i, reason: collision with root package name */
    public final C0804a f7037i;

    /* renamed from: j, reason: collision with root package name */
    public final T f7038j;

    /* renamed from: k, reason: collision with root package name */
    public final T f7039k;

    /* renamed from: l, reason: collision with root package name */
    public final T f7040l;

    /* renamed from: m, reason: collision with root package name */
    public final T f7041m;

    /* renamed from: n, reason: collision with root package name */
    public final T f7042n;

    /* renamed from: o, reason: collision with root package name */
    public final T f7043o;
    public final T p;

    /* renamed from: q, reason: collision with root package name */
    public final T f7044q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7045r;

    /* renamed from: s, reason: collision with root package name */
    public int f7046s;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC0789A f7047t;

    public V(View view) {
        C0804a b2 = C0805b.b("displayCutout", 128);
        this.f7030b = b2;
        C0804a b3 = C0805b.b("ime", 8);
        this.f7031c = b3;
        C0804a b4 = C0805b.b("mandatorySystemGestures", 32);
        this.f7032d = b4;
        this.f7033e = C0805b.b("navigationBars", 2);
        this.f7034f = C0805b.b("statusBars", 1);
        C0804a b5 = C0805b.b("systemBars", 7);
        this.f7035g = b5;
        C0804a b6 = C0805b.b("systemGestures", 16);
        this.f7036h = b6;
        C0804a b7 = C0805b.b("tappableElement", 64);
        this.f7037i = b7;
        T t3 = new T(g2.i.Y(V0.c.f3348e), "waterfall");
        this.f7038j = t3;
        new Q(new Q(b5, b3), b2);
        new Q(new Q(new Q(b7, b4), b6), t3);
        this.f7039k = C0805b.d("captionBarIgnoringVisibility", 4);
        this.f7040l = C0805b.d("navigationBarsIgnoringVisibility", 2);
        this.f7041m = C0805b.d("statusBarsIgnoringVisibility", 1);
        this.f7042n = C0805b.d("systemBarsIgnoringVisibility", 7);
        this.f7043o = C0805b.d("tappableElementIgnoringVisibility", 64);
        this.p = C0805b.d("imeAnimationTarget", 8);
        this.f7044q = C0805b.d("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f7045r = bool != null ? bool.booleanValue() : true;
        this.f7047t = new RunnableC0789A(this);
    }

    public static void a(V v3, a1.Q q2) {
        boolean z3 = false;
        v3.f7029a.f(q2, 0);
        v3.f7031c.f(q2, 0);
        v3.f7030b.f(q2, 0);
        v3.f7033e.f(q2, 0);
        v3.f7034f.f(q2, 0);
        v3.f7035g.f(q2, 0);
        v3.f7036h.f(q2, 0);
        v3.f7037i.f(q2, 0);
        v3.f7032d.f(q2, 0);
        v3.f7039k.f(g2.i.Y(q2.f3542a.g(4)));
        v3.f7040l.f(g2.i.Y(q2.f3542a.g(2)));
        v3.f7041m.f(g2.i.Y(q2.f3542a.g(1)));
        v3.f7042n.f(g2.i.Y(q2.f3542a.g(7)));
        v3.f7043o.f(g2.i.Y(q2.f3542a.g(64)));
        C0167e e3 = q2.f3542a.e();
        if (e3 != null) {
            v3.f7038j.f(g2.i.Y(Build.VERSION.SDK_INT >= 30 ? V0.c.c(AbstractC0166d.b(e3.f3550a)) : V0.c.f3348e));
        }
        synchronized (S.q.f3235b) {
            C0475A c0475a = ((S.d) S.q.f3242i.get()).f3197h;
            if (c0475a != null) {
                if (c0475a.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            S.q.a();
        }
    }
}
