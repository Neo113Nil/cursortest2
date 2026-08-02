package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class t extends h0 implements l, k {
    @Override // j$.util.stream.l
    public final void a(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, objArr, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object[] objArr2 = this.e[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.e[i2].length;
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.l
    public final Object[] b(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        a(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.f0
    public final void c(long j) {
        clear();
        g(j);
    }

    @Override // j$.util.stream.f0
    public final boolean d() {
        return false;
    }

    @Override // j$.util.stream.l
    public final l e(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l
    public final int f() {
        return 0;
    }

    @Override // j$.util.stream.k
    public final l build() {
        return this;
    }

    @Override // j$.util.stream.f0
    public final void end() {
    }
}
