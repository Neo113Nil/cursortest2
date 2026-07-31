package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198h extends AbstractC0200j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3871c;

    /* renamed from: d, reason: collision with root package name */
    public int f3872d;

    /* renamed from: e, reason: collision with root package name */
    public int f3873e;

    /* renamed from: f, reason: collision with root package name */
    public int f3874f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3875g;

    /* renamed from: h, reason: collision with root package name */
    public int f3876h;

    /* renamed from: i, reason: collision with root package name */
    public int f3877i = Integer.MAX_VALUE;

    public C0198h(byte[] bArr, int i3, int i4, boolean z3) {
        this.f3871c = bArr;
        this.f3872d = i4 + i3;
        this.f3874f = i3;
        this.f3875g = i3;
    }

    public final int A() {
        int i3;
        int i4 = this.f3874f;
        int i5 = this.f3872d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f3871c;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                this.f3874f = i6;
                return b2;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b2;
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i3 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i3 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b3 = bArr[i11];
                            int i13 = (i12 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i3 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i13;
                            }
                            i3 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f3874f = i7;
                return i3;
            }
        }
        return (int) C();
    }

    public final long B() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f3874f;
        int i4 = this.f3872d;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f3871c;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f3874f = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                if (i7 < 0) {
                    j3 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j3 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                        } else {
                            long j7 = i11;
                            i6 = i3 + 5;
                            long j8 = j7 ^ (bArr[i10] << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (bArr[i6] << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (bArr[i10] << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (bArr[i6] << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i10;
                        j3 = j6;
                    }
                }
                this.f3874f = i6;
                return j3;
            }
        }
        return C();
    }

    public final long C() {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i4 = this.f3874f;
            if (i4 == this.f3872d) {
                throw C0215z.e();
            }
            this.f3874f = i4 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f3871c[i4] & 128) == 0) {
                return j3;
            }
        }
        throw C0215z.c();
    }

    public final void D() {
        int i3 = this.f3872d + this.f3873e;
        this.f3872d = i3;
        int i4 = i3 - this.f3875g;
        int i5 = this.f3877i;
        if (i4 <= i5) {
            this.f3873e = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f3873e = i6;
        this.f3872d = i3 - i6;
    }

    public final void E(int i3) {
        if (i3 >= 0) {
            int i4 = this.f3872d;
            int i5 = this.f3874f;
            if (i3 <= i4 - i5) {
                this.f3874f = i5 + i3;
                return;
            }
        }
        if (i3 >= 0) {
            throw C0215z.e();
        }
        throw C0215z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final void a(int i3) {
        if (this.f3876h != i3) {
            throw new C0215z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int b() {
        return this.f3874f - this.f3875g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final boolean c() {
        return this.f3874f == this.f3872d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final void d(int i3) {
        this.f3877i = i3;
        D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int e(int i3) {
        if (i3 < 0) {
            throw C0215z.d();
        }
        int b2 = b() + i3;
        if (b2 < 0) {
            throw new C0215z("Failed to parse the message.");
        }
        int i4 = this.f3877i;
        if (b2 > i4) {
            throw C0215z.e();
        }
        this.f3877i = b2;
        D();
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final boolean f() {
        return B() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final C0197g g() {
        byte[] bArr;
        int A3 = A();
        byte[] bArr2 = this.f3871c;
        if (A3 > 0) {
            int i3 = this.f3872d;
            int i4 = this.f3874f;
            if (A3 <= i3 - i4) {
                C0197g d3 = C0197g.d(bArr2, i4, A3);
                this.f3874f += A3;
                return d3;
            }
        }
        if (A3 == 0) {
            return C0197g.f3863f;
        }
        if (A3 > 0) {
            int i5 = this.f3872d;
            int i6 = this.f3874f;
            if (A3 <= i5 - i6) {
                int i7 = A3 + i6;
                this.f3874f = i7;
                bArr = Arrays.copyOfRange(bArr2, i6, i7);
                C0197g c0197g = C0197g.f3863f;
                return new C0197g(bArr);
            }
        }
        if (A3 > 0) {
            throw C0215z.e();
        }
        if (A3 != 0) {
            throw C0215z.d();
        }
        bArr = AbstractC0213x.f3935b;
        C0197g c0197g2 = C0197g.f3863f;
        return new C0197g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int i() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int j() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final long k() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int m() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final long n() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int o() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final long p() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int q() {
        int A3 = A();
        return (-(A3 & 1)) ^ (A3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final long r() {
        long B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final String s() {
        int A3 = A();
        if (A3 > 0) {
            int i3 = this.f3872d;
            int i4 = this.f3874f;
            if (A3 <= i3 - i4) {
                String str = new String(this.f3871c, i4, A3, AbstractC0213x.f3934a);
                this.f3874f += A3;
                return str;
            }
        }
        if (A3 == 0) {
            return "";
        }
        if (A3 < 0) {
            throw C0215z.d();
        }
        throw C0215z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final String t() {
        int A3 = A();
        if (A3 > 0) {
            int i3 = this.f3872d;
            int i4 = this.f3874f;
            if (A3 <= i3 - i4) {
                String a3 = v0.f3933a.a(this.f3871c, i4, A3);
                this.f3874f += A3;
                return a3;
            }
        }
        if (A3 == 0) {
            return "";
        }
        if (A3 <= 0) {
            throw C0215z.d();
        }
        throw C0215z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int u() {
        if (c()) {
            this.f3876h = 0;
            return 0;
        }
        int A3 = A();
        this.f3876h = A3;
        if ((A3 >>> 3) != 0) {
            return A3;
        }
        throw new C0215z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final int v() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final long w() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0200j
    public final boolean x(int i3) {
        int u3;
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f3872d - this.f3874f;
            byte[] bArr = this.f3871c;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f3874f;
                    this.f3874f = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw C0215z.c();
            }
            while (i5 < 10) {
                int i8 = this.f3874f;
                if (i8 == this.f3872d) {
                    throw C0215z.e();
                }
                this.f3874f = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw C0215z.c();
            return true;
        }
        if (i4 == 1) {
            E(8);
            return true;
        }
        if (i4 == 2) {
            E(A());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C0215z.b();
            }
            E(4);
            return true;
        }
        do {
            u3 = u();
            if (u3 == 0) {
                break;
            }
        } while (x(u3));
        a(((i3 >>> 3) << 3) | 4);
        return true;
    }

    public final int y() {
        int i3 = this.f3874f;
        if (this.f3872d - i3 < 4) {
            throw C0215z.e();
        }
        this.f3874f = i3 + 4;
        byte[] bArr = this.f3871c;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long z() {
        int i3 = this.f3874f;
        if (this.f3872d - i3 < 8) {
            throw C0215z.e();
        }
        this.f3874f = i3 + 8;
        byte[] bArr = this.f3871c;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }
}
