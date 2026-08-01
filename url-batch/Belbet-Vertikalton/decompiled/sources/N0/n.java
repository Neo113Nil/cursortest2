package N0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f949d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f948c = arrayList;
        this.f949d = matrix;
    }

    @Override // N0.t
    public final void a(Matrix matrix, M0.a aVar, int i, Canvas canvas) {
        Iterator it = this.f948c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f949d, aVar, i, canvas);
        }
    }
}
