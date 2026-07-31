package Q1;

import I2.l;
import R1.g;
import Z1.i;
import Z1.w;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: d, reason: collision with root package name */
    public int f3117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y1.e f3118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P1.d f3119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(P1.d dVar, P1.d dVar2, Y1.e eVar) {
        super(dVar);
        this.f3118e = eVar;
        this.f3119f = dVar2;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f3117d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3117d = 2;
            l.Q(obj);
            return obj;
        }
        this.f3117d = 1;
        l.Q(obj);
        Y1.e eVar = this.f3118e;
        i.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        w.d(2, eVar);
        return eVar.g(this.f3119f, this);
    }
}
