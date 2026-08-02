package y0;

import W.J;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f16160a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16161b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f16162c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f16163d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f16164e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16165f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f16161b = iArr;
        this.f16162c = jArr;
        this.f16163d = jArr2;
        this.f16164e = jArr3;
        int length = iArr.length;
        this.f16160a = length;
        if (length > 0) {
            this.f16165f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f16165f = 0L;
        }
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final x e(long j4) {
        long[] jArr = this.f16164e;
        int f4 = J.f(jArr, j4, true);
        long j5 = jArr[f4];
        long[] jArr2 = this.f16162c;
        z zVar = new z(j5, jArr2[f4]);
        if (j5 >= j4 || f4 == this.f16160a - 1) {
            return new x(zVar, zVar);
        }
        int i4 = f4 + 1;
        return new x(zVar, new z(jArr[i4], jArr2[i4]));
    }

    @Override // y0.y
    public final long g() {
        return this.f16165f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f16160a + ", sizes=" + Arrays.toString(this.f16161b) + ", offsets=" + Arrays.toString(this.f16162c) + ", timeUs=" + Arrays.toString(this.f16164e) + ", durationsUs=" + Arrays.toString(this.f16163d) + ")";
    }
}
