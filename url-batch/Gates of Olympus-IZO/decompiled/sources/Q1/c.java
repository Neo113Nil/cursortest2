package Q1;

import I2.l;
import P1.i;
import Z1.w;

/* loaded from: classes.dex */
public final class c extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public int f3120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y1.e f3121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P1.d f3122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(P1.d dVar, i iVar, Y1.e eVar, P1.d dVar2) {
        super(dVar, iVar);
        this.f3121e = eVar;
        this.f3122f = dVar2;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f3120d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3120d = 2;
            l.Q(obj);
            return obj;
        }
        this.f3120d = 1;
        l.Q(obj);
        Y1.e eVar = this.f3121e;
        Z1.i.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        w.d(2, eVar);
        return eVar.g(this.f3122f, this);
    }
}
