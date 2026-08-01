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

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0222y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0205p f3096a;

    /* renamed from: b, reason: collision with root package name */
    public final D.d f3097b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0222y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f3098c = false;
        S0.a(this, getContext());
        C0205p c0205p = new C0205p(this);
        this.f3096a = c0205p;
        c0205p.d(attributeSet, i);
        D.d dVar = new D.d(this);
        this.f3097b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            c0205p.a();
        }
        D.d dVar = this.f3097b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            return c0205p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            return c0205p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        U0 u02;
        D.d dVar = this.f3097b;
        if (dVar == null || (u02 = (U0) dVar.d) == null) {
            return null;
        }
        return (ColorStateList) u02.f2942c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        U0 u02;
        D.d dVar = this.f3097b;
        if (dVar == null || (u02 = (U0) dVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) u02.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3097b.f122c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            c0205p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            c0205p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        D.d dVar = this.f3097b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        D.d dVar = this.f3097b;
        if (dVar != null && drawable != null && !this.f3098c) {
            dVar.f121b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f3098c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f122c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f121b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3098c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        D.d dVar = this.f3097b;
        ImageView imageView = (ImageView) dVar.f122c;
        if (i != 0) {
            Drawable F2 = z1.l.F(imageView.getContext(), i);
            if (F2 != null) {
                AbstractC0202n0.a(F2);
            }
            imageView.setImageDrawable(F2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        D.d dVar = this.f3097b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            c0205p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0205p c0205p = this.f3096a;
        if (c0205p != null) {
            c0205p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        D.d dVar = this.f3097b;
        if (dVar != null) {
            if (((U0) dVar.d) == null) {
                dVar.d = new U0();
            }
            U0 u02 = (U0) dVar.d;
            u02.f2942c = colorStateList;
            u02.f2941b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        D.d dVar = this.f3097b;
        if (dVar != null) {
            if (((U0) dVar.d) == null) {
                dVar.d = new U0();
            }
            U0 u02 = (U0) dVar.d;
            u02.d = mode;
            u02.f2940a = true;
            dVar.a();
        }
    }
}
