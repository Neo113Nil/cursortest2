package C;

import Z.C0323u;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes.dex */
public final class H extends RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1057d;

    /* renamed from: e, reason: collision with root package name */
    public C0323u f1058e;

    /* renamed from: i, reason: collision with root package name */
    public Integer f1059i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1060j;

    public H(boolean z4) {
        super(ColorStateList.valueOf(-16777216), null, z4 ? new ColorDrawable(-1) : null);
        this.f1057d = z4;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f1057d) {
            this.f1060j = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1060j = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f1060j;
    }
}
