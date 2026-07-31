package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes.dex */
class c extends d {
    protected c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.d
    void c(int i4, int i5, int i6, Rect rect, Rect rect2) {
        Gravity.apply(i4, i5, i6, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        h();
        outline.setRoundRect(this.f11797h, b());
    }
}
