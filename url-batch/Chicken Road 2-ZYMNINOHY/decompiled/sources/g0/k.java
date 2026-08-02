package g0;

import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.D;
import T.E;
import T.F;
import W.G;
import a.AbstractC0124a;
import android.net.Uri;
import android.text.TextUtils;
import f1.C;
import f1.C0413a;
import f1.C0415c;
import f1.C0416d;
import i2.AbstractC0457a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class k extends r0.m {

    /* renamed from: M, reason: collision with root package name */
    public static final AtomicInteger f8862M = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f8863A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f8864B;

    /* renamed from: C, reason: collision with root package name */
    public C0434b f8865C;

    /* renamed from: D, reason: collision with root package name */
    public s f8866D;

    /* renamed from: E, reason: collision with root package name */
    public int f8867E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8868F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f8869G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8870H;

    /* renamed from: I, reason: collision with root package name */
    public I f8871I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8872J;

    /* renamed from: K, reason: collision with root package name */
    public long f8873K;
    public boolean L;

    /* renamed from: k, reason: collision with root package name */
    public final int f8874k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8875l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f8876m;
    public final boolean n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final Y.h f8877p;

    /* renamed from: q, reason: collision with root package name */
    public final Y.k f8878q;

    /* renamed from: r, reason: collision with root package name */
    public final C0434b f8879r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8880s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8881t;

    /* renamed from: u, reason: collision with root package name */
    public final G f8882u;
    public final C0435c v;

    /* renamed from: w, reason: collision with root package name */
    public final List f8883w;

    /* renamed from: x, reason: collision with root package name */
    public final C0094l f8884x;

    /* renamed from: y, reason: collision with root package name */
    public final M0.h f8885y;
    public final W.u z;

    public k(C0435c c0435c, Y.h hVar, Y.k kVar, C0097o c0097o, boolean z, Y.h hVar2, Y.k kVar2, boolean z4, Uri uri, List list, int i4, Object obj, long j4, long j5, long j6, int i5, boolean z5, int i6, boolean z6, boolean z7, G g4, C0094l c0094l, C0434b c0434b, M0.h hVar3, W.u uVar, boolean z8, boolean z9, b0.i iVar) {
        super(hVar, kVar, c0097o, i4, obj, j4, j5, j6);
        this.f8863A = z;
        this.o = i5;
        this.f8873K = z5 ? j5 - j4 : -9223372036854775807L;
        this.f8875l = i6;
        this.f8878q = kVar2;
        this.f8877p = hVar2;
        this.f8868F = kVar2 != null;
        this.f8864B = z4;
        this.f8876m = uri;
        this.f8880s = z7;
        this.f8882u = g4;
        this.f8881t = z6;
        this.v = c0435c;
        this.f8883w = list;
        this.f8884x = c0094l;
        this.f8879r = c0434b;
        this.f8885y = hVar3;
        this.z = uVar;
        this.L = z8;
        this.n = z9;
        v2.G g5 = I.f15571b;
        this.f8871I = a0.f15605e;
        this.f8874k = f8862M.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (U.i.D(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // r0.m
    public final boolean b() {
        throw null;
    }

    @Override // u0.k
    public final void c() {
        C0434b c0434b;
        this.f8866D.getClass();
        if (this.f8865C == null && (c0434b = this.f8879r) != null) {
            y0.n nVar = c0434b.f8824a;
            if ((nVar instanceof C) || (nVar instanceof S0.o)) {
                this.f8865C = c0434b;
                this.f8868F = false;
            }
        }
        Y.k kVar = this.f8878q;
        Y.h hVar = this.f8877p;
        if (this.f8868F) {
            hVar.getClass();
            kVar.getClass();
            e(hVar, kVar, this.f8864B, false);
            this.f8867E = 0;
            this.f8868F = false;
        }
        if (this.f8869G) {
            return;
        }
        if (!this.f8881t) {
            e(this.f15146i, this.f15139b, this.f8863A, true);
        }
        this.f8870H = !this.f8869G;
    }

    @Override // u0.k
    public final void d() {
        this.f8869G = true;
    }

    public final void e(Y.h hVar, Y.k kVar, boolean z, boolean z4) {
        Y.k a3;
        boolean z5;
        long j4;
        long j5;
        if (z) {
            z5 = this.f8867E != 0;
            a3 = kVar;
        } else {
            a3 = kVar.a(this.f8867E);
            z5 = false;
        }
        try {
            y0.k i4 = i(hVar, a3, z4);
            if (z5) {
                i4.k(this.f8867E, false);
            }
            do {
                try {
                    try {
                        if (this.f8869G) {
                            break;
                        }
                    } catch (Throwable th) {
                        this.f8867E = (int) (i4.f16169d - kVar.f3705e);
                        throw th;
                    }
                } catch (EOFException e4) {
                    if ((this.f15141d.f2861f & 16384) == 0) {
                        throw e4;
                    }
                    this.f8865C.f8824a.a(0L, 0L);
                    j4 = i4.f16169d;
                    j5 = kVar.f3705e;
                }
            } while (this.f8865C.f8824a.c(i4, C0434b.f8823f) == 0);
            j4 = i4.f16169d;
            j5 = kVar.f3705e;
            this.f8867E = (int) (j4 - j5);
        } finally {
            AbstractC0457a.f(hVar);
        }
    }

    public final int g(int i4) {
        AbstractC0124a.t(!this.L);
        if (i4 >= this.f8871I.size()) {
            return 0;
        }
        return ((Integer) this.f8871I.get(i4)).intValue();
    }

    public final boolean h() {
        return this.f8873K != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02a1, code lost:
    
        if (((g0.u) r4).f8987c.isEmpty() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00a8, code lost:
    
        if (((M0.m) r13).f1731b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0.k i(Y.h hVar, Y.k kVar, boolean z) {
        int i4;
        long j4;
        long j5;
        long j6;
        C0434b c0434b;
        G g4;
        ArrayList arrayList;
        y0.n c0413a;
        boolean z4;
        a2.i iVar;
        boolean z5;
        D d4;
        int i5;
        a2.i iVar2;
        y0.n oVar;
        List singletonList;
        int i6;
        y0.n dVar;
        D d5;
        long b4 = hVar.b(kVar);
        long j7 = this.f15144g;
        G g5 = this.f8882u;
        if (z) {
            try {
                g5.g(j7, this.f8880s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e4) {
                throw new IOException(e4);
            }
        }
        y0.k kVar2 = new y0.k(hVar, kVar.f3705e, b4);
        if (this.f8865C == null) {
            W.u uVar = this.z;
            kVar2.f16171f = 0;
            try {
                uVar.J(10);
                kVar2.l(uVar.f3351a, 0, 10, false);
            } catch (EOFException unused2) {
                j4 = -9223372036854775807L;
            }
            if (uVar.C() != 4801587) {
                j5 = -9223372036854775807L;
                j4 = -9223372036854775807L;
            } else {
                uVar.N(3);
                int y4 = uVar.y();
                int i7 = y4 + 10;
                byte[] bArr = uVar.f3351a;
                j4 = -9223372036854775807L;
                if (i7 > bArr.length) {
                    uVar.J(i7);
                    System.arraycopy(bArr, 0, uVar.f3351a, 0, 10);
                }
                kVar2.l(uVar.f3351a, 10, y4, false);
                E H4 = this.f8885y.H(y4, uVar.f3351a);
                if (H4 != null) {
                    D[] dArr = H4.f2655a;
                    int length = dArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            d5 = null;
                            break;
                        }
                        D d6 = dArr[i8];
                        if (M0.m.class.isAssignableFrom(d6.getClass())) {
                            d5 = (D) M0.m.class.cast(d6);
                        }
                        d5 = null;
                        if (d5 != null) {
                            break;
                        }
                        i8++;
                    }
                    M0.m mVar = (M0.m) d5;
                    if (mVar != null) {
                        System.arraycopy(mVar.f1732c, 0, uVar.f3351a, 0, 8);
                        uVar.M(0);
                        uVar.L(8);
                        j5 = uVar.t() & 8589934591L;
                    }
                }
                j5 = j4;
            }
            kVar2.f16171f = 0;
            C0434b c0434b2 = this.f8879r;
            if (c0434b2 == null) {
                Uri uri = kVar.f3701a;
                Map t4 = hVar.t();
                C0435c c0435c = this.v;
                c0435c.getClass();
                C0097o c0097o = this.f15141d;
                int m4 = U.i.m(c0097o.n);
                List list = (List) t4.get("Content-Type");
                int m5 = U.i.m((list == null || list.isEmpty()) ? null : (String) list.get(0));
                int n = U.i.n(uri);
                ArrayList arrayList2 = new ArrayList(7);
                C0435c.a(m4, arrayList2);
                C0435c.a(m5, arrayList2);
                C0435c.a(n, arrayList2);
                int i9 = 0;
                for (int i10 = 7; i9 < i10; i10 = 7) {
                    C0435c.a(C0435c.f8829c[i9], arrayList2);
                    i9++;
                }
                kVar2.f16171f = 0;
                int i11 = 0;
                y0.n nVar = null;
                while (true) {
                    int size = arrayList2.size();
                    G g6 = this.f8882u;
                    if (i11 >= size) {
                        j6 = j7;
                        i4 = 0;
                        nVar.getClass();
                        c0434b = new C0434b(nVar, c0097o, g6, c0435c.f8830a, c0435c.f8831b);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i11)).intValue();
                    int i12 = i11;
                    if (intValue == 0) {
                        g4 = g6;
                        j6 = j7;
                        arrayList = arrayList2;
                        c0413a = new C0413a();
                    } else if (intValue == 1) {
                        g4 = g6;
                        j6 = j7;
                        arrayList = arrayList2;
                        c0413a = new C0415c();
                    } else if (intValue == 2) {
                        g4 = g6;
                        j6 = j7;
                        arrayList = arrayList2;
                        c0413a = new C0416d(0);
                    } else if (intValue != 7) {
                        List list2 = this.f8883w;
                        a2.i iVar3 = V0.j.f3206v0;
                        if (intValue == 8) {
                            j6 = j7;
                            arrayList = arrayList2;
                            a2.i iVar4 = c0435c.f8830a;
                            boolean z6 = c0435c.f8831b;
                            E e5 = c0097o.f2867l;
                            if (e5 == null) {
                                iVar = iVar4;
                                z5 = z6;
                            } else {
                                D[] dArr2 = e5.f2655a;
                                int length2 = dArr2.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length2) {
                                        iVar = iVar4;
                                        z5 = z6;
                                        d4 = null;
                                        break;
                                    }
                                    iVar = iVar4;
                                    D d7 = dArr2[i13];
                                    z5 = z6;
                                    D[] dArr3 = dArr2;
                                    if (u.class.isAssignableFrom(d7.getClass())) {
                                        d4 = (D) u.class.cast(d7);
                                    }
                                    d4 = null;
                                    if (d4 != null) {
                                        break;
                                    }
                                    i13++;
                                    iVar4 = iVar;
                                    z6 = z5;
                                    dArr2 = dArr3;
                                }
                                if (d4 != null) {
                                    i5 = 4;
                                    if (z5) {
                                        i5 |= 32;
                                        iVar2 = iVar3;
                                    } else {
                                        iVar2 = iVar;
                                    }
                                    oVar = new S0.o(iVar2, i5, g6, null, list2 == null ? list2 : a0.f15605e, null);
                                    g4 = g6;
                                }
                            }
                            i5 = 0;
                            if (z5) {
                            }
                            oVar = new S0.o(iVar2, i5, g6, null, list2 == null ? list2 : a0.f15605e, null);
                            g4 = g6;
                        } else if (intValue == 11) {
                            j6 = j7;
                            arrayList = arrayList2;
                            a2.i iVar5 = c0435c.f8830a;
                            boolean z7 = c0435c.f8831b;
                            if (list2 != null) {
                                i6 = 48;
                                singletonList = list2;
                            } else {
                                C0096n c0096n = new C0096n();
                                c0096n.f2831m = F.n("application/cea-608");
                                singletonList = Collections.singletonList(new C0097o(c0096n));
                                i6 = 16;
                            }
                            String str = c0097o.f2866k;
                            g4 = g6;
                            if (!TextUtils.isEmpty(str)) {
                                if (F.b(str, "audio/mp4a-latm") == null) {
                                    i6 |= 2;
                                }
                                if (F.b(str, "video/avc") == null) {
                                    i6 |= 4;
                                }
                            }
                            oVar = new C(2, !z7 ? 1 : 0, !z7 ? iVar3 : iVar5, g4, new B.k(i6, singletonList));
                        } else if (intValue != 13) {
                            g4 = g6;
                            j6 = j7;
                            arrayList = arrayList2;
                            c0413a = null;
                        } else {
                            j6 = j7;
                            arrayList = arrayList2;
                            c0413a = new v(c0097o.f2859d, g6, c0435c.f8830a, c0435c.f8831b);
                            g4 = g6;
                        }
                        c0413a = oVar;
                    } else {
                        g4 = g6;
                        j6 = j7;
                        arrayList = arrayList2;
                        c0413a = new R0.d(0L);
                    }
                    c0413a.getClass();
                    try {
                        z4 = c0413a.b(kVar2);
                        i4 = 0;
                        kVar2.f16171f = 0;
                    } catch (EOFException unused3) {
                        i4 = 0;
                        kVar2.f16171f = 0;
                        z4 = false;
                    } catch (Throwable th) {
                        kVar2.f16171f = 0;
                        throw th;
                    }
                    if (z4) {
                        c0434b = new C0434b(c0413a, c0097o, g4, c0435c.f8830a, c0435c.f8831b);
                        break;
                    }
                    C0097o c0097o2 = c0097o;
                    if (nVar == null && (intValue == m4 || intValue == m5 || intValue == n || intValue == 11)) {
                        nVar = c0413a;
                    }
                    i11 = i12 + 1;
                    c0097o = c0097o2;
                    arrayList2 = arrayList;
                    j7 = j6;
                }
            } else {
                y0.n nVar2 = c0434b2.f8824a;
                AbstractC0124a.t(!((nVar2 instanceof C) || (nVar2 instanceof S0.o)));
                if (nVar2 instanceof v) {
                    dVar = new v(c0434b2.f8825b.f2859d, c0434b2.f8826c, c0434b2.f8827d, c0434b2.f8828e);
                } else if (nVar2 instanceof C0416d) {
                    dVar = new C0416d(0);
                } else if (nVar2 instanceof C0413a) {
                    dVar = new C0413a();
                } else if (nVar2 instanceof C0415c) {
                    dVar = new C0415c();
                } else {
                    if (!(nVar2 instanceof R0.d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(nVar2.getClass().getSimpleName()));
                    }
                    dVar = new R0.d(0);
                }
                c0434b = new C0434b(dVar, c0434b2.f8825b, c0434b2.f8826c, c0434b2.f8827d, c0434b2.f8828e);
                j6 = j7;
                i4 = 0;
            }
            C0434b c0434b3 = c0434b;
            this.f8865C = c0434b3;
            y0.n nVar3 = c0434b3.f8824a;
            if ((((nVar3 instanceof C0416d) || (nVar3 instanceof C0413a) || (nVar3 instanceof C0415c) || (nVar3 instanceof R0.d)) ? 1 : i4) != 0) {
                s sVar = this.f8866D;
                long b5 = j5 != j4 ? g5.b(j5) : j6;
                if (sVar.f8954V != b5) {
                    sVar.f8954V = b5;
                    r[] rVarArr = sVar.v;
                    int length3 = rVarArr.length;
                    for (int i14 = i4; i14 < length3; i14++) {
                        r rVar = rVarArr[i14];
                        if (rVar.f14957F != b5) {
                            rVar.f14957F = b5;
                            rVar.z = true;
                        }
                    }
                }
            } else {
                s sVar2 = this.f8866D;
                if (sVar2.f8954V != 0) {
                    sVar2.f8954V = 0L;
                    r[] rVarArr2 = sVar2.v;
                    int length4 = rVarArr2.length;
                    for (int i15 = i4; i15 < length4; i15++) {
                        r rVar2 = rVarArr2[i15];
                        if (rVar2.f14957F != 0) {
                            rVar2.f14957F = 0L;
                            rVar2.z = true;
                        }
                    }
                }
            }
            this.f8866D.f8977x.clear();
            this.f8865C.f8824a.e(this.f8866D);
        } else {
            i4 = 0;
        }
        s sVar3 = this.f8866D;
        C0094l c0094l = sVar3.f8955W;
        C0094l c0094l2 = this.f8884x;
        if (!Objects.equals(c0094l, c0094l2)) {
            sVar3.f8955W = c0094l2;
            int i16 = i4;
            while (true) {
                r[] rVarArr3 = sVar3.v;
                if (i16 >= rVarArr3.length) {
                    break;
                }
                if (sVar3.f8947O[i16]) {
                    r rVar3 = rVarArr3[i16];
                    rVar3.f8932I = c0094l2;
                    rVar3.z = true;
                }
                i16++;
            }
        }
        return kVar2;
    }
}
