package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215j {

    /* renamed from: a, reason: collision with root package name */
    public int f4462a;

    /* renamed from: b, reason: collision with root package name */
    public int f4463b;

    /* renamed from: c, reason: collision with root package name */
    public int f4464c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4465d;

    public C0215j(R4.c cVar) {
        this.f4464c = 0;
        Charset charset = AbstractC0228x.f4508a;
        this.f4465d = cVar;
        cVar.f2677b = this;
    }

    public int a() {
        int i2 = this.f4464c;
        if (i2 != 0) {
            this.f4462a = i2;
            this.f4464c = 0;
        } else {
            this.f4462a = ((R4.c) this.f4465d).u();
        }
        int i3 = this.f4462a;
        if (i3 == 0 || i3 == this.f4463b) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public void b(Object obj, V v4, C0219n c0219n) {
        int i2 = this.f4463b;
        this.f4463b = ((this.f4462a >>> 3) << 3) | 4;
        try {
            v4.g(obj, this, c0219n);
            if (this.f4462a == this.f4463b) {
            } else {
                throw new C0230z("Failed to parse the message.");
            }
        } finally {
            this.f4463b = i2;
        }
    }

    public void c(Object obj, V v4, C0219n c0219n) {
        R4.c cVar = (R4.c) this.f4465d;
        int v5 = cVar.v();
        if (cVar.f2676a >= 100) {
            throw new C0230z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e3 = cVar.e(v5);
        cVar.f2676a++;
        v4.g(obj, this, c0219n);
        cVar.a(0);
        cVar.f2676a--;
        cVar.d(e3);
    }

    public void d(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Boolean.valueOf(cVar.f()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Boolean.valueOf(cVar.f()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public C0212g e() {
        x(2);
        return ((R4.c) this.f4465d).g();
    }

    public void f(InterfaceC0227w interfaceC0227w) {
        int u5;
        if ((this.f4462a & 7) != 2) {
            throw C0230z.b();
        }
        do {
            ((T) interfaceC0227w).add(e());
            R4.c cVar = (R4.c) this.f4465d;
            if (cVar.c()) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == this.f4462a);
        this.f4464c = u5;
    }

    public void g(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 1) {
            do {
                ((T) interfaceC0227w).add(Double.valueOf(cVar.h()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int v4 = cVar.v();
        if ((v4 & 7) != 0) {
            throw new C0230z("Failed to parse the message.");
        }
        int b6 = cVar.b() + v4;
        do {
            ((T) interfaceC0227w).add(Double.valueOf(cVar.h()));
        } while (cVar.b() < b6);
    }

    public void h(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Integer.valueOf(cVar.i()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Integer.valueOf(cVar.i()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public Object i(q0 q0Var, Class cls, C0219n c0219n) {
        int ordinal = q0Var.ordinal();
        R4.c cVar = (R4.c) this.f4465d;
        switch (ordinal) {
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
            case 7:
                x(0);
                return Boolean.valueOf(cVar.f());
            case 8:
                x(2);
                return cVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                x(2);
                V a6 = S.f4392c.a(cls);
                AbstractC0226v i2 = a6.i();
                c(i2, a6, c0219n);
                a6.d(i2);
                return i2;
            case 11:
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

    public void j(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 2) {
            int v4 = cVar.v();
            if ((v4 & 3) != 0) {
                throw new C0230z("Failed to parse the message.");
            }
            int b6 = cVar.b() + v4;
            do {
                ((T) interfaceC0227w).add(Integer.valueOf(cVar.j()));
            } while (cVar.b() < b6);
            return;
        }
        if (i2 != 5) {
            throw C0230z.b();
        }
        do {
            ((T) interfaceC0227w).add(Integer.valueOf(cVar.j()));
            if (cVar.c()) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == this.f4462a);
        this.f4464c = u5;
    }

    public void k(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 1) {
            do {
                ((T) interfaceC0227w).add(Long.valueOf(cVar.k()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int v4 = cVar.v();
        if ((v4 & 7) != 0) {
            throw new C0230z("Failed to parse the message.");
        }
        int b6 = cVar.b() + v4;
        do {
            ((T) interfaceC0227w).add(Long.valueOf(cVar.k()));
        } while (cVar.b() < b6);
    }

    public void l(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 2) {
            int v4 = cVar.v();
            if ((v4 & 3) != 0) {
                throw new C0230z("Failed to parse the message.");
            }
            int b6 = cVar.b() + v4;
            do {
                ((T) interfaceC0227w).add(Float.valueOf(cVar.l()));
            } while (cVar.b() < b6);
            return;
        }
        if (i2 != 5) {
            throw C0230z.b();
        }
        do {
            ((T) interfaceC0227w).add(Float.valueOf(cVar.l()));
            if (cVar.c()) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == this.f4462a);
        this.f4464c = u5;
    }

    public void m(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Integer.valueOf(cVar.m()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Integer.valueOf(cVar.m()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public void n(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Long.valueOf(cVar.n()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Long.valueOf(cVar.n()));
        } while (cVar.b() < b6);
        w(b6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r1[r4] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int o() {
        int i2;
        int i3 = this.f4463b;
        byte[] bArr = (byte[]) this.f4465d;
        int i6 = this.f4462a;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte b6 = bArr[i3];
            if (b6 >= 0) {
                this.f4463b = i7;
                return b6;
            }
            if (i6 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b6;
                if (i9 < 0) {
                    i2 = i9 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = i9 ^ (bArr[i8] << 14);
                    if (i11 >= 0) {
                        i2 = i11 ^ 16256;
                    } else {
                        i8 = i3 + 4;
                        int i12 = i11 ^ (bArr[i10] << 21);
                        if (i12 < 0) {
                            i2 = (-2080896) ^ i12;
                        } else {
                            i10 = i3 + 5;
                            byte b7 = bArr[i8];
                            int i13 = (i12 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i8 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i8] < 0) {
                                        i8 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i8] < 0) {
                                                i8 = i3 + 10;
                                            }
                                        }
                                    }
                                }
                                i2 = i13;
                            }
                            i2 = i13;
                        }
                    }
                    i8 = i10;
                }
                this.f4463b = i8;
                return i2;
            }
        }
        long j2 = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            int i15 = this.f4463b;
            if (i15 == i6) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f4463b = i15 + 1;
            j2 |= (r5 & Byte.MAX_VALUE) << i14;
            if ((bArr[i15] & 128) == 0) {
                return (int) j2;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public void p(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 2) {
            int v4 = cVar.v();
            if ((v4 & 3) != 0) {
                throw new C0230z("Failed to parse the message.");
            }
            int b6 = cVar.b() + v4;
            do {
                ((T) interfaceC0227w).add(Integer.valueOf(cVar.o()));
            } while (cVar.b() < b6);
            return;
        }
        if (i2 != 5) {
            throw C0230z.b();
        }
        do {
            ((T) interfaceC0227w).add(Integer.valueOf(cVar.o()));
            if (cVar.c()) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == this.f4462a);
        this.f4464c = u5;
    }

    public void q(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 1) {
            do {
                ((T) interfaceC0227w).add(Long.valueOf(cVar.p()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int v4 = cVar.v();
        if ((v4 & 7) != 0) {
            throw new C0230z("Failed to parse the message.");
        }
        int b6 = cVar.b() + v4;
        do {
            ((T) interfaceC0227w).add(Long.valueOf(cVar.p()));
        } while (cVar.b() < b6);
    }

    public void r(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Integer.valueOf(cVar.q()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Integer.valueOf(cVar.q()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public void s(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Long.valueOf(cVar.r()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Long.valueOf(cVar.r()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public void t(InterfaceC0227w interfaceC0227w, boolean z) {
        String s2;
        int u5;
        if ((this.f4462a & 7) != 2) {
            throw C0230z.b();
        }
        do {
            R4.c cVar = (R4.c) this.f4465d;
            if (z) {
                x(2);
                s2 = cVar.t();
            } else {
                x(2);
                s2 = cVar.s();
            }
            ((T) interfaceC0227w).add(s2);
            if (cVar.c()) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == this.f4462a);
        this.f4464c = u5;
    }

    public void u(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Integer.valueOf(cVar.v()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Integer.valueOf(cVar.v()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public void v(InterfaceC0227w interfaceC0227w) {
        int u5;
        int i2 = this.f4462a & 7;
        R4.c cVar = (R4.c) this.f4465d;
        if (i2 == 0) {
            do {
                ((T) interfaceC0227w).add(Long.valueOf(cVar.w()));
                if (cVar.c()) {
                    return;
                } else {
                    u5 = cVar.u();
                }
            } while (u5 == this.f4462a);
            this.f4464c = u5;
            return;
        }
        if (i2 != 2) {
            throw C0230z.b();
        }
        int b6 = cVar.b() + cVar.v();
        do {
            ((T) interfaceC0227w).add(Long.valueOf(cVar.w()));
        } while (cVar.b() < b6);
        w(b6);
    }

    public void w(int i2) {
        if (((R4.c) this.f4465d).b() != i2) {
            throw C0230z.e();
        }
    }

    public void x(int i2) {
        if ((this.f4462a & 7) != i2) {
            throw C0230z.b();
        }
    }

    public boolean y() {
        int i2;
        R4.c cVar = (R4.c) this.f4465d;
        if (cVar.c() || (i2 = this.f4462a) == this.f4463b) {
            return false;
        }
        return cVar.x(i2);
    }

    public void z(int i2) {
        if (i2 >= 0) {
            int i3 = this.f4463b;
            if (i2 <= this.f4462a - i3) {
                this.f4463b = i3 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public C0215j(byte[] bArr) {
        this.f4465d = bArr;
        this.f4462a = bArr.length;
        this.f4463b = 0;
    }
}
