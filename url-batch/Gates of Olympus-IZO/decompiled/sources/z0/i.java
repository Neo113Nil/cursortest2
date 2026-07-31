package z0;

import H2.AbstractC0080b;
import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u0.L;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8982d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8983e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8984f;

    public final boolean b(t tVar) {
        return this.f8982d.containsKey(tVar);
    }

    public final Object c(t tVar) {
        Object obj = this.f8982d.get(tVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + tVar + " - consider getOrElse or getOrNull");
    }

    public final void d(t tVar, Object obj) {
        boolean z3 = obj instanceof C1076a;
        LinkedHashMap linkedHashMap = this.f8982d;
        if (!z3 || !linkedHashMap.containsKey(tVar)) {
            linkedHashMap.put(tVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(tVar);
        Z1.i.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C1076a c1076a = (C1076a) obj2;
        C1076a c1076a2 = (C1076a) obj;
        String str = c1076a2.f8942a;
        if (str == null) {
            str = c1076a.f8942a;
        }
        L1.e eVar = c1076a2.f8943b;
        if (eVar == null) {
            eVar = c1076a.f8943b;
        }
        linkedHashMap.put(tVar, new C1076a(str, eVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Z1.i.a(this.f8982d, iVar.f8982d) && this.f8983e == iVar.f8983e && this.f8984f == iVar.f8984f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8984f) + AbstractC0080b.f(this.f8982d.hashCode() * 31, 31, this.f8983e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8982d.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f8983e) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f8984f) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f8982d.entrySet()) {
            t tVar = (t) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(tVar.f9037a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return L.v(this) + "{ " + ((Object) sb) + " }";
    }
}
