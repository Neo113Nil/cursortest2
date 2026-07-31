package c5;

import e5.C0354i;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f3819c = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3820a = f3819c.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final C0354i f3821b;

    public C0290a(C0354i c0354i) {
        this.f3821b = c0354i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0290a) {
            return this.f3820a == ((C0290a) obj).f3820a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3820a;
    }

    public final String toString() {
        return "RegisteredReader{" + this.f3820a + "}";
    }
}
