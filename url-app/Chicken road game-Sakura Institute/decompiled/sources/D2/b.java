package D2;

import E2.h;
import M2.J;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: e, reason: collision with root package name */
    public int f2167e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f2168i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C2.a f2169j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C2.a aVar, C2.a aVar2, Function2 function2) {
        super(aVar);
        this.f2168i = function2;
        this.f2169j = aVar2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        int i2 = this.f2167e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2167e = 2;
            AbstractC1343r.b(obj);
            return obj;
        }
        this.f2167e = 1;
        AbstractC1343r.b(obj);
        Function2 function2 = this.f2168i;
        Intrinsics.d(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        J.d(2, function2);
        return function2.h(this.f2169j, this);
    }
}
