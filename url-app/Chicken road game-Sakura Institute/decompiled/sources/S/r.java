package S;

import W2.B;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class r extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f3993k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M2.p f3995m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3996n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E2.j f3997o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(Function1 function1, AtomicReference atomicReference, Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f3995m = (M2.p) function1;
        this.f3996n = atomicReference;
        this.f3997o = (E2.j) function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((r) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        r rVar = new r(this.f3995m, this.f3996n, this.f3997o, aVar);
        rVar.f3994l = obj;
        return rVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v9, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final Object l(Object obj) {
        q qVar;
        q qVar2;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f3993k;
        AtomicReference atomicReference = this.f3996n;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f3994l;
                qVar = new q(B.g(interfaceC0302y.q()), this.f3995m.invoke(interfaceC0302y));
                q qVar3 = (q) atomicReference.getAndSet(qVar);
                if (qVar3 != null) {
                    InterfaceC0280c0 interfaceC0280c0 = qVar3.f3991a;
                    this.f3994l = qVar;
                    this.f3993k = 1;
                    if (B.c(interfaceC0280c0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar2 = (q) this.f3994l;
                    try {
                        AbstractC1343r.b(obj);
                        while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(qVar2, null)) {
                        }
                        throw th;
                    }
                }
                qVar = (q) this.f3994l;
                AbstractC1343r.b(obj);
            }
            ?? r9 = this.f3997o;
            Object obj2 = qVar.f3992b;
            this.f3994l = qVar;
            this.f3993k = 2;
            obj = r9.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
            qVar2 = qVar;
            while (!atomicReference.compareAndSet(qVar2, null)) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            qVar2 = qVar;
            while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
            }
            throw th;
        }
    }
}
