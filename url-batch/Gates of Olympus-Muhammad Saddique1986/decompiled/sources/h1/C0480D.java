package h1;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.io.Serializable;
import m.InterfaceC0640z;
import m.l0;
import q2.AbstractC0837y;

/* renamed from: h1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480D extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6060h = 2;

    /* renamed from: i, reason: collision with root package name */
    public int f6061i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6062j;

    /* renamed from: k, reason: collision with root package name */
    public Object f6063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6065m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480D(V1.d dVar, Object obj, InterfaceC0640z interfaceC0640z, m.U u3, l0 l0Var) {
        super(1, dVar);
        this.f6063k = l0Var;
        this.f6064l = u3;
        this.f6062j = obj;
        this.f6065m = interfaceC0640z;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X1.i, e2.e] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6060h) {
            case 0:
                return new C0480D((f2.u) this.f6064l, (M) this.f6062j, (f2.s) this.f6065m, (V1.d) obj).q(R1.y.f4171a);
            case 1:
                ?? r12 = (X1.i) this.f6065m;
                return new C0480D((M) this.f6062j, (V1.i) this.f6064l, (InterfaceC0426e) r12, (V1.d) obj).q(R1.y.f4171a);
            default:
                return new C0480D((V1.d) obj, this.f6062j, (InterfaceC0640z) this.f6065m, (m.U) this.f6064l, (l0) this.f6063k).q(R1.y.f4171a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Type inference failed for: r6v3, types: [X1.i, e2.e] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        f2.u uVar;
        f2.s sVar;
        C0485c c0485c;
        Object obj2;
        switch (this.f6060h) {
            case 0:
                W1.a aVar = W1.a.f4608d;
                int i3 = this.f6061i;
                f2.s sVar2 = (f2.s) this.f6065m;
                f2.u uVar2 = (f2.u) this.f6064l;
                M m3 = (M) this.f6062j;
                try {
                } catch (C0484b unused) {
                    Object obj3 = uVar2.f5832d;
                    this.f6063k = sVar2;
                    this.f6061i = 3;
                    obj = m3.i(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i3 == 0) {
                    R1.a.e(obj);
                    this.f6063k = uVar2;
                    this.f6061i = 1;
                    obj = m3.h(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    uVar = uVar2;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            sVar = (f2.s) ((Serializable) this.f6063k);
                            R1.a.e(obj);
                            sVar.f5830d = ((Number) obj).intValue();
                            return R1.y.f4171a;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar2 = (f2.s) ((Serializable) this.f6063k);
                        R1.a.e(obj);
                        sVar2.f5830d = ((Number) obj).intValue();
                        return R1.y.f4171a;
                    }
                    uVar = (f2.u) ((Serializable) this.f6063k);
                    R1.a.e(obj);
                }
                uVar.f5832d = obj;
                W f3 = m3.f();
                this.f6063k = sVar2;
                this.f6061i = 2;
                obj = f3.a();
                if (obj == aVar) {
                    return aVar;
                }
                sVar = sVar2;
                sVar.f5830d = ((Number) obj).intValue();
                return R1.y.f4171a;
            case 1:
                W1.a aVar2 = W1.a.f4608d;
                int i4 = this.f6061i;
                M m4 = (M) this.f6062j;
                if (i4 == 0) {
                    R1.a.e(obj);
                    this.f6061i = 1;
                    obj = M.e(m4, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f6063k;
                            R1.a.e(obj);
                            return obj4;
                        }
                        c0485c = (C0485c) this.f6063k;
                        R1.a.e(obj);
                        obj2 = c0485c.f6137b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0485c.f6138c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!f2.j.a(c0485c.f6137b, obj)) {
                            this.f6063k = obj;
                            this.f6061i = 3;
                            if (m4.i(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    R1.a.e(obj);
                }
                c0485c = (C0485c) obj;
                C0482F c0482f = new C0482F((X1.i) this.f6065m, c0485c, null);
                this.f6063k = c0485c;
                this.f6061i = 2;
                obj = AbstractC0837y.z((V1.i) this.f6064l, c0482f, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0485c.f6137b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0485c.f6138c) {
                }
            default:
                W1.a aVar3 = W1.a.f4608d;
                int i5 = this.f6061i;
                if (i5 == 0) {
                    R1.a.e(obj);
                    m.L l3 = new m.L(null, this.f6062j, (InterfaceC0640z) this.f6065m, (m.U) this.f6064l, (l0) this.f6063k);
                    this.f6061i = 1;
                    if (AbstractC0837y.e(l3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                ((l0) this.f6063k).i();
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480D(f2.u uVar, M m3, f2.s sVar, V1.d dVar) {
        super(1, dVar);
        this.f6064l = uVar;
        this.f6062j = m3;
        this.f6065m = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0480D(M m3, V1.i iVar, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(1, dVar);
        this.f6062j = m3;
        this.f6064l = iVar;
        this.f6065m = (X1.i) interfaceC0426e;
    }
}
