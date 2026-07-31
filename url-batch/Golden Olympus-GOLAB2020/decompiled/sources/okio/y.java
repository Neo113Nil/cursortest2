package okio;

import java.security.MessageDigest;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends h {

    /* renamed from: g, reason: collision with root package name */
    private final transient byte[][] f43316g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int[] f43317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(byte[][] segments, int[] directory) {
        super(h.f43271f.h());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f43316g = segments;
        this.f43317h = directory;
    }

    private final h D() {
        return new h(C());
    }

    public final int[] A() {
        return this.f43317h;
    }

    public final byte[][] B() {
        return this.f43316g;
    }

    public byte[] C() {
        byte[] bArr = new byte[v()];
        int length = B().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = A()[length + i4];
            int i8 = A()[i4];
            int i9 = i8 - i5;
            AbstractC3219i.f(B()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // okio.h
    public String c() {
        return D().c();
    }

    @Override // okio.h
    public h e(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = B().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = A()[length + i4];
            int i7 = A()[i4];
            messageDigest.update(B()[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new h(digest);
    }

    @Override // okio.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.v() == v() && p(0, hVar, 0, v())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.h
    public int hashCode() {
        int i4 = i();
        if (i4 != 0) {
            return i4;
        }
        int length = B().length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int i8 = A()[length + i5];
            int i9 = A()[i5];
            byte[] bArr = B()[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        r(i6);
        return i6;
    }

    @Override // okio.h
    public int j() {
        return A()[B().length - 1];
    }

    @Override // okio.h
    public String l() {
        return D().l();
    }

    @Override // okio.h
    public byte[] m() {
        return C();
    }

    @Override // okio.h
    public byte n(int i4) {
        AbstractC3369b.b(A()[B().length - 1], i4, 1L);
        int b4 = H2.c.b(this, i4);
        return B()[b4][(i4 - (b4 == 0 ? 0 : A()[b4 - 1])) + A()[B().length + b4]];
    }

    @Override // okio.h
    public boolean p(int i4, h other, int i5, int i6) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i4 < 0 || i4 > v() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int b4 = H2.c.b(this, i4);
        while (i4 < i7) {
            int i8 = b4 == 0 ? 0 : A()[b4 - 1];
            int i9 = A()[b4] - i8;
            int i10 = A()[B().length + b4];
            int min = Math.min(i7, i9 + i8) - i4;
            if (!other.q(i5, B()[b4], i10 + (i4 - i8), min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }

    @Override // okio.h
    public boolean q(int i4, byte[] other, int i5, int i6) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i4 < 0 || i4 > v() - i6 || i5 < 0 || i5 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int b4 = H2.c.b(this, i4);
        while (i4 < i7) {
            int i8 = b4 == 0 ? 0 : A()[b4 - 1];
            int i9 = A()[b4] - i8;
            int i10 = A()[B().length + b4];
            int min = Math.min(i7, i9 + i8) - i4;
            if (!AbstractC3369b.a(B()[b4], i10 + (i4 - i8), other, i5, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }

    @Override // okio.h
    public String toString() {
        return D().toString();
    }

    @Override // okio.h
    public h x() {
        return D().x();
    }

    @Override // okio.h
    public void z(C3372e buffer, int i4, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i6 = i4 + i5;
        int b4 = H2.c.b(this, i4);
        while (i4 < i6) {
            int i7 = b4 == 0 ? 0 : A()[b4 - 1];
            int i8 = A()[b4] - i7;
            int i9 = A()[B().length + b4];
            int min = Math.min(i6, i8 + i7) - i4;
            int i10 = i9 + (i4 - i7);
            w wVar = new w(B()[b4], i10, i10 + min, true, false);
            w wVar2 = buffer.f43260b;
            if (wVar2 == null) {
                wVar.f43310g = wVar;
                wVar.f43309f = wVar;
                buffer.f43260b = wVar;
            } else {
                Intrinsics.checkNotNull(wVar2);
                w wVar3 = wVar2.f43310g;
                Intrinsics.checkNotNull(wVar3);
                wVar3.c(wVar);
            }
            i4 += min;
            b4++;
        }
        buffer.k0(buffer.l0() + i5);
    }
}
