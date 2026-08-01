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
public class C0254y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0236p f3023a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3024b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f3025c = false;
        S0.a(this, getContext());
        C0236p c0236p = new C0236p(this);
        this.f3023a = c0236p;
        c0236p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3024b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            c0236p.a();
        }
        B.d dVar = this.f3024b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            return c0236p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            return c0236p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        U0 u02;
        B.d dVar = this.f3024b;
        if (dVar == null || (u02 = (U0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) u02.f2869c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        U0 u02;
        B.d dVar = this.f3024b;
        if (dVar == null || (u02 = (U0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) u02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3024b.f16c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            c0236p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            c0236p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3024b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3024b;
        if (dVar != null && drawable != null && !this.f3025c) {
            dVar.f15b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3025c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f16c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f15b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3025c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3024b;
        ImageView imageView = (ImageView) dVar.f16c;
        if (i != 0) {
            Drawable G2 = u1.d.G(imageView.getContext(), i);
            if (G2 != null) {
                AbstractC0233n0.a(G2);
            }
            imageView.setImageDrawable(G2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3024b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            c0236p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236p c0236p = this.f3023a;
        if (c0236p != null) {
            c0236p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3024b;
        if (dVar != null) {
            if (((U0) dVar.d) == null) {
                dVar.d = new U0();
            }
            U0 u02 = (U0) dVar.d;
            u02.f2869c = colorStateList;
            u02.f2868b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3024b;
        if (dVar != null) {
            if (((U0) dVar.d) == null) {
                dVar.d = new U0();
            }
            U0 u02 = (U0) dVar.d;
            u02.d = mode;
            u02.f2867a = true;
            dVar.a();
        }
    }
}
