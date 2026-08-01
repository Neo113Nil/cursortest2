package androidx.room;

import java.util.concurrent.Callable;
import o1.InterfaceC0298q;

/* loaded from: classes.dex */
public final class c extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f1648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Callable callable, X0.d dVar) {
        super(dVar);
        this.f1648e = callable;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new c(this.f1648e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((c) a((InterfaceC0298q) obj, (X0.d) obj2)).i(U0.i.f864a);
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        return this.f1648e.call();
    }
}
