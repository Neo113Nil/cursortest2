package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class oh extends e10 {
    public final RectF q;

    public oh(oh ohVar) {
        super(ohVar);
        this.q = ohVar.q;
    }

    @Override // defpackage.e10, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ph phVar = new ph(this);
        phVar.M = this;
        phVar.invalidateSelf();
        return phVar;
    }

    public oh(gd0 gd0Var, RectF rectF) {
        super(gd0Var);
        this.q = rectF;
    }
}
