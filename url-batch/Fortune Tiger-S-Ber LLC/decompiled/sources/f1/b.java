package f1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i4) {
        super(cls, str);
        this.f1656a = i4;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1656a) {
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
                return Float.valueOf(y.f1726a.A((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1656a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f1663a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f1664b = round;
                int i4 = eVar.f1667f + 1;
                eVar.f1667f = i4;
                if (i4 == eVar.g) {
                    y.a(eVar.f1666e, eVar.f1663a, round, eVar.c, eVar.f1665d);
                    eVar.f1667f = 0;
                    eVar.g = 0;
                    break;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f1665d = round2;
                int i5 = eVar2.g + 1;
                eVar2.g = i5;
                if (eVar2.f1667f == i5) {
                    y.a(eVar2.f1666e, eVar2.f1663a, eVar2.f1664b, eVar2.c, round2);
                    eVar2.f1667f = 0;
                    eVar2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                y.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                y.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                y.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                y.f1726a.U((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
