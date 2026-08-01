package n;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import p0.C0328d;

/* loaded from: classes.dex */
public final class U0 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U0(Class cls, String str, int i) {
        super(cls, str);
        this.f3530a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3530a) {
            case 0:
                return Float.valueOf(((V0) obj).f3571z);
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
                return Float.valueOf(p0.w.f3874a.B((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3530a) {
            case 0:
                ((V0) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                C0328d c0328d = (C0328d) obj;
                PointF pointF = (PointF) obj2;
                c0328d.getClass();
                c0328d.f3813a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0328d.f3814b = round;
                int i = c0328d.f3817f + 1;
                c0328d.f3817f = i;
                if (i == c0328d.f3818g) {
                    p0.w.a(c0328d.e, c0328d.f3813a, round, c0328d.f3815c, c0328d.f3816d);
                    c0328d.f3817f = 0;
                    c0328d.f3818g = 0;
                    break;
                }
                break;
            case 2:
                C0328d c0328d2 = (C0328d) obj;
                PointF pointF2 = (PointF) obj2;
                c0328d2.getClass();
                c0328d2.f3815c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0328d2.f3816d = round2;
                int i2 = c0328d2.f3818g + 1;
                c0328d2.f3818g = i2;
                if (c0328d2.f3817f == i2) {
                    p0.w.a(c0328d2.e, c0328d2.f3813a, c0328d2.f3814b, c0328d2.f3815c, round2);
                    c0328d2.f3817f = 0;
                    c0328d2.f3818g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                p0.w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                p0.w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                p0.w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 6:
                float floatValue = ((Float) obj2).floatValue();
                p0.w.f3874a.e0((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
