package k;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f5223b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f5224c;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f5225a;

    static {
        LinkedHashMap linkedHashMap = null;
        j0 j0Var = null;
        t tVar = null;
        a8.m mVar = null;
        f5223b = new i0(new q0(j0Var, tVar, mVar, linkedHashMap, 63));
        f5224c = new i0(new q0(j0Var, tVar, mVar, linkedHashMap, 47));
    }

    public i0(q0 q0Var) {
        this.f5225a = q0Var;
    }

    public final i0 a(i0 i0Var) {
        q0 q0Var = i0Var.f5225a;
        j0 j0Var = q0Var.f5257a;
        q0 q0Var2 = this.f5225a;
        if (j0Var == null) {
            j0Var = q0Var2.f5257a;
        }
        t tVar = q0Var.f5258b;
        if (tVar == null) {
            tVar = q0Var2.f5258b;
        }
        boolean z8 = q0Var.f5259c || q0Var2.f5259c;
        Map map = q0Var2.f5260d;
        Map map2 = q0Var.f5260d;
        r6.k.f(map, "<this>");
        r6.k.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new i0(new q0(j0Var, tVar, (a8.m) null, z8, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && r6.k.a(((i0) obj).f5225a, this.f5225a);
    }

    public final int hashCode() {
        return this.f5225a.hashCode();
    }

    public final String toString() {
        if (equals(f5223b)) {
            return "ExitTransition.None";
        }
        if (equals(f5224c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        q0 q0Var = this.f5225a;
        j0 j0Var = q0Var.f5257a;
        sb.append(j0Var != null ? j0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        t tVar = q0Var.f5258b;
        sb.append(tVar != null ? tVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(q0Var.f5259c);
        return sb.toString();
    }
}
