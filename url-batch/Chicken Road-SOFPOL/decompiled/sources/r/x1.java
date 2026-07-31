package r;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f6455a;

    static {
        Float valueOf = Float.valueOf(0.5f);
        r1 r1Var = d.f6263k;
        Float valueOf2 = Float.valueOf(1.0f);
        c6.f fVar = new c6.f(r1Var, valueOf2);
        c6.f fVar2 = new c6.f(d.f6269q, valueOf2);
        c6.f fVar3 = new c6.f(d.f6268p, valueOf2);
        c6.f fVar4 = new c6.f(d.f6262j, Float.valueOf(0.01f));
        c6.f fVar5 = new c6.f(d.f6270r, valueOf);
        c6.f fVar6 = new c6.f(d.f6266n, valueOf);
        c6.f fVar7 = new c6.f(d.f6267o, valueOf);
        r1 r1Var2 = d.f6264l;
        Float valueOf3 = Float.valueOf(0.1f);
        c6.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, new c6.f(r1Var2, valueOf3), new c6.f(d.f6265m, valueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(d6.y.F(9));
        for (c6.f fVar8 : fVarArr) {
            linkedHashMap.put(fVar8.f1747d, fVar8.f1748e);
        }
        f6455a = linkedHashMap;
    }
}
