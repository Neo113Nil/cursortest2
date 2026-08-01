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
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import u0.C0372k;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258s extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f3464a;

    /* renamed from: b, reason: collision with root package name */
    public final C0252p f3465b;

    /* renamed from: c, reason: collision with root package name */
    public final W f3466c;
    public C0266w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0258s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        R0.a(context);
        Q0.a(this, getContext());
        W w2 = new W(this);
        this.f3466c = w2;
        w2.f(attributeSet, R.attr.checkedTextViewStyle);
        w2.b();
        C0252p c0252p = new C0252p(this);
        this.f3465b = c0252p;
        c0252p.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f3464a = new j0.d(this);
        Context context2 = getContext();
        int[] iArr = f.a.f2522l;
        C0372k j2 = C0372k.j(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) j2.f4191b;
        K.Q.k(this, getContext(), iArr, attributeSet, (TypedArray) j2.f4191b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0091d.j(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(j2.c(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0245l0.b(typedArray.getInt(3, -1), null));
                }
                j2.l();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0091d.j(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            j2.l();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            j2.l();
            throw th;
        }
    }

    private C0266w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0266w(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W w2 = this.f3466c;
        if (w2 != null) {
            w2.b();
        }
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            c0252p.a();
        }
        j0.d dVar = this.f3464a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f883a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        j0.d dVar = this.f3464a;
        if (dVar != null) {
            return (ColorStateList) dVar.f3081e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        j0.d dVar = this.f3464a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3082f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3466c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3466c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b1.g.u(editorInfo, onCreateInputConnection, this);
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
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        j0.d dVar = this.f3464a;
        if (dVar != null) {
            if (dVar.f3080c) {
                dVar.f3080c = false;
            } else {
                dVar.f3080c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3466c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3466c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.d.x0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3465b;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        j0.d dVar = this.f3464a;
        if (dVar != null) {
            dVar.f3081e = colorStateList;
            dVar.f3078a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        j0.d dVar = this.f3464a;
        if (dVar != null) {
            dVar.f3082f = mode;
            dVar.f3079b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3466c;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3466c;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w2 = this.f3466c;
        if (w2 != null) {
            w2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0091d.j(getContext(), i));
    }
}
