package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class p00 {
    public static final bp2 a = new bp2(k8.A);
    public static final bp2 b = new bp2(k8.B);
    public static final bp2 c = new bp2(k8.D);
    public static final bp2 d = new bp2(k8.C);
    public static final bp2 e = new bp2(k8.F);
    public static final bp2 f = new bp2(k8.E);
    public static final bp2 g = new bp2(k8.L);
    public static final bp2 h = new bp2(k8.H);
    public static final bp2 i = new bp2(k8.I);
    public static final bp2 j = new bp2(k8.K);
    public static final bp2 k = new bp2(k8.J);
    public static final bp2 l = new bp2(k8.M);
    public static final bp2 m = new bp2(k8.N);
    public static final bp2 n = new bp2(k8.O);
    public static final bp2 o = new bp2(o00.o);
    public static final bp2 p = new bp2(o00.n);
    public static final bp2 q = new bp2(o00.p);
    public static final bp2 r = new bp2(o00.q);
    public static final bp2 s = new bp2(o00.r);
    public static final bp2 t = new bp2(o00.s);
    public static final bp2 u = new bp2(k8.P);
    public static final r00 v = new r00(k8.Q);

    static {
        ya1.b(k8.G);
    }

    public static final void a(rx1 rx1Var, ac acVar, Function2 function2, a00 a00Var, int i2) {
        a00Var.Z(1925803616);
        int i3 = i2 | (a00Var.f(rx1Var) ? 4 : 2) | (a00Var.f(acVar) ? 32 : 16) | (a00Var.h(function2) ? 256 : 128);
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            t7 t7Var = (t7) rx1Var;
            ye a2 = a.a(t7Var.getAccessibilityManager());
            ye a3 = b.a(t7Var.getAutofill());
            ye a4 = d.a(t7Var.getAutofillManager());
            ye a5 = c.a(t7Var.getAutofillTree());
            ye a6 = e.a(t7Var.m18getClipboardManager());
            ye a7 = f.a(t7Var.m17getClipboard());
            ye a8 = h.a(t7Var.getDensity());
            ye a9 = i.a(t7Var.getFocusOwner());
            ye a10 = j.a(t7Var.getFontLoader());
            a10.e = false;
            ye a11 = k.a(t7Var.getFontFamilyResolver());
            a11.e = false;
            yk3.c(new ye[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(t7Var.getHapticFeedBack()), m.a(t7Var.getInputModeManager()), n.a(t7Var.getLayoutDirection()), o.a(t7Var.getTextInputService()), p.a(t7Var.getSoftwareKeyboardController()), q.a(t7Var.getTextToolbar()), r.a(acVar), s.a(t7Var.getViewConfiguration()), t.a(t7Var.getWindowInfo()), u.a(t7Var.getPointerIconService()), g.a(t7Var.getGraphicsContext())}, function2, a00Var, ((i3 >> 3) & 112) | 8);
        } else {
            a00Var.S();
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new m8(rx1Var, acVar, function2, i2, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
