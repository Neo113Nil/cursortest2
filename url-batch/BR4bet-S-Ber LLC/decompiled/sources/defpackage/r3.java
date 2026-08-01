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
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r3 extends CheckedTextView {
    public final s3 f;
    public final y1 g;
    public final x5 h;
    public u4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        g90.a(context);
        z80.a(this, getContext());
        x5 x5Var = new x5(this);
        this.h = x5Var;
        x5Var.f(attributeSet, R.attr.checkedTextViewStyle);
        x5Var.b();
        y1 y1Var = new y1(this);
        this.g = y1Var;
        y1Var.l(attributeSet, R.attr.checkedTextViewStyle);
        this.f = new s3(this);
        Context context2 = getContext();
        int[] iArr = z00.l;
        k6 z = k6.z(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) z.g;
        ic0.l(this, getContext(), iArr, attributeSet, (TypedArray) z.g, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(mz.m(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(z.n(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(gi.b(typedArray.getInt(3, -1), null));
                }
                z.B();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(mz.m(getContext(), resourceId));
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

    private u4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new u4(this);
        }
        return this.i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x5 x5Var = this.h;
        if (x5Var != null) {
            x5Var.b();
        }
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.a();
        }
        s3 s3Var = this.f;
        if (s3Var != null) {
            s3Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof w80 ? ((w80) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        s3 s3Var = this.f;
        if (s3Var != null) {
            return (ColorStateList) s3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        s3 s3Var = this.f;
        if (s3Var != null) {
            return (PorterDuff.Mode) s3Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kr.M(editorInfo, onCreateInputConnection, this);
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
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        s3 s3Var = this.f;
        if (s3Var != null) {
            if (s3Var.e) {
                s3Var.e = false;
            } else {
                s3Var.e = true;
                s3Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.h;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.h;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xf.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        s3 s3Var = this.f;
        if (s3Var != null) {
            s3Var.a = colorStateList;
            s3Var.c = true;
            s3Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        s3 s3Var = this.f;
        if (s3Var != null) {
            s3Var.b = mode;
            s3Var.d = true;
            s3Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.h;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.h;
        x5Var.m(mode);
        x5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x5 x5Var = this.h;
        if (x5Var != null) {
            x5Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(mz.m(getContext(), i));
    }
}
