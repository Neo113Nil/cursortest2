package o2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private int f19787a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f19788b;

    public s() {
        this(32);
    }

    public s(int i7) {
        this.f19788b = new long[i7];
    }

    public void a(long j7) {
        int i7 = this.f19787a;
        long[] jArr = this.f19788b;
        if (i7 == jArr.length) {
            this.f19788b = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = this.f19788b;
        int i8 = this.f19787a;
        this.f19787a = i8 + 1;
        jArr2[i8] = j7;
    }

    public long b(int i7) {
        if (i7 >= 0 && i7 < this.f19787a) {
            return this.f19788b[i7];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i7 + ", size is " + this.f19787a);
    }

    public int c() {
        return this.f19787a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f19788b, this.f19787a);
    }
}
