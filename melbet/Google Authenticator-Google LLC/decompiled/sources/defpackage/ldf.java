package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldf implements kqm {
    private final ThreadLocal a;

    public ldf(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldf) && ksp.b(this.a, ((ldf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ")";
    }
}
