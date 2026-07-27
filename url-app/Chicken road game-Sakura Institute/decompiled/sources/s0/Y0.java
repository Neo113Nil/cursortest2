package s0;

import G.C0226u0;
import G.C0236z0;
import W2.InterfaceC0302y;
import android.view.View;
import com.chicken.road.kedro.laqer.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Y0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10156k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f10157l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f10158m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C0236z0 c0236z0, View view, C2.a aVar) {
        super(2, aVar);
        this.f10157l = c0236z0;
        this.f10158m = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((Y0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new Y0(this.f10157l, this.f10158m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f10156k;
        C0236z0 c0236z0 = this.f10157l;
        View view = this.f10158m;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                this.f10156k = 1;
                Object k4 = Z2.H.k(c0236z0.f2999r, new C0226u0(2, null), this);
                if (k4 != obj2) {
                    k4 = Unit.f7487a;
                }
                if (k4 == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
            }
            return Unit.f7487a;
        } finally {
            if (h1.b(view) == c0236z0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
