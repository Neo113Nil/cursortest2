package k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0179b(Class cls, String str, int i) {
        super(cls, str);
        this.f2753a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2753a) {
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
                return Float.valueOf(AbstractC0200w.f2816a.j((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2753a) {
            case 0:
                C0182e c0182e = (C0182e) obj;
                PointF pointF = (PointF) obj2;
                c0182e.getClass();
                c0182e.f2756a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0182e.f2757b = round;
                int i = c0182e.f2760f + 1;
                c0182e.f2760f = i;
                if (i == c0182e.f2761g) {
                    AbstractC0200w.a(c0182e.f2759e, c0182e.f2756a, round, c0182e.f2758c, c0182e.d);
                    c0182e.f2760f = 0;
                    c0182e.f2761g = 0;
                    break;
                }
                break;
            case 1:
                C0182e c0182e2 = (C0182e) obj;
                PointF pointF2 = (PointF) obj2;
                c0182e2.getClass();
                c0182e2.f2758c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0182e2.d = round2;
                int i2 = c0182e2.f2761g + 1;
                c0182e2.f2761g = i2;
                if (c0182e2.f2760f == i2) {
                    AbstractC0200w.a(c0182e2.f2759e, c0182e2.f2756a, c0182e2.f2757b, c0182e2.f2758c, round2);
                    c0182e2.f2760f = 0;
                    c0182e2.f2761g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0200w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0200w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC0200w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                AbstractC0200w.f2816a.r((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
