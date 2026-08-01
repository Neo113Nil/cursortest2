package m;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import m0.C0261d;

/* loaded from: classes.dex */
public final class V0 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3001a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(Class cls, String str, int i) {
        super(cls, str);
        this.f3001a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3001a) {
            case 0:
                return Float.valueOf(((W0) obj).f3043z);
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
                return Float.valueOf(m0.v.f3311a.m((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3001a) {
            case 0:
                ((W0) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                C0261d c0261d = (C0261d) obj;
                PointF pointF = (PointF) obj2;
                c0261d.getClass();
                c0261d.f3249a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0261d.f3250b = round;
                int i = c0261d.f3253f + 1;
                c0261d.f3253f = i;
                if (i == c0261d.f3254g) {
                    m0.v.a(c0261d.f3252e, c0261d.f3249a, round, c0261d.f3251c, c0261d.d);
                    c0261d.f3253f = 0;
                    c0261d.f3254g = 0;
                    break;
                }
                break;
            case 2:
                C0261d c0261d2 = (C0261d) obj;
                PointF pointF2 = (PointF) obj2;
                c0261d2.getClass();
                c0261d2.f3251c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0261d2.d = round2;
                int i2 = c0261d2.f3254g + 1;
                c0261d2.f3254g = i2;
                if (c0261d2.f3253f == i2) {
                    m0.v.a(c0261d2.f3252e, c0261d2.f3249a, c0261d2.f3250b, c0261d2.f3251c, round2);
                    c0261d2.f3253f = 0;
                    c0261d2.f3254g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                m0.v.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                m0.v.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                m0.v.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 6:
                float floatValue = ((Float) obj2).floatValue();
                m0.v.f3311a.r((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
