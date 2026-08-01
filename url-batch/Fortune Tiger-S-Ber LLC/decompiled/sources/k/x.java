package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class x extends ImageView {

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f2685f;
    public final b0.d g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        p2.a(context);
        this.h = false;
        o2.a(this, getContext());
        b1.b bVar = new b1.b(this);
        this.f2685f = bVar;
        bVar.l(attributeSet, i4);
        b0.d dVar = new b0.d(this);
        this.g = dVar;
        dVar.d(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            bVar.a();
        }
        b0.d dVar = this.g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c3.g gVar;
        b0.d dVar = this.g;
        if (dVar == null || (gVar = (c3.g) dVar.f700d) == null) {
            return null;
        }
        return (ColorStateList) gVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c3.g gVar;
        b0.d dVar = this.g;
        if (dVar == null || (gVar = (c3.g) dVar.f700d) == null) {
            return null;
        }
        return (PorterDuff.Mode) gVar.f1049d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b0.d dVar = this.g;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b0.d dVar = this.g;
        if (dVar != null && drawable != null && !this.h) {
            dVar.f699b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) dVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f699b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        b0.d dVar = this.g;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.c;
            if (i4 != 0) {
                Drawable w3 = k3.m.w(imageView.getContext(), i4);
                if (w3 != null) {
                    j1.a(w3);
                }
                imageView.setImageDrawable(w3);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b0.d dVar = this.g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.f2685f;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        b0.d dVar = this.g;
        if (dVar != null) {
            if (((c3.g) dVar.f700d) == null) {
                dVar.f700d = new c3.g();
            }
            c3.g gVar = (c3.g) dVar.f700d;
            gVar.c = colorStateList;
            gVar.f1048b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        b0.d dVar = this.g;
        if (dVar != null) {
            if (((c3.g) dVar.f700d) == null) {
                dVar.f700d = new c3.g();
            }
            c3.g gVar = (c3.g) dVar.f700d;
            gVar.f1049d = mode;
            gVar.f1047a = true;
            dVar.a();
        }
    }
}
