package k;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f5257a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5259c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f5260d;

    public q0(j0 j0Var, t tVar, a8.m mVar, boolean z8, Map map) {
        this.f5257a = j0Var;
        this.f5258b = tVar;
        this.f5259c = z8;
        this.f5260d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return r6.k.a(this.f5257a, q0Var.f5257a) && r6.k.a(this.f5258b, q0Var.f5258b) && r6.k.a(null, null) && this.f5259c == q0Var.f5259c && r6.k.a(this.f5260d, q0Var.f5260d);
    }

    public final int hashCode() {
        j0 j0Var = this.f5257a;
        int hashCode = (j0Var == null ? 0 : j0Var.hashCode()) * 961;
        t tVar = this.f5258b;
        return this.f5260d.hashCode() + a0.m.e((((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31) + 0) * 31, 31, this.f5259c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f5257a + ", slide=null, changeSize=" + this.f5258b + ", scale=" + ((Object) null) + ", hold=" + this.f5259c + ", effectsMap=" + this.f5260d + ')';
    }

    public /* synthetic */ q0(j0 j0Var, t tVar, a8.m mVar, LinkedHashMap linkedHashMap, int i7) {
        this((i7 & 1) != 0 ? null : j0Var, (i7 & 4) != 0 ? null : tVar, (i7 & 8) != 0 ? null : mVar, (i7 & 16) == 0, (i7 & 32) != 0 ? e6.v.f2827f : linkedHashMap);
    }
}
