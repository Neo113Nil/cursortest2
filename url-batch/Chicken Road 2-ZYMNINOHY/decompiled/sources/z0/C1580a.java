package z0;

import A0.b;
import E.AbstractC0005f;
import E1.P;
import T.C0096n;
import T.G;
import T.r;
import W.J;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import y0.F;
import y0.m;
import y0.n;
import y0.o;
import y0.p;
import y0.v;
import y0.y;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580a implements n {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f16270q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f16271r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f16272s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f16273t;

    /* renamed from: b, reason: collision with root package name */
    public final m f16275b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16276c;

    /* renamed from: d, reason: collision with root package name */
    public long f16277d;

    /* renamed from: e, reason: collision with root package name */
    public int f16278e;

    /* renamed from: f, reason: collision with root package name */
    public int f16279f;

    /* renamed from: h, reason: collision with root package name */
    public int f16281h;

    /* renamed from: i, reason: collision with root package name */
    public long f16282i;

    /* renamed from: j, reason: collision with root package name */
    public p f16283j;

    /* renamed from: k, reason: collision with root package name */
    public F f16284k;

    /* renamed from: l, reason: collision with root package name */
    public F f16285l;

    /* renamed from: m, reason: collision with root package name */
    public y f16286m;
    public boolean n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16287p;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16274a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f16280g = -1;

    static {
        String str = J.f3263a;
        Charset charset = StandardCharsets.UTF_8;
        f16272s = "#!AMR\n".getBytes(charset);
        f16273t = "#!AMR-WB\n".getBytes(charset);
    }

    public C1580a() {
        m mVar = new m();
        this.f16275b = mVar;
        this.f16285l = mVar;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f16277d = 0L;
        this.f16278e = 0;
        this.f16279f = 0;
        this.o = j5;
        y yVar = this.f16286m;
        if (!(yVar instanceof v)) {
            if (j4 == 0 || !(yVar instanceof R0.a)) {
                this.f16282i = 0L;
                return;
            } else {
                this.f16282i = (Math.max(0L, j4 - ((R0.a) yVar).f2274b) * 8000000) / r7.f2277e;
                return;
            }
        }
        v vVar = (v) yVar;
        P p2 = vVar.f16213b;
        long d4 = p2.f518b == 0 ? -9223372036854775807L : p2.d(J.c(vVar.f16212a, j4));
        this.f16282i = d4;
        if (Math.abs(this.o - d4) < 20000) {
            return;
        }
        this.n = true;
        this.f16285l = this.f16275b;
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        return g(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        o oVar2;
        this.f16284k.getClass();
        String str = J.f3263a;
        if (oVar.getPosition() == 0 && !g(oVar)) {
            throw G.a(null, "Could not find AMR header.");
        }
        if (!this.f16287p) {
            this.f16287p = true;
            boolean z = this.f16276c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            int i5 = z ? f16271r[8] : f16270q[7];
            F f4 = this.f16284k;
            C0096n c0096n = new C0096n();
            c0096n.f2830l = T.F.n(str2);
            c0096n.f2831m = T.F.n(str3);
            c0096n.n = i5;
            c0096n.f2810E = 1;
            c0096n.f2811F = i4;
            AbstractC0005f.w(c0096n, f4);
        }
        int i6 = 0;
        if (this.f16279f == 0) {
            try {
                int f5 = f(oVar);
                this.f16278e = f5;
                this.f16279f = f5;
                if (this.f16280g == -1) {
                    oVar.getPosition();
                    this.f16280g = this.f16278e;
                }
                if (this.f16280g == this.f16278e) {
                    this.f16281h++;
                }
                y yVar = this.f16286m;
                if (yVar instanceof v) {
                    v vVar = (v) yVar;
                    long j4 = this.f16282i + this.f16277d + 20000;
                    long position = oVar.getPosition() + this.f16278e;
                    P p2 = vVar.f16213b;
                    int i7 = p2.f518b;
                    if (i7 == 0 || j4 - p2.d(i7 - 1) >= 100000) {
                        P p4 = vVar.f16212a;
                        P p5 = vVar.f16213b;
                        if (p5.f518b == 0 && j4 > 0) {
                            p4.b(0L);
                            p5.b(0L);
                        }
                        p4.b(position);
                        p5.b(j4);
                    }
                    if (this.n && Math.abs(this.o - j4) < 20000) {
                        this.n = false;
                        this.f16285l = this.f16284k;
                    }
                }
            } catch (EOFException unused) {
                oVar2 = oVar;
            }
        }
        oVar2 = oVar;
        int g4 = this.f16285l.g(oVar2, this.f16279f, true);
        if (g4 != -1) {
            int i8 = this.f16279f - g4;
            this.f16279f = i8;
            if (i8 <= 0) {
                this.f16285l.e(this.f16277d + this.f16282i, 1, this.f16278e, 0, null);
                this.f16277d += 20000;
            }
            oVar2.getLength();
            if (this.f16286m == null) {
                b bVar = new b(-9223372036854775807L);
                this.f16286m = bVar;
                this.f16283j.x(bVar);
            }
            if (i6 == -1) {
                y yVar2 = this.f16286m;
                if (yVar2 instanceof v) {
                    long j5 = this.f16282i + this.f16277d;
                    ((v) yVar2).f16214c = j5;
                    this.f16283j.x(yVar2);
                    this.f16284k.c(j5);
                }
            }
            return i6;
        }
        i6 = -1;
        oVar2.getLength();
        if (this.f16286m == null) {
        }
        if (i6 == -1) {
        }
        return i6;
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f16283j = pVar;
        F z = pVar.z(0, 1);
        this.f16284k = z;
        this.f16285l = z;
        pVar.r();
    }

    public final int f(o oVar) {
        boolean z;
        oVar.u();
        byte[] bArr = this.f16274a;
        oVar.E(bArr, 0, 1);
        byte b4 = bArr[0];
        if ((b4 & 131) > 0) {
            throw G.a(null, "Invalid padding bits for frame header " + ((int) b4));
        }
        int i4 = (b4 >> 3) & 15;
        if (i4 >= 0 && i4 <= 15 && (((z = this.f16276c) && (i4 < 10 || i4 > 13)) || (!z && (i4 < 12 || i4 > 14)))) {
            return z ? f16271r[i4] : f16270q[i4];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f16276c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i4);
        throw G.a(null, sb.toString());
    }

    public final boolean g(o oVar) {
        oVar.u();
        byte[] bArr = f16272s;
        byte[] bArr2 = new byte[bArr.length];
        oVar.E(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f16276c = false;
            oVar.v(bArr.length);
            return true;
        }
        oVar.u();
        byte[] bArr3 = f16273t;
        byte[] bArr4 = new byte[bArr3.length];
        oVar.E(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f16276c = true;
        oVar.v(bArr3.length);
        return true;
    }

    @Override // y0.n
    public final void release() {
    }
}
