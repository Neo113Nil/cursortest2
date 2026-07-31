package r;

import S.C0220d;
import android.os.Build;
import android.view.View;
import c1.AbstractC0380d;
import c1.C0381e;
import com.gatesof.olympus.martu.marku.R;
import j.C0519A;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f8002u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0854a f8003a = C0855b.c("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final C0854a f8004b;

    /* renamed from: c, reason: collision with root package name */
    public final C0854a f8005c;

    /* renamed from: d, reason: collision with root package name */
    public final C0854a f8006d;

    /* renamed from: e, reason: collision with root package name */
    public final C0854a f8007e;

    /* renamed from: f, reason: collision with root package name */
    public final C0854a f8008f;

    /* renamed from: g, reason: collision with root package name */
    public final C0854a f8009g;

    /* renamed from: h, reason: collision with root package name */
    public final C0854a f8010h;

    /* renamed from: i, reason: collision with root package name */
    public final C0854a f8011i;

    /* renamed from: j, reason: collision with root package name */
    public final W f8012j;

    /* renamed from: k, reason: collision with root package name */
    public final W f8013k;

    /* renamed from: l, reason: collision with root package name */
    public final W f8014l;

    /* renamed from: m, reason: collision with root package name */
    public final W f8015m;

    /* renamed from: n, reason: collision with root package name */
    public final W f8016n;

    /* renamed from: o, reason: collision with root package name */
    public final W f8017o;

    /* renamed from: p, reason: collision with root package name */
    public final W f8018p;

    /* renamed from: q, reason: collision with root package name */
    public final W f8019q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8020r;

    /* renamed from: s, reason: collision with root package name */
    public int f8021s;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC0841C f8022t;

    public Y(View view) {
        C0854a c2 = C0855b.c("displayCutout", 128);
        this.f8004b = c2;
        C0854a c3 = C0855b.c("ime", 8);
        this.f8005c = c3;
        C0854a c4 = C0855b.c("mandatorySystemGestures", 32);
        this.f8006d = c4;
        this.f8007e = C0855b.c("navigationBars", 2);
        this.f8008f = C0855b.c("statusBars", 1);
        C0854a c5 = C0855b.c("systemBars", 7);
        this.f8009g = c5;
        C0854a c6 = C0855b.c("systemGestures", 16);
        this.f8010h = c6;
        C0854a c7 = C0855b.c("tappableElement", 64);
        this.f8011i = c7;
        W w2 = new W(AbstractC0856c.e(X0.c.f4622e), "waterfall");
        this.f8012j = w2;
        new U(new U(c5, c3), c2);
        new U(new U(new U(c7, c4), c6), w2);
        this.f8013k = C0855b.d("captionBarIgnoringVisibility", 4);
        this.f8014l = C0855b.d("navigationBarsIgnoringVisibility", 2);
        this.f8015m = C0855b.d("statusBarsIgnoringVisibility", 1);
        this.f8016n = C0855b.d("systemBarsIgnoringVisibility", 7);
        this.f8017o = C0855b.d("tappableElementIgnoringVisibility", 64);
        this.f8018p = C0855b.d("imeAnimationTarget", 8);
        this.f8019q = C0855b.d("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f8020r = bool != null ? bool.booleanValue() : true;
        this.f8022t = new RunnableC0841C(this);
    }

    public static void a(Y y3, c1.U u3) {
        boolean z3 = false;
        y3.f8003a.f(u3, 0);
        y3.f8005c.f(u3, 0);
        y3.f8004b.f(u3, 0);
        y3.f8007e.f(u3, 0);
        y3.f8008f.f(u3, 0);
        y3.f8009g.f(u3, 0);
        y3.f8010h.f(u3, 0);
        y3.f8011i.f(u3, 0);
        y3.f8006d.f(u3, 0);
        y3.f8013k.f(AbstractC0856c.e(u3.f5589a.g(4)));
        y3.f8014l.f(AbstractC0856c.e(u3.f5589a.g(2)));
        y3.f8015m.f(AbstractC0856c.e(u3.f5589a.g(1)));
        y3.f8016n.f(AbstractC0856c.e(u3.f5589a.g(7)));
        y3.f8017o.f(AbstractC0856c.e(u3.f5589a.g(64)));
        C0381e e3 = u3.f5589a.e();
        if (e3 != null) {
            y3.f8012j.f(AbstractC0856c.e(Build.VERSION.SDK_INT >= 30 ? X0.c.c(AbstractC0380d.b(e3.f5597a)) : X0.c.f4622e));
        }
        synchronized (S.p.f4241b) {
            C0519A c0519a = ((C0220d) S.p.f4248i.get()).f4204h;
            if (c0519a != null) {
                if (c0519a.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            S.p.a();
        }
    }
}
