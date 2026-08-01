package defpackage;

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class e5 extends ImageButton {
    public final f2 f;
    public final nz g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ji0.a(context);
        this.h = false;
        yh0.a(this, getContext());
        f2 f2Var = new f2(this);
        this.f = f2Var;
        f2Var.l(attributeSet, i);
        nz nzVar = new nz(this);
        this.g = nzVar;
        nzVar.h(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.a();
        }
        nz nzVar = this.g;
        if (nzVar != null) {
            nzVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        me meVar;
        nz nzVar = this.g;
        if (nzVar == null || (meVar = (me) nzVar.d) == null) {
            return null;
        }
        return (ColorStateList) meVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        me meVar;
        nz nzVar = this.g;
        if (nzVar == null || (meVar = (me) nzVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) meVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        nz nzVar = this.g;
        if (nzVar != null) {
            nzVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        nz nzVar = this.g;
        if (nzVar != null && drawable != null && !this.h) {
            nzVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (nzVar != null) {
            nzVar.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) nzVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(nzVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.g.j(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        nz nzVar = this.g;
        if (nzVar != null) {
            nzVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        nz nzVar = this.g;
        if (nzVar != null) {
            if (((me) nzVar.d) == null) {
                nzVar.d = new me();
            }
            me meVar = (me) nzVar.d;
            meVar.c = colorStateList;
            meVar.b = true;
            nzVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        nz nzVar = this.g;
        if (nzVar != null) {
            if (((me) nzVar.d) == null) {
                nzVar.d = new me();
            }
            me meVar = (me) nzVar.d;
            meVar.d = mode;
            meVar.a = true;
            nzVar.a();
        }
    }
}
