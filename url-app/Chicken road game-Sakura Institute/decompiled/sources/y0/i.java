package y0;

import A.AbstractC0017m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC1125K;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public final class i implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11576d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f11577e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11578i;

    public final boolean e(t tVar) {
        return this.f11576d.containsKey(tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f11576d, iVar.f11576d) && this.f11577e == iVar.f11577e && this.f11578i == iVar.f11578i;
    }

    public final Object h(t tVar) {
        Object obj = this.f11576d.get(tVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + tVar + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11578i) + AbstractC0017m.d(this.f11576d.hashCode() * 31, 31, this.f11577e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11576d.entrySet().iterator();
    }

    public final void s(t tVar, Object obj) {
        boolean z4 = obj instanceof C1317a;
        LinkedHashMap linkedHashMap = this.f11576d;
        if (!z4 || !linkedHashMap.containsKey(tVar)) {
            linkedHashMap.put(tVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(tVar);
        Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C1317a c1317a = (C1317a) obj2;
        C1317a c1317a2 = (C1317a) obj;
        String str = c1317a2.f11535a;
        if (str == null) {
            str = c1317a.f11535a;
        }
        InterfaceC1332g interfaceC1332g = c1317a2.f11536b;
        if (interfaceC1332g == null) {
            interfaceC1332g = c1317a.f11536b;
        }
        linkedHashMap.put(tVar, new C1317a(str, interfaceC1332g));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f11577e) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f11578i) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f11576d.entrySet()) {
            t tVar = (t) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(tVar.f11640a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return AbstractC1125K.o(this) + "{ " + ((Object) sb) + " }";
    }
}
