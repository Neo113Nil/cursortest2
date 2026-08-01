package L0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends I0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f568q;

    public g(I0.k kVar, RectF rectF) {
        super(kVar);
        this.f568q = rectF;
    }

    @Override // I0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f570x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f568q = gVar.f568q;
    }
}
