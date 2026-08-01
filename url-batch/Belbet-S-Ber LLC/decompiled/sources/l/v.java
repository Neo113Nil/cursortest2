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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class v extends ImageButton {

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2585f;

    /* renamed from: g, reason: collision with root package name */
    public final e0.d f2586g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p2.a(context);
        this.h = false;
        o2.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f2585f = cVar;
        cVar.m(attributeSet, i);
        e0.d dVar = new e0.d(this);
        this.f2586g = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            cVar.a();
        }
        e0.d dVar = this.f2586g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        q2 q2Var;
        e0.d dVar = this.f2586g;
        if (dVar == null || (q2Var = (q2) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) q2Var.f2547c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q2 q2Var;
        e0.d dVar = this.f2586g;
        if (dVar == null || (q2Var = (q2) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) q2Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2586g.f1322c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            cVar.p(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e0.d dVar = this.f2586g;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e0.d dVar = this.f2586g;
        if (dVar != null && drawable != null && !this.h) {
            dVar.f1321b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f1322c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f1321b);
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
        this.f2586g.e(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e0.d dVar = this.f2586g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2585f;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        e0.d dVar = this.f2586g;
        if (dVar != null) {
            if (((q2) dVar.d) == null) {
                dVar.d = new q2();
            }
            q2 q2Var = (q2) dVar.d;
            q2Var.f2547c = colorStateList;
            q2Var.f2546b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        e0.d dVar = this.f2586g;
        if (dVar != null) {
            if (((q2) dVar.d) == null) {
                dVar.d = new q2();
            }
            q2 q2Var = (q2) dVar.d;
            q2Var.d = mode;
            q2Var.f2545a = true;
            dVar.a();
        }
    }
}
