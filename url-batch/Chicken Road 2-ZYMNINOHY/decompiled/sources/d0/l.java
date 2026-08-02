package d0;

import E1.P;
import E1.X;
import T.C0097o;
import T.F;
import W.J;
import Y.v;
import a0.C0144j;
import a0.Q;
import a0.p0;
import android.os.SystemClock;
import e0.C0391a;
import e0.C0392b;
import e0.C0393c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q0.C1360b;
import r0.AbstractC1395f;
import r0.C1394e;
import r0.InterfaceC1399j;
import t0.C1427b;
import t0.t;
import v2.I;

/* loaded from: classes.dex */
public final class l implements InterfaceC1399j {

    /* renamed from: a, reason: collision with root package name */
    public final u0.o f8169a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.c f8170b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f8171c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8172d;

    /* renamed from: e, reason: collision with root package name */
    public final Y.h f8173e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8174f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8175g;

    /* renamed from: h, reason: collision with root package name */
    public final o f8176h;

    /* renamed from: i, reason: collision with root package name */
    public final j[] f8177i;

    /* renamed from: j, reason: collision with root package name */
    public t f8178j;

    /* renamed from: k, reason: collision with root package name */
    public C0393c f8179k;

    /* renamed from: l, reason: collision with root package name */
    public int f8180l;

    /* renamed from: m, reason: collision with root package name */
    public C1360b f8181m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [d0.l, java.lang.Object] */
    public l(X x4, u0.o oVar, C0393c c0393c, G1.c cVar, int i4, int[] iArr, t tVar, int i5, Y.h hVar, long j4, int i6, boolean z, ArrayList arrayList, o oVar2) {
        j[] jVarArr;
        int i7;
        C0097o c0097o;
        e0.m mVar;
        y0.n oVar3;
        C1394e c1394e;
        ?? obj = new Object();
        obj.f8169a = oVar;
        obj.f8179k = c0393c;
        obj.f8170b = cVar;
        obj.f8171c = iArr;
        obj.f8178j = tVar;
        obj.f8172d = i5;
        obj.f8173e = hVar;
        obj.f8180l = i4;
        obj.f8174f = j4;
        obj.f8175g = i6;
        o oVar4 = oVar2;
        obj.f8176h = oVar4;
        long d4 = c0393c.d(i4);
        ArrayList h2 = obj.h();
        obj.f8177i = new j[tVar.length()];
        int i8 = 0;
        int i9 = 0;
        l lVar = obj;
        while (i9 < lVar.f8177i.length) {
            e0.m mVar2 = (e0.m) h2.get(tVar.h(i9));
            C0392b k4 = cVar.k(mVar2.f8395b);
            j[] jVarArr2 = lVar.f8177i;
            C0392b c0392b = k4 == null ? (C0392b) mVar2.f8395b.get(i8) : k4;
            C0097o c0097o2 = mVar2.f8394a;
            x4.getClass();
            String str = c0097o2.f2868m;
            if (!F.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i7 = i9;
                    mVar = mVar2;
                    c0097o = c0097o2;
                    jVarArr = jVarArr2;
                    oVar3 = new Q0.f((a2.i) x4.f556b, x4.f555a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    oVar3 = new C0.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    oVar3 = new C0.a(1, (byte) 0);
                } else {
                    int i10 = z ? 4 : 0;
                    jVarArr = jVarArr2;
                    i7 = i9;
                    c0097o = c0097o2;
                    int i11 = x4.f555a ? i10 : i10 | 32;
                    mVar = mVar2;
                    oVar3 = new S0.o((a2.i) x4.f556b, i11, null, null, arrayList, oVar4);
                }
                c1394e = new C1394e(oVar3, i5, c0097o);
                long j5 = d4;
                jVarArr[i7] = new j(j5, mVar, c0392b, c1394e, 0L, mVar.c());
                i9 = i7 + 1;
                lVar = this;
                oVar4 = oVar2;
                d4 = j5;
                i8 = 0;
            } else if (x4.f555a) {
                oVar3 = new V0.h(((a2.i) x4.f556b).a(c0097o2), c0097o2);
            } else {
                c1394e = null;
                i7 = i9;
                mVar = mVar2;
                jVarArr = jVarArr2;
                long j52 = d4;
                jVarArr[i7] = new j(j52, mVar, c0392b, c1394e, 0L, mVar.c());
                i9 = i7 + 1;
                lVar = this;
                oVar4 = oVar2;
                d4 = j52;
                i8 = 0;
            }
            i7 = i9;
            mVar = mVar2;
            c0097o = c0097o2;
            jVarArr = jVarArr2;
            c1394e = new C1394e(oVar3, i5, c0097o);
            long j522 = d4;
            jVarArr[i7] = new j(j522, mVar, c0392b, c1394e, 0L, mVar.c());
            i9 = i7 + 1;
            lVar = this;
            oVar4 = oVar2;
            d4 = j522;
            i8 = 0;
        }
    }

    @Override // r0.InterfaceC1399j
    public final void a() {
        C1360b c1360b = this.f8181m;
        if (c1360b != null) {
            throw c1360b;
        }
        this.f8169a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 < (((r10.A() + r8) + r11) - 1)) goto L15;
     */
    @Override // r0.InterfaceC1399j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j4, p0 p0Var) {
        long j5;
        long j6 = j4;
        j[] jVarArr = this.f8177i;
        int length = jVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            j jVar = jVarArr[i4];
            i iVar = jVar.f8164d;
            long j7 = jVar.f8166f;
            i iVar2 = jVar.f8164d;
            if (iVar != null) {
                long c4 = jVar.c();
                if (c4 != 0) {
                    iVar2.getClass();
                    long p2 = iVar2.p(j6, jVar.f8165e) + j7;
                    long e4 = jVar.e(p2);
                    if (e4 < j6) {
                        if (c4 != -1) {
                            iVar2.getClass();
                        }
                        j5 = jVar.e(p2 + 1);
                        return p0Var.a(j6, e4, j5);
                    }
                    j5 = e4;
                    return p0Var.a(j6, e4, j5);
                }
            }
            i4++;
            j6 = j4;
        }
        return j4;
    }

    @Override // r0.InterfaceC1399j
    public final boolean c(long j4, AbstractC1395f abstractC1395f, List list) {
        if (this.f8181m != null) {
            return false;
        }
        return this.f8178j.n(j4, abstractC1395f, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC1399j
    public final void d(Q q4, long j4, List list, X x4) {
        long j5;
        long j6;
        List list2;
        r0.m mVar;
        j[] jVarArr;
        long j7;
        long j8;
        long j9;
        long j10;
        int i4;
        long j11;
        long k4;
        Object kVar;
        long M4;
        long k5;
        boolean z;
        if (this.f8181m != null) {
            return;
        }
        long j12 = q4.f3985a;
        long j13 = j4 - j12;
        long M5 = J.M(this.f8179k.b(this.f8180l).f8379b) + J.M(this.f8179k.f8346a) + j4;
        int i5 = 0;
        o oVar = this.f8176h;
        if (oVar != null) {
            p pVar = oVar.f8196e;
            C0393c c0393c = pVar.f8202f;
            j6 = -9223372036854775807L;
            C0377d c0377d = pVar.f8198b;
            if (!c0393c.f8349d) {
                j5 = j12;
                z = false;
            } else if (pVar.f8204h) {
                j5 = j12;
                z = true;
            } else {
                j5 = j12;
                Map.Entry ceilingEntry = pVar.f8201e.ceilingEntry(Long.valueOf(c0393c.f8353h));
                if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= M5) {
                    z = false;
                } else {
                    long longValue = ((Long) ceilingEntry.getKey()).longValue();
                    h hVar = c0377d.f8117a;
                    long j14 = hVar.f8142M;
                    if (j14 == -9223372036854775807L || j14 < longValue) {
                        hVar.f8142M = longValue;
                    }
                    z = true;
                }
                if (z && pVar.f8203g) {
                    pVar.f8204h = true;
                    pVar.f8203g = false;
                    h hVar2 = c0377d.f8117a;
                    hVar2.f8134D.removeCallbacks(hVar2.f8158w);
                    hVar2.D();
                }
            }
            if (z) {
                return;
            }
        } else {
            j5 = j12;
            j6 = -9223372036854775807L;
        }
        long M6 = J.M(J.A(this.f8174f));
        C0393c c0393c2 = this.f8179k;
        long j15 = c0393c2.f8346a;
        long M7 = j15 == j6 ? j6 : M6 - J.M(j15 + c0393c2.b(this.f8180l).f8379b);
        if (list.isEmpty()) {
            list2 = list;
            mVar = null;
        } else {
            list2 = list;
            mVar = (r0.m) list2.get(list.size() - 1);
        }
        int length = this.f8178j.length();
        r0.n[] nVarArr = new r0.n[length];
        int i6 = 0;
        while (true) {
            jVarArr = this.f8177i;
            if (i6 >= length) {
                break;
            }
            j jVar = jVarArr[i6];
            int i7 = i5;
            i iVar = jVar.f8164d;
            long j16 = M7;
            long j17 = jVar.f8166f;
            long j18 = jVar.f8165e;
            C0144j c0144j = r0.n.f15184w0;
            if (iVar == null) {
                nVarArr[i6] = c0144j;
            } else {
                iVar.getClass();
                long g4 = iVar.g(j18, M6) + j17;
                long b4 = jVar.b(M6);
                if (mVar != null) {
                    k5 = mVar.a();
                } else {
                    i iVar2 = jVar.f8164d;
                    iVar2.getClass();
                    k5 = J.k(iVar2.p(j4, j18) + j17, g4, b4);
                }
                long j19 = k5;
                if (j19 < g4) {
                    nVarArr[i6] = c0144j;
                } else {
                    nVarArr[i6] = new k(i(i6), j19, b4);
                }
            }
            i6++;
            i5 = i7;
            M7 = j16;
        }
        long j20 = M7;
        int i8 = i5;
        if (!this.f8179k.f8349d || jVarArr[i8].c() == 0) {
            j7 = j13;
            j8 = 0;
            j9 = j6;
        } else {
            long d4 = jVarArr[i8].d(jVarArr[i8].b(M6));
            C0393c c0393c3 = this.f8179k;
            long j21 = c0393c3.f8346a;
            if (j21 == j6) {
                j7 = j13;
                M4 = j6;
            } else {
                j7 = j13;
                M4 = M6 - J.M(j21 + c0393c3.b(this.f8180l).f8379b);
            }
            long min = Math.min(M4, d4) - j5;
            j8 = 0;
            j9 = Math.max(0L, min);
        }
        long j22 = j8;
        this.f8178j.j(j5, j7, j9, list2, nVarArr);
        int d5 = this.f8178j.d();
        SystemClock.elapsedRealtime();
        j i9 = i(d5);
        long j23 = i9.f8165e;
        long j24 = i9.f8166f;
        i iVar3 = i9.f8164d;
        C0392b c0392b = i9.f8163c;
        C1394e c1394e = i9.f8161a;
        e0.m mVar2 = i9.f8162b;
        if (c1394e != null) {
            i4 = 1;
            e0.j jVar2 = c1394e.f15137j == null ? mVar2.f8398e : null;
            j10 = j24;
            e0.j d6 = iVar3 == null ? mVar2.d() : null;
            if (jVar2 != null || d6 != null) {
                C0097o l4 = this.f8178j.l();
                int m4 = this.f8178j.m();
                Object q5 = this.f8178j.q();
                if (jVar2 != null) {
                    e0.j a3 = jVar2.a(d6, c0392b.f8342a);
                    if (a3 != null) {
                        jVar2 = a3;
                    }
                } else {
                    d6.getClass();
                    jVar2 = d6;
                }
                x4.f556b = new r0.l(this.f8173e, O3.l.b(mVar2, c0392b.f8342a, jVar2, i8), l4, m4, q5, i9.f8161a);
                return;
            }
        } else {
            j10 = j24;
            i4 = 1;
        }
        C0393c c0393c4 = this.f8179k;
        int i10 = (c0393c4.f8349d && this.f8180l == c0393c4.f8358m.size() + (-1)) ? i4 : i8;
        boolean z4 = (i10 == 0 || j23 != j6) ? i4 : i8;
        if (i9.c() == j22) {
            x4.f555a = z4;
            return;
        }
        iVar3.getClass();
        long g5 = iVar3.g(j23, M6) + j10;
        long b5 = i9.b(M6);
        boolean z5 = z4;
        if (i10 != 0) {
            long d7 = i9.d(b5);
            z5 = (z4 ? 1 : 0) & ((d7 - i9.e(b5)) + d7 >= j23 ? i4 : i8);
        }
        if (mVar != null) {
            k4 = mVar.a();
            j11 = b5;
        } else {
            iVar3.getClass();
            j11 = b5;
            k4 = J.k(iVar3.p(j4, j23) + j10, g5, j11);
        }
        long j25 = k4;
        if (j25 < g5) {
            this.f8181m = new C1360b();
            return;
        }
        if (j25 > j11 || (this.n && j25 >= j11)) {
            x4.f555a = z5;
            return;
        }
        if (z5 != 0 && i9.e(j25) >= j23) {
            x4.f555a = i4;
            return;
        }
        int min2 = (int) Math.min(this.f8175g, (j11 - j25) + 1);
        int i11 = 1;
        if (j23 != j6) {
            while (min2 > 1 && i9.e((min2 + j25) - 1) >= j23) {
                min2--;
            }
        }
        long j26 = list.isEmpty() ? j4 : j6;
        C0097o l5 = this.f8178j.l();
        int m5 = this.f8178j.m();
        Object q6 = this.f8178j.q();
        long e4 = i9.e(j25);
        iVar3.getClass();
        e0.j i12 = iVar3.i(j25 - j10);
        Y.h hVar3 = this.f8173e;
        if (c1394e == null) {
            kVar = new r0.o(hVar3, O3.l.b(mVar2, c0392b.f8342a, i12, i9.f(j25, j20) ? 0 : 8), l5, m5, q6, e4, i9.d(j25), j25, this.f8172d, l5);
        } else {
            e0.j jVar3 = i12;
            int i13 = 1;
            while (i11 < min2) {
                int i14 = min2;
                iVar3.getClass();
                e0.j a4 = jVar3.a(iVar3.i((j25 + i11) - j10), c0392b.f8342a);
                if (a4 == null) {
                    break;
                }
                i13++;
                i11++;
                jVar3 = a4;
                min2 = i14;
            }
            long j27 = (j25 + i13) - 1;
            long d8 = i9.d(j27);
            long j28 = (j23 == j6 || j23 > d8) ? j6 : j23;
            Y.k b6 = O3.l.b(mVar2, c0392b.f8342a, jVar3, i9.f(j27, j20) ? 0 : 8);
            long j29 = -mVar2.f8396c;
            if (F.k(l5.n)) {
                j29 += e4;
            }
            kVar = new r0.k(hVar3, b6, l5, m5, q6, e4, d8, j26, j28, j25, i13, j29, i9.f8161a);
        }
        x4.f556b = kVar;
    }

    @Override // r0.InterfaceC1399j
    public final int e(List list, long j4) {
        return (this.f8181m != null || this.f8178j.length() < 2) ? list.size() : this.f8178j.t(list, j4);
    }

    @Override // r0.InterfaceC1399j
    public final boolean f(AbstractC1395f abstractC1395f, boolean z, P p2, C1427b c1427b) {
        long j4;
        if (z) {
            o oVar = this.f8176h;
            if (oVar != null) {
                long j5 = oVar.f8195d;
                boolean z4 = j5 != -9223372036854775807L && j5 < abstractC1395f.f15144g;
                p pVar = oVar.f8196e;
                if (pVar.f8202f.f8349d) {
                    if (!pVar.f8204h) {
                        if (z4) {
                            if (pVar.f8203g) {
                                pVar.f8204h = true;
                                pVar.f8203g = false;
                                h hVar = pVar.f8198b.f8117a;
                                hVar.f8134D.removeCallbacks(hVar.f8158w);
                                hVar.D();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z5 = this.f8179k.f8349d;
            j[] jVarArr = this.f8177i;
            if (!z5 && (abstractC1395f instanceof r0.m)) {
                IOException iOException = (IOException) p2.f519c;
                if ((iOException instanceof v) && ((v) iOException).f3743c == 404) {
                    j jVar = jVarArr[this.f8178j.b(abstractC1395f.f15141d)];
                    long c4 = jVar.c();
                    if (c4 != -1 && c4 != 0) {
                        i iVar = jVar.f8164d;
                        iVar.getClass();
                        if (((r0.m) abstractC1395f).a() > ((iVar.A() + jVar.f8166f) + c4) - 1) {
                            this.n = true;
                            return true;
                        }
                    }
                }
            }
            j jVar2 = jVarArr[this.f8178j.b(abstractC1395f.f15141d)];
            e0.m mVar = jVar2.f8162b;
            C0392b c0392b = jVar2.f8163c;
            I i4 = mVar.f8395b;
            G1.c cVar = this.f8170b;
            C0392b k4 = cVar.k(i4);
            if (k4 == null || c0392b.equals(k4)) {
                t tVar = this.f8178j;
                I i5 = jVar2.f8162b.f8395b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = tVar.length();
                int i6 = 0;
                for (int i7 = 0; i7 < length; i7++) {
                    if (tVar.a(i7, elapsedRealtime)) {
                        i6++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i8 = 0; i8 < i5.size(); i8++) {
                    hashSet.add(Integer.valueOf(((C0392b) i5.get(i8)).f8344c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList d4 = cVar.d(i5);
                for (int i9 = 0; i9 < d4.size(); i9++) {
                    hashSet2.add(Integer.valueOf(((C0392b) d4.get(i9)).f8344c));
                }
                u0.h hVar2 = new u0.h(size, size - hashSet2.size(), length, i6);
                if (hVar2.a(2) || hVar2.a(1)) {
                    c1427b.getClass();
                    g1.e f4 = C1427b.f(hVar2, p2);
                    if (f4 != null) {
                        long j6 = f4.f9027b;
                        int i10 = f4.f9026a;
                        if (hVar2.a(i10)) {
                            if (i10 == 2) {
                                t tVar2 = this.f8178j;
                                return tVar2.o(tVar2.b(abstractC1395f.f15141d), j6);
                            }
                            if (i10 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j6;
                                String str = c0392b.f8343b;
                                HashMap hashMap = (HashMap) cVar.f835b;
                                if (hashMap.containsKey(str)) {
                                    Long l4 = (Long) hashMap.get(str);
                                    String str2 = J.f3263a;
                                    j4 = Math.max(elapsedRealtime2, l4.longValue());
                                } else {
                                    j4 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j4));
                                int i11 = c0392b.f8344c;
                                if (i11 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i11);
                                    HashMap hashMap2 = (HashMap) cVar.f836c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l5 = (Long) hashMap2.get(valueOf);
                                        String str3 = J.f3263a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l5.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // r0.InterfaceC1399j
    public final void g(AbstractC1395f abstractC1395f) {
        if (abstractC1395f instanceof r0.l) {
            int b4 = this.f8178j.b(((r0.l) abstractC1395f).f15141d);
            j[] jVarArr = this.f8177i;
            j jVar = jVarArr[b4];
            if (jVar.f8164d == null) {
                C1394e c1394e = jVar.f8161a;
                c1394e.getClass();
                y0.j a3 = c1394e.a();
                if (a3 != null) {
                    e0.m mVar = jVar.f8162b;
                    jVarArr[b4] = new j(jVar.f8165e, mVar, jVar.f8163c, jVar.f8161a, jVar.f8166f, new G0.c(a3, mVar.f8396c, 2));
                }
            }
        }
        o oVar = this.f8176h;
        if (oVar != null) {
            long j4 = oVar.f8195d;
            if (j4 == -9223372036854775807L || abstractC1395f.f15145h > j4) {
                oVar.f8195d = abstractC1395f.f15145h;
            }
            oVar.f8196e.f8203g = true;
        }
    }

    public final ArrayList h() {
        List list = this.f8179k.b(this.f8180l).f8380c;
        ArrayList arrayList = new ArrayList();
        for (int i4 : this.f8171c) {
            arrayList.addAll(((C0391a) list.get(i4)).f8338c);
        }
        return arrayList;
    }

    public final j i(int i4) {
        j[] jVarArr = this.f8177i;
        j jVar = jVarArr[i4];
        C0392b k4 = this.f8170b.k(jVar.f8162b.f8395b);
        if (k4 == null || k4.equals(jVar.f8163c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.f8165e, jVar.f8162b, k4, jVar.f8161a, jVar.f8166f, jVar.f8164d);
        jVarArr[i4] = jVar2;
        return jVar2;
    }

    @Override // r0.InterfaceC1399j
    public final void release() {
        for (j jVar : this.f8177i) {
            C1394e c1394e = jVar.f8161a;
            if (c1394e != null) {
                c1394e.f15128a.release();
            }
        }
    }
}
