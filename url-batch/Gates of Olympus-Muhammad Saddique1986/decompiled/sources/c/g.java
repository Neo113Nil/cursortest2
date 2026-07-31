package c;

import B.U;
import R1.y;
import X1.i;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class g extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f5458h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5459i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, boolean z3, V1.d dVar) {
        super(2, dVar);
        this.f5458h = fVar;
        this.f5459i = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        g gVar = (g) o((V1.d) obj2, (InterfaceC0835w) obj);
        y yVar = y.f4171a;
        gVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new g(this.f5458h, this.f5459i, dVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [e2.a, f2.h] */
    @Override // X1.a
    public final Object q(Object obj) {
        U u3;
        R1.a.e(obj);
        f fVar = this.f5458h;
        boolean z3 = this.f5459i;
        if (!z3 && fVar.f5337a && (u3 = fVar.f5457f) != null) {
            u3.c();
        }
        fVar.f5337a = z3;
        ?? r3 = fVar.f5339c;
        if (r3 != 0) {
            r3.b();
        }
        return y.f4171a;
    }
}
