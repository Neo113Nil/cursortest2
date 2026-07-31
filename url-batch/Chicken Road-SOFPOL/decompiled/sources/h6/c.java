package h6;

import g6.h;
import q6.i;
import q6.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public int f3211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6.e f3212h;
    public final /* synthetic */ g6.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g6.c cVar, h hVar, p6.e eVar, g6.c cVar2) {
        super(cVar, hVar);
        this.f3212h = eVar;
        this.i = cVar2;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f3211g;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3211g = 2;
            s6.a.K(obj);
            return obj;
        }
        this.f3211g = 1;
        s6.a.K(obj);
        p6.e eVar = this.f3212h;
        i.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        v.c(2, eVar);
        return eVar.g(this.i, this);
    }
}
