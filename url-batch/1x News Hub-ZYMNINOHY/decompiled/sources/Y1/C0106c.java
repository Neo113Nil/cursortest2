package Y1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: Y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f1826a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0106c(Object instance) {
        this(instance, null);
        kotlin.jvm.internal.j.e(instance, "instance");
    }

    public final boolean equals(Object obj) {
        T t3 = get();
        return t3 != 0 ? (obj instanceof C0106c) && ((C0106c) obj).get() == t3 : obj == this;
    }

    public final int hashCode() {
        return this.f1826a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106c(Object instance, ReferenceQueue referenceQueue) {
        super(instance, referenceQueue);
        kotlin.jvm.internal.j.e(instance, "instance");
        this.f1826a = System.identityHashCode(instance);
    }
}
