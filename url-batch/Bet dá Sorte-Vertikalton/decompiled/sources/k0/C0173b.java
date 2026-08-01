package k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0173b(Class cls, String str, int i) {
        super(cls, str);
        this.f2739a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2739a) {
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
                return Float.valueOf(x.f2803a.j((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2739a) {
            case 0:
                C0176e c0176e = (C0176e) obj;
                PointF pointF = (PointF) obj2;
                c0176e.getClass();
                c0176e.f2742a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0176e.f2743b = round;
                int i = c0176e.f2746f + 1;
                c0176e.f2746f = i;
                if (i == c0176e.f2747g) {
                    x.a(c0176e.f2745e, c0176e.f2742a, round, c0176e.f2744c, c0176e.d);
                    c0176e.f2746f = 0;
                    c0176e.f2747g = 0;
                    break;
                }
                break;
            case 1:
                C0176e c0176e2 = (C0176e) obj;
                PointF pointF2 = (PointF) obj2;
                c0176e2.getClass();
                c0176e2.f2744c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0176e2.d = round2;
                int i2 = c0176e2.f2747g + 1;
                c0176e2.f2747g = i2;
                if (c0176e2.f2746f == i2) {
                    x.a(c0176e2.f2745e, c0176e2.f2742a, c0176e2.f2743b, c0176e2.f2744c, round2);
                    c0176e2.f2746f = 0;
                    c0176e2.f2747g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                x.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                x.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                x.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                x.f2803a.o((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
