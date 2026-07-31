package c;

import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1549a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1550b;

    public g(long j7, Object obj) {
        this.f1549a = obj;
        this.f1550b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return q6.i.a(this.f1549a, gVar.f1549a) && this.f1550b == gVar.f1550b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1550b) + (this.f1549a.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f1549a + ", compositeKey=" + this.f1550b + ')';
    }
}
