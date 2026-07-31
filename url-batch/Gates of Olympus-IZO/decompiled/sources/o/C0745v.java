package o;

import F.C0060q;
import F.D0;
import e2.AbstractC0381e;
import java.util.List;
import t0.AbstractC0898f;

/* renamed from: o.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745v extends R1.h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Object f6626e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6627f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6628g;

    /* renamed from: h, reason: collision with root package name */
    public Z1.s f6629h;

    /* renamed from: i, reason: collision with root package name */
    public G2.a f6630i;

    /* renamed from: j, reason: collision with root package name */
    public n0.m f6631j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6632k;

    /* renamed from: l, reason: collision with root package name */
    public float f6633l;

    /* renamed from: m, reason: collision with root package name */
    public int f6634m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f6635n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0748y f6636o;
    public final /* synthetic */ Z1.s p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J f6637q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J0.b f6638r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0060q f6639s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0748y f6640t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D0 f6641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0745v(C0748y c0748y, Z1.s sVar, J j3, J0.b bVar, C0060q c0060q, C0748y c0748y2, D0 d02, P1.d dVar) {
        super(2, dVar);
        this.f6636o = c0748y;
        this.p = sVar;
        this.f6637q = j3;
        this.f6638r = bVar;
        this.f6639s = c0060q;
        this.f6640t = c0748y2;
        this.f6641u = d02;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0748y c0748y = this.f6640t;
        D0 d02 = this.f6641u;
        C0745v c0745v = new C0745v(this.f6636o, this.p, this.f6637q, this.f6638r, this.f6639s, c0748y, d02, dVar);
        c0745v.f6635n = obj;
        return c0745v;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0745v) create((n0.t) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x03d1, code lost:
    
        if ((r4 != null ? r4 == o.J.f6443d ? a0.c.e(r9) : a0.c.d(r9) : a0.c.c(r9)) == 0.0f) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0352 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x037e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f1  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r16v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v24, types: [Y1.e] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x02c9 -> B:60:0x02cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0350 -> B:9:0x0353). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0102 -> B:74:0x0108). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n0.t tVar;
        Object a3;
        n0.t tVar2;
        n0.m mVar;
        boolean booleanValue;
        Object a4;
        n0.m mVar2;
        Z1.s sVar;
        n0.h hVar;
        J j3;
        C0060q c0060q;
        long j4;
        J j5;
        n0.m mVar3;
        long j6;
        float a5;
        Z1.s sVar2;
        Z1.s sVar3;
        G2.a aVar;
        n0.m mVar4;
        n0.t tVar3;
        Object obj2;
        int size;
        int i3;
        List list;
        Z1.s sVar4;
        n0.m mVar5;
        n0.m mVar6;
        float abs;
        n0.t tVar4;
        a0.c cVar;
        long f3;
        Object obj3;
        int i4;
        List list2;
        C0060q c0060q2;
        J j7;
        n0.t tVar5;
        Z1.s sVar5;
        n0.m mVar7;
        n0.h hVar2;
        Object b2;
        ?? r8;
        int size2;
        int i5;
        List list3;
        n0.t tVar6;
        n0.m mVar8;
        Object obj4;
        List list4;
        Q1.a aVar2 = Q1.a.f3113d;
        int i6 = this.f6634m;
        Z1.s sVar6 = this.p;
        n0.h hVar3 = n0.h.f6217e;
        int i7 = 2;
        J j8 = this.f6637q;
        if (i6 == 0) {
            I2.l.Q(obj);
            tVar = (n0.t) this.f6635n;
            n0.h hVar4 = n0.h.f6216d;
            this.f6635n = tVar;
            this.f6634m = 1;
            a3 = x0.a(tVar, false, hVar4, this);
            if (a3 == aVar2) {
                return aVar2;
            }
        } else if (i6 == 1) {
            tVar = (n0.t) this.f6635n;
            I2.l.Q(obj);
            a3 = obj;
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    a5 = this.f6633l;
                    G2.a aVar3 = this.f6630i;
                    Z1.s sVar7 = this.f6629h;
                    Z1.s sVar8 = (Z1.s) this.f6628g;
                    n0.t tVar7 = (n0.t) this.f6627f;
                    n0.m mVar9 = (n0.m) this.f6626e;
                    n0.t tVar8 = (n0.t) this.f6635n;
                    I2.l.Q(obj);
                    obj2 = obj;
                    aVar = aVar3;
                    sVar2 = sVar7;
                    tVar2 = tVar7;
                    mVar4 = mVar9;
                    sVar3 = sVar8;
                    tVar3 = tVar8;
                    n0.g gVar = (n0.g) obj2;
                    ?? r15 = gVar.f6214a;
                    size = r15.size();
                    i3 = 0;
                    list = r15;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                        sVar6 = sVar4;
                        j8 = j3;
                        list = list2;
                        size = i4;
                        hVar3 = hVar;
                    }
                    mVar6 = mVar5;
                    if (mVar6 != null) {
                    }
                    sVar = sVar4;
                    tVar2 = tVar3;
                    mVar2 = mVar4;
                    mVar = null;
                    if (mVar != null) {
                    }
                    if (mVar != null) {
                    }
                    return L1.z.f2729a;
                }
                if (i6 != 4) {
                    if (i6 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar5 = this.f6629h;
                    tVar5 = (n0.t) this.f6628g;
                    J j9 = (J) this.f6627f;
                    Y1.e eVar = (Y1.e) this.f6626e;
                    tVar2 = (n0.t) this.f6635n;
                    I2.l.Q(obj);
                    b2 = obj;
                    mVar7 = null;
                    hVar2 = hVar3;
                    j7 = j9;
                    r8 = eVar;
                    n0.g gVar2 = (n0.g) b2;
                    ?? r10 = gVar2.f6214a;
                    size2 = r10.size();
                    i5 = 0;
                    list3 = r10;
                    while (true) {
                        if (i5 < size2) {
                            hVar = hVar2;
                            tVar6 = tVar2;
                            mVar8 = mVar7;
                            break;
                        }
                        mVar8 = list3.get(i5);
                        hVar = hVar2;
                        tVar6 = tVar2;
                        list4 = list3;
                        if (n0.l.a(((n0.m) mVar8).f6223a, sVar5.f3479d)) {
                            break;
                        }
                        i5++;
                        tVar2 = tVar6;
                        list3 = list4;
                        hVar2 = hVar;
                    }
                    mVar3 = mVar8;
                    if (mVar3 == null) {
                        if (n0.s.b(mVar3)) {
                            ?? r6 = gVar2.f6214a;
                            int size3 = r6.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size3) {
                                    obj4 = mVar7;
                                    break;
                                }
                                obj4 = r6.get(i8);
                                if (((n0.m) obj4).f6226d) {
                                    break;
                                }
                                i8++;
                            }
                            n0.m mVar10 = (n0.m) obj4;
                            if (mVar10 != null) {
                                sVar5.f3479d = mVar10.f6223a;
                            }
                        } else {
                            long f4 = n0.s.f(mVar3, true);
                        }
                        tVar2 = tVar6;
                        c0060q2 = r8;
                        this.f6635n = tVar2;
                        this.f6626e = c0060q2;
                        this.f6627f = j7;
                        this.f6628g = tVar5;
                        this.f6629h = sVar5;
                        mVar7 = null;
                        this.f6630i = null;
                        this.f6631j = null;
                        this.f6634m = 5;
                        hVar2 = hVar;
                        b2 = tVar5.b(hVar2, this);
                        r8 = c0060q2;
                        if (b2 == aVar2) {
                            return aVar2;
                        }
                        n0.g gVar22 = (n0.g) b2;
                        ?? r102 = gVar22.f6214a;
                        size2 = r102.size();
                        i5 = 0;
                        list3 = r102;
                        while (true) {
                            if (i5 < size2) {
                            }
                            i5++;
                            tVar2 = tVar6;
                            list3 = list4;
                            hVar2 = hVar;
                        }
                        mVar3 = mVar8;
                        if (mVar3 == null) {
                            mVar3 = mVar7;
                        }
                    }
                    if (mVar3 == null || mVar3.b()) {
                        mVar3 = mVar7;
                    } else if (!n0.s.b(mVar3)) {
                        r8.g(mVar3, new a0.c(n0.s.f(mVar3, false)));
                        mVar3.a();
                        j4 = mVar3.f6223a;
                        tVar2 = tVar6;
                        C0060q c0060q3 = r8;
                        j5 = j7;
                        c0060q = c0060q3;
                        sVar5 = new Z1.s();
                        sVar5.f3479d = j4;
                        tVar5 = tVar2;
                        J j10 = j5;
                        c0060q2 = c0060q;
                        j7 = j10;
                        this.f6635n = tVar2;
                        this.f6626e = c0060q2;
                        this.f6627f = j7;
                        this.f6628g = tVar5;
                        this.f6629h = sVar5;
                        mVar7 = null;
                        this.f6630i = null;
                        this.f6631j = null;
                        this.f6634m = 5;
                        hVar2 = hVar;
                        b2 = tVar5.b(hVar2, this);
                        r8 = c0060q2;
                        if (b2 == aVar2) {
                        }
                        n0.g gVar222 = (n0.g) b2;
                        ?? r1022 = gVar222.f6214a;
                        size2 = r1022.size();
                        i5 = 0;
                        list3 = r1022;
                        while (true) {
                            if (i5 < size2) {
                            }
                            i5++;
                            tVar2 = tVar6;
                            list3 = list4;
                            hVar2 = hVar;
                        }
                        mVar3 = mVar8;
                        if (mVar3 == null) {
                        }
                        if (mVar3 == null) {
                            if (!n0.s.b(mVar3)) {
                            }
                        }
                        mVar3 = mVar7;
                    }
                    if (mVar3 == null) {
                        this.f6640t.b();
                    } else {
                        this.f6641u.j(mVar3);
                    }
                    return L1.z.f2729a;
                }
                a5 = this.f6633l;
                mVar6 = this.f6631j;
                G2.a aVar4 = this.f6630i;
                Z1.s sVar9 = this.f6629h;
                sVar3 = (Z1.s) this.f6628g;
                n0.t tVar9 = (n0.t) this.f6627f;
                n0.m mVar11 = (n0.m) this.f6626e;
                tVar3 = (n0.t) this.f6635n;
                I2.l.Q(obj);
                sVar = sVar6;
                hVar = hVar3;
                j3 = j8;
                tVar2 = tVar9;
                sVar2 = sVar9;
                aVar = aVar4;
                mVar4 = mVar11;
                if (mVar6.b()) {
                    tVar2 = tVar3;
                    mVar2 = mVar4;
                    mVar = null;
                    if (mVar != null && !mVar.b()) {
                        sVar6 = sVar;
                        j8 = j3;
                        hVar3 = hVar;
                        i7 = 2;
                        j6 = mVar2.f6223a;
                        if (!AbstractC0746w.a(tVar2.f6258h.f6266v, j6)) {
                            sVar = sVar6;
                            hVar = hVar3;
                            j3 = j8;
                            mVar = null;
                            if (mVar != null) {
                                sVar6 = sVar;
                                j8 = j3;
                                hVar3 = hVar;
                                i7 = 2;
                                j6 = mVar2.f6223a;
                                if (!AbstractC0746w.a(tVar2.f6258h.f6266v, j6)) {
                                    n0.v vVar = tVar2.f6258h;
                                    vVar.getClass();
                                    u0.D0 d02 = AbstractC0898f.t(vVar).f7732u;
                                    if (n0.s.d(mVar2.f6231i, i7)) {
                                        a5 = d02.a() * AbstractC0746w.f6648a;
                                        sVar2 = new Z1.s();
                                        sVar2.f3479d = j6;
                                        sVar3 = sVar6;
                                        aVar = new G2.a(j8);
                                        mVar4 = mVar2;
                                        tVar3 = tVar2;
                                    } else {
                                        a5 = d02.a();
                                        sVar2 = new Z1.s();
                                        sVar2.f3479d = j6;
                                        sVar3 = sVar6;
                                        aVar = new G2.a(j8);
                                        mVar4 = mVar2;
                                        tVar3 = tVar2;
                                    }
                                    this.f6635n = tVar3;
                                    this.f6626e = mVar4;
                                    this.f6627f = tVar2;
                                    this.f6628g = sVar3;
                                    this.f6629h = sVar2;
                                    this.f6630i = aVar;
                                    this.f6631j = null;
                                    this.f6633l = a5;
                                    this.f6634m = 3;
                                    obj2 = tVar2.b(hVar3, this);
                                    if (obj2 == aVar2) {
                                        return aVar2;
                                    }
                                    n0.g gVar3 = (n0.g) obj2;
                                    ?? r152 = gVar3.f6214a;
                                    size = r152.size();
                                    i3 = 0;
                                    list = r152;
                                    while (true) {
                                        if (i3 < size) {
                                            hVar = hVar3;
                                            j3 = j8;
                                            sVar4 = sVar6;
                                            mVar5 = null;
                                            break;
                                        }
                                        ?? r16 = list.get(i3);
                                        j3 = j8;
                                        i4 = size;
                                        list2 = list;
                                        sVar4 = sVar6;
                                        hVar = hVar3;
                                        if (n0.l.a(((n0.m) r16).f6223a, sVar2.f3479d)) {
                                            mVar5 = r16;
                                            break;
                                        }
                                        i3++;
                                        sVar6 = sVar4;
                                        j8 = j3;
                                        list = list2;
                                        size = i4;
                                        hVar3 = hVar;
                                    }
                                    mVar6 = mVar5;
                                    if (mVar6 != null && !mVar6.b()) {
                                        if (n0.s.b(mVar6)) {
                                            aVar.getClass();
                                            long h3 = a0.c.h(aVar.f1580a, a0.c.g(mVar6.f6225c, mVar6.f6229g));
                                            aVar.f1580a = h3;
                                            J j11 = J.f6444e;
                                            J j12 = (J) aVar.f1581b;
                                            if (j12 != null) {
                                                abs = Math.abs(j12 == j11 ? a0.c.d(h3) : a0.c.e(h3));
                                            } else {
                                                abs = a0.c.c(h3);
                                            }
                                            if (abs < a5) {
                                                sVar = sVar4;
                                                tVar4 = tVar2;
                                                cVar = null;
                                            } else {
                                                if (j12 == null) {
                                                    float c3 = a0.c.c(aVar.f1580a);
                                                    sVar = sVar4;
                                                    tVar4 = tVar2;
                                                    f3 = a0.c.g(aVar.f1580a, a0.c.i((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r3 & 4294967295L)) / c3) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r3 >> 32)) / c3) << 32), a5));
                                                } else {
                                                    sVar = sVar4;
                                                    tVar4 = tVar2;
                                                    long j13 = aVar.f1580a;
                                                    float d3 = j12 == j11 ? a0.c.d(j13) : a0.c.e(j13);
                                                    long j14 = aVar.f1580a;
                                                    float signum = d3 - (Math.signum(j12 == j11 ? a0.c.d(j14) : a0.c.e(j14)) * a5);
                                                    long j15 = aVar.f1580a;
                                                    float e3 = j12 == j11 ? a0.c.e(j15) : a0.c.d(j15);
                                                    f3 = j12 == j11 ? I2.l.f(signum, e3) : I2.l.f(e3, signum);
                                                }
                                                cVar = new a0.c(f3);
                                            }
                                            if (cVar != null) {
                                                mVar6.a();
                                                sVar3.f3479d = cVar.f3489a;
                                                if (mVar6.b()) {
                                                    tVar2 = tVar3;
                                                    mVar2 = mVar4;
                                                    mVar = mVar6;
                                                    if (mVar != null) {
                                                    }
                                                } else {
                                                    aVar.f1580a = 0L;
                                                    tVar2 = tVar4;
                                                }
                                            } else {
                                                n0.h hVar5 = n0.h.f6218f;
                                                this.f6635n = tVar3;
                                                this.f6626e = mVar4;
                                                tVar2 = tVar4;
                                                this.f6627f = tVar2;
                                                this.f6628g = sVar3;
                                                this.f6629h = sVar2;
                                                this.f6630i = aVar;
                                                this.f6631j = mVar6;
                                                this.f6633l = a5;
                                                this.f6634m = 4;
                                                if (tVar2.b(hVar5, this) == aVar2) {
                                                    return aVar2;
                                                }
                                                if (mVar6.b()) {
                                                }
                                            }
                                        } else {
                                            ?? r3 = gVar3.f6214a;
                                            int size4 = r3.size();
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= size4) {
                                                    obj3 = null;
                                                    break;
                                                }
                                                obj3 = r3.get(i9);
                                                if (((n0.m) obj3).f6226d) {
                                                    break;
                                                }
                                                i9++;
                                            }
                                            n0.m mVar12 = (n0.m) obj3;
                                            if (mVar12 != null) {
                                                sVar2.f3479d = mVar12.f6223a;
                                                sVar = sVar4;
                                                tVar2 = tVar2;
                                            }
                                        }
                                    }
                                    sVar = sVar4;
                                    tVar2 = tVar3;
                                    mVar2 = mVar4;
                                    mVar = null;
                                    if (mVar != null) {
                                    }
                                }
                            }
                        }
                    }
                    if (mVar != null) {
                        Z1.s sVar10 = sVar;
                        this.f6638r.f(mVar2, mVar, new a0.c(sVar10.f3479d));
                        long j16 = sVar10.f3479d;
                        c0060q = this.f6639s;
                        AbstractC0381e.k((o0.c) c0060q.f1338g, mVar);
                        m2.e eVar2 = ((g0) c0060q.f1337f).f6526w;
                        if (eVar2 != null) {
                            eVar2.g(new r(j16));
                        }
                        n0.g gVar4 = tVar2.f6258h.f6266v;
                        j4 = mVar.f6223a;
                        if (AbstractC0746w.a(gVar4, j4)) {
                            mVar3 = null;
                            if (mVar3 == null) {
                            }
                        } else {
                            j5 = j3;
                            sVar5 = new Z1.s();
                            sVar5.f3479d = j4;
                            tVar5 = tVar2;
                            J j102 = j5;
                            c0060q2 = c0060q;
                            j7 = j102;
                            this.f6635n = tVar2;
                            this.f6626e = c0060q2;
                            this.f6627f = j7;
                            this.f6628g = tVar5;
                            this.f6629h = sVar5;
                            mVar7 = null;
                            this.f6630i = null;
                            this.f6631j = null;
                            this.f6634m = 5;
                            hVar2 = hVar;
                            b2 = tVar5.b(hVar2, this);
                            r8 = c0060q2;
                            if (b2 == aVar2) {
                            }
                            n0.g gVar2222 = (n0.g) b2;
                            ?? r10222 = gVar2222.f6214a;
                            size2 = r10222.size();
                            i5 = 0;
                            list3 = r10222;
                            while (true) {
                                if (i5 < size2) {
                                }
                                i5++;
                                tVar2 = tVar6;
                                list3 = list4;
                                hVar2 = hVar;
                            }
                            mVar3 = mVar8;
                            if (mVar3 == null) {
                            }
                            if (mVar3 == null) {
                            }
                            mVar3 = mVar7;
                            if (mVar3 == null) {
                            }
                        }
                    }
                    return L1.z.f2729a;
                }
                sVar6 = sVar;
                j8 = j3;
                hVar3 = hVar;
                this.f6635n = tVar3;
                this.f6626e = mVar4;
                this.f6627f = tVar2;
                this.f6628g = sVar3;
                this.f6629h = sVar2;
                this.f6630i = aVar;
                this.f6631j = null;
                this.f6633l = a5;
                this.f6634m = 3;
                obj2 = tVar2.b(hVar3, this);
                if (obj2 == aVar2) {
                }
                n0.g gVar32 = (n0.g) obj2;
                ?? r1522 = gVar32.f6214a;
                size = r1522.size();
                i3 = 0;
                list = r1522;
                while (true) {
                    if (i3 < size) {
                    }
                    i3++;
                    sVar6 = sVar4;
                    j8 = j3;
                    list = list2;
                    size = i4;
                    hVar3 = hVar;
                }
                mVar6 = mVar5;
                if (mVar6 != null) {
                    if (n0.s.b(mVar6)) {
                    }
                    sVar6 = sVar;
                    j8 = j3;
                    hVar3 = hVar;
                    this.f6635n = tVar3;
                    this.f6626e = mVar4;
                    this.f6627f = tVar2;
                    this.f6628g = sVar3;
                    this.f6629h = sVar2;
                    this.f6630i = aVar;
                    this.f6631j = null;
                    this.f6633l = a5;
                    this.f6634m = 3;
                    obj2 = tVar2.b(hVar3, this);
                    if (obj2 == aVar2) {
                    }
                    n0.g gVar322 = (n0.g) obj2;
                    ?? r15222 = gVar322.f6214a;
                    size = r15222.size();
                    i3 = 0;
                    list = r15222;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                        sVar6 = sVar4;
                        j8 = j3;
                        list = list2;
                        size = i4;
                        hVar3 = hVar;
                    }
                    mVar6 = mVar5;
                    if (mVar6 != null) {
                    }
                }
                sVar = sVar4;
                tVar2 = tVar3;
                mVar2 = mVar4;
                mVar = null;
                if (mVar != null) {
                }
                if (mVar != null) {
                }
                return L1.z.f2729a;
            }
            booleanValue = this.f6632k;
            mVar = (n0.m) this.f6626e;
            tVar2 = (n0.t) this.f6635n;
            I2.l.Q(obj);
            a4 = obj;
            mVar2 = (n0.m) a4;
            sVar6.f3479d = 0L;
            if (!booleanValue) {
                sVar = sVar6;
                hVar = hVar3;
                j3 = j8;
                if (mVar != null) {
                }
                return L1.z.f2729a;
            }
            j6 = mVar2.f6223a;
            if (!AbstractC0746w.a(tVar2.f6258h.f6266v, j6)) {
            }
        }
        tVar2 = tVar;
        mVar = (n0.m) a3;
        booleanValue = ((Boolean) this.f6636o.b()).booleanValue();
        if (!booleanValue) {
            mVar.a();
        }
        this.f6635n = tVar2;
        this.f6626e = mVar;
        this.f6632k = booleanValue;
        this.f6634m = 2;
        a4 = x0.a(tVar2, (r3 & 1) != 0, n0.h.f6217e, this);
        if (a4 == aVar2) {
            return aVar2;
        }
        mVar2 = (n0.m) a4;
        sVar6.f3479d = 0L;
        if (!booleanValue) {
        }
        j6 = mVar2.f6223a;
        if (!AbstractC0746w.a(tVar2.f6258h.f6266v, j6)) {
        }
    }
}
