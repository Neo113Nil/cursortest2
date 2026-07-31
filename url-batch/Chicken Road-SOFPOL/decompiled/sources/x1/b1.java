package x1;

import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u2 f8363a = new u2(h0.f8428l);

    /* renamed from: b, reason: collision with root package name */
    public static final u2 f8364b = new u2(h0.f8429m);

    /* renamed from: c, reason: collision with root package name */
    public static final u2 f8365c = new u2(h0.f8431o);

    /* renamed from: d, reason: collision with root package name */
    public static final u2 f8366d = new u2(h0.f8430n);

    /* renamed from: e, reason: collision with root package name */
    public static final u2 f8367e = new u2(h0.f8433q);

    /* renamed from: f, reason: collision with root package name */
    public static final u2 f8368f = new u2(h0.f8432p);

    /* renamed from: g, reason: collision with root package name */
    public static final u2 f8369g = new u2(h0.f8439w);

    /* renamed from: h, reason: collision with root package name */
    public static final u2 f8370h = new u2(h0.f8435s);
    public static final u2 i = new u2(h0.f8436t);

    /* renamed from: j, reason: collision with root package name */
    public static final u2 f8371j = new u2(h0.f8438v);

    /* renamed from: k, reason: collision with root package name */
    public static final u2 f8372k = new u2(h0.f8437u);

    /* renamed from: l, reason: collision with root package name */
    public static final u2 f8373l = new u2(h0.f8440x);

    /* renamed from: m, reason: collision with root package name */
    public static final u2 f8374m = new u2(h0.f8441y);

    /* renamed from: n, reason: collision with root package name */
    public static final u2 f8375n = new u2(h0.f8442z);

    /* renamed from: o, reason: collision with root package name */
    public static final u2 f8376o = new u2(h0.D);

    /* renamed from: p, reason: collision with root package name */
    public static final u2 f8377p = new u2(h0.C);

    /* renamed from: q, reason: collision with root package name */
    public static final u2 f8378q = new u2(h0.E);

    /* renamed from: r, reason: collision with root package name */
    public static final u2 f8379r = new u2(h0.F);

    /* renamed from: s, reason: collision with root package name */
    public static final u2 f8380s = new u2(h0.G);

    /* renamed from: t, reason: collision with root package name */
    public static final u2 f8381t = new u2(h0.H);

    /* renamed from: u, reason: collision with root package name */
    public static final u2 f8382u = new u2(h0.A);

    /* renamed from: v, reason: collision with root package name */
    public static final m0.b0 f8383v = new m0.b0(h0.B);

    static {
        a.a.r(h0.f8434r);
    }

    public static final void a(w1.k1 k1Var, o0 o0Var, p6.e eVar, m0.s sVar, int i8) {
        sVar.W(1925803616);
        int i9 = i8 | (sVar.f(k1Var) ? 4 : 2) | (sVar.f(o0Var) ? 32 : 16) | (sVar.h(eVar) ? 256 : 128);
        if (sVar.N(i9 & 1, (i9 & 147) != 146)) {
            t tVar = (t) k1Var;
            l.q a8 = f8363a.a(tVar.getAccessibilityManager());
            l.q a9 = f8364b.a(tVar.getAutofill());
            l.q a10 = f8366d.a(tVar.getAutofillManager());
            l.q a11 = f8365c.a(tVar.getAutofillTree());
            l.q a12 = f8367e.a(tVar.m9getClipboardManager());
            l.q a13 = f8368f.a(tVar.m8getClipboard());
            l.q a14 = f8370h.a(tVar.getDensity());
            l.q a15 = i.a(tVar.getFocusOwner());
            l.q a16 = f8371j.a(tVar.getFontLoader());
            a16.f4381c = false;
            l.q a17 = f8372k.a(tVar.getFontFamilyResolver());
            a17.f4381c = false;
            m0.b.b(new l.q[]{a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, f8373l.a(tVar.getHapticFeedBack()), f8374m.a(tVar.getInputModeManager()), f8375n.a(tVar.getLayoutDirection()), f8376o.a(tVar.getTextInputService()), f8377p.a(tVar.getSoftwareKeyboardController()), f8378q.a(tVar.getTextToolbar()), f8379r.a(o0Var), f8380s.a(tVar.getViewConfiguration()), f8381t.a(tVar.getWindowInfo()), f8382u.a(tVar.getPointerIconService()), f8369g.a(tVar.getGraphicsContext())}, eVar, sVar, ((i9 >> 3) & 112) | 8);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new u2.c(k1Var, o0Var, eVar, i8, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
