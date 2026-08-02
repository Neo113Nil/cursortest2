package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class p implements l {
    public final l a;
    public final l b;
    public final long c;

    public p(l lVar, l lVar2) {
        this.a = lVar;
        this.b = lVar2;
        this.c = lVar2.count() + lVar.count();
    }

    @Override // j$.util.stream.l
    public final void a(Object[] objArr, int i) {
        objArr.getClass();
        l lVar = this.a;
        lVar.a(objArr, i);
        this.b.a(objArr, i + ((int) lVar.count()));
    }

    @Override // j$.util.stream.l
    public final Object[] b(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        a(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.l
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.l
    public final l e(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l
    public final int f() {
        return 2;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
