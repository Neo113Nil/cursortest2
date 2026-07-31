package u0;

import I.C0177u0;
import I.C0187z0;
import android.view.View;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.AbstractC1035F;

/* loaded from: classes.dex */
public final class X0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f9291i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f9292j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(C0187z0 c0187z0, View view, V1.d dVar) {
        super(2, dVar);
        this.f9291i = c0187z0;
        this.f9292j = view;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((X0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new X0(this.f9291i, this.f9292j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9290h;
        R1.y yVar = R1.y.f4171a;
        C0187z0 c0187z0 = this.f9291i;
        View view = this.f9292j;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                this.f9290h = 1;
                Object k3 = AbstractC1035F.k(c0187z0.f3001r, new C0177u0(2, null), this);
                if (k3 != aVar) {
                    k3 = yVar;
                }
                if (k3 == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
            }
            if (g1.b(view) == c0187z0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return yVar;
        } finally {
            if (g1.b(view) == c0187z0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
