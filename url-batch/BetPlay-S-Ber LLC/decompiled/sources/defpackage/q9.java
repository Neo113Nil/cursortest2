package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class q9 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return Float.valueOf(ba0.a.x((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) obj;
                PointF pointF = (PointF) obj2;
                t9Var.getClass();
                t9Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                t9Var.b = round;
                int i = t9Var.f + 1;
                t9Var.f = i;
                if (i == t9Var.g) {
                    ba0.a(t9Var.e, t9Var.a, round, t9Var.c, t9Var.d);
                    t9Var.f = 0;
                    t9Var.g = 0;
                    break;
                }
                break;
            case 1:
                t9 t9Var2 = (t9) obj;
                PointF pointF2 = (PointF) obj2;
                t9Var2.getClass();
                t9Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                t9Var2.d = round2;
                int i2 = t9Var2.g + 1;
                t9Var2.g = i2;
                if (t9Var2.f == i2) {
                    ba0.a(t9Var2.e, t9Var2.a, t9Var2.b, t9Var2.c, round2);
                    t9Var2.f = 0;
                    t9Var2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                ba0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                ba0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                ba0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                float floatValue = ((Float) obj2).floatValue();
                ba0.a.S((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
