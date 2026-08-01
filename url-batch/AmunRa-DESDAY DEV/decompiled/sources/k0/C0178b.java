package k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0178b(Class cls, String str, int i) {
        super(cls, str);
        this.f2693a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2693a) {
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
                return Float.valueOf(w.f2756a.h((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2693a) {
            case 0:
                C0181e c0181e = (C0181e) obj;
                PointF pointF = (PointF) obj2;
                c0181e.getClass();
                c0181e.f2696a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0181e.f2697b = round;
                int i = c0181e.f2700f + 1;
                c0181e.f2700f = i;
                if (i == c0181e.f2701g) {
                    w.a(c0181e.f2699e, c0181e.f2696a, round, c0181e.f2698c, c0181e.d);
                    c0181e.f2700f = 0;
                    c0181e.f2701g = 0;
                    break;
                }
                break;
            case 1:
                C0181e c0181e2 = (C0181e) obj;
                PointF pointF2 = (PointF) obj2;
                c0181e2.getClass();
                c0181e2.f2698c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0181e2.d = round2;
                int i2 = c0181e2.f2701g + 1;
                c0181e2.f2701g = i2;
                if (c0181e2.f2700f == i2) {
                    w.a(c0181e2.f2699e, c0181e2.f2696a, c0181e2.f2697b, c0181e2.f2698c, round2);
                    c0181e2.f2700f = 0;
                    c0181e2.f2701g = 0;
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
                w.f2756a.l((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
