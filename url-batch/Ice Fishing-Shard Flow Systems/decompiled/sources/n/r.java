package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;

/* loaded from: classes.dex */
public final class r extends CheckedTextView {

    /* renamed from: d, reason: collision with root package name */
    public final A6.j f6873d;

    /* renamed from: e, reason: collision with root package name */
    public final C0726o f6874e;

    /* renamed from: i, reason: collision with root package name */
    public final Z f6875i;

    /* renamed from: l, reason: collision with root package name */
    public C0739v f6876l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        j1.a(context);
        i1.a(this, getContext());
        Z z7 = new Z(this);
        this.f6875i = z7;
        z7.f(attributeSet, R.attr.checkedTextViewStyle);
        z7.b();
        C0726o c0726o = new C0726o(this);
        this.f6874e = c0726o;
        c0726o.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f6873d = new A6.j(this, 1);
        Context context2 = getContext();
        int[] iArr = AbstractC0454a.f5047l;
        D0.j R4 = D0.j.R(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) R4.f331i;
        I.T.h(this, getContext(), iArr, attributeSet, (TypedArray) R4.f331i, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(O6.g.M(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(R4.I(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0731q0.c(typedArray.getInt(3, -1), null));
                }
                R4.W();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(O6.g.M(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            R4.W();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            R4.W();
            throw th;
        }
    }

    private C0739v getEmojiTextViewHelper() {
        if (this.f6876l == null) {
            this.f6876l = new C0739v(this);
        }
        return this.f6876l;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Z z7 = this.f6875i;
        if (z7 != null) {
            z7.b();
        }
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            c0726o.a();
        }
        A6.j jVar = this.f6873d;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P0.f.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        A6.j jVar = this.f6873d;
        if (jVar != null) {
            return (ColorStateList) jVar.f118f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        A6.j jVar = this.f6873d;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f119g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6875i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6875i.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        O6.g.W(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        A6.j jVar = this.f6873d;
        if (jVar != null) {
            if (jVar.f116d) {
                jVar.f116d = false;
            } else {
                jVar.f116d = true;
                jVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6875i;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6875i;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(P0.f.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6874e;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        A6.j jVar = this.f6873d;
        if (jVar != null) {
            jVar.f118f = colorStateList;
            jVar.f114b = true;
            jVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        A6.j jVar = this.f6873d;
        if (jVar != null) {
            jVar.f119g = mode;
            jVar.f115c = true;
            jVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z7 = this.f6875i;
        z7.l(colorStateList);
        z7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z7 = this.f6875i;
        z7.m(mode);
        z7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z7 = this.f6875i;
        if (z7 != null) {
            z7.g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(O6.g.M(getContext(), i2));
    }
}
