package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f3336a;

    public C0250b(ActionBarContainer actionBarContainer) {
        this.f3336a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3336a;
        if (actionBarContainer.f987g) {
            Drawable drawable = actionBarContainer.f986f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f984d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f985e;
        if (drawable3 == null || !actionBarContainer.h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3336a;
        if (actionBarContainer.f987g) {
            if (actionBarContainer.f986f != null) {
                actionBarContainer.f984d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f984d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
