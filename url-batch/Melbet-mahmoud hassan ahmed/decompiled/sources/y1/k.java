package y1;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import n2.g0;
import n2.p0;
import o2.m0;
import o2.v;
import r0.j3;
import r0.s1;
import s0.u1;
import t1.e0;
import t1.q0;
import t1.r0;
import t1.u;
import t1.x0;
import t1.z0;
import v0.w;
import v0.y;
import y1.p;
import z1.h;
import z1.l;

/* loaded from: classes.dex */
public final class k implements u, p.b, l.b {
    private int B;
    private r0 C;

    /* renamed from: f, reason: collision with root package name */
    private final h f23304f;

    /* renamed from: g, reason: collision with root package name */
    private final z1.l f23305g;

    /* renamed from: h, reason: collision with root package name */
    private final g f23306h;

    /* renamed from: i, reason: collision with root package name */
    private final p0 f23307i;

    /* renamed from: j, reason: collision with root package name */
    private final y f23308j;

    /* renamed from: k, reason: collision with root package name */
    private final w.a f23309k;

    /* renamed from: l, reason: collision with root package name */
    private final g0 f23310l;

    /* renamed from: m, reason: collision with root package name */
    private final e0.a f23311m;

    /* renamed from: n, reason: collision with root package name */
    private final n2.b f23312n;

    /* renamed from: q, reason: collision with root package name */
    private final t1.i f23315q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f23316r;

    /* renamed from: s, reason: collision with root package name */
    private final int f23317s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f23318t;

    /* renamed from: u, reason: collision with root package name */
    private final u1 f23319u;

    /* renamed from: v, reason: collision with root package name */
    private u.a f23320v;

    /* renamed from: w, reason: collision with root package name */
    private int f23321w;

    /* renamed from: x, reason: collision with root package name */
    private z0 f23322x;

    /* renamed from: o, reason: collision with root package name */
    private final IdentityHashMap<q0, Integer> f23313o = new IdentityHashMap<>();

    /* renamed from: p, reason: collision with root package name */
    private final s f23314p = new s();

    /* renamed from: y, reason: collision with root package name */
    private p[] f23323y = new p[0];

    /* renamed from: z, reason: collision with root package name */
    private p[] f23324z = new p[0];
    private int[][] A = new int[0][];

    public k(h hVar, z1.l lVar, g gVar, p0 p0Var, y yVar, w.a aVar, g0 g0Var, e0.a aVar2, n2.b bVar, t1.i iVar, boolean z6, int i7, boolean z7, u1 u1Var) {
        this.f23304f = hVar;
        this.f23305g = lVar;
        this.f23306h = gVar;
        this.f23307i = p0Var;
        this.f23308j = yVar;
        this.f23309k = aVar;
        this.f23310l = g0Var;
        this.f23311m = aVar2;
        this.f23312n = bVar;
        this.f23315q = iVar;
        this.f23316r = z6;
        this.f23317s = i7;
        this.f23318t = z7;
        this.f23319u = u1Var;
        this.C = iVar.a(new r0[0]);
    }

    private void m(long j7, List<h.a> list, List<p> list2, List<int[]> list3, Map<String, v0.m> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = list.get(i7).f23593d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z6 = true;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    if (m0.c(str, list.get(i8).f23593d)) {
                        h.a aVar = list.get(i8);
                        arrayList3.add(Integer.valueOf(i8));
                        arrayList.add(aVar.f23590a);
                        arrayList2.add(aVar.f23591b);
                        z6 &= m0.K(aVar.f23591b.f20953n, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p w6 = w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) m0.k(new Uri[0])), (s1[]) arrayList2.toArray(new s1[0]), null, Collections.emptyList(), map, j7);
                list3.add(o4.d.k(arrayList3));
                list2.add(w6);
                if (this.f23316r && z6) {
                    w6.d0(new x0[]{new x0(str2, (s1[]) arrayList2.toArray(new s1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void o(z1.h hVar, long j7, List<p> list, List<int[]> list2, Map<String, v0.m> map) {
        boolean z6;
        boolean z7;
        int i7;
        int size = hVar.f23581e.size();
        int[] iArr = new int[size];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < hVar.f23581e.size(); i10++) {
            s1 s1Var = hVar.f23581e.get(i10).f23595b;
            if (s1Var.f20962w > 0 || m0.L(s1Var.f20953n, 2) != null) {
                iArr[i10] = 2;
                i8++;
            } else if (m0.L(s1Var.f20953n, 1) != null) {
                iArr[i10] = 1;
                i9++;
            } else {
                iArr[i10] = -1;
            }
        }
        if (i8 > 0) {
            size = i8;
            z6 = true;
        } else {
            if (i9 < size) {
                size -= i9;
                z6 = false;
                z7 = true;
                Uri[] uriArr = new Uri[size];
                s1[] s1VarArr = new s1[size];
                int[] iArr2 = new int[size];
                int i11 = 0;
                for (i7 = 0; i7 < hVar.f23581e.size(); i7++) {
                    if ((!z6 || iArr[i7] == 2) && (!z7 || iArr[i7] != 1)) {
                        h.b bVar = hVar.f23581e.get(i7);
                        uriArr[i11] = bVar.f23594a;
                        s1VarArr[i11] = bVar.f23595b;
                        iArr2[i11] = i7;
                        i11++;
                    }
                }
                String str = s1VarArr[0].f20953n;
                int K = m0.K(str, 2);
                int K2 = m0.K(str, 1);
                boolean z8 = (K2 != 1 || (K2 == 0 && hVar.f23583g.isEmpty())) && K <= 1 && K2 + K > 0;
                p w6 = w("main", (!z6 || K2 <= 0) ? 0 : 1, uriArr, s1VarArr, hVar.f23586j, hVar.f23587k, map, j7);
                list.add(w6);
                list2.add(iArr2);
                if (this.f23316r || !z8) {
                }
                ArrayList arrayList = new ArrayList();
                if (K > 0) {
                    s1[] s1VarArr2 = new s1[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        s1VarArr2[i12] = z(s1VarArr[i12]);
                    }
                    arrayList.add(new x0("main", s1VarArr2));
                    if (K2 > 0 && (hVar.f23586j != null || hVar.f23583g.isEmpty())) {
                        arrayList.add(new x0("main:audio", x(s1VarArr[0], hVar.f23586j, false)));
                    }
                    List<s1> list3 = hVar.f23587k;
                    if (list3 != null) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            arrayList.add(new x0("main:cc:" + i13, list3.get(i13)));
                        }
                    }
                } else {
                    s1[] s1VarArr3 = new s1[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        s1VarArr3[i14] = x(s1VarArr[i14], hVar.f23586j, true);
                    }
                    arrayList.add(new x0("main", s1VarArr3));
                }
                x0 x0Var = new x0("main:id3", new s1.b().S("ID3").e0("application/id3").E());
                arrayList.add(x0Var);
                w6.d0((x0[]) arrayList.toArray(new x0[0]), 0, arrayList.indexOf(x0Var));
                return;
            }
            z6 = false;
        }
        z7 = false;
        Uri[] uriArr2 = new Uri[size];
        s1[] s1VarArr4 = new s1[size];
        int[] iArr22 = new int[size];
        int i112 = 0;
        while (i7 < hVar.f23581e.size()) {
        }
        String str2 = s1VarArr4[0].f20953n;
        int K3 = m0.K(str2, 2);
        int K22 = m0.K(str2, 1);
        if (K22 != 1) {
        }
        p w62 = w("main", (!z6 || K22 <= 0) ? 0 : 1, uriArr2, s1VarArr4, hVar.f23586j, hVar.f23587k, map, j7);
        list.add(w62);
        list2.add(iArr22);
        if (this.f23316r) {
        }
    }

    private void v(long j7) {
        z1.h hVar = (z1.h) o2.a.e(this.f23305g.b());
        Map<String, v0.m> y6 = this.f23318t ? y(hVar.f23589m) : Collections.emptyMap();
        boolean z6 = !hVar.f23581e.isEmpty();
        List<h.a> list = hVar.f23583g;
        List<h.a> list2 = hVar.f23584h;
        this.f23321w = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z6) {
            o(hVar, j7, arrayList, arrayList2, y6);
        }
        m(j7, list, arrayList, arrayList2, y6);
        this.B = arrayList.size();
        int i7 = 0;
        while (i7 < list2.size()) {
            h.a aVar = list2.get(i7);
            String str = "subtitle:" + i7 + ":" + aVar.f23593d;
            ArrayList arrayList3 = arrayList2;
            int i8 = i7;
            p w6 = w(str, 3, new Uri[]{aVar.f23590a}, new s1[]{aVar.f23591b}, null, Collections.emptyList(), y6, j7);
            arrayList3.add(new int[]{i8});
            arrayList.add(w6);
            w6.d0(new x0[]{new x0(str, aVar.f23591b)}, 0, new int[0]);
            i7 = i8 + 1;
            arrayList2 = arrayList3;
        }
        this.f23323y = (p[]) arrayList.toArray(new p[0]);
        this.A = (int[][]) arrayList2.toArray(new int[0][]);
        this.f23321w = this.f23323y.length;
        for (int i9 = 0; i9 < this.B; i9++) {
            this.f23323y[i9].m0(true);
        }
        for (p pVar : this.f23323y) {
            pVar.B();
        }
        this.f23324z = this.f23323y;
    }

    private p w(String str, int i7, Uri[] uriArr, s1[] s1VarArr, s1 s1Var, List<s1> list, Map<String, v0.m> map, long j7) {
        return new p(str, i7, this, new f(this.f23304f, this.f23305g, uriArr, s1VarArr, this.f23306h, this.f23307i, this.f23314p, list, this.f23319u), map, this.f23312n, j7, s1Var, this.f23308j, this.f23309k, this.f23310l, this.f23311m, this.f23317s);
    }

    private static s1 x(s1 s1Var, s1 s1Var2, boolean z6) {
        String str;
        j1.a aVar;
        int i7;
        int i8;
        int i9;
        String str2;
        String str3;
        if (s1Var2 != null) {
            str2 = s1Var2.f20953n;
            aVar = s1Var2.f20954o;
            int i10 = s1Var2.D;
            i8 = s1Var2.f20948i;
            int i11 = s1Var2.f20949j;
            String str4 = s1Var2.f20947h;
            str3 = s1Var2.f20946g;
            i9 = i10;
            i7 = i11;
            str = str4;
        } else {
            String L = m0.L(s1Var.f20953n, 1);
            j1.a aVar2 = s1Var.f20954o;
            if (z6) {
                int i12 = s1Var.D;
                int i13 = s1Var.f20948i;
                int i14 = s1Var.f20949j;
                str = s1Var.f20947h;
                str2 = L;
                str3 = s1Var.f20946g;
                i9 = i12;
                i8 = i13;
                aVar = aVar2;
                i7 = i14;
            } else {
                str = null;
                aVar = aVar2;
                i7 = 0;
                i8 = 0;
                i9 = -1;
                str2 = L;
                str3 = null;
            }
        }
        return new s1.b().S(s1Var.f20945f).U(str3).K(s1Var.f20955p).e0(v.g(str2)).I(str2).X(aVar).G(z6 ? s1Var.f20950k : -1).Z(z6 ? s1Var.f20951l : -1).H(i9).g0(i8).c0(i7).V(str).E();
    }

    private static Map<String, v0.m> y(List<v0.m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            v0.m mVar = list.get(i7);
            String str = mVar.f22683h;
            i7++;
            int i8 = i7;
            while (i8 < arrayList.size()) {
                v0.m mVar2 = (v0.m) arrayList.get(i8);
                if (TextUtils.equals(mVar2.f22683h, str)) {
                    mVar = mVar.j(mVar2);
                    arrayList.remove(i8);
                } else {
                    i8++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    private static s1 z(s1 s1Var) {
        String L = m0.L(s1Var.f20953n, 2);
        return new s1.b().S(s1Var.f20945f).U(s1Var.f20946g).K(s1Var.f20955p).e0(v.g(L)).I(L).X(s1Var.f20954o).G(s1Var.f20950k).Z(s1Var.f20951l).j0(s1Var.f20961v).Q(s1Var.f20962w).P(s1Var.f20963x).g0(s1Var.f20948i).c0(s1Var.f20949j).E();
    }

    @Override // t1.r0.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void l(p pVar) {
        this.f23320v.l(this);
    }

    public void B() {
        this.f23305g.j(this);
        for (p pVar : this.f23323y) {
            pVar.f0();
        }
        this.f23320v = null;
    }

    @Override // t1.u, t1.r0
    public boolean a() {
        return this.C.a();
    }

    @Override // y1.p.b
    public void b() {
        int i7 = this.f23321w - 1;
        this.f23321w = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (p pVar : this.f23323y) {
            i8 += pVar.p().f22275f;
        }
        x0[] x0VarArr = new x0[i8];
        int i9 = 0;
        for (p pVar2 : this.f23323y) {
            int i10 = pVar2.p().f22275f;
            int i11 = 0;
            while (i11 < i10) {
                x0VarArr[i9] = pVar2.p().b(i11);
                i11++;
                i9++;
            }
        }
        this.f23322x = new z0(x0VarArr);
        this.f23320v.i(this);
    }

    @Override // t1.u, t1.r0
    public long c() {
        return this.C.c();
    }

    @Override // z1.l.b
    public void d() {
        for (p pVar : this.f23323y) {
            pVar.b0();
        }
        this.f23320v.l(this);
    }

    @Override // t1.u, t1.r0
    public long e() {
        return this.C.e();
    }

    @Override // t1.u
    public long f(long j7, j3 j3Var) {
        for (p pVar : this.f23324z) {
            if (pVar.R()) {
                return pVar.f(j7, j3Var);
            }
        }
        return j7;
    }

    @Override // t1.u, t1.r0
    public boolean g(long j7) {
        if (this.f23322x != null) {
            return this.C.g(j7);
        }
        for (p pVar : this.f23323y) {
            pVar.B();
        }
        return false;
    }

    @Override // t1.u, t1.r0
    public void h(long j7) {
        this.C.h(j7);
    }

    @Override // z1.l.b
    public boolean j(Uri uri, g0.c cVar, boolean z6) {
        boolean z7 = true;
        for (p pVar : this.f23323y) {
            z7 &= pVar.a0(uri, cVar, z6);
        }
        this.f23320v.l(this);
        return z7;
    }

    @Override // y1.p.b
    public void k(Uri uri) {
        this.f23305g.h(uri);
    }

    @Override // t1.u
    public long n() {
        return -9223372036854775807L;
    }

    @Override // t1.u
    public z0 p() {
        return (z0) o2.a.e(this.f23322x);
    }

    @Override // t1.u
    public void q(u.a aVar, long j7) {
        this.f23320v = aVar;
        this.f23305g.k(this);
        v(j7);
    }

    @Override // t1.u
    public long r(m2.t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
        q0[] q0VarArr2 = q0VarArr;
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        for (int i7 = 0; i7 < tVarArr.length; i7++) {
            iArr[i7] = q0VarArr2[i7] == null ? -1 : this.f23313o.get(q0VarArr2[i7]).intValue();
            iArr2[i7] = -1;
            if (tVarArr[i7] != null) {
                x0 c7 = tVarArr[i7].c();
                int i8 = 0;
                while (true) {
                    p[] pVarArr = this.f23323y;
                    if (i8 >= pVarArr.length) {
                        break;
                    }
                    if (pVarArr[i8].p().c(c7) != -1) {
                        iArr2[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        this.f23313o.clear();
        int length = tVarArr.length;
        q0[] q0VarArr3 = new q0[length];
        q0[] q0VarArr4 = new q0[tVarArr.length];
        m2.t[] tVarArr2 = new m2.t[tVarArr.length];
        p[] pVarArr2 = new p[this.f23323y.length];
        int i9 = 0;
        int i10 = 0;
        boolean z6 = false;
        while (i10 < this.f23323y.length) {
            for (int i11 = 0; i11 < tVarArr.length; i11++) {
                m2.t tVar = null;
                q0VarArr4[i11] = iArr[i11] == i10 ? q0VarArr2[i11] : null;
                if (iArr2[i11] == i10) {
                    tVar = tVarArr[i11];
                }
                tVarArr2[i11] = tVar;
            }
            p pVar = this.f23323y[i10];
            int i12 = i9;
            int i13 = length;
            int i14 = i10;
            m2.t[] tVarArr3 = tVarArr2;
            p[] pVarArr3 = pVarArr2;
            boolean j02 = pVar.j0(tVarArr2, zArr, q0VarArr4, zArr2, j7, z6);
            int i15 = 0;
            boolean z7 = false;
            while (true) {
                if (i15 >= tVarArr.length) {
                    break;
                }
                q0 q0Var = q0VarArr4[i15];
                if (iArr2[i15] == i14) {
                    o2.a.e(q0Var);
                    q0VarArr3[i15] = q0Var;
                    this.f23313o.put(q0Var, Integer.valueOf(i14));
                    z7 = true;
                } else if (iArr[i15] == i14) {
                    o2.a.f(q0Var == null);
                }
                i15++;
            }
            if (z7) {
                pVarArr3[i12] = pVar;
                i9 = i12 + 1;
                if (i12 == 0) {
                    pVar.m0(true);
                    if (!j02) {
                        p[] pVarArr4 = this.f23324z;
                        if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                        }
                    }
                    this.f23314p.b();
                    z6 = true;
                } else {
                    pVar.m0(i14 < this.B);
                }
            } else {
                i9 = i12;
            }
            i10 = i14 + 1;
            pVarArr2 = pVarArr3;
            length = i13;
            tVarArr2 = tVarArr3;
            q0VarArr2 = q0VarArr;
        }
        System.arraycopy(q0VarArr3, 0, q0VarArr2, 0, length);
        p[] pVarArr5 = (p[]) m0.G0(pVarArr2, i9);
        this.f23324z = pVarArr5;
        this.C = this.f23315q.a(pVarArr5);
        return j7;
    }

    @Override // t1.u
    public void s() {
        for (p pVar : this.f23323y) {
            pVar.s();
        }
    }

    @Override // t1.u
    public void t(long j7, boolean z6) {
        for (p pVar : this.f23324z) {
            pVar.t(j7, z6);
        }
    }

    @Override // t1.u
    public long u(long j7) {
        p[] pVarArr = this.f23324z;
        if (pVarArr.length > 0) {
            boolean i02 = pVarArr[0].i0(j7, false);
            int i7 = 1;
            while (true) {
                p[] pVarArr2 = this.f23324z;
                if (i7 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i7].i0(j7, i02);
                i7++;
            }
            if (i02) {
                this.f23314p.b();
            }
        }
        return j7;
    }
}
