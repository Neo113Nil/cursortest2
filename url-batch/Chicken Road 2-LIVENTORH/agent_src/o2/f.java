package o2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends l2.h {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f2889r;

    public f(l2.n nVar, RectF rectF) {
        super(nVar);
        this.f2889r = rectF;
    }

    @Override // l2.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.L = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f2889r = fVar.f2889r;
    }
}
