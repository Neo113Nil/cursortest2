package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.C0781n;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class A extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f1948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f1949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Q q4, V5.b bVar) {
        super(2, bVar);
        this.f1949e = q4;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new A(this.f1949e, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r6.e(r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1948d;
        Q q4 = this.f1949e;
        if (i2 == 0) {
            V6.b.P(obj);
            P0.n nVar = q4.f2025q;
            this.f1948d = 1;
            Object W4 = ((C0781n) nVar.f2215i).W(this);
            if (W4 != aVar) {
                W4 = Unit.f6114a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return Unit.f6114a;
            }
            V6.b.P(obj);
        }
        q6.d b7 = q6.w.b(q4.g().f2127c, -1);
        C0160z c0160z = new C0160z(0, q4);
        this.f1948d = 2;
    }
}
