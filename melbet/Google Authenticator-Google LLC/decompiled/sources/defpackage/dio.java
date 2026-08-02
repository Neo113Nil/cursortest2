package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dio {
    public final String a;
    public final int b;
    public final boolean c;
    public final diq d;

    public dio(String str, int i, boolean z, diq diqVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = diqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dio) {
            dio dioVar = (dio) obj;
            if (this.a.equals(dioVar.a) && this.b == dioVar.b && this.c == dioVar.c && this.d.equals(dioVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "ThreadPoolConfig{name=" + this.a + ", numThreads=" + this.b + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + this.c + ", listener=" + this.d.toString() + "}";
    }

    public dio() {
        throw null;
    }
}
