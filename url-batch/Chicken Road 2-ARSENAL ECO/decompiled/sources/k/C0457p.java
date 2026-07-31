package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.strategylink.Row.Five.R;
import h.AbstractC0401a;
import u0.C0673c;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457p extends ImageButton {

    /* renamed from: f, reason: collision with root package name */
    public final C0455n f5076f;

    /* renamed from: g, reason: collision with root package name */
    public final C0673c f5077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0457p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        l0.a(context);
        k0.a(this, getContext());
        C0455n c0455n = new C0455n(this);
        this.f5076f = c0455n;
        c0455n.b(null, R.attr.toolbarNavigationButtonStyle);
        C0673c c0673c = new C0673c(this);
        this.f5077g = c0673c;
        c0673c.h(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0455n c0455n = this.f5076f;
        if (c0455n != null) {
            c0455n.a();
        }
        C0673c c0673c = this.f5077g;
        if (c0673c != null) {
            c0673c.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        X5.h hVar;
        C0455n c0455n = this.f5076f;
        if (c0455n == null || (hVar = c0455n.f5066e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2938c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        X5.h hVar;
        C0455n c0455n = this.f5076f;
        if (c0455n == null || (hVar = c0455n.f5066e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2939d;
    }

    public ColorStateList getSupportImageTintList() {
        X5.h hVar;
        C0673c c0673c = this.f5077g;
        if (c0673c == null || (hVar = (X5.h) c0673c.f5969g) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2938c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        X5.h hVar;
        C0673c c0673c = this.f5077g;
        if (c0673c == null || (hVar = (X5.h) c0673c.f5969g) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2939d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f5077g.f5968f).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0455n c0455n = this.f5076f;
        if (c0455n != null) {
            c0455n.f5064c = -1;
            c0455n.d(null);
            c0455n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0455n c0455n = this.f5076f;
        if (c0455n != null) {
            c0455n.c(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0673c c0673c = this.f5077g;
        if (c0673c != null) {
            c0673c.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0673c c0673c = this.f5077g;
        if (c0673c != null) {
            c0673c.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        C0673c c0673c = this.f5077g;
        ImageView imageView = (ImageView) c0673c.f5968f;
        if (i7 != 0) {
            Drawable a7 = AbstractC0401a.a(imageView.getContext(), i7);
            if (a7 != null) {
                int i8 = AbstractC0441C.f4894a;
            }
            imageView.setImageDrawable(a7);
        } else {
            imageView.setImageDrawable(null);
        }
        c0673c.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0673c c0673c = this.f5077g;
        if (c0673c != null) {
            c0673c.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0455n c0455n = this.f5076f;
        if (c0455n != null) {
            c0455n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0455n c0455n = this.f5076f;
        if (c0455n != null) {
            c0455n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0673c c0673c = this.f5077g;
        if (c0673c != null) {
            if (((X5.h) c0673c.f5969g) == null) {
                c0673c.f5969g = new X5.h();
            }
            X5.h hVar = (X5.h) c0673c.f5969g;
            hVar.f2938c = colorStateList;
            hVar.f2937b = true;
            c0673c.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0673c c0673c = this.f5077g;
        if (c0673c != null) {
            if (((X5.h) c0673c.f5969g) == null) {
                c0673c.f5969g = new X5.h();
            }
            X5.h hVar = (X5.h) c0673c.f5969g;
            hVar.f2939d = mode;
            hVar.f2936a = true;
            c0673c.c();
        }
    }
}
