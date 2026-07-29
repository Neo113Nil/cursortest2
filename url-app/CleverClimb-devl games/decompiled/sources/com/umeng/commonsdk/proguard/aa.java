package com.umeng.commonsdk.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: TBinaryProtocol.java */
/* loaded from: classes2.dex */
public class aa extends ah {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f8995a = -65536;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f8996b = -2147418112;
    private static final am h = new am();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f8997c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f8998d;
    protected int e;
    protected boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    @Override // com.umeng.commonsdk.proguard.ah
    public void a() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(am amVar) {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void b() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void c() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void e() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void f() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void g() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void i() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void k() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void m() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void o() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void q() {
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void s() {
    }

    /* compiled from: TBinaryProtocol.java */
    public static class a implements aj {

        /* renamed from: a, reason: collision with root package name */
        protected boolean f8999a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f9000b;

        /* renamed from: c, reason: collision with root package name */
        protected int f9001c;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f8999a = false;
            this.f9000b = true;
            this.f8999a = z;
            this.f9000b = z2;
            this.f9001c = i;
        }

        @Override // com.umeng.commonsdk.proguard.aj
        public ah a(av avVar) {
            aa aaVar = new aa(avVar, this.f8999a, this.f9000b);
            if (this.f9001c != 0) {
                aaVar.c(this.f9001c);
            }
            return aaVar;
        }
    }

    public aa(av avVar) {
        this(avVar, false, true);
    }

    public aa(av avVar, boolean z, boolean z2) {
        super(avVar);
        this.f8997c = false;
        this.f8998d = true;
        this.f = false;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.o = new byte[4];
        this.p = new byte[8];
        this.f8997c = z;
        this.f8998d = z2;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(af afVar) throws o {
        if (this.f8998d) {
            a(f8996b | afVar.f9020b);
            a(afVar.f9019a);
            a(afVar.f9021c);
        } else {
            a(afVar.f9019a);
            a(afVar.f9020b);
            a(afVar.f9021c);
        }
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ac acVar) throws o {
        a(acVar.f9012b);
        a(acVar.f9013c);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void d() throws o {
        a((byte) 0);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ae aeVar) throws o {
        a(aeVar.f9016a);
        a(aeVar.f9017b);
        a(aeVar.f9018c);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ad adVar) throws o {
        a(adVar.f9014a);
        a(adVar.f9015b);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(al alVar) throws o {
        a(alVar.f9031a);
        a(alVar.f9032b);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(boolean z) throws o {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(byte b2) throws o {
        this.i[0] = b2;
        this.g.b(this.i, 0, 1);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(short s) throws o {
        this.j[0] = (byte) ((s >> 8) & 255);
        this.j[1] = (byte) (s & 255);
        this.g.b(this.j, 0, 2);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(int i) throws o {
        this.k[0] = (byte) ((i >> 24) & 255);
        this.k[1] = (byte) ((i >> 16) & 255);
        this.k[2] = (byte) ((i >> 8) & 255);
        this.k[3] = (byte) (i & 255);
        this.g.b(this.k, 0, 4);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(long j) throws o {
        this.l[0] = (byte) ((j >> 56) & 255);
        this.l[1] = (byte) ((j >> 48) & 255);
        this.l[2] = (byte) ((j >> 40) & 255);
        this.l[3] = (byte) ((j >> 32) & 255);
        this.l[4] = (byte) ((j >> 24) & 255);
        this.l[5] = (byte) ((j >> 16) & 255);
        this.l[6] = (byte) ((j >> 8) & 255);
        this.l[7] = (byte) (j & 255);
        this.g.b(this.l, 0, 8);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(double d2) throws o {
        a(Double.doubleToLongBits(d2));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(String str) throws o {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new o("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public void a(ByteBuffer byteBuffer) throws o {
        int limit = byteBuffer.limit() - byteBuffer.position();
        a(limit);
        this.g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public af h() throws o {
        int w = w();
        if (w < 0) {
            if (((-65536) & w) != f8996b) {
                throw new ai(4, "Bad version in readMessageBegin");
            }
            return new af(z(), (byte) (w & 255), w());
        }
        if (this.f8997c) {
            throw new ai(4, "Missing version in readMessageBegin, old client?");
        }
        return new af(b(w), u(), w());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public am j() {
        return h;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ac l() throws o {
        byte u = u();
        return new ac("", u, u == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ae n() throws o {
        return new ae(u(), u(), w());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ad p() throws o {
        return new ad(u(), w());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public al r() throws o {
        return new al(u(), w());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public boolean t() throws o {
        return u() == 1;
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public byte u() throws o {
        if (this.g.h() >= 1) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        a(this.m, 0, 1);
        return this.m[0];
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public short v() throws o {
        byte[] bArr = this.n;
        int i = 0;
        if (this.g.h() >= 2) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public int w() throws o {
        byte[] bArr = this.o;
        int i = 0;
        if (this.g.h() >= 4) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(4);
        } else {
            a(this.o, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public long x() throws o {
        byte[] bArr = this.p;
        int i = 0;
        if (this.g.h() >= 8) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public double y() throws o {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public String z() throws o {
        int w = w();
        if (this.g.h() >= w) {
            try {
                String str = new String(this.g.f(), this.g.g(), w, "UTF-8");
                this.g.a(w);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new o("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return b(w);
    }

    public String b(int i) throws o {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.g.d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new o("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public ByteBuffer A() throws o {
        int w = w();
        d(w);
        if (this.g.h() >= w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.g.f(), this.g.g(), w);
            this.g.a(w);
            return wrap;
        }
        byte[] bArr = new byte[w];
        this.g.d(bArr, 0, w);
        return ByteBuffer.wrap(bArr);
    }

    private int a(byte[] bArr, int i, int i2) throws o {
        d(i2);
        return this.g.d(bArr, i, i2);
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
    }

    protected void d(int i) throws o {
        if (i < 0) {
            throw new ai("Negative length: " + i);
        }
        if (this.f) {
            this.e -= i;
            if (this.e >= 0) {
                return;
            }
            throw new ai("Message length exceeded: " + i);
        }
    }
}
