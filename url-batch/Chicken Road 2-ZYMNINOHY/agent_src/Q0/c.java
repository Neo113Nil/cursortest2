package Q0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2133b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2134c;

    public c(long j4, long j5, long j6) {
        this.f2132a = j4;
        this.f2133b = j5;
        this.f2134c = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f2132a, ((c) obj).f2132a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2132a == cVar.f2132a && this.f2133b == cVar.f2133b && this.f2134c == cVar.f2134c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f2132a), Long.valueOf(this.f2133b), Long.valueOf(this.f2134c));
    }
}
