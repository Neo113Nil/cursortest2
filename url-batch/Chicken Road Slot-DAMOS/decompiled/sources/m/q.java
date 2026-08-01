package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.appsflyer.R;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public final c2.w1 f6156d;

    /* renamed from: e, reason: collision with root package name */
    public final b1.c0 f6157e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        p1.a(context);
        this.f6158i = false;
        o1.a(this, getContext());
        c2.w1 w1Var = new c2.w1(this);
        this.f6156d = w1Var;
        w1Var.b(null, R.attr.toolbarNavigationButtonStyle);
        b1.c0 c0Var = new b1.c0(this);
        this.f6157e = c0Var;
        c0Var.f(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c2.w1 w1Var = this.f6156d;
        if (w1Var != null) {
            w1Var.a();
        }
        b1.c0 c0Var = this.f6157e;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q1 q1Var;
        c2.w1 w1Var = this.f6156d;
        if (w1Var == null || (q1Var = (q1) w1Var.f1698e) == null) {
            return null;
        }
        return q1Var.f6171a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q1 q1Var;
        c2.w1 w1Var = this.f6156d;
        if (w1Var == null || (q1Var = (q1) w1Var.f1698e) == null) {
            return null;
        }
        return q1Var.f6172b;
    }

    public ColorStateList getSupportImageTintList() {
        q1 q1Var;
        b1.c0 c0Var = this.f6157e;
        if (c0Var == null || (q1Var = (q1) c0Var.f955c) == null) {
            return null;
        }
        return q1Var.f6171a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q1 q1Var;
        b1.c0 c0Var = this.f6157e;
        if (c0Var == null || (q1Var = (q1) c0Var.f955c) == null) {
            return null;
        }
        return q1Var.f6172b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f6157e.f954b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c2.w1 w1Var = this.f6156d;
        if (w1Var != null) {
            w1Var.f1694a = -1;
            w1Var.e(null);
            w1Var.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        c2.w1 w1Var = this.f6156d;
        if (w1Var != null) {
            w1Var.d(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b1.c0 c0Var = this.f6157e;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b1.c0 c0Var = this.f6157e;
        if (c0Var != null && drawable != null && !this.f6158i) {
            c0Var.f953a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0Var != null) {
            c0Var.a();
            if (this.f6158i) {
                return;
            }
            ImageView imageView = (ImageView) c0Var.f954b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0Var.f953a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f6158i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        b1.c0 c0Var = this.f6157e;
        ImageView imageView = (ImageView) c0Var.f954b;
        if (i3 != 0) {
            Drawable v10 = z4.w.v(imageView.getContext(), i3);
            if (v10 != null) {
                k0.a(v10);
            }
            imageView.setImageDrawable(v10);
        } else {
            imageView.setImageDrawable(null);
        }
        c0Var.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b1.c0 c0Var = this.f6157e;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c2.w1 w1Var = this.f6156d;
        if (w1Var != null) {
            w1Var.f(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c2.w1 w1Var = this.f6156d;
        if (w1Var != null) {
            w1Var.g(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        b1.c0 c0Var = this.f6157e;
        if (c0Var != null) {
            if (((q1) c0Var.f955c) == null) {
                c0Var.f955c = new q1();
            }
            q1 q1Var = (q1) c0Var.f955c;
            q1Var.f6171a = colorStateList;
            q1Var.f6174d = true;
            c0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        b1.c0 c0Var = this.f6157e;
        if (c0Var != null) {
            if (((q1) c0Var.f955c) == null) {
                c0Var.f955c = new q1();
            }
            q1 q1Var = (q1) c0Var.f955c;
            q1Var.f6172b = mode;
            q1Var.f6173c = true;
            c0Var.a();
        }
    }
}
