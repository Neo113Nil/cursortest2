package c4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes.dex */
final class n1 extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f2049a;

    public n1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f2049a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == n1.class) {
            if (this == obj) {
                return true;
            }
            n1 n1Var = (n1) obj;
            if (this.f2049a == n1Var.f2049a && get() == n1Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2049a;
    }
}
