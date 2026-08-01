package N0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends K0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f652q;

    public g(K0.k kVar, RectF rectF) {
        super(kVar);
        this.f652q = rectF;
    }

    @Override // K0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f654x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f652q = gVar.f652q;
    }
}
