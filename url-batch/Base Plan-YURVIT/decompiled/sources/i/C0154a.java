package i;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f2184a;

    public C0154a(ActionBarContainer actionBarContainer) {
        this.f2184a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2184a;
        if (actionBarContainer.f1211k) {
            Drawable drawable = actionBarContainer.f1210j;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1208h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1209i;
        if (drawable3 == null || !actionBarContainer.f1212l) {
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
        ActionBarContainer actionBarContainer = this.f2184a;
        if (actionBarContainer.f1211k) {
            Drawable drawable = actionBarContainer.f1210j;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1208h;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
