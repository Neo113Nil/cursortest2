package a3;

import android.view.MotionEvent;
import c2.g0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(e0 e0Var, int i3) {
        super(1);
        this.f212d = i3;
        this.f213e = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.f212d) {
            case 0:
                d2.v vVar = (d2.v) obj;
                if (!(vVar instanceof d2.v)) {
                    vVar = null;
                }
                e0 e0Var = this.f213e;
                if (vVar != null) {
                    vVar.getAndroidViewsHandler$ui().removeViewInLayout(e0Var);
                    HashMap<g0, n> layoutNodeToHolder = vVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder();
                    wd.g0.b(layoutNodeToHolder).remove(vVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(e0Var));
                    e0Var.setImportantForAccessibility(0);
                }
                e0Var.removeAllViewsInLayout();
                return Unit.f5554a;
            case 1:
                this.f213e.E = (Function1) obj;
                return Unit.f5554a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                e0 e0Var2 = this.f213e;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        dispatchTouchEvent = e0Var2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = e0Var2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
