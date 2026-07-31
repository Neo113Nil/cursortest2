package m;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f5567a;

    static {
        Float valueOf = Float.valueOf(0.5f);
        y0 y0Var = z0.f5886b;
        Float valueOf2 = Float.valueOf(1.0f);
        L1.j[] jVarArr = {new L1.j(y0Var, valueOf2), new L1.j(z0.f5892h, valueOf2), new L1.j(z0.f5891g, valueOf2), new L1.j(z0.f5885a, Float.valueOf(0.01f)), new L1.j(z0.f5893i, valueOf), new L1.j(z0.f5889e, valueOf), new L1.j(z0.f5890f, valueOf), new L1.j(z0.f5887c, Float.valueOf(0.1f)), new L1.j(z0.f5888d, Float.valueOf(0.1f))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(M1.B.I(9));
        M1.B.K(linkedHashMap, jVarArr);
        f5567a = linkedHashMap;
    }
}
