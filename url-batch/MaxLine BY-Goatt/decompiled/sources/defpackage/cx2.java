package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cx2 implements g {
    public final ThreadLocal m;

    public cx2(ThreadLocal threadLocal) {
        this.m = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx2) && Intrinsics.b(this.m, ((cx2) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.m + ')';
    }
}
