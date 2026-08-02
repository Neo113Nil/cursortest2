package net.idrnd.face.iad.capture.internal;

import net.idrnd.face.iad.capture.NativeImageProcessor;

/* loaded from: classes9.dex */
public final class d3 implements AutoCloseable {
    public final long a;
    public final int b;
    public boolean c;
    public final Object d = new Object();

    public d3(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.c) {
                return;
            }
            NativeImageProcessor.a.freeNativeByteArray(this.a);
            this.c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.a == d3Var.a && this.b == d3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NativeByteArray(pointer=" + this.a + ", size=" + this.b + ")";
    }
}
