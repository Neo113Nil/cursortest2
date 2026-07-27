package f1;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0767L;
import l.InterfaceC0799z;
import l.m0;
import y2.AbstractC1343r;

/* renamed from: f1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604E extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6487k = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f6488l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6489m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6490n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f6491o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f6492p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0604E(C2.a aVar, Object obj, InterfaceC0799z interfaceC0799z, l.U u4, m0 m0Var) {
        super(1, aVar);
        this.f6490n = m0Var;
        this.f6491o = u4;
        this.f6489m = obj;
        this.f6492p = interfaceC0799z;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6487k) {
            case 0:
                return new C0604E((M2.E) this.f6491o, (N) this.f6489m, (M2.C) this.f6492p, (C2.a) obj).l(Unit.f7487a);
            case 1:
                ?? r12 = (E2.j) this.f6492p;
                return new C0604E((N) this.f6489m, (CoroutineContext) this.f6491o, (Function2) r12, (C2.a) obj).l(Unit.f7487a);
            default:
                return new C0604E((C2.a) obj, this.f6489m, (InterfaceC0799z) this.f6492p, (l.U) this.f6491o, (m0) this.f6490n).l(Unit.f7487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Type inference failed for: r6v3, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        M2.E e4;
        M2.C c4;
        C0610d c0610d;
        Object obj2;
        switch (this.f6487k) {
            case 0:
                D2.a aVar = D2.a.f2163d;
                int i2 = this.f6488l;
                M2.C c5 = (M2.C) this.f6492p;
                M2.E e5 = (M2.E) this.f6491o;
                N n2 = (N) this.f6489m;
                try {
                } catch (C0609c unused) {
                    Object obj3 = e5.f3580d;
                    this.f6490n = c5;
                    this.f6488l = 3;
                    obj = n2.h(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    AbstractC1343r.b(obj);
                    this.f6490n = e5;
                    this.f6488l = 1;
                    obj = n2.g(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    e4 = e5;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            c4 = (M2.C) ((Serializable) this.f6490n);
                            AbstractC1343r.b(obj);
                            c4.f3578d = ((Number) obj).intValue();
                            return Unit.f7487a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5 = (M2.C) ((Serializable) this.f6490n);
                        AbstractC1343r.b(obj);
                        c5.f3578d = ((Number) obj).intValue();
                        return Unit.f7487a;
                    }
                    e4 = (M2.E) ((Serializable) this.f6490n);
                    AbstractC1343r.b(obj);
                }
                e4.f3580d = obj;
                X e6 = n2.e();
                this.f6490n = c5;
                this.f6488l = 2;
                obj = e6.a();
                if (obj == aVar) {
                    return aVar;
                }
                c4 = c5;
                c4.f3578d = ((Number) obj).intValue();
                return Unit.f7487a;
            case 1:
                D2.a aVar2 = D2.a.f2163d;
                int i4 = this.f6488l;
                N n4 = (N) this.f6489m;
                if (i4 == 0) {
                    AbstractC1343r.b(obj);
                    this.f6488l = 1;
                    obj = N.c(n4, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f6490n;
                            AbstractC1343r.b(obj);
                            return obj4;
                        }
                        c0610d = (C0610d) this.f6490n;
                        AbstractC1343r.b(obj);
                        obj2 = c0610d.f6566b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0610d.f6567c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!Intrinsics.a(c0610d.f6566b, obj)) {
                            this.f6490n = obj;
                            this.f6488l = 3;
                            if (n4.h(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    AbstractC1343r.b(obj);
                }
                c0610d = (C0610d) obj;
                C0606G c0606g = new C0606G((E2.j) this.f6492p, c0610d, null);
                this.f6490n = c0610d;
                this.f6488l = 2;
                obj = W2.B.q((CoroutineContext) this.f6491o, c0606g, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0610d.f6566b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0610d.f6567c) {
                }
            default:
                D2.a aVar3 = D2.a.f2163d;
                int i5 = this.f6488l;
                if (i5 == 0) {
                    AbstractC1343r.b(obj);
                    C0767L c0767l = new C0767L(null, this.f6489m, (InterfaceC0799z) this.f6492p, (l.U) this.f6491o, (m0) this.f6490n);
                    this.f6488l = 1;
                    if (W2.B.d(c0767l, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                ((m0) this.f6490n).i();
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0604E(M2.E e4, N n2, M2.C c4, C2.a aVar) {
        super(1, aVar);
        this.f6491o = e4;
        this.f6489m = n2;
        this.f6492p = c4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0604E(N n2, CoroutineContext coroutineContext, Function2 function2, C2.a aVar) {
        super(1, aVar);
        this.f6489m = n2;
        this.f6491o = coroutineContext;
        this.f6492p = (E2.j) function2;
    }
}
