package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class yl {
    public static final ke1 a = new ke1(p2.p);
    public static final ke1 b = new ke1(p2.q);
    public static final ke1 c = new ke1(p2.s);
    public static final ke1 d = new ke1(p2.r);
    public static final ke1 e = new ke1(p2.u);
    public static final ke1 f = new ke1(p2.t);
    public static final ke1 g = new ke1(p2.A);
    public static final ke1 h = new ke1(p2.w);
    public static final ke1 i = new ke1(p2.x);
    public static final ke1 j = new ke1(p2.z);
    public static final ke1 k = new ke1(p2.y);
    public static final ke1 l = new ke1(p2.B);
    public static final ke1 m = new ke1(p2.C);
    public static final ke1 n = new ke1(p2.D);
    public static final ke1 o = new ke1(p2.H);
    public static final ke1 p = new ke1(p2.G);
    public static final ke1 q = new ke1(p2.I);
    public static final ke1 r = new ke1(xl.e);
    public static final ke1 s = new ke1(xl.g);
    public static final ke1 t = new ke1(xl.h);
    public static final ke1 u = new ke1(p2.E);
    public static final zl v = new zl(p2.F);

    static {
        ee0.b(p2.v);
    }

    public static final void a(eu0 eu0Var, s6 s6Var, Function2 function2, hl hlVar, int i2) {
        hlVar.Y(1925803616);
        int i3 = i2 | (hlVar.f(eu0Var) ? 4 : 2) | (hlVar.f(s6Var) ? 32 : 16) | (hlVar.h(function2) ? 256 : 128);
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            d4 d4Var = (d4) eu0Var;
            n01 a2 = a.a(d4Var.m9getAccessibilityManager());
            n01 a3 = b.a(d4Var.getAutofill());
            n01 a4 = d.a(d4Var.getAutofillManager());
            n01 a5 = c.a(d4Var.getAutofillTree());
            n01 a6 = e.a(d4Var.getClipboardManager());
            n01 a7 = f.a(d4Var.getClipboard());
            n01 a8 = h.a(d4Var.getDensity());
            n01 a9 = i.a(d4Var.getFocusOwner());
            n01 a10 = j.a(d4Var.getFontLoader());
            a10.f = false;
            n01 a11 = k.a(d4Var.getFontFamilyResolver());
            a11.f = false;
            op.b(new n01[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(d4Var.getHapticFeedBack()), m.a(d4Var.getInputModeManager()), n.a(d4Var.getLayoutDirection()), o.a(d4Var.getTextInputService()), p.a(d4Var.getSoftwareKeyboardController()), q.a(d4Var.getTextToolbar()), r.a(s6Var), s.a(d4Var.getViewConfiguration()), t.a(d4Var.getWindowInfo()), u.a(d4Var.getPointerIconService()), g.a(d4Var.getGraphicsContext()), ii0.a.a(d4Var.getRetainedValuesStore())}, function2, hlVar, ((i3 >> 3) & 112) | 8);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new q4(eu0Var, s6Var, function2, i2, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
