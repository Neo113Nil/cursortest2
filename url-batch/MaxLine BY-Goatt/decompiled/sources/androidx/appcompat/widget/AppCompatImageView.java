package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.e10;
import defpackage.he0;
import defpackage.j8;
import defpackage.te;
import defpackage.vx2;
import defpackage.xw2;
import defpackage.yf;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final te m;
    public final yf n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.a(context);
        this.o = false;
        xw2.a(this, getContext());
        te teVar = new te(this);
        this.m = teVar;
        teVar.e(attributeSet, i);
        yf yfVar = new yf(this);
        this.n = yfVar;
        yfVar.i(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.m;
        if (teVar != null) {
            teVar.a();
        }
        yf yfVar = this.n;
        if (yfVar != null) {
            yfVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e10 e10Var;
        yf yfVar = this.n;
        if (yfVar == null || (e10Var = (e10) yfVar.p) == null) {
            return null;
        }
        return (ColorStateList) e10Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e10 e10Var;
        yf yfVar = this.n;
        if (yfVar == null || (e10Var = (e10) yfVar.p) == null) {
            return null;
        }
        return (PorterDuff.Mode) e10Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.n.o).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.m;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.m;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        yf yfVar = this.n;
        if (yfVar != null) {
            yfVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        yf yfVar = this.n;
        if (yfVar != null && drawable != null && !this.o) {
            yfVar.n = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (yfVar != null) {
            yfVar.c();
            if (this.o) {
                return;
            }
            ImageView imageView = (ImageView) yfVar.o;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(yfVar.n);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.o = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        yf yfVar = this.n;
        if (yfVar != null) {
            ImageView imageView = (ImageView) yfVar.o;
            if (i != 0) {
                Drawable F = j8.F(imageView.getContext(), i);
                if (F != null) {
                    he0.a(F);
                }
                imageView.setImageDrawable(F);
            } else {
                imageView.setImageDrawable(null);
            }
            yfVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        yf yfVar = this.n;
        if (yfVar != null) {
            yfVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        yf yfVar = this.n;
        if (yfVar != null) {
            if (((e10) yfVar.p) == null) {
                yfVar.p = new e10();
            }
            e10 e10Var = (e10) yfVar.p;
            e10Var.c = colorStateList;
            e10Var.b = true;
            yfVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        yf yfVar = this.n;
        if (yfVar != null) {
            if (((e10) yfVar.p) == null) {
                yfVar.p = new e10();
            }
            e10 e10Var = (e10) yfVar.p;
            e10Var.d = mode;
            e10Var.a = true;
            yfVar.c();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
