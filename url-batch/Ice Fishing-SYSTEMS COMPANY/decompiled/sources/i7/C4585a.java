package i7;

import java.util.concurrent.atomic.AtomicInteger;
import k7.C4668i;
import t0.AbstractC5051n;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4585a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f38329c = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f38330a = f38329c.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final C4668i f38331b;

    public C4585a(C4668i c4668i) {
        this.f38331b = c4668i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4585a) {
            return this.f38330a == ((C4585a) obj).f38330a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38330a;
    }

    public final String toString() {
        return AbstractC5051n.e(this.f38330a, "}", new StringBuilder("RegisteredReader{"));
    }
}
