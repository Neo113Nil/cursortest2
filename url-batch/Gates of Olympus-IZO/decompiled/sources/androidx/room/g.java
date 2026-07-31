package androidx.room;

import java.util.concurrent.Callable;
import k2.C0536h;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class g extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f4073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0536h f4074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Callable callable, C0536h c0536h, P1.d dVar) {
        super(2, dVar);
        this.f4073e = callable;
        this.f4074f = c0536h;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new g(this.f4073e, this.f4074f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        g gVar = (g) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        gVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        C0536h c0536h = this.f4074f;
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        try {
            c0536h.resumeWith(this.f4073e.call());
        } catch (Throwable th) {
            c0536h.resumeWith(I2.l.t(th));
        }
        return L1.z.f2729a;
    }
}
