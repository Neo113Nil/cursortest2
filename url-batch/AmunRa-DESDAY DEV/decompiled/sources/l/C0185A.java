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

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0185A extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0235q f2919a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f2920b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f2921c = false;
        S0.a(this, getContext());
        C0235q c0235q = new C0235q(this);
        this.f2919a = c0235q;
        c0235q.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f2920b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            c0235q.a();
        }
        B.d dVar = this.f2920b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            return c0235q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            return c0235q.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        k1.h hVar;
        B.d dVar = this.f2920b;
        if (dVar == null || (hVar = (k1.h) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2804c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        k1.h hVar;
        B.d dVar = this.f2920b;
        if (dVar == null || (hVar = (k1.h) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2920b.f14c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            c0235q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            c0235q.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f2920b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f2920b;
        if (dVar != null && drawable != null && !this.f2921c) {
            dVar.f13b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f2921c) {
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
        this.f2921c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f2920b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f14c;
            if (i != 0) {
                Drawable z2 = s1.l.z(imageView.getContext(), i);
                if (z2 != null) {
                    AbstractC0230n0.a(z2);
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
        B.d dVar = this.f2920b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            c0235q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235q c0235q = this.f2919a;
        if (c0235q != null) {
            c0235q.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f2920b;
        if (dVar != null) {
            if (((k1.h) dVar.d) == null) {
                dVar.d = new k1.h();
            }
            k1.h hVar = (k1.h) dVar.d;
            hVar.f2804c = colorStateList;
            hVar.f2803b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f2920b;
        if (dVar != null) {
            if (((k1.h) dVar.d) == null) {
                dVar.d = new k1.h();
            }
            k1.h hVar = (k1.h) dVar.d;
            hVar.d = mode;
            hVar.f2802a = true;
            dVar.a();
        }
    }
}
