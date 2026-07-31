package W1;

import X1.g;
import e2.InterfaceC0426e;
import f2.j;
import f2.x;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: e, reason: collision with root package name */
    public int f4612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f4613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V1.d f4614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(V1.d dVar, V1.d dVar2, InterfaceC0426e interfaceC0426e) {
        super(dVar);
        this.f4613f = interfaceC0426e;
        this.f4614g = dVar2;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        int i3 = this.f4612e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4612e = 2;
            R1.a.e(obj);
            return obj;
        }
        this.f4612e = 1;
        R1.a.e(obj);
        InterfaceC0426e interfaceC0426e = this.f4613f;
        j.d(interfaceC0426e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        x.d(2, interfaceC0426e);
        return interfaceC0426e.h(this.f4614g, this);
    }
}
