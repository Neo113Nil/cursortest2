package j5;

import b2.AbstractC0279e;
import g4.AbstractC0464i;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class t extends i {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f10531e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f10532f;

    public t(byte[][] bArr, int[] iArr) {
        super(i.f10496d.f10497a);
        this.f10531e = bArr;
        this.f10532f = iArr;
    }

    @Override // j5.i
    public final int a() {
        return this.f10532f[this.f10531e.length - 1];
    }

    @Override // j5.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // j5.i
    public final byte[] c() {
        return j();
    }

    @Override // j5.i
    public final byte d(int i2) {
        byte[][] bArr = this.f10531e;
        int length = bArr.length - 1;
        int[] iArr = this.f10532f;
        b.d(iArr[length], i2, 1L);
        int b6 = k5.b.b(this, i2);
        return bArr[b6][(i2 - (b6 == 0 ? 0 : iArr[b6 - 1])) + iArr[bArr.length + b6]];
    }

    @Override // j5.i
    public final boolean e(int i2, byte[] other, int i3, int i6) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i2 < 0 || i2 > a() - i6 || i3 < 0 || i3 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i2;
        int b6 = k5.b.b(this, i2);
        while (i2 < i7) {
            int[] iArr = this.f10532f;
            int i8 = b6 == 0 ? 0 : iArr[b6 - 1];
            int i9 = iArr[b6] - i8;
            byte[][] bArr = this.f10531e;
            int i10 = iArr[bArr.length + b6];
            int min = Math.min(i7, i9 + i8) - i2;
            if (!b.a((i2 - i8) + i10, i3, min, bArr[b6], other)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b6++;
        }
        return true;
    }

    @Override // j5.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.a() == a() && f(iVar, a())) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.i
    public final boolean f(i other, int i2) {
        kotlin.jvm.internal.i.e(other, "other");
        if (a() - i2 < 0) {
            return false;
        }
        int b6 = k5.b.b(this, 0);
        int i3 = 0;
        int i6 = 0;
        while (i3 < i2) {
            int[] iArr = this.f10532f;
            int i7 = b6 == 0 ? 0 : iArr[b6 - 1];
            int i8 = iArr[b6] - i7;
            byte[][] bArr = this.f10531e;
            int i9 = iArr[bArr.length + b6];
            int min = Math.min(i2, i8 + i7) - i3;
            if (!other.e(i6, bArr[b6], (i3 - i7) + i9, min)) {
                return false;
            }
            i6 += min;
            i3 += min;
            b6++;
        }
        return true;
    }

    @Override // j5.i
    public final String g(Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        return new i(j()).g(charset);
    }

    @Override // j5.i
    public final i h(int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = a();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(B0.o.g(i2, "beginIndex=", " < 0").toString());
        }
        if (i3 > a()) {
            StringBuilder i6 = AbstractC0279e.i(i3, "endIndex=", " > length(");
            i6.append(a());
            i6.append(')');
            throw new IllegalArgumentException(i6.toString().toString());
        }
        int i7 = i3 - i2;
        if (i7 < 0) {
            throw new IllegalArgumentException(B0.o.h("endIndex=", i3, i2, " < beginIndex=").toString());
        }
        if (i2 == 0 && i3 == a()) {
            return this;
        }
        if (i2 == i3) {
            return i.f10496d;
        }
        int b6 = k5.b.b(this, i2);
        int b7 = k5.b.b(this, i3 - 1);
        byte[][] bArr = this.f10531e;
        byte[][] bArr2 = (byte[][]) AbstractC0464i.R(b6, b7 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f10532f;
        if (b6 <= b7) {
            int i8 = b6;
            int i9 = 0;
            while (true) {
                iArr[i9] = Math.min(iArr2[i8] - i2, i7);
                int i10 = i9 + 1;
                iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                if (i8 == b7) {
                    break;
                }
                i8++;
                i9 = i10;
            }
        }
        int i11 = b6 != 0 ? iArr2[b6 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i2 - i11) + iArr[length];
        return new t(bArr2, iArr);
    }

    @Override // j5.i
    public final int hashCode() {
        int i2 = this.f10498b;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f10531e;
        int length = bArr.length;
        int i3 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i3 < length) {
            int[] iArr = this.f10532f;
            int i8 = iArr[length + i3];
            int i9 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i3++;
            i7 = i9;
        }
        this.f10498b = i6;
        return i6;
    }

    @Override // j5.i
    public final i i() {
        return new i(j()).i();
    }

    @Override // j5.i
    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f10531e;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i6 = 0;
        while (i2 < length) {
            int[] iArr = this.f10532f;
            int i7 = iArr[length + i2];
            int i8 = iArr[i2];
            int i9 = i8 - i3;
            AbstractC0464i.O(i6, i7, i7 + i9, bArr2[i2], bArr);
            i6 += i9;
            i2++;
            i3 = i8;
        }
        return bArr;
    }

    @Override // j5.i
    public final void l(f buffer, int i2) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        int b6 = k5.b.b(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f10532f;
            int i6 = b6 == 0 ? 0 : iArr[b6 - 1];
            int i7 = iArr[b6] - i6;
            byte[][] bArr = this.f10531e;
            int i8 = iArr[bArr.length + b6];
            int min = Math.min(i2, i7 + i6) - i3;
            int i9 = (i3 - i6) + i8;
            r rVar = new r(bArr[b6], i9, i9 + min, true);
            r rVar2 = buffer.f10494a;
            if (rVar2 == null) {
                rVar.f10527g = rVar;
                rVar.f10526f = rVar;
                buffer.f10494a = rVar;
            } else {
                r rVar3 = rVar2.f10527g;
                kotlin.jvm.internal.i.b(rVar3);
                rVar3.b(rVar);
            }
            i3 += min;
            b6++;
        }
        buffer.f10495b += i2;
    }

    @Override // j5.i
    public final String toString() {
        return new i(j()).toString();
    }
}
