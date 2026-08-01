package r4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import n4.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends n4.e {

    /* renamed from: q, reason: collision with root package name */
    public final c0 f8145q;

    public a(Class cls) {
        super(true);
        this.f8145q = new c0(cls);
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // n4.f0
    public final String b() {
        return "List<" + this.f8145q.f7038r.getName() + "}>";
    }

    @Override // n4.f0
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        c0 c0Var = this.f8145q;
        return list != null ? CollectionsKt.G(list, x.c(c0Var.d(str))) : x.c(c0Var.d(str));
    }

    @Override // n4.f0
    public final Object d(String str) {
        return x.c(this.f8145q.d(str));
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.a(this.f8145q, ((a) obj).f8145q);
    }

    @Override // n4.f0
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return Intrinsics.a(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
    }

    @Override // n4.e
    public final Object h() {
        return j0.f5574d;
    }

    public final int hashCode() {
        return this.f8145q.f7041q.hashCode();
    }

    @Override // n4.e
    public final List i(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return j0.f5574d;
        }
        ArrayList arrayList = new ArrayList(z.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }
}
