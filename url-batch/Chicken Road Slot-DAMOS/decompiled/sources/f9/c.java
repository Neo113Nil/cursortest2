package f9;

import a1.s;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.manholeroboramprush.cardestroy.KitchenDoor;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m2.t;
import n0.h;
import n0.i0;
import n0.k;
import n4.h0;
import n4.x;
import o4.p;
import x0.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KitchenDoor f4210e;

    public /* synthetic */ c(KitchenDoor kitchenDoor, int i3) {
        this.f4209d = i3;
        this.f4210e = kitchenDoor;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f4209d;
        KitchenDoor kitchenDoor = this.f4210e;
        int i10 = 0;
        int i11 = 1;
        switch (i3) {
            case 0:
                i0 i0Var = (i0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i12 = KitchenDoor.J;
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    u9.c.a(false, false, i.d(751636563, new c(kitchenDoor, i11), i0Var), i0Var, 384);
                } else {
                    i0Var.R();
                }
                break;
            default:
                i0 i0Var2 = (i0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i13 = KitchenDoor.J;
                if (i0Var2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f465b);
                    Object[] copyOf = Arrays.copyOf(new h0[0], 0);
                    c6.c cVar = new c6.c(1, new t(26), new p(context, i10));
                    boolean h10 = i0Var2.h(context);
                    Object L = i0Var2.L();
                    Object obj3 = k.f6729a;
                    if (h10 || L == obj3) {
                        L = new a1.b(17, context);
                        i0Var2.g0(L);
                    }
                    x xVar = (x) s.b(copyOf, cVar, (Function0) L, i0Var2, 0, 4);
                    Unit unit = Unit.f5554a;
                    boolean h11 = i0Var2.h(kitchenDoor) | i0Var2.h(xVar);
                    Object L2 = i0Var2.L();
                    if (h11 || L2 == obj3) {
                        L2 = new a3.t(kitchenDoor, xVar, null, 8);
                        i0Var2.g0(L2);
                    }
                    h.f(unit, (Function2) L2, i0Var2);
                    l9.b.a(xVar, null, i0Var2, 0);
                } else {
                    i0Var2.R();
                }
                break;
        }
        return Unit.f5554a;
    }
}
