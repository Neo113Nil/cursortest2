package l;

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

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0253y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0235p f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3089b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S0.a(context);
        this.f3090c = false;
        R0.a(this, getContext());
        C0235p c0235p = new C0235p(this);
        this.f3088a = c0235p;
        c0235p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3089b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            c0235p.a();
        }
        B.d dVar = this.f3089b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            return c0235p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            return c0235p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        T0 t02;
        B.d dVar = this.f3089b;
        if (dVar == null || (t02 = (T0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) t02.f2921c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        T0 t02;
        B.d dVar = this.f3089b;
        if (dVar == null || (t02 = (T0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) t02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3089b.f14c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            c0235p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            c0235p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3089b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3089b;
        if (dVar != null && drawable != null && !this.f3090c) {
            dVar.f13b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3090c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f14c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f13b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3090c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3089b;
        ImageView imageView = (ImageView) dVar.f14c;
        if (i != 0) {
            Drawable z2 = x1.l.z(imageView.getContext(), i);
            if (z2 != null) {
                AbstractC0230m0.a(z2);
            }
            imageView.setImageDrawable(z2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3089b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            c0235p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235p c0235p = this.f3088a;
        if (c0235p != null) {
            c0235p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3089b;
        if (dVar != null) {
            if (((T0) dVar.d) == null) {
                dVar.d = new T0();
            }
            T0 t02 = (T0) dVar.d;
            t02.f2921c = colorStateList;
            t02.f2920b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3089b;
        if (dVar != null) {
            if (((T0) dVar.d) == null) {
                dVar.d = new T0();
            }
            T0 t02 = (T0) dVar.d;
            t02.d = mode;
            t02.f2919a = true;
            dVar.a();
        }
    }
}
