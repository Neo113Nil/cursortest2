package u;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f9533a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9534b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f9535c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m0(j0 j0Var, r rVar, LinkedHashMap linkedHashMap, int i3) {
        this(j0Var, rVar, r0, r5);
        j0Var = (i3 & 1) != 0 ? null : j0Var;
        rVar = (i3 & 8) != 0 ? null : rVar;
        boolean z10 = (i3 & 32) == 0;
        Map map = linkedHashMap;
        if ((i3 & 64) != 0) {
            Map map2 = kotlin.collections.k0.f5575d;
            map2.getClass();
            map = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.a(this.f9533a, m0Var.f9533a) && Intrinsics.a(null, null) && this.f9534b == m0Var.f9534b && Intrinsics.a(this.f9535c, m0Var.f9535c);
    }

    public final int hashCode() {
        j0 j0Var = this.f9533a;
        return this.f9535c.hashCode() + n0.l.d((((j0Var == null ? 0 : j0Var.hashCode()) * 29791) + 0) * 961, 31, this.f9534b);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f9533a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", veil=null, hold=" + this.f9534b + ", effectsMap=" + this.f9535c + ')';
    }

    public m0(j0 j0Var, r rVar, boolean z10, Map map) {
        this.f9533a = j0Var;
        this.f9534b = z10;
        this.f9535c = map;
    }
}
