package O0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f575c;
    public final /* synthetic */ Matrix d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f575c = arrayList;
        this.d = matrix;
    }

    @Override // O0.t
    public final void a(Matrix matrix, N0.a aVar, int i, Canvas canvas) {
        Iterator it = this.f575c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.d, aVar, i, canvas);
        }
    }
}
