package l;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5498a;

    static {
        Float valueOf = Float.valueOf(0.5f);
        w1 w1Var = x1.f5723b;
        Float valueOf2 = Float.valueOf(1.0f);
        d6.j jVar = new d6.j(w1Var, valueOf2);
        d6.j jVar2 = new d6.j(x1.f5729h, valueOf2);
        d6.j jVar3 = new d6.j(x1.f5728g, valueOf2);
        d6.j jVar4 = new d6.j(x1.f5722a, Float.valueOf(0.01f));
        d6.j jVar5 = new d6.j(x1.f5730i, valueOf);
        d6.j jVar6 = new d6.j(x1.f5726e, valueOf);
        d6.j jVar7 = new d6.j(x1.f5727f, valueOf);
        w1 w1Var2 = x1.f5724c;
        Float valueOf3 = Float.valueOf(0.1f);
        d6.j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, new d6.j(w1Var2, valueOf3), new d6.j(x1.f5725d, valueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(e6.d0.h0(9));
        e6.c0.j0(linkedHashMap, jVarArr);
        f5498a = linkedHashMap;
    }
}
