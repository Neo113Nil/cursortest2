package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class foj extends fop {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public foj(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.fop
    public final void a(Matrix matrix, fns fnsVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fop) it.next()).a(this.b, fnsVar, i, canvas);
        }
    }
}
