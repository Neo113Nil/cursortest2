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

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0247x extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3079a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3080b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f3081c = false;
        Q0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f3079a = c0231p;
        c0231p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3080b = dVar;
        dVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            c0231p.a();
        }
        B.d dVar = this.f3080b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        S0 s02;
        B.d dVar = this.f3080b;
        if (dVar == null || (s02 = (S0) dVar.f45c) == null) {
            return null;
        }
        return s02.f2913a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        S0 s02;
        B.d dVar = this.f3080b;
        if (dVar == null || (s02 = (S0) dVar.f45c) == null) {
            return null;
        }
        return s02.f2914b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3080b.f44b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3080b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3080b;
        if (dVar != null && drawable != null && !this.f3081c) {
            dVar.f43a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3081c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f44b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f43a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3081c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3080b;
        ImageView imageView = (ImageView) dVar.f44b;
        if (i != 0) {
            Drawable t2 = T.d.t(imageView.getContext(), i);
            if (t2 != null) {
                AbstractC0224l0.a(t2);
            }
            imageView.setImageDrawable(t2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3080b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3079a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3080b;
        if (dVar != null) {
            if (((S0) dVar.f45c) == null) {
                dVar.f45c = new S0();
            }
            S0 s02 = (S0) dVar.f45c;
            s02.f2913a = colorStateList;
            s02.d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3080b;
        if (dVar != null) {
            if (((S0) dVar.f45c) == null) {
                dVar.f45c = new S0();
            }
            S0 s02 = (S0) dVar.f45c;
            s02.f2914b = mode;
            s02.f2915c = true;
            dVar.a();
        }
    }
}
