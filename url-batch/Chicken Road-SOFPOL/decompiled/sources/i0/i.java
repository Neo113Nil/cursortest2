package i0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import f1.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3287d;

    /* renamed from: e, reason: collision with root package name */
    public s f3288e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f3289f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3290g;

    public i(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f3287d = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f3287d) {
            this.f3290g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f3290g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f3290g;
    }
}
