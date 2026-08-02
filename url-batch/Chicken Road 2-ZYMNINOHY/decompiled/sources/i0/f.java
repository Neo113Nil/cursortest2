package i0;

import L1.k;
import T.C0097o;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import q0.C1353B;

/* loaded from: classes.dex */
public final class f extends AbstractC0135a {

    /* renamed from: A, reason: collision with root package name */
    public int f9284A;

    /* renamed from: B, reason: collision with root package name */
    public int f9285B;

    /* renamed from: C, reason: collision with root package name */
    public C0097o f9286C;

    /* renamed from: D, reason: collision with root package name */
    public C0455b f9287D;

    /* renamed from: E, reason: collision with root package name */
    public Z.f f9288E;

    /* renamed from: F, reason: collision with root package name */
    public d f9289F;

    /* renamed from: G, reason: collision with root package name */
    public Bitmap f9290G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9291H;

    /* renamed from: I, reason: collision with root package name */
    public J1.b f9292I;

    /* renamed from: J, reason: collision with root package name */
    public J1.b f9293J;

    /* renamed from: K, reason: collision with root package name */
    public int f9294K;
    public boolean L;

    /* renamed from: s, reason: collision with root package name */
    public final k f9295s;

    /* renamed from: t, reason: collision with root package name */
    public final Z.f f9296t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f9297u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9298w;

    /* renamed from: x, reason: collision with root package name */
    public e f9299x;

    /* renamed from: y, reason: collision with root package name */
    public long f9300y;
    public long z;

    public f(k kVar) {
        super(4);
        this.f9295s = kVar;
        this.f9289F = d.f9280a;
        this.f9296t = new Z.f(0);
        this.f9299x = e.f9281c;
        this.f9297u = new ArrayDeque();
        this.z = -9223372036854775807L;
        this.f9300y = -9223372036854775807L;
        this.f9284A = 0;
        this.f9285B = 1;
    }

    @Override // a0.AbstractC0135a
    public final int D(C0097o c0097o) {
        this.f9295s.getClass();
        return k.b(c0097o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
    
        if (r14 == ((r0 * r1.f2852M) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(long j4) {
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2 = this.f9290G;
        if ((bitmap2 == null || this.f9292I != null) && (this.f9285B != 0 || this.f4044h == 2)) {
            ArrayDeque arrayDeque = this.f9297u;
            if (bitmap2 == null) {
                this.f9287D.getClass();
                C0454a c0454a = (C0454a) this.f9287D.c();
                if (c0454a != null) {
                    if (!c0454a.g(4)) {
                        AbstractC0124a.o(c0454a.f9278e, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f9290G = c0454a.f9278e;
                        c0454a.i();
                    } else {
                        if (this.f9284A == 3) {
                            J();
                            this.f9286C.getClass();
                            I();
                            return false;
                        }
                        c0454a.i();
                        if (arrayDeque.isEmpty()) {
                            this.f9298w = true;
                            return false;
                        }
                    }
                }
            }
            if (this.f9291H && this.f9290G != null && this.f9292I != null) {
                this.f9286C.getClass();
                C0097o c0097o = this.f9286C;
                int i4 = c0097o.f2852M;
                int i5 = c0097o.f2853N;
                boolean z4 = ((i4 == 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                J1.b bVar = this.f9292I;
                if (((Bitmap) bVar.f1158c) == null) {
                    if (z4) {
                        int i6 = bVar.f1156a;
                        this.f9290G.getClass();
                        int width = this.f9290G.getWidth();
                        C0097o c0097o2 = this.f9286C;
                        c0097o2.getClass();
                        int i7 = width / c0097o2.f2852M;
                        int height = this.f9290G.getHeight();
                        C0097o c0097o3 = this.f9286C;
                        c0097o3.getClass();
                        int i8 = height / c0097o3.f2853N;
                        int i9 = this.f9286C.f2852M;
                        bitmap = Bitmap.createBitmap(this.f9290G, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                    } else {
                        bitmap = this.f9290G;
                        bitmap.getClass();
                    }
                    bVar.f1158c = bitmap;
                }
                ((Bitmap) this.f9292I.f1158c).getClass();
                long j5 = this.f9292I.f1157b - j4;
                boolean z5 = this.f4044h == 2;
                int i10 = this.f9285B;
                if (i10 != 0) {
                    if (i10 == 1) {
                        z5 = true;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        z5 = false;
                    }
                }
                if (z5 || j5 < 30000) {
                    d dVar = this.f9289F;
                    long j6 = this.f9299x.f9283b;
                    dVar.getClass();
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    J1.b bVar2 = this.f9292I;
                    bVar2.getClass();
                    long j7 = bVar2.f1157b;
                    this.f9300y = j7;
                    while (!arrayDeque.isEmpty() && j7 >= ((e) arrayDeque.peek()).f9282a) {
                        this.f9299x = (e) arrayDeque.removeFirst();
                    }
                    this.f9285B = 3;
                    if (z4) {
                        J1.b bVar3 = this.f9292I;
                        bVar3.getClass();
                        int i11 = bVar3.f1156a;
                        C0097o c0097o4 = this.f9286C;
                        c0097o4.getClass();
                        int i12 = c0097o4.f2853N;
                        C0097o c0097o5 = this.f9286C;
                        c0097o5.getClass();
                    }
                    this.f9290G = null;
                    this.f9292I = this.f9293J;
                    this.f9293J = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(long j4) {
        boolean z;
        Z.f fVar;
        C0097o c0097o;
        int i4;
        Z.f fVar2;
        if (!this.f9291H || this.f9292I == null) {
            l2.e eVar = this.f4039c;
            eVar.k();
            C0455b c0455b = this.f9287D;
            if (c0455b != null && this.f9284A != 3 && !this.v) {
                if (this.f9288E == null) {
                    Z.f fVar3 = (Z.f) c0455b.d();
                    this.f9288E = fVar3;
                }
                if (this.f9284A == 2) {
                    this.f9288E.getClass();
                    this.f9288E.f3496b = 4;
                    C0455b c0455b2 = this.f9287D;
                    c0455b2.getClass();
                    c0455b2.e(this.f9288E);
                    this.f9288E = null;
                    this.f9284A = 3;
                    return false;
                }
                int y4 = y(eVar, this.f9288E, 0);
                if (y4 == -5) {
                    C0097o c0097o2 = (C0097o) eVar.f14271c;
                    c0097o2.getClass();
                    this.f9286C = c0097o2;
                    this.L = true;
                    this.f9284A = 2;
                    return true;
                }
                if (y4 == -4) {
                    this.f9288E.k();
                    ByteBuffer byteBuffer = this.f9288E.f3781e;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        Z.f fVar4 = this.f9288E;
                        fVar4.getClass();
                        if (!fVar4.g(4)) {
                            z = false;
                            if (z) {
                                Z.f fVar5 = this.f9288E;
                                fVar5.getClass();
                                fVar5.f3779c = this.f9286C;
                                C0455b c0455b3 = this.f9287D;
                                c0455b3.getClass();
                                Z.f fVar6 = this.f9288E;
                                fVar6.getClass();
                                c0455b3.e(fVar6);
                                this.f9294K = 0;
                            }
                            fVar = this.f9288E;
                            fVar.getClass();
                            if (fVar.g(4)) {
                                int i5 = this.f9294K;
                                long j5 = fVar.f3783g;
                                J1.b bVar = new J1.b();
                                bVar.f1156a = i5;
                                bVar.f1157b = j5;
                                this.f9293J = bVar;
                                this.f9294K = i5 + 1;
                                if (!this.f9291H) {
                                    boolean z4 = j5 - 30000 <= j4 && j4 <= 30000 + j5;
                                    J1.b bVar2 = this.f9292I;
                                    boolean z5 = bVar2 != null && bVar2.f1157b <= j4 && j4 < j5;
                                    C0097o c0097o3 = this.f9286C;
                                    c0097o3.getClass();
                                    this.f9291H = z4 || z5 || (c0097o3.f2852M == -1 || (i4 = (c0097o = this.f9286C).f2853N) == -1 || i5 == (i4 * c0097o.f2852M) - 1);
                                    if (z5) {
                                    }
                                }
                                this.f9292I = this.f9293J;
                                this.f9293J = null;
                            } else {
                                this.f9291H = true;
                            }
                            fVar2 = this.f9288E;
                            fVar2.getClass();
                            if (!fVar2.g(4)) {
                                this.v = true;
                                this.f9288E = null;
                                return false;
                            }
                            long j6 = this.z;
                            Z.f fVar7 = this.f9288E;
                            fVar7.getClass();
                            this.z = Math.max(j6, fVar7.f3783g);
                            if (z) {
                                this.f9288E = null;
                            } else {
                                Z.f fVar8 = this.f9288E;
                                fVar8.getClass();
                                fVar8.h();
                            }
                            return !this.f9291H;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    fVar = this.f9288E;
                    fVar.getClass();
                    if (fVar.g(4)) {
                    }
                    fVar2 = this.f9288E;
                    fVar2.getClass();
                    if (!fVar2.g(4)) {
                    }
                } else if (y4 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void I() {
        if (this.L) {
            C0097o c0097o = this.f9286C;
            c0097o.getClass();
            k kVar = this.f9295s;
            kVar.getClass();
            int b4 = k.b(c0097o);
            if (b4 != AbstractC0135a.f(4, 0, 0, 0) && b4 != AbstractC0135a.f(3, 0, 0, 0)) {
                throw g(new c("Provided decoder factory can't create decoder for format."), this.f9286C, false, 4005);
            }
            C0455b c0455b = this.f9287D;
            if (c0455b != null) {
                c0455b.release();
            }
            this.f9287D = new C0455b(kVar.f1648a);
            this.L = false;
        }
    }

    public final void J() {
        this.f9288E = null;
        this.f9284A = 0;
        this.z = -9223372036854775807L;
        C0455b c0455b = this.f9287D;
        if (c0455b != null) {
            c0455b.release();
            this.f9287D = null;
        }
    }

    @Override // a0.AbstractC0135a, a0.i0
    public final void c(int i4, Object obj) {
        if (i4 != 15) {
            return;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar == null) {
            dVar = d.f9280a;
        }
        this.f9289F = dVar;
    }

    @Override // a0.AbstractC0135a
    public final String k() {
        return "ImageRenderer";
    }

    @Override // a0.AbstractC0135a
    public final boolean m() {
        return this.f9298w;
    }

    @Override // a0.AbstractC0135a
    public final boolean o() {
        int i4 = this.f9285B;
        if (i4 != 3) {
            return i4 == 0 && this.f9291H;
        }
        return true;
    }

    @Override // a0.AbstractC0135a
    public final void p() {
        this.f9286C = null;
        this.f9299x = e.f9281c;
        this.f9297u.clear();
        J();
        this.f9289F.getClass();
    }

    @Override // a0.AbstractC0135a
    public final void q(boolean z, boolean z4) {
        this.f9285B = z4 ? 1 : 0;
    }

    @Override // a0.AbstractC0135a
    public final void r(long j4, boolean z, boolean z4) {
        this.f9285B = Math.min(this.f9285B, 1);
        this.f9298w = false;
        this.v = false;
        this.f9290G = null;
        this.f9292I = null;
        this.f9293J = null;
        this.f9291H = false;
        this.f9288E = null;
        C0455b c0455b = this.f9287D;
        if (c0455b != null) {
            c0455b.flush();
        }
        this.f9297u.clear();
    }

    @Override // a0.AbstractC0135a
    public final void s() {
        J();
    }

    @Override // a0.AbstractC0135a
    public final void t() {
        J();
        this.f9285B = Math.min(this.f9285B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // a0.AbstractC0135a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(C0097o[] c0097oArr, long j4, long j5, C1353B c1353b) {
        if (this.f9299x.f9283b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.f9297u;
            if (arrayDeque.isEmpty()) {
                long j6 = this.z;
                if (j6 != -9223372036854775807L) {
                    long j7 = this.f9300y;
                    if (j7 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new e(this.z, j5));
            return;
        }
        this.f9299x = new e(-9223372036854775807L, j5);
    }

    @Override // a0.AbstractC0135a
    public final void z(long j4, long j5) {
        if (this.f9298w) {
            return;
        }
        if (this.f9286C == null) {
            l2.e eVar = this.f4039c;
            eVar.k();
            Z.f fVar = this.f9296t;
            fVar.h();
            int y4 = y(eVar, fVar, 2);
            if (y4 != -5) {
                if (y4 == -4) {
                    AbstractC0124a.t(fVar.g(4));
                    this.v = true;
                    this.f9298w = true;
                    return;
                }
                return;
            }
            C0097o c0097o = (C0097o) eVar.f14271c;
            c0097o.getClass();
            this.f9286C = c0097o;
            this.L = true;
        }
        if (this.f9287D == null) {
            I();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (G(j4)) {
            }
            while (H(j4)) {
            }
            Trace.endSection();
        } catch (c e4) {
            throw g(e4, null, false, 4003);
        }
    }
}
