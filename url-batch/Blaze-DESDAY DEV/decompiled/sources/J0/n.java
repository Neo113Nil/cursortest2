package J0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f400c;
    public final /* synthetic */ Matrix d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f400c = arrayList;
        this.d = matrix;
    }

    @Override // J0.t
    public final void a(Matrix matrix, I0.a aVar, int i, Canvas canvas) {
        Iterator it = this.f400c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.d, aVar, i, canvas);
        }
    }
}
