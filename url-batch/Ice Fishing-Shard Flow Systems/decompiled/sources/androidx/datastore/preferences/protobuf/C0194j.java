package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194j {

    /* renamed from: a, reason: collision with root package name */
    public int f3524a;

    /* renamed from: b, reason: collision with root package name */
    public int f3525b;

    /* renamed from: c, reason: collision with root package name */
    public int f3526c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3527d;

    public C0194j(B6.c cVar) {
        this.f3526c = 0;
        Charset charset = AbstractC0207x.f3571a;
        this.f3527d = cVar;
        cVar.f216b = this;
    }

    public int a() {
        int i2 = this.f3526c;
        if (i2 != 0) {
            this.f3524a = i2;
            this.f3526c = 0;
        } else {
            this.f3524a = ((B6.c) this.f3527d).u();
        }
        int i5 = this.f3524a;
        if (i5 == 0 || i5 == this.f3525b) {
            return Integer.MAX_VALUE;
        }
        return i5 >>> 3;
    }

    public void b(Object obj, V v7, C0198n c0198n) {
        int i2 = this.f3525b;
        this.f3525b = ((this.f3524a >>> 3) << 3) | 4;
        try {
            v7.g(obj, this, c0198n);
            if (this.f3524a == this.f3525b) {
            } else {
                throw new C0209z("Failed to parse the message.");
            }
        } finally {
            this.f3525b = i2;
        }
    }

    public void c(Object obj, V v7, C0198n c0198n) {
        B6.c cVar = (B6.c) this.f3527d;
        int v8 = cVar.v();
        if (cVar.f215a >= 100) {
            throw new C0209z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e7 = cVar.e(v8);
        cVar.f215a++;
        v7.g(obj, this, c0198n);
        cVar.a(0);
        cVar.f215a--;
        cVar.d(e7);
    }

    public void d(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Boolean.valueOf(cVar.f()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Boolean.valueOf(cVar.f()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public C0191g e() {
        x(2);
        return ((B6.c) this.f3527d).g();
    }

    public void f(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        if ((this.f3524a & 7) != 2) {
            throw C0209z.b();
        }
        do {
            ((T) interfaceC0206w).add(e());
            if (cVar.c()) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == this.f3524a);
        this.f3526c = u7;
    }

    public void g(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 1) {
            do {
                ((T) interfaceC0206w).add(Double.valueOf(cVar.h()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int v7 = cVar.v();
        if ((v7 & 7) != 0) {
            throw new C0209z("Failed to parse the message.");
        }
        int b7 = cVar.b() + v7;
        do {
            ((T) interfaceC0206w).add(Double.valueOf(cVar.h()));
        } while (cVar.b() < b7);
    }

    public void h(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Integer.valueOf(cVar.i()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Integer.valueOf(cVar.i()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public Object i(q0 q0Var, Class cls, C0198n c0198n) {
        B6.c cVar = (B6.c) this.f3527d;
        switch (q0Var.ordinal()) {
            case 0:
                x(1);
                return Double.valueOf(cVar.h());
            case 1:
                x(5);
                return Float.valueOf(cVar.l());
            case 2:
                x(0);
                return Long.valueOf(cVar.n());
            case 3:
                x(0);
                return Long.valueOf(cVar.w());
            case 4:
                x(0);
                return Integer.valueOf(cVar.m());
            case 5:
                x(1);
                return Long.valueOf(cVar.k());
            case 6:
                x(5);
                return Integer.valueOf(cVar.j());
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                x(0);
                return Boolean.valueOf(cVar.f());
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                x(2);
                return cVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                x(2);
                V a7 = S.f3454c.a(cls);
                AbstractC0205v i2 = a7.i();
                c(i2, a7, c0198n);
                a7.d(i2);
                return i2;
            case RequestError.STOP_TRACKING /* 11 */:
                return e();
            case 12:
                x(0);
                return Integer.valueOf(cVar.v());
            case 13:
                x(0);
                return Integer.valueOf(cVar.i());
            case 14:
                x(5);
                return Integer.valueOf(cVar.o());
            case 15:
                x(1);
                return Long.valueOf(cVar.p());
            case 16:
                x(0);
                return Integer.valueOf(cVar.q());
            case 17:
                x(0);
                return Long.valueOf(cVar.r());
        }
    }

    public void j(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 2) {
            int v7 = cVar.v();
            if ((v7 & 3) != 0) {
                throw new C0209z("Failed to parse the message.");
            }
            int b7 = cVar.b() + v7;
            do {
                ((T) interfaceC0206w).add(Integer.valueOf(cVar.j()));
            } while (cVar.b() < b7);
            return;
        }
        if (i2 != 5) {
            throw C0209z.b();
        }
        do {
            ((T) interfaceC0206w).add(Integer.valueOf(cVar.j()));
            if (cVar.c()) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == this.f3524a);
        this.f3526c = u7;
    }

    public void k(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 1) {
            do {
                ((T) interfaceC0206w).add(Long.valueOf(cVar.k()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int v7 = cVar.v();
        if ((v7 & 7) != 0) {
            throw new C0209z("Failed to parse the message.");
        }
        int b7 = cVar.b() + v7;
        do {
            ((T) interfaceC0206w).add(Long.valueOf(cVar.k()));
        } while (cVar.b() < b7);
    }

    public void l(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 2) {
            int v7 = cVar.v();
            if ((v7 & 3) != 0) {
                throw new C0209z("Failed to parse the message.");
            }
            int b7 = cVar.b() + v7;
            do {
                ((T) interfaceC0206w).add(Float.valueOf(cVar.l()));
            } while (cVar.b() < b7);
            return;
        }
        if (i2 != 5) {
            throw C0209z.b();
        }
        do {
            ((T) interfaceC0206w).add(Float.valueOf(cVar.l()));
            if (cVar.c()) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == this.f3524a);
        this.f3526c = u7;
    }

    public void m(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Integer.valueOf(cVar.m()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Integer.valueOf(cVar.m()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public void n(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Long.valueOf(cVar.n()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Long.valueOf(cVar.n()));
        } while (cVar.b() < b7);
        w(b7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r0[r4] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int o() {
        int i2;
        byte[] bArr = (byte[]) this.f3527d;
        int i5 = this.f3525b;
        int i7 = this.f3524a;
        if (i7 != i5) {
            int i8 = i5 + 1;
            byte b7 = bArr[i5];
            if (b7 >= 0) {
                this.f3525b = i8;
                return b7;
            }
            if (i7 - i8 >= 9) {
                int i9 = i5 + 2;
                int i10 = (bArr[i8] << 7) ^ b7;
                if (i10 < 0) {
                    i2 = i10 ^ (-128);
                } else {
                    int i11 = i5 + 3;
                    int i12 = i10 ^ (bArr[i9] << 14);
                    if (i12 >= 0) {
                        i2 = i12 ^ 16256;
                    } else {
                        i9 = i5 + 4;
                        int i13 = i12 ^ (bArr[i11] << 21);
                        if (i13 < 0) {
                            i2 = (-2080896) ^ i13;
                        } else {
                            i11 = i5 + 5;
                            byte b8 = bArr[i9];
                            int i14 = (i13 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i9 = i5 + 6;
                                if (bArr[i11] < 0) {
                                    i11 = i5 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i5 + 8;
                                        if (bArr[i11] < 0) {
                                            i11 = i5 + 9;
                                            if (bArr[i9] < 0) {
                                                i9 = i5 + 10;
                                            }
                                        }
                                    }
                                }
                                i2 = i14;
                            }
                            i2 = i14;
                        }
                    }
                    i9 = i11;
                }
                this.f3525b = i9;
                return i2;
            }
        }
        long j = 0;
        for (int i15 = 0; i15 < 64; i15 += 7) {
            int i16 = this.f3525b;
            if (i16 == i7) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f3525b = i16 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i15;
            if ((bArr[i16] & 128) == 0) {
                return (int) j;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public void p(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 2) {
            int v7 = cVar.v();
            if ((v7 & 3) != 0) {
                throw new C0209z("Failed to parse the message.");
            }
            int b7 = cVar.b() + v7;
            do {
                ((T) interfaceC0206w).add(Integer.valueOf(cVar.o()));
            } while (cVar.b() < b7);
            return;
        }
        if (i2 != 5) {
            throw C0209z.b();
        }
        do {
            ((T) interfaceC0206w).add(Integer.valueOf(cVar.o()));
            if (cVar.c()) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == this.f3524a);
        this.f3526c = u7;
    }

    public void q(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 1) {
            do {
                ((T) interfaceC0206w).add(Long.valueOf(cVar.p()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int v7 = cVar.v();
        if ((v7 & 7) != 0) {
            throw new C0209z("Failed to parse the message.");
        }
        int b7 = cVar.b() + v7;
        do {
            ((T) interfaceC0206w).add(Long.valueOf(cVar.p()));
        } while (cVar.b() < b7);
    }

    public void r(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Integer.valueOf(cVar.q()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Integer.valueOf(cVar.q()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public void s(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Long.valueOf(cVar.r()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Long.valueOf(cVar.r()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public void t(InterfaceC0206w interfaceC0206w, boolean z7) {
        String s7;
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        if ((this.f3524a & 7) != 2) {
            throw C0209z.b();
        }
        do {
            if (z7) {
                x(2);
                s7 = cVar.t();
            } else {
                x(2);
                s7 = cVar.s();
            }
            ((T) interfaceC0206w).add(s7);
            if (cVar.c()) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == this.f3524a);
        this.f3526c = u7;
    }

    public void u(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Integer.valueOf(cVar.v()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Integer.valueOf(cVar.v()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public void v(InterfaceC0206w interfaceC0206w) {
        int u7;
        B6.c cVar = (B6.c) this.f3527d;
        int i2 = this.f3524a & 7;
        if (i2 == 0) {
            do {
                ((T) interfaceC0206w).add(Long.valueOf(cVar.w()));
                if (cVar.c()) {
                    return;
                } else {
                    u7 = cVar.u();
                }
            } while (u7 == this.f3524a);
            this.f3526c = u7;
            return;
        }
        if (i2 != 2) {
            throw C0209z.b();
        }
        int b7 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0206w).add(Long.valueOf(cVar.w()));
        } while (cVar.b() < b7);
        w(b7);
    }

    public void w(int i2) {
        if (((B6.c) this.f3527d).b() != i2) {
            throw C0209z.e();
        }
    }

    public void x(int i2) {
        if ((this.f3524a & 7) != i2) {
            throw C0209z.b();
        }
    }

    public boolean y() {
        int i2;
        B6.c cVar = (B6.c) this.f3527d;
        if (cVar.c() || (i2 = this.f3524a) == this.f3525b) {
            return false;
        }
        return cVar.x(i2);
    }

    public void z(int i2) {
        if (i2 >= 0) {
            int i5 = this.f3524a;
            int i7 = this.f3525b;
            if (i2 <= i5 - i7) {
                this.f3525b = i7 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public C0194j(byte[] bArr) {
        this.f3527d = bArr;
        this.f3524a = bArr.length;
        this.f3525b = 0;
    }
}
