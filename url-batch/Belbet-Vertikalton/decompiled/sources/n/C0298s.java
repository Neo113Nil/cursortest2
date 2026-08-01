package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0298s extends CheckBox implements S.s {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f3705a;

    /* renamed from: b, reason: collision with root package name */
    public final C0294q f3706b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f3707c;

    /* renamed from: d, reason: collision with root package name */
    public C0308x f3708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0298s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.a(context);
        W0.a(this, getContext());
        j0.d dVar = new j0.d(this);
        this.f3705a = dVar;
        dVar.d(attributeSet, i);
        C0294q c0294q = new C0294q(this);
        this.f3706b = c0294q;
        c0294q.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3707c = y2;
        y2.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C0308x getEmojiTextViewHelper() {
        if (this.f3708d == null) {
            this.f3708d = new C0308x(this);
        }
        return this.f3708d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            c0294q.a();
        }
        Y y2 = this.f3707c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            return c0294q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            return c0294q.c();
        }
        return null;
    }

    @Override // S.s
    public ColorStateList getSupportButtonTintList() {
        j0.d dVar = this.f3705a;
        if (dVar != null) {
            return (ColorStateList) dVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j0.d dVar = this.f3705a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3165f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3707c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3707c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            c0294q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            c0294q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j0.d dVar = this.f3705a;
        if (dVar != null) {
            if (dVar.f3163c) {
                dVar.f3163c = false;
            } else {
                dVar.f3163c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3707c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3707c;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            c0294q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0294q c0294q = this.f3706b;
        if (c0294q != null) {
            c0294q.i(mode);
        }
    }

    @Override // S.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j0.d dVar = this.f3705a;
        if (dVar != null) {
            dVar.e = colorStateList;
            dVar.f3161a = true;
            dVar.a();
        }
    }

    @Override // S.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j0.d dVar = this.f3705a;
        if (dVar != null) {
            dVar.f3165f = mode;
            dVar.f3162b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3707c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3707c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(H1.d.F(getContext(), i));
    }
}
