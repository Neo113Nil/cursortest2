package e1;

import android.util.Pair;
import e1.a;
import e1.d;
import j1.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o2.a0;
import o2.m0;
import o2.v;
import r0.n2;
import r0.s1;
import t0.a;
import t0.f0;
import w0.x;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f15843a = m0.m0("OpusHead");

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15844a;

        /* renamed from: b, reason: collision with root package name */
        public int f15845b;

        /* renamed from: c, reason: collision with root package name */
        public int f15846c;

        /* renamed from: d, reason: collision with root package name */
        public long f15847d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f15848e;

        /* renamed from: f, reason: collision with root package name */
        private final a0 f15849f;

        /* renamed from: g, reason: collision with root package name */
        private final a0 f15850g;

        /* renamed from: h, reason: collision with root package name */
        private int f15851h;

        /* renamed from: i, reason: collision with root package name */
        private int f15852i;

        public a(a0 a0Var, a0 a0Var2, boolean z6) {
            this.f15850g = a0Var;
            this.f15849f = a0Var2;
            this.f15848e = z6;
            a0Var2.O(12);
            this.f15844a = a0Var2.G();
            a0Var.O(12);
            this.f15852i = a0Var.G();
            w0.o.a(a0Var.m() == 1, "first_chunk must be 1");
            this.f15845b = -1;
        }

        public boolean a() {
            int i7 = this.f15845b + 1;
            this.f15845b = i7;
            if (i7 == this.f15844a) {
                return false;
            }
            this.f15847d = this.f15848e ? this.f15849f.H() : this.f15849f.E();
            if (this.f15845b == this.f15851h) {
                this.f15846c = this.f15850g.G();
                this.f15850g.P(4);
                int i8 = this.f15852i - 1;
                this.f15852i = i8;
                this.f15851h = i8 > 0 ? this.f15850g.G() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: e1.b$b, reason: collision with other inner class name */
    private static final class C0057b {

        /* renamed from: a, reason: collision with root package name */
        private final String f15853a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f15854b;

        /* renamed from: c, reason: collision with root package name */
        private final long f15855c;

        /* renamed from: d, reason: collision with root package name */
        private final long f15856d;

        public C0057b(String str, byte[] bArr, long j7, long j8) {
            this.f15853a = str;
            this.f15854b = bArr;
            this.f15855c = j7;
            this.f15856d = j8;
        }
    }

    private interface c {
        int a();

        int b();

        int c();
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final p[] f15857a;

        /* renamed from: b, reason: collision with root package name */
        public s1 f15858b;

        /* renamed from: c, reason: collision with root package name */
        public int f15859c;

        /* renamed from: d, reason: collision with root package name */
        public int f15860d = 0;

        public d(int i7) {
            this.f15857a = new p[i7];
        }
    }

    static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f15861a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15862b;

        /* renamed from: c, reason: collision with root package name */
        private final a0 f15863c;

        public e(a.b bVar, s1 s1Var) {
            a0 a0Var = bVar.f15842b;
            this.f15863c = a0Var;
            a0Var.O(12);
            int G = a0Var.G();
            if ("audio/raw".equals(s1Var.f20956q)) {
                int d02 = m0.d0(s1Var.F, s1Var.D);
                if (G == 0 || G % d02 != 0) {
                    o2.r.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + d02 + ", stsz sample size: " + G);
                    G = d02;
                }
            }
            this.f15861a = G == 0 ? -1 : G;
            this.f15862b = a0Var.G();
        }

        @Override // e1.b.c
        public int a() {
            return this.f15861a;
        }

        @Override // e1.b.c
        public int b() {
            return this.f15862b;
        }

        @Override // e1.b.c
        public int c() {
            int i7 = this.f15861a;
            return i7 == -1 ? this.f15863c.G() : i7;
        }
    }

    static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f15864a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15865b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15866c;

        /* renamed from: d, reason: collision with root package name */
        private int f15867d;

        /* renamed from: e, reason: collision with root package name */
        private int f15868e;

        public f(a.b bVar) {
            a0 a0Var = bVar.f15842b;
            this.f15864a = a0Var;
            a0Var.O(12);
            this.f15866c = a0Var.G() & 255;
            this.f15865b = a0Var.G();
        }

        @Override // e1.b.c
        public int a() {
            return -1;
        }

        @Override // e1.b.c
        public int b() {
            return this.f15865b;
        }

        @Override // e1.b.c
        public int c() {
            int i7 = this.f15866c;
            if (i7 == 8) {
                return this.f15864a.C();
            }
            if (i7 == 16) {
                return this.f15864a.I();
            }
            int i8 = this.f15867d;
            this.f15867d = i8 + 1;
            if (i8 % 2 != 0) {
                return this.f15868e & 15;
            }
            int C = this.f15864a.C();
            this.f15868e = C;
            return (C & 240) >> 4;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final int f15869a;

        /* renamed from: b, reason: collision with root package name */
        private final long f15870b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15871c;

        public g(int i7, long j7, int i8) {
            this.f15869a = i7;
            this.f15870b = j7;
            this.f15871c = i8;
        }
    }

    public static List<r> A(a.C0056a c0056a, x xVar, long j7, v0.m mVar, boolean z6, boolean z7, l4.f<o, o> fVar) {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c0056a.f15841d.size(); i7++) {
            a.C0056a c0056a2 = c0056a.f15841d.get(i7);
            if (c0056a2.f15838a == 1953653099 && (apply = fVar.apply(z(c0056a2, (a.b) o2.a.e(c0056a.g(1836476516)), j7, mVar, z6, z7))) != null) {
                arrayList.add(v(apply, (a.C0056a) o2.a.e(((a.C0056a) o2.a.e(((a.C0056a) o2.a.e(c0056a2.f(1835297121))).f(1835626086))).f(1937007212)), xVar));
            }
        }
        return arrayList;
    }

    public static Pair<j1.a, j1.a> B(a.b bVar) {
        a0 a0Var = bVar.f15842b;
        a0Var.O(8);
        j1.a aVar = null;
        j1.a aVar2 = null;
        while (a0Var.a() >= 8) {
            int e7 = a0Var.e();
            int m7 = a0Var.m();
            int m8 = a0Var.m();
            if (m8 == 1835365473) {
                a0Var.O(e7);
                aVar = C(a0Var, e7 + m7);
            } else if (m8 == 1936553057) {
                a0Var.O(e7);
                aVar2 = u(a0Var, e7 + m7);
            }
            a0Var.O(e7 + m7);
        }
        return Pair.create(aVar, aVar2);
    }

    private static j1.a C(a0 a0Var, int i7) {
        a0Var.P(8);
        e(a0Var);
        while (a0Var.e() < i7) {
            int e7 = a0Var.e();
            int m7 = a0Var.m();
            if (a0Var.m() == 1768715124) {
                a0Var.O(e7);
                return l(a0Var, e7 + m7);
            }
            a0Var.O(e7 + m7);
        }
        return null;
    }

    private static void D(a0 a0Var, int i7, int i8, int i9, int i10, int i11, v0.m mVar, d dVar, int i12) {
        v0.m mVar2;
        int i13;
        int i14;
        byte[] bArr;
        float f7;
        List<byte[]> list;
        String str;
        int i15 = i8;
        int i16 = i9;
        v0.m mVar3 = mVar;
        d dVar2 = dVar;
        a0Var.O(i15 + 8 + 8);
        a0Var.P(16);
        int I = a0Var.I();
        int I2 = a0Var.I();
        a0Var.P(50);
        int e7 = a0Var.e();
        int i17 = i7;
        if (i17 == 1701733238) {
            Pair<Integer, p> s7 = s(a0Var, i15, i16);
            if (s7 != null) {
                i17 = ((Integer) s7.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.g(((p) s7.second).f15982b);
                dVar2.f15857a[i12] = (p) s7.second;
            }
            a0Var.O(e7);
        }
        String str2 = "video/3gpp";
        String str3 = i17 == 1831958048 ? "video/mpeg" : i17 == 1211250227 ? "video/3gpp" : null;
        float f8 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        ByteBuffer byteBuffer = null;
        C0057b c0057b = null;
        boolean z6 = false;
        while (true) {
            if (e7 - i15 >= i16) {
                mVar2 = mVar3;
                break;
            }
            a0Var.O(e7);
            int e8 = a0Var.e();
            String str5 = str2;
            int m7 = a0Var.m();
            if (m7 == 0) {
                mVar2 = mVar3;
                if (a0Var.e() - i15 == i16) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            w0.o.a(m7 > 0, "childAtomSize must be positive");
            int m8 = a0Var.m();
            if (m8 == 1635148611) {
                w0.o.a(str3 == null, null);
                a0Var.O(e8 + 8);
                p2.a b7 = p2.a.b(a0Var);
                list2 = b7.f19972a;
                dVar2.f15859c = b7.f19973b;
                if (!z6) {
                    f8 = b7.f19976e;
                }
                str4 = b7.f19977f;
                str = "video/avc";
            } else if (m8 == 1752589123) {
                w0.o.a(str3 == null, null);
                a0Var.O(e8 + 8);
                p2.f a7 = p2.f.a(a0Var);
                list2 = a7.f20002a;
                dVar2.f15859c = a7.f20003b;
                if (!z6) {
                    f8 = a7.f20006e;
                }
                str4 = a7.f20007f;
                str = "video/hevc";
            } else {
                if (m8 == 1685480259 || m8 == 1685485123) {
                    i13 = I2;
                    i14 = i17;
                    bArr = bArr2;
                    f7 = f8;
                    list = list2;
                    p2.d a8 = p2.d.a(a0Var);
                    if (a8 != null) {
                        str4 = a8.f19987c;
                        str3 = "video/dolby-vision";
                    }
                } else if (m8 == 1987076931) {
                    w0.o.a(str3 == null, null);
                    str = i17 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (m8 == 1635135811) {
                    w0.o.a(str3 == null, null);
                    str = "video/av01";
                } else if (m8 == 1668050025) {
                    ByteBuffer a9 = byteBuffer == null ? a() : byteBuffer;
                    a9.position(21);
                    a9.putShort(a0Var.y());
                    a9.putShort(a0Var.y());
                    byteBuffer = a9;
                    i13 = I2;
                    i14 = i17;
                    e7 += m7;
                    i15 = i8;
                    i16 = i9;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i17 = i14;
                    I2 = i13;
                } else if (m8 == 1835295606) {
                    ByteBuffer a10 = byteBuffer == null ? a() : byteBuffer;
                    short y6 = a0Var.y();
                    short y7 = a0Var.y();
                    short y8 = a0Var.y();
                    i14 = i17;
                    short y9 = a0Var.y();
                    short y10 = a0Var.y();
                    List<byte[]> list3 = list2;
                    short y11 = a0Var.y();
                    byte[] bArr3 = bArr2;
                    short y12 = a0Var.y();
                    float f9 = f8;
                    short y13 = a0Var.y();
                    long E = a0Var.E();
                    long E2 = a0Var.E();
                    i13 = I2;
                    a10.position(1);
                    a10.putShort(y10);
                    a10.putShort(y11);
                    a10.putShort(y6);
                    a10.putShort(y7);
                    a10.putShort(y8);
                    a10.putShort(y9);
                    a10.putShort(y12);
                    a10.putShort(y13);
                    a10.putShort((short) (E / 10000));
                    a10.putShort((short) (E2 / 10000));
                    byteBuffer = a10;
                    list2 = list3;
                    bArr2 = bArr3;
                    f8 = f9;
                    e7 += m7;
                    i15 = i8;
                    i16 = i9;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i17 = i14;
                    I2 = i13;
                } else {
                    i13 = I2;
                    i14 = i17;
                    bArr = bArr2;
                    f7 = f8;
                    list = list2;
                    if (m8 == 1681012275) {
                        w0.o.a(str3 == null, null);
                        str3 = str5;
                    } else if (m8 == 1702061171) {
                        w0.o.a(str3 == null, null);
                        c0057b = i(a0Var, e8);
                        String str6 = c0057b.f15853a;
                        byte[] bArr4 = c0057b.f15854b;
                        list2 = bArr4 != null ? m4.q.y(bArr4) : list;
                        str3 = str6;
                        bArr2 = bArr;
                        f8 = f7;
                        e7 += m7;
                        i15 = i8;
                        i16 = i9;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i17 = i14;
                        I2 = i13;
                    } else if (m8 == 1885434736) {
                        f8 = q(a0Var, e8);
                        list2 = list;
                        bArr2 = bArr;
                        z6 = true;
                        e7 += m7;
                        i15 = i8;
                        i16 = i9;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i17 = i14;
                        I2 = i13;
                    } else if (m8 == 1937126244) {
                        bArr2 = r(a0Var, e8, m7);
                        list2 = list;
                        f8 = f7;
                        e7 += m7;
                        i15 = i8;
                        i16 = i9;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i17 = i14;
                        I2 = i13;
                    } else if (m8 == 1936995172) {
                        int C = a0Var.C();
                        a0Var.P(3);
                        if (C == 0) {
                            int C2 = a0Var.C();
                            if (C2 == 0) {
                                i18 = 0;
                            } else if (C2 == 1) {
                                i18 = 1;
                            } else if (C2 == 2) {
                                i18 = 2;
                            } else if (C2 == 3) {
                                i18 = 3;
                            }
                        }
                    } else if (m8 == 1668246642) {
                        int m9 = a0Var.m();
                        if (m9 == 1852009592 || m9 == 1852009571) {
                            int I3 = a0Var.I();
                            int I4 = a0Var.I();
                            a0Var.P(2);
                            boolean z7 = m7 == 19 && (a0Var.C() & 128) != 0;
                            i19 = p2.c.b(I3);
                            i20 = z7 ? 1 : 2;
                            i21 = p2.c.c(I4);
                        } else {
                            o2.r.i("AtomParsers", "Unsupported color type: " + e1.a.a(m9));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f8 = f7;
                e7 += m7;
                i15 = i8;
                i16 = i9;
                dVar2 = dVar;
                str2 = str5;
                mVar3 = mVar2;
                i17 = i14;
                I2 = i13;
            }
            str3 = str;
            i13 = I2;
            i14 = i17;
            e7 += m7;
            i15 = i8;
            i16 = i9;
            dVar2 = dVar;
            str2 = str5;
            mVar3 = mVar2;
            i17 = i14;
            I2 = i13;
        }
        int i22 = I2;
        byte[] bArr5 = bArr2;
        float f10 = f8;
        List<byte[]> list4 = list2;
        if (str3 == null) {
            return;
        }
        s1.b M = new s1.b().R(i10).e0(str3).I(str4).j0(I).Q(i22).a0(f10).d0(i11).b0(bArr5).h0(i18).T(list4).M(mVar2);
        int i23 = i19;
        int i24 = i20;
        int i25 = i21;
        if (i23 != -1 || i24 != -1 || i25 != -1 || byteBuffer != null) {
            M.J(new p2.c(i23, i24, i25, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c0057b != null) {
            M.G(o4.d.j(c0057b.f15855c)).Z(o4.d.j(c0057b.f15856d));
        }
        dVar.f15858b = M.E();
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j7, long j8, long j9) {
        int length = jArr.length - 1;
        return jArr[0] <= j8 && j8 < jArr[m0.q(4, 0, length)] && jArr[m0.q(jArr.length - 4, 0, length)] < j9 && j9 <= j7;
    }

    private static int c(a0 a0Var, int i7, int i8, int i9) {
        int e7 = a0Var.e();
        w0.o.a(e7 >= i8, null);
        while (e7 - i8 < i9) {
            a0Var.O(e7);
            int m7 = a0Var.m();
            w0.o.a(m7 > 0, "childAtomSize must be positive");
            if (a0Var.m() == i7) {
                return e7;
            }
            e7 += m7;
        }
        return -1;
    }

    private static int d(int i7) {
        if (i7 == 1936684398) {
            return 1;
        }
        if (i7 == 1986618469) {
            return 2;
        }
        if (i7 == 1952807028 || i7 == 1935832172 || i7 == 1937072756 || i7 == 1668047728) {
            return 3;
        }
        return i7 == 1835365473 ? 5 : -1;
    }

    public static void e(a0 a0Var) {
        int e7 = a0Var.e();
        a0Var.P(4);
        if (a0Var.m() != 1751411826) {
            e7 += 4;
        }
        a0Var.O(e7);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(a0 a0Var, int i7, int i8, int i9, int i10, String str, boolean z6, v0.m mVar, d dVar, int i11) {
        int i12;
        int m7;
        int i13;
        int i14;
        int i15;
        s1 E;
        int i16 = i8;
        int i17 = i9;
        v0.m mVar2 = mVar;
        a0Var.O(i16 + 8 + 8);
        if (z6) {
            i12 = a0Var.I();
            a0Var.P(6);
        } else {
            a0Var.P(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            int I = a0Var.I();
            a0Var.P(6);
            int D = a0Var.D();
            a0Var.O(a0Var.e() - 4);
            m7 = a0Var.m();
            if (i12 == 1) {
                a0Var.P(16);
            }
            i13 = D;
            i14 = I;
        } else {
            if (i12 != 2) {
                return;
            }
            a0Var.P(16);
            i13 = (int) Math.round(a0Var.l());
            i14 = a0Var.G();
            a0Var.P(20);
            m7 = 0;
        }
        int e7 = a0Var.e();
        int i18 = i7;
        if (i18 == 1701733217) {
            Pair<Integer, p> s7 = s(a0Var, i16, i17);
            if (s7 != null) {
                i18 = ((Integer) s7.first).intValue();
                mVar2 = mVar2 == null ? null : mVar2.g(((p) s7.second).f15982b);
                dVar.f15857a[i11] = (p) s7.second;
            }
            a0Var.O(e7);
        }
        String str2 = "audio/raw";
        if (i18 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i18 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i18 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i18 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i18 == 1685353320 || i18 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i18 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i18 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i18 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i18 != 1935767394) {
                if (i18 == 1819304813 || i18 == 1936684916) {
                    i15 = 2;
                } else if (i18 == 1953984371) {
                    i15 = 268435456;
                } else if (i18 == 778924082 || i18 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i18 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i18 == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (i18 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i18 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i18 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i18 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i18 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i18 == 1835823201) {
                    str2 = "audio/true-hd";
                } else {
                    i15 = -1;
                    str2 = null;
                }
                String str3 = str2;
                C0057b c0057b = null;
                String str4 = null;
                List<byte[]> list = null;
                while (e7 - i16 < i17) {
                    a0Var.O(e7);
                    int m8 = a0Var.m();
                    w0.o.a(m8 > 0, "childAtomSize must be positive");
                    int m9 = a0Var.m();
                    if (m9 == 1835557187) {
                        int i19 = m8 - 13;
                        byte[] bArr = new byte[i19];
                        a0Var.O(e7 + 13);
                        a0Var.j(bArr, 0, i19);
                        list = m4.q.y(bArr);
                    } else if (m9 == 1702061171 || (z6 && m9 == 2002876005)) {
                        int c7 = m9 == 1702061171 ? e7 : c(a0Var, 1702061171, e7, m8);
                        if (c7 != -1) {
                            c0057b = i(a0Var, c7);
                            str3 = c0057b.f15853a;
                            byte[] bArr2 = c0057b.f15854b;
                            if (bArr2 != null) {
                                if ("audio/mp4a-latm".equals(str3)) {
                                    a.b f7 = t0.a.f(bArr2);
                                    i13 = f7.f21667a;
                                    i14 = f7.f21668b;
                                    str4 = f7.f21669c;
                                }
                                list = m4.q.y(bArr2);
                            }
                        }
                        e7 += m8;
                        i16 = i8;
                        i17 = i9;
                    } else {
                        if (m9 == 1684103987) {
                            a0Var.O(e7 + 8);
                            E = t0.b.c(a0Var, Integer.toString(i10), str, mVar2);
                        } else if (m9 == 1684366131) {
                            a0Var.O(e7 + 8);
                            E = t0.b.g(a0Var, Integer.toString(i10), str, mVar2);
                        } else if (m9 == 1684103988) {
                            a0Var.O(e7 + 8);
                            E = t0.c.b(a0Var, Integer.toString(i10), str, mVar2);
                        } else if (m9 == 1684892784) {
                            if (m7 <= 0) {
                                throw n2.a("Invalid sample rate for Dolby TrueHD MLP stream: " + m7, null);
                            }
                            i13 = m7;
                            i14 = 2;
                        } else if (m9 == 1684305011) {
                            E = new s1.b().R(i10).e0(str3).H(i14).f0(i13).M(mVar2).V(str).E();
                        } else if (m9 == 1682927731) {
                            int i20 = m8 - 8;
                            byte[] bArr3 = f15843a;
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i20);
                            a0Var.O(e7 + 8);
                            a0Var.j(copyOf, bArr3.length, i20);
                            list = f0.a(copyOf);
                        } else if (m9 == 1684425825) {
                            int i21 = m8 - 12;
                            byte[] bArr4 = new byte[i21 + 4];
                            bArr4[0] = 102;
                            bArr4[1] = 76;
                            bArr4[2] = 97;
                            bArr4[3] = 67;
                            a0Var.O(e7 + 12);
                            a0Var.j(bArr4, 4, i21);
                            list = m4.q.y(bArr4);
                            e7 += m8;
                            i16 = i8;
                            i17 = i9;
                        } else {
                            if (m9 == 1634492771) {
                                int i22 = m8 - 12;
                                byte[] bArr5 = new byte[i22];
                                a0Var.O(e7 + 12);
                                a0Var.j(bArr5, 0, i22);
                                Pair<Integer, Integer> g7 = o2.e.g(bArr5);
                                i13 = ((Integer) g7.first).intValue();
                                int intValue = ((Integer) g7.second).intValue();
                                list = m4.q.y(bArr5);
                                i14 = intValue;
                            }
                            e7 += m8;
                            i16 = i8;
                            i17 = i9;
                        }
                        dVar.f15858b = E;
                        e7 += m8;
                        i16 = i8;
                        i17 = i9;
                    }
                    e7 += m8;
                    i16 = i8;
                    i17 = i9;
                }
                if (dVar.f15858b == null || str3 == null) {
                }
                s1.b V = new s1.b().R(i10).e0(str3).I(str4).H(i14).f0(i13).Y(i15).T(list).M(mVar2).V(str);
                if (c0057b != null) {
                    V.G(o4.d.j(c0057b.f15855c)).Z(o4.d.j(c0057b.f15856d));
                }
                dVar.f15858b = V.E();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i15 = -1;
        String str32 = str2;
        C0057b c0057b2 = null;
        String str42 = null;
        List<byte[]> list2 = null;
        while (e7 - i16 < i17) {
        }
        if (dVar.f15858b == null) {
        }
    }

    static Pair<Integer, p> g(a0 a0Var, int i7, int i8) {
        int i9 = i7 + 8;
        String str = null;
        Integer num = null;
        int i10 = -1;
        int i11 = 0;
        while (i9 - i7 < i8) {
            a0Var.O(i9);
            int m7 = a0Var.m();
            int m8 = a0Var.m();
            if (m8 == 1718775137) {
                num = Integer.valueOf(a0Var.m());
            } else if (m8 == 1935894637) {
                a0Var.P(4);
                str = a0Var.z(4);
            } else if (m8 == 1935894633) {
                i10 = i9;
                i11 = m7;
            }
            i9 += m7;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        w0.o.a(num != null, "frma atom is mandatory");
        w0.o.a(i10 != -1, "schi atom is mandatory");
        p t6 = t(a0Var, i10, i11, str);
        w0.o.a(t6 != null, "tenc atom is mandatory");
        return Pair.create(num, (p) m0.j(t6));
    }

    private static Pair<long[], long[]> h(a.C0056a c0056a) {
        a.b g7 = c0056a.g(1701606260);
        if (g7 == null) {
            return null;
        }
        a0 a0Var = g7.f15842b;
        a0Var.O(8);
        int c7 = e1.a.c(a0Var.m());
        int G = a0Var.G();
        long[] jArr = new long[G];
        long[] jArr2 = new long[G];
        for (int i7 = 0; i7 < G; i7++) {
            jArr[i7] = c7 == 1 ? a0Var.H() : a0Var.E();
            jArr2[i7] = c7 == 1 ? a0Var.v() : a0Var.m();
            if (a0Var.y() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            a0Var.P(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0057b i(a0 a0Var, int i7) {
        a0Var.O(i7 + 8 + 4);
        a0Var.P(1);
        j(a0Var);
        a0Var.P(2);
        int C = a0Var.C();
        if ((C & 128) != 0) {
            a0Var.P(2);
        }
        if ((C & 64) != 0) {
            a0Var.P(a0Var.C());
        }
        if ((C & 32) != 0) {
            a0Var.P(2);
        }
        a0Var.P(1);
        j(a0Var);
        String h7 = v.h(a0Var.C());
        if ("audio/mpeg".equals(h7) || "audio/vnd.dts".equals(h7) || "audio/vnd.dts.hd".equals(h7)) {
            return new C0057b(h7, null, -1L, -1L);
        }
        a0Var.P(4);
        long E = a0Var.E();
        long E2 = a0Var.E();
        a0Var.P(1);
        int j7 = j(a0Var);
        byte[] bArr = new byte[j7];
        a0Var.j(bArr, 0, j7);
        return new C0057b(h7, bArr, E2 > 0 ? E2 : -1L, E > 0 ? E : -1L);
    }

    private static int j(a0 a0Var) {
        int C = a0Var.C();
        int i7 = C & 127;
        while ((C & 128) == 128) {
            C = a0Var.C();
            i7 = (i7 << 7) | (C & 127);
        }
        return i7;
    }

    private static int k(a0 a0Var) {
        a0Var.O(16);
        return a0Var.m();
    }

    private static j1.a l(a0 a0Var, int i7) {
        a0Var.P(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.e() < i7) {
            a.b c7 = h.c(a0Var);
            if (c7 != null) {
                arrayList.add(c7);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j1.a(arrayList);
    }

    private static Pair<Long, String> m(a0 a0Var) {
        a0Var.O(8);
        int c7 = e1.a.c(a0Var.m());
        a0Var.P(c7 == 0 ? 8 : 16);
        long E = a0Var.E();
        a0Var.P(c7 == 0 ? 4 : 8);
        int I = a0Var.I();
        return Pair.create(Long.valueOf(E), "" + ((char) (((I >> 10) & 31) + 96)) + ((char) (((I >> 5) & 31) + 96)) + ((char) ((I & 31) + 96)));
    }

    public static j1.a n(a.C0056a c0056a) {
        a.b g7 = c0056a.g(1751411826);
        a.b g8 = c0056a.g(1801812339);
        a.b g9 = c0056a.g(1768715124);
        if (g7 == null || g8 == null || g9 == null || k(g7.f15842b) != 1835299937) {
            return null;
        }
        a0 a0Var = g8.f15842b;
        a0Var.O(12);
        int m7 = a0Var.m();
        String[] strArr = new String[m7];
        for (int i7 = 0; i7 < m7; i7++) {
            int m8 = a0Var.m();
            a0Var.P(4);
            strArr[i7] = a0Var.z(m8 - 8);
        }
        a0 a0Var2 = g9.f15842b;
        a0Var2.O(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int e7 = a0Var2.e();
            int m9 = a0Var2.m();
            int m10 = a0Var2.m() - 1;
            if (m10 < 0 || m10 >= m7) {
                o2.r.i("AtomParsers", "Skipped metadata with unknown key index: " + m10);
            } else {
                p1.a f7 = h.f(a0Var2, e7 + m9, strArr[m10]);
                if (f7 != null) {
                    arrayList.add(f7);
                }
            }
            a0Var2.O(e7 + m9);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j1.a(arrayList);
    }

    private static void o(a0 a0Var, int i7, int i8, int i9, d dVar) {
        a0Var.O(i8 + 8 + 8);
        if (i7 == 1835365492) {
            a0Var.w();
            String w6 = a0Var.w();
            if (w6 != null) {
                dVar.f15858b = new s1.b().R(i9).e0(w6).E();
            }
        }
    }

    private static long p(a0 a0Var) {
        a0Var.O(8);
        a0Var.P(e1.a.c(a0Var.m()) != 0 ? 16 : 8);
        return a0Var.E();
    }

    private static float q(a0 a0Var, int i7) {
        a0Var.O(i7 + 8);
        return a0Var.G() / a0Var.G();
    }

    private static byte[] r(a0 a0Var, int i7, int i8) {
        int i9 = i7 + 8;
        while (i9 - i7 < i8) {
            a0Var.O(i9);
            int m7 = a0Var.m();
            if (a0Var.m() == 1886547818) {
                return Arrays.copyOfRange(a0Var.d(), i9, m7 + i9);
            }
            i9 += m7;
        }
        return null;
    }

    private static Pair<Integer, p> s(a0 a0Var, int i7, int i8) {
        Pair<Integer, p> g7;
        int e7 = a0Var.e();
        while (e7 - i7 < i8) {
            a0Var.O(e7);
            int m7 = a0Var.m();
            w0.o.a(m7 > 0, "childAtomSize must be positive");
            if (a0Var.m() == 1936289382 && (g7 = g(a0Var, e7, m7)) != null) {
                return g7;
            }
            e7 += m7;
        }
        return null;
    }

    private static p t(a0 a0Var, int i7, int i8, String str) {
        int i9;
        int i10;
        int i11 = i7 + 8;
        while (true) {
            byte[] bArr = null;
            if (i11 - i7 >= i8) {
                return null;
            }
            a0Var.O(i11);
            int m7 = a0Var.m();
            if (a0Var.m() == 1952804451) {
                int c7 = e1.a.c(a0Var.m());
                a0Var.P(1);
                if (c7 == 0) {
                    a0Var.P(1);
                    i10 = 0;
                    i9 = 0;
                } else {
                    int C = a0Var.C();
                    i9 = C & 15;
                    i10 = (C & 240) >> 4;
                }
                boolean z6 = a0Var.C() == 1;
                int C2 = a0Var.C();
                byte[] bArr2 = new byte[16];
                a0Var.j(bArr2, 0, 16);
                if (z6 && C2 == 0) {
                    int C3 = a0Var.C();
                    bArr = new byte[C3];
                    a0Var.j(bArr, 0, C3);
                }
                return new p(z6, str, C2, bArr2, i10, i9, bArr);
            }
            i11 += m7;
        }
    }

    private static j1.a u(a0 a0Var, int i7) {
        a0Var.P(12);
        while (a0Var.e() < i7) {
            int e7 = a0Var.e();
            int m7 = a0Var.m();
            if (a0Var.m() == 1935766900) {
                if (m7 < 14) {
                    return null;
                }
                a0Var.P(5);
                int C = a0Var.C();
                if (C != 12 && C != 13) {
                    return null;
                }
                float f7 = C == 12 ? 240.0f : 120.0f;
                a0Var.P(1);
                return new j1.a(new p1.e(f7, a0Var.C()));
            }
            a0Var.O(e7 + m7);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0431 A[EDGE_INSN: B:97:0x0431->B:98:0x0431 BREAK  A[LOOP:2: B:76:0x03c7->B:92:0x042a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static r v(o oVar, a.C0056a c0056a, x xVar) {
        c fVar;
        boolean z6;
        int i7;
        int i8;
        int i9;
        int a7;
        int i10;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z8;
        int i15;
        o oVar2;
        int i16;
        long[] jArr;
        int[] iArr;
        int i17;
        long j7;
        long[] jArr2;
        int[] iArr2;
        int i18;
        int i19;
        long[] jArr3;
        int i20;
        int i21;
        long[] jArr4;
        int i22;
        boolean z9;
        int i23;
        long[] jArr5;
        int i24;
        long[] jArr6;
        int[] iArr3;
        int i25;
        int i26;
        boolean z10;
        a.b g7 = c0056a.g(1937011578);
        if (g7 != null) {
            fVar = new e(g7, oVar.f15975f);
        } else {
            a.b g8 = c0056a.g(1937013298);
            if (g8 == null) {
                throw n2.a("Track has no sample table size information", null);
            }
            fVar = new f(g8);
        }
        int b7 = fVar.b();
        if (b7 == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        a.b g9 = c0056a.g(1937007471);
        if (g9 == null) {
            g9 = (a.b) o2.a.e(c0056a.g(1668232756));
            z6 = true;
        } else {
            z6 = false;
        }
        a0 a0Var = g9.f15842b;
        a0 a0Var2 = ((a.b) o2.a.e(c0056a.g(1937011555))).f15842b;
        a0 a0Var3 = ((a.b) o2.a.e(c0056a.g(1937011827))).f15842b;
        a.b g10 = c0056a.g(1937011571);
        a0 a0Var4 = g10 != null ? g10.f15842b : null;
        a.b g11 = c0056a.g(1668576371);
        a0 a0Var5 = g11 != null ? g11.f15842b : null;
        a aVar = new a(a0Var2, a0Var, z6);
        a0Var3.O(12);
        int G = a0Var3.G() - 1;
        int G2 = a0Var3.G();
        int G3 = a0Var3.G();
        if (a0Var5 != null) {
            a0Var5.O(12);
            i7 = a0Var5.G();
        } else {
            i7 = 0;
        }
        if (a0Var4 != null) {
            a0Var4.O(12);
            i8 = a0Var4.G();
            if (i8 > 0) {
                i9 = a0Var4.G() - 1;
                a7 = fVar.a();
                String str = oVar.f15975f.f20956q;
                if (a7 == -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && G == 0 && i7 == 0 && i8 == 0)) {
                    i10 = i8;
                    z7 = true;
                } else {
                    i10 = i8;
                    z7 = false;
                }
                if (z7) {
                    long[] jArr7 = new long[b7];
                    int[] iArr4 = new int[b7];
                    long[] jArr8 = new long[b7];
                    int[] iArr5 = new int[b7];
                    int i27 = i9;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    long j8 = 0;
                    long j9 = 0;
                    int i33 = i7;
                    int i34 = G3;
                    int i35 = G2;
                    int i36 = G;
                    int i37 = i10;
                    while (true) {
                        i11 = i36;
                        if (i28 >= b7) {
                            i12 = i35;
                            i13 = i30;
                            i14 = i31;
                            break;
                        }
                        long j10 = j9;
                        int i38 = i31;
                        boolean z11 = true;
                        while (i38 == 0) {
                            z11 = aVar.a();
                            if (!z11) {
                                break;
                            }
                            int i39 = i35;
                            long j11 = aVar.f15847d;
                            i38 = aVar.f15846c;
                            j10 = j11;
                            i35 = i39;
                            i34 = i34;
                            b7 = b7;
                        }
                        int i40 = b7;
                        i12 = i35;
                        int i41 = i34;
                        if (!z11) {
                            o2.r.i("AtomParsers", "Unexpected end of chunk data");
                            jArr7 = Arrays.copyOf(jArr7, i28);
                            iArr4 = Arrays.copyOf(iArr4, i28);
                            jArr8 = Arrays.copyOf(jArr8, i28);
                            iArr5 = Arrays.copyOf(iArr5, i28);
                            b7 = i28;
                            i13 = i30;
                            i14 = i38;
                            break;
                        }
                        if (a0Var5 != null) {
                            while (i32 == 0 && i33 > 0) {
                                i32 = a0Var5.G();
                                i30 = a0Var5.m();
                                i33--;
                            }
                            i32--;
                        }
                        int i42 = i30;
                        jArr7[i28] = j10;
                        iArr4[i28] = fVar.c();
                        if (iArr4[i28] > i29) {
                            i29 = iArr4[i28];
                        }
                        jArr8[i28] = j8 + i42;
                        iArr5[i28] = a0Var4 == null ? 1 : 0;
                        if (i28 == i27) {
                            iArr5[i28] = 1;
                            i37--;
                            if (i37 > 0) {
                                i27 = ((a0) o2.a.e(a0Var4)).G() - 1;
                            }
                        }
                        int i43 = i27;
                        j8 += i41;
                        int i44 = i12 - 1;
                        if (i44 != 0 || i11 <= 0) {
                            i18 = i41;
                            i19 = i11;
                        } else {
                            i44 = a0Var3.G();
                            i18 = a0Var3.m();
                            i19 = i11 - 1;
                        }
                        int i45 = i44;
                        long j12 = j10 + iArr4[i28];
                        i31 = i38 - 1;
                        i28++;
                        j9 = j12;
                        i27 = i43;
                        i34 = i18;
                        b7 = i40;
                        i30 = i42;
                        i36 = i19;
                        i35 = i45;
                    }
                    long j13 = j8 + i13;
                    if (a0Var5 != null) {
                        while (i33 > 0) {
                            if (a0Var5.G() != 0) {
                                z8 = false;
                                break;
                            }
                            a0Var5.m();
                            i33--;
                        }
                    }
                    z8 = true;
                    if (i37 == 0 && i12 == 0 && i14 == 0 && i11 == 0) {
                        i15 = i32;
                        if (i15 == 0 && z8) {
                            oVar2 = oVar;
                            i16 = b7;
                            jArr = jArr7;
                            iArr = iArr4;
                            i17 = i29;
                            j7 = j13;
                            jArr2 = jArr8;
                            iArr2 = iArr5;
                        }
                    } else {
                        i15 = i32;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    oVar2 = oVar;
                    sb.append(oVar2.f15970a);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i37);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i12);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i14);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i11);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i15);
                    sb.append(!z8 ? ", ctts invalid" : "");
                    o2.r.i("AtomParsers", sb.toString());
                    i16 = b7;
                    jArr = jArr7;
                    iArr = iArr4;
                    i17 = i29;
                    j7 = j13;
                    jArr2 = jArr8;
                    iArr2 = iArr5;
                } else {
                    int i46 = aVar.f15844a;
                    long[] jArr9 = new long[i46];
                    int[] iArr6 = new int[i46];
                    while (aVar.a()) {
                        int i47 = aVar.f15845b;
                        jArr9[i47] = aVar.f15847d;
                        iArr6[i47] = aVar.f15846c;
                    }
                    d.b a8 = e1.d.a(a7, jArr9, iArr6, G3);
                    long[] jArr10 = a8.f15876a;
                    int[] iArr7 = a8.f15877b;
                    int i48 = a8.f15878c;
                    long[] jArr11 = a8.f15879d;
                    int[] iArr8 = a8.f15880e;
                    long j14 = a8.f15881f;
                    oVar2 = oVar;
                    i16 = b7;
                    jArr = jArr10;
                    iArr = iArr7;
                    i17 = i48;
                    iArr2 = iArr8;
                    j7 = j14;
                    jArr2 = jArr11;
                }
                long N0 = m0.N0(j7, 1000000L, oVar2.f15972c);
                jArr3 = oVar2.f15977h;
                if (jArr3 != null) {
                    m0.P0(jArr2, 1000000L, oVar2.f15972c);
                    return new r(oVar, jArr, iArr, i17, jArr2, iArr2, N0);
                }
                if (jArr3.length == 1 && oVar2.f15971b == 1 && jArr2.length >= 2) {
                    long j15 = ((long[]) o2.a.e(oVar2.f15978i))[0];
                    long N02 = j15 + m0.N0(oVar2.f15977h[0], oVar2.f15972c, oVar2.f15973d);
                    i20 = i16;
                    if (b(jArr2, j7, j15, N02)) {
                        long N03 = m0.N0(j15 - jArr2[0], oVar2.f15975f.E, oVar2.f15972c);
                        i21 = i17;
                        long N04 = m0.N0(j7 - N02, oVar2.f15975f.E, oVar2.f15972c);
                        if ((N03 != 0 || N04 != 0) && N03 <= 2147483647L && N04 <= 2147483647L) {
                            xVar.f22982a = (int) N03;
                            xVar.f22983b = (int) N04;
                            m0.P0(jArr2, 1000000L, oVar2.f15972c);
                            return new r(oVar, jArr, iArr, i21, jArr2, iArr2, m0.N0(oVar2.f15977h[0], 1000000L, oVar2.f15973d));
                        }
                        jArr4 = oVar2.f15977h;
                        if (jArr4.length != 1 && jArr4[0] == 0) {
                            long j16 = ((long[]) o2.a.e(oVar2.f15978i))[0];
                            for (int i49 = 0; i49 < jArr2.length; i49++) {
                                jArr2[i49] = m0.N0(jArr2[i49] - j16, 1000000L, oVar2.f15972c);
                            }
                            return new r(oVar, jArr, iArr, i21, jArr2, iArr2, m0.N0(j7 - j16, 1000000L, oVar2.f15972c));
                        }
                        boolean z12 = oVar2.f15971b != 1;
                        int[] iArr9 = new int[jArr4.length];
                        int[] iArr10 = new int[jArr4.length];
                        long[] jArr12 = (long[]) o2.a.e(oVar2.f15978i);
                        i22 = 0;
                        z9 = false;
                        int i50 = 0;
                        i23 = 0;
                        while (true) {
                            jArr5 = oVar2.f15977h;
                            if (i22 < jArr5.length) {
                                break;
                            }
                            long[] jArr13 = jArr;
                            int[] iArr11 = iArr;
                            long j17 = jArr12[i22];
                            if (j17 != -1) {
                                int i51 = i23;
                                boolean z13 = z9;
                                int i52 = i50;
                                long N05 = m0.N0(jArr5[i22], oVar2.f15972c, oVar2.f15973d);
                                iArr9[i22] = m0.i(jArr2, j17, true, true);
                                iArr10[i22] = m0.e(jArr2, j17 + N05, z12, false);
                                while (iArr9[i22] < iArr10[i22] && (iArr2[iArr9[i22]] & 1) == 0) {
                                    iArr9[i22] = iArr9[i22] + 1;
                                }
                                i50 = i52 + (iArr10[i22] - iArr9[i22]);
                                z10 = z13 | (i51 != iArr9[i22]);
                                i26 = iArr10[i22];
                            } else {
                                i26 = i23;
                                z10 = z9;
                            }
                            i22++;
                            z9 = z10;
                            i23 = i26;
                            jArr = jArr13;
                            iArr = iArr11;
                        }
                        long[] jArr14 = jArr;
                        int[] iArr12 = iArr;
                        boolean z14 = z9;
                        i24 = 0;
                        boolean z15 = z14 | (i50 != i20);
                        long[] jArr15 = !z15 ? new long[i50] : jArr14;
                        int[] iArr13 = !z15 ? new int[i50] : iArr12;
                        int i53 = !z15 ? 0 : i21;
                        int[] iArr14 = !z15 ? new int[i50] : iArr2;
                        long[] jArr16 = new long[i50];
                        int i54 = i53;
                        int[] iArr15 = iArr12;
                        long j18 = 0;
                        int i55 = 0;
                        while (i24 < oVar2.f15977h.length) {
                            long j19 = oVar2.f15978i[i24];
                            int i56 = iArr9[i24];
                            int[] iArr16 = iArr9;
                            int i57 = iArr10[i24];
                            int[] iArr17 = iArr10;
                            if (z15) {
                                int i58 = i57 - i56;
                                System.arraycopy(jArr14, i56, jArr15, i55, i58);
                                jArr6 = jArr14;
                                iArr3 = iArr15;
                                System.arraycopy(iArr3, i56, iArr13, i55, i58);
                                System.arraycopy(iArr2, i56, iArr14, i55, i58);
                            } else {
                                jArr6 = jArr14;
                                iArr3 = iArr15;
                            }
                            int i59 = i54;
                            while (i56 < i57) {
                                int i60 = i59;
                                int i61 = i57;
                                long[] jArr17 = jArr2;
                                int[] iArr18 = iArr2;
                                int[] iArr19 = iArr14;
                                long j20 = j18;
                                jArr16[i55] = m0.N0(j18, 1000000L, oVar2.f15973d) + m0.N0(Math.max(0L, jArr2[i56] - j19), 1000000L, oVar2.f15972c);
                                if (z15) {
                                    i25 = i60;
                                    if (iArr13[i55] > i25) {
                                        i59 = iArr3[i56];
                                        i55++;
                                        i56++;
                                        i57 = i61;
                                        j18 = j20;
                                        jArr2 = jArr17;
                                        iArr2 = iArr18;
                                        iArr14 = iArr19;
                                    }
                                } else {
                                    i25 = i60;
                                }
                                i59 = i25;
                                i55++;
                                i56++;
                                i57 = i61;
                                j18 = j20;
                                jArr2 = jArr17;
                                iArr2 = iArr18;
                                iArr14 = iArr19;
                            }
                            long[] jArr18 = jArr2;
                            long j21 = j18 + oVar2.f15977h[i24];
                            i24++;
                            i54 = i59;
                            iArr15 = iArr3;
                            j18 = j21;
                            iArr9 = iArr16;
                            jArr2 = jArr18;
                            iArr2 = iArr2;
                            iArr10 = iArr17;
                            jArr14 = jArr6;
                            iArr14 = iArr14;
                        }
                        return new r(oVar, jArr15, iArr13, i54, jArr16, iArr14, m0.N0(j18, 1000000L, oVar2.f15973d));
                    }
                } else {
                    i20 = i16;
                }
                i21 = i17;
                jArr4 = oVar2.f15977h;
                if (jArr4.length != 1) {
                }
                if (oVar2.f15971b != 1) {
                }
                int[] iArr92 = new int[jArr4.length];
                int[] iArr102 = new int[jArr4.length];
                long[] jArr122 = (long[]) o2.a.e(oVar2.f15978i);
                i22 = 0;
                z9 = false;
                int i502 = 0;
                i23 = 0;
                while (true) {
                    jArr5 = oVar2.f15977h;
                    if (i22 < jArr5.length) {
                    }
                    i22++;
                    z9 = z10;
                    i23 = i26;
                    jArr = jArr13;
                    iArr = iArr11;
                }
                long[] jArr142 = jArr;
                int[] iArr122 = iArr;
                boolean z142 = z9;
                i24 = 0;
                boolean z152 = z142 | (i502 != i20);
                if (!z152) {
                }
                if (!z152) {
                }
                if (!z152) {
                }
                if (!z152) {
                }
                long[] jArr162 = new long[i502];
                int i542 = i53;
                int[] iArr152 = iArr122;
                long j182 = 0;
                int i552 = 0;
                while (i24 < oVar2.f15977h.length) {
                }
                return new r(oVar, jArr15, iArr13, i542, jArr162, iArr14, m0.N0(j182, 1000000L, oVar2.f15973d));
            }
            a0Var4 = null;
        } else {
            i8 = 0;
        }
        i9 = -1;
        a7 = fVar.a();
        String str2 = oVar.f15975f.f20956q;
        if (a7 == -1) {
        }
        i10 = i8;
        z7 = false;
        if (z7) {
        }
        long N06 = m0.N0(j7, 1000000L, oVar2.f15972c);
        jArr3 = oVar2.f15977h;
        if (jArr3 != null) {
        }
    }

    private static d w(a0 a0Var, int i7, int i8, String str, v0.m mVar, boolean z6) {
        int i9;
        a0Var.O(12);
        int m7 = a0Var.m();
        d dVar = new d(m7);
        for (int i10 = 0; i10 < m7; i10++) {
            int e7 = a0Var.e();
            int m8 = a0Var.m();
            w0.o.a(m8 > 0, "childAtomSize must be positive");
            int m9 = a0Var.m();
            if (m9 == 1635148593 || m9 == 1635148595 || m9 == 1701733238 || m9 == 1831958048 || m9 == 1836070006 || m9 == 1752589105 || m9 == 1751479857 || m9 == 1932670515 || m9 == 1211250227 || m9 == 1987063864 || m9 == 1987063865 || m9 == 1635135537 || m9 == 1685479798 || m9 == 1685479729 || m9 == 1685481573 || m9 == 1685481521) {
                i9 = e7;
                D(a0Var, m9, i9, m8, i7, i8, mVar, dVar, i10);
            } else if (m9 == 1836069985 || m9 == 1701733217 || m9 == 1633889587 || m9 == 1700998451 || m9 == 1633889588 || m9 == 1835823201 || m9 == 1685353315 || m9 == 1685353317 || m9 == 1685353320 || m9 == 1685353324 || m9 == 1685353336 || m9 == 1935764850 || m9 == 1935767394 || m9 == 1819304813 || m9 == 1936684916 || m9 == 1953984371 || m9 == 778924082 || m9 == 778924083 || m9 == 1835557169 || m9 == 1835560241 || m9 == 1634492771 || m9 == 1634492791 || m9 == 1970037111 || m9 == 1332770163 || m9 == 1716281667) {
                i9 = e7;
                f(a0Var, m9, e7, m8, i7, str, z6, mVar, dVar, i10);
            } else {
                if (m9 == 1414810956 || m9 == 1954034535 || m9 == 2004251764 || m9 == 1937010800 || m9 == 1664495672) {
                    x(a0Var, m9, e7, m8, i7, str, dVar);
                } else if (m9 == 1835365492) {
                    o(a0Var, m9, e7, i7, dVar);
                } else if (m9 == 1667329389) {
                    dVar.f15858b = new s1.b().R(i7).e0("application/x-camera-motion").E();
                }
                i9 = e7;
            }
            a0Var.O(i9 + m8);
        }
        return dVar;
    }

    private static void x(a0 a0Var, int i7, int i8, int i9, int i10, String str, d dVar) {
        a0Var.O(i8 + 8 + 8);
        String str2 = "application/ttml+xml";
        m4.q qVar = null;
        long j7 = Long.MAX_VALUE;
        if (i7 != 1414810956) {
            if (i7 == 1954034535) {
                int i11 = (i9 - 8) - 8;
                byte[] bArr = new byte[i11];
                a0Var.j(bArr, 0, i11);
                qVar = m4.q.y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i7 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i7 == 1937010800) {
                j7 = 0;
            } else {
                if (i7 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f15860d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f15858b = new s1.b().R(i10).e0(str2).V(str).i0(j7).T(qVar).E();
    }

    private static g y(a0 a0Var) {
        boolean z6;
        a0Var.O(8);
        int c7 = e1.a.c(a0Var.m());
        a0Var.P(c7 == 0 ? 8 : 16);
        int m7 = a0Var.m();
        a0Var.P(4);
        int e7 = a0Var.e();
        int i7 = c7 == 0 ? 4 : 8;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= i7) {
                z6 = true;
                break;
            }
            if (a0Var.d()[e7 + i9] != -1) {
                z6 = false;
                break;
            }
            i9++;
        }
        long j7 = -9223372036854775807L;
        if (z6) {
            a0Var.P(i7);
        } else {
            long E = c7 == 0 ? a0Var.E() : a0Var.H();
            if (E != 0) {
                j7 = E;
            }
        }
        a0Var.P(16);
        int m8 = a0Var.m();
        int m9 = a0Var.m();
        a0Var.P(4);
        int m10 = a0Var.m();
        int m11 = a0Var.m();
        if (m8 == 0 && m9 == 65536 && m10 == -65536 && m11 == 0) {
            i8 = 90;
        } else if (m8 == 0 && m9 == -65536 && m10 == 65536 && m11 == 0) {
            i8 = 270;
        } else if (m8 == -65536 && m9 == 0 && m10 == 0 && m11 == -65536) {
            i8 = 180;
        }
        return new g(m7, j7, i8);
    }

    private static o z(a.C0056a c0056a, a.b bVar, long j7, v0.m mVar, boolean z6, boolean z7) {
        a.b bVar2;
        long j8;
        long[] jArr;
        long[] jArr2;
        a.C0056a f7;
        Pair<long[], long[]> h7;
        a.C0056a c0056a2 = (a.C0056a) o2.a.e(c0056a.f(1835297121));
        int d7 = d(k(((a.b) o2.a.e(c0056a2.g(1751411826))).f15842b));
        if (d7 == -1) {
            return null;
        }
        g y6 = y(((a.b) o2.a.e(c0056a.g(1953196132))).f15842b);
        if (j7 == -9223372036854775807L) {
            bVar2 = bVar;
            j8 = y6.f15870b;
        } else {
            bVar2 = bVar;
            j8 = j7;
        }
        long p7 = p(bVar2.f15842b);
        long N0 = j8 != -9223372036854775807L ? m0.N0(j8, 1000000L, p7) : -9223372036854775807L;
        a.C0056a c0056a3 = (a.C0056a) o2.a.e(((a.C0056a) o2.a.e(c0056a2.f(1835626086))).f(1937007212));
        Pair<Long, String> m7 = m(((a.b) o2.a.e(c0056a2.g(1835296868))).f15842b);
        d w6 = w(((a.b) o2.a.e(c0056a3.g(1937011556))).f15842b, y6.f15869a, y6.f15871c, (String) m7.second, mVar, z7);
        if (z6 || (f7 = c0056a.f(1701082227)) == null || (h7 = h(f7)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) h7.first;
            jArr2 = (long[]) h7.second;
            jArr = jArr3;
        }
        if (w6.f15858b == null) {
            return null;
        }
        return new o(y6.f15869a, d7, ((Long) m7.first).longValue(), p7, N0, w6.f15858b, w6.f15860d, w6.f15857a, w6.f15859c, jArr, jArr2);
    }
}
