package c1;

import H1.l;
import d1.AbstractC0099g;
import j1.p;
import k1.e;
import k1.k;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089b extends AbstractC0099g {

    /* renamed from: b, reason: collision with root package name */
    public int f2062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f2063c;
    public final /* synthetic */ b1.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089b(b1.d dVar, b1.d dVar2, p pVar) {
        super(dVar);
        this.f2063c = pVar;
        this.d = dVar2;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        int i = this.f2062b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2062b = 2;
            l.h0(obj);
            return obj;
        }
        this.f2062b = 1;
        l.h0(obj);
        p pVar = this.f2063c;
        e.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        k.a(pVar);
        return pVar.d(this.d, this);
    }
}
