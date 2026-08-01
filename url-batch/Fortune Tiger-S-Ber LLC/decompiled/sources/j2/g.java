package j2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends g2.h {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f2312q;

    public g(g2.o oVar, RectF rectF) {
        super(oVar);
        this.f2312q = rectF;
    }

    @Override // g2.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.L = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f2312q = gVar.f2312q;
    }
}
