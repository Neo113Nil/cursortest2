package f1;

import E.AbstractC0005f;
import T.C0089g;
import T.C0096n;
import W.AbstractC0110c;
import W.J;
import a0.C0134J;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final B f8681a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8682b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8683c;

    /* renamed from: g, reason: collision with root package name */
    public long f8687g;

    /* renamed from: i, reason: collision with root package name */
    public String f8689i;

    /* renamed from: j, reason: collision with root package name */
    public y0.F f8690j;

    /* renamed from: k, reason: collision with root package name */
    public o f8691k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8692l;
    public boolean n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f8688h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final C0134J f8684d = new C0134J(7);

    /* renamed from: e, reason: collision with root package name */
    public final C0134J f8685e = new C0134J(8);

    /* renamed from: f, reason: collision with root package name */
    public final C0134J f8686f = new C0134J(6);

    /* renamed from: m, reason: collision with root package name */
    public long f8693m = -9223372036854775807L;
    public final W.u o = new W.u();

    public p(B b4, boolean z, boolean z4) {
        this.f8681a = b4;
        this.f8682b = z;
        this.f8683c = z4;
    }

    @Override // f1.h
    public final void a(W.u uVar) {
        int i4;
        this.f8690j.getClass();
        String str = J.f3263a;
        int i5 = uVar.f3352b;
        int i6 = uVar.f3353c;
        byte[] bArr = uVar.f3351a;
        this.f8687g += uVar.a();
        this.f8690j.a(uVar.a(), uVar);
        while (true) {
            int b4 = X.p.b(bArr, i5, i6, this.f8688h);
            if (b4 == i6) {
                g(bArr, i5, i6);
                return;
            }
            int i7 = bArr[b4 + 3] & 31;
            if (b4 <= 0 || bArr[b4 - 1] != 0) {
                i4 = 3;
            } else {
                b4--;
                i4 = 4;
            }
            int i8 = b4 - i5;
            if (i8 > 0) {
                g(bArr, i5, b4);
            }
            int i9 = i6 - b4;
            long j4 = this.f8687g - i9;
            f(i9, i8 < 0 ? -i8 : 0, j4, this.f8693m);
            h(i7, j4, this.f8693m);
            i5 = b4 + i4;
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8687g = 0L;
        this.n = false;
        this.f8693m = -9223372036854775807L;
        X.p.a(this.f8688h);
        this.f8684d.d();
        this.f8685e.d();
        this.f8686f.d();
        this.f8681a.f8506d.c(0);
        o oVar = this.f8691k;
        if (oVar != null) {
            oVar.f8674k = false;
            oVar.o = false;
            n nVar = oVar.n;
            nVar.f8651b = false;
            nVar.f8650a = false;
        }
    }

    @Override // f1.h
    public final void c(boolean z) {
        this.f8690j.getClass();
        String str = J.f3263a;
        if (z) {
            this.f8681a.f8506d.c(0);
            f(0, 0, this.f8687g, this.f8693m);
            h(9, this.f8687g, this.f8693m);
            f(0, 0, this.f8687g, this.f8693m);
        }
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8693m = j4;
        this.n = ((i4 & 2) != 0) | this.n;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8689i = (String) e4.f8531e;
        e4.c();
        y0.F z = pVar.z(e4.f8529c, 2);
        this.f8690j = z;
        this.f8691k = new o(z, this.f8682b, this.f8683c);
        this.f8681a.b(pVar, e4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a2, code lost:
    
        if (r3.f8659j == r4.f8659j) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ac, code lost:
    
        if (r9 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01be, code lost:
    
        if (r3.n == r4.n) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01cf, code lost:
    
        if (r3.f8663p == r4.f8663p) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01dd, code lost:
    
        if (r3.f8661l == r4.f8661l) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        if (r3 == 1) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i4, int i5, long j4, long j5) {
        boolean z;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        K3.n nVar = this.f8681a.f8506d;
        if (!this.f8692l || this.f8691k.f8666c) {
            C0134J c0134j = this.f8684d;
            c0134j.b(i5);
            C0134J c0134j2 = this.f8685e;
            c0134j2.b(i5);
            if (this.f8692l) {
                if (c0134j.f3911c) {
                    X.o k4 = X.p.k((byte[]) c0134j.f3913e, 3, c0134j.f3912d);
                    nVar.i(k4.f3551s);
                    this.f8691k.f8667d.append(k4.f3538d, k4);
                    c0134j.d();
                } else if (c0134j2.f3911c) {
                    W.t tVar = new W.t((byte[]) c0134j2.f3913e, 4, c0134j2.f3912d);
                    int m4 = tVar.m();
                    int m5 = tVar.m();
                    tVar.s();
                    this.f8691k.f8668e.append(m4, new X.n(m4, tVar.h(), m5));
                    c0134j2.d();
                }
            } else if (c0134j.f3911c && c0134j2.f3911c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) c0134j.f3913e, c0134j.f3912d));
                arrayList.add(Arrays.copyOf((byte[]) c0134j2.f3913e, c0134j2.f3912d));
                X.o k5 = X.p.k((byte[]) c0134j.f3913e, 3, c0134j.f3912d);
                int i8 = k5.f3551s;
                W.t tVar2 = new W.t((byte[]) c0134j2.f3913e, 4, c0134j2.f3912d);
                int m6 = tVar2.m();
                int m7 = tVar2.m();
                tVar2.s();
                X.n nVar2 = new X.n(m6, tVar2.h(), m7);
                String a3 = AbstractC0110c.a(k5.f3535a, k5.f3536b, k5.f3537c);
                y0.F f4 = this.f8690j;
                C0096n c0096n = new C0096n();
                c0096n.f2819a = this.f8689i;
                c0096n.f2830l = T.F.n("video/mp2t");
                c0096n.f2831m = T.F.n("video/avc");
                c0096n.f2828j = a3;
                c0096n.f2836t = k5.f3539e;
                c0096n.f2837u = k5.f3540f;
                c0096n.f2808C = new C0089g(k5.f3548p, k5.f3549q, k5.f3550r, null, k5.f3542h + 8, k5.f3543i + 8);
                c0096n.z = k5.f3541g;
                c0096n.f2832p = arrayList;
                c0096n.o = i8;
                AbstractC0005f.w(c0096n, f4);
                this.f8692l = true;
                nVar.i(i8);
                this.f8691k.f8667d.append(k5.f3538d, k5);
                this.f8691k.f8668e.append(m6, nVar2);
                c0134j.d();
                c0134j2.d();
            }
        }
        C0134J c0134j3 = this.f8686f;
        if (c0134j3.b(i5)) {
            int n = X.p.n(c0134j3.f3912d, (byte[]) c0134j3.f3913e);
            byte[] bArr = (byte[]) c0134j3.f3913e;
            W.u uVar = this.o;
            uVar.K(n, bArr);
            uVar.M(4);
            nVar.a(j5, uVar);
        }
        o oVar = this.f8691k;
        boolean z6 = this.f8692l;
        if (oVar.f8672i != 9) {
            if (oVar.f8666c) {
                n nVar3 = oVar.n;
                n nVar4 = oVar.f8676m;
                if (nVar3.f8650a) {
                    if (nVar4.f8650a) {
                        X.o oVar2 = nVar3.f8652c;
                        oVar2.getClass();
                        X.o oVar3 = nVar4.f8652c;
                        oVar3.getClass();
                        int i9 = oVar3.f3547m;
                        if (nVar3.f8655f == nVar4.f8655f) {
                            if (nVar3.f8656g == nVar4.f8656g) {
                                if (nVar3.f8657h == nVar4.f8657h) {
                                    if (nVar3.f8658i) {
                                        if (nVar4.f8658i) {
                                        }
                                    }
                                    int i10 = nVar3.f8653d;
                                    int i11 = nVar4.f8653d;
                                    if (i10 != i11) {
                                        if (i10 != 0) {
                                        }
                                    }
                                    int i12 = oVar2.f3547m;
                                    if (i12 == 0) {
                                        if (i9 == 0) {
                                            if (nVar3.f8662m == nVar4.f8662m) {
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                        if (i9 == 1) {
                                            if (nVar3.o == nVar4.o) {
                                            }
                                        }
                                    }
                                    boolean z7 = nVar3.f8660k;
                                    if (z7 == nVar4.f8660k) {
                                        if (z7) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (oVar.f8665b) {
                z = oVar.f8680s;
            } else {
                n nVar5 = oVar.n;
                z = nVar5.f8651b && ((i7 = nVar5.f8654e) == 7 || i7 == 2);
            }
            boolean z8 = oVar.f8679r;
            i6 = oVar.f8672i;
            if (i6 == 5) {
                if (z) {
                    z4 = true;
                }
                z4 = false;
            } else {
                z4 = true;
            }
            z5 = z8 | z4;
            oVar.f8679r = z5;
            oVar.f8672i = 24;
            if (z5) {
                return;
            }
            this.n = false;
            return;
        }
        if (z6 && oVar.o) {
            long j6 = oVar.f8673j;
            int i13 = i4 + ((int) (j4 - j6));
            long j7 = oVar.f8678q;
            if (j7 != -9223372036854775807L) {
                long j8 = oVar.f8677p;
                if (j6 != j8) {
                    oVar.f8664a.e(j7, oVar.f8679r ? 1 : 0, (int) (j6 - j8), i13, null);
                }
            }
        }
        oVar.f8677p = oVar.f8673j;
        oVar.f8678q = oVar.f8675l;
        oVar.f8679r = false;
        oVar.o = true;
        if (oVar.f8665b) {
        }
        boolean z82 = oVar.f8679r;
        i6 = oVar.f8672i;
        if (i6 == 5) {
        }
        z5 = z82 | z4;
        oVar.f8679r = z5;
        oVar.f8672i = 24;
        if (z5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(byte[] bArr, int i4, int i5) {
        boolean z;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (!this.f8692l || this.f8691k.f8666c) {
            this.f8684d.a(bArr, i4, i5);
            this.f8685e.a(bArr, i4, i5);
        }
        this.f8686f.a(bArr, i4, i5);
        o oVar = this.f8691k;
        SparseArray sparseArray = oVar.f8668e;
        W.t tVar = oVar.f8669f;
        if (oVar.f8674k) {
            int i12 = i5 - i4;
            byte[] bArr2 = oVar.f8670g;
            int length = bArr2.length;
            int i13 = oVar.f8671h + i12;
            if (length < i13) {
                oVar.f8670g = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i4, oVar.f8670g, oVar.f8671h, i12);
            int i14 = oVar.f8671h + i12;
            oVar.f8671h = i14;
            tVar.f3345d = oVar.f8670g;
            tVar.f3344c = 0;
            tVar.f3343b = i14;
            tVar.f3346e = 0;
            tVar.a();
            if (tVar.d(8)) {
                tVar.s();
                int i15 = tVar.i(2);
                tVar.t(5);
                if (tVar.e()) {
                    tVar.m();
                    if (tVar.e()) {
                        int m4 = tVar.m();
                        if (!oVar.f8666c) {
                            oVar.f8674k = false;
                            n nVar = oVar.n;
                            nVar.f8654e = m4;
                            nVar.f8651b = true;
                            return;
                        }
                        if (tVar.e()) {
                            int m5 = tVar.m();
                            if (sparseArray.indexOfKey(m5) < 0) {
                                oVar.f8674k = false;
                                return;
                            }
                            X.n nVar2 = (X.n) sparseArray.get(m5);
                            SparseArray sparseArray2 = oVar.f8667d;
                            int i16 = nVar2.f3533a;
                            boolean z7 = nVar2.f3534b;
                            X.o oVar2 = (X.o) sparseArray2.get(i16);
                            boolean z8 = oVar2.f3544j;
                            int i17 = oVar2.n;
                            int i18 = oVar2.f3546l;
                            if (z8) {
                                if (!tVar.d(2)) {
                                    return;
                                } else {
                                    tVar.t(2);
                                }
                            }
                            if (tVar.d(i18)) {
                                int i19 = tVar.i(i18);
                                if (oVar2.f3545k) {
                                    z = false;
                                    z4 = false;
                                } else {
                                    if (!tVar.d(1)) {
                                        return;
                                    }
                                    z = tVar.h();
                                    if (z) {
                                        if (tVar.d(1)) {
                                            z4 = tVar.h();
                                            z5 = true;
                                            z6 = oVar.f8672i != 5;
                                            if (z6) {
                                                i6 = 0;
                                            } else if (!tVar.e()) {
                                                return;
                                            } else {
                                                i6 = tVar.m();
                                            }
                                            i7 = oVar2.f3547m;
                                            if (i7 != 0) {
                                                if (!tVar.d(i17)) {
                                                    return;
                                                }
                                                i10 = tVar.i(i17);
                                                if (!z7 || z) {
                                                    i8 = 0;
                                                } else if (!tVar.e()) {
                                                    return;
                                                } else {
                                                    i8 = tVar.n();
                                                }
                                                i9 = 0;
                                            } else {
                                                if (i7 == 1 && !oVar2.o) {
                                                    if (tVar.e()) {
                                                        int n = tVar.n();
                                                        if (!z7 || z) {
                                                            i11 = n;
                                                            i8 = 0;
                                                            i9 = 0;
                                                        } else {
                                                            if (!tVar.e()) {
                                                                return;
                                                            }
                                                            i9 = tVar.n();
                                                            i11 = n;
                                                            i8 = 0;
                                                        }
                                                        i10 = 0;
                                                        n nVar3 = oVar.n;
                                                        nVar3.f8652c = oVar2;
                                                        nVar3.f8653d = i15;
                                                        nVar3.f8654e = m4;
                                                        nVar3.f8655f = i19;
                                                        nVar3.f8656g = m5;
                                                        nVar3.f8657h = z;
                                                        nVar3.f8658i = z5;
                                                        nVar3.f8659j = z4;
                                                        nVar3.f8660k = z6;
                                                        nVar3.f8661l = i6;
                                                        nVar3.f8662m = i10;
                                                        nVar3.n = i8;
                                                        nVar3.o = i11;
                                                        nVar3.f8663p = i9;
                                                        nVar3.f8650a = true;
                                                        nVar3.f8651b = true;
                                                        oVar.f8674k = false;
                                                    }
                                                    return;
                                                }
                                                i8 = 0;
                                                i9 = 0;
                                                i10 = 0;
                                            }
                                            i11 = 0;
                                            n nVar32 = oVar.n;
                                            nVar32.f8652c = oVar2;
                                            nVar32.f8653d = i15;
                                            nVar32.f8654e = m4;
                                            nVar32.f8655f = i19;
                                            nVar32.f8656g = m5;
                                            nVar32.f8657h = z;
                                            nVar32.f8658i = z5;
                                            nVar32.f8659j = z4;
                                            nVar32.f8660k = z6;
                                            nVar32.f8661l = i6;
                                            nVar32.f8662m = i10;
                                            nVar32.n = i8;
                                            nVar32.o = i11;
                                            nVar32.f8663p = i9;
                                            nVar32.f8650a = true;
                                            nVar32.f8651b = true;
                                            oVar.f8674k = false;
                                        }
                                        return;
                                    }
                                    z4 = false;
                                }
                                z5 = z4;
                                if (oVar.f8672i != 5) {
                                }
                                if (z6) {
                                }
                                i7 = oVar2.f3547m;
                                if (i7 != 0) {
                                }
                                i11 = 0;
                                n nVar322 = oVar.n;
                                nVar322.f8652c = oVar2;
                                nVar322.f8653d = i15;
                                nVar322.f8654e = m4;
                                nVar322.f8655f = i19;
                                nVar322.f8656g = m5;
                                nVar322.f8657h = z;
                                nVar322.f8658i = z5;
                                nVar322.f8659j = z4;
                                nVar322.f8660k = z6;
                                nVar322.f8661l = i6;
                                nVar322.f8662m = i10;
                                nVar322.n = i8;
                                nVar322.o = i11;
                                nVar322.f8663p = i9;
                                nVar322.f8650a = true;
                                nVar322.f8651b = true;
                                oVar.f8674k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(int i4, long j4, long j5) {
        if (!this.f8692l || this.f8691k.f8666c) {
            this.f8684d.e(i4);
            this.f8685e.e(i4);
        }
        this.f8686f.e(i4);
        o oVar = this.f8691k;
        boolean z = this.n;
        oVar.f8672i = i4;
        oVar.f8675l = j5;
        oVar.f8673j = j4;
        oVar.f8680s = z;
        if (!oVar.f8665b || i4 != 1) {
            if (!oVar.f8666c) {
                return;
            }
            if (i4 != 5 && i4 != 1 && i4 != 2) {
                return;
            }
        }
        n nVar = oVar.f8676m;
        oVar.f8676m = oVar.n;
        oVar.n = nVar;
        nVar.f8651b = false;
        nVar.f8650a = false;
        oVar.f8671h = 0;
        oVar.f8674k = true;
    }
}
