package q;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f5873b = new m0(new v0((o0) null, (a0) null, (h0.a) null, (LinkedHashMap) null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final v0 f5874a;

    public m0(v0 v0Var) {
        this.f5874a = v0Var;
    }

    public final m0 a(m0 m0Var) {
        v0 v0Var = m0Var.f5874a;
        o0 o0Var = v0Var.f5920a;
        v0 v0Var2 = this.f5874a;
        if (o0Var == null) {
            o0Var = v0Var2.f5920a;
        }
        a0 a0Var = v0Var.f5921b;
        if (a0Var == null) {
            a0Var = v0Var2.f5921b;
        }
        Map map = v0Var2.f5923d;
        Map map2 = v0Var.f5923d;
        q6.i.e(map, "<this>");
        q6.i.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new m0(new v0(o0Var, a0Var, (h0.a) null, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && q6.i.a(((m0) obj).f5874a, this.f5874a);
    }

    public final int hashCode() {
        return this.f5874a.hashCode();
    }

    public final String toString() {
        if (equals(f5873b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        v0 v0Var = this.f5874a;
        o0 o0Var = v0Var.f5920a;
        sb.append(o0Var != null ? o0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        a0 a0Var = v0Var.f5921b;
        sb.append(a0Var != null ? a0Var.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
