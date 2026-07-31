package W1;

import V1.i;
import e2.InterfaceC0426e;
import f2.j;
import f2.x;

/* loaded from: classes.dex */
public final class c extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public int f4615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f4616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V1.d f4617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(V1.d dVar, i iVar, InterfaceC0426e interfaceC0426e, V1.d dVar2) {
        super(dVar, iVar);
        this.f4616h = interfaceC0426e;
        this.f4617i = dVar2;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        int i3 = this.f4615g;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4615g = 2;
            R1.a.e(obj);
            return obj;
        }
        this.f4615g = 1;
        R1.a.e(obj);
        InterfaceC0426e interfaceC0426e = this.f4616h;
        j.d(interfaceC0426e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        x.d(2, interfaceC0426e);
        return interfaceC0426e.h(this.f4617i, this);
    }
}
