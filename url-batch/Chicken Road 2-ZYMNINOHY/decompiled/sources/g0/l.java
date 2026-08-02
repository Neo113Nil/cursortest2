package g0;

import E.AbstractC0005f;
import E1.P;
import T.C0096n;
import T.C0097o;
import T.E;
import T.F;
import T.U;
import W.J;
import Y.A;
import a.AbstractC0124a;
import a0.C0144j;
import a0.Q;
import a0.p0;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import h0.C0446b;
import h0.C0447c;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q0.C1372n;
import q0.InterfaceC1382y;
import q0.InterfaceC1383z;
import q0.b0;
import q0.j0;
import t0.C1427b;
import v2.G;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class l implements InterfaceC1383z, h0.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0435c f8886a;

    /* renamed from: b, reason: collision with root package name */
    public final C0447c f8887b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.t f8888c;

    /* renamed from: d, reason: collision with root package name */
    public final A f8889d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.i f8890e;

    /* renamed from: f, reason: collision with root package name */
    public final f0.e f8891f;

    /* renamed from: g, reason: collision with root package name */
    public final C1427b f8892g;

    /* renamed from: h, reason: collision with root package name */
    public final f0.e f8893h;

    /* renamed from: i, reason: collision with root package name */
    public final B1.j f8894i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentityHashMap f8895j;

    /* renamed from: k, reason: collision with root package name */
    public final e0.t f8896k;

    /* renamed from: l, reason: collision with root package name */
    public final C0144j f8897l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8898m;
    public final int n;
    public final b0.i o;

    /* renamed from: p, reason: collision with root package name */
    public final e0.t f8899p = new e0.t(this);

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1382y f8900q;

    /* renamed from: r, reason: collision with root package name */
    public int f8901r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f8902s;

    /* renamed from: t, reason: collision with root package name */
    public s[] f8903t;

    /* renamed from: u, reason: collision with root package name */
    public s[] f8904u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public C1372n f8905w;

    public l(C0435c c0435c, C0447c c0447c, e0.t tVar, A a3, f0.i iVar, f0.e eVar, C1427b c1427b, f0.e eVar2, B1.j jVar, C0144j c0144j, boolean z, int i4, b0.i iVar2) {
        this.f8886a = c0435c;
        this.f8887b = c0447c;
        this.f8888c = tVar;
        this.f8889d = a3;
        this.f8890e = iVar;
        this.f8891f = eVar;
        this.f8892g = c1427b;
        this.f8893h = eVar2;
        this.f8894i = jVar;
        this.f8897l = c0144j;
        this.f8898m = z;
        this.n = i4;
        this.o = iVar2;
        c0144j.getClass();
        G g4 = I.f15571b;
        a0 a0Var = a0.f15605e;
        this.f8905w = new C1372n(a0Var, a0Var);
        this.f8895j = new IdentityHashMap();
        this.f8896k = new e0.t(6);
        this.f8903t = new s[0];
        this.f8904u = new s[0];
    }

    public static C0097o k(C0097o c0097o, C0097o c0097o2, boolean z) {
        E e4;
        int i4;
        String str;
        String str2;
        I i5;
        int i6;
        int i7;
        String str3;
        G g4 = I.f15571b;
        a0 a0Var = a0.f15605e;
        if (c0097o2 != null) {
            str2 = c0097o2.f2866k;
            e4 = c0097o2.f2867l;
            i6 = c0097o2.f2846F;
            i4 = c0097o2.f2860e;
            i7 = c0097o2.f2861f;
            str = c0097o2.f2859d;
            str3 = c0097o2.f2857b;
            i5 = c0097o2.f2858c;
        } else {
            String v = J.v(1, c0097o.f2866k);
            e4 = c0097o.f2867l;
            if (z) {
                i6 = c0097o.f2846F;
                i4 = c0097o.f2860e;
                i7 = c0097o.f2861f;
                str = c0097o.f2859d;
                str3 = c0097o.f2857b;
                str2 = v;
                i5 = c0097o.f2858c;
            } else {
                i4 = 0;
                str = null;
                str2 = v;
                i5 = a0Var;
                i6 = -1;
                i7 = 0;
                str3 = null;
            }
        }
        String d4 = F.d(str2);
        int i8 = z ? c0097o.f2863h : -1;
        int i9 = z ? c0097o.f2864i : -1;
        C0096n c0096n = new C0096n();
        c0096n.f2819a = c0097o.f2856a;
        c0096n.f2820b = str3;
        c0096n.f2821c = I.k(i5);
        c0096n.f2830l = F.n(c0097o.f2868m);
        c0096n.f2831m = F.n(d4);
        c0096n.f2828j = str2;
        c0096n.f2829k = e4;
        c0096n.f2826h = i8;
        c0096n.f2827i = i9;
        c0096n.f2810E = i6;
        c0096n.f2823e = i4;
        c0096n.f2824f = i7;
        c0096n.f2822d = str;
        return new C0097o(c0096n);
    }

    @Override // h0.t
    public final void a() {
        for (s sVar : this.f8903t) {
            u0.n nVar = sVar.f8966j;
            j jVar = sVar.f8960d;
            ArrayList arrayList = sVar.n;
            if (!arrayList.isEmpty()) {
                k kVar = (k) v2.r.j(arrayList);
                int b4 = jVar.b(kVar);
                int i4 = kVar.o;
                if (b4 == 1) {
                    if (!kVar.h()) {
                        AbstractC0124a.t(i4 != -1);
                        h0.l a3 = jVar.f8851g.a(false, jVar.f8849e[jVar.f8852h.a(kVar.f15141d)]);
                        a3.getClass();
                        I i5 = a3.f9142r;
                        int i6 = (int) (kVar.f15183j - a3.f9137k);
                        kVar.f8873K = i6 < 0 ? 0L : ((h0.g) (i6 < i5.size() ? ((h0.i) i5.get(i6)).f9113m : a3.f9143s).get(i4)).f9116c;
                    }
                } else if (b4 == 0) {
                    sVar.f8972r.post(new p(sVar, 0, kVar));
                } else if (b4 == 2 && !sVar.f8952T && nVar.d()) {
                    nVar.b();
                }
            }
        }
        this.f8900q.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        s[] sVarArr = this.f8904u;
        int length = sVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            s sVar = sVarArr[i4];
            if (sVar.f8934A == 2) {
                j jVar = sVar.f8960d;
                C0447c c0447c = jVar.f8851g;
                int d4 = jVar.f8860r.d();
                Uri[] uriArr = jVar.f8849e;
                h0.l a3 = (d4 >= uriArr.length || d4 == -1) ? null : c0447c.a(true, uriArr[jVar.f8860r.k()]);
                if (a3 != null) {
                    I i5 = a3.f9142r;
                    if (!i5.isEmpty()) {
                        long j5 = a3.f9134h - c0447c.n;
                        long j6 = j4 - j5;
                        int d5 = J.d(i5, Long.valueOf(j6), true);
                        long j7 = ((h0.i) i5.get(d5)).f9118e;
                        return p0Var.a(j6, j7, (!a3.f9167c || d5 == i5.size() - 1) ? j7 : ((h0.i) i5.get(d5 + 1)).f9118e) + j5;
                    }
                }
            } else {
                i4++;
            }
        }
        return j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if ((r4 == null ? h0.C0446b.a(r4, r13) : false) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052 A[SYNTHETIC] */
    @Override // h0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Uri uri, P p2, boolean z) {
        long j4;
        int i4;
        int u4;
        boolean z4;
        boolean z5 = true;
        for (s sVar : this.f8903t) {
            j jVar = sVar.f8960d;
            Uri[] uriArr = jVar.f8849e;
            if (J.m(uriArr, uri)) {
                if (!z) {
                    C1427b c1427b = sVar.f8965i;
                    u0.h e4 = AbstractC0347t0.e(jVar.f8860r);
                    c1427b.getClass();
                    g1.e f4 = C1427b.f(e4, p2);
                    if (f4 != null && f4.f9026a == 2) {
                        j4 = f4.f9027b;
                        i4 = 0;
                        while (true) {
                            if (i4 < uriArr.length) {
                                i4 = -1;
                                break;
                            }
                            if (uriArr[i4].equals(uri)) {
                                break;
                            }
                            i4++;
                        }
                        if (i4 != -1 && (u4 = jVar.f8860r.u(i4)) != -1) {
                            jVar.o = uri;
                            if (j4 != -9223372036854775807L && jVar.f8860r.o(u4, j4)) {
                                C0446b c0446b = (C0446b) jVar.f8851g.f9057d.get(uri);
                            }
                            z4 = false;
                            z5 &= z4;
                        }
                    }
                }
                j4 = -9223372036854775807L;
                i4 = 0;
                while (true) {
                    if (i4 < uriArr.length) {
                    }
                    i4++;
                }
                if (i4 != -1) {
                    jVar.o = uri;
                    if (j4 != -9223372036854775807L) {
                        C0446b c0446b2 = (C0446b) jVar.f8851g.f9057d.get(uri);
                    }
                    z4 = false;
                    z5 &= z4;
                }
            }
            z4 = true;
            z5 &= z4;
        }
        this.f8900q.s(this);
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x011e, code lost:
    
        if (r44 != r3.f8948P) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // q0.InterfaceC1383z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        IdentityHashMap identityHashMap;
        b0[] b0VarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        j jVar;
        int i4;
        int i5;
        b0[] b0VarArr3;
        int i6;
        int[] iArr2;
        s[] sVarArr;
        s sVar;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        boolean z6;
        ?? r10;
        int i10;
        int i11;
        t0.t[] tVarArr2;
        int[] iArr3 = new int[tVarArr.length];
        int[] iArr4 = new int[tVarArr.length];
        int i12 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.f8895j;
            if (i12 >= length) {
                break;
            }
            b0 b0Var = b0VarArr[i12];
            iArr3[i12] = b0Var == null ? -1 : ((Integer) identityHashMap.get(b0Var)).intValue();
            iArr4[i12] = -1;
            t0.t tVar = tVarArr[i12];
            if (tVar != null) {
                U c4 = tVar.c();
                int i13 = 0;
                while (true) {
                    s[] sVarArr2 = this.f8903t;
                    if (i13 < sVarArr2.length) {
                        s sVar2 = sVarArr2[i13];
                        sVar2.k();
                        if (sVar2.f8942I.b(c4) != -1) {
                            iArr4[i12] = i13;
                            break;
                        }
                        i13++;
                    }
                }
            }
            i12++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        b0[] b0VarArr4 = new b0[length2];
        int length3 = tVarArr.length;
        b0[] b0VarArr5 = new b0[length3];
        int length4 = tVarArr.length;
        t0.t[] tVarArr3 = new t0.t[length4];
        boolean z7 = false;
        s[] sVarArr3 = new s[this.f8903t.length];
        int i14 = length3;
        int i15 = 0;
        int i16 = 0;
        boolean z8 = false;
        while (i15 < this.f8903t.length) {
            int i17 = length2;
            ?? r7 = z7;
            while (true) {
                b0VarArr2 = b0VarArr4;
                if (r7 >= tVarArr.length) {
                    break;
                }
                b0VarArr5[r7] = iArr3[r7] == i15 ? b0VarArr[r7] : null;
                tVarArr3[r7] = iArr4[r7] == i15 ? tVarArr[r7] : null;
                b0VarArr4 = b0VarArr2;
                r7++;
            }
            s sVar3 = this.f8903t[i15];
            u0.n nVar = sVar3.f8966j;
            int i18 = i15;
            j jVar2 = sVar3.f8960d;
            Uri[] uriArr = jVar2.f8849e;
            C0447c c0447c = jVar2.f8851g;
            ArrayList arrayList = sVar3.n;
            sVar3.k();
            int i19 = sVar3.f8938E;
            ?? r29 = b0VarArr5;
            ?? r72 = z7;
            while (r72 < length4) {
                n nVar2 = (n) r29[r72];
                if (nVar2 == null || (tVarArr3[r72] != null && zArr[r72])) {
                    i11 = r72;
                    tVarArr2 = tVarArr3;
                } else {
                    i11 = r72;
                    sVar3.f8938E--;
                    tVarArr2 = tVarArr3;
                    if (nVar2.f8918c != -1) {
                        s sVar4 = nVar2.f8917b;
                        int i20 = nVar2.f8916a;
                        sVar4.k();
                        sVar4.f8944K.getClass();
                        int i21 = sVar4.f8944K[i20];
                        AbstractC0124a.t(sVar4.f8946N[i21]);
                        sVar4.f8946N[i21] = z7;
                        nVar2.f8918c = -1;
                    }
                    r29[i11] = 0;
                }
                tVarArr3 = tVarArr2;
                r72 = i11 + 1;
            }
            t0.t[] tVarArr4 = tVarArr3;
            boolean z9 = true;
            if (!z8) {
                if (!sVar3.f8951S) {
                    iArr = iArr3;
                } else if (i19 != 0) {
                    iArr = iArr3;
                }
                z = z7;
                t0.t tVar2 = jVar2.f8860r;
                boolean z10 = z;
                t0.t tVar3 = tVar2;
                r9 = z7;
                while (r9 < length4) {
                    int i22 = r9;
                    t0.t tVar4 = tVarArr4[i22];
                    if (tVar4 == null) {
                        i10 = length4;
                    } else {
                        i10 = length4;
                        boolean z11 = z10;
                        int b4 = sVar3.f8942I.b(tVar4.c());
                        if (b4 == sVar3.L) {
                            C0446b c0446b = (C0446b) c0447c.f9057d.get(uriArr[jVar2.f8860r.k()]);
                            if (c0446b != null) {
                                c0446b.f9052k = z7;
                            }
                            jVar2.f8860r = tVar4;
                            tVar3 = tVar4;
                        }
                        if (r29[i22] == 0) {
                            sVar3.f8938E++;
                            n nVar3 = new n(sVar3, b4);
                            r29[i22] = nVar3;
                            zArr2[i22] = z9;
                            if (sVar3.f8944K != null) {
                                nVar3.b();
                                if (!z11) {
                                    r rVar = sVar3.v[sVar3.f8944K[b4]];
                                    z10 = (rVar.t() == 0 || rVar.G(j4, z9)) ? false : true;
                                }
                            }
                        }
                        z10 = z11;
                    }
                    length4 = i10;
                    z7 = false;
                    z9 = true;
                    r9 = i22 + 1;
                }
                int i23 = length4;
                boolean z12 = z10;
                if (sVar3.f8938E != 0) {
                    C0446b c0446b2 = (C0446b) c0447c.f9057d.get(uriArr[jVar2.f8860r.k()]);
                    if (c0446b2 != null) {
                        c0446b2.f9052k = false;
                    }
                    jVar2.n = null;
                    sVar3.f8940G = null;
                    sVar3.f8950R = true;
                    arrayList.clear();
                    if (nVar.d()) {
                        if (sVar3.f8936C) {
                            for (r rVar2 : sVar3.v) {
                                rVar2.k();
                            }
                        }
                        nVar.b();
                    } else {
                        sVar3.I();
                    }
                    jVar = jVar2;
                    i7 = i14;
                    i5 = i17;
                    b0VarArr3 = b0VarArr2;
                    i6 = i18;
                    z5 = z12;
                    iArr2 = iArr4;
                    sVarArr = sVarArr3;
                    sVar = sVar3;
                } else {
                    boolean z13 = true;
                    if (arrayList.isEmpty() || Objects.equals(tVar3, tVar2)) {
                        jVar = jVar2;
                        i4 = i14;
                        i5 = i17;
                        b0VarArr3 = b0VarArr2;
                        i6 = i18;
                        iArr2 = iArr4;
                        sVarArr = sVarArr3;
                        sVar = sVar3;
                    } else {
                        if (sVar3.f8951S) {
                            jVar = jVar2;
                            i4 = i14;
                            i5 = i17;
                            b0VarArr3 = b0VarArr2;
                            i6 = i18;
                            iArr2 = iArr4;
                            sVarArr = sVarArr3;
                            sVar = sVar3;
                        } else {
                            long j5 = j4 < 0 ? -j4 : 0L;
                            k C4 = sVar3.C();
                            long j6 = j5;
                            r0.n[] a3 = jVar2.a(C4, j4);
                            jVar = jVar2;
                            List list = sVar3.o;
                            i4 = i14;
                            i5 = i17;
                            b0VarArr3 = b0VarArr2;
                            i6 = i18;
                            iArr2 = iArr4;
                            sVarArr = sVarArr3;
                            sVar = sVar3;
                            t0.t tVar5 = tVar3;
                            tVar5.j(j4, j6, -9223372036854775807L, list, a3);
                            if (tVar5.k() != jVar.f8852h.a(C4.f15141d)) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                        }
                        sVar.f8950R = z13;
                        z4 = z13;
                        z5 = z4;
                        if (z5) {
                            i7 = i4;
                        } else {
                            sVar.J(j4, z4);
                            i7 = i4;
                            int i24 = 0;
                            while (i24 < i7) {
                                if (r29[i24] != 0) {
                                    zArr2[i24] = z13;
                                }
                                i24++;
                                z13 = true;
                            }
                        }
                    }
                    z4 = z8;
                    z5 = z12;
                    if (z5) {
                    }
                }
                ArrayList arrayList2 = sVar.f8973s;
                arrayList2.clear();
                for (i8 = 0; i8 < i7; i8++) {
                    ?? r8 = r29[i8];
                    if (r8 != 0) {
                        arrayList2.add((n) r8);
                    }
                }
                sVar.f8951S = true;
                i9 = 0;
                z6 = false;
                while (i9 < tVarArr.length) {
                    ?? r82 = r29[i9];
                    int i25 = i6;
                    if (iArr2[i9] == i25) {
                        r82.getClass();
                        r10 = b0VarArr3;
                        r10[i9] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i25));
                        z6 = true;
                    } else {
                        r10 = b0VarArr3;
                        if (iArr[i9] == i25) {
                            AbstractC0124a.t(r82 == 0);
                        }
                    }
                    i9++;
                    b0VarArr3 = r10;
                    i6 = i25;
                }
                b0[] b0VarArr6 = b0VarArr3;
                int i26 = i6;
                int i27 = i16;
                if (!z6) {
                    sVarArr[i27] = sVar;
                    i16 = i27 + 1;
                    if (i27 == 0) {
                        jVar.f8856l = true;
                        if (!z5) {
                            s[] sVarArr4 = this.f8904u;
                            if (sVarArr4.length != 0 && sVar == sVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.f8896k.f8416a).clear();
                        z8 = true;
                    } else {
                        jVar.f8856l = i26 < this.v;
                    }
                }
                i15 = i26 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                sVarArr3 = sVarArr;
                b0VarArr5 = r29;
                tVarArr3 = tVarArr4;
                length2 = i5;
                z7 = false;
                i14 = i7;
                b0VarArr4 = b0VarArr6;
                length4 = i23;
            }
            iArr = iArr3;
            z = true;
            t0.t tVar22 = jVar2.f8860r;
            boolean z102 = z;
            t0.t tVar32 = tVar22;
            r9 = z7;
            while (r9 < length4) {
            }
            int i232 = length4;
            boolean z122 = z102;
            if (sVar3.f8938E != 0) {
            }
            ArrayList arrayList22 = sVar.f8973s;
            arrayList22.clear();
            while (i8 < i7) {
            }
            sVar.f8951S = true;
            i9 = 0;
            z6 = false;
            while (i9 < tVarArr.length) {
            }
            b0[] b0VarArr62 = b0VarArr3;
            int i262 = i6;
            int i272 = i16;
            if (!z6) {
            }
            i15 = i262 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            sVarArr3 = sVarArr;
            b0VarArr5 = r29;
            tVarArr3 = tVarArr4;
            length2 = i5;
            z7 = false;
            i14 = i7;
            b0VarArr4 = b0VarArr62;
            length4 = i232;
        }
        boolean z14 = z7;
        System.arraycopy(b0VarArr4, z14 ? 1 : 0, b0VarArr, z14 ? 1 : 0, length2);
        s[] sVarArr5 = (s[]) J.O(i16, sVarArr3);
        this.f8904u = sVarArr5;
        a0 l4 = I.l(sVarArr5);
        AbstractList u4 = v2.r.u(l4, new b0.c(22));
        this.f8897l.getClass();
        this.f8905w = new C1372n(l4, u4);
        return j4;
    }

    @Override // q0.d0
    public final long e() {
        return this.f8905w.e();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        C0435c c0435c;
        boolean z;
        List list;
        List list2;
        HashSet hashSet;
        int i4;
        HashSet hashSet2;
        int i5;
        boolean z4;
        C0435c c0435c2;
        int i6;
        boolean z5;
        Uri[] uriArr;
        this.f8900q = interfaceC1382y;
        C0447c c0447c = this.f8887b;
        c0447c.getClass();
        c0447c.f9058e.add(this);
        h0.o oVar = c0447c.f9063j;
        oVar.getClass();
        List list3 = oVar.f9159f;
        List list4 = oVar.f9158e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = oVar.f9160g;
        int i7 = 0;
        this.f8901r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0435c c0435c3 = this.f8886a;
        boolean z6 = this.f8898m;
        if (isEmpty) {
            c0435c = c0435c3;
            z = z6;
            list = list3;
            list2 = list5;
        } else {
            C0097o c0097o = oVar.f9161h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i8 = 0;
            int i9 = 0;
            while (true) {
                list2 = list5;
                if (i8 >= list4.size()) {
                    break;
                }
                C0097o c0097o2 = ((h0.n) list4.get(i8)).f9151b;
                int i10 = c0097o2.v;
                String str = c0097o2.f2866k;
                if (i10 > 0 || J.v(2, str) != null) {
                    iArr[i8] = 2;
                    i9++;
                } else if (J.v(1, str) != null) {
                    iArr[i8] = 1;
                    i7++;
                } else {
                    iArr[i8] = -1;
                }
                i8++;
                list5 = list2;
            }
            if (i9 > 0) {
                z5 = false;
                c0435c2 = c0435c3;
                i6 = i9;
                z4 = true;
            } else if (i7 < size) {
                z4 = false;
                c0435c2 = c0435c3;
                i6 = size - i7;
                z5 = true;
            } else {
                z4 = false;
                c0435c2 = c0435c3;
                i6 = size;
                z5 = false;
            }
            Uri[] uriArr2 = new Uri[i6];
            C0097o[] c0097oArr = new C0097o[i6];
            int[] iArr2 = new int[i6];
            int i11 = 0;
            int i12 = 0;
            while (i11 < list4.size()) {
                if (z4) {
                    uriArr = uriArr2;
                    if (iArr[i11] != 2) {
                        i11++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (!z5 || iArr[i11] != 1) {
                    h0.n nVar = (h0.n) list4.get(i11);
                    uriArr[i12] = nVar.f9150a;
                    c0097oArr[i12] = nVar.f9151b;
                    iArr2[i12] = i11;
                    i12++;
                }
                i11++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = c0097oArr[0].f2866k;
            int u4 = J.u(2, str2);
            int u5 = J.u(1, str2);
            boolean z7 = (u5 == 1 || (u5 == 0 && list3.isEmpty())) && u4 <= 1 && u5 + u4 > 0;
            C0435c c0435c4 = c0435c2;
            list = list3;
            z = z6;
            s g4 = g("main", (z4 || u5 <= 0) ? 0 : 1, uriArr3, c0097oArr, oVar.f9161h, oVar.f9162i, map, j4);
            arrayList.add(g4);
            arrayList2.add(iArr2);
            if (z && z7) {
                ArrayList arrayList3 = new ArrayList();
                if (u4 > 0) {
                    C0097o[] c0097oArr2 = new C0097o[i6];
                    int i13 = 0;
                    while (i13 < i6) {
                        C0097o c0097o3 = c0097oArr[i13];
                        String v = J.v(2, c0097o3.f2866k);
                        String d4 = F.d(v);
                        C0096n c0096n = new C0096n();
                        c0096n.f2819a = c0097o3.f2856a;
                        c0096n.f2820b = c0097o3.f2857b;
                        c0096n.f2821c = I.k(c0097o3.f2858c);
                        c0096n.f2830l = F.n(c0097o3.f2868m);
                        c0096n.f2831m = F.n(d4);
                        c0096n.f2828j = v;
                        c0096n.f2829k = c0097o3.f2867l;
                        c0096n.f2826h = c0097o3.f2863h;
                        c0096n.f2827i = c0097o3.f2864i;
                        c0096n.f2836t = c0097o3.f2874u;
                        c0096n.f2837u = c0097o3.v;
                        c0096n.f2839x = c0097o3.f2877y;
                        c0096n.f2823e = c0097o3.f2860e;
                        c0096n.f2824f = c0097o3.f2861f;
                        c0097oArr2[i13] = new C0097o(c0096n);
                        i13++;
                        c0097oArr = c0097oArr;
                    }
                    C0097o[] c0097oArr3 = c0097oArr;
                    arrayList3.add(new U("main", c0097oArr2));
                    if (u5 > 0 && (c0097o != null || list.isEmpty())) {
                        arrayList3.add(new U("main:audio", k(c0097oArr3[0], c0097o, false)));
                    }
                    List list6 = oVar.f9162i;
                    if (list6 != null) {
                        for (int i14 = 0; i14 < list6.size(); i14++) {
                            arrayList3.add(new U(AbstractC0005f.j(i14, "main:cc:"), c0435c4.b((C0097o) list6.get(i14))));
                        }
                    }
                    c0435c = c0435c4;
                } else {
                    c0435c = c0435c4;
                    C0097o[] c0097oArr4 = new C0097o[i6];
                    for (int i15 = 0; i15 < i6; i15++) {
                        c0097oArr4[i15] = k(c0097oArr[i15], c0097o, true);
                    }
                    arrayList3.add(new U("main", c0097oArr4));
                }
                C0096n c0096n2 = new C0096n();
                c0096n2.f2819a = "ID3";
                c0096n2.f2831m = F.n("application/id3");
                U u6 = new U("main:id3", new C0097o(c0096n2));
                arrayList3.add(u6);
                g4.H((U[]) arrayList3.toArray(new U[0]), arrayList3.indexOf(u6));
            } else {
                c0435c = c0435c4;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i16 = 0;
        while (i16 < list.size()) {
            List list7 = list;
            String str3 = ((h0.m) list7.get(i16)).f9149c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z8 = true;
                for (int i17 = 0; i17 < list7.size(); i17++) {
                    if (str3.equals(((h0.m) list7.get(i17)).f9149c)) {
                        h0.m mVar = (h0.m) list7.get(i17);
                        arrayList6.add(Integer.valueOf(i17));
                        Uri uri = mVar.f9147a;
                        C0097o c0097o4 = mVar.f9148b;
                        arrayList4.add(uri);
                        arrayList5.add(c0097o4);
                        z8 &= J.u(1, c0097o4.f2866k) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                String str4 = J.f3263a;
                list = list7;
                hashSet2 = hashSet3;
                i5 = i16;
                s g5 = g(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (C0097o[]) arrayList5.toArray(new C0097o[0]), null, Collections.EMPTY_LIST, map, j4);
                arrayList2.add(O3.d.F(arrayList6));
                arrayList.add(g5);
                if (z && z8) {
                    g5.H(new U[]{new U(concat, (C0097o[]) arrayList5.toArray(new C0097o[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i5 = i16;
                list = list7;
            }
            i16 = i5 + 1;
            hashSet3 = hashSet2;
        }
        this.v = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i18 = 0;
        while (i18 < list2.size()) {
            List list8 = list2;
            String str5 = ((h0.m) list8.get(i18)).f9149c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i19 = 0; i19 < list8.size(); i19++) {
                    if (str5.equals(((h0.m) list8.get(i19)).f9149c)) {
                        h0.m mVar2 = (h0.m) list8.get(i19);
                        arrayList9.add(Integer.valueOf(i19));
                        arrayList7.add(mVar2.f9147a);
                        arrayList8.add(mVar2.f9148b);
                    }
                }
                String concat2 = "subtitle:".concat(str5);
                C0097o[] c0097oArr5 = (C0097o[]) arrayList8.toArray(new C0097o[0]);
                String str6 = J.f3263a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                G g6 = I.f15571b;
                list2 = list8;
                hashSet = hashSet4;
                i4 = i18;
                s g7 = g(concat2, 3, uriArr4, c0097oArr5, null, a0.f15605e, map, j4);
                arrayList2.add(O3.d.F(arrayList9));
                arrayList.add(g7);
                int length = c0097oArr5.length;
                C0097o[] c0097oArr6 = new C0097o[length];
                for (int i20 = 0; i20 < length; i20++) {
                    c0097oArr6[i20] = c0435c.b(c0097oArr5[i20]);
                }
                g7.H(new U[]{new U(concat2, c0097oArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i4 = i18;
                list2 = list8;
            }
            i18 = i4 + 1;
            hashSet4 = hashSet;
        }
        this.f8903t = (s[]) arrayList.toArray(new s[0]);
        this.f8901r = this.f8903t.length;
        for (int i21 = 0; i21 < this.v; i21++) {
            this.f8903t[i21].f8960d.f8856l = true;
        }
        for (s sVar : this.f8903t) {
            if (!sVar.f8937D) {
                a0.P p2 = new a0.P();
                p2.f3982a = sVar.f8948P;
                sVar.v(new Q(p2));
            }
        }
        this.f8904u = this.f8903t;
    }

    public final s g(String str, int i4, Uri[] uriArr, C0097o[] c0097oArr, C0097o c0097o, List list, Map map, long j4) {
        return new s(str, i4, this.f8899p, new j(this.f8886a, this.f8887b, uriArr, c0097oArr, this.f8888c, this.f8889d, this.f8896k, list, this.o), map, this.f8894i, j4, c0097o, this.f8890e, this.f8891f, this.f8892g, this.f8893h, this.n, null);
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        for (s sVar : this.f8903t) {
            sVar.G();
            if (sVar.f8952T && !sVar.f8937D) {
                throw T.G.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        s[] sVarArr = this.f8904u;
        if (sVarArr.length > 0) {
            boolean J4 = sVarArr[0].J(j4, false);
            int i4 = 1;
            while (true) {
                s[] sVarArr2 = this.f8904u;
                if (i4 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i4].J(j4, J4);
                i4++;
            }
            if (J4) {
                ((SparseArray) this.f8896k.f8416a).clear();
            }
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        for (s sVar : this.f8904u) {
            if (sVar.f8936C && !sVar.E()) {
                int length = sVar.v.length;
                for (int i4 = 0; i4 < length; i4++) {
                    sVar.v[i4].j(j4, sVar.f8946N[i4]);
                }
            }
        }
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f8905w.l();
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        return -9223372036854775807L;
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        j0 j0Var = this.f8902s;
        j0Var.getClass();
        return j0Var;
    }

    @Override // q0.d0
    public final long u() {
        return this.f8905w.u();
    }

    @Override // q0.d0
    public final boolean v(Q q4) {
        if (this.f8902s != null) {
            return this.f8905w.v(q4);
        }
        for (s sVar : this.f8903t) {
            if (!sVar.f8937D) {
                a0.P p2 = new a0.P();
                p2.f3982a = sVar.f8948P;
                sVar.v(new Q(p2));
            }
        }
        return false;
    }

    @Override // q0.d0
    public final void w(long j4) {
        this.f8905w.w(j4);
    }
}
