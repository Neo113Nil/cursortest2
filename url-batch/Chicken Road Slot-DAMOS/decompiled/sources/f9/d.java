package f9;

import androidx.lifecycle.z0;
import com.google.android.gms.internal.measurement.se;
import com.manholeroboramprush.cardestroy.KitchenDoor;
import java.util.ArrayList;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import n0.k0;
import n0.p0;
import q0.e;
import s.d0;
import s.h0;
import s.n0;
import wd.c0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4212e;

    public /* synthetic */ d(int i3, Object obj) {
        this.f4211d = i3;
        this.f4212e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i3 = this.f4211d;
        Object obj = this.f4212e;
        switch (i3) {
            case 0:
                KitchenDoor kitchenDoor = (KitchenDoor) obj;
                z0 f3 = kitchenDoor.f();
                k4.b e2 = kitchenDoor.e();
                se seVar = ze.a.f10967b;
                if (seVar != null) {
                    return w.L(c0.a(a.class), f3, e2, ((jf.b) seVar.f2800i).f5258d);
                }
                i0.l("KoinApplication has not been started");
                return null;
            default:
                ArrayList arrayList = ((k0) obj).f6730a;
                h0 h0Var = new h0(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar = (e) arrayList.get(i10);
                    Object obj2 = eVar.f7729b;
                    int i11 = eVar.f7728a;
                    Object p0Var = obj2 != null ? new p0(Integer.valueOf(i11), eVar.f7729b) : Integer.valueOf(i11);
                    int f10 = h0Var.f(p0Var);
                    boolean z10 = f10 < 0;
                    Object obj3 = z10 ? null : h0Var.f8314c[f10];
                    if (obj3 != null) {
                        if (obj3 instanceof d0) {
                            d0 d0Var = (d0) obj3;
                            d0Var.a(eVar);
                            eVar = d0Var;
                        } else {
                            Object[] objArr = n0.f8348a;
                            d0 d0Var2 = new d0(2);
                            d0Var2.a(obj3);
                            d0Var2.a(eVar);
                            eVar = d0Var2;
                        }
                    }
                    if (z10) {
                        int i12 = ~f10;
                        h0Var.f8313b[i12] = p0Var;
                        h0Var.f8314c[i12] = eVar;
                    } else {
                        h0Var.f8314c[f10] = eVar;
                    }
                }
                return new o0.a(h0Var);
        }
    }
}
