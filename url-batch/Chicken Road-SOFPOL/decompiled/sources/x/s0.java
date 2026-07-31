package x;

import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import java.util.WeakHashMap;
import q3.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f8273u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a f8274a = c.b("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final a f8275b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8276c;

    /* renamed from: d, reason: collision with root package name */
    public final a f8277d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8278e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8279f;

    /* renamed from: g, reason: collision with root package name */
    public final a f8280g;

    /* renamed from: h, reason: collision with root package name */
    public final a f8281h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f8282j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f8283k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f8284l;

    /* renamed from: m, reason: collision with root package name */
    public final q0 f8285m;

    /* renamed from: n, reason: collision with root package name */
    public final q0 f8286n;

    /* renamed from: o, reason: collision with root package name */
    public final q0 f8287o;

    /* renamed from: p, reason: collision with root package name */
    public final q0 f8288p;

    /* renamed from: q, reason: collision with root package name */
    public final q0 f8289q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8290r;

    /* renamed from: s, reason: collision with root package name */
    public int f8291s;

    /* renamed from: t, reason: collision with root package name */
    public final z f8292t;

    public s0(View view) {
        a b8 = c.b("displayCutout", 128);
        this.f8275b = b8;
        a b9 = c.b("ime", 8);
        this.f8276c = b9;
        a b10 = c.b("mandatorySystemGestures", 32);
        this.f8277d = b10;
        this.f8278e = c.b("navigationBars", 2);
        this.f8279f = c.b("statusBars", 1);
        a b11 = c.b("systemBars", 519);
        this.f8280g = b11;
        a b12 = c.b("systemGestures", 16);
        this.f8281h = b12;
        a b13 = c.b("tappableElement", 64);
        this.i = b13;
        q0 q0Var = new q0(new b0(0, 0, 0, 0), "waterfall");
        this.f8282j = q0Var;
        new o0(new o0(b11, b9), b8);
        new o0(new o0(new o0(b13, b10), b12), q0Var);
        this.f8283k = c.d("captionBarIgnoringVisibility", 4);
        this.f8284l = c.d("navigationBarsIgnoringVisibility", 2);
        this.f8285m = c.d("statusBarsIgnoringVisibility", 1);
        this.f8286n = c.d("systemBarsIgnoringVisibility", 519);
        this.f8287o = c.d("tappableElementIgnoringVisibility", 64);
        this.f8288p = c.d("imeAnimationTarget", 8);
        this.f8289q = c.d("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f8290r = bool != null ? bool.booleanValue() : false;
        this.f8292t = new z(this);
    }

    public static void a(s0 s0Var, l1 l1Var) {
        boolean z3 = false;
        s0Var.f8274a.f(l1Var, 0);
        s0Var.f8276c.f(l1Var, 0);
        s0Var.f8275b.f(l1Var, 0);
        s0Var.f8278e.f(l1Var, 0);
        s0Var.f8279f.f(l1Var, 0);
        s0Var.f8280g.f(l1Var, 0);
        s0Var.f8281h.f(l1Var, 0);
        s0Var.i.f(l1Var, 0);
        s0Var.f8277d.f(l1Var, 0);
        s0Var.f8283k.f(v0.c(l1Var.f6127a.g(4)));
        s0Var.f8284l.f(v0.c(l1Var.f6127a.g(2)));
        s0Var.f8285m.f(v0.c(l1Var.f6127a.g(1)));
        s0Var.f8286n.f(v0.c(l1Var.f6127a.g(519)));
        s0Var.f8287o.f(v0.c(l1Var.f6127a.g(64)));
        q3.j e8 = l1Var.f6127a.e();
        if (e8 != null) {
            s0Var.f8282j.f(v0.c(e8.a()));
        }
        synchronized (w0.m.f7537c) {
            o.k0 k0Var = w0.m.f7543j.f7505h;
            if (k0Var != null) {
                if (k0Var.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            w0.m.a();
        }
    }
}
