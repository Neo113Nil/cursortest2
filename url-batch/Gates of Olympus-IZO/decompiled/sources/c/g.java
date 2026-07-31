package c;

import I2.l;
import L1.z;
import R1.i;
import Z.r;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class g extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f4334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, boolean z3, P1.d dVar) {
        super(2, dVar);
        this.f4334e = fVar;
        this.f4335f = z3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new g(this.f4334e, this.f4335f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        g gVar = (g) create((InterfaceC0550w) obj, (P1.d) obj2);
        z zVar = z.f2729a;
        gVar.invokeSuspend(zVar);
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y1.a, Z1.g] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Q1.a aVar = Q1.a.f3113d;
        l.Q(obj);
        f fVar = this.f4334e;
        boolean z3 = this.f4335f;
        if (!z3 && fVar.f4200a && (rVar = fVar.f4333f) != null) {
            rVar.c();
        }
        fVar.f4200a = z3;
        ?? r3 = fVar.f4202c;
        if (r3 != 0) {
            r3.b();
        }
        return z.f2729a;
    }
}
