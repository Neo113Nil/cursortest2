package z0;

import A0.s;
import R1.y;
import a0.C0238c;
import e2.InterfaceC0426e;
import n.z0;

/* loaded from: classes.dex */
public final class e extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public boolean f10527h;

    /* renamed from: i, reason: collision with root package name */
    public int f10528i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ float f10529j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f10530k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, V1.d dVar) {
        super(2, dVar);
        this.f10530k = fVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((e) o((V1.d) obj2, Float.valueOf(((Number) obj).floatValue()))).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        e eVar = new e(this.f10530k, dVar);
        eVar.f10529j = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        boolean z3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10528i;
        if (i3 == 0) {
            R1.a.e(obj);
            float f3 = this.f10529j;
            f fVar = this.f10530k;
            Object obj2 = fVar.f10531a.f142d.f129d.get(A0.h.f107e);
            if (obj2 == null) {
                obj2 = null;
            }
            InterfaceC0426e interfaceC0426e = (InterfaceC0426e) obj2;
            if (interfaceC0426e == null) {
                z0.p("Required value was null.");
                throw null;
            }
            boolean z4 = ((A0.g) fVar.f10531a.f142d.b(s.f181p)).f101c;
            if (z4) {
                f3 = -f3;
            }
            C0238c c0238c = new C0238c(l0.c.e(0.0f, f3));
            this.f10527h = z4;
            this.f10528i = 1;
            obj = interfaceC0426e.h(c0238c, this);
            if (obj == aVar) {
                return aVar;
            }
            z3 = z4;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = this.f10527h;
            R1.a.e(obj);
        }
        float e3 = C0238c.e(((C0238c) obj).f4722a);
        if (z3) {
            e3 = -e3;
        }
        return new Float(e3);
    }
}
