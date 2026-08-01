package gf;

import ce.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f4425a;

    /* renamed from: b, reason: collision with root package name */
    public int f4426b;

    public a(int i3, ArrayList arrayList) {
        this.f4425a = (i3 & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(b bVar) {
        Object obj;
        bVar.getClass();
        List list = this.f4425a;
        if (list.isEmpty()) {
            return null;
        }
        int i3 = this.f4426b;
        List list2 = this.f4425a;
        Object obj2 = list2.get(i3);
        if (!((h) bVar).d(obj2)) {
            obj2 = null;
        }
        Object obj3 = obj2 != null ? obj2 : null;
        if (obj3 != null && this.f4426b < y.e(list2)) {
            this.f4426b++;
        }
        if (obj3 != null) {
            return obj3;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((h) bVar).d(obj)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.a(this.f4425a, ((a) obj).f4425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4425a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + CollectionsKt.Q(this.f4425a);
    }
}
