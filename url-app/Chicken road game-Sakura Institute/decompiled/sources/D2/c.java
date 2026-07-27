package D2;

import M2.J;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class c extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public int f2170j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f2171k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2.a f2172l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C2.a aVar, CoroutineContext coroutineContext, Function2 function2, C2.a aVar2) {
        super(aVar, coroutineContext);
        this.f2171k = function2;
        this.f2172l = aVar2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        int i2 = this.f2170j;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2170j = 2;
            AbstractC1343r.b(obj);
            return obj;
        }
        this.f2170j = 1;
        AbstractC1343r.b(obj);
        Function2 function2 = this.f2171k;
        Intrinsics.d(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        J.d(2, function2);
        return function2.h(this.f2172l, this);
    }
}
