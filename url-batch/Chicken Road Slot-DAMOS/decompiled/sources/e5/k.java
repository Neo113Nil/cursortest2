package e5;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f3920a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3921b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f3922c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3923d;

    public k(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.f3920a = str;
        this.f3921b = map;
        this.f3922c = abstractSet;
        this.f3923d = abstractSet2;
    }

    public static final k a(k5.d dVar, String str) {
        return w.H(new l5.a(dVar), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f3920a.equals(kVar.f3920a) || !this.f3921b.equals(kVar.f3921b) || !Intrinsics.a(this.f3922c, kVar.f3922c)) {
            return false;
        }
        Set set2 = this.f3923d;
        if (set2 == null || (set = kVar.f3923d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f3922c.hashCode() + ((this.f3921b.hashCode() + (this.f3920a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        Collection collection;
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f3920a);
        sb2.append("',\n            |    columns = {");
        sb2.append(a.a.u(CollectionsKt.L(this.f3921b.values(), new g(2))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(a.a.u(this.f3922c));
        sb2.append("\n            |    indices = {");
        Set set = this.f3923d;
        if (set == null || (collection = CollectionsKt.L(set, new g(3))) == null) {
            collection = j0.f5574d;
        }
        sb2.append(a.a.u(collection));
        sb2.append("\n            |}\n        ");
        return kotlin.text.i.d(sb2.toString());
    }
}
