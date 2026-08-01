package l;

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
import com.fortuneink.neonpad.R;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286t extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0288u f3442a;

    /* renamed from: b, reason: collision with root package name */
    public final C0280q f3443b;

    /* renamed from: c, reason: collision with root package name */
    public final C0249a0 f3444c;

    /* renamed from: d, reason: collision with root package name */
    public C0298z f3445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0286t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        U0.a(context);
        T0.a(this, getContext());
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3444c = c0249a0;
        c0249a0.f(attributeSet, R.attr.checkedTextViewStyle);
        c0249a0.b();
        C0280q c0280q = new C0280q(this);
        this.f3443b = c0280q;
        c0280q.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f3442a = new C0288u(this);
        Context context2 = getContext();
        int[] iArr = f.a.f2396l;
        T.r r2 = T.r.r(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) r2.f811c;
        K.X.k(this, getContext(), iArr, attributeSet, (TypedArray) r2.f811c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(q1.d.z(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0277o0.b(typedArray.getInt(3, -1), null));
                }
                r2.t();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(q1.d.z(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            r2.t();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            r2.t();
            throw th;
        }
    }

    private C0298z getEmojiTextViewHelper() {
        if (this.f3445d == null) {
            this.f3445d = new C0298z(this);
        }
        return this.f3445d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0249a0 c0249a0 = this.f3444c;
        if (c0249a0 != null) {
            c0249a0.b();
        }
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            c0280q.a();
        }
        C0288u c0288u = this.f3442a;
        if (c0288u != null) {
            c0288u.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f727a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0288u c0288u = this.f3442a;
        if (c0288u != null) {
            return c0288u.f3447a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0288u c0288u = this.f3442a;
        if (c0288u != null) {
            return c0288u.f3448b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3444c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3444c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i1.r.m(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0288u c0288u = this.f3442a;
        if (c0288u != null) {
            if (c0288u.f3451e) {
                c0288u.f3451e = false;
            } else {
                c0288u.f3451e = true;
                c0288u.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3444c;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3444c;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.d.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3443b;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0288u c0288u = this.f3442a;
        if (c0288u != null) {
            c0288u.f3447a = colorStateList;
            c0288u.f3449c = true;
            c0288u.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0288u c0288u = this.f3442a;
        if (c0288u != null) {
            c0288u.f3448b = mode;
            c0288u.f3450d = true;
            c0288u.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3444c;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3444c;
        c0249a0.m(mode);
        c0249a0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0249a0 c0249a0 = this.f3444c;
        if (c0249a0 != null) {
            c0249a0.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(q1.d.z(getContext(), i));
    }
}
