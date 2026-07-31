package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.C3422d;
import t.C3423e;
import u.C3447b;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3450e {

    /* renamed from: a, reason: collision with root package name */
    private t.f f46314a;

    /* renamed from: d, reason: collision with root package name */
    private t.f f46317d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46315b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46316c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f46318e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f46319f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private C3447b.InterfaceC0282b f46320g = null;

    /* renamed from: h, reason: collision with root package name */
    private C3447b.a f46321h = new C3447b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f46322i = new ArrayList();

    public C3450e(t.f fVar) {
        this.f46314a = fVar;
        this.f46317d = fVar;
    }

    private void a(C3451f c3451f, int i4, int i5, C3451f c3451f2, ArrayList arrayList, k kVar) {
        int i6;
        C3451f c3451f3;
        ArrayList arrayList2;
        m mVar = c3451f.f46326d;
        if (mVar.f46360c == null) {
            t.f fVar = this.f46314a;
            if (mVar == fVar.f46118e || mVar == fVar.f46120f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i5);
                arrayList.add(kVar);
            }
            k kVar2 = kVar;
            mVar.f46360c = kVar2;
            kVar2.a(mVar);
            for (InterfaceC3449d interfaceC3449d : mVar.f46365h.f46333k) {
                if (interfaceC3449d instanceof C3451f) {
                    i6 = i4;
                    c3451f3 = c3451f2;
                    arrayList2 = arrayList;
                    a((C3451f) interfaceC3449d, i6, 0, c3451f3, arrayList2, kVar2);
                } else {
                    i6 = i4;
                    c3451f3 = c3451f2;
                    arrayList2 = arrayList;
                }
                i4 = i6;
                c3451f2 = c3451f3;
                arrayList = arrayList2;
            }
            int i7 = i4;
            C3451f c3451f4 = c3451f2;
            ArrayList arrayList3 = arrayList;
            for (InterfaceC3449d interfaceC3449d2 : mVar.f46366i.f46333k) {
                if (interfaceC3449d2 instanceof C3451f) {
                    a((C3451f) interfaceC3449d2, i7, 1, c3451f4, arrayList3, kVar2);
                }
            }
            if (i7 == 1 && (mVar instanceof l)) {
                for (InterfaceC3449d interfaceC3449d3 : ((l) mVar).f46355k.f46333k) {
                    if (interfaceC3449d3 instanceof C3451f) {
                        a((C3451f) interfaceC3449d3, i7, 2, c3451f4, arrayList3, kVar2);
                    }
                }
            }
            for (C3451f c3451f5 : mVar.f46365h.f46334l) {
                if (c3451f5 == c3451f4) {
                    kVar2.f46349b = true;
                }
                a(c3451f5, i7, 0, c3451f4, arrayList3, kVar2);
            }
            for (C3451f c3451f6 : mVar.f46366i.f46334l) {
                if (c3451f6 == c3451f4) {
                    kVar2.f46349b = true;
                }
                a(c3451f6, i7, 1, c3451f4, arrayList3, kVar2);
            }
            if (i7 == 1 && (mVar instanceof l)) {
                Iterator it = ((l) mVar).f46355k.f46334l.iterator();
                while (it.hasNext()) {
                    a((C3451f) it.next(), i7, 2, c3451f4, arrayList3, kVar2);
                }
            }
        }
    }

    private boolean b(t.f fVar) {
        C3423e.b bVar;
        int i4;
        C3423e.b bVar2;
        float f4;
        float f5;
        C3423e.b bVar3;
        C3423e.b[] bVarArr;
        C3423e.b bVar4;
        C3423e.b bVar5;
        C3423e.b bVar6;
        C3423e.b bVar7;
        C3423e.b bVar8;
        ArrayList arrayList = fVar.f46197w0;
        int size = arrayList.size();
        char c4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C3423e c3423e = (C3423e) obj;
            C3423e.b[] bVarArr2 = c3423e.f46096M;
            C3423e.b bVar9 = bVarArr2[c4 == true ? 1 : 0];
            C3423e.b bVar10 = bVarArr2[1];
            if (c3423e.M() == 8) {
                c3423e.f46110a = true;
            } else {
                if (c3423e.f46142q < 1.0f && bVar9 == C3423e.b.MATCH_CONSTRAINT) {
                    c3423e.f46132l = 2;
                }
                if (c3423e.f46148t < 1.0f && bVar10 == C3423e.b.MATCH_CONSTRAINT) {
                    c3423e.f46134m = 2;
                }
                if (c3423e.r() > 0.0f) {
                    C3423e.b bVar11 = C3423e.b.MATCH_CONSTRAINT;
                    if (bVar9 == bVar11 && (bVar10 == C3423e.b.WRAP_CONTENT || bVar10 == C3423e.b.FIXED)) {
                        c3423e.f46132l = 3;
                    } else if (bVar10 == bVar11 && (bVar9 == C3423e.b.WRAP_CONTENT || bVar9 == C3423e.b.FIXED)) {
                        c3423e.f46134m = 3;
                    } else if (bVar9 == bVar11 && bVar10 == bVar11) {
                        if (c3423e.f46132l == 0) {
                            c3423e.f46132l = 3;
                        }
                        if (c3423e.f46134m == 0) {
                            c3423e.f46134m = 3;
                        }
                    }
                }
                C3423e.b bVar12 = C3423e.b.MATCH_CONSTRAINT;
                if (bVar9 == bVar12 && c3423e.f46132l == 1 && (c3423e.f46085B.f46068d == null || c3423e.f46087D.f46068d == null)) {
                    bVar9 = C3423e.b.WRAP_CONTENT;
                }
                if (bVar10 == bVar12 && c3423e.f46134m == 1 && (c3423e.f46086C.f46068d == null || c3423e.f46088E.f46068d == null)) {
                    bVar10 = C3423e.b.WRAP_CONTENT;
                }
                j jVar = c3423e.f46118e;
                jVar.f46361d = bVar9;
                int i6 = c3423e.f46132l;
                jVar.f46358a = i6;
                l lVar = c3423e.f46120f;
                lVar.f46361d = bVar10;
                int i7 = c3423e.f46134m;
                lVar.f46358a = i7;
                C3423e.b bVar13 = C3423e.b.MATCH_PARENT;
                char c5 = c4 == true ? 1 : 0;
                if ((bVar9 == bVar13 || bVar9 == C3423e.b.FIXED || bVar9 == C3423e.b.WRAP_CONTENT) && (bVar10 == bVar13 || bVar10 == C3423e.b.FIXED || bVar10 == C3423e.b.WRAP_CONTENT)) {
                    C3423e.b bVar14 = bVar10;
                    C3423e.b bVar15 = bVar9;
                    int N3 = c3423e.N();
                    if (bVar15 == bVar13) {
                        N3 = (fVar.N() - c3423e.f46085B.f46069e) - c3423e.f46087D.f46069e;
                        bVar15 = C3423e.b.FIXED;
                    }
                    int i8 = N3;
                    int t4 = c3423e.t();
                    if (bVar14 == bVar13) {
                        t4 = (fVar.t() - c3423e.f46086C.f46069e) - c3423e.f46088E.f46069e;
                        bVar14 = C3423e.b.FIXED;
                    }
                    l(c3423e, bVar15, i8, bVar14, t4);
                    c3423e.f46118e.f46362e.d(c3423e.N());
                    c3423e.f46120f.f46362e.d(c3423e.t());
                    c3423e.f46110a = true;
                } else {
                    if (bVar9 == bVar12) {
                        bVar2 = bVar12;
                        f5 = 0.5f;
                        C3423e.b bVar16 = C3423e.b.WRAP_CONTENT;
                        f4 = 1.0f;
                        if (bVar10 != bVar16 && bVar10 != C3423e.b.FIXED) {
                            bVar = bVar10;
                            i4 = 3;
                        } else if (i6 == 3) {
                            if (bVar10 == bVar16) {
                                l(c3423e, bVar16, 0, bVar16, 0);
                            }
                            int t5 = c3423e.t();
                            int i9 = (int) ((t5 * c3423e.f46100Q) + 0.5f);
                            C3423e.b bVar17 = C3423e.b.FIXED;
                            l(c3423e, bVar17, i9, bVar17, t5);
                            c3423e.f46118e.f46362e.d(c3423e.N());
                            c3423e.f46120f.f46362e.d(c3423e.t());
                            c3423e.f46110a = true;
                        } else if (i6 == 1) {
                            l(c3423e, bVar16, 0, bVar10, 0);
                            c3423e.f46118e.f46362e.f46344m = c3423e.N();
                        } else {
                            bVar = bVar10;
                            i4 = 3;
                            if (i6 == 2) {
                                C3423e.b bVar18 = fVar.f46096M[c5];
                                C3423e.b bVar19 = C3423e.b.FIXED;
                                if (bVar18 == bVar19 || bVar18 == bVar13) {
                                    l(c3423e, bVar19, (int) ((c3423e.f46142q * fVar.N()) + 0.5f), bVar, c3423e.t());
                                    c3423e.f46118e.f46362e.d(c3423e.N());
                                    c3423e.f46120f.f46362e.d(c3423e.t());
                                    c3423e.f46110a = true;
                                }
                            } else {
                                C3422d[] c3422dArr = c3423e.f46093J;
                                if (c3422dArr[c5].f46068d == null || c3422dArr[1].f46068d == null) {
                                    l(c3423e, bVar16, 0, bVar, 0);
                                    c3423e.f46118e.f46362e.d(c3423e.N());
                                    c3423e.f46120f.f46362e.d(c3423e.t());
                                    c3423e.f46110a = true;
                                }
                            }
                        }
                    } else {
                        bVar = bVar10;
                        i4 = 3;
                        bVar2 = bVar12;
                        f4 = 1.0f;
                        f5 = 0.5f;
                    }
                    if (bVar != bVar2 || (bVar9 != (bVar7 = C3423e.b.WRAP_CONTENT) && bVar9 != C3423e.b.FIXED)) {
                        bVar3 = bVar9;
                    } else if (i7 == i4) {
                        if (bVar9 == bVar7) {
                            l(c3423e, bVar7, 0, bVar7, 0);
                        }
                        int N4 = c3423e.N();
                        float f6 = c3423e.f46100Q;
                        if (c3423e.s() == -1) {
                            f6 = f4 / f6;
                        }
                        C3423e.b bVar20 = C3423e.b.FIXED;
                        l(c3423e, bVar20, N4, bVar20, (int) ((N4 * f6) + f5));
                        c3423e.f46118e.f46362e.d(c3423e.N());
                        c3423e.f46120f.f46362e.d(c3423e.t());
                        c3423e.f46110a = true;
                    } else if (i7 == 1) {
                        l(c3423e, bVar9, 0, bVar7, 0);
                        c3423e.f46120f.f46362e.f46344m = c3423e.t();
                    } else {
                        bVar3 = bVar9;
                        if (i7 == 2) {
                            C3423e.b bVar21 = fVar.f46096M[1];
                            bVar8 = bVar;
                            C3423e.b bVar22 = C3423e.b.FIXED;
                            if (bVar21 == bVar22 || bVar21 == bVar13) {
                                l(c3423e, bVar3, c3423e.N(), bVar22, (int) ((c3423e.f46148t * fVar.t()) + f5));
                                c3423e.f46118e.f46362e.d(c3423e.N());
                                c3423e.f46120f.f46362e.d(c3423e.t());
                                c3423e.f46110a = true;
                            }
                            bVar = bVar8;
                        } else {
                            bVar8 = bVar;
                            C3422d[] c3422dArr2 = c3423e.f46093J;
                            if (c3422dArr2[2].f46068d == null || c3422dArr2[i4].f46068d == null) {
                                l(c3423e, bVar7, 0, bVar8, 0);
                                c3423e.f46118e.f46362e.d(c3423e.N());
                                c3423e.f46120f.f46362e.d(c3423e.t());
                                c3423e.f46110a = true;
                            }
                            bVar = bVar8;
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i6 == 1 || i7 == 1) {
                            C3423e.b bVar23 = C3423e.b.WRAP_CONTENT;
                            l(c3423e, bVar23, 0, bVar23, 0);
                            c3423e.f46118e.f46362e.f46344m = c3423e.N();
                            c3423e.f46120f.f46362e.f46344m = c3423e.t();
                        } else if (i7 == 2 && i6 == 2 && (((bVar4 = (bVarArr = fVar.f46096M)[c5]) == (bVar5 = C3423e.b.FIXED) || bVar4 == bVar5) && ((bVar6 = bVarArr[1]) == bVar5 || bVar6 == bVar5))) {
                            l(c3423e, bVar5, (int) ((c3423e.f46142q * fVar.N()) + f5), bVar5, (int) ((c3423e.f46148t * fVar.t()) + f5));
                            c3423e.f46118e.f46362e.d(c3423e.N());
                            c3423e.f46120f.f46362e.d(c3423e.t());
                            c3423e.f46110a = true;
                        }
                    }
                }
                c4 = c5;
            }
        }
        return c4 == true ? 1 : 0;
    }

    private int e(t.f fVar, int i4) {
        int size = this.f46322i.size();
        long j4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j4 = Math.max(j4, ((k) this.f46322i.get(i5)).b(fVar, i4));
        }
        return (int) j4;
    }

    private void i(m mVar, int i4, ArrayList arrayList) {
        for (InterfaceC3449d interfaceC3449d : mVar.f46365h.f46333k) {
            if (interfaceC3449d instanceof C3451f) {
                a((C3451f) interfaceC3449d, i4, 0, mVar.f46366i, arrayList, null);
            } else if (interfaceC3449d instanceof m) {
                a(((m) interfaceC3449d).f46365h, i4, 0, mVar.f46366i, arrayList, null);
            }
        }
        for (InterfaceC3449d interfaceC3449d2 : mVar.f46366i.f46333k) {
            if (interfaceC3449d2 instanceof C3451f) {
                a((C3451f) interfaceC3449d2, i4, 1, mVar.f46365h, arrayList, null);
            } else if (interfaceC3449d2 instanceof m) {
                a(((m) interfaceC3449d2).f46366i, i4, 1, mVar.f46365h, arrayList, null);
            }
        }
        int i5 = i4;
        if (i5 == 1) {
            for (InterfaceC3449d interfaceC3449d3 : ((l) mVar).f46355k.f46333k) {
                if (interfaceC3449d3 instanceof C3451f) {
                    a((C3451f) interfaceC3449d3, i5, 2, null, arrayList, null);
                }
                i5 = i4;
            }
        }
    }

    private void l(C3423e c3423e, C3423e.b bVar, int i4, C3423e.b bVar2, int i5) {
        C3447b.a aVar = this.f46321h;
        aVar.f46302a = bVar;
        aVar.f46303b = bVar2;
        aVar.f46304c = i4;
        aVar.f46305d = i5;
        this.f46320g.a(c3423e, aVar);
        c3423e.A0(this.f46321h.f46306e);
        c3423e.e0(this.f46321h.f46307f);
        c3423e.d0(this.f46321h.f46309h);
        c3423e.Y(this.f46321h.f46308g);
    }

    public void c() {
        d(this.f46318e);
        this.f46322i.clear();
        k.f46347h = 0;
        i(this.f46314a.f46118e, 0, this.f46322i);
        i(this.f46314a.f46120f, 1, this.f46322i);
        this.f46315b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f46317d.f46118e.f();
        this.f46317d.f46120f.f();
        arrayList.add(this.f46317d.f46118e);
        arrayList.add(this.f46317d.f46120f);
        ArrayList arrayList2 = this.f46317d.f46197w0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            C3423e c3423e = (C3423e) obj;
            if (c3423e instanceof t.g) {
                arrayList.add(new C3453h(c3423e));
            } else {
                if (c3423e.T()) {
                    if (c3423e.f46114c == null) {
                        c3423e.f46114c = new C3448c(c3423e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3423e.f46114c);
                } else {
                    arrayList.add(c3423e.f46118e);
                }
                if (c3423e.V()) {
                    if (c3423e.f46116d == null) {
                        c3423e.f46116d = new C3448c(c3423e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3423e.f46116d);
                } else {
                    arrayList.add(c3423e.f46120f);
                }
                if (c3423e instanceof t.i) {
                    arrayList.add(new i(c3423e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            ((m) obj2).f();
        }
        int size3 = arrayList.size();
        while (i4 < size3) {
            Object obj3 = arrayList.get(i4);
            i4++;
            m mVar = (m) obj3;
            if (mVar.f46359b != this.f46317d) {
                mVar.d();
            }
        }
    }

    public boolean f(boolean z4) {
        boolean z5;
        boolean z6 = false;
        if (this.f46315b || this.f46316c) {
            ArrayList arrayList = this.f46314a.f46197w0;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C3423e c3423e = (C3423e) obj;
                c3423e.f46110a = false;
                c3423e.f46118e.r();
                c3423e.f46120f.q();
            }
            t.f fVar = this.f46314a;
            fVar.f46110a = false;
            fVar.f46118e.r();
            this.f46314a.f46120f.q();
            this.f46316c = false;
        }
        if (b(this.f46317d)) {
            return false;
        }
        this.f46314a.B0(0);
        this.f46314a.C0(0);
        C3423e.b q4 = this.f46314a.q(0);
        C3423e.b q5 = this.f46314a.q(1);
        if (this.f46315b) {
            c();
        }
        int O3 = this.f46314a.O();
        int P3 = this.f46314a.P();
        this.f46314a.f46118e.f46365h.d(O3);
        this.f46314a.f46120f.f46365h.d(P3);
        m();
        C3423e.b bVar = C3423e.b.WRAP_CONTENT;
        if (q4 == bVar || q5 == bVar) {
            if (z4) {
                ArrayList arrayList2 = this.f46318e;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    if (!((m) obj2).m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && q4 == C3423e.b.WRAP_CONTENT) {
                this.f46314a.i0(C3423e.b.FIXED);
                t.f fVar2 = this.f46314a;
                fVar2.A0(e(fVar2, 0));
                t.f fVar3 = this.f46314a;
                fVar3.f46118e.f46362e.d(fVar3.N());
            }
            if (z4 && q5 == C3423e.b.WRAP_CONTENT) {
                this.f46314a.w0(C3423e.b.FIXED);
                t.f fVar4 = this.f46314a;
                fVar4.e0(e(fVar4, 1));
                t.f fVar5 = this.f46314a;
                fVar5.f46120f.f46362e.d(fVar5.t());
            }
        }
        t.f fVar6 = this.f46314a;
        C3423e.b bVar2 = fVar6.f46096M[0];
        C3423e.b bVar3 = C3423e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C3423e.b.MATCH_PARENT) {
            int N3 = fVar6.N() + O3;
            this.f46314a.f46118e.f46366i.d(N3);
            this.f46314a.f46118e.f46362e.d(N3 - O3);
            m();
            t.f fVar7 = this.f46314a;
            C3423e.b bVar4 = fVar7.f46096M[1];
            if (bVar4 == bVar3 || bVar4 == C3423e.b.MATCH_PARENT) {
                int t4 = fVar7.t() + P3;
                this.f46314a.f46120f.f46366i.d(t4);
                this.f46314a.f46120f.f46362e.d(t4 - P3);
            }
            m();
            z5 = true;
        } else {
            z5 = false;
        }
        ArrayList arrayList3 = this.f46318e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            m mVar = (m) obj3;
            if (mVar.f46359b != this.f46314a || mVar.f46364g) {
                mVar.e();
            }
        }
        ArrayList arrayList4 = this.f46318e;
        int size4 = arrayList4.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size4) {
                z6 = true;
                break;
            }
            Object obj4 = arrayList4.get(i7);
            i7++;
            m mVar2 = (m) obj4;
            if (z5 || mVar2.f46359b != this.f46314a) {
                if (!mVar2.f46365h.f46332j) {
                    break;
                }
                if (!mVar2.f46366i.f46332j) {
                    if (!(mVar2 instanceof C3453h)) {
                        break;
                    }
                }
                if (!mVar2.f46362e.f46332j && !(mVar2 instanceof C3448c) && !(mVar2 instanceof C3453h)) {
                    break;
                }
            }
        }
        this.f46314a.i0(q4);
        this.f46314a.w0(q5);
        return z6;
    }

    public boolean g(boolean z4) {
        if (this.f46315b) {
            ArrayList arrayList = this.f46314a.f46197w0;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C3423e c3423e = (C3423e) obj;
                c3423e.f46110a = false;
                j jVar = c3423e.f46118e;
                jVar.f46362e.f46332j = false;
                jVar.f46364g = false;
                jVar.r();
                l lVar = c3423e.f46120f;
                lVar.f46362e.f46332j = false;
                lVar.f46364g = false;
                lVar.q();
            }
            t.f fVar = this.f46314a;
            fVar.f46110a = false;
            j jVar2 = fVar.f46118e;
            jVar2.f46362e.f46332j = false;
            jVar2.f46364g = false;
            jVar2.r();
            l lVar2 = this.f46314a.f46120f;
            lVar2.f46362e.f46332j = false;
            lVar2.f46364g = false;
            lVar2.q();
            c();
        }
        if (b(this.f46317d)) {
            return false;
        }
        this.f46314a.B0(0);
        this.f46314a.C0(0);
        this.f46314a.f46118e.f46365h.d(0);
        this.f46314a.f46120f.f46365h.d(0);
        return true;
    }

    public boolean h(boolean z4, int i4) {
        boolean z5;
        C3423e.b bVar;
        boolean z6 = false;
        C3423e.b q4 = this.f46314a.q(0);
        C3423e.b q5 = this.f46314a.q(1);
        int O3 = this.f46314a.O();
        int P3 = this.f46314a.P();
        if (z4 && (q4 == (bVar = C3423e.b.WRAP_CONTENT) || q5 == bVar)) {
            ArrayList arrayList = this.f46318e;
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                Object obj = arrayList.get(i5);
                i5++;
                m mVar = (m) obj;
                if (mVar.f46363f == i4 && !mVar.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z4 && q4 == C3423e.b.WRAP_CONTENT) {
                    this.f46314a.i0(C3423e.b.FIXED);
                    t.f fVar = this.f46314a;
                    fVar.A0(e(fVar, 0));
                    t.f fVar2 = this.f46314a;
                    fVar2.f46118e.f46362e.d(fVar2.N());
                }
            } else if (z4 && q5 == C3423e.b.WRAP_CONTENT) {
                this.f46314a.w0(C3423e.b.FIXED);
                t.f fVar3 = this.f46314a;
                fVar3.e0(e(fVar3, 1));
                t.f fVar4 = this.f46314a;
                fVar4.f46120f.f46362e.d(fVar4.t());
            }
        }
        if (i4 == 0) {
            t.f fVar5 = this.f46314a;
            C3423e.b bVar2 = fVar5.f46096M[0];
            if (bVar2 == C3423e.b.FIXED || bVar2 == C3423e.b.MATCH_PARENT) {
                int N3 = fVar5.N() + O3;
                this.f46314a.f46118e.f46366i.d(N3);
                this.f46314a.f46118e.f46362e.d(N3 - O3);
                z5 = true;
            }
            z5 = false;
        } else {
            t.f fVar6 = this.f46314a;
            C3423e.b bVar3 = fVar6.f46096M[1];
            if (bVar3 == C3423e.b.FIXED || bVar3 == C3423e.b.MATCH_PARENT) {
                int t4 = fVar6.t() + P3;
                this.f46314a.f46120f.f46366i.d(t4);
                this.f46314a.f46120f.f46362e.d(t4 - P3);
                z5 = true;
            }
            z5 = false;
        }
        m();
        ArrayList arrayList2 = this.f46318e;
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            m mVar2 = (m) obj2;
            if (mVar2.f46363f == i4 && (mVar2.f46359b != this.f46314a || mVar2.f46364g)) {
                mVar2.e();
            }
        }
        ArrayList arrayList3 = this.f46318e;
        int size3 = arrayList3.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                z6 = true;
                break;
            }
            Object obj3 = arrayList3.get(i7);
            i7++;
            m mVar3 = (m) obj3;
            if (mVar3.f46363f == i4 && (z5 || mVar3.f46359b != this.f46314a)) {
                if (!mVar3.f46365h.f46332j) {
                    break;
                }
                if (!mVar3.f46366i.f46332j) {
                    break;
                }
                if (!(mVar3 instanceof C3448c) && !mVar3.f46362e.f46332j) {
                    break;
                }
            }
        }
        this.f46314a.i0(q4);
        this.f46314a.w0(q5);
        return z6;
    }

    public void j() {
        this.f46315b = true;
    }

    public void k() {
        this.f46316c = true;
    }

    public void m() {
        C3452g c3452g;
        ArrayList arrayList = this.f46314a.f46197w0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C3423e c3423e = (C3423e) obj;
            if (!c3423e.f46110a) {
                C3423e.b[] bVarArr = c3423e.f46096M;
                C3423e.b bVar = bVarArr[0];
                C3423e.b bVar2 = bVarArr[1];
                int i5 = c3423e.f46132l;
                int i6 = c3423e.f46134m;
                C3423e.b bVar3 = C3423e.b.WRAP_CONTENT;
                boolean z4 = bVar == bVar3 || (bVar == C3423e.b.MATCH_CONSTRAINT && i5 == 1);
                boolean z5 = bVar2 == bVar3 || (bVar2 == C3423e.b.MATCH_CONSTRAINT && i6 == 1);
                C3452g c3452g2 = c3423e.f46118e.f46362e;
                boolean z6 = c3452g2.f46332j;
                C3452g c3452g3 = c3423e.f46120f.f46362e;
                boolean z7 = c3452g3.f46332j;
                if (z6 && z7) {
                    C3423e.b bVar4 = C3423e.b.FIXED;
                    l(c3423e, bVar4, c3452g2.f46329g, bVar4, c3452g3.f46329g);
                    c3423e.f46110a = true;
                } else if (z6 && z5) {
                    l(c3423e, C3423e.b.FIXED, c3452g2.f46329g, bVar3, c3452g3.f46329g);
                    if (bVar2 == C3423e.b.MATCH_CONSTRAINT) {
                        c3423e.f46120f.f46362e.f46344m = c3423e.t();
                    } else {
                        c3423e.f46120f.f46362e.d(c3423e.t());
                        c3423e.f46110a = true;
                    }
                } else if (z7 && z4) {
                    l(c3423e, bVar3, c3452g2.f46329g, C3423e.b.FIXED, c3452g3.f46329g);
                    if (bVar == C3423e.b.MATCH_CONSTRAINT) {
                        c3423e.f46118e.f46362e.f46344m = c3423e.N();
                    } else {
                        c3423e.f46118e.f46362e.d(c3423e.N());
                        c3423e.f46110a = true;
                    }
                }
                if (c3423e.f46110a && (c3452g = c3423e.f46120f.f46356l) != null) {
                    c3452g.d(c3423e.l());
                }
            }
        }
    }

    public void n(C3447b.InterfaceC0282b interfaceC0282b) {
        this.f46320g = interfaceC0282b;
    }
}
