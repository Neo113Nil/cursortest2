package l0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0257b(Class cls, String str, int i) {
        super(cls, str);
        this.f3081a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3081a) {
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
                return Float.valueOf(w.f3144a.l((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3081a) {
            case 0:
                C0260e c0260e = (C0260e) obj;
                PointF pointF = (PointF) obj2;
                c0260e.getClass();
                c0260e.f3084a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0260e.f3085b = round;
                int i = c0260e.f3088f + 1;
                c0260e.f3088f = i;
                if (i == c0260e.f3089g) {
                    w.a(c0260e.f3087e, c0260e.f3084a, round, c0260e.f3086c, c0260e.d);
                    c0260e.f3088f = 0;
                    c0260e.f3089g = 0;
                    break;
                }
                break;
            case 1:
                C0260e c0260e2 = (C0260e) obj;
                PointF pointF2 = (PointF) obj2;
                c0260e2.getClass();
                c0260e2.f3086c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0260e2.d = round2;
                int i2 = c0260e2.f3089g + 1;
                c0260e2.f3089g = i2;
                if (c0260e2.f3088f == i2) {
                    w.a(c0260e2.f3087e, c0260e2.f3084a, c0260e2.f3085b, c0260e2.f3086c, round2);
                    c0260e2.f3088f = 0;
                    c0260e2.f3089g = 0;
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
                w.f3144a.q((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
