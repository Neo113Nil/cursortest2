package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ce extends pt {
    public final RectF q;

    public ce(ce ceVar) {
        super(ceVar);
        this.q = ceVar.q;
    }

    @Override // defpackage.pt, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        de deVar = new de(this);
        deVar.L = this;
        deVar.invalidateSelf();
        return deVar;
    }

    public ce(n20 n20Var, RectF rectF) {
        super(n20Var);
        this.q = rectF;
    }
}
