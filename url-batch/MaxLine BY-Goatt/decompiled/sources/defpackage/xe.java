package defpackage;

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
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xe extends CheckedTextView {
    public final ye m;
    public final te n;
    public final xg o;
    public wf p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        vx2.a(context);
        xw2.a(this, getContext());
        xg xgVar = new xg(this);
        this.o = xgVar;
        xgVar.f(attributeSet, R.attr.checkedTextViewStyle);
        xgVar.b();
        te teVar = new te(this);
        this.n = teVar;
        teVar.e(attributeSet, R.attr.checkedTextViewStyle);
        this.m = new ye(this);
        Context context2 = getContext();
        int[] iArr = b62.l;
        mh z = mh.z(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) z.n;
        e53.h(this, getContext(), iArr, attributeSet, (TypedArray) z.n, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(j8.F(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(z.p(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(he0.b(typedArray.getInt(3, -1), null));
                }
                z.B();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(j8.F(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            z.B();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            z.B();
            throw th;
        }
    }

    private wf getEmojiTextViewHelper() {
        if (this.p == null) {
            this.p = new wf(this);
        }
        return this.p;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.b();
        }
        te teVar = this.n;
        if (teVar != null) {
            teVar.a();
        }
        ye yeVar = this.m;
        if (yeVar != null) {
            yeVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ti2.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.n;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.n;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        ye yeVar = this.m;
        if (yeVar != null) {
            return (ColorStateList) yeVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        ye yeVar = this.m;
        if (yeVar != null) {
            return (PorterDuff.Mode) yeVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.o.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.o.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        zm3.F(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.n;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.n;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        ye yeVar = this.m;
        if (yeVar != null) {
            if (yeVar.e) {
                yeVar.e = false;
            } else {
                yeVar.e = true;
                yeVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ti2.n(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.n;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.n;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        ye yeVar = this.m;
        if (yeVar != null) {
            yeVar.a = colorStateList;
            yeVar.c = true;
            yeVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        ye yeVar = this.m;
        if (yeVar != null) {
            yeVar.b = mode;
            yeVar.d = true;
            yeVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        xg xgVar = this.o;
        xgVar.k(colorStateList);
        xgVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.o;
        xgVar.l(mode);
        xgVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(j8.F(getContext(), i));
    }
}
