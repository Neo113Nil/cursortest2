package Z2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class C implements InterfaceC0330f {

    /* renamed from: d, reason: collision with root package name */
    public final E2.j f4612d;

    /* JADX WARN: Multi-variable type inference failed */
    public C(Function2 function2) {
        this.f4612d = (E2.j) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v3, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // Z2.InterfaceC0330f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        C0325a c0325a;
        int i2;
        Throwable th;
        a3.t tVar;
        if (aVar instanceof C0325a) {
            c0325a = (C0325a) aVar;
            int i4 = c0325a.f4666m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0325a.f4666m = i4 - Integer.MIN_VALUE;
                Object obj = c0325a.f4664k;
                Object obj2 = D2.a.f2163d;
                i2 = c0325a.f4666m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    CoroutineContext coroutineContext = c0325a.f2311e;
                    Intrinsics.c(coroutineContext);
                    a3.t tVar2 = new a3.t(interfaceC0331g, coroutineContext);
                    try {
                        c0325a.f4663j = tVar2;
                        c0325a.f4666m = 1;
                        Object h4 = this.f4612d.h(tVar2, c0325a);
                        if (h4 != obj2) {
                            h4 = Unit.f7487a;
                        }
                        if (h4 == obj2) {
                            return obj2;
                        }
                        tVar = tVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = tVar2;
                        tVar.m();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c0325a.f4663j;
                    try {
                        AbstractC1343r.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        tVar.m();
                        throw th;
                    }
                }
                tVar.m();
                return Unit.f7487a;
            }
        }
        c0325a = new C0325a(this, aVar);
        Object obj3 = c0325a.f4664k;
        Object obj22 = D2.a.f2163d;
        i2 = c0325a.f4666m;
        if (i2 != 0) {
        }
        tVar.m();
        return Unit.f7487a;
    }
}
