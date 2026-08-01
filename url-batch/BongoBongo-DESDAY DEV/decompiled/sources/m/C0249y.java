package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import h.AbstractC0112a;

/* renamed from: m.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0249y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final C.d f3211b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Y0.a(context);
        this.f3212c = false;
        X0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f3210a = c0231p;
        c0231p.d(attributeSet, i);
        C.d dVar = new C.d(this);
        this.f3211b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            c0231p.a();
        }
        C.d dVar = this.f3211b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        Z0 z02;
        C.d dVar = this.f3211b;
        if (dVar == null || (z02 = (Z0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) z02.f3064c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Z0 z02;
        C.d dVar = this.f3211b;
        if (dVar == null || (z02 = (Z0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) z02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3211b.f75c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C.d dVar = this.f3211b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C.d dVar = this.f3211b;
        if (dVar != null && drawable != null && !this.f3212c) {
            dVar.f74b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3212c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f75c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f74b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3212c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C.d dVar = this.f3211b;
        ImageView imageView = (ImageView) dVar.f75c;
        if (i != 0) {
            Drawable l2 = AbstractC0112a.l(imageView.getContext(), i);
            if (l2 != null) {
                AbstractC0234q0.a(l2);
            }
            imageView.setImageDrawable(l2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C.d dVar = this.f3211b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3210a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C.d dVar = this.f3211b;
        if (dVar != null) {
            if (((Z0) dVar.d) == null) {
                dVar.d = new Z0();
            }
            Z0 z02 = (Z0) dVar.d;
            z02.f3064c = colorStateList;
            z02.f3063b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C.d dVar = this.f3211b;
        if (dVar != null) {
            if (((Z0) dVar.d) == null) {
                dVar.d = new Z0();
            }
            Z0 z02 = (Z0) dVar.d;
            z02.d = mode;
            z02.f3062a = true;
            dVar.a();
        }
    }
}
