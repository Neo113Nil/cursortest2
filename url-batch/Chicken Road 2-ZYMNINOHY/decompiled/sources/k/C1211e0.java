package k;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.reflect.Field;
import p1.C1348e;

/* renamed from: k.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211e0 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1211e0(Class cls, String str, int i4) {
        super(cls, str);
        this.f13999a = i4;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f13999a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).f4457x);
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
                return Float.valueOf(p1.y.f14807a.l((View) obj));
            default:
                Field field = E.H.f375a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f13999a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                C1348e c1348e = (C1348e) obj;
                PointF pointF = (PointF) obj2;
                c1348e.getClass();
                c1348e.f14743a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c1348e.f14744b = round;
                int i4 = c1348e.f14748f + 1;
                c1348e.f14748f = i4;
                if (i4 == c1348e.f14749g) {
                    p1.y.a(c1348e.f14747e, c1348e.f14743a, round, c1348e.f14745c, c1348e.f14746d);
                    c1348e.f14748f = 0;
                    c1348e.f14749g = 0;
                    break;
                }
                break;
            case 2:
                C1348e c1348e2 = (C1348e) obj;
                PointF pointF2 = (PointF) obj2;
                c1348e2.getClass();
                c1348e2.f14745c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c1348e2.f14746d = round2;
                int i5 = c1348e2.f14749g + 1;
                c1348e2.f14749g = i5;
                if (c1348e2.f14748f == i5) {
                    p1.y.a(c1348e2.f14747e, c1348e2.f14743a, c1348e2.f14744b, c1348e2.f14745c, round2);
                    c1348e2.f14748f = 0;
                    c1348e2.f14749g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                p1.y.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                p1.y.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                p1.y.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 6:
                float floatValue = ((Float) obj2).floatValue();
                p1.y.f14807a.w((View) obj, floatValue);
                break;
            default:
                Field field = E.H.f375a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
