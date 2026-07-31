package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class p extends CheckBox {

    /* renamed from: d, reason: collision with root package name */
    public final q f4374d;

    /* renamed from: e, reason: collision with root package name */
    public final n f4375e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f4376f;

    /* renamed from: g, reason: collision with root package name */
    public v f4377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x0034, B:5:0x003b, B:8:0x0041, B:9:0x0067, B:11:0x006e, B:12:0x0075, B:14:0x007c, B:21:0x0050, B:23:0x0056, B:25:0x005c), top: B:2:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x0034, B:5:0x003b, B:8:0x0041, B:9:0x0067, B:11:0x006e, B:12:0x0075, B:14:0x007c, B:21:0x0050, B:23:0x0056, B:25:0x005c), top: B:2:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        w1.a(context);
        v1.a(this, getContext());
        this.f4374d = new q(this);
        Context context2 = getContext();
        int[] iArr = h.a.f3057j;
        a0.g1 E = a0.g1.E(context2, attributeSet, iArr, R.attr.chipStyle);
        TypedArray typedArray = (TypedArray) E.f85c;
        q3.k0.j(this, getContext(), iArr, attributeSet, (TypedArray) E.f85c, R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(h0.a.D(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setButtonTintList(E.p(2));
                }
                if (typedArray.hasValue(3)) {
                    setButtonTintMode(r0.b(typedArray.getInt(3, -1), null));
                }
                E.G();
                n nVar = new n(this);
                this.f4375e = nVar;
                nVar.d(attributeSet, R.attr.chipStyle);
                f0 f0Var = new f0(this);
                this.f4376f = f0Var;
                f0Var.d(attributeSet, R.attr.chipStyle);
                getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(h0.a.D(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            E.G();
            n nVar2 = new n(this);
            this.f4375e = nVar2;
            nVar2.d(attributeSet, R.attr.chipStyle);
            f0 f0Var2 = new f0(this);
            this.f4376f = f0Var2;
            f0Var2.d(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    private v getEmojiTextViewHelper() {
        if (this.f4377g == null) {
            this.f4377g = new v(this);
        }
        return this.f4377g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4375e;
        if (nVar != null) {
            nVar.a();
        }
        f0 f0Var = this.f4376f;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f4375e;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f4375e;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        q qVar = this.f4374d;
        if (qVar != null) {
            return (ColorStateList) qVar.f4383e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        q qVar = this.f4374d;
        if (qVar != null) {
            return (PorterDuff.Mode) qVar.f4384f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x1 x1Var = this.f4376f.f4239h;
        if (x1Var != null) {
            return x1Var.f4452a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x1 x1Var = this.f4376f.f4239h;
        if (x1Var != null) {
            return x1Var.f4453b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        ((s6.a) getEmojiTextViewHelper().f4423b.f1050e).E(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4375e;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n nVar = this.f4375e;
        if (nVar != null) {
            nVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        q qVar = this.f4374d;
        if (qVar != null) {
            if (qVar.f4381c) {
                qVar.f4381c = false;
            } else {
                qVar.f4381c = true;
                qVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4376f;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4376f;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        ((s6.a) getEmojiTextViewHelper().f4423b.f1050e).F(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((s6.a) getEmojiTextViewHelper().f4423b.f1050e).s(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4375e;
        if (nVar != null) {
            nVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4375e;
        if (nVar != null) {
            nVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        q qVar = this.f4374d;
        if (qVar != null) {
            qVar.f4383e = colorStateList;
            qVar.f4379a = true;
            qVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        q qVar = this.f4374d;
        if (qVar != null) {
            qVar.f4384f = mode;
            qVar.f4380b = true;
            qVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f4376f;
        f0Var.i(colorStateList);
        f0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f4376f;
        f0Var.j(mode);
        f0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(h0.a.D(getContext(), i));
    }
}
