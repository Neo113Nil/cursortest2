package androidx.room;

import java.util.concurrent.Callable;
import o1.C0285d;
import o1.InterfaceC0298q;

/* loaded from: classes.dex */
public final class e extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f1651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0285d f1652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Callable callable, C0285d c0285d, X0.d dVar) {
        super(dVar);
        this.f1651e = callable;
        this.f1652f = c0285d;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new e(this.f1651e, this.f1652f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        e eVar = (e) a((InterfaceC0298q) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f864a;
        eVar.i(iVar);
        return iVar;
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        C0285d c0285d = this.f1652f;
        T.d.Q(obj);
        try {
            c0285d.b(this.f1651e.call());
        } catch (Throwable th) {
            c0285d.b(T.d.p(th));
        }
        return U0.i.f864a;
    }
}
