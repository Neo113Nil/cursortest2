package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class I extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f1988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f1989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q4, V5.b bVar) {
        super(2, bVar);
        this.f1989e = q4;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new I(this.f1989e, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.h(r6) == r2) goto L22;
     */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Q q4 = this.f1989e;
        B.f fVar = q4.f2024p;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1988d;
        try {
            if (i2 == 0) {
                V6.b.P(obj);
                if (fVar.k() instanceof c0) {
                    return fVar.k();
                }
                this.f1988d = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return (m0) obj;
                }
                V6.b.P(obj);
            }
            this.f1988d = 2;
            obj = Q.e(q4, false, this);
        } catch (Throwable th) {
            return new e0(th, -1);
        }
    }
}
