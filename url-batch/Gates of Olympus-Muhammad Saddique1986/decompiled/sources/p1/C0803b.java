package p1;

import I.C0166o0;
import I.R0;
import R1.y;
import V1.j;
import X1.i;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t2.InterfaceC1043N;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803b extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V1.i f7822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1043N f7823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0166o0 f7824k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803b(V1.i iVar, InterfaceC1043N interfaceC1043N, C0166o0 c0166o0, V1.d dVar) {
        super(2, dVar);
        this.f7822i = iVar;
        this.f7823j = interfaceC1043N;
        this.f7824k = c0166o0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0803b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0803b(this.f7822i, this.f7823j, this.f7824k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7821h;
        if (i3 == 0) {
            R1.a.e(obj);
            j jVar = j.f4558d;
            V1.i iVar = this.f7822i;
            boolean a3 = f2.j.a(iVar, jVar);
            C0166o0 c0166o0 = this.f7824k;
            InterfaceC1043N interfaceC1043N = this.f7823j;
            if (a3) {
                R0 r02 = new R0(c0166o0, 2);
                this.f7821h = 1;
                if (interfaceC1043N.d(r02, this) == aVar) {
                    return aVar;
                }
            } else {
                C0802a c0802a = new C0802a(interfaceC1043N, c0166o0, null);
                this.f7821h = 2;
                if (AbstractC0837y.z(iVar, c0802a, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return y.f4171a;
    }
}
