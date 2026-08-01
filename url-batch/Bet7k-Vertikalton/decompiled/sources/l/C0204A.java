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
public class C0204A extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0254q f2840a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f2841b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f2842c = false;
        S0.a(this, getContext());
        C0254q c0254q = new C0254q(this);
        this.f2840a = c0254q;
        c0254q.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f2841b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            c0254q.a();
        }
        B.d dVar = this.f2841b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i1.g gVar;
        B.d dVar = this.f2841b;
        if (dVar == null || (gVar = (i1.g) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) gVar.f2425c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i1.g gVar;
        B.d dVar = this.f2841b;
        if (dVar == null || (gVar = (i1.g) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) gVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2841b.f19c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            c0254q.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f2841b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f2841b;
        if (dVar != null && drawable != null && !this.f2842c) {
            dVar.f18b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f2842c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f19c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f18b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2842c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f2841b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f19c;
            if (i != 0) {
                Drawable v2 = q1.l.v(imageView.getContext(), i);
                if (v2 != null) {
                    AbstractC0249n0.a(v2);
                }
                imageView.setImageDrawable(v2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f2841b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f2840a;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f2841b;
        if (dVar != null) {
            if (((i1.g) dVar.d) == null) {
                dVar.d = new i1.g();
            }
            i1.g gVar = (i1.g) dVar.d;
            gVar.f2425c = colorStateList;
            gVar.f2424b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f2841b;
        if (dVar != null) {
            if (((i1.g) dVar.d) == null) {
                dVar.d = new i1.g();
            }
            i1.g gVar = (i1.g) dVar.d;
            gVar.d = mode;
            gVar.f2423a = true;
            dVar.a();
        }
    }
}
