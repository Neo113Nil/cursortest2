package t3;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f8803b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8804a = new LinkedHashMap();

    public final void a(g0 g0Var) {
        r6.k.f(g0Var, "navigator");
        String H = a8.d.H(g0Var.getClass());
        if (H.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f8804a;
        g0 g0Var2 = (g0) linkedHashMap.get(H);
        if (r6.k.a(g0Var2, g0Var)) {
            return;
        }
        if (g0Var2 != null && g0Var2.f8790b) {
            throw new IllegalStateException(("Navigator " + g0Var + " is replacing an already attached " + g0Var2).toString());
        }
        if (!g0Var.f8790b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + g0Var + " is already attached to another NavController").toString());
    }

    public final g0 b(String str) {
        r6.k.f(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        g0 g0Var = (g0) this.f8804a.get(str);
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException(a0.m.j("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
