package le;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements kotlin.coroutines.f {

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f6009d;

    public x(ThreadLocal threadLocal) {
        this.f6009d = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.a(this.f6009d, ((x) obj).f6009d);
    }

    public final int hashCode() {
        return this.f6009d.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f6009d + ')';
    }
}
