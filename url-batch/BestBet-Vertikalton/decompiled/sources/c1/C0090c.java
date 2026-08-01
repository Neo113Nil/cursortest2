package c1;

import H1.l;
import b1.j;
import d1.AbstractC0095c;
import j1.p;
import k1.e;
import k1.k;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090c extends AbstractC0095c {
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1.d f2065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090c(b1.d dVar, j jVar, p pVar, b1.d dVar2) {
        super(dVar, jVar);
        this.f2064e = pVar;
        this.f2065f = dVar2;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.d = 2;
            l.h0(obj);
            return obj;
        }
        this.d = 1;
        l.h0(obj);
        p pVar = this.f2064e;
        e.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        k.a(pVar);
        return pVar.d(this.f2065f, this);
    }
}
