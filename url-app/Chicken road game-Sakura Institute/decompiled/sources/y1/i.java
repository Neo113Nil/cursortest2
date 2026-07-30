package y1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import s1.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f9832f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f9833g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9834h;

    public final boolean a(s sVar) {
        return this.f9832f.containsKey(sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r6.k.a(this.f9832f, iVar.f9832f) && this.f9833g == iVar.f9833g && this.f9834h == iVar.f9834h;
    }

    public final Object g(s sVar) {
        Object obj = this.f9832f.get(sVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + sVar + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9834h) + a0.m.e(this.f9832f.hashCode() * 31, 31, this.f9833g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9832f.entrySet().iterator();
    }

    public final void m(s sVar, Object obj) {
        boolean z8 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f9832f;
        if (!z8 || !linkedHashMap.containsKey(sVar)) {
            linkedHashMap.put(sVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(sVar);
        r6.k.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.f9793a;
        if (str == null) {
            str = aVar.f9793a;
        }
        d6.e eVar = aVar2.f9794b;
        if (eVar == null) {
            eVar = aVar.f9794b;
        }
        linkedHashMap.put(sVar, new a(str, eVar));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f9833g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f9834h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f9832f.entrySet()) {
            s sVar = (s) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(sVar.f9887a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return j0.z(this) + "{ " + ((Object) sb) + " }";
    }
}
