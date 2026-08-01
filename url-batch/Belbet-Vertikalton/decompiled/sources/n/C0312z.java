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

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0312z extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0294q f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final D.d f3749b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.a(context);
        this.f3750c = false;
        W0.a(this, getContext());
        C0294q c0294q = new C0294q(this);
        this.f3748a = c0294q;
        c0294q.d(attributeSet, i);
        D.d dVar = new D.d(this);
        this.f3749b = dVar;
        dVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            c0294q.a();
        }
        D.d dVar = this.f3749b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            return c0294q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            return c0294q.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        Y0 y02;
        D.d dVar = this.f3749b;
        if (dVar == null || (y02 = (Y0) dVar.f170d) == null) {
            return null;
        }
        return (ColorStateList) y02.f3591c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Y0 y02;
        D.d dVar = this.f3749b;
        if (dVar == null || (y02 = (Y0) dVar.f170d) == null) {
            return null;
        }
        return (PorterDuff.Mode) y02.f3592d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3749b.f169c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            c0294q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            c0294q.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        D.d dVar = this.f3749b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        D.d dVar = this.f3749b;
        if (dVar != null && drawable != null && !this.f3750c) {
            dVar.f168b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3750c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f169c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f168b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3750c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        D.d dVar = this.f3749b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f169c;
            if (i != 0) {
                Drawable F2 = H1.d.F(imageView.getContext(), i);
                if (F2 != null) {
                    AbstractC0293p0.a(F2);
                }
                imageView.setImageDrawable(F2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        D.d dVar = this.f3749b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            c0294q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0294q c0294q = this.f3748a;
        if (c0294q != null) {
            c0294q.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        D.d dVar = this.f3749b;
        if (dVar != null) {
            if (((Y0) dVar.f170d) == null) {
                dVar.f170d = new Y0();
            }
            Y0 y02 = (Y0) dVar.f170d;
            y02.f3591c = colorStateList;
            y02.f3590b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        D.d dVar = this.f3749b;
        if (dVar != null) {
            if (((Y0) dVar.f170d) == null) {
                dVar.f170d = new Y0();
            }
            Y0 y02 = (Y0) dVar.f170d;
            y02.f3592d = mode;
            y02.f3589a = true;
            dVar.a();
        }
    }
}
