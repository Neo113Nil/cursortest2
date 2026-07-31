package u0;

import I.C0123u0;
import android.view.View;
import com.gates.olympus.miruv.R;
import k2.InterfaceC0550w;
import n2.AbstractC0682G;

/* loaded from: classes.dex */
public final class M0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.A0 f8214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f8215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(I.A0 a02, View view, P1.d dVar) {
        super(2, dVar);
        this.f8214f = a02;
        this.f8215g = view;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new M0(this.f8214f, this.f8215g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((M0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8213e;
        L1.z zVar = L1.z.f2729a;
        I.A0 a02 = this.f8214f;
        View view = this.f8215g;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                this.f8213e = 1;
                Object j3 = AbstractC0682G.j(a02.f2076r, new C0123u0(2, null), this);
                if (j3 != aVar) {
                    j3 = zVar;
                }
                if (j3 == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
            }
            if (V0.b(view) == a02) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return zVar;
        } finally {
            if (V0.b(view) == a02) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
