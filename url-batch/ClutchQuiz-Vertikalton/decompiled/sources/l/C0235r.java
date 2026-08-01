package l;

import K.C0012m;
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
import com.clutchquizarena.app.R;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235r extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final C0231p f3032b;

    /* renamed from: c, reason: collision with root package name */
    public final X f3033c;
    public C0245w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0235r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        R0.a(context);
        Q0.a(this, getContext());
        X x2 = new X(this);
        this.f3033c = x2;
        x2.f(attributeSet, R.attr.checkedTextViewStyle);
        x2.b();
        C0231p c0231p = new C0231p(this);
        this.f3032b = c0231p;
        c0231p.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f3031a = new h0.d(this);
        Context context2 = getContext();
        int[] iArr = f.a.f2117l;
        C0012m r2 = C0012m.r(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) r2.f423c;
        K.S.k(this, getContext(), iArr, attributeSet, (TypedArray) r2.f423c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(T.d.t(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0224l0.b(typedArray.getInt(3, -1), null));
                }
                r2.t();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(T.d.t(getContext(), resourceId));
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

    private C0245w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0245w(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        X x2 = this.f3033c;
        if (x2 != null) {
            x2.b();
        }
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            c0231p.a();
        }
        h0.d dVar = this.f3031a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f632a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h0.d dVar = this.f3031a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2577e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h0.d dVar = this.f3031a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2578f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3033c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3033c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.g.h(editorInfo, onCreateInputConnection, this);
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
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h0.d dVar = this.f3031a;
        if (dVar != null) {
            if (dVar.f2576c) {
                dVar.f2576c = false;
            } else {
                dVar.f2576c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3033c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3033c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A.c.L0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3032b;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f3031a;
        if (dVar != null) {
            dVar.f2577e = colorStateList;
            dVar.f2574a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f3031a;
        if (dVar != null) {
            dVar.f2578f = mode;
            dVar.f2575b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3033c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3033c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3033c;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(T.d.t(getContext(), i));
    }
}
