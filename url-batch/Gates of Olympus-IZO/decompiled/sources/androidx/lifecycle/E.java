package androidx.lifecycle;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import m1.C0622b;

/* loaded from: classes.dex */
public final class E extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public s2.a f3949e;

    /* renamed from: f, reason: collision with root package name */
    public C0622b f3950f;

    /* renamed from: g, reason: collision with root package name */
    public int f3951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s2.c f3952h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0622b f3953i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(s2.c cVar, C0622b c0622b, P1.d dVar) {
        super(2, dVar);
        this.f3952h = cVar;
        this.f3953i = c0622b;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new E(this.f3952h, this.f3953i, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((E) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [s2.a] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        s2.c cVar;
        C0622b c0622b;
        s2.a aVar;
        Throwable th;
        Q1.a aVar2 = Q1.a.f3113d;
        int i3 = this.f3951g;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                cVar = this.f3952h;
                this.f3949e = cVar;
                c0622b = this.f3953i;
                this.f3950f = c0622b;
                this.f3951g = 1;
                if (cVar.c(null, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f3949e;
                    try {
                        I2.l.Q(obj);
                        ((s2.c) aVar).e(null);
                        return L1.z.f2729a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((s2.c) aVar).e(null);
                        throw th;
                    }
                }
                c0622b = this.f3950f;
                ?? r3 = this.f3949e;
                I2.l.Q(obj);
                cVar = r3;
            }
            D d3 = new D(c0622b, null);
            this.f3949e = cVar;
            this.f3950f = null;
            this.f3951g = 2;
            if (AbstractC0552y.d(d3, this) == aVar2) {
                return aVar2;
            }
            aVar = cVar;
            ((s2.c) aVar).e(null);
            return L1.z.f2729a;
        } catch (Throwable th3) {
            aVar = cVar;
            th = th3;
            ((s2.c) aVar).e(null);
            throw th;
        }
    }
}
