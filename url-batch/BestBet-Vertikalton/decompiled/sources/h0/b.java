package h0;

import d1.AbstractC0100h;
import java.util.concurrent.Callable;
import s1.InterfaceC0334q;

/* loaded from: classes.dex */
public final class b extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f2959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Callable callable, b1.d dVar) {
        super(dVar);
        this.f2959e = callable;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new b(this.f2959e, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((b) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        H1.l.h0(obj);
        return this.f2959e.call();
    }
}
