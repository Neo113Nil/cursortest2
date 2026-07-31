package u0;

import I.C0089d;
import I.C0113p;
import I.C0116q0;
import I.C0119s0;
import I.C0132z;

/* renamed from: u0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0963b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.Y0 f8291a = new I.Y0(M.f8199m);

    /* renamed from: b, reason: collision with root package name */
    public static final I.Y0 f8292b = new I.Y0(M.f8200n);

    /* renamed from: c, reason: collision with root package name */
    public static final I.Y0 f8293c = new I.Y0(M.f8201o);

    /* renamed from: d, reason: collision with root package name */
    public static final I.Y0 f8294d = new I.Y0(M.p);

    /* renamed from: e, reason: collision with root package name */
    public static final I.Y0 f8295e = new I.Y0(M.f8206u);

    /* renamed from: f, reason: collision with root package name */
    public static final I.Y0 f8296f = new I.Y0(M.f8202q);

    /* renamed from: g, reason: collision with root package name */
    public static final I.Y0 f8297g = new I.Y0(M.f8203r);

    /* renamed from: h, reason: collision with root package name */
    public static final I.Y0 f8298h = new I.Y0(M.f8205t);

    /* renamed from: i, reason: collision with root package name */
    public static final I.Y0 f8299i = new I.Y0(M.f8204s);

    /* renamed from: j, reason: collision with root package name */
    public static final I.Y0 f8300j = new I.Y0(M.f8207v);

    /* renamed from: k, reason: collision with root package name */
    public static final I.Y0 f8301k = new I.Y0(M.f8208w);

    /* renamed from: l, reason: collision with root package name */
    public static final I.Y0 f8302l = new I.Y0(M.f8209x);

    /* renamed from: m, reason: collision with root package name */
    public static final I.Y0 f8303m = new I.Y0(M.B);

    /* renamed from: n, reason: collision with root package name */
    public static final I.Y0 f8304n = new I.Y0(M.f8188A);

    /* renamed from: o, reason: collision with root package name */
    public static final I.Y0 f8305o = new I.Y0(M.C);
    public static final I.Y0 p = new I.Y0(M.D);

    /* renamed from: q, reason: collision with root package name */
    public static final I.Y0 f8306q = new I.Y0(M.f8189E);

    /* renamed from: r, reason: collision with root package name */
    public static final I.Y0 f8307r = new I.Y0(M.f8190F);

    /* renamed from: s, reason: collision with root package name */
    public static final I.Y0 f8308s = new I.Y0(M.f8210y);

    /* renamed from: t, reason: collision with root package name */
    public static final C0132z f8309t = new C0132z(I.X.f2228i, M.f8211z);

    public static final void a(t0.g0 g0Var, T t3, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(874662829);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0113p.f(g0Var) : c0113p.h(g0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? c0113p.f(t3) : c0113p.h(t3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            C0997t c0997t = (C0997t) g0Var;
            C0116q0 a3 = f8291a.a(c0997t.getAccessibilityManager());
            C0116q0 a4 = f8292b.a(c0997t.getAutofill());
            C0116q0 a5 = f8293c.a(c0997t.getAutofillTree());
            C0116q0 a6 = f8294d.a(c0997t.getClipboardManager());
            C0116q0 a7 = f8296f.a(c0997t.getDensity());
            C0116q0 a8 = f8297g.a(c0997t.getFocusOwner());
            C0116q0 a9 = f8298h.a(c0997t.getFontLoader());
            a9.f2338f = false;
            C0116q0 a10 = f8299i.a(c0997t.getFontFamilyResolver());
            a10.f2338f = false;
            C0089d.b(new C0116q0[]{a3, a4, a5, a6, a7, a8, a9, a10, f8300j.a(c0997t.getHapticFeedBack()), f8301k.a(c0997t.getInputModeManager()), f8302l.a(c0997t.getLayoutDirection()), f8303m.a(c0997t.getTextInputService()), f8304n.a(c0997t.getSoftwareKeyboardController()), f8305o.a(c0997t.getTextToolbar()), p.a(t3), f8306q.a(c0997t.getViewConfiguration()), f8307r.a(c0997t.getWindowInfo()), f8308s.a(c0997t.getPointerIconService()), f8295e.a(c0997t.getGraphicsContext())}, aVar, c0113p, ((i4 >> 3) & 112) | 8);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(g0Var, t3, aVar, i3, 6);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
