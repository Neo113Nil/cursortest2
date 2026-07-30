package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.baidu.mapauto.auth.org.spongycastle.asn1.m;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f7789a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7790b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f7791c;

    public i(int i8, InputStream inputStream) {
        this(inputStream, i8, false);
    }

    public static int a(int i8, InputStream inputStream) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            return -1;
        }
        if (read <= 127) {
            return read;
        }
        int i9 = read & 127;
        if (i9 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i9);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i10 = (i10 << 8) + read2;
        }
        if (i10 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i10 < i8) {
            return i10;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    public static int b(int i8, InputStream inputStream) {
        int i9 = i8 & 31;
        if (i9 != 31) {
            return i9;
        }
        int read = inputStream.read();
        if ((read & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i10 = 0;
        while (read >= 0 && (read & 128) != 0) {
            i10 = ((read & 127) | i10) << 7;
            read = inputStream.read();
        }
        if (read >= 0) {
            return (read & 127) | i10;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public i(InputStream inputStream, int i8, boolean z7) {
        super(inputStream);
        this.f7789a = i8;
        this.f7790b = z7;
        this.f7791c = new byte[11][];
    }

    public static e a(o1 o1Var) {
        i iVar = new i(o1Var, u1.a(o1Var), false);
        e eVar = new e();
        while (true) {
            r a8 = iVar.a();
            if (a8 == null) {
                return eVar;
            }
            eVar.f7778a.addElement(a8);
        }
    }

    public i(byte[] bArr) {
        this(bArr.length, new ByteArrayInputStream(bArr));
    }

    public i(byte[] bArr, int i8) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public final r a(int i8, int i9, int i10) {
        boolean z7 = (i8 & 32) != 0;
        o1 o1Var = new o1(i10, this);
        if ((i8 & 64) != 0) {
            return new k0(z7, i9, o1Var.c());
        }
        if ((i8 & 128) != 0) {
            return new v(u1.a(o1Var), o1Var).a(z7, i9);
        }
        if (!z7) {
            return a(i9, o1Var, this.f7791c);
        }
        if (i9 == 4) {
            e a8 = a(o1Var);
            int size = a8.f7778a.size();
            n[] nVarArr = new n[size];
            for (int i11 = 0; i11 != size; i11++) {
                nVarArr[i11] = (n) a8.a(i11);
            }
            return new b0(nVarArr);
        }
        if (i9 == 8) {
            return new n0(a(o1Var));
        }
        if (i9 == 16) {
            if (this.f7790b) {
                return new s1(o1Var.c());
            }
            e a9 = a(o1Var);
            return a9.f7778a.size() < 1 ? p0.f7820a : new l1(a9);
        }
        if (i9 == 17) {
            e a10 = a(o1Var);
            z0 z0Var = p0.f7820a;
            return a10.f7778a.size() < 1 ? p0.f7821b : new m1(a10);
        }
        throw new IOException("unknown tag " + i9 + " encountered");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r a(int i8, o1 o1Var, byte[][] bArr) {
        byte[] c8;
        int read;
        byte[] c9;
        byte[] c10;
        int i9 = 0;
        if (i8 == 10) {
            int i10 = o1Var.f7817d;
            if (i10 < bArr.length) {
                c8 = bArr[i10];
                if (c8 == null) {
                    c8 = new byte[i10];
                    bArr[i10] = c8;
                }
                int length = c8.length;
                int i11 = 0;
                while (i11 < length) {
                    int read2 = o1Var.read(c8, i11, length - i11);
                    if (read2 < 0) {
                        break;
                    }
                    i11 += read2;
                }
            } else {
                c8 = o1Var.c();
            }
            if (c8.length > 1) {
                return new f(c8);
            }
            if (c8.length == 0) {
                throw new IllegalArgumentException("ENUMERATED has zero length");
            }
            int i12 = c8[0] & 255;
            f[] fVarArr = f.f7780b;
            if (i12 >= 12) {
                return new f(com.baidu.mapauto.auth.org.spongycastle.util.a.a(c8));
            }
            f fVar = fVarArr[i12];
            if (fVar == null) {
                fVar = new f(com.baidu.mapauto.auth.org.spongycastle.util.a.a(c8));
                fVarArr[i12] = fVar;
            }
            return fVar;
        }
        if (i8 == 12) {
            return new f1(o1Var.c());
        }
        if (i8 != 30) {
            switch (i8) {
                case 1:
                    int i13 = o1Var.f7817d;
                    if (i13 < bArr.length) {
                        c9 = bArr[i13];
                        if (c9 == null) {
                            c9 = new byte[i13];
                            bArr[i13] = c9;
                        }
                        int length2 = c9.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            int read3 = o1Var.read(c9, i14, length2 - i14);
                            if (read3 >= 0) {
                                i14 += read3;
                            }
                        }
                    } else {
                        c9 = o1Var.c();
                    }
                    byte[] bArr2 = c.f7770b;
                    if (c9.length != 1) {
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    }
                    byte b8 = c9[0];
                    return b8 == 0 ? c.f7772d : (b8 & 255) == 255 ? c.f7773e : new c(c9);
                case 2:
                    return new j(o1Var.c());
                case 3:
                    int i15 = o1Var.f7817d;
                    if (i15 < 1) {
                        throw new IllegalArgumentException("truncated BIT STRING detected");
                    }
                    int read4 = o1Var.read();
                    int i16 = i15 - 1;
                    byte[] bArr3 = new byte[i16];
                    if (i16 != 0) {
                        while (i9 < i16) {
                            int read5 = o1Var.read(bArr3, i9, i16 - i9);
                            if (read5 >= 0) {
                                i9 += read5;
                            } else {
                                if (i9 == i16) {
                                    throw new EOFException("EOF encountered in middle of BIT STRING");
                                }
                                if (read4 > 0 && read4 < 8) {
                                    byte b9 = bArr3[i15 - 2];
                                    if (b9 != ((byte) ((255 << read4) & b9))) {
                                        return new j1(bArr3, read4);
                                    }
                                }
                            }
                        }
                        if (i9 == i16) {
                        }
                    }
                    return new m0(bArr3, read4);
                case 4:
                    return new v0(o1Var.c());
                case 5:
                    return t0.f7836a;
                case 6:
                    int i17 = o1Var.f7817d;
                    if (i17 < bArr.length) {
                        c10 = bArr[i17];
                        if (c10 == null) {
                            c10 = new byte[i17];
                            bArr[i17] = c10;
                        }
                        int length3 = c10.length;
                        while (i9 < length3) {
                            int read6 = o1Var.read(c10, i9, length3 - i9);
                            if (read6 >= 0) {
                                i9 += read6;
                            }
                        }
                    } else {
                        c10 = o1Var.c();
                    }
                    m mVar = (m) m.f7802c.get(new m.a(c10));
                    return mVar == null ? new m(c10) : mVar;
                default:
                    switch (i8) {
                        case 18:
                            return new u0(o1Var.c());
                        case 19:
                            return new y0(o1Var.c());
                        case 20:
                            return new d1(o1Var.c());
                        case 21:
                            return new h1(o1Var.c());
                        case 22:
                            return new s0(o1Var.c());
                        case 23:
                            return new x(o1Var.c());
                        case 24:
                            return new h(o1Var.c());
                        case 25:
                            return new r0(o1Var.c());
                        case 26:
                            return new i1(o1Var.c());
                        case 27:
                            return new q0(o1Var.c());
                        case 28:
                            return new g1(o1Var.c());
                        default:
                            throw new IOException("unknown tag " + i8 + " encountered");
                    }
            }
        }
        int i18 = o1Var.f7817d / 2;
        char[] cArr = new char[i18];
        while (i9 < i18) {
            int read7 = o1Var.read();
            if (read7 < 0 || (read = o1Var.read()) < 0) {
                break;
            }
            cArr[i9] = (char) ((read7 << 8) | (read & 255));
            i9++;
        }
        return new l0(cArr);
    }

    public final r a() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int b8 = b(read, this);
        boolean z7 = (read & 32) != 0;
        int a8 = a(this.f7789a, this);
        if (a8 >= 0) {
            try {
                return a(read, b8, a8);
            } catch (IllegalArgumentException e8) {
                throw new g("corrupted stream detected", e8);
            }
        }
        if (z7) {
            v vVar = new v(this.f7789a, new q1(this.f7789a, this));
            if ((read & 64) != 0) {
                return new y(b8, vVar.b());
            }
            if ((read & 128) != 0) {
                return vVar.a(true, b8);
            }
            if (b8 != 4) {
                if (b8 == 8) {
                    try {
                        return new n0(vVar.b());
                    } catch (IllegalArgumentException e9) {
                        throw new g(e9.getMessage(), e9);
                    }
                }
                if (b8 == 16) {
                    return new d0(vVar.b());
                }
                if (b8 == 17) {
                    return new f0(vVar.b());
                }
                throw new IOException("unknown BER object encountered");
            }
            j0 j0Var = new j0(vVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read2 = j0Var.read(bArr, 0, 4096);
                if (read2 < 0) {
                    return new b0(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, read2);
            }
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }
}
