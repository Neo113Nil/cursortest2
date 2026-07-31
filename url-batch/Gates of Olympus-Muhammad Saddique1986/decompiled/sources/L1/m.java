package L1;

import android.content.Intent;
import com.gatesof.olympus.martu.marku.ChairActivity;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import e2.InterfaceC0426e;
import l1.C0597f;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class m extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f3380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SalonPageActivity f3381i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SalonPageActivity salonPageActivity, V1.d dVar) {
        super(2, dVar);
        this.f3381i = salonPageActivity;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((m) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new m(this.f3381i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f3380h;
        SalonPageActivity salonPageActivity = this.f3381i;
        if (i3 == 0) {
            R1.a.e(obj);
            A a3 = (A) salonPageActivity.f5636x.getValue();
            this.f3380h = 1;
            if (B.a(a3.f3343a).a(new C0597f(new u(a3, null), null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        salonPageActivity.startActivity(new Intent(salonPageActivity, (Class<?>) ChairActivity.class).addFlags(268468224));
        salonPageActivity.finish();
        return R1.y.f4171a;
    }
}
