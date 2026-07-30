package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.n2 f8212a = new g0.n2(k0.f8259o);

    /* renamed from: b, reason: collision with root package name */
    public static final g0.n2 f8213b = new g0.n2(k0.f8260p);

    /* renamed from: c, reason: collision with root package name */
    public static final g0.n2 f8214c = new g0.n2(k0.f8261q);

    /* renamed from: d, reason: collision with root package name */
    public static final g0.n2 f8215d = new g0.n2(k0.f8262r);

    /* renamed from: e, reason: collision with root package name */
    public static final g0.n2 f8216e = new g0.n2(k0.f8267w);

    /* renamed from: f, reason: collision with root package name */
    public static final g0.n2 f8217f = new g0.n2(k0.f8263s);

    /* renamed from: g, reason: collision with root package name */
    public static final g0.n2 f8218g = new g0.n2(k0.f8264t);

    /* renamed from: h, reason: collision with root package name */
    public static final g0.n2 f8219h = new g0.n2(k0.f8266v);

    /* renamed from: i, reason: collision with root package name */
    public static final g0.n2 f8220i = new g0.n2(k0.f8265u);

    /* renamed from: j, reason: collision with root package name */
    public static final g0.n2 f8221j = new g0.n2(k0.f8268x);

    /* renamed from: k, reason: collision with root package name */
    public static final g0.n2 f8222k = new g0.n2(k0.f8269y);

    /* renamed from: l, reason: collision with root package name */
    public static final g0.n2 f8223l = new g0.n2(k0.f8270z);

    /* renamed from: m, reason: collision with root package name */
    public static final g0.n2 f8224m = new g0.n2(k0.D);

    /* renamed from: n, reason: collision with root package name */
    public static final g0.n2 f8225n = new g0.n2(k0.C);

    /* renamed from: o, reason: collision with root package name */
    public static final g0.n2 f8226o = new g0.n2(k0.E);

    /* renamed from: p, reason: collision with root package name */
    public static final g0.n2 f8227p = new g0.n2(k0.F);

    /* renamed from: q, reason: collision with root package name */
    public static final g0.n2 f8228q = new g0.n2(k0.G);

    /* renamed from: r, reason: collision with root package name */
    public static final g0.n2 f8229r = new g0.n2(k0.H);

    /* renamed from: s, reason: collision with root package name */
    public static final g0.n2 f8230s = new g0.n2(k0.A);

    /* renamed from: t, reason: collision with root package name */
    public static final g0.z f8231t = new g0.z(k0.B);

    public static final void a(r1.g1 g1Var, u0 u0Var, q6.e eVar, g0.p pVar, int i7) {
        pVar.S(874662829);
        int i8 = i7 | (pVar.f(g1Var) ? 4 : 2) | (pVar.f(u0Var) ? 32 : 16) | (pVar.h(eVar) ? 256 : 128);
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            r rVar = (r) g1Var;
            g0.n1 a3 = f8212a.a(rVar.getAccessibilityManager());
            g0.n1 a9 = f8213b.a(rVar.getAutofill());
            g0.n1 a10 = f8214c.a(rVar.getAutofillTree());
            g0.n1 a11 = f8215d.a(rVar.getClipboardManager());
            g0.n1 a12 = f8217f.a(rVar.getDensity());
            g0.n1 a13 = f8218g.a(rVar.getFocusOwner());
            g0.n1 a14 = f8219h.a(rVar.getFontLoader());
            a14.f3810f = false;
            g0.n1 a15 = f8220i.a(rVar.getFontFamilyResolver());
            a15.f3810f = false;
            g0.d.b(new g0.n1[]{a3, a9, a10, a11, a12, a13, a14, a15, f8221j.a(rVar.getHapticFeedBack()), f8222k.a(rVar.getInputModeManager()), f8223l.a(rVar.getLayoutDirection()), f8224m.a(rVar.getTextInputService()), f8225n.a(rVar.getSoftwareKeyboardController()), f8226o.a(rVar.getTextToolbar()), f8227p.a(u0Var), f8228q.a(rVar.getViewConfiguration()), f8229r.a(rVar.getWindowInfo()), f8230s.a(rVar.getPointerIconService()), f8216e.a(rVar.getGraphicsContext())}, eVar, pVar, ((i8 >> 3) & 112) | 8);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d0.x1(g1Var, u0Var, eVar, i7, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
