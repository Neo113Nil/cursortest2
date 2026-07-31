package z;

import I.C0143d;
import I.Y;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.C1034E;
import t2.InterfaceC1071x;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238b extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1242f f10433i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1256t f10434j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238b(C1242f c1242f, C1256t c1256t, V1.d dVar) {
        super(2, dVar);
        this.f10433i = c1242f;
        this.f10434j = c1256t;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1238b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1238b(this.f10433i, this.f10434j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10432h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1237a c1237a = C1237a.f10428f;
            this.f10432h = 1;
            V1.i iVar = this.f4642e;
            f2.j.c(iVar);
            if (C0143d.F(iVar).n(new Y(0, c1237a), this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                throw new C1.c();
            }
            R1.a.e(obj);
        }
        InterfaceC1071x i4 = this.f10433i.i();
        if (i4 == null) {
            return R1.y.f4171a;
        }
        F.C c2 = new F.C(5, this.f10434j);
        this.f10432h = 2;
        C1034E.m((C1034E) i4, c2, this);
        return aVar;
    }
}
