package p;

import a0.C0238c;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import n0.C0700A;
import n0.C0713k;
import n0.EnumC0712j;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class R0 extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public Object f7582f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7583g;

    /* renamed from: h, reason: collision with root package name */
    public f2.u f7584h;

    /* renamed from: i, reason: collision with root package name */
    public long f7585i;

    /* renamed from: j, reason: collision with root package name */
    public int f7586j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7587k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0835w f7588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0427f f7589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7592p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T f7593q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(InterfaceC0835w interfaceC0835w, InterfaceC0427f interfaceC0427f, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0424c interfaceC0424c3, T t3, V1.d dVar) {
        super(2, dVar);
        this.f7588l = interfaceC0835w;
        this.f7589m = interfaceC0427f;
        this.f7590n = interfaceC0424c;
        this.f7591o = interfaceC0424c2;
        this.f7592p = interfaceC0424c3;
        this.f7593q = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((R0) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        R0 r02 = new R0(this.f7588l, this.f7589m, this.f7590n, this.f7591o, this.f7592p, this.f7593q, dVar);
        r02.f7587k = obj;
        return r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee A[Catch: k -> 0x00f7, TryCatch #5 {k -> 0x00f7, blocks: (B:59:0x00e8, B:61:0x00ee, B:64:0x00fb), top: B:58:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb A[Catch: k -> 0x00f7, TRY_LEAVE, TryCatch #5 {k -> 0x00f7, blocks: (B:59:0x00e8, B:61:0x00ee, B:64:0x00fb), top: B:58:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v43, types: [V1.a, V1.d, q2.x] */
    /* JADX WARN: Type inference failed for: r2v44 */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0700A c0700a;
        Object b3;
        C0700A c0700a2;
        n0.s sVar;
        long f3;
        f2.u uVar;
        Object f4;
        C0700A c0700a3;
        n0.s sVar2;
        f2.u uVar2;
        C0700A c0700a4;
        Object obj2;
        Object obj3;
        Object g3;
        C0700A c0700a5;
        f2.u uVar3;
        long j3;
        n0.s sVar3;
        C0700A c0700a6;
        InterfaceC0835w interfaceC0835w;
        InterfaceC0424c interfaceC0424c;
        InterfaceC0424c interfaceC0424c2;
        f2.u uVar4;
        f2.u uVar5;
        C0700A c0700a7;
        long j4;
        ?? r22;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7586j;
        T t3 = this.f7593q;
        InterfaceC0835w interfaceC0835w2 = this.f7588l;
        InterfaceC0427f interfaceC0427f = this.f7589m;
        InterfaceC0424c interfaceC0424c3 = this.f7592p;
        InterfaceC0424c interfaceC0424c4 = this.f7590n;
        switch (i3) {
            case 0:
                R1.a.e(obj);
                c0700a = (C0700A) this.f7587k;
                this.f7587k = c0700a;
                this.f7586j = 1;
                b3 = U0.b(c0700a, (r3 & 1) != 0, EnumC0712j.f7296e, this);
                if (b3 == aVar) {
                    return aVar;
                }
                c0700a2 = c0700a;
                sVar = (n0.s) b3;
                sVar.a();
                AbstractC0837y.r(interfaceC0835w2, null, null, new G0(t3, null), 3);
                if (interfaceC0427f != U0.f7613a) {
                    AbstractC0837y.r(interfaceC0835w2, null, null, new H0(interfaceC0427f, t3, sVar, null), 3);
                }
                f3 = interfaceC0424c4 == null ? c0700a2.e().f() : 4611686018427387903L;
                uVar = new f2.u();
                try {
                    I0 i02 = new I0(2, null);
                    this.f7587k = c0700a2;
                    this.f7582f = sVar;
                    this.f7583g = uVar;
                    this.f7584h = uVar;
                    this.f7585i = f3;
                    this.f7586j = 2;
                    f4 = c0700a2.f(f3, i02, this);
                } catch (C0713k unused) {
                    c0700a4 = c0700a2;
                    if (interfaceC0424c4 != null) {
                    }
                    this.f7587k = c0700a4;
                    this.f7582f = uVar;
                    this.f7583g = null;
                    this.f7584h = null;
                    this.f7585i = f3;
                    this.f7586j = 3;
                    if (U0.a(c0700a4, this) == aVar) {
                    }
                    AbstractC0837y.r(interfaceC0835w2, null, null, new L0(t3, null), 3);
                    uVar2 = uVar;
                    c0700a3 = c0700a4;
                    obj3 = uVar2.f5832d;
                    if (obj3 != null) {
                    }
                    return R1.y.f4171a;
                }
                if (f4 != aVar) {
                    return aVar;
                }
                c0700a3 = c0700a2;
                sVar2 = sVar;
                uVar2 = uVar;
                try {
                    uVar.f5832d = f4;
                    obj2 = uVar2.f5832d;
                    if (obj2 != null) {
                        AbstractC0837y.r(interfaceC0835w2, null, null, new J0(t3, null), 3);
                    } else {
                        ((n0.s) obj2).a();
                        AbstractC0837y.r(interfaceC0835w2, null, null, new K0(t3, null), 3);
                    }
                } catch (C0713k unused2) {
                    uVar = uVar2;
                    sVar = sVar2;
                    c0700a4 = c0700a3;
                    if (interfaceC0424c4 != null) {
                    }
                    this.f7587k = c0700a4;
                    this.f7582f = uVar;
                    this.f7583g = null;
                    this.f7584h = null;
                    this.f7585i = f3;
                    this.f7586j = 3;
                    if (U0.a(c0700a4, this) == aVar) {
                    }
                    AbstractC0837y.r(interfaceC0835w2, null, null, new L0(t3, null), 3);
                    uVar2 = uVar;
                    c0700a3 = c0700a4;
                    obj3 = uVar2.f5832d;
                    if (obj3 != null) {
                    }
                    return R1.y.f4171a;
                }
                obj3 = uVar2.f5832d;
                if (obj3 != null) {
                    if (this.f7591o != null) {
                        this.f7587k = c0700a3;
                        this.f7582f = uVar2;
                        this.f7583g = null;
                        this.f7584h = null;
                        this.f7585i = f3;
                        this.f7586j = 4;
                        L l3 = U0.f7613a;
                        long j5 = f3;
                        g3 = c0700a3.g(c0700a3.e().e(), new C0797x0((n0.s) obj3, null), this);
                        if (g3 == aVar) {
                            return aVar;
                        }
                        c0700a5 = c0700a3;
                        uVar3 = uVar2;
                        j3 = j5;
                        sVar3 = (n0.s) g3;
                        if (sVar3 == null) {
                            AbstractC0837y.r(interfaceC0835w2, null, null, new M0(t3, null), 3);
                            if (interfaceC0427f != U0.f7613a) {
                                AbstractC0837y.r(interfaceC0835w2, null, null, new N0(interfaceC0427f, t3, sVar3, null), 3);
                            }
                            try {
                                interfaceC0424c = interfaceC0424c3;
                                interfaceC0424c2 = interfaceC0424c4;
                                j4 = j3;
                                c0700a6 = c0700a5;
                                interfaceC0835w = interfaceC0835w2;
                                uVar4 = uVar3;
                            } catch (C0713k unused3) {
                                c0700a6 = c0700a5;
                                interfaceC0835w = interfaceC0835w2;
                                interfaceC0424c = interfaceC0424c3;
                                interfaceC0424c2 = interfaceC0424c4;
                                uVar4 = uVar3;
                            }
                            try {
                                Q0 q0 = new Q0(this.f7588l, this.f7591o, this.f7592p, uVar3, t3, null);
                                this.f7587k = c0700a6;
                                this.f7582f = uVar4;
                                this.f7583g = sVar3;
                                this.f7586j = 5;
                                if (c0700a6.f(j4, q0, this) == aVar) {
                                    return aVar;
                                }
                            } catch (C0713k unused4) {
                                uVar5 = uVar4;
                                c0700a7 = c0700a6;
                                if (interfaceC0424c != null) {
                                    interfaceC0424c.n(new C0238c(((n0.s) uVar5.f5832d).f7310c));
                                }
                                if (interfaceC0424c2 != null) {
                                    interfaceC0424c2.n(new C0238c(sVar3.f7310c));
                                }
                                r22 = 0;
                                this.f7587k = null;
                                this.f7582f = null;
                                this.f7583g = null;
                                this.f7586j = 6;
                                if (U0.a(c0700a7, this) == aVar) {
                                    return aVar;
                                }
                                AbstractC0837y.r(interfaceC0835w, r22, r22, new F0(t3, r22), 3);
                                return R1.y.f4171a;
                            }
                        } else if (interfaceC0424c3 != null) {
                            interfaceC0424c3.n(new C0238c(((n0.s) uVar3.f5832d).f7310c));
                        }
                    } else if (interfaceC0424c3 != null) {
                        interfaceC0424c3.n(new C0238c(((n0.s) obj3).f7310c));
                    }
                }
                return R1.y.f4171a;
            case 1:
                c0700a = (C0700A) this.f7587k;
                R1.a.e(obj);
                b3 = obj;
                c0700a2 = c0700a;
                sVar = (n0.s) b3;
                sVar.a();
                AbstractC0837y.r(interfaceC0835w2, null, null, new G0(t3, null), 3);
                if (interfaceC0427f != U0.f7613a) {
                }
                if (interfaceC0424c4 == null) {
                }
                uVar = new f2.u();
                I0 i022 = new I0(2, null);
                this.f7587k = c0700a2;
                this.f7582f = sVar;
                this.f7583g = uVar;
                this.f7584h = uVar;
                this.f7585i = f3;
                this.f7586j = 2;
                f4 = c0700a2.f(f3, i022, this);
                if (f4 != aVar) {
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                f3 = this.f7585i;
                uVar = this.f7584h;
                f2.u uVar6 = (f2.u) this.f7583g;
                sVar = (n0.s) this.f7582f;
                c0700a2 = (C0700A) this.f7587k;
                try {
                    R1.a.e(obj);
                    c0700a3 = c0700a2;
                    sVar2 = sVar;
                    uVar2 = uVar6;
                    f4 = obj;
                    uVar.f5832d = f4;
                    obj2 = uVar2.f5832d;
                    if (obj2 != null) {
                    }
                } catch (C0713k unused5) {
                    uVar = uVar6;
                    c0700a4 = c0700a2;
                    if (interfaceC0424c4 != null) {
                        interfaceC0424c4.n(new C0238c(sVar.f7310c));
                    }
                    this.f7587k = c0700a4;
                    this.f7582f = uVar;
                    this.f7583g = null;
                    this.f7584h = null;
                    this.f7585i = f3;
                    this.f7586j = 3;
                    if (U0.a(c0700a4, this) == aVar) {
                        return aVar;
                    }
                    AbstractC0837y.r(interfaceC0835w2, null, null, new L0(t3, null), 3);
                    uVar2 = uVar;
                    c0700a3 = c0700a4;
                    obj3 = uVar2.f5832d;
                    if (obj3 != null) {
                    }
                    return R1.y.f4171a;
                }
                obj3 = uVar2.f5832d;
                if (obj3 != null) {
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                f3 = this.f7585i;
                uVar = (f2.u) this.f7582f;
                c0700a4 = (C0700A) this.f7587k;
                R1.a.e(obj);
                AbstractC0837y.r(interfaceC0835w2, null, null, new L0(t3, null), 3);
                uVar2 = uVar;
                c0700a3 = c0700a4;
                obj3 = uVar2.f5832d;
                if (obj3 != null) {
                }
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                long j6 = this.f7585i;
                f2.u uVar7 = (f2.u) this.f7582f;
                C0700A c0700a8 = (C0700A) this.f7587k;
                R1.a.e(obj);
                uVar3 = uVar7;
                c0700a5 = c0700a8;
                g3 = obj;
                j3 = j6;
                sVar3 = (n0.s) g3;
                if (sVar3 == null) {
                }
                return R1.y.f4171a;
            case 5:
                sVar3 = (n0.s) this.f7583g;
                uVar5 = (f2.u) this.f7582f;
                c0700a7 = (C0700A) this.f7587k;
                try {
                    R1.a.e(obj);
                } catch (C0713k unused6) {
                    interfaceC0835w = interfaceC0835w2;
                    interfaceC0424c = interfaceC0424c3;
                    interfaceC0424c2 = interfaceC0424c4;
                    if (interfaceC0424c != null) {
                    }
                    if (interfaceC0424c2 != null) {
                    }
                    r22 = 0;
                    this.f7587k = null;
                    this.f7582f = null;
                    this.f7583g = null;
                    this.f7586j = 6;
                    if (U0.a(c0700a7, this) == aVar) {
                    }
                    AbstractC0837y.r(interfaceC0835w, r22, r22, new F0(t3, r22), 3);
                    return R1.y.f4171a;
                }
                return R1.y.f4171a;
            case 6:
                R1.a.e(obj);
                interfaceC0835w = interfaceC0835w2;
                r22 = 0;
                AbstractC0837y.r(interfaceC0835w, r22, r22, new F0(t3, r22), 3);
                return R1.y.f4171a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
