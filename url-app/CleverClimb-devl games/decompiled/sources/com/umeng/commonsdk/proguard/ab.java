package com.umeng.commonsdk.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: TCompactProtocol.java */
/* loaded from: classes2.dex */
public class ab extends ah {

    /* renamed from: d, reason: collision with root package name */
    private static final am f9002d = new am("");
    private static final ac e = new ac("", (byte) 0, 0);
    private static final byte[] f = new byte[16];
    private static final byte h = -126;
    private static final byte i = 1;
    private static final byte j = 31;
    private static final byte k = -32;
    private static final int l = 5;

    /* renamed from: a, reason: collision with root package name */
    byte[] f9003a;

    /* renamed from: b, reason: collision with root package name */
    byte[] f9004b;

    /* renamed from: c, reason: collision with root package name */
    byte[] f9005c;
    private g m;
    private short n;
    private ac o;
    private Boolean p;
    private final long q;
    private byte[] r;

    private int c(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    private long c(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private boolean c(byte b2) {
        int i2 = b2 & ao.m;
        return i2 == 1 || i2 == 2;
    }

    private long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private int g(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void c() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void e() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void f() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void g() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void i() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void m() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void o() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void q() throws o {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void s() throws o {
    }

    static {
        f[0] = 0;
        f[2] = 1;
        f[3] = 3;
        f[6] = 4;
        f[8] = 5;
        f[10] = 6;
        f[4] = 7;
        f[11] = 8;
        f[15] = 9;
        f[14] = 10;
        f[13] = 11;
        f[12] = 12;
    }

    /* compiled from: TCompactProtocol.java */
    public static class a implements aj {

        /* renamed from: a, reason: collision with root package name */
        private final long f9006a;

        public a() {
            this.f9006a = -1L;
        }

        public a(int i) {
            this.f9006a = i;
        }

        @Override // com.umeng.commonsdk.proguard.aj
        public ah a(av avVar) {
            return new ab(avVar, this.f9006a);
        }
    }

    /* compiled from: TCompactProtocol.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final byte f9007a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final byte f9008b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final byte f9009c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final byte f9010d = 4;
        public static final byte e = 5;
        public static final byte f = 6;
        public static final byte g = 7;
        public static final byte h = 8;
        public static final byte i = 9;
        public static final byte j = 10;
        public static final byte k = 11;
        public static final byte l = 12;

        private b() {
        }
    }

    public ab(av avVar, long j2) {
        super(avVar);
        this.m = new g(15);
        this.n = (short) 0;
        this.o = null;
        this.p = null;
        this.f9003a = new byte[5];
        this.f9004b = new byte[10];
        this.r = new byte[1];
        this.f9005c = new byte[1];
        this.q = j2;
    }

    public ab(av avVar) {
        this(avVar, -1L);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void B() {
        this.m.c();
        this.n = (short) 0;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(af afVar) throws o {
        b(h);
        d(((afVar.f9020b << 5) & (-32)) | 1);
        b(afVar.f9021c);
        a(afVar.f9019a);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(am amVar) throws o {
        this.m.a(this.n);
        this.n = (short) 0;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void b() throws o {
        this.n = this.m.a();
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ac acVar) throws o {
        if (acVar.f9012b == 2) {
            this.o = acVar;
        } else {
            a(acVar, (byte) -1);
        }
    }

    private void a(ac acVar, byte b2) throws o {
        if (b2 == -1) {
            b2 = e(acVar.f9012b);
        }
        if (acVar.f9013c > this.n && acVar.f9013c - this.n <= 15) {
            d(b2 | ((acVar.f9013c - this.n) << 4));
        } else {
            b(b2);
            a(acVar.f9013c);
        }
        this.n = acVar.f9013c;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void d() throws o {
        b((byte) 0);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ae aeVar) throws o {
        if (aeVar.f9018c == 0) {
            d(0);
            return;
        }
        b(aeVar.f9018c);
        d(e(aeVar.f9017b) | (e(aeVar.f9016a) << 4));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ad adVar) throws o {
        a(adVar.f9014a, adVar.f9015b);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(al alVar) throws o {
        a(alVar.f9031a, alVar.f9032b);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(boolean z) throws o {
        if (this.o != null) {
            a(this.o, z ? (byte) 1 : (byte) 2);
            this.o = null;
        } else {
            b(z ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(byte b2) throws o {
        b(b2);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(short s) throws o {
        b(c((int) s));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(int i2) throws o {
        b(c(i2));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(long j2) throws o {
        b(c(j2));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(double d2) throws o {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d2), bArr, 0);
        this.g.b(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(String str) throws o {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new o("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ByteBuffer byteBuffer) throws o {
        a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    private void a(byte[] bArr, int i2, int i3) throws o {
        b(i3);
        this.g.b(bArr, i2, i3);
    }

    protected void a(byte b2, int i2) throws o {
        if (i2 <= 14) {
            d(e(b2) | (i2 << 4));
        } else {
            d(e(b2) | 240);
            b(i2);
        }
    }

    private void b(int i2) throws o {
        int i3 = 0;
        while ((i2 & (-128)) != 0) {
            this.f9003a[i3] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i3++;
        }
        this.f9003a[i3] = (byte) i2;
        this.g.b(this.f9003a, 0, i3 + 1);
    }

    private void b(long j2) throws o {
        int i2 = 0;
        while (((-128) & j2) != 0) {
            this.f9004b[i2] = (byte) ((127 & j2) | 128);
            j2 >>>= 7;
            i2++;
        }
        this.f9004b[i2] = (byte) j2;
        this.g.b(this.f9004b, 0, i2 + 1);
    }

    private void a(long j2, byte[] bArr, int i2) {
        bArr[i2 + 0] = (byte) (j2 & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) ((j2 >> 24) & 255);
        bArr[i2 + 4] = (byte) ((j2 >> 32) & 255);
        bArr[i2 + 5] = (byte) ((j2 >> 40) & 255);
        bArr[i2 + 6] = (byte) ((j2 >> 48) & 255);
        bArr[i2 + 7] = (byte) ((j2 >> 56) & 255);
    }

    private void b(byte b2) throws o {
        this.r[0] = b2;
        this.g.b(this.r);
    }

    private void d(int i2) throws o {
        b((byte) i2);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public af h() throws o {
        byte u = u();
        if (u != -126) {
            throw new ai("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(u));
        }
        byte u2 = u();
        byte b2 = (byte) (u2 & j);
        if (b2 != 1) {
            throw new ai("Expected version 1 but got " + ((int) b2));
        }
        return new af(z(), (byte) ((u2 >> 5) & 3), E());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public am j() throws o {
        this.m.a(this.n);
        this.n = (short) 0;
        return f9002d;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void k() throws o {
        this.n = this.m.a();
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ac l() throws o {
        short s;
        byte u = u();
        if (u == 0) {
            return e;
        }
        short s2 = (short) ((u & 240) >> 4);
        if (s2 == 0) {
            s = v();
        } else {
            s = (short) (this.n + s2);
        }
        byte b2 = (byte) (u & ao.m);
        ac acVar = new ac("", d(b2), s);
        if (c(u)) {
            this.p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.n = acVar.f9013c;
        return acVar;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ae n() throws o {
        int E = E();
        byte u = E == 0 ? (byte) 0 : u();
        return new ae(d((byte) (u >> 4)), d((byte) (u & ao.m)), E);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ad p() throws o {
        byte u = u();
        int i2 = (u >> 4) & 15;
        if (i2 == 15) {
            i2 = E();
        }
        return new ad(d(u), i2);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public al r() throws o {
        return new al(p());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public boolean t() throws o {
        if (this.p == null) {
            return u() == 1;
        }
        boolean booleanValue = this.p.booleanValue();
        this.p = null;
        return booleanValue;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public byte u() throws o {
        if (this.g.h() > 0) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        this.g.d(this.f9005c, 0, 1);
        return this.f9005c[0];
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public short v() throws o {
        return (short) g(E());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public int w() throws o {
        return g(E());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public long x() throws o {
        return d(F());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public double y() throws o {
        byte[] bArr = new byte[8];
        this.g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public String z() throws o {
        int E = E();
        f(E);
        if (E == 0) {
            return "";
        }
        try {
            if (this.g.h() >= E) {
                String str = new String(this.g.f(), this.g.g(), E, "UTF-8");
                this.g.a(E);
                return str;
            }
            return new String(e(E), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new o("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ByteBuffer A() throws o {
        int E = E();
        f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.g.d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    private byte[] e(int i2) throws o {
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2];
        this.g.d(bArr, 0, i2);
        return bArr;
    }

    private void f(int i2) throws ai {
        if (i2 < 0) {
            throw new ai("Negative length: " + i2);
        }
        if (this.q == -1 || i2 <= this.q) {
            return;
        }
        throw new ai("Length exceeded max allowed: " + i2);
    }

    private int E() throws o {
        int i2 = 0;
        if (this.g.h() >= 5) {
            byte[] f2 = this.g.f();
            int g = this.g.g();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte b2 = f2[g + i2];
                i3 |= (b2 & Byte.MAX_VALUE) << i4;
                if ((b2 & 128) != 128) {
                    this.g.a(i2 + 1);
                    return i3;
                }
                i4 += 7;
                i2++;
            }
        } else {
            int i5 = 0;
            while (true) {
                byte u = u();
                i2 |= (u & Byte.MAX_VALUE) << i5;
                if ((u & 128) != 128) {
                    return i2;
                }
                i5 += 7;
            }
        }
    }

    private long F() throws o {
        int i2 = 0;
        long j2 = 0;
        if (this.g.h() >= 10) {
            byte[] f2 = this.g.f();
            int g = this.g.g();
            int i3 = 0;
            while (true) {
                j2 |= (r7 & Byte.MAX_VALUE) << i3;
                if ((f2[g + i2] & 128) != 128) {
                    break;
                }
                i3 += 7;
                i2++;
            }
            this.g.a(i2 + 1);
        } else {
            while (true) {
                j2 |= (r0 & Byte.MAX_VALUE) << i2;
                if ((u() & 128) != 128) {
                    break;
                }
                i2 += 7;
            }
        }
        return j2;
    }

    private long a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }

    private byte d(byte b2) throws ai {
        byte b3 = (byte) (b2 & ao.m);
        switch (b3) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return ao.m;
            case 10:
                return ao.l;
            case 11:
                return ao.k;
            case 12:
                return (byte) 12;
            default:
                throw new ai("don't know what type: " + ((int) b3));
        }
    }

    private byte e(byte b2) {
        return f[b2];
    }
}
