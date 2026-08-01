package R0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends O0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f666q;

    public g(O0.k kVar, RectF rectF) {
        super(kVar);
        this.f666q = rectF;
    }

    @Override // O0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f668x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f666q = gVar.f666q;
    }
}
