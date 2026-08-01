package j1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i) {
        super(cls, str);
        this.f1894a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1894a) {
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
                return Float.valueOf(y.f1970a.I((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1894a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f1901a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f1902b = round;
                int i = eVar.f1905f + 1;
                eVar.f1905f = i;
                if (i == eVar.f1906g) {
                    y.a(eVar.f1904e, eVar.f1901a, round, eVar.f1903c, eVar.d);
                    eVar.f1905f = 0;
                    eVar.f1906g = 0;
                    break;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f1903c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.d = round2;
                int i4 = eVar2.f1906g + 1;
                eVar2.f1906g = i4;
                if (eVar2.f1905f == i4) {
                    y.a(eVar2.f1904e, eVar2.f1901a, eVar2.f1902b, eVar2.f1903c, round2);
                    eVar2.f1905f = 0;
                    eVar2.f1906g = 0;
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
                y.f1970a.m0((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
