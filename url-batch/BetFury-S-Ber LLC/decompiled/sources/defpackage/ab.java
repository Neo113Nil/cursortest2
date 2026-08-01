package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ab extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
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
                return Float.valueOf(cn0.a.g((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                db dbVar = (db) obj;
                PointF pointF = (PointF) obj2;
                dbVar.getClass();
                dbVar.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                dbVar.b = round;
                int i = dbVar.f + 1;
                dbVar.f = i;
                if (i == dbVar.g) {
                    cn0.a(dbVar.e, dbVar.a, round, dbVar.c, dbVar.d);
                    dbVar.f = 0;
                    dbVar.g = 0;
                    break;
                }
                break;
            case 1:
                db dbVar2 = (db) obj;
                PointF pointF2 = (PointF) obj2;
                dbVar2.getClass();
                dbVar2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                dbVar2.d = round2;
                int i2 = dbVar2.g + 1;
                dbVar2.g = i2;
                if (dbVar2.f == i2) {
                    cn0.a(dbVar2.e, dbVar2.a, dbVar2.b, dbVar2.c, round2);
                    dbVar2.f = 0;
                    dbVar2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                cn0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                cn0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                cn0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                cn0.a.j((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
