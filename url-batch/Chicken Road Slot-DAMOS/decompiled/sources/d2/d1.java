package d2;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.n2 f3378a = new n0.n2(i0.f3425v);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.n2 f3379b = new n0.n2(i0.f3426w);

    /* renamed from: c, reason: collision with root package name */
    public static final n0.n2 f3380c = new n0.n2(i0.f3428y);

    /* renamed from: d, reason: collision with root package name */
    public static final n0.n2 f3381d = new n0.n2(i0.f3427x);

    /* renamed from: e, reason: collision with root package name */
    public static final n0.n2 f3382e = new n0.n2(i0.A);

    /* renamed from: f, reason: collision with root package name */
    public static final n0.n2 f3383f = new n0.n2(i0.f3429z);
    public static final n0.n2 g = new n0.n2(i0.G);

    /* renamed from: h, reason: collision with root package name */
    public static final n0.n2 f3384h = new n0.n2(i0.C);

    /* renamed from: i, reason: collision with root package name */
    public static final n0.n2 f3385i = new n0.n2(i0.D);
    public static final n0.n2 j = new n0.n2(i0.F);

    /* renamed from: k, reason: collision with root package name */
    public static final n0.n2 f3386k = new n0.n2(i0.E);

    /* renamed from: l, reason: collision with root package name */
    public static final n0.n2 f3387l = new n0.n2(i0.H);

    /* renamed from: m, reason: collision with root package name */
    public static final n0.n2 f3388m = new n0.n2(i0.I);

    /* renamed from: n, reason: collision with root package name */
    public static final n0.n2 f3389n = new n0.n2(i0.J);

    /* renamed from: o, reason: collision with root package name */
    public static final n0.n2 f3390o = new n0.n2(i0.L);

    /* renamed from: p, reason: collision with root package name */
    public static final n0.n2 f3391p;

    /* renamed from: q, reason: collision with root package name */
    public static final n0.n2 f3392q;

    /* renamed from: r, reason: collision with root package name */
    public static final n0.n2 f3393r;

    /* renamed from: s, reason: collision with root package name */
    public static final n0.n2 f3394s;

    /* renamed from: t, reason: collision with root package name */
    public static final n0.n2 f3395t;

    /* renamed from: u, reason: collision with root package name */
    public static final n0.n2 f3396u;

    /* renamed from: v, reason: collision with root package name */
    public static final n0.n2 f3397v;

    /* renamed from: w, reason: collision with root package name */
    public static final n0.v f3398w;

    static {
        hd.h.b(new n0.u(0));
        f3391p = new n0.n2(i0.O);
        f3392q = new n0.n2(i0.N);
        f3393r = new n0.n2(i0.P);
        f3394s = new n0.n2(i0.Q);
        f3395t = new n0.n2(i0.R);
        f3396u = new n0.n2(l1.f3467i);
        f3397v = new n0.n2(i0.K);
        f3398w = new n0.v(i0.M);
        hd.h.b(i0.B);
    }

    public static final void a(v vVar, k1 k1Var, Function2 function2, n0.i0 i0Var, int i3) {
        i0Var.X(1925803616);
        int i10 = i3 | (i0Var.f(vVar) ? 4 : 2) | (i0Var.f(k1Var) ? 32 : 16) | (i0Var.h(function2) ? 256 : 128);
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            n0.q1 a9 = f3378a.a(vVar.getAccessibilityManager());
            n0.q1 a10 = f3379b.a(vVar.getAutofill());
            n0.q1 a11 = f3381d.a(vVar.getAutofillManager());
            n0.q1 a12 = f3380c.a(vVar.getAutofillTree());
            n0.q1 a13 = f3382e.a(vVar.m39getClipboardManager());
            n0.q1 a14 = f3383f.a(vVar.m38getClipboard());
            n0.q1 a15 = f3384h.a(vVar.getDensity());
            n0.q1 a16 = f3385i.a(vVar.getFocusOwner());
            n0.q1 a17 = j.a(vVar.getFontLoader());
            a17.f6798f = false;
            n0.q1 a18 = f3386k.a(vVar.getFontFamilyResolver());
            a18.f6798f = false;
            n0.h.b(new n0.q1[]{a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, f3387l.a(vVar.getHapticFeedBack()), f3388m.a(vVar.getInputModeManager()), f3389n.a(vVar.getLayoutDirection()), f3391p.a(vVar.getTextInputService()), f3392q.a(vVar.getSoftwareKeyboardController()), f3393r.a(vVar.getTextToolbar()), f3394s.a(k1Var), f3395t.a(vVar.getViewConfiguration()), f3396u.a(vVar.getWindowInfo()), f3397v.a(vVar.getPointerIconService()), g.a(vVar.getGraphicsContext()), y0.b.f10570a.a(vVar.getRetainedValuesStore()), f3390o.a(vVar.getLocaleList())}, function2, i0Var, ((i10 >> 3) & 112) | 8);
        } else {
            i0Var.R();
        }
        n0.s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new a3.p(vVar, k1Var, function2, i3, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
