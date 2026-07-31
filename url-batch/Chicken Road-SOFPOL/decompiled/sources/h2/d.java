package h2;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3090b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3091c;

    public d(int i, int i8, boolean z3) {
        this.f3089a = i;
        this.f3090b = i8;
        this.f3091c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3089a == dVar.f3089a && this.f3090b == dVar.f3090b && this.f3091c == dVar.f3091c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3091c) + q.b(this.f3090b, Integer.hashCode(this.f3089a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f3089a + ", end=" + this.f3090b + ", isRtl=" + this.f3091c + ')';
    }
}
