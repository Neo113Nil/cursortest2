package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f2943a;

    public C0225b(ActionBarContainer actionBarContainer) {
        this.f2943a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2943a;
        if (actionBarContainer.f1140g) {
            Drawable drawable = actionBarContainer.f1139f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1138e;
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
        ActionBarContainer actionBarContainer = this.f2943a;
        if (actionBarContainer.f1140g) {
            if (actionBarContainer.f1139f != null) {
                actionBarContainer.d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.d;
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
