package k;

import A.AbstractC0017m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z2.C1412P;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C0732H f7268a;

    /* renamed from: b, reason: collision with root package name */
    public final t f7269b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7270c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7271d;

    public O(C0732H c0732h, t tVar, u3.d dVar, boolean z4, Map map) {
        this.f7268a = c0732h;
        this.f7269b = tVar;
        this.f7270c = z4;
        this.f7271d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o4 = (O) obj;
        return Intrinsics.a(this.f7268a, o4.f7268a) && Intrinsics.a(null, null) && Intrinsics.a(this.f7269b, o4.f7269b) && Intrinsics.a(null, null) && this.f7270c == o4.f7270c && Intrinsics.a(this.f7271d, o4.f7271d);
    }

    public final int hashCode() {
        C0732H c0732h = this.f7268a;
        int hashCode = (c0732h == null ? 0 : c0732h.hashCode()) * 961;
        t tVar = this.f7269b;
        return this.f7271d.hashCode() + AbstractC0017m.d((((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31) + 0) * 31, 31, this.f7270c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f7268a + ", slide=null, changeSize=" + this.f7269b + ", scale=" + ((Object) null) + ", hold=" + this.f7270c + ", effectsMap=" + this.f7271d + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    public /* synthetic */ O(C0732H c0732h, t tVar, u3.d dVar, boolean z4, LinkedHashMap linkedHashMap, int i2) {
        this((i2 & 1) != 0 ? null : c0732h, (i2 & 4) != 0 ? null : tVar, (i2 & 8) == 0 ? dVar : null, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? C1412P.c() : linkedHashMap);
    }
}
