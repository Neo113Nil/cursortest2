package N0;

import W.J;
import a.AbstractC0124a;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1796a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1798c;

    public a(int i4, long j4, long j5) {
        AbstractC0124a.h(j4 < j5);
        this.f1796a = j4;
        this.f1797b = j5;
        this.f1798c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1796a == aVar.f1796a && this.f1797b == aVar.f1797b && this.f1798c == aVar.f1798c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f1796a), Long.valueOf(this.f1797b), Integer.valueOf(this.f1798c));
    }

    public final String toString() {
        String str = J.f3263a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f1796a + ", endTimeMs=" + this.f1797b + ", speedDivisor=" + this.f1798c;
    }
}
