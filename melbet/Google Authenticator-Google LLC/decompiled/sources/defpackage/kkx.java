package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkx {
    final int a;
    final int b;
    final int c;
    final AtomicInteger d;

    public kkx(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.d = atomicInteger;
        this.c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.a = i;
        this.b = i / 2;
        atomicInteger.set(i);
    }

    final boolean a() {
        return this.d.get() > this.b;
    }

    final boolean b() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.d;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkx)) {
            return false;
        }
        kkx kkxVar = (kkx) obj;
        return this.a == kkxVar.a && this.c == kkxVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c));
    }
}
