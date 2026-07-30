package c0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends RippleDrawable {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1519f;

    /* renamed from: g, reason: collision with root package name */
    public z0.u f1520g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f1521h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1522i;

    public y(boolean z8) {
        super(ColorStateList.valueOf(-16777216), null, z8 ? new ColorDrawable(-1) : null);
        this.f1519f = z8;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f1519f) {
            this.f1522i = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1522i = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f1522i;
    }
}
