package e1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f37285a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f37286b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37287c;

    public k(PointF pointF, boolean z8, List list) {
        this.f37286b = pointF;
        this.f37287c = z8;
        this.f37285a = new ArrayList(list);
    }

    public final void a(float f6, float f9) {
        if (this.f37286b == null) {
            this.f37286b = new PointF();
        }
        this.f37286b.set(f6, f9);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f37285a.size() + "closed=" + this.f37287c + '}';
    }

    public k() {
        this.f37285a = new ArrayList();
    }
}
