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

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0249z extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f3056a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3057b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S0.a(context);
        this.f3058c = false;
        R0.a(this, getContext());
        C0229p c0229p = new C0229p(this);
        this.f3056a = c0229p;
        c0229p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3057b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            c0229p.a();
        }
        B.d dVar = this.f3057b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        T0 t02;
        B.d dVar = this.f3057b;
        if (dVar == null || (t02 = (T0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) t02.f2885c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        T0 t02;
        B.d dVar = this.f3057b;
        if (dVar == null || (t02 = (T0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) t02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3057b.f34c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3057b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3057b;
        if (dVar != null && drawable != null && !this.f3058c) {
            dVar.f33b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3058c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f34c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f33b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3058c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3057b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f34c;
            if (i != 0) {
                Drawable w2 = z1.l.w(imageView.getContext(), i);
                if (w2 != null) {
                    AbstractC0224m0.a(w2);
                }
                imageView.setImageDrawable(w2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3057b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f3056a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3057b;
        if (dVar != null) {
            if (((T0) dVar.d) == null) {
                dVar.d = new T0();
            }
            T0 t02 = (T0) dVar.d;
            t02.f2885c = colorStateList;
            t02.f2884b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3057b;
        if (dVar != null) {
            if (((T0) dVar.d) == null) {
                dVar.d = new T0();
            }
            T0 t02 = (T0) dVar.d;
            t02.d = mode;
            t02.f2883a = true;
            dVar.a();
        }
    }
}
