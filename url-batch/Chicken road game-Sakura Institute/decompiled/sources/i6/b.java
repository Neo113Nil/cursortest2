package i6;

import j6.g;
import r6.k;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: f, reason: collision with root package name */
    public int f4960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.e f4961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h6.d f4962h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h6.d dVar, h6.d dVar2, q6.e eVar) {
        super(dVar);
        this.f4961g = eVar;
        this.f4962h = dVar2;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4960f;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4960f = 2;
            d6.a.e(obj);
            return obj;
        }
        this.f4960f = 1;
        d6.a.e(obj);
        q6.e eVar = this.f4961g;
        k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        y.d(2, eVar);
        return eVar.d(this.f4962h, this);
    }
}
