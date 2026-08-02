package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqg extends fnz {
    public final RectF w;

    public fqg(fqg fqgVar) {
        super(fqgVar);
        this.w = fqgVar.w;
    }

    @Override // defpackage.fnz, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = fqi.b;
        fqh fqhVar = new fqh(this);
        fqhVar.invalidateSelf();
        return fqhVar;
    }

    public fqg(fog fogVar, RectF rectF) {
        super(fogVar);
        this.w = rectF;
    }
}
