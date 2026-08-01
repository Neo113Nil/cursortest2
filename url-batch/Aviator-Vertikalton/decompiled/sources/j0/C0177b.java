package j0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0177b(Class cls, String str, int i) {
        super(cls, str);
        this.f2896a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2896a) {
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
                return Float.valueOf(w.f2963a.i((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2896a) {
            case 0:
                C0180e c0180e = (C0180e) obj;
                PointF pointF = (PointF) obj2;
                c0180e.getClass();
                c0180e.f2899a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0180e.f2900b = round;
                int i = c0180e.f2904f + 1;
                c0180e.f2904f = i;
                if (i == c0180e.f2905g) {
                    w.a(c0180e.f2903e, c0180e.f2899a, round, c0180e.f2901c, c0180e.f2902d);
                    c0180e.f2904f = 0;
                    c0180e.f2905g = 0;
                    break;
                }
                break;
            case 1:
                C0180e c0180e2 = (C0180e) obj;
                PointF pointF2 = (PointF) obj2;
                c0180e2.getClass();
                c0180e2.f2901c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0180e2.f2902d = round2;
                int i2 = c0180e2.f2905g + 1;
                c0180e2.f2905g = i2;
                if (c0180e2.f2904f == i2) {
                    w.a(c0180e2.f2903e, c0180e2.f2899a, c0180e2.f2900b, c0180e2.f2901c, round2);
                    c0180e2.f2904f = 0;
                    c0180e2.f2905g = 0;
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
                w.f2963a.q((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
