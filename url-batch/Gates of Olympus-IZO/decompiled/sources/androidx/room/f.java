package androidx.room;

import java.util.concurrent.Callable;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class f extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f4072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Callable callable, P1.d dVar) {
        super(2, dVar);
        this.f4072e = callable;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new f(this.f4072e, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((f) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return this.f4072e.call();
    }
}
