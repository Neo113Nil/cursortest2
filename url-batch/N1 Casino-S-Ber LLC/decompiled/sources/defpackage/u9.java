package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class u9 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9(Class cls, String str, int i) {
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
            case 5:
                return Float.valueOf(t90.a.c((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) obj;
                PointF pointF = (PointF) obj2;
                x9Var.getClass();
                x9Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                x9Var.b = round;
                int i = x9Var.f + 1;
                x9Var.f = i;
                if (i == x9Var.g) {
                    t90.a(x9Var.e, x9Var.a, round, x9Var.c, x9Var.d);
                    x9Var.f = 0;
                    x9Var.g = 0;
                    break;
                }
                break;
            case 1:
                x9 x9Var2 = (x9) obj;
                PointF pointF2 = (PointF) obj2;
                x9Var2.getClass();
                x9Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                x9Var2.d = round2;
                int i2 = x9Var2.g + 1;
                x9Var2.g = i2;
                if (x9Var2.f == i2) {
                    t90.a(x9Var2.e, x9Var2.a, x9Var2.b, x9Var2.c, round2);
                    x9Var2.f = 0;
                    x9Var2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                t90.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                t90.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                t90.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                t90.a.j((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
