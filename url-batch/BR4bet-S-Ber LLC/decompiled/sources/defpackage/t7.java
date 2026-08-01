package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t7 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                int alpha = Color.alpha(((ExtendedFloatingActionButton) obj).getCurrentOriginalTextColor());
                return Float.valueOf(alpha != 0 ? Color.alpha(r2.getCurrentTextColor()) / alpha : 0.0f);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 7:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 8:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 9:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 10:
                return Float.valueOf(dd0.a.r((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                if (f.floatValue() != 1.0f) {
                    extendedFloatingActionButton.z(ColorStateList.valueOf(gc.d(extendedFloatingActionButton.getCurrentOriginalTextColor(), Math.round(g3.a(0.0f, Color.alpha(r4), f.floatValue())))));
                    break;
                } else {
                    extendedFloatingActionButton.z(extendedFloatingActionButton.getOriginalTextColor());
                    break;
                }
            case 1:
                ja jaVar = (ja) obj;
                PointF pointF = (PointF) obj2;
                jaVar.getClass();
                jaVar.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                jaVar.b = round;
                int i = jaVar.f + 1;
                jaVar.f = i;
                if (i == jaVar.g) {
                    dd0.a(jaVar.e, jaVar.a, round, jaVar.c, jaVar.d);
                    jaVar.f = 0;
                    jaVar.g = 0;
                    break;
                }
                break;
            case 2:
                ja jaVar2 = (ja) obj;
                PointF pointF2 = (PointF) obj2;
                jaVar2.getClass();
                jaVar2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                jaVar2.d = round2;
                int i2 = jaVar2.g + 1;
                jaVar2.g = i2;
                if (jaVar2.f == i2) {
                    dd0.a(jaVar2.e, jaVar2.a, jaVar2.b, jaVar2.c, round2);
                    jaVar2.f = 0;
                    jaVar2.g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                dd0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                dd0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                dd0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 6:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                break;
            case 7:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case 8:
                View view6 = (View) obj;
                view6.setPaddingRelative(((Float) obj2).intValue(), view6.getPaddingTop(), view6.getPaddingEnd(), view6.getPaddingBottom());
                break;
            case 9:
                View view7 = (View) obj;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                break;
            case 10:
                dd0.a.Q((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
