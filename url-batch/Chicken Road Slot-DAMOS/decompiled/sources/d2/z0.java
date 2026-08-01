package d2;

import com.manholeroboramprush.cardestroy.KitchenDoor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 extends a {

    /* renamed from: x, reason: collision with root package name */
    public final n0.j1 f3605x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3606y;

    public z0(KitchenDoor kitchenDoor) {
        super(kitchenDoor);
        this.f3605x = n0.h.r(null);
    }

    @Override // d2.a
    public final void a(int i3, n0.i0 i0Var) {
        i0Var.X(420213850);
        int i10 = (i0Var.h(this) ? 4 : 2) | i3;
        if (i0Var.O(i10 & 1, (i10 & 3) != 2)) {
            Function2 function2 = (Function2) this.f3605x.getValue();
            if (function2 == null) {
                i0Var.W(-1238823553);
            } else {
                i0Var.W(98585282);
                function2.invoke(i0Var, 0);
            }
            i0Var.p(false);
        } else {
            i0Var.R();
        }
        n0.s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b3.e(this, i3, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return z0.class.getName();
    }

    @Override // d2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3606y;
    }

    public final void setContent(Function2<? super n0.i0, ? super Integer, Unit> function2) {
        this.f3606y = true;
        this.f3605x.setValue(function2);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
