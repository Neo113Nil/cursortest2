package k;

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
import com.rockchicken.pump.up.road.R;
import d2.C0389g;
import g.AbstractC0432a;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228o extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final K3.n f14065a;

    /* renamed from: b, reason: collision with root package name */
    public final C0389g f14066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228o(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        AbstractC1215g0.a(context);
        K3.n nVar = new K3.n(this);
        this.f14065a = nVar;
        nVar.e(null, R.attr.toolbarNavigationButtonStyle);
        C0389g c0389g = new C0389g((ImageView) this);
        this.f14066b = c0389g;
        c0389g.H(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        K3.n nVar = this.f14065a;
        if (nVar != null) {
            nVar.b();
        }
        C0389g c0389g = this.f14066b;
        if (c0389g != null) {
            c0389g.D();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        G3.h hVar;
        K3.n nVar = this.f14065a;
        if (nVar == null || (hVar = (G3.h) nVar.f1595a) == null) {
            return null;
        }
        return (ColorStateList) hVar.f909c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G3.h hVar;
        K3.n nVar = this.f14065a;
        if (nVar == null || (hVar = (G3.h) nVar.f1595a) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f910d;
    }

    public ColorStateList getSupportImageTintList() {
        G3.h hVar;
        C0389g c0389g = this.f14066b;
        if (c0389g == null || (hVar = (G3.h) c0389g.f8265c) == null) {
            return null;
        }
        return (ColorStateList) hVar.f909c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        G3.h hVar;
        C0389g c0389g = this.f14066b;
        if (c0389g == null || (hVar = (G3.h) c0389g.f8265c) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f910d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f14066b.f8264b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        K3.n nVar = this.f14065a;
        if (nVar != null) {
            nVar.f1596b = -1;
            nVar.h(null);
            nVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        K3.n nVar = this.f14065a;
        if (nVar != null) {
            nVar.f(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0389g c0389g = this.f14066b;
        if (c0389g != null) {
            c0389g.D();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0389g c0389g = this.f14066b;
        if (c0389g != null) {
            c0389g.D();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        C0389g c0389g = this.f14066b;
        ImageView imageView = (ImageView) c0389g.f8264b;
        if (i4 != 0) {
            Drawable a3 = AbstractC0432a.a(imageView.getContext(), i4);
            if (a3 != null) {
                Rect rect = AbstractC1237x.f14120a;
            }
            imageView.setImageDrawable(a3);
        } else {
            imageView.setImageDrawable(null);
        }
        c0389g.D();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0389g c0389g = this.f14066b;
        if (c0389g != null) {
            c0389g.D();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        K3.n nVar = this.f14065a;
        if (nVar != null) {
            nVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        K3.n nVar = this.f14065a;
        if (nVar != null) {
            nVar.k(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0389g c0389g = this.f14066b;
        if (c0389g != null) {
            if (((G3.h) c0389g.f8265c) == null) {
                c0389g.f8265c = new G3.h();
            }
            G3.h hVar = (G3.h) c0389g.f8265c;
            hVar.f909c = colorStateList;
            hVar.f908b = true;
            c0389g.D();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0389g c0389g = this.f14066b;
        if (c0389g != null) {
            if (((G3.h) c0389g.f8265c) == null) {
                c0389g.f8265c = new G3.h();
            }
            G3.h hVar = (G3.h) c0389g.f8265c;
            hVar.f910d = mode;
            hVar.f907a = true;
            c0389g.D();
        }
    }
}
