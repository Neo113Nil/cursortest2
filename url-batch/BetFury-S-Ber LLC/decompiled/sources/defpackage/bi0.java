package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bi0 implements pg {
    public final ThreadLocal f;

    public bi0(ThreadLocal threadLocal) {
        this.f = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi0) && mv.c(this.f, ((bi0) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f + ')';
    }
}
