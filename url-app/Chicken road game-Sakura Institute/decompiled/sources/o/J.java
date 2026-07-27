package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class J extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public M2.E f8640k;

    /* renamed from: l, reason: collision with root package name */
    public int f8641l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8642m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M2.E f8643n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8644o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M2.E e4, C0891i0 c0891i0, C2.a aVar) {
        super(2, aVar);
        this.f8643n = e4;
        this.f8644o = c0891i0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((J) j((C2.a) obj2, (Function1) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        J j4 = new J(this.f8643n, this.f8644o, aVar);
        j4.f8642m = obj;
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Function1 function1;
        Object obj2;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8641l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            function1 = (Function1) this.f8642m;
            r1 = this.f8643n;
            obj2 = r1.f3580d;
            if (obj2 instanceof C0913u) {
            }
            return Unit.f7487a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        M2.E e4 = this.f8640k;
        function1 = (Function1) this.f8642m;
        AbstractC1343r.b(obj);
        AbstractC0915v abstractC0915v = (AbstractC0915v) obj;
        e4.f3580d = abstractC0915v;
        e4 = this.f8643n;
        obj2 = e4.f3580d;
        if (!(obj2 instanceof C0913u) || (obj2 instanceof r)) {
            return Unit.f7487a;
        }
        abstractC0915v = null;
        C0909s c0909s = obj2 instanceof C0909s ? (C0909s) obj2 : null;
        if (c0909s != null) {
            function1.invoke(c0909s);
        }
        Y2.e eVar = this.f8644o.f8801z;
        if (eVar != null) {
            this.f8642m = function1;
            this.f8640k = e4;
            this.f8641l = 1;
            obj = eVar.l(this);
            if (obj == aVar) {
                return aVar;
            }
            AbstractC0915v abstractC0915v2 = (AbstractC0915v) obj;
        }
        e4.f3580d = abstractC0915v2;
        e4 = this.f8643n;
        obj2 = e4.f3580d;
        if (obj2 instanceof C0913u) {
        }
        return Unit.f7487a;
    }
}
