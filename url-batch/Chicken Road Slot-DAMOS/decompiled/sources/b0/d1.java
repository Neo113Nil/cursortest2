package b0;

import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import n0.m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 implements n0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f817c;

    public /* synthetic */ d1(int i3, Object obj, Object obj2) {
        this.f815a = i3;
        this.f816b = obj;
        this.f817c = obj2;
    }

    @Override // n0.a0
    public final void a() {
        int i3 = this.f815a;
        Object obj = this.f817c;
        Object obj2 = this.f816b;
        switch (i3) {
            case 0:
                e1 e1Var = (e1) obj2;
                View view = (View) obj;
                int i10 = e1Var.f836t - 1;
                e1Var.f836t = i10;
                if (i10 == 0) {
                    Field field = o3.c0.f7378a;
                    o3.w.c(view, null);
                    o3.c0.f(view, null);
                    view.removeOnAttachStateChangeListener(e1Var.f837u);
                    break;
                }
                break;
            case 1:
                ((f.b) obj2).b((e.f) obj);
                break;
            case 2:
                ((f.b) obj2).b((e.h) obj);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((androidx.lifecycle.u) obj2).g().f((h5.a) obj);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((n4.h) obj2).f7069v.j.f((o4.l) obj);
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                Iterator it = ((List) ((m2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((o4.i) obj).b().c((n4.h) it.next());
                }
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((v.z0) obj2).j.remove((v.z0) obj);
                break;
            default:
                v.z0 z0Var = (v.z0) obj2;
                z0Var.getClass();
                v.s0 s0Var = (v.s0) ((v.t0) obj).f9884b.getValue();
                if (s0Var != null) {
                    z0Var.f9924i.remove(s0Var.f9878d);
                    break;
                }
                break;
        }
    }
}
