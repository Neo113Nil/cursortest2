package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import d.AbstractC0110a;

/* renamed from: h.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163p extends ImageButton {

    /* renamed from: e, reason: collision with root package name */
    public final C0161n f2250e;

    /* renamed from: f, reason: collision with root package name */
    public final L.Q f2251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        i0.a(context);
        C0161n c0161n = new C0161n(this);
        this.f2250e = c0161n;
        c0161n.b(null, R.attr.toolbarNavigationButtonStyle);
        L.Q q2 = new L.Q(this);
        this.f2251f = q2;
        q2.r(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0161n c0161n = this.f2250e;
        if (c0161n != null) {
            c0161n.a();
        }
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.m();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0161n c0161n = this.f2250e;
        if (c0161n == null || (j0Var = c0161n.f2243e) == null) {
            return null;
        }
        return j0Var.f2221a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0161n c0161n = this.f2250e;
        if (c0161n == null || (j0Var = c0161n.f2243e) == null) {
            return null;
        }
        return j0Var.f2222b;
    }

    public ColorStateList getSupportImageTintList() {
        j0 j0Var;
        L.Q q2 = this.f2251f;
        if (q2 == null || (j0Var = (j0) q2.f516g) == null) {
            return null;
        }
        return j0Var.f2221a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j0 j0Var;
        L.Q q2 = this.f2251f;
        if (q2 == null || (j0Var = (j0) q2.f516g) == null) {
            return null;
        }
        return j0Var.f2222b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2251f.f515f).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0161n c0161n = this.f2250e;
        if (c0161n != null) {
            c0161n.f2241c = -1;
            c0161n.d(null);
            c0161n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0161n c0161n = this.f2250e;
        if (c0161n != null) {
            c0161n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        L.Q q2 = this.f2251f;
        ImageView imageView = (ImageView) q2.f515f;
        if (i2 != 0) {
            Drawable a2 = AbstractC0110a.a(imageView.getContext(), i2);
            if (a2 != null) {
                Rect rect = AbstractC0171y.f2323a;
            }
            imageView.setImageDrawable(a2);
        } else {
            imageView.setImageDrawable(null);
        }
        q2.m();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.m();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0161n c0161n = this.f2250e;
        if (c0161n != null) {
            c0161n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0161n c0161n = this.f2250e;
        if (c0161n != null) {
            c0161n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            if (((j0) q2.f516g) == null) {
                q2.f516g = new j0();
            }
            j0 j0Var = (j0) q2.f516g;
            j0Var.f2221a = colorStateList;
            j0Var.f2224d = true;
            q2.m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            if (((j0) q2.f516g) == null) {
                q2.f516g = new j0();
            }
            j0 j0Var = (j0) q2.f516g;
            j0Var.f2222b = mode;
            j0Var.f2223c = true;
            q2.m();
        }
    }
}
