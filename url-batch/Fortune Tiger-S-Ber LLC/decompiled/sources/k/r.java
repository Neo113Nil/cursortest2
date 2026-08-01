package k;

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
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r extends CheckedTextView {

    /* renamed from: f, reason: collision with root package name */
    public final c1.d f2634f;
    public final b1.b g;
    public final v0 h;

    /* renamed from: i, reason: collision with root package name */
    public v f2635i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        p2.a(context);
        o2.a(this, getContext());
        v0 v0Var = new v0(this);
        this.h = v0Var;
        v0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        v0Var.b();
        b1.b bVar = new b1.b(this);
        this.g = bVar;
        bVar.l(attributeSet, R.attr.checkedTextViewStyle);
        this.f2634f = new c1.d(this);
        Context context2 = getContext();
        int[] iArr = e.a.f1503l;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) r3.c;
        k0.j0.l(this, getContext(), iArr, attributeSet, (TypedArray) r3.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(k3.m.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(r3.h(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(j1.b(typedArray.getInt(3, -1), null));
                }
                r3.t();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(k3.m.w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            r3.t();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            r3.t();
            throw th;
        }
    }

    private v getEmojiTextViewHelper() {
        if (this.f2635i == null) {
            this.f2635i = new v(this);
        }
        return this.f2635i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
        c1.d dVar = this.f2634f;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o0.h ? ((o0.h) customSelectionActionModeCallback).f2981a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.g;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.g;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        c1.d dVar = this.f2634f;
        if (dVar != null) {
            return (ColorStateList) dVar.f1001e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        c1.d dVar = this.f2634f;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f1002f;
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
        k3.m.I(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        c1.d dVar = this.f2634f;
        if (dVar != null) {
            if (dVar.c) {
                dVar.c = false;
            } else {
                dVar.c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l0.g.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        c1.d dVar = this.f2634f;
        if (dVar != null) {
            dVar.f1001e = colorStateList;
            dVar.f998a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        c1.d dVar = this.f2634f;
        if (dVar != null) {
            dVar.f1002f = mode;
            dVar.f999b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.h;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.h;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.g(context, i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(k3.m.w(getContext(), i4));
    }
}
