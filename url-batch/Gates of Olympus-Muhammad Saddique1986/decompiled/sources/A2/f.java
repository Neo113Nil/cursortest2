package A2;

import C2.L;
import C2.M;
import L1.A;
import android.content.Context;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import e2.InterfaceC0422a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0422a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f240e;

    public /* synthetic */ f(int i3, Object obj) {
        this.f239d = i3;
        this.f240e = obj;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        Object obj = this.f240e;
        switch (this.f239d) {
            case 0:
                h hVar = (h) obj;
                return Integer.valueOf(M.d(hVar, hVar.f252j));
            case 1:
                return O2.l.Q("kotlin.Unit", k.f260f, new SerialDescriptor[0], new g(1, (L) obj));
            default:
                L1.k kVar = SalonPageActivity.Companion;
                Context applicationContext = ((SalonPageActivity) obj).getApplicationContext();
                f2.j.e(applicationContext, "getApplicationContext(...)");
                return new A(applicationContext);
        }
    }
}
