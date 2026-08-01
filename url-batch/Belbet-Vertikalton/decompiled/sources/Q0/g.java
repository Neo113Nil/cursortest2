package Q0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends N0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1018q;

    public g(N0.k kVar, RectF rectF) {
        super(kVar);
        this.f1018q = rectF;
    }

    @Override // N0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1020x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1018q = gVar.f1018q;
    }
}
