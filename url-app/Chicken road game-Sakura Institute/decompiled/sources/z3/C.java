package z3;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class C extends C1451i {

    /* renamed from: k, reason: collision with root package name */
    public final transient byte[][] f11972k;

    /* renamed from: l, reason: collision with root package name */
    public final transient int[] f11973l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(byte[][] segments, int[] directory) {
        super(C1451i.f12000j.f12001d);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f11972k = segments;
        this.f11973l = directory;
    }

    @Override // z3.C1451i
    public final C1451i B() {
        return F().B();
    }

    @Override // z3.C1451i
    public final void D(C1448f buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int g4 = A3.b.g(this, 0);
        int i4 = 0;
        while (i4 < i2) {
            int[] iArr = this.f11973l;
            int i5 = g4 == 0 ? 0 : iArr[g4 - 1];
            int i6 = iArr[g4] - i5;
            byte[][] bArr = this.f11972k;
            int i7 = iArr[bArr.length + g4];
            int min = Math.min(i2, i6 + i5) - i4;
            int i8 = (i4 - i5) + i7;
            A a4 = new A(bArr[g4], i8, i8 + min, true);
            A a5 = buffer.f11998d;
            if (a5 == null) {
                a4.f11968g = a4;
                a4.f11967f = a4;
                buffer.f11998d = a4;
            } else {
                A a6 = a5.f11968g;
                Intrinsics.c(a6);
                a6.b(a4);
            }
            i4 += min;
            g4++;
        }
        buffer.f11999e += i2;
    }

    public final byte[] E() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f11972k;
        int length = bArr2.length;
        int i2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            int[] iArr = this.f11973l;
            int i6 = iArr[length + i2];
            int i7 = iArr[i2];
            int i8 = i7 - i4;
            C1436t.c(i5, i6, i6 + i8, bArr2[i2], bArr);
            i5 += i8;
            i2++;
            i4 = i7;
        }
        return bArr;
    }

    public final C1451i F() {
        return new C1451i(E());
    }

    @Override // z3.C1451i
    public final int c() {
        return this.f11973l[this.f11972k.length - 1];
    }

    @Override // z3.C1451i
    public final String e() {
        return F().e();
    }

    @Override // z3.C1451i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1451i) {
            C1451i c1451i = (C1451i) obj;
            if (c1451i.c() == c() && r(0, c1451i, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // z3.C1451i
    public final int h(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return F().h(other, i2);
    }

    @Override // z3.C1451i
    public final int hashCode() {
        int i2 = this.f12002e;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f11972k;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f11973l;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.f12002e = i5;
        return i5;
    }

    @Override // z3.C1451i
    public final byte[] l() {
        return E();
    }

    @Override // z3.C1451i
    public final byte n(int i2) {
        byte[][] bArr = this.f11972k;
        int length = bArr.length - 1;
        int[] iArr = this.f11973l;
        m3.s.g(iArr[length], i2, 1L);
        int g4 = A3.b.g(this, i2);
        return bArr[g4][(i2 - (g4 == 0 ? 0 : iArr[g4 - 1])) + iArr[bArr.length + g4]];
    }

    @Override // z3.C1451i
    public final int o(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return F().o(other, i2);
    }

    @Override // z3.C1451i
    public final boolean r(int i2, C1451i other, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > c() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int g4 = A3.b.g(this, i2);
        int i6 = 0;
        while (i2 < i5) {
            int[] iArr = this.f11973l;
            int i7 = g4 == 0 ? 0 : iArr[g4 - 1];
            int i8 = iArr[g4] - i7;
            byte[][] bArr = this.f11972k;
            int i9 = iArr[bArr.length + g4];
            int min = Math.min(i5, i8 + i7) - i2;
            if (!other.s(i6, bArr[g4], (i2 - i7) + i9, min)) {
                return false;
            }
            i6 += min;
            i2 += min;
            g4++;
        }
        return true;
    }

    @Override // z3.C1451i
    public final boolean s(int i2, byte[] other, int i4, int i5) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > c() - i5 || i4 < 0 || i4 > other.length - i5) {
            return false;
        }
        int i6 = i5 + i2;
        int g4 = A3.b.g(this, i2);
        while (i2 < i6) {
            int[] iArr = this.f11973l;
            int i7 = g4 == 0 ? 0 : iArr[g4 - 1];
            int i8 = iArr[g4] - i7;
            byte[][] bArr = this.f11972k;
            int i9 = iArr[bArr.length + g4];
            int min = Math.min(i6, i8 + i7) - i2;
            if (!m3.s.f((i2 - i7) + i9, i4, min, bArr[g4], other)) {
                return false;
            }
            i4 += min;
            i2 += min;
            g4++;
        }
        return true;
    }

    @Override // z3.C1451i
    public final String toString() {
        return F().toString();
    }

    @Override // z3.C1451i
    public final C1451i v(int i2, int i4) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i4 == -1234567890) {
            i4 = c();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "beginIndex=", " < 0").toString());
        }
        if (i4 > c()) {
            StringBuilder o4 = AbstractC0017m.o(i4, "endIndex=", " > length(");
            o4.append(c());
            o4.append(')');
            throw new IllegalArgumentException(o4.toString().toString());
        }
        int i5 = i4 - i2;
        if (i5 < 0) {
            throw new IllegalArgumentException(r0.B.b(i4, i2, "endIndex=", " < beginIndex=").toString());
        }
        if (i2 == 0 && i4 == c()) {
            return this;
        }
        if (i2 == i4) {
            return C1451i.f12000j;
        }
        int g4 = A3.b.g(this, i2);
        int g5 = A3.b.g(this, i4 - 1);
        byte[][] bArr = this.f11972k;
        byte[][] bArr2 = (byte[][]) C1436t.j(bArr, g4, g5 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f11973l;
        if (g4 <= g5) {
            int i6 = g4;
            int i7 = 0;
            while (true) {
                iArr[i7] = Math.min(iArr2[i6] - i2, i5);
                int i8 = i7 + 1;
                iArr[i7 + bArr2.length] = iArr2[bArr.length + i6];
                if (i6 == g5) {
                    break;
                }
                i6++;
                i7 = i8;
            }
        }
        int i9 = g4 != 0 ? iArr2[g4 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i2 - i9) + iArr[length];
        return new C(bArr2, iArr);
    }
}
