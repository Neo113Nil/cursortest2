package e5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3917b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3918c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3919d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public j(String str, boolean z10, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f3916a = str;
        this.f3917b = z10;
        this.f3918c = list;
        this.f3919d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                list2.add("ASC");
            }
        }
        this.f3919d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = jVar.f3916a;
        if (this.f3917b != jVar.f3917b || !Intrinsics.a(this.f3918c, jVar.f3918c) || !Intrinsics.a(this.f3919d, jVar.f3919d)) {
            return false;
        }
        String str2 = this.f3916a;
        return o.h(str2, "index_") ? o.h(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f3916a;
        return this.f3919d.hashCode() + ((this.f3918c.hashCode() + ((((o.h(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f3917b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return kotlin.text.i.b(kotlin.text.i.d("\n            |Index {\n            |   name = '" + this.f3916a + "',\n            |   unique = '" + this.f3917b + "',\n            |   columns = {" + a.a.P(this.f3918c) + "\n            |   orders = {" + a.a.O(this.f3919d) + "\n            |}\n        "));
    }
}
