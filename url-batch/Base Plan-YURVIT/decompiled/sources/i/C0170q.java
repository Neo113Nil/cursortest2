package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import e.AbstractC0121a;

/* renamed from: i.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0170q extends ImageView {

    /* renamed from: e, reason: collision with root package name */
    public final C0167n f2282e;

    /* renamed from: f, reason: collision with root package name */
    public final N.P f2283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170q(Context context, int i2) {
        super(context, null, i2);
        i0.a(context);
        C0167n c0167n = new C0167n(this);
        this.f2282e = c0167n;
        c0167n.b(null, i2);
        N.P p2 = new N.P(this);
        this.f2283f = p2;
        p2.z(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0167n c0167n = this.f2282e;
        if (c0167n != null) {
            c0167n.a();
        }
        N.P p2 = this.f2283f;
        if (p2 != null) {
            p2.w();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0167n c0167n = this.f2282e;
        if (c0167n == null || (j0Var = c0167n.f2271e) == null) {
            return null;
        }
        return j0Var.f2249a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0167n c0167n = this.f2282e;
        if (c0167n == null || (j0Var = c0167n.f2271e) == null) {
            return null;
        }
        return j0Var.f2250b;
    }

    public ColorStateList getSupportImageTintList() {
        j0 j0Var;
        N.P p2 = this.f2283f;
        if (p2 == null || (j0Var = (j0) p2.f699g) == null) {
            return null;
        }
        return j0Var.f2249a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j0 j0Var;
        N.P p2 = this.f2283f;
        if (p2 == null || (j0Var = (j0) p2.f699g) == null) {
            return null;
        }
        return j0Var.f2250b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2283f.f698f).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0167n c0167n = this.f2282e;
        if (c0167n != null) {
            c0167n.f2269c = -1;
            c0167n.d(null);
            c0167n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0167n c0167n = this.f2282e;
        if (c0167n != null) {
            c0167n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        N.P p2 = this.f2283f;
        if (p2 != null) {
            p2.w();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        N.P p2 = this.f2283f;
        if (p2 != null) {
            p2.w();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        N.P p2 = this.f2283f;
        if (p2 != null) {
            ImageView imageView = (ImageView) p2.f698f;
            if (i2 != 0) {
                Drawable a2 = AbstractC0121a.a(imageView.getContext(), i2);
                if (a2 != null) {
                    Rect rect = AbstractC0178z.f2351a;
                }
                imageView.setImageDrawable(a2);
            } else {
                imageView.setImageDrawable(null);
            }
            p2.w();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        N.P p2 = this.f2283f;
        if (p2 != null) {
            p2.w();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0167n c0167n = this.f2282e;
        if (c0167n != null) {
            c0167n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0167n c0167n = this.f2282e;
        if (c0167n != null) {
            c0167n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        N.P p2 = this.f2283f;
        if (p2 != null) {
            if (((j0) p2.f699g) == null) {
                p2.f699g = new j0();
            }
            j0 j0Var = (j0) p2.f699g;
            j0Var.f2249a = colorStateList;
            j0Var.f2252d = true;
            p2.w();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        N.P p2 = this.f2283f;
        if (p2 != null) {
            if (((j0) p2.f699g) == null) {
                p2.f699g = new j0();
            }
            j0 j0Var = (j0) p2.f699g;
            j0Var.f2250b = mode;
            j0Var.f2251c = true;
            p2.w();
        }
    }
}
