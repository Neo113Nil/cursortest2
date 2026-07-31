package i2;

import c2.h;
import java.util.Collections;
import java.util.List;
import o2.m0;

/* loaded from: classes.dex */
final class b implements h {

    /* renamed from: f, reason: collision with root package name */
    private final c2.b[] f17022f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f17023g;

    public b(c2.b[] bVarArr, long[] jArr) {
        this.f17022f = bVarArr;
        this.f17023g = jArr;
    }

    @Override // c2.h
    public int b(long j7) {
        int e7 = m0.e(this.f17023g, j7, false, false);
        if (e7 < this.f17023g.length) {
            return e7;
        }
        return -1;
    }

    @Override // c2.h
    public long d(int i7) {
        o2.a.a(i7 >= 0);
        o2.a.a(i7 < this.f17023g.length);
        return this.f17023g[i7];
    }

    @Override // c2.h
    public List<c2.b> e(long j7) {
        int i7 = m0.i(this.f17023g, j7, true, false);
        if (i7 != -1) {
            c2.b[] bVarArr = this.f17022f;
            if (bVarArr[i7] != c2.b.f1822w) {
                return Collections.singletonList(bVarArr[i7]);
            }
        }
        return Collections.emptyList();
    }

    @Override // c2.h
    public int f() {
        return this.f17023g.length;
    }
}
