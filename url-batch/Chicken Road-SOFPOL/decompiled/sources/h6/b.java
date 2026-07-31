package h6;

import i6.g;
import q6.i;
import q6.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: e, reason: collision with root package name */
    public int f3208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.e f3209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g6.c f3210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g6.c cVar, g6.c cVar2, p6.e eVar) {
        super(cVar);
        this.f3209f = eVar;
        this.f3210g = cVar2;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f3208e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3208e = 2;
            s6.a.K(obj);
            return obj;
        }
        this.f3208e = 1;
        s6.a.K(obj);
        p6.e eVar = this.f3209f;
        i.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        v.c(2, eVar);
        return eVar.g(this.f3210g, this);
    }
}
