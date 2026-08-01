package p0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0300b(Class cls, String str, int i) {
        super(cls, str);
        this.f3646a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3646a) {
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
                return Float.valueOf(w.f3709a.r((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3646a) {
            case 0:
                C0303e c0303e = (C0303e) obj;
                PointF pointF = (PointF) obj2;
                c0303e.getClass();
                c0303e.f3649a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0303e.f3650b = round;
                int i = c0303e.f3653f + 1;
                c0303e.f3653f = i;
                if (i == c0303e.f3654g) {
                    w.a(c0303e.f3652e, c0303e.f3649a, round, c0303e.f3651c, c0303e.d);
                    c0303e.f3653f = 0;
                    c0303e.f3654g = 0;
                    break;
                }
                break;
            case 1:
                C0303e c0303e2 = (C0303e) obj;
                PointF pointF2 = (PointF) obj2;
                c0303e2.getClass();
                c0303e2.f3651c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0303e2.d = round2;
                int i2 = c0303e2.f3654g + 1;
                c0303e2.f3654g = i2;
                if (c0303e2.f3653f == i2) {
                    w.a(c0303e2.f3652e, c0303e2.f3649a, c0303e2.f3650b, c0303e2.f3651c, round2);
                    c0303e2.f3653f = 0;
                    c0303e2.f3654g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f3709a.y((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
