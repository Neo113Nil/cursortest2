package c5;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1652a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i) {
        super(cls, str);
        this.f1652a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1652a) {
            case 0:
                return null;
            case 1:
                return null;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return null;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return null;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return null;
            case 5:
                return Float.valueOf(z.f1741a.n((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1652a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f1655a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f1656b = round;
                int i = eVar.f1660f + 1;
                eVar.f1660f = i;
                if (i == eVar.f1661g) {
                    z.a(eVar.f1659e, eVar.f1655a, round, eVar.f1657c, eVar.f1658d);
                    eVar.f1660f = 0;
                    eVar.f1661g = 0;
                    break;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f1657c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f1658d = round2;
                int i8 = eVar2.f1661g + 1;
                eVar2.f1661g = i8;
                if (eVar2.f1660f == i8) {
                    z.a(eVar2.f1659e, eVar2.f1655a, eVar2.f1656b, eVar2.f1657c, round2);
                    eVar2.f1660f = 0;
                    eVar2.f1661g = 0;
                    break;
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                z.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                z.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                z.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                z.f1741a.y((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
