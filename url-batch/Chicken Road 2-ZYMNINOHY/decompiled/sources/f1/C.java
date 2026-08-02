package f1;

import W.G;
import a.AbstractC0124a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import d2.C0389g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t0.C1427b;

/* loaded from: classes.dex */
public final class C implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f8507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8508b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8509c;

    /* renamed from: d, reason: collision with root package name */
    public final W.u f8510d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f8511e;

    /* renamed from: f, reason: collision with root package name */
    public final B.k f8512f;

    /* renamed from: g, reason: collision with root package name */
    public final V0.j f8513g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f8514h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f8515i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f8516j;

    /* renamed from: k, reason: collision with root package name */
    public final w f8517k;

    /* renamed from: l, reason: collision with root package name */
    public D0.c f8518l;

    /* renamed from: m, reason: collision with root package name */
    public y0.p f8519m;
    public int n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8520p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8521q;

    /* renamed from: r, reason: collision with root package name */
    public F f8522r;

    /* renamed from: s, reason: collision with root package name */
    public int f8523s;

    /* renamed from: t, reason: collision with root package name */
    public int f8524t;

    public C(int i4, int i5, V0.j jVar, G g4, B.k kVar) {
        this.f8512f = kVar;
        this.f8507a = i4;
        this.f8508b = i5;
        this.f8513g = jVar;
        if (i4 == 1 || i4 == 2) {
            this.f8509c = Collections.singletonList(g4);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f8509c = arrayList;
            arrayList.add(g4);
        }
        this.f8510d = new W.u(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f8515i = sparseBooleanArray;
        this.f8516j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f8514h = sparseArray;
        this.f8511e = new SparseIntArray();
        this.f8517k = new w(1);
        this.f8519m = y0.p.f16182y0;
        this.f8524t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.put(sparseArray2.keyAt(i6), (F) sparseArray2.valueAt(i6));
        }
        sparseArray.put(0, new A(new C0389g(this)));
        this.f8522r = null;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        D0.c cVar;
        long j6;
        SparseArray sparseArray = this.f8514h;
        List list = this.f8509c;
        AbstractC0124a.t(this.f8507a != 2);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            G g4 = (G) list.get(i4);
            synchronized (g4) {
                j6 = g4.f3259b;
            }
            boolean z = j6 == -9223372036854775807L;
            if (!z) {
                long d4 = g4.d();
                z = (d4 == -9223372036854775807L || d4 == 0 || d4 == j5) ? false : true;
            }
            if (z) {
                g4.f(j5);
            }
        }
        if (j5 != 0 && (cVar = this.f8518l) != null) {
            cVar.d(j5);
        }
        this.f8510d.J(0);
        this.f8511e.clear();
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            ((F) sparseArray.valueAt(i5)).b();
        }
        this.f8523s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(y0.o oVar) {
        byte[] bArr = this.f8510d.f3351a;
        y0.k kVar = (y0.k) oVar;
        kVar.l(bArr, 0, 940, false);
        int i4 = 0;
        while (i4 < 188) {
            for (int i5 = 0; i5 < 5; i5++) {
                if (bArr[(i5 * 188) + i4] != 71) {
                    break;
                }
            }
            kVar.k(i4, false);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // y0.n
    public final int c(y0.o oVar, T.r rVar) {
        y0.o oVar2;
        ?? r12;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        long length = oVar.getLength();
        int i8 = this.f8507a;
        boolean z4 = i8 == 2;
        if (this.o) {
            long j4 = -9223372036854775807L;
            w wVar = this.f8517k;
            if (length != -1 && !z4 && !wVar.f8786d) {
                int i9 = this.f8524t;
                G g4 = wVar.f8784b;
                W.u uVar = wVar.f8785c;
                if (i9 <= 0) {
                    wVar.a(oVar);
                    return 0;
                }
                if (wVar.f8788f) {
                    if (wVar.f8790h == -9223372036854775807L) {
                        wVar.a(oVar);
                        return 0;
                    }
                    if (wVar.f8787e) {
                        long j5 = wVar.f8789g;
                        if (j5 == -9223372036854775807L) {
                            wVar.a(oVar);
                            return 0;
                        }
                        wVar.f8791i = g4.c(wVar.f8790h) - g4.b(j5);
                        wVar.a(oVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, oVar.getLength());
                    long j6 = 0;
                    if (oVar.getPosition() != j6) {
                        rVar.f2881a = j6;
                        return 1;
                    }
                    uVar.J(min);
                    oVar.u();
                    oVar.E(uVar.f3351a, 0, min);
                    int i10 = uVar.f3352b;
                    int i11 = uVar.f3353c;
                    while (true) {
                        if (i10 >= i11) {
                            break;
                        }
                        if (uVar.f3351a[i10] == 71) {
                            long x4 = V3.b.x(uVar, i10, i9);
                            if (x4 != -9223372036854775807L) {
                                j4 = x4;
                                break;
                            }
                        }
                        i10++;
                    }
                    wVar.f8789g = j4;
                    wVar.f8787e = true;
                    return 0;
                }
                long length2 = oVar.getLength();
                int min2 = (int) Math.min(112800, length2);
                long j7 = length2 - min2;
                if (oVar.getPosition() != j7) {
                    rVar.f2881a = j7;
                    return 1;
                }
                uVar.J(min2);
                oVar.u();
                oVar.E(uVar.f3351a, 0, min2);
                int i12 = uVar.f3352b;
                int i13 = uVar.f3353c;
                int i14 = i13 - 188;
                while (true) {
                    if (i14 < i12) {
                        break;
                    }
                    byte[] bArr = uVar.f3351a;
                    int i15 = -4;
                    int i16 = 0;
                    while (true) {
                        if (i15 > 4) {
                            break;
                        }
                        int i17 = (i15 * 188) + i14;
                        if (i17 < i12 || i17 >= i13 || bArr[i17] != 71) {
                            i16 = 0;
                        } else {
                            i16++;
                            if (i16 == 5) {
                                long x5 = V3.b.x(uVar, i14, i9);
                                if (x5 != -9223372036854775807L) {
                                    j4 = x5;
                                    break;
                                }
                            }
                        }
                        i15++;
                    }
                    i14--;
                }
                wVar.f8790h = j4;
                wVar.f8788f = true;
                return 0;
            }
            if (this.f8520p) {
                i4 = 1;
                z = false;
                i5 = i8;
            } else {
                this.f8520p = true;
                long j8 = wVar.f8791i;
                if (j8 != -9223372036854775807L) {
                    i4 = 1;
                    z = false;
                    i5 = i8;
                    D0.c cVar = new D0.c(new C1427b(5), new L3.h(this.f8524t, wVar.f8784b), j8, 1 + j8, 0L, length, 188L, 940);
                    this.f8518l = cVar;
                    this.f8519m.x(cVar.f335a);
                } else {
                    i4 = 1;
                    z = false;
                    i5 = i8;
                    this.f8519m.x(new A0.b(j8));
                }
            }
            if (this.f8521q) {
                this.f8521q = z;
                a(0L, 0L);
                if (oVar.getPosition() != 0) {
                    rVar.f2881a = 0L;
                    return i4;
                }
            }
            D0.c cVar2 = this.f8518l;
            if (cVar2 != null && cVar2.f337c != null) {
                return cVar2.b(oVar, rVar);
            }
            oVar2 = oVar;
            r12 = z;
        } else {
            oVar2 = oVar;
            r12 = 0;
            i4 = 1;
            i5 = i8;
        }
        W.u uVar2 = this.f8510d;
        byte[] bArr2 = uVar2.f3351a;
        if (9400 - uVar2.f3352b < 188) {
            int a3 = uVar2.a();
            if (a3 > 0) {
                System.arraycopy(bArr2, uVar2.f3352b, bArr2, r12, a3);
            }
            uVar2.K(a3, bArr2);
        }
        while (true) {
            int a4 = uVar2.a();
            SparseArray sparseArray = this.f8514h;
            if (a4 >= 188) {
                int i18 = uVar2.f3352b;
                int i19 = uVar2.f3353c;
                byte[] bArr3 = uVar2.f3351a;
                int i20 = i18;
                while (i20 < i19 && bArr3[i20] != 71) {
                    i20++;
                }
                uVar2.M(i20);
                int i21 = i20 + 188;
                if (i21 > i19) {
                    int i22 = (i20 - i18) + this.f8523s;
                    this.f8523s = i22;
                    i6 = i5;
                    i7 = 2;
                    if (i6 == 2 && i22 > 376) {
                        throw T.G.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i6 = i5;
                    i7 = 2;
                    this.f8523s = r12;
                }
                int i23 = uVar2.f3353c;
                if (i21 > i23) {
                    return r12;
                }
                int m4 = uVar2.m();
                if ((8388608 & m4) != 0) {
                    uVar2.M(i21);
                    return r12;
                }
                int i24 = (4194304 & m4) != 0 ? 1 : r12;
                int i25 = (2096896 & m4) >> 8;
                boolean z5 = (m4 & 32) != 0 ? true : r12;
                F f4 = (m4 & 16) != 0 ? (F) sparseArray.get(i25) : null;
                if (f4 == null) {
                    uVar2.M(i21);
                    return r12;
                }
                if (i6 != i7) {
                    int i26 = m4 & 15;
                    SparseIntArray sparseIntArray = this.f8511e;
                    int i27 = sparseIntArray.get(i25, i26 - 1);
                    sparseIntArray.put(i25, i26);
                    if (i27 == i26) {
                        uVar2.M(i21);
                        return r12;
                    }
                    if (i26 != ((i27 + 1) & 15)) {
                        f4.b();
                    }
                }
                if (z5) {
                    int z6 = uVar2.z();
                    i24 |= (uVar2.z() & 64) != 0 ? i7 : r12;
                    uVar2.N(z6 - 1);
                }
                boolean z7 = this.o;
                if (i6 == i7 || z7 || !this.f8516j.get(i25, r12)) {
                    uVar2.L(i21);
                    f4.a(i24, uVar2);
                    uVar2.L(i23);
                }
                if (i6 != i7 && !z7 && this.o && length != -1) {
                    this.f8521q = true;
                }
                uVar2.M(i21);
                return r12;
            }
            int i28 = uVar2.f3353c;
            int read = oVar2.read(bArr2, i28, 9400 - i28);
            if (read == -1) {
                int i29 = r12;
                while (i29 < sparseArray.size()) {
                    F f5 = (F) sparseArray.valueAt(i29);
                    if (f5 instanceof v) {
                        v vVar = (v) f5;
                        int i30 = (!z4 || vVar.e()) ? i4 : r12;
                        if (vVar.f8773c == 3 && vVar.f8780j == -1 && ((!z4 || !(vVar.f8771a instanceof j)) && i30 != 0)) {
                            vVar.a(i4, new W.u());
                        }
                    }
                    i29++;
                    i4 = 1;
                }
                return -1;
            }
            uVar2.L(i28 + read);
            i4 = 1;
        }
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        if ((this.f8508b & 1) == 0) {
            pVar = new U.b(pVar, this.f8513g);
        }
        this.f8519m = pVar;
    }

    @Override // y0.n
    public final void release() {
    }
}
