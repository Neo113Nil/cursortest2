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

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0300z extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0280p f3502a;

    /* renamed from: b, reason: collision with root package name */
    public final B.d f3503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0300z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f3504c = false;
        S0.a(this, getContext());
        C0280p c0280p = new C0280p(this);
        this.f3502a = c0280p;
        c0280p.d(attributeSet, i);
        B.d dVar = new B.d(this);
        this.f3503b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            c0280p.a();
        }
        B.d dVar = this.f3503b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            return c0280p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            return c0280p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i1.i iVar;
        B.d dVar = this.f3503b;
        if (dVar == null || (iVar = (i1.i) dVar.f23d) == null) {
            return null;
        }
        return (ColorStateList) iVar.f2683c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i1.i iVar;
        B.d dVar = this.f3503b;
        if (dVar == null || (iVar = (i1.i) dVar.f23d) == null) {
            return null;
        }
        return (PorterDuff.Mode) iVar.f2684d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3503b.f22c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            c0280p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            c0280p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.d dVar = this.f3503b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.d dVar = this.f3503b;
        if (dVar != null && drawable != null && !this.f3504c) {
            dVar.f21b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3504c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f22c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f21b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3504c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.d dVar = this.f3503b;
        ImageView imageView = (ImageView) dVar.f22c;
        if (i != 0) {
            Drawable z2 = q1.d.z(imageView.getContext(), i);
            if (z2 != null) {
                AbstractC0277n0.a(z2);
            }
            imageView.setImageDrawable(z2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.d dVar = this.f3503b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            c0280p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280p c0280p = this.f3502a;
        if (c0280p != null) {
            c0280p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.d dVar = this.f3503b;
        if (dVar != null) {
            if (((i1.i) dVar.f23d) == null) {
                dVar.f23d = new i1.i();
            }
            i1.i iVar = (i1.i) dVar.f23d;
            iVar.f2683c = colorStateList;
            iVar.f2682b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.d dVar = this.f3503b;
        if (dVar != null) {
            if (((i1.i) dVar.f23d) == null) {
                dVar.f23d = new i1.i();
            }
            i1.i iVar = (i1.i) dVar.f23d;
            iVar.f2684d = mode;
            iVar.f2681a = true;
            dVar.a();
        }
    }
}
