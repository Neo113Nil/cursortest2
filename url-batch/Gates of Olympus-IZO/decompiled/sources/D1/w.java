package D1;

import i1.C0465b;
import i1.C0467d;

/* loaded from: classes.dex */
public final class w extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C c3, P1.d dVar) {
        super(2, dVar);
        this.f575f = c3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        w wVar = new w(this.f575f, dVar);
        wVar.f574e = obj;
        return wVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        w wVar = (w) create((C0465b) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        wVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        C0465b c0465b = (C0465b) this.f574e;
        C c3 = this.f575f;
        Boolean bool = Boolean.TRUE;
        c0465b.getClass();
        C0467d c0467d = c3.f523d;
        Z1.i.f(c0467d, "key");
        c0465b.c(c0467d, bool);
        return L1.z.f2729a;
    }
}
