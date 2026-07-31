package z5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends w5.h {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f9195r;

    public g(w5.n nVar, RectF rectF) {
        super(nVar);
        this.f9195r = rectF;
    }

    @Override // w5.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.J = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f9195r = gVar.f9195r;
    }
}
