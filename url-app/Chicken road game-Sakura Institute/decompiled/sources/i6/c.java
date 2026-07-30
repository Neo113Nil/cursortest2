package i6;

import h6.i;
import r6.k;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public int f4963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.e f4964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h6.d f4965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h6.d dVar, i iVar, q6.e eVar, h6.d dVar2) {
        super(dVar, iVar);
        this.f4964g = eVar;
        this.f4965h = dVar2;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4963f;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4963f = 2;
            d6.a.e(obj);
            return obj;
        }
        this.f4963f = 1;
        d6.a.e(obj);
        q6.e eVar = this.f4964g;
        k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        y.d(2, eVar);
        return eVar.d(this.f4965h, this);
    }
}
