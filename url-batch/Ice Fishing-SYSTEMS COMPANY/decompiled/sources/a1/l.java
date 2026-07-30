package a1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import k1.C4628a;

/* loaded from: classes.dex */
public final class l extends C4628a {

    /* renamed from: q, reason: collision with root package name */
    public Path f4320q;

    /* renamed from: r, reason: collision with root package name */
    public final C4628a f4321r;

    public l(X0.i iVar, C4628a c4628a) {
        super(iVar, (PointF) c4628a.f38672b, (PointF) c4628a.f38673c, c4628a.f38674d, c4628a.f38675e, c4628a.f38676f, c4628a.f38677g, c4628a.f38678h);
        this.f4321r = c4628a;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f38673c;
        Object obj3 = this.f38672b;
        boolean z8 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f38673c) == null || z8) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C4628a c4628a = this.f4321r;
        PointF pointF3 = c4628a.f38684o;
        PointF pointF4 = c4628a.f38685p;
        Matrix matrix = j1.j.f38533a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f6 = pointF3.x + pointF.x;
            float f9 = pointF.y + pointF3.y;
            float f10 = pointF2.x;
            float f11 = f10 + pointF4.x;
            float f12 = pointF2.y;
            path.cubicTo(f6, f9, f11, f12 + pointF4.y, f10, f12);
        }
        this.f4320q = path;
    }
}
