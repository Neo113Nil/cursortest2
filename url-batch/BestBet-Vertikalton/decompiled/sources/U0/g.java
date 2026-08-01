package U0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends R0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1146q;

    public g(R0.k kVar, RectF rectF) {
        super(kVar);
        this.f1146q = rectF;
    }

    @Override // R0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1148x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1146q = gVar.f1146q;
    }
}
