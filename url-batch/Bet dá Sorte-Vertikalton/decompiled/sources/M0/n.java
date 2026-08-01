package M0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f543c;
    public final /* synthetic */ Matrix d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f543c = arrayList;
        this.d = matrix;
    }

    @Override // M0.t
    public final void a(Matrix matrix, L0.a aVar, int i, Canvas canvas) {
        Iterator it = this.f543c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.d, aVar, i, canvas);
        }
    }
}
