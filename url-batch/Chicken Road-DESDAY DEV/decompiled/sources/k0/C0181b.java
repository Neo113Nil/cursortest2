package k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2703a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0181b(Class cls, String str, int i) {
        super(cls, str);
        this.f2703a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2703a) {
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
                return Float.valueOf(x.f2769a.k((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2703a) {
            case 0:
                C0184e c0184e = (C0184e) obj;
                PointF pointF = (PointF) obj2;
                c0184e.getClass();
                c0184e.f2706a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0184e.f2707b = round;
                int i = c0184e.f2710f + 1;
                c0184e.f2710f = i;
                if (i == c0184e.f2711g) {
                    x.a(c0184e.f2709e, c0184e.f2706a, round, c0184e.f2708c, c0184e.d);
                    c0184e.f2710f = 0;
                    c0184e.f2711g = 0;
                    break;
                }
                break;
            case 1:
                C0184e c0184e2 = (C0184e) obj;
                PointF pointF2 = (PointF) obj2;
                c0184e2.getClass();
                c0184e2.f2708c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0184e2.d = round2;
                int i2 = c0184e2.f2711g + 1;
                c0184e2.f2711g = i2;
                if (c0184e2.f2710f == i2) {
                    x.a(c0184e2.f2709e, c0184e2.f2706a, c0184e2.f2707b, c0184e2.f2708c, round2);
                    c0184e2.f2710f = 0;
                    c0184e2.f2711g = 0;
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
                x.f2769a.s((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
