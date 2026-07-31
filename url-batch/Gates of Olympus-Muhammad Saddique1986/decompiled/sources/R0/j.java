package R0;

import I.C0143d;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import u0.C1121q0;

/* loaded from: classes.dex */
public final class j extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f4094h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4095i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A f4096j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(A a3, V1.d dVar) {
        super(2, dVar);
        this.f4096j = a3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((j) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        j jVar = new j(this.f4096j, dVar);
        jVar.f4095i = obj;
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC0835w interfaceC0835w;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f4094h;
        if (i3 == 0) {
            R1.a.e(obj);
            interfaceC0835w = (InterfaceC0835w) this.f4095i;
            if (AbstractC0837y.p(interfaceC0835w)) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0835w = (InterfaceC0835w) this.f4095i;
            R1.a.e(obj);
            A a3 = this.f4096j;
            int[] iArr = a3.D;
            int i4 = iArr[0];
            int i5 = iArr[1];
            a3.f4043o.getLocationOnScreen(iArr);
            if (i4 == iArr[0] || i5 != iArr[1]) {
                a3.j();
            }
            if (AbstractC0837y.p(interfaceC0835w)) {
                C0215d c0215d = C0215d.f4070g;
                this.f4095i = interfaceC0835w;
                this.f4094h = 1;
                V1.i iVar = this.f4642e;
                f2.j.c(iVar);
                if (iVar.v(C1121q0.f9440d) != null) {
                    throw new ClassCastException();
                }
                f2.j.c(iVar);
                if (C0143d.F(iVar).n(c0215d, this) == aVar) {
                    return aVar;
                }
                A a32 = this.f4096j;
                int[] iArr2 = a32.D;
                int i42 = iArr2[0];
                int i52 = iArr2[1];
                a32.f4043o.getLocationOnScreen(iArr2);
                if (i42 == iArr2[0]) {
                }
                a32.j();
                if (AbstractC0837y.p(interfaceC0835w)) {
                    return R1.y.f4171a;
                }
            }
        }
    }
}
