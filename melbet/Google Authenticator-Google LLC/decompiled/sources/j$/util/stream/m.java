package j$.util.stream;

import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class m implements l {
    public final Object[] a;
    public int b;

    public m(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.l
    public final void a(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.l
    public final Object[] b(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.l
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.l
    public final l e(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l
    public final int f() {
        return 0;
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    public m(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
