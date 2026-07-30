package N4;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f1835a;

    public c(Object obj, d dVar) {
        super(obj, dVar);
        this.f1835a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof c ? ((c) obj).get() == get() : obj.equals(this);
    }

    public final int hashCode() {
        return this.f1835a;
    }

    public final String toString() {
        return String.valueOf(get());
    }
}
