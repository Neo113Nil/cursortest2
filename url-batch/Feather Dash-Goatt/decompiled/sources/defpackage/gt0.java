package defpackage;

import android.graphics.RectF;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gt0 extends ka0 {
    public final c6 a;

    public gt0(c6 c6Var) {
        this.a = c6Var;
    }

    @Override // defpackage.ka0
    public final s11 p() {
        c6 c6Var = this.a;
        if (c6Var.b == null) {
            c6Var.b = new RectF();
        }
        RectF rectF = c6Var.b;
        rectF.getClass();
        c6Var.a.computeBounds(rectF, true);
        return new s11(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
