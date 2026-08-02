package j;

import B0.C0031i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class r extends ImageView {

    /* renamed from: e, reason: collision with root package name */
    public final C0238n f3031e;

    /* renamed from: f, reason: collision with root package name */
    public final C0031i f3032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i2) {
        super(context, null, i2);
        k0.a(context);
        C0238n c0238n = new C0238n(this);
        this.f3031e = c0238n;
        c0238n.b(null, i2);
        C0031i c0031i = new C0031i(this);
        this.f3032f = c0031i;
        c0031i.H(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0238n c0238n = this.f3031e;
        if (c0238n != null) {
            c0238n.a();
        }
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            c0031i.r();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0238n c0238n = this.f3031e;
        if (c0238n == null || (l0Var = c0238n.f3011e) == null) {
            return null;
        }
        return l0Var.f3000a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0238n c0238n = this.f3031e;
        if (c0238n == null || (l0Var = c0238n.f3011e) == null) {
            return null;
        }
        return l0Var.f3001b;
    }

    public ColorStateList getSupportImageTintList() {
        l0 l0Var;
        C0031i c0031i = this.f3032f;
        if (c0031i == null || (l0Var = (l0) c0031i.f155g) == null) {
            return null;
        }
        return l0Var.f3000a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l0 l0Var;
        C0031i c0031i = this.f3032f;
        if (c0031i == null || (l0Var = (l0) c0031i.f155g) == null) {
            return null;
        }
        return l0Var.f3001b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3032f.f154f).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0238n c0238n = this.f3031e;
        if (c0238n != null) {
            c0238n.f3009c = -1;
            c0238n.d(null);
            c0238n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0238n c0238n = this.f3031e;
        if (c0238n != null) {
            c0238n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            c0031i.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            c0031i.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            ImageView imageView = (ImageView) c0031i.f154f;
            if (i2 != 0) {
                Drawable c2 = d.b.c(imageView.getContext(), i2);
                if (c2 != null) {
                    A.b(c2);
                }
                imageView.setImageDrawable(c2);
            } else {
                imageView.setImageDrawable(null);
            }
            c0031i.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            c0031i.r();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0238n c0238n = this.f3031e;
        if (c0238n != null) {
            c0238n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0238n c0238n = this.f3031e;
        if (c0238n != null) {
            c0238n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            if (((l0) c0031i.f155g) == null) {
                c0031i.f155g = new l0();
            }
            l0 l0Var = (l0) c0031i.f155g;
            l0Var.f3000a = colorStateList;
            l0Var.f3003d = true;
            c0031i.r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0031i c0031i = this.f3032f;
        if (c0031i != null) {
            if (((l0) c0031i.f155g) == null) {
                c0031i.f155g = new l0();
            }
            l0 l0Var = (l0) c0031i.f155g;
            l0Var.f3001b = mode;
            l0Var.f3002c = true;
            c0031i.r();
        }
    }
}
