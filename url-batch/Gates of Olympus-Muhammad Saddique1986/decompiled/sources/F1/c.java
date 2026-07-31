package F1;

import L1.k;
import L1.r;
import R1.y;
import X1.i;
import android.content.Intent;
import com.gatesof.olympus.martu.marku.ChairActivity;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import e2.InterfaceC0426e;
import f2.j;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class c extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ChairActivity f1956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f1957i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ChairActivity chairActivity, r rVar, V1.d dVar) {
        super(2, dVar);
        this.f1956h = chairActivity;
        this.f1957i = rVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        c cVar = (c) o((V1.d) obj2, (InterfaceC0835w) obj);
        y yVar = y.f4171a;
        cVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new c(this.f1956h, this.f1957i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        k kVar = SalonPageActivity.Companion;
        r rVar = this.f1957i;
        String str = rVar.f3387a;
        boolean z3 = rVar.f3388b;
        kVar.getClass();
        ChairActivity chairActivity = this.f1956h;
        j.f(chairActivity, "ctx");
        j.f(str, "url");
        Intent putExtra = new Intent(chairActivity, (Class<?>) SalonPageActivity.class).putExtra("extra_url", str).putExtra("extra_consent", z3);
        j.e(putExtra, "putExtra(...)");
        chairActivity.startActivity(putExtra);
        chairActivity.finish();
        return y.f4171a;
    }
}
