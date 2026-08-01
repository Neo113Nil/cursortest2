package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0247y extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3069b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f3070c = false;
        Q0.a(this, getContext());
        C0229p c0229p = new C0229p(this);
        this.f3068a = c0229p;
        c0229p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3069b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            c0229p.a();
        }
        B.d dVar = this.f3069b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        S0 s02;
        B.d dVar = this.f3069b;
        if (dVar == null || (s02 = (S0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) s02.f2900c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        S0 s02;
        B.d dVar = this.f3069b;
        if (dVar == null || (s02 = (S0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) s02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3069b.f42c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3069b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3069b;
        if (dVar != null && drawable != null && !this.f3070c) {
            dVar.f41b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3070c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f42c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f41b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3070c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3069b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f42c;
            if (i != 0) {
                Drawable D2 = u1.d.D(imageView.getContext(), i);
                if (D2 != null) {
                    AbstractC0222l0.a(D2);
                }
                imageView.setImageDrawable(D2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3069b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f3068a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3069b;
        if (dVar != null) {
            if (((S0) dVar.d) == null) {
                dVar.d = new S0();
            }
            S0 s02 = (S0) dVar.d;
            s02.f2900c = colorStateList;
            s02.f2899b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3069b;
        if (dVar != null) {
            if (((S0) dVar.d) == null) {
                dVar.d = new S0();
            }
            S0 s02 = (S0) dVar.d;
            s02.d = mode;
            s02.f2898a = true;
            dVar.a();
        }
    }
}
