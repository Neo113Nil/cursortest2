package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class A0 extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f8582i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8583j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0302y f8584k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2.j f8585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M2.p f8586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q f8587n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A0(InterfaceC0302y interfaceC0302y, L2.c cVar, Function1 function1, Q q2, C2.a aVar) {
        super(2, aVar);
        this.f8584k = interfaceC0302y;
        this.f8585l = (E2.j) cVar;
        this.f8586m = (M2.p) function1;
        this.f8587n = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((A0) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E2.j, L2.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        ?? r32 = this.f8586m;
        Q q2 = this.f8587n;
        A0 a02 = new A0(this.f8584k, this.f8585l, r32, q2, aVar);
        a02.f8583j = obj;
        return a02;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /* JADX WARN: Type inference failed for: r0v2, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [E2.j, L2.c] */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0800A c0800a;
        l0.s sVar;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8582i;
        Q q2 = this.f8587n;
        InterfaceC0302y interfaceC0302y = this.f8584k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f8583j;
            W2.B.m(interfaceC0302y, null, null, new w0(q2, null), 3);
            this.f8583j = c0800a;
            this.f8582i = 1;
            obj = R0.b(c0800a, (r3 & 1) != 0, EnumC0812j.f7911e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                sVar = (l0.s) obj;
                if (sVar != null) {
                    W2.B.m(interfaceC0302y, null, null, new y0(q2, null), 3);
                } else {
                    sVar.a();
                    W2.B.m(interfaceC0302y, null, null, new z0(q2, null), 3);
                    this.f8586m.invoke(new Y.c(sVar.f7925c));
                }
                return Unit.f7487a;
            }
            c0800a = (C0800A) this.f8583j;
            AbstractC1343r.b(obj);
        }
        l0.s sVar2 = (l0.s) obj;
        sVar2.a();
        C0910s0 c0910s0 = R0.f8710a;
        ?? r8 = this.f8585l;
        if (r8 != c0910s0) {
            W2.B.m(interfaceC0302y, null, null, new x0(r8, q2, sVar2, null), 3);
        }
        this.f8583j = null;
        this.f8582i = 2;
        obj = R0.d(c0800a, EnumC0812j.f7911e, this);
        if (obj == aVar) {
            return aVar;
        }
        sVar = (l0.s) obj;
        if (sVar != null) {
        }
        return Unit.f7487a;
    }
}
