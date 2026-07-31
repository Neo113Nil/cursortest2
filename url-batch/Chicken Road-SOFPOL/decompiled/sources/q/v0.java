package q;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f5921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5922c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f5923d;

    public v0(o0 o0Var, a0 a0Var, h0.a aVar, boolean z3, Map map) {
        this.f5920a = o0Var;
        this.f5921b = a0Var;
        this.f5922c = z3;
        this.f5923d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return q6.i.a(this.f5920a, v0Var.f5920a) && q6.i.a(this.f5921b, v0Var.f5921b) && q6.i.a(null, null) && this.f5922c == v0Var.f5922c && q6.i.a(this.f5923d, v0Var.f5923d);
    }

    public final int hashCode() {
        o0 o0Var = this.f5920a;
        int hashCode = (o0Var == null ? 0 : o0Var.hashCode()) * 961;
        a0 a0Var = this.f5921b;
        return this.f5923d.hashCode() + a0.q.d((((hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31) + 0) * 31, 31, this.f5922c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f5920a + ", slide=null, changeSize=" + this.f5921b + ", scale=" + ((Object) null) + ", hold=" + this.f5922c + ", effectsMap=" + this.f5923d + ')';
    }

    public /* synthetic */ v0(o0 o0Var, a0 a0Var, h0.a aVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : o0Var, (i & 4) != 0 ? null : a0Var, (i & 8) != 0 ? null : aVar, (i & 16) == 0, (i & 32) != 0 ? d6.v.f2327d : linkedHashMap);
    }
}
