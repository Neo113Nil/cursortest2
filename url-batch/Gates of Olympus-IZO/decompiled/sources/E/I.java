package E;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import b0.C0288u;

/* loaded from: classes.dex */
public final class I extends RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f627d;

    /* renamed from: e, reason: collision with root package name */
    public C0288u f628e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f630g;

    public I(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f627d = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f627d) {
            this.f630g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f630g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f630g;
    }
}
