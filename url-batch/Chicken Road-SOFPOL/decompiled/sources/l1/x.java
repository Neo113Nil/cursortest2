package l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends z implements Iterable, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final List f4825d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4826e;

    public x(List list, ArrayList arrayList) {
        this.f4825d = list;
        this.f4826e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return q6.i.a(this.f4825d, xVar.f4825d) && this.f4826e.equals(xVar.f4826e);
    }

    public final int hashCode() {
        return this.f4826e.hashCode() + ((this.f4825d.hashCode() + a0.q.a(0.0f, a0.q.a(0.0f, a0.q.a(1.0f, a0.q.a(1.0f, a0.q.a(0.0f, a0.q.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w(this);
    }
}
