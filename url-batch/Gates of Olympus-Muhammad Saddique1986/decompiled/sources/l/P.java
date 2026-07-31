package l;

import a.AbstractC0235a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final I f6468a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6469b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6470c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6471d;

    public P(I i3, v vVar, AbstractC0235a abstractC0235a, boolean z3, Map map) {
        this.f6468a = i3;
        this.f6469b = vVar;
        this.f6470c = z3;
        this.f6471d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return f2.j.a(this.f6468a, p3.f6468a) && f2.j.a(null, null) && f2.j.a(this.f6469b, p3.f6469b) && f2.j.a(null, null) && this.f6470c == p3.f6470c && f2.j.a(this.f6471d, p3.f6471d);
    }

    public final int hashCode() {
        I i3 = this.f6468a;
        int hashCode = (i3 == null ? 0 : i3.hashCode()) * 961;
        v vVar = this.f6469b;
        return this.f6471d.hashCode() + A.k.e((((hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31) + 0) * 31, 31, this.f6470c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f6468a + ", slide=null, changeSize=" + this.f6469b + ", scale=" + ((Object) null) + ", hold=" + this.f6470c + ", effectsMap=" + this.f6471d + ')';
    }

    public /* synthetic */ P(I i3, v vVar, AbstractC0235a abstractC0235a, boolean z3, LinkedHashMap linkedHashMap, int i4) {
        this((i4 & 1) != 0 ? null : i3, (i4 & 4) != 0 ? null : vVar, (i4 & 8) == 0 ? abstractC0235a : null, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? S1.v.f4321d : linkedHashMap);
    }
}
