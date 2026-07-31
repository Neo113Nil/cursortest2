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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class w extends ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public final n f4433d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.b1 f4434e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w1.a(context);
        this.f4435f = false;
        v1.a(this, getContext());
        n nVar = new n(this);
        this.f4433d = nVar;
        nVar.d(attributeSet, i);
        a0.b1 b1Var = new a0.b1(this);
        this.f4434e = b1Var;
        b1Var.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4433d;
        if (nVar != null) {
            nVar.a();
        }
        a0.b1 b1Var = this.f4434e;
        if (b1Var != null) {
            b1Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f4433d;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f4433d;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x1 x1Var;
        a0.b1 b1Var = this.f4434e;
        if (b1Var == null || (x1Var = (x1) b1Var.f24c) == null) {
            return null;
        }
        return x1Var.f4452a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x1 x1Var;
        a0.b1 b1Var = this.f4434e;
        if (b1Var == null || (x1Var = (x1) b1Var.f24c) == null) {
            return null;
        }
        return x1Var.f4453b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4434e.f23b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4433d;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n nVar = this.f4433d;
        if (nVar != null) {
            nVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a0.b1 b1Var = this.f4434e;
        if (b1Var != null) {
            b1Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a0.b1 b1Var = this.f4434e;
        if (b1Var != null && drawable != null && !this.f4435f) {
            b1Var.f22a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (b1Var != null) {
            b1Var.a();
            if (this.f4435f) {
                return;
            }
            ImageView imageView = (ImageView) b1Var.f23b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(b1Var.f22a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4435f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        a0.b1 b1Var = this.f4434e;
        ImageView imageView = (ImageView) b1Var.f23b;
        if (i != 0) {
            Drawable D = h0.a.D(imageView.getContext(), i);
            if (D != null) {
                r0.a(D);
            }
            imageView.setImageDrawable(D);
        } else {
            imageView.setImageDrawable(null);
        }
        b1Var.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a0.b1 b1Var = this.f4434e;
        if (b1Var != null) {
            b1Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4433d;
        if (nVar != null) {
            nVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4433d;
        if (nVar != null) {
            nVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a0.b1 b1Var = this.f4434e;
        if (b1Var != null) {
            if (((x1) b1Var.f24c) == null) {
                b1Var.f24c = new x1();
            }
            x1 x1Var = (x1) b1Var.f24c;
            x1Var.f4452a = colorStateList;
            x1Var.f4455d = true;
            b1Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a0.b1 b1Var = this.f4434e;
        if (b1Var != null) {
            if (((x1) b1Var.f24c) == null) {
                b1Var.f24c = new x1();
            }
            x1 x1Var = (x1) b1Var.f24c;
            x1Var.f4453b = mode;
            x1Var.f4454c = true;
            b1Var.a();
        }
    }
}
