package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class fop {
    static final Matrix c = new Matrix();
    final Matrix d = new Matrix();

    public abstract void a(Matrix matrix, fns fnsVar, int i, Canvas canvas);

    public final void c(fns fnsVar, int i, Canvas canvas) {
        a(c, fnsVar, i, canvas);
    }
}
