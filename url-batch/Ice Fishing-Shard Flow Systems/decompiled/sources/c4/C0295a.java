package c4;

import C4.p;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.collections.AbstractC0627f;
import kotlin.collections.C0624c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4200a;

    /* renamed from: b, reason: collision with root package name */
    public int f4201b;

    /* renamed from: c, reason: collision with root package name */
    public int f4202c;

    /* renamed from: d, reason: collision with root package name */
    public int f4203d;

    /* renamed from: e, reason: collision with root package name */
    public int f4204e;

    /* renamed from: f, reason: collision with root package name */
    public int f4205f;

    /* renamed from: g, reason: collision with root package name */
    public int f4206g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0298d f4207h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4208i;
    public B.f j;

    public C0295a(byte[] source, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f4200a = source;
        this.f4201b = 0;
        this.f4202c = i2;
        this.f4204e = 2;
        this.f4205f = -1;
        this.f4206g = -1;
        this.f4208i = new ArrayList();
    }

    public final void a(int i2) {
        if (this.f4204e == i2) {
            this.f4204e = 6;
            return;
        }
        int i5 = this.f4201b;
        int i7 = this.f4202c;
        if (i5 > i7) {
            throw new IOException("Expected to end at " + this.f4202c + " but was " + this.f4201b);
        }
        if (i5 != i7) {
            this.f4204e = 7;
            return;
        }
        this.f4202c = this.f4206g;
        this.f4206g = -1;
        this.f4204e = 6;
    }

    public final int b() {
        if (this.f4204e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f4204e);
        }
        int i2 = this.f4202c - this.f4201b;
        this.f4204e = 6;
        this.f4202c = this.f4206g;
        this.f4206g = -1;
        return i2;
    }

    public final int c() {
        if (this.f4204e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i2 = this.f4203d + 1;
        this.f4203d = i2;
        if (i2 > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.f4208i;
        if (i2 > arrayList.size()) {
            arrayList.add(new T6.f());
        }
        int i5 = this.f4206g;
        this.f4206g = -1;
        this.f4204e = 6;
        return i5;
    }

    public final T6.i d(int i2) {
        if (this.f4204e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i5 = this.f4203d - 1;
        this.f4203d = i5;
        if (i5 < 0 || this.f4206g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f4201b == this.f4202c || i5 == 0) {
            this.f4202c = i2;
            T6.f fVar = (T6.f) this.f4208i.get(i5);
            long j = fVar.f2617e;
            return j > 0 ? fVar.e(j) : T6.i.f2618l;
        }
        throw new IOException("Expected to end at " + this.f4202c + " but was " + this.f4201b);
    }

    public final int e() {
        int i2;
        byte g7 = g();
        if (g7 >= 0) {
            return g7;
        }
        int i5 = g7 & Byte.MAX_VALUE;
        byte g8 = g();
        if (g8 >= 0) {
            i2 = g8 << 7;
        } else {
            i5 |= (g8 & Byte.MAX_VALUE) << 7;
            byte g9 = g();
            if (g9 >= 0) {
                i2 = g9 << 14;
            } else {
                i5 |= (g9 & Byte.MAX_VALUE) << 14;
                byte g10 = g();
                if (g10 < 0) {
                    int i7 = i5 | ((g10 & Byte.MAX_VALUE) << 21);
                    byte g11 = g();
                    int i8 = i7 | (g11 << 28);
                    if (g11 < 0) {
                        for (int i9 = 0; i9 < 5; i9++) {
                            if (g() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i8;
                }
                i2 = g10 << 21;
            }
        }
        return i5 | i2;
    }

    public final int f() {
        int i2 = this.f4204e;
        if (i2 == 7) {
            this.f4204e = 2;
            return this.f4205f;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f4201b < this.f4202c) {
            int e7 = e();
            if (e7 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i5 = e7 >> 3;
            this.f4205f = i5;
            int i7 = e7 & 7;
            if (i7 == 0) {
                this.f4207h = EnumC0298d.f4212e;
                this.f4204e = 0;
                return i5;
            }
            if (i7 == 1) {
                this.f4207h = EnumC0298d.f4213i;
                this.f4204e = 1;
                return i5;
            }
            if (i7 == 2) {
                this.f4207h = EnumC0298d.f4214l;
                this.f4204e = 2;
                int e8 = e();
                if (e8 < 0) {
                    throw new ProtocolException(p.g(e8, "Negative length: "));
                }
                if (this.f4206g != -1) {
                    throw new IllegalStateException();
                }
                int i8 = this.f4202c;
                this.f4206g = i8;
                int i9 = this.f4201b + e8;
                this.f4202c = i9;
                if (i9 <= i8) {
                    return this.f4205f;
                }
                throw new EOFException();
            }
            if (i7 != 3) {
                if (i7 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i7 != 5) {
                    throw new ProtocolException(p.g(i7, "Unexpected field encoding: "));
                }
                this.f4207h = EnumC0298d.f4215m;
                this.f4204e = 5;
                return i5;
            }
            o(i5);
        }
        return -1;
    }

    public final byte g() {
        int i2 = this.f4201b;
        if (i2 == this.f4202c) {
            throw new EOFException();
        }
        this.f4201b = i2 + 1;
        return this.f4200a[i2];
    }

    public final int h() {
        int i2 = this.f4204e;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f4204e);
        }
        int i5 = this.f4201b;
        int i7 = i5 + 4;
        if (i7 > this.f4202c) {
            throw new EOFException();
        }
        int i8 = i5 + 1;
        this.f4201b = i8;
        byte[] bArr = this.f4200a;
        int i9 = bArr[i5] & 255;
        int i10 = i5 + 2;
        this.f4201b = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        int i12 = i5 + 3;
        this.f4201b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f4201b = i7;
        int i14 = ((bArr[i12] & 255) << 24) | i13;
        a(5);
        return i14;
    }

    public final long i() {
        int i2 = this.f4204e;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f4204e);
        }
        int i5 = this.f4201b;
        int i7 = i5 + 8;
        if (i7 > this.f4202c) {
            throw new EOFException();
        }
        this.f4201b = i5 + 1;
        byte[] bArr = this.f4200a;
        this.f4201b = i5 + 2;
        long j = (bArr[i5] & 255) | ((bArr[r3] & 255) << 8);
        this.f4201b = i5 + 3;
        long j7 = j | ((bArr[r9] & 255) << 16);
        this.f4201b = i5 + 4;
        long j8 = j7 | ((bArr[r3] & 255) << 24);
        this.f4201b = i5 + 5;
        long j9 = j8 | ((bArr[r9] & 255) << 32);
        this.f4201b = i5 + 6;
        this.f4201b = i5 + 7;
        this.f4201b = i7;
        long j10 = ((bArr[r0] & 255) << 56) | j9 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        a(1);
        return j10;
    }

    public final String j() {
        int b7 = b();
        int i2 = this.f4201b;
        int i5 = b7 + i2;
        if (i5 > this.f4202c) {
            throw new EOFException();
        }
        byte[] bArr = this.f4200a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C0624c c0624c = AbstractC0627f.f6131d;
        int length = bArr.length;
        c0624c.getClass();
        C0624c.a(i2, i5, length);
        String str = new String(bArr, i2, i5 - i2, Charsets.UTF_8);
        this.f4201b = i5;
        return str;
    }

    public final void k(int i2) {
        EnumC0298d fieldEncoding = this.f4207h;
        Intrinsics.b(fieldEncoding);
        Object c7 = fieldEncoding.a().c(this);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        l2.c cVar = new l2.c((T6.g) this.f4208i.get(this.f4203d - 1));
        AbstractC0303i a7 = fieldEncoding.a();
        Intrinsics.c(a7, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a7.f(cVar, i2, c7);
    }

    public final int l() {
        int i2 = this.f4204e;
        if (i2 == 0 || i2 == 2) {
            int e7 = e();
            a(0);
            return e7;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f4204e);
    }

    public final long m() {
        int i2 = this.f4204e;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f4204e);
        }
        long j = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j |= (r4 & Byte.MAX_VALUE) << i5;
            if ((g() & 128) == 0) {
                a(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n() {
        int i2 = this.f4204e;
        if (i2 == 0) {
            m();
            return;
        }
        if (i2 == 1) {
            i();
            return;
        }
        if (i2 != 2) {
            if (i2 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            h();
        } else {
            int b7 = this.f4201b + b();
            if (b7 > this.f4202c) {
                throw new EOFException();
            }
            this.f4201b = b7;
        }
    }

    public final void o(int i2) {
        while (this.f4201b < this.f4202c) {
            int e7 = e();
            if (e7 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i5 = e7 >> 3;
            int i7 = e7 & 7;
            if (i7 == 0) {
                this.f4204e = 0;
                m();
            } else if (i7 == 1) {
                this.f4204e = 1;
                i();
            } else if (i7 == 2) {
                int e8 = this.f4201b + e();
                if (e8 > this.f4202c) {
                    throw new EOFException();
                }
                this.f4201b = e8;
            } else {
                if (i7 == 3) {
                    int i8 = this.f4203d + 1;
                    this.f4203d = i8;
                    if (i8 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        o(i5);
                    } finally {
                    }
                    this.f4203d--;
                }
                if (i7 == 4) {
                    if (i5 != i2) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i7 != 5) {
                        throw new ProtocolException(p.g(i7, "Unexpected field encoding: "));
                    }
                    this.f4204e = 5;
                    h();
                }
            }
        }
        throw new EOFException();
    }
}
