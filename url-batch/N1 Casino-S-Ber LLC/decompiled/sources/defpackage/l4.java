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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class l4 extends ImageButton {
    public final x1 f;
    public final m4 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w50.a(context);
        this.h = false;
        s50.a(this, getContext());
        x1 x1Var = new x1(this);
        this.f = x1Var;
        x1Var.l(attributeSet, i);
        m4 m4Var = new m4(this);
        this.g = m4Var;
        m4Var.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.a();
        }
        m4 m4Var = this.g;
        if (m4Var != null) {
            m4Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        cc ccVar;
        m4 m4Var = this.g;
        if (m4Var == null || (ccVar = (cc) m4Var.d) == null) {
            return null;
        }
        return (ColorStateList) ccVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        cc ccVar;
        m4 m4Var = this.g;
        if (m4Var == null || (ccVar = (cc) m4Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) ccVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m4 m4Var = this.g;
        if (m4Var != null) {
            m4Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m4 m4Var = this.g;
        if (m4Var != null && drawable != null && !this.h) {
            m4Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (m4Var != null) {
            m4Var.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) m4Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(m4Var.b);
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
        this.g.e(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m4 m4Var = this.g;
        if (m4Var != null) {
            m4Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m4 m4Var = this.g;
        if (m4Var != null) {
            if (((cc) m4Var.d) == null) {
                m4Var.d = new cc();
            }
            cc ccVar = (cc) m4Var.d;
            ccVar.c = colorStateList;
            ccVar.b = true;
            m4Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m4 m4Var = this.g;
        if (m4Var != null) {
            if (((cc) m4Var.d) == null) {
                m4Var.d = new cc();
            }
            cc ccVar = (cc) m4Var.d;
            ccVar.d = mode;
            ccVar.a = true;
            m4Var.a();
        }
    }
}
