package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ce extends at {
    public final RectF q;

    public ce(ce ceVar) {
        super(ceVar);
        this.q = ceVar.q;
    }

    @Override // defpackage.at, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        de deVar = new de(this);
        deVar.M = this;
        deVar.invalidateSelf();
        return deVar;
    }

    public ce(d20 d20Var, RectF rectF) {
        super(d20Var);
        this.q = rectF;
    }
}
