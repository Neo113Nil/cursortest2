package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class z extends ImageView {

    /* renamed from: f, reason: collision with root package name */
    public final f1.b f2524f;

    /* renamed from: g, reason: collision with root package name */
    public final e0.d f2525g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2526h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        this.f2526h = false;
        r2.a(this, getContext());
        f1.b bVar = new f1.b(this);
        this.f2524f = bVar;
        bVar.k(attributeSet, i);
        e0.d dVar = new e0.d(this);
        this.f2525g = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            bVar.a();
        }
        e0.d dVar = this.f2525g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        t2 t2Var;
        e0.d dVar = this.f2525g;
        if (dVar == null || (t2Var = (t2) dVar.f1140c) == null) {
            return null;
        }
        return t2Var.f2462a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        t2 t2Var;
        e0.d dVar = this.f2525g;
        if (dVar == null || (t2Var = (t2) dVar.f1140c) == null) {
            return null;
        }
        return t2Var.f2463b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2525g.f1139b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e0.d dVar = this.f2525g;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e0.d dVar = this.f2525g;
        if (dVar != null && drawable != null && !this.f2526h) {
            dVar.f1138a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f2526h) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f1139b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f1138a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2526h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        e0.d dVar = this.f2525g;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f1139b;
            if (i != 0) {
                Drawable x3 = h.a.x(imageView.getContext(), i);
                if (x3 != null) {
                    m1.a(x3);
                }
                imageView.setImageDrawable(x3);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e0.d dVar = this.f2525g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f1.b bVar = this.f2524f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        e0.d dVar = this.f2525g;
        if (dVar != null) {
            if (((t2) dVar.f1140c) == null) {
                dVar.f1140c = new t2();
            }
            t2 t2Var = (t2) dVar.f1140c;
            t2Var.f2462a = colorStateList;
            t2Var.d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        e0.d dVar = this.f2525g;
        if (dVar != null) {
            if (((t2) dVar.f1140c) == null) {
                dVar.f1140c = new t2();
            }
            t2 t2Var = (t2) dVar.f1140c;
            t2Var.f2463b = mode;
            t2Var.f2464c = true;
            dVar.a();
        }
    }
}
