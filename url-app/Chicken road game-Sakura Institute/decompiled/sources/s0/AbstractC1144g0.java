package s0;

import A.C0005a;
import G.C0192d;
import G.C0216p;
import G.C0219q0;
import G.C0222s0;
import G.C0235z;

/* renamed from: s0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1144g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final G.Y0 f10213a = new G.Y0(C1126L.f10085o);

    /* renamed from: b, reason: collision with root package name */
    public static final G.Y0 f10214b = new G.Y0(C1126L.f10086p);

    /* renamed from: c, reason: collision with root package name */
    public static final G.Y0 f10215c = new G.Y0(C1126L.f10087q);

    /* renamed from: d, reason: collision with root package name */
    public static final G.Y0 f10216d = new G.Y0(C1126L.f10088r);

    /* renamed from: e, reason: collision with root package name */
    public static final G.Y0 f10217e = new G.Y0(C1126L.f10093w);

    /* renamed from: f, reason: collision with root package name */
    public static final G.Y0 f10218f = new G.Y0(C1126L.f10089s);

    /* renamed from: g, reason: collision with root package name */
    public static final G.Y0 f10219g = new G.Y0(C1126L.f10090t);

    /* renamed from: h, reason: collision with root package name */
    public static final G.Y0 f10220h = new G.Y0(C1126L.f10092v);

    /* renamed from: i, reason: collision with root package name */
    public static final G.Y0 f10221i = new G.Y0(C1126L.f10091u);

    /* renamed from: j, reason: collision with root package name */
    public static final G.Y0 f10222j = new G.Y0(C1126L.f10094x);

    /* renamed from: k, reason: collision with root package name */
    public static final G.Y0 f10223k = new G.Y0(C1126L.f10095y);

    /* renamed from: l, reason: collision with root package name */
    public static final G.Y0 f10224l = new G.Y0(C1126L.f10096z);

    /* renamed from: m, reason: collision with root package name */
    public static final G.Y0 f10225m = new G.Y0(C1126L.f10071D);

    /* renamed from: n, reason: collision with root package name */
    public static final G.Y0 f10226n = new G.Y0(C1126L.f10070C);

    /* renamed from: o, reason: collision with root package name */
    public static final G.Y0 f10227o = new G.Y0(C1126L.f10072E);

    /* renamed from: p, reason: collision with root package name */
    public static final G.Y0 f10228p = new G.Y0(C1126L.f10073F);

    /* renamed from: q, reason: collision with root package name */
    public static final G.Y0 f10229q = new G.Y0(C1126L.f10074G);

    /* renamed from: r, reason: collision with root package name */
    public static final G.Y0 f10230r = new G.Y0(C1126L.f10075H);

    /* renamed from: s, reason: collision with root package name */
    public static final G.Y0 f10231s = new G.Y0(C1126L.f10069A);

    /* renamed from: t, reason: collision with root package name */
    public static final C0235z f10232t = new C0235z(G.W.f2779l, C1126L.B);

    public static final void a(r0.g0 g0Var, X x2, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(874662829);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(g0Var) : c0216p.h(g0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? c0216p.f(x2) : c0216p.h(x2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            C1166s c1166s = (C1166s) g0Var;
            C0219q0 a4 = f10213a.a(c1166s.getAccessibilityManager());
            C0219q0 a5 = f10214b.a(c1166s.getAutofill());
            C0219q0 a6 = f10215c.a(c1166s.getAutofillTree());
            C0219q0 a7 = f10216d.a(c1166s.getClipboardManager());
            C0219q0 a8 = f10218f.a(c1166s.getDensity());
            C0219q0 a9 = f10219g.a(c1166s.getFocusOwner());
            C0219q0 a10 = f10220h.a(c1166s.getFontLoader());
            a10.f2894f = false;
            C0219q0 a11 = f10221i.a(c1166s.getFontFamilyResolver());
            a11.f2894f = false;
            C0192d.b(new C0219q0[]{a4, a5, a6, a7, a8, a9, a10, a11, f10222j.a(c1166s.getHapticFeedBack()), f10223k.a(c1166s.getInputModeManager()), f10224l.a(c1166s.getLayoutDirection()), f10225m.a(c1166s.getTextInputService()), f10226n.a(c1166s.getSoftwareKeyboardController()), f10227o.a(c1166s.getTextToolbar()), f10228p.a(x2), f10229q.a(c1166s.getViewConfiguration()), f10230r.a(c1166s.getWindowInfo()), f10231s.a(c1166s.getPointerIconService()), f10217e.a(c1166s.getGraphicsContext())}, aVar, c0216p, ((i4 >> 3) & 112) | 8);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(g0Var, x2, aVar, i2, 7);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
