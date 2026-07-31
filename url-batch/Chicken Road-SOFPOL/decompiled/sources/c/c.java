package c;

import c6.m;
import q6.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends i6.i implements p6.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f1539h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, g6.c cVar) {
        super(3, cVar);
        this.f1539h = oVar;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        c cVar = new c(this.f1539h, (g6.c) obj3);
        m mVar = m.f1757a;
        cVar.p(mVar);
        return mVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        this.f1539h.f6201d = true;
        return m.f1757a;
    }
}
