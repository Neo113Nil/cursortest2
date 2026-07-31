package q;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f5878b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f5879c;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f5880a;

    static {
        LinkedHashMap linkedHashMap = null;
        o0 o0Var = null;
        a0 a0Var = null;
        h0.a aVar = null;
        f5878b = new n0(new v0(o0Var, a0Var, aVar, linkedHashMap, 63));
        f5879c = new n0(new v0(o0Var, a0Var, aVar, linkedHashMap, 47));
    }

    public n0(v0 v0Var) {
        this.f5880a = v0Var;
    }

    public final n0 a(n0 n0Var) {
        v0 v0Var = n0Var.f5880a;
        o0 o0Var = v0Var.f5920a;
        v0 v0Var2 = this.f5880a;
        if (o0Var == null) {
            o0Var = v0Var2.f5920a;
        }
        a0 a0Var = v0Var.f5921b;
        if (a0Var == null) {
            a0Var = v0Var2.f5921b;
        }
        boolean z3 = v0Var.f5922c || v0Var2.f5922c;
        Map map = v0Var2.f5923d;
        Map map2 = v0Var.f5923d;
        q6.i.e(map, "<this>");
        q6.i.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new n0(new v0(o0Var, a0Var, (h0.a) null, z3, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && q6.i.a(((n0) obj).f5880a, this.f5880a);
    }

    public final int hashCode() {
        return this.f5880a.hashCode();
    }

    public final String toString() {
        if (equals(f5878b)) {
            return "ExitTransition.None";
        }
        if (equals(f5879c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        v0 v0Var = this.f5880a;
        o0 o0Var = v0Var.f5920a;
        sb.append(o0Var != null ? o0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        a0 a0Var = v0Var.f5921b;
        sb.append(a0Var != null ? a0Var.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(v0Var.f5922c);
        return sb.toString();
    }
}
