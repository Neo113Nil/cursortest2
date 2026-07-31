package U;

import R1.y;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicReference;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import q2.X;

/* loaded from: classes.dex */
public final class t extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f4504h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2.k f4506j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4507k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X1.i f4508l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(InterfaceC0424c interfaceC0424c, AtomicReference atomicReference, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f4506j = (f2.k) interfaceC0424c;
        this.f4507k = atomicReference;
        this.f4508l = (X1.i) interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((t) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X1.i, e2.e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e2.c, f2.k] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        t tVar = new t(this.f4506j, this.f4507k, this.f4508l, dVar);
        tVar.f4505i = obj;
        return tVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r9v9, types: [X1.i, e2.e] */
    @Override // X1.a
    public final Object q(Object obj) {
        s sVar;
        s sVar2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f4504h;
        AtomicReference atomicReference = this.f4507k;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f4505i;
                sVar = new s(AbstractC0837y.k(interfaceC0835w.q()), this.f4506j.n(interfaceC0835w));
                s sVar3 = (s) atomicReference.getAndSet(sVar);
                if (sVar3 != null) {
                    X x3 = sVar3.f4502a;
                    this.f4505i = sVar;
                    this.f4504h = 1;
                    if (AbstractC0837y.d(x3, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = (s) this.f4505i;
                    try {
                        R1.a.e(obj);
                        while (!atomicReference.compareAndSet(sVar2, null) && atomicReference.get() == sVar2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(sVar2, null)) {
                        }
                        throw th;
                    }
                }
                sVar = (s) this.f4505i;
                R1.a.e(obj);
            }
            ?? r9 = this.f4508l;
            Object obj2 = sVar.f4503b;
            this.f4505i = sVar;
            this.f4504h = 2;
            obj = r9.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
            sVar2 = sVar;
            while (!atomicReference.compareAndSet(sVar2, null)) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            sVar2 = sVar;
            while (!atomicReference.compareAndSet(sVar2, null) && atomicReference.get() == sVar2) {
            }
            throw th;
        }
    }
}
