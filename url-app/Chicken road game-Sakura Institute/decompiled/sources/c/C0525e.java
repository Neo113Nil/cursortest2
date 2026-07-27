package c;

import E2.j;
import M2.A;
import W2.InterfaceC0302y;
import Z2.C0326b;
import Z2.C0335k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525e extends j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public A f5705k;

    /* renamed from: l, reason: collision with root package name */
    public int f5706l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f5707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0526f f5708n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525e(Function2 function2, C0526f c0526f, C2.a aVar) {
        super(2, aVar);
        this.f5707m = function2;
        this.f5708n = c0526f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0525e) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0525e(this.f5707m, this.f5708n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        A a4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f5706l;
        boolean z4 = true;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            A a5 = new A();
            C0335k c0335k = new C0335k(new C0326b(this.f5708n.f5710b, z4), new C0524d(a5, null, 0));
            this.f5705k = a5;
            this.f5706l = 1;
            if (this.f5707m.h(c0335k, this) == aVar) {
                return aVar;
            }
            a4 = a5;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a4 = this.f5705k;
            AbstractC1343r.b(obj);
        }
        if (a4.f3576d) {
            return Unit.f7487a;
        }
        throw new IllegalStateException("You must collect the progress flow");
    }
}
