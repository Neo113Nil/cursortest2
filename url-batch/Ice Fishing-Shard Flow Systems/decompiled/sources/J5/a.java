package J5;

import L5.i;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f1388c = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f1389a = f1388c.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final i f1390b;

    public a(i iVar) {
        this.f1390b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1389a == ((a) obj).f1389a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1389a;
    }

    public final String toString() {
        return "RegisteredReader{" + this.f1389a + "}";
    }
}
