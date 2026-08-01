package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qf extends bw {
    public final RectF q;

    public qf(qf qfVar) {
        super(qfVar);
        this.q = qfVar.q;
    }

    @Override // defpackage.bw, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        rf rfVar = new rf(this);
        rfVar.M = this;
        rfVar.invalidateSelf();
        return rfVar;
    }

    public qf(f50 f50Var, RectF rectF) {
        super(f50Var);
        this.q = rectF;
    }
}
