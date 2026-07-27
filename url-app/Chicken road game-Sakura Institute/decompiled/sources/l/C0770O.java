package l;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770O extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7605k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f7607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f7608n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ U f7609o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f7610p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f7611q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770O(Object obj, Object obj2, U u4, m0 m0Var, float f4, C2.a aVar) {
        super(2, aVar);
        this.f7607m = obj;
        this.f7608n = obj2;
        this.f7609o = u4;
        this.f7610p = m0Var;
        this.f7611q = f4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0770O) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0770O c0770o = new C0770O(this.f7607m, this.f7608n, this.f7609o, this.f7610p, this.f7611q, aVar);
        c0770o.f7606l = obj;
        return c0770o;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7605k;
        U u4 = this.f7609o;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f7606l;
            Object obj2 = this.f7607m;
            Object obj3 = this.f7608n;
            if (Intrinsics.a(obj2, obj3)) {
                u4.f7646n = null;
                if (Intrinsics.a(u4.f7635c.getValue(), obj2)) {
                    return Unit.f7487a;
                }
            } else {
                U.q(u4);
            }
            boolean a4 = Intrinsics.a(obj2, obj3);
            float f4 = this.f7611q;
            if (!a4) {
                m0 m0Var = this.f7610p;
                m0Var.q(obj2);
                m0Var.o(0L);
                u4.f7634b.setValue(obj2);
                m0Var.j(f4);
            }
            u4.z(f4);
            if (u4.f7645m.f6975b != 0) {
                W2.B.m(interfaceC0302y, null, null, new C0769N(u4, null), 3);
            } else {
                u4.f7644l = Long.MIN_VALUE;
            }
            this.f7605k = 1;
            if (U.u(u4, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        u4.y();
        return Unit.f7487a;
    }
}
