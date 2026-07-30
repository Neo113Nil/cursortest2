package k;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f5221b = new h0(new q0((j0) null, (t) null, (a8.m) null, (LinkedHashMap) null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final q0 f5222a;

    public h0(q0 q0Var) {
        this.f5222a = q0Var;
    }

    public final h0 a(h0 h0Var) {
        q0 q0Var = h0Var.f5222a;
        j0 j0Var = q0Var.f5257a;
        q0 q0Var2 = this.f5222a;
        if (j0Var == null) {
            j0Var = q0Var2.f5257a;
        }
        t tVar = q0Var.f5258b;
        if (tVar == null) {
            tVar = q0Var2.f5258b;
        }
        Map map = q0Var2.f5260d;
        Map map2 = q0Var.f5260d;
        r6.k.f(map, "<this>");
        r6.k.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new h0(new q0(j0Var, tVar, (a8.m) null, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && r6.k.a(((h0) obj).f5222a, this.f5222a);
    }

    public final int hashCode() {
        return this.f5222a.hashCode();
    }

    public final String toString() {
        if (equals(f5221b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        q0 q0Var = this.f5222a;
        j0 j0Var = q0Var.f5257a;
        sb.append(j0Var != null ? j0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        t tVar = q0Var.f5258b;
        sb.append(tVar != null ? tVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
