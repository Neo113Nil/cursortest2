package u0;

import B.C0000a;
import I.C0143d;
import I.C0167p;
import I.C0170q0;
import I.C0173s0;
import I.C0186z;

/* renamed from: u0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1101g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.X0 f9349a = new I.X0(M.f9220m);

    /* renamed from: b, reason: collision with root package name */
    public static final I.X0 f9350b = new I.X0(M.f9221n);

    /* renamed from: c, reason: collision with root package name */
    public static final I.X0 f9351c = new I.X0(M.f9222o);

    /* renamed from: d, reason: collision with root package name */
    public static final I.X0 f9352d = new I.X0(M.f9223p);

    /* renamed from: e, reason: collision with root package name */
    public static final I.X0 f9353e = new I.X0(M.f9228u);

    /* renamed from: f, reason: collision with root package name */
    public static final I.X0 f9354f = new I.X0(M.f9224q);

    /* renamed from: g, reason: collision with root package name */
    public static final I.X0 f9355g = new I.X0(M.f9225r);

    /* renamed from: h, reason: collision with root package name */
    public static final I.X0 f9356h = new I.X0(M.f9227t);

    /* renamed from: i, reason: collision with root package name */
    public static final I.X0 f9357i = new I.X0(M.f9226s);

    /* renamed from: j, reason: collision with root package name */
    public static final I.X0 f9358j = new I.X0(M.f9229v);

    /* renamed from: k, reason: collision with root package name */
    public static final I.X0 f9359k = new I.X0(M.f9230w);

    /* renamed from: l, reason: collision with root package name */
    public static final I.X0 f9360l = new I.X0(M.f9231x);

    /* renamed from: m, reason: collision with root package name */
    public static final I.X0 f9361m = new I.X0(M.f9208B);

    /* renamed from: n, reason: collision with root package name */
    public static final I.X0 f9362n = new I.X0(M.f9207A);

    /* renamed from: o, reason: collision with root package name */
    public static final I.X0 f9363o = new I.X0(M.C);

    /* renamed from: p, reason: collision with root package name */
    public static final I.X0 f9364p = new I.X0(M.D);

    /* renamed from: q, reason: collision with root package name */
    public static final I.X0 f9365q = new I.X0(M.f9209E);

    /* renamed from: r, reason: collision with root package name */
    public static final I.X0 f9366r = new I.X0(M.f9210F);

    /* renamed from: s, reason: collision with root package name */
    public static final I.X0 f9367s = new I.X0(M.f9232y);

    /* renamed from: t, reason: collision with root package name */
    public static final C0186z f9368t = new C0186z(I.W.f2783i, M.f9233z);

    public static final void a(t0.h0 h0Var, X x3, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(874662829);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0167p.f(h0Var) : c0167p.h(h0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? c0167p.f(x3) : c0167p.h(x3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            C1123s c1123s = (C1123s) h0Var;
            C0170q0 a3 = f9349a.a(c1123s.getAccessibilityManager());
            C0170q0 a4 = f9350b.a(c1123s.getAutofill());
            C0170q0 a5 = f9351c.a(c1123s.getAutofillTree());
            C0170q0 a6 = f9352d.a(c1123s.getClipboardManager());
            C0170q0 a7 = f9354f.a(c1123s.getDensity());
            C0170q0 a8 = f9355g.a(c1123s.getFocusOwner());
            C0170q0 a9 = f9356h.a(c1123s.getFontLoader());
            a9.f2897f = false;
            C0170q0 a10 = f9357i.a(c1123s.getFontFamilyResolver());
            a10.f2897f = false;
            C0143d.b(new C0170q0[]{a3, a4, a5, a6, a7, a8, a9, a10, f9358j.a(c1123s.getHapticFeedBack()), f9359k.a(c1123s.getInputModeManager()), f9360l.a(c1123s.getLayoutDirection()), f9361m.a(c1123s.getTextInputService()), f9362n.a(c1123s.getSoftwareKeyboardController()), f9363o.a(c1123s.getTextToolbar()), f9364p.a(x3), f9365q.a(c1123s.getViewConfiguration()), f9366r.a(c1123s.getWindowInfo()), f9367s.a(c1123s.getPointerIconService()), f9353e.a(c1123s.getGraphicsContext())}, aVar, c0167p, ((i4 >> 3) & 112) | 8);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(h0Var, x3, aVar, i3, 7);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
