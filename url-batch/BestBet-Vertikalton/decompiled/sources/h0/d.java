package h0;

import d1.AbstractC0100h;
import java.util.concurrent.Callable;
import s1.C0321d;
import s1.InterfaceC0334q;

/* loaded from: classes.dex */
public final class d extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f2962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0321d f2963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Callable callable, C0321d c0321d, b1.d dVar) {
        super(dVar);
        this.f2962e = callable;
        this.f2963f = c0321d;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new d(this.f2962e, this.f2963f, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        d dVar = (d) a((InterfaceC0334q) obj, (b1.d) obj2);
        X0.g gVar = X0.g.f1277c;
        dVar.i(gVar);
        return gVar;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        C0321d c0321d = this.f2963f;
        H1.l.h0(obj);
        try {
            c0321d.b(this.f2962e.call());
        } catch (Throwable th) {
            c0321d.b(H1.l.w(th));
        }
        return X0.g.f1277c;
    }
}
