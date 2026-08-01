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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class e5 extends ImageView {
    private final t3 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final d5 mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e60.a(context);
        this.mHasLevel = false;
        a60.a(this, getContext());
        t3 t3Var = new t3(this);
        this.mBackgroundTintHelper = t3Var;
        t3Var.d(attributeSet, i);
        d5 d5Var = new d5(this);
        this.mImageHelper = d5Var;
        d5Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            t3Var.a();
        }
        d5 d5Var = this.mImageHelper;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            return t3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            return t3Var.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        gc gcVar;
        d5 d5Var = this.mImageHelper;
        if (d5Var == null || (gcVar = d5Var.b) == null) {
            return null;
        }
        return (ColorStateList) gcVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        gc gcVar;
        d5 d5Var = this.mImageHelper;
        if (d5Var == null || (gcVar = d5Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) gcVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            t3Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            t3Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d5 d5Var = this.mImageHelper;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        d5 d5Var = this.mImageHelper;
        if (d5Var != null && drawable != null && !this.mHasLevel) {
            d5Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        d5 d5Var2 = this.mImageHelper;
        if (d5Var2 != null) {
            d5Var2.a();
            if (this.mHasLevel) {
                return;
            }
            d5 d5Var3 = this.mImageHelper;
            ImageView imageView = d5Var3.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(d5Var3.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        d5 d5Var = this.mImageHelper;
        if (d5Var != null) {
            d5Var.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d5 d5Var = this.mImageHelper;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            t3Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t3 t3Var = this.mBackgroundTintHelper;
        if (t3Var != null) {
            t3Var.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d5 d5Var = this.mImageHelper;
        if (d5Var != null) {
            if (d5Var.b == null) {
                d5Var.b = new gc();
            }
            gc gcVar = d5Var.b;
            gcVar.c = colorStateList;
            gcVar.b = true;
            d5Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d5 d5Var = this.mImageHelper;
        if (d5Var != null) {
            if (d5Var.b == null) {
                d5Var.b = new gc();
            }
            gc gcVar = d5Var.b;
            gcVar.d = mode;
            gcVar.a = true;
            d5Var.a();
        }
    }
}
