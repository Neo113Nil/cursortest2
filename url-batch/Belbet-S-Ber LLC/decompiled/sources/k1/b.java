package k1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i) {
        super(cls, str);
        this.f2306a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2306a) {
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
                return Float.valueOf(x.f2379a.A((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2306a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f2313a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f2314b = round;
                int i = eVar.f2317f + 1;
                eVar.f2317f = i;
                if (i == eVar.f2318g) {
                    x.a(eVar.f2316e, eVar.f2313a, round, eVar.f2315c, eVar.d);
                    eVar.f2317f = 0;
                    eVar.f2318g = 0;
                    break;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f2315c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.d = round2;
                int i4 = eVar2.f2318g + 1;
                eVar2.f2318g = i4;
                if (eVar2.f2317f == i4) {
                    x.a(eVar2.f2316e, eVar2.f2313a, eVar2.f2314b, eVar2.f2315c, round2);
                    eVar2.f2317f = 0;
                    eVar2.f2318g = 0;
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
                x.f2379a.T((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
