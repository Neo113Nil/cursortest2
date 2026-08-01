package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class x4 extends ImageView {
    public final y1 f;
    public final w4 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g90.a(context);
        this.h = false;
        z80.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, i);
        w4 w4Var = new w4(this);
        this.g = w4Var;
        w4Var.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        w4 w4Var = this.g;
        if (w4Var != null) {
            w4Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        cd cdVar;
        w4 w4Var = this.g;
        if (w4Var == null || (cdVar = (cd) w4Var.d) == null) {
            return null;
        }
        return (ColorStateList) cdVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        cd cdVar;
        w4 w4Var = this.g;
        if (w4Var == null || (cdVar = (cd) w4Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) cdVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        w4 w4Var = this.g;
        if (w4Var != null) {
            w4Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        w4 w4Var = this.g;
        if (w4Var != null && drawable != null && !this.h) {
            w4Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (w4Var != null) {
            w4Var.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) w4Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(w4Var.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        w4 w4Var = this.g;
        if (w4Var != null) {
            ImageView imageView = (ImageView) w4Var.c;
            if (i != 0) {
                Drawable m = mz.m(imageView.getContext(), i);
                if (m != null) {
                    gi.a(m);
                }
                imageView.setImageDrawable(m);
            } else {
                imageView.setImageDrawable(null);
            }
            w4Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        w4 w4Var = this.g;
        if (w4Var != null) {
            w4Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        w4 w4Var = this.g;
        if (w4Var != null) {
            if (((cd) w4Var.d) == null) {
                w4Var.d = new cd();
            }
            cd cdVar = (cd) w4Var.d;
            cdVar.c = colorStateList;
            cdVar.b = true;
            w4Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        w4 w4Var = this.g;
        if (w4Var != null) {
            if (((cd) w4Var.d) == null) {
                w4Var.d = new cd();
            }
            cd cdVar = (cd) w4Var.d;
            cdVar.d = mode;
            cdVar.a = true;
            w4Var.a();
        }
    }
}
