package A0;

import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u0.L;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f129d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f130e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f131f;

    public final Object b(v vVar) {
        Object obj = this.f129d.get(vVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final void c(v vVar, Object obj) {
        boolean z3 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f129d;
        if (!z3 || !linkedHashMap.containsKey(vVar)) {
            linkedHashMap.put(vVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(vVar);
        f2.j.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.f88a;
        if (str == null) {
            str = aVar.f88a;
        }
        R1.e eVar = aVar2.f89b;
        if (eVar == null) {
            eVar = aVar.f89b;
        }
        linkedHashMap.put(vVar, new a(str, eVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return f2.j.a(this.f129d, iVar.f129d) && this.f130e == iVar.f130e && this.f131f == iVar.f131f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131f) + A.k.e(this.f129d.hashCode() * 31, 31, this.f130e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f129d.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f130e) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f131f) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f129d.entrySet()) {
            v vVar = (v) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(vVar.f194a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return L.z(this) + "{ " + ((Object) sb) + " }";
    }
}
