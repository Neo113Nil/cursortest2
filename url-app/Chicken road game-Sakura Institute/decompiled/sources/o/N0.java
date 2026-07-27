package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class N0 extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f8668i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8669j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0302y f8670k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f8671l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f8672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M2.E f8673n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q f8674o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(InterfaceC0302y interfaceC0302y, Function1 function1, Function1 function12, M2.E e4, Q q2, C2.a aVar) {
        super(2, aVar);
        this.f8670k = interfaceC0302y;
        this.f8671l = function1;
        this.f8672m = function12;
        this.f8673n = e4;
        this.f8674o = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((N0) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        N0 n02 = new N0(this.f8670k, this.f8671l, this.f8672m, this.f8673n, this.f8674o, aVar);
        n02.f8669j = obj;
        return n02;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8668i;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0800A c0800a = (C0800A) this.f8669j;
            this.f8668i = 1;
            obj = R0.d(c0800a, EnumC0812j.f7911e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        l0.s sVar = (l0.s) obj;
        Q q2 = this.f8674o;
        InterfaceC0302y interfaceC0302y = this.f8670k;
        if (sVar != null) {
            sVar.a();
            W2.B.m(interfaceC0302y, null, null, new L0(q2, null), 3);
            this.f8671l.invoke(new Y.c(sVar.f7925c));
            return Unit.f7487a;
        }
        W2.B.m(interfaceC0302y, null, null, new M0(q2, null), 3);
        Function1 function1 = this.f8672m;
        if (function1 == null) {
            return null;
        }
        function1.invoke(new Y.c(((l0.s) this.f8673n.f3580d).f7925c));
        return Unit.f7487a;
    }
}
