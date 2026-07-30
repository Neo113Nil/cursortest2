package Y5;

import com.google.android.gms.internal.ads.CL;
import g1.C4523c;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3971a;

    /* renamed from: c, reason: collision with root package name */
    public int f3973c;

    /* renamed from: d, reason: collision with root package name */
    public int f3974d;

    /* renamed from: h, reason: collision with root package name */
    public d f3978h;

    /* renamed from: j, reason: collision with root package name */
    public I0.j f3979j;

    /* renamed from: b, reason: collision with root package name */
    public int f3972b = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3975e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f3976f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3977g = -1;
    public final ArrayList i = new ArrayList();

    public a(byte[] bArr, int i) {
        this.f3971a = bArr;
        this.f3973c = i;
    }

    public final void a(int i) {
        if (this.f3975e == i) {
            this.f3975e = 6;
            return;
        }
        int i4 = this.f3972b;
        int i9 = this.f3973c;
        if (i4 > i9) {
            throw new IOException("Expected to end at " + this.f3973c + " but was " + this.f3972b);
        }
        if (i4 != i9) {
            this.f3975e = 7;
            return;
        }
        this.f3973c = this.f3977g;
        this.f3977g = -1;
        this.f3975e = 6;
    }

    public final int b() {
        if (this.f3975e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f3975e);
        }
        int i = this.f3973c - this.f3972b;
        this.f3975e = 6;
        this.f3973c = this.f3977g;
        this.f3977g = -1;
        return i;
    }

    public final int c() {
        if (this.f3975e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.f3974d + 1;
        this.f3974d = i;
        if (i > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.i;
        if (i > arrayList.size()) {
            arrayList.add(new u8.e());
        }
        int i4 = this.f3977g;
        this.f3977g = -1;
        this.f3975e = 6;
        return i4;
    }

    public final u8.h d(int i) {
        if (this.f3975e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i4 = this.f3974d - 1;
        this.f3974d = i4;
        if (i4 < 0 || this.f3977g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f3972b == this.f3973c || i4 == 0) {
            this.f3973c = i;
            u8.e eVar = (u8.e) this.i.get(i4);
            long j9 = eVar.f41277u;
            return j9 > 0 ? eVar.B(j9) : u8.h.f41278w;
        }
        throw new IOException("Expected to end at " + this.f3973c + " but was " + this.f3972b);
    }

    public final int e() {
        int i;
        byte g9 = g();
        if (g9 >= 0) {
            return g9;
        }
        int i4 = g9 & Byte.MAX_VALUE;
        byte g10 = g();
        if (g10 >= 0) {
            i = g10 << 7;
        } else {
            i4 |= (g10 & Byte.MAX_VALUE) << 7;
            byte g11 = g();
            if (g11 >= 0) {
                i = g11 << 14;
            } else {
                i4 |= (g11 & Byte.MAX_VALUE) << 14;
                byte g12 = g();
                if (g12 < 0) {
                    int i9 = i4 | ((g12 & Byte.MAX_VALUE) << 21);
                    byte g13 = g();
                    int i10 = i9 | (g13 << 28);
                    if (g13 < 0) {
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (g() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i10;
                }
                i = g12 << 21;
            }
        }
        return i4 | i;
    }

    public final int f() {
        int i = this.f3975e;
        if (i == 7) {
            this.f3975e = 2;
            return this.f3976f;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f3972b < this.f3973c) {
            int e6 = e();
            if (e6 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i4 = e6 >> 3;
            this.f3976f = i4;
            int i9 = e6 & 7;
            if (i9 == 0) {
                this.f3978h = d.f3983u;
                this.f3975e = 0;
                return i4;
            }
            if (i9 == 1) {
                this.f3978h = d.f3984v;
                this.f3975e = 1;
                return i4;
            }
            if (i9 == 2) {
                this.f3978h = d.f3985w;
                this.f3975e = 2;
                int e9 = e();
                if (e9 < 0) {
                    throw new ProtocolException(CL.i(e9, "Negative length: "));
                }
                if (this.f3977g != -1) {
                    throw new IllegalStateException();
                }
                int i10 = this.f3973c;
                this.f3977g = i10;
                int i11 = this.f3972b + e9;
                this.f3973c = i11;
                if (i11 <= i10) {
                    return this.f3976f;
                }
                throw new EOFException();
            }
            if (i9 != 3) {
                if (i9 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i9 != 5) {
                    throw new ProtocolException(CL.i(i9, "Unexpected field encoding: "));
                }
                this.f3978h = d.f3986x;
                this.f3975e = 5;
                return i4;
            }
            o(i4);
        }
        return -1;
    }

    public final byte g() {
        int i = this.f3972b;
        if (i == this.f3973c) {
            throw new EOFException();
        }
        this.f3972b = i + 1;
        return this.f3971a[i];
    }

    public final int h() {
        int i = this.f3975e;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f3975e);
        }
        int i4 = this.f3972b;
        int i9 = i4 + 4;
        if (i9 > this.f3973c) {
            throw new EOFException();
        }
        int i10 = i4 + 1;
        this.f3972b = i10;
        byte[] bArr = this.f3971a;
        int i11 = bArr[i4] & 255;
        int i12 = i4 + 2;
        this.f3972b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i4 + 3;
        this.f3972b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f3972b = i9;
        int i16 = ((bArr[i14] & 255) << 24) | i15;
        a(5);
        return i16;
    }

    public final long i() {
        int i = this.f3975e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f3975e);
        }
        int i4 = this.f3972b;
        int i9 = i4 + 8;
        if (i9 > this.f3973c) {
            throw new EOFException();
        }
        this.f3972b = i4 + 1;
        byte[] bArr = this.f3971a;
        this.f3972b = i4 + 2;
        long j9 = (bArr[i4] & 255) | ((bArr[r3] & 255) << 8);
        this.f3972b = i4 + 3;
        long j10 = j9 | ((bArr[r9] & 255) << 16);
        this.f3972b = i4 + 4;
        long j11 = j10 | ((bArr[r3] & 255) << 24);
        this.f3972b = i4 + 5;
        long j12 = j11 | ((bArr[r9] & 255) << 32);
        this.f3972b = i4 + 6;
        this.f3972b = i4 + 7;
        this.f3972b = i9;
        long j13 = ((bArr[r0] & 255) << 56) | j12 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        a(1);
        return j13;
    }

    public final String j() {
        int b9 = b();
        int i = this.f3972b;
        int i4 = b9 + i;
        if (i4 > this.f3973c) {
            throw new EOFException();
        }
        byte[] bArr = this.f3971a;
        com.bumptech.glide.g.C(i, i4, bArr.length);
        String str = new String(bArr, i, i4 - i, M7.a.f1916a);
        this.f3972b = i4;
        return str;
    }

    public final void k(int i) {
        d dVar = this.f3978h;
        kotlin.jvm.internal.h.b(dVar);
        Object c4 = dVar.a().c(this);
        C4523c c4523c = new C4523c((u8.f) this.i.get(this.f3974d - 1));
        i a9 = dVar.a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a9.e(c4523c, i, c4);
    }

    public final int l() {
        int i = this.f3975e;
        if (i == 0 || i == 2) {
            int e6 = e();
            a(0);
            return e6;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f3975e);
    }

    public final long m() {
        int i = this.f3975e;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f3975e);
        }
        long j9 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j9 |= (r4 & Byte.MAX_VALUE) << i4;
            if ((g() & com.anythink.core.common.s.a.c.f16474a) == 0) {
                a(0);
                return j9;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n() {
        int i = this.f3975e;
        if (i == 0) {
            m();
            return;
        }
        if (i == 1) {
            i();
            return;
        }
        if (i != 2) {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            h();
        } else {
            int b9 = this.f3972b + b();
            if (b9 > this.f3973c) {
                throw new EOFException();
            }
            this.f3972b = b9;
        }
    }

    public final void o(int i) {
        while (this.f3972b < this.f3973c) {
            int e6 = e();
            if (e6 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i4 = e6 >> 3;
            int i9 = e6 & 7;
            if (i9 == 0) {
                this.f3975e = 0;
                m();
            } else if (i9 == 1) {
                this.f3975e = 1;
                i();
            } else if (i9 == 2) {
                int e9 = this.f3972b + e();
                if (e9 > this.f3973c) {
                    throw new EOFException();
                }
                this.f3972b = e9;
            } else {
                if (i9 == 3) {
                    int i10 = this.f3974d + 1;
                    this.f3974d = i10;
                    if (i10 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        o(i4);
                    } finally {
                    }
                    this.f3974d--;
                }
                if (i9 == 4) {
                    if (i4 != i) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i9 != 5) {
                        throw new ProtocolException(CL.i(i9, "Unexpected field encoding: "));
                    }
                    this.f3975e = 5;
                    h();
                }
            }
        }
        throw new EOFException();
    }
}
