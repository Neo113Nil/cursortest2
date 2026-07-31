package w0;

import java.util.Arrays;
import o2.m0;
import w0.b0;

/* loaded from: classes.dex */
public final class d implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22881a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22882b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f22883c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f22884d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f22885e;

    /* renamed from: f, reason: collision with root package name */
    private final long f22886f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22882b = iArr;
        this.f22883c = jArr;
        this.f22884d = jArr2;
        this.f22885e = jArr3;
        int length = iArr.length;
        this.f22881a = length;
        if (length > 0) {
            this.f22886f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f22886f = 0L;
        }
    }

    public int a(long j7) {
        return m0.i(this.f22885e, j7, true, true);
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        int a7 = a(j7);
        c0 c0Var = new c0(this.f22885e[a7], this.f22883c[a7]);
        if (c0Var.f22879a >= j7 || a7 == this.f22881a - 1) {
            return new b0.a(c0Var);
        }
        int i7 = a7 + 1;
        return new b0.a(c0Var, new c0(this.f22885e[i7], this.f22883c[i7]));
    }

    @Override // w0.b0
    public long j() {
        return this.f22886f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f22881a + ", sizes=" + Arrays.toString(this.f22882b) + ", offsets=" + Arrays.toString(this.f22883c) + ", timeUs=" + Arrays.toString(this.f22885e) + ", durationsUs=" + Arrays.toString(this.f22884d) + ")";
    }
}
