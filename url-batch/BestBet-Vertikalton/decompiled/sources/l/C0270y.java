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
import c1.AbstractC0091d;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0270y extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3502a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0270y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f3504c = false;
        Q0.a(this, getContext());
        C0252p c0252p = new C0252p(this);
        this.f3502a = c0252p;
        c0252p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3503b = dVar;
        dVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            c0252p.a();
        }
        B.d dVar = this.f3503b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        S0 s0;
        B.d dVar = this.f3503b;
        if (dVar == null || (s0 = (S0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) s0.f3338c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        S0 s0;
        B.d dVar = this.f3503b;
        if (dVar == null || (s0 = (S0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) s0.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3503b.f33c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3503b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3503b;
        if (dVar != null && drawable != null && !this.f3504c) {
            dVar.f32b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3504c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f33c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f32b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3504c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3503b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f33c;
            if (i != 0) {
                Drawable j2 = AbstractC0091d.j(imageView.getContext(), i);
                if (j2 != null) {
                    AbstractC0245l0.a(j2);
                }
                imageView.setImageDrawable(j2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3503b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3502a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3503b;
        if (dVar != null) {
            if (((S0) dVar.d) == null) {
                dVar.d = new S0();
            }
            S0 s0 = (S0) dVar.d;
            s0.f3338c = colorStateList;
            s0.f3337b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3503b;
        if (dVar != null) {
            if (((S0) dVar.d) == null) {
                dVar.d = new S0();
            }
            S0 s0 = (S0) dVar.d;
            s0.d = mode;
            s0.f3336a = true;
            dVar.a();
        }
    }
}
