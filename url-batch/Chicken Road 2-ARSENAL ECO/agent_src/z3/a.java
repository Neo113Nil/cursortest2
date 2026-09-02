package z3;

import W4.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6284a;

    /* renamed from: c, reason: collision with root package name */
    public int f6286c;

    /* renamed from: d, reason: collision with root package name */
    public int f6287d;

    /* renamed from: h, reason: collision with root package name */
    public d f6291h;

    /* renamed from: j, reason: collision with root package name */
    public V5.g f6293j;

    /* renamed from: b, reason: collision with root package name */
    public int f6285b = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f6288e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f6289f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f6290g = -1;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6292i = new ArrayList();

    public a(int i7, byte[] bArr) {
        this.f6284a = bArr;
        this.f6286c = i7;
    }

    public final void a(int i7) {
        if (this.f6288e == i7) {
            this.f6288e = 6;
            return;
        }
        int i8 = this.f6285b;
        int i9 = this.f6286c;
        if (i8 > i9) {
            throw new IOException("Expected to end at " + this.f6286c + " but was " + this.f6285b);
        }
        if (i8 != i9) {
            this.f6288e = 7;
            return;
        }
        this.f6286c = this.f6290g;
        this.f6290g = -1;
        this.f6288e = 6;
    }

    public final int b() {
        if (this.f6288e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f6288e);
        }
        int i7 = this.f6286c - this.f6285b;
        this.f6288e = 6;
        this.f6286c = this.f6290g;
        this.f6290g = -1;
        return i7;
    }

    public final int c() {
        if (this.f6288e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i7 = this.f6287d + 1;
        this.f6287d = i7;
        if (i7 > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.f6292i;
        if (i7 > arrayList.size()) {
            arrayList.add(new n6.f());
        }
        int i8 = this.f6290g;
        this.f6290g = -1;
        this.f6288e = 6;
        return i8;
    }

    public final n6.i d(int i7) {
        if (this.f6288e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i8 = this.f6287d - 1;
        this.f6287d = i8;
        if (i8 < 0 || this.f6290g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f6285b == this.f6286c || i8 == 0) {
            this.f6286c = i7;
            n6.f fVar = (n6.f) this.f6292i.get(i8);
            long j4 = fVar.f5524g;
            return j4 > 0 ? fVar.f(j4) : n6.i.f5525i;
        }
        throw new IOException("Expected to end at " + this.f6286c + " but was " + this.f6285b);
    }

    public final int e() {
        int i7;
        byte g7 = g();
        if (g7 >= 0) {
            return g7;
        }
        int i8 = g7 & Byte.MAX_VALUE;
        byte g8 = g();
        if (g8 >= 0) {
            i7 = g8 << 7;
        } else {
            i8 |= (g8 & Byte.MAX_VALUE) << 7;
            byte g9 = g();
            if (g9 >= 0) {
                i7 = g9 << 14;
            } else {
                i8 |= (g9 & Byte.MAX_VALUE) << 14;
                byte g10 = g();
                if (g10 < 0) {
                    int i9 = i8 | ((g10 & Byte.MAX_VALUE) << 21);
                    byte g11 = g();
                    int i10 = i9 | (g11 << 28);
                    if (g11 < 0) {
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (g() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i10;
                }
                i7 = g10 << 21;
            }
        }
        return i8 | i7;
    }

    public final int f() {
        int i7 = this.f6288e;
        if (i7 == 7) {
            this.f6288e = 2;
            return this.f6289f;
        }
        if (i7 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f6285b < this.f6286c) {
            int e4 = e();
            if (e4 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i8 = e4 >> 3;
            this.f6289f = i8;
            int i9 = e4 & 7;
            if (i9 == 0) {
                this.f6291h = d.f6297g;
                this.f6288e = 0;
                return i8;
            }
            if (i9 == 1) {
                this.f6291h = d.f6298h;
                this.f6288e = 1;
                return i8;
            }
            if (i9 == 2) {
                this.f6291h = d.f6299i;
                this.f6288e = 2;
                int e7 = e();
                if (e7 < 0) {
                    throw new ProtocolException(o.c("Negative length: ", e7));
                }
                if (this.f6290g != -1) {
                    throw new IllegalStateException();
                }
                int i10 = this.f6286c;
                this.f6290g = i10;
                int i11 = this.f6285b + e7;
                this.f6286c = i11;
                if (i11 <= i10) {
                    return this.f6289f;
                }
                throw new EOFException();
            }
            if (i9 != 3) {
                if (i9 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i9 != 5) {
                    throw new ProtocolException(o.c("Unexpected field encoding: ", i9));
                }
                this.f6291h = d.f6300j;
                this.f6288e = 5;
                return i8;
            }
            o(i8);
        }
        return -1;
    }

    public final byte g() {
        int i7 = this.f6285b;
        if (i7 == this.f6286c) {
            throw new EOFException();
        }
        this.f6285b = i7 + 1;
        return this.f6284a[i7];
    }

    public final int h() {
        int i7 = this.f6288e;
        if (i7 != 5 && i7 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f6288e);
        }
        int i8 = this.f6285b;
        int i9 = i8 + 4;
        if (i9 > this.f6286c) {
            throw new EOFException();
        }
        int i10 = i8 + 1;
        this.f6285b = i10;
        byte[] bArr = this.f6284a;
        int i11 = bArr[i8] & 255;
        int i12 = i8 + 2;
        this.f6285b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i8 + 3;
        this.f6285b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f6285b = i9;
        int i16 = ((bArr[i14] & 255) << 24) | i15;
        a(5);
        return i16;
    }

    public final long i() {
        int i7 = this.f6288e;
        if (i7 != 1 && i7 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f6288e);
        }
        int i8 = this.f6285b;
        int i9 = i8 + 8;
        if (i9 > this.f6286c) {
            throw new EOFException();
        }
        this.f6285b = i8 + 1;
        byte[] bArr = this.f6284a;
        this.f6285b = i8 + 2;
        long j4 = (bArr[i8] & 255) | ((bArr[r3] & 255) << 8);
        this.f6285b = i8 + 3;
        long j7 = j4 | ((bArr[r9] & 255) << 16);
        this.f6285b = i8 + 4;
        long j8 = j7 | ((bArr[r3] & 255) << 24);
        this.f6285b = i8 + 5;
        long j9 = j8 | ((bArr[r9] & 255) << 32);
        this.f6285b = i8 + 6;
        this.f6285b = i8 + 7;
        this.f6285b = i9;
        long j10 = ((bArr[r0] & 255) << 56) | j9 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        a(1);
        return j10;
    }

    public final String j() {
        int b7 = b();
        int i7 = this.f6285b;
        int i8 = b7 + i7;
        if (i8 > this.f6286c) {
            throw new EOFException();
        }
        byte[] bArr = this.f6284a;
        i6.g.g(i7, i8, bArr.length);
        String str = new String(bArr, i7, i8 - i7, F5.a.f785a);
        this.f6285b = i8;
        return str;
    }

    public final void k(int i7) {
        d dVar = this.f6291h;
        kotlin.jvm.internal.i.b(dVar);
        Object c7 = dVar.a().c(this);
        a6.d dVar2 = new a6.d((n6.g) this.f6292i.get(this.f6287d - 1));
        i a7 = dVar.a();
        kotlin.jvm.internal.i.c(a7, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a7.e(dVar2, i7, c7);
    }

    public final int l() {
        int i7 = this.f6288e;
        if (i7 == 0 || i7 == 2) {
            int e4 = e();
            a(0);
            return e4;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f6288e);
    }

    public final long m() {
        int i7 = this.f6288e;
        if (i7 != 0 && i7 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f6288e);
        }
        long j4 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            j4 |= (r4 & Byte.MAX_VALUE) << i8;
            if ((g() & 128) == 0) {
                a(0);
                return j4;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n() {
        int i7 = this.f6288e;
        if (i7 == 0) {
            m();
            return;
        }
        if (i7 == 1) {
            i();
            return;
        }
        if (i7 != 2) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            h();
        } else {
            int b7 = this.f6285b + b();
            if (b7 > this.f6286c) {
                throw new EOFException();
            }
            this.f6285b = b7;
        }
    }

    public final void o(int i7) {
        while (this.f6285b < this.f6286c) {
            int e4 = e();
            if (e4 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i8 = e4 >> 3;
            int i9 = e4 & 7;
            if (i9 == 0) {
                this.f6288e = 0;
                m();
            } else if (i9 == 1) {
                this.f6288e = 1;
                i();
            } else if (i9 == 2) {
                int e7 = this.f6285b + e();
                if (e7 > this.f6286c) {
                    throw new EOFException();
                }
                this.f6285b = e7;
            } else {
                if (i9 == 3) {
                    int i10 = this.f6287d + 1;
                    this.f6287d = i10;
                    if (i10 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        o(i8);
                    } finally {
                    }
                    this.f6287d--;
                }
                if (i9 == 4) {
                    if (i8 != i7) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i9 != 5) {
                        throw new ProtocolException(o.c("Unexpected field encoding: ", i9));
                    }
                    this.f6288e = 5;
                    h();
                }
            }
        }
        throw new EOFException();
    }
}
