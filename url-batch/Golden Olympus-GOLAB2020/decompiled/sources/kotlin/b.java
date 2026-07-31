package kotlin;

import W1.AbstractC1232b;
import a2.AbstractC1241b;
import h2.n;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

/* loaded from: classes3.dex */
final class b extends AbstractC1232b implements d {

    /* renamed from: b, reason: collision with root package name */
    private n f41029b;

    /* renamed from: c, reason: collision with root package name */
    private Object f41030c;

    /* renamed from: d, reason: collision with root package name */
    private d f41031d;

    /* renamed from: e, reason: collision with root package name */
    private Object f41032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n block, Object obj) {
        super(null);
        Object obj2;
        Intrinsics.checkNotNullParameter(block, "block");
        this.f41029b = block;
        this.f41030c = obj;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f41031d = this;
        obj2 = a.f41028a;
        this.f41032e = obj2;
    }

    @Override // W1.AbstractC1232b
    public Object a(Object obj, d dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f41031d = dVar;
        this.f41030c = obj;
        Object f4 = AbstractC1241b.f();
        if (f4 == AbstractC1241b.f()) {
            h.c(dVar);
        }
        return f4;
    }

    public final Object b() {
        Object obj;
        Object obj2;
        while (true) {
            Object obj3 = this.f41032e;
            d dVar = this.f41031d;
            if (dVar == null) {
                ResultKt.a(obj3);
                return obj3;
            }
            obj = a.f41028a;
            if (Result.c(obj, obj3)) {
                try {
                    n nVar = this.f41029b;
                    Object obj4 = this.f41030c;
                    Object d4 = !(nVar instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC1241b.d(nVar, this, obj4, dVar) : ((n) M.e(nVar, 3)).invoke(this, obj4, dVar);
                    if (d4 != AbstractC1241b.f()) {
                        dVar.resumeWith(Result.m243constructorimpl(d4));
                    }
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(th)));
                }
            } else {
                obj2 = a.f41028a;
                this.f41032e = obj2;
                dVar.resumeWith(obj3);
            }
        }
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return g.f41113b;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        this.f41031d = null;
        this.f41032e = obj;
    }
}
