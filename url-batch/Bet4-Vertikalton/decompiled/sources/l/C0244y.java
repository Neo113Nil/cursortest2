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
import g0.C0116b;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0244y extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0116b f3025a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3026b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S0.a(context);
        this.f3027c = false;
        R0.a(this, getContext());
        C0116b c0116b = new C0116b(this);
        this.f3025a = c0116b;
        c0116b.k(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3026b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            c0116b.a();
        }
        B.d dVar = this.f3026b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        T0 t02;
        B.d dVar = this.f3026b;
        if (dVar == null || (t02 = (T0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) t02.f2861c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        T0 t02;
        B.d dVar = this.f3026b;
        if (dVar == null || (t02 = (T0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) t02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3026b.f20c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            c0116b.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3026b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3026b;
        if (dVar != null && drawable != null && !this.f3027c) {
            dVar.f19b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3027c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f20c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f19b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3027c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3026b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f20c;
            if (i != 0) {
                Drawable z2 = w1.l.z(imageView.getContext(), i);
                if (z2 != null) {
                    AbstractC0221m0.a(z2);
                }
                imageView.setImageDrawable(z2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3026b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f3025a;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3026b;
        if (dVar != null) {
            if (((T0) dVar.d) == null) {
                dVar.d = new T0();
            }
            T0 t02 = (T0) dVar.d;
            t02.f2861c = colorStateList;
            t02.f2860b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3026b;
        if (dVar != null) {
            if (((T0) dVar.d) == null) {
                dVar.d = new T0();
            }
            T0 t02 = (T0) dVar.d;
            t02.d = mode;
            t02.f2859a = true;
            dVar.a();
        }
    }
}
