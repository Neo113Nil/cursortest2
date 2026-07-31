package u0;

import android.view.Choreographer;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class P extends R1.i implements Y1.e {
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new P(2, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((P) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return Choreographer.getInstance();
    }
}
