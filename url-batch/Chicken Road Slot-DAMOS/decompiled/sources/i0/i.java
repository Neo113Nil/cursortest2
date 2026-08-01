package i0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import k1.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4580d;

    /* renamed from: e, reason: collision with root package name */
    public p f4581e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4582i;

    public i(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f4580d = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f4580d) {
            this.f4582i = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f4582i = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f4582i;
    }
}
