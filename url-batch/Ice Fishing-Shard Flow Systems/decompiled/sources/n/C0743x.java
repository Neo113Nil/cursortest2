package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: n.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0743x extends ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final C0726o f6948d;

    /* renamed from: e, reason: collision with root package name */
    public final B6.o f6949e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6950i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0743x(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        j1.a(context);
        this.f6950i = false;
        i1.a(this, getContext());
        C0726o c0726o = new C0726o(this);
        this.f6948d = c0726o;
        c0726o.d(attributeSet, i2);
        B6.o oVar = new B6.o(this);
        this.f6949e = oVar;
        oVar.e(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            c0726o.a();
        }
        B6.o oVar = this.f6949e;
        if (oVar != null) {
            oVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        D6.i iVar;
        B6.o oVar = this.f6949e;
        if (oVar == null || (iVar = (D6.i) oVar.f231d) == null) {
            return null;
        }
        return (ColorStateList) iVar.f515c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        D6.i iVar;
        B6.o oVar = this.f6949e;
        if (oVar == null || (iVar = (D6.i) oVar.f231d) == null) {
            return null;
        }
        return (PorterDuff.Mode) iVar.f516d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f6949e.f230c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B6.o oVar = this.f6949e;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B6.o oVar = this.f6949e;
        if (oVar != null && drawable != null && !this.f6950i) {
            oVar.f229b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (oVar != null) {
            oVar.a();
            if (this.f6950i) {
                return;
            }
            ImageView imageView = (ImageView) oVar.f230c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(oVar.f229b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f6950i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        B6.o oVar = this.f6949e;
        if (oVar != null) {
            ImageView imageView = (ImageView) oVar.f230c;
            if (i2 != 0) {
                Drawable M7 = O6.g.M(imageView.getContext(), i2);
                if (M7 != null) {
                    AbstractC0731q0.a(M7);
                }
                imageView.setImageDrawable(M7);
            } else {
                imageView.setImageDrawable(null);
            }
            oVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B6.o oVar = this.f6949e;
        if (oVar != null) {
            oVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6948d;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B6.o oVar = this.f6949e;
        if (oVar != null) {
            if (((D6.i) oVar.f231d) == null) {
                oVar.f231d = new D6.i();
            }
            D6.i iVar = (D6.i) oVar.f231d;
            iVar.f515c = colorStateList;
            iVar.f514b = true;
            oVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B6.o oVar = this.f6949e;
        if (oVar != null) {
            if (((D6.i) oVar.f231d) == null) {
                oVar.f231d = new D6.i();
            }
            D6.i iVar = (D6.i) oVar.f231d;
            iVar.f516d = mode;
            iVar.f513a = true;
            oVar.a();
        }
    }
}
