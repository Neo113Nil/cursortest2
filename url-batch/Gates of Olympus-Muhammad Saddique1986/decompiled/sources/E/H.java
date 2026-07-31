package E;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import b0.C0352v;

/* loaded from: classes.dex */
public final class H extends RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f928d;

    /* renamed from: e, reason: collision with root package name */
    public C0352v f929e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f931g;

    public H(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f928d = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f928d) {
            this.f931g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f931g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f931g;
    }
}
