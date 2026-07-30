package T6;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends i {

    /* renamed from: m, reason: collision with root package name */
    public final transient byte[][] f2653m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int[] f2654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(byte[][] segments, int[] directory) {
        super(i.f2618l.f2619d);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f2653m = segments;
        this.f2654n = directory;
    }

    @Override // T6.i
    public final int a() {
        return this.f2654n[this.f2653m.length - 1];
    }

    @Override // T6.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // T6.i
    public final byte[] c() {
        return j();
    }

    @Override // T6.i
    public final byte d(int i2) {
        byte[][] bArr = this.f2653m;
        int length = bArr.length - 1;
        int[] iArr = this.f2654n;
        b.d(iArr[length], i2, 1L);
        int b7 = U6.b.b(this, i2);
        return bArr[b7][(i2 - (b7 == 0 ? 0 : iArr[b7 - 1])) + iArr[bArr.length + b7]];
    }

    @Override // T6.i
    public final boolean e(int i2, byte[] other, int i5, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > a() - i7 || i5 < 0 || i5 > other.length - i7) {
            return false;
        }
        int i8 = i7 + i2;
        int b7 = U6.b.b(this, i2);
        while (i2 < i8) {
            int[] iArr = this.f2654n;
            int i9 = b7 == 0 ? 0 : iArr[b7 - 1];
            int i10 = iArr[b7] - i9;
            byte[][] bArr = this.f2653m;
            int i11 = iArr[bArr.length + b7];
            int min = Math.min(i8, i10 + i9) - i2;
            if (!b.a((i2 - i9) + i11, i5, min, bArr[b7], other)) {
                return false;
            }
            i5 += min;
            i2 += min;
            b7++;
        }
        return true;
    }

    @Override // T6.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.a() == a() && f(iVar, a());
    }

    @Override // T6.i
    public final boolean f(i other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (a() - i2 >= 0) {
            int b7 = U6.b.b(this, 0);
            int i5 = 0;
            int i7 = 0;
            while (i5 < i2) {
                int[] iArr = this.f2654n;
                int i8 = b7 == 0 ? 0 : iArr[b7 - 1];
                int i9 = iArr[b7] - i8;
                byte[][] bArr = this.f2653m;
                int i10 = iArr[bArr.length + b7];
                int min = Math.min(i2, i9 + i8) - i5;
                if (other.e(i7, bArr[b7], (i5 - i8) + i10, min)) {
                    i7 += min;
                    i5 += min;
                    b7++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // T6.i
    public final String g(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new i(j()).g(charset);
    }

    @Override // T6.i
    public final i h(int i2, int i5) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i5 == -1234567890) {
            i5 = a();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.h(i2, "beginIndex=", " < 0").toString());
        }
        if (i5 > a()) {
            StringBuilder k7 = C4.p.k(i5, "endIndex=", " > length(");
            k7.append(a());
            k7.append(')');
            throw new IllegalArgumentException(k7.toString().toString());
        }
        int i7 = i5 - i2;
        if (i7 < 0) {
            throw new IllegalArgumentException(C4.p.j("endIndex=", " < beginIndex=", i5, i2).toString());
        }
        if (i2 == 0 && i5 == a()) {
            return this;
        }
        if (i2 == i5) {
            return i.f2618l;
        }
        int b7 = U6.b.b(this, i2);
        int b8 = U6.b.b(this, i5 - 1);
        byte[][] bArr = this.f2653m;
        byte[][] bArr2 = (byte[][]) kotlin.collections.o.h(bArr, b7, b8 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f2654n;
        if (b7 <= b8) {
            int i8 = b7;
            int i9 = 0;
            while (true) {
                iArr[i9] = Math.min(iArr2[i8] - i2, i7);
                int i10 = i9 + 1;
                iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                if (i8 == b8) {
                    break;
                }
                i8++;
                i9 = i10;
            }
        }
        int i11 = b7 != 0 ? iArr2[b7 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i2 - i11) + iArr[length];
        return new t(bArr2, iArr);
    }

    @Override // T6.i
    public final int hashCode() {
        int i2 = this.f2620e;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f2653m;
        int length = bArr.length;
        int i5 = 0;
        int i7 = 1;
        int i8 = 0;
        while (i5 < length) {
            int[] iArr = this.f2654n;
            int i9 = iArr[length + i5];
            int i10 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i11 = (i10 - i8) + i9;
            while (i9 < i11) {
                i7 = (i7 * 31) + bArr2[i9];
                i9++;
            }
            i5++;
            i8 = i10;
        }
        this.f2620e = i7;
        return i7;
    }

    @Override // T6.i
    public final i i() {
        return new i(j()).i();
    }

    @Override // T6.i
    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f2653m;
        int length = bArr2.length;
        int i2 = 0;
        int i5 = 0;
        int i7 = 0;
        while (i2 < length) {
            int[] iArr = this.f2654n;
            int i8 = iArr[length + i2];
            int i9 = iArr[i2];
            int i10 = i9 - i5;
            kotlin.collections.o.c(i7, i8, i8 + i10, bArr2[i2], bArr);
            i7 += i10;
            i2++;
            i5 = i9;
        }
        return bArr;
    }

    @Override // T6.i
    public final void l(f buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int b7 = U6.b.b(this, 0);
        int i5 = 0;
        while (i5 < i2) {
            int[] iArr = this.f2654n;
            int i7 = b7 == 0 ? 0 : iArr[b7 - 1];
            int i8 = iArr[b7] - i7;
            byte[][] bArr = this.f2653m;
            int i9 = iArr[bArr.length + b7];
            int min = Math.min(i2, i8 + i7) - i5;
            int i10 = (i5 - i7) + i9;
            r rVar = new r(bArr[b7], i10, i10 + min, true);
            r rVar2 = buffer.f2616d;
            if (rVar2 == null) {
                rVar.f2649g = rVar;
                rVar.f2648f = rVar;
                buffer.f2616d = rVar;
            } else {
                r rVar3 = rVar2.f2649g;
                Intrinsics.b(rVar3);
                rVar3.b(rVar);
            }
            i5 += min;
            b7++;
        }
        buffer.f2617e += i2;
    }

    @Override // T6.i
    public final String toString() {
        return new i(j()).toString();
    }
}
