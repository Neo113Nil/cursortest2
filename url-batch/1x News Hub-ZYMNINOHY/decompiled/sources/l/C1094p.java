package l;

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
import com.fc.barca.football.R;
import f0.C0322a;
import h.AbstractC0337a;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1094p extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C1092n f9864a;

    /* renamed from: b, reason: collision with root package name */
    public final C0322a f9865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        i0.a(context);
        C1092n c1092n = new C1092n(this);
        this.f9864a = c1092n;
        c1092n.b(null, R.attr.toolbarNavigationButtonStyle);
        C0322a c0322a = new C0322a(this);
        this.f9865b = c0322a;
        c0322a.u(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1092n c1092n = this.f9864a;
        if (c1092n != null) {
            c1092n.a();
        }
        C0322a c0322a = this.f9865b;
        if (c0322a != null) {
            c0322a.r();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C1092n c1092n = this.f9864a;
        if (c1092n == null || (j0Var = c1092n.f9858e) == null) {
            return null;
        }
        return j0Var.f9837a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C1092n c1092n = this.f9864a;
        if (c1092n == null || (j0Var = c1092n.f9858e) == null) {
            return null;
        }
        return j0Var.f9838b;
    }

    public ColorStateList getSupportImageTintList() {
        j0 j0Var;
        C0322a c0322a = this.f9865b;
        if (c0322a == null || (j0Var = (j0) c0322a.f4978c) == null) {
            return null;
        }
        return j0Var.f9837a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j0 j0Var;
        C0322a c0322a = this.f9865b;
        if (c0322a == null || (j0Var = (j0) c0322a.f4978c) == null) {
            return null;
        }
        return j0Var.f9838b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f9865b.f4977b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1092n c1092n = this.f9864a;
        if (c1092n != null) {
            c1092n.f9856c = -1;
            c1092n.d(null);
            c1092n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1092n c1092n = this.f9864a;
        if (c1092n != null) {
            c1092n.c(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0322a c0322a = this.f9865b;
        if (c0322a != null) {
            c0322a.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0322a c0322a = this.f9865b;
        if (c0322a != null) {
            c0322a.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        C0322a c0322a = this.f9865b;
        ImageView imageView = (ImageView) c0322a.f4977b;
        if (i3 != 0) {
            Drawable a3 = AbstractC0337a.a(imageView.getContext(), i3);
            if (a3 != null) {
                Rect rect = AbstractC1103z.f9932a;
            }
            imageView.setImageDrawable(a3);
        } else {
            imageView.setImageDrawable(null);
        }
        c0322a.r();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0322a c0322a = this.f9865b;
        if (c0322a != null) {
            c0322a.r();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1092n c1092n = this.f9864a;
        if (c1092n != null) {
            c1092n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1092n c1092n = this.f9864a;
        if (c1092n != null) {
            c1092n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0322a c0322a = this.f9865b;
        if (c0322a != null) {
            if (((j0) c0322a.f4978c) == null) {
                c0322a.f4978c = new j0();
            }
            j0 j0Var = (j0) c0322a.f4978c;
            j0Var.f9837a = colorStateList;
            j0Var.f9840d = true;
            c0322a.r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0322a c0322a = this.f9865b;
        if (c0322a != null) {
            if (((j0) c0322a.f4978c) == null) {
                c0322a.f4978c = new j0();
            }
            j0 j0Var = (j0) c0322a.f4978c;
            j0Var.f9838b = mode;
            j0Var.f9839c = true;
            c0322a.r();
        }
    }
}
