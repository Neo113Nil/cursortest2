package F1;

import I.C0156j0;
import R1.y;
import X1.i;
import com.gatesof.olympus.martu.marku.ChairActivity;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class b extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1954h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0156j0 f1955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0156j0 c0156j0, V1.d dVar) {
        super(2, dVar);
        this.f1955i = c0156j0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new b(this.f1955i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1954h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f1954h = 1;
            if (AbstractC0837y.f(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        int i4 = ChairActivity.f5624x;
        this.f1955i.setValue(Boolean.TRUE);
        return y.f4171a;
    }
}
