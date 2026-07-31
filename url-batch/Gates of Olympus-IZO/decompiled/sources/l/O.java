package l;

import H2.AbstractC0080b;
import e2.AbstractC0381e;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final H f5448a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5449b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f5450c;

    public O(H h3, AbstractC0381e abstractC0381e, boolean z3, Map map) {
        this.f5448a = h3;
        this.f5449b = z3;
        this.f5450c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        return Z1.i.a(this.f5448a, o3.f5448a) && Z1.i.a(null, null) && Z1.i.a(null, null) && Z1.i.a(null, null) && this.f5449b == o3.f5449b && Z1.i.a(this.f5450c, o3.f5450c);
    }

    public final int hashCode() {
        H h3 = this.f5448a;
        return this.f5450c.hashCode() + AbstractC0080b.f((((h3 == null ? 0 : h3.hashCode()) * 29791) + 0) * 31, 31, this.f5449b);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f5448a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", hold=" + this.f5449b + ", effectsMap=" + this.f5450c + ')';
    }

    public /* synthetic */ O(H h3, AbstractC0381e abstractC0381e, boolean z3, LinkedHashMap linkedHashMap, int i3) {
        this((i3 & 1) != 0 ? null : h3, (i3 & 8) != 0 ? null : abstractC0381e, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? M1.v.f2804d : linkedHashMap);
    }
}
