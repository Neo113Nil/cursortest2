package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class q extends m implements k {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.k
    public final l build() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(i), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.f0
    public final void c(long j) {
        Object[] objArr = this.a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.f0
    public final boolean d() {
        return false;
    }

    @Override // j$.util.stream.f0
    public final void end() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(i), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.m
    public final String toString() {
        Object[] objArr = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
