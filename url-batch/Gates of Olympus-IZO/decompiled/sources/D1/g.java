package D1;

import I.InterfaceC0088c0;
import android.content.Context;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import h.AbstractC0416e;
import h1.C0438i;
import kotlinx.serialization.descriptors.SerialDescriptor;
import q1.C0775D;
import w2.L;
import w2.M;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Y1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f552e;

    public /* synthetic */ g(int i3, Object obj) {
        this.f551d = i3;
        this.f552e = obj;
    }

    @Override // Y1.a
    public final Object b() {
        L1.z zVar = L1.z.f2729a;
        Object obj = this.f552e;
        switch (this.f551d) {
            case 0:
                m mVar = TenonPageActivity.Companion;
                Context applicationContext = ((TenonPageActivity) obj).getApplicationContext();
                Z1.i.e(applicationContext, "getApplicationContext(...)");
                return new C(applicationContext);
            case 1:
                ((C0775D) obj).l();
                return zVar;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) obj;
                return Float.valueOf((((G1.n) interfaceC0088c0.getValue()).f1564b + 1.0f) / ((G1.n) interfaceC0088c0.getValue()).f1563a.size());
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((H1.y) obj).e(new H1.j(null));
                return zVar;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                ((I1.m) obj).f(I1.e.f2465a);
                return zVar;
            case 5:
                u2.f fVar = (u2.f) obj;
                return Integer.valueOf(M.d(fVar, fVar.f8546j));
            default:
                return AbstractC0416e.m("kotlin.Unit", u2.h.f8553e, new SerialDescriptor[0], new E1.k(2, (L) obj));
        }
    }
}
