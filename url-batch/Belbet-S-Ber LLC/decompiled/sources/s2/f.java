package s2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends o2.h {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f3250q;

    public f(o2.o oVar, RectF rectF) {
        super(oVar);
        this.f3250q = rectF;
    }

    @Override // o2.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.L = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f3250q = fVar.f3250q;
    }
}
