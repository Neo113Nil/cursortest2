package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class to2 extends RippleDrawable {
    public hl OPXfSBeufaJ8;
    public final boolean rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public to2(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.rtx2ld2ELZv4 = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.rtx2ld2ELZv4) {
            this.wdg6QnbFHrFF = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.wdg6QnbFHrFF = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.wdg6QnbFHrFF;
    }
}
