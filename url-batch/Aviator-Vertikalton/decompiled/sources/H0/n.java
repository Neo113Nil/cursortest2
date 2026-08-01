package H0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f326d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f325c = arrayList;
        this.f326d = matrix;
    }

    @Override // H0.t
    public final void a(Matrix matrix, G0.a aVar, int i, Canvas canvas) {
        Iterator it = this.f325c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f326d, aVar, i, canvas);
        }
    }
}
