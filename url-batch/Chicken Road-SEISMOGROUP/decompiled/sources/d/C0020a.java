package d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020a implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f519b = new WeakHashMap();

    public C0020a() {
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0020a)) {
            return false;
        }
        C0020a c0020a = (C0020a) obj;
        c0020a.getClass();
        iterator();
        c0020a.iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0021b c0021b = new C0021b(18);
        this.f519b.put(c0021b, Boolean.FALSE);
        return c0021b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
