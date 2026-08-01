package androidx.room;

import java.util.concurrent.Callable;
import r1.C0355e;

/* loaded from: classes.dex */
public final class h extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f2100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0355e f2101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Callable callable, C0355e c0355e, a1.d dVar) {
        super(dVar);
        this.f2100b = callable;
        this.f2101c = c0355e;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new h(this.f2100b, this.f2101c, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        h hVar = (h) create((r1.r) obj, (a1.d) obj2);
        W0.i iVar = W0.i.f1345a;
        hVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        C0355e c0355e = this.f2101c;
        H1.d.i0(obj);
        try {
            c0355e.resumeWith(this.f2100b.call());
        } catch (Throwable th) {
            c0355e.resumeWith(H1.d.r(th));
        }
        return W0.i.f1345a;
    }
}
