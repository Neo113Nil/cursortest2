package m;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6914a;

    static {
        Float valueOf = Float.valueOf(0.5f);
        u0 u0Var = v0.f6900b;
        Float valueOf2 = Float.valueOf(1.0f);
        R1.i[] iVarArr = {new R1.i(u0Var, valueOf2), new R1.i(v0.f6906h, valueOf2), new R1.i(v0.f6905g, valueOf2), new R1.i(v0.f6899a, Float.valueOf(0.01f)), new R1.i(v0.f6907i, valueOf), new R1.i(v0.f6903e, valueOf), new R1.i(v0.f6904f, valueOf), new R1.i(v0.f6901c, Float.valueOf(0.1f)), new R1.i(v0.f6902d, Float.valueOf(0.1f))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(S1.B.J(9));
        S1.B.K(linkedHashMap, iVarArr);
        f6914a = linkedHashMap;
    }
}
