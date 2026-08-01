package androidx.room;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f2097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Callable callable, a1.d dVar) {
        super(dVar);
        this.f2097b = callable;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new f(this.f2097b, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((f) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        H1.d.i0(obj);
        return this.f2097b.call();
    }
}
