package K0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends H0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f496q;

    public g(H0.k kVar, RectF rectF) {
        super(kVar);
        this.f496q = rectF;
    }

    @Override // H0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f498x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f496q = gVar.f496q;
    }
}
