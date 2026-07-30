package m;

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
import com.google.android.gms.internal.ads.C2728Pl;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public final class r extends CheckedTextView {

    /* renamed from: n, reason: collision with root package name */
    public final b8.j f39486n;

    /* renamed from: u, reason: collision with root package name */
    public final C2728Pl f39487u;

    /* renamed from: v, reason: collision with root package name */
    public final V f39488v;

    /* renamed from: w, reason: collision with root package name */
    public C4764v f39489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        O0.a(context);
        N0.a(getContext(), this);
        V v6 = new V(this);
        this.f39488v = v6;
        v6.f(attributeSet, C5284R.attr.checkedTextViewStyle);
        v6.b();
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39487u = c2728Pl;
        c2728Pl.d(attributeSet, C5284R.attr.checkedTextViewStyle);
        this.f39486n = new b8.j(this, 1);
        Context context2 = getContext();
        int[] iArr = AbstractC4518a.f37828l;
        Q0 p6 = Q0.p(context2, attributeSet, iArr, C5284R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        O.X.n(this, getContext(), iArr, attributeSet, (TypedArray) p6.f39326c, C5284R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(com.bumptech.glide.f.h(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(p6.f(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC4742j0.b(typedArray.getInt(3, -1), null));
                }
                p6.q();
                getEmojiTextViewHelper().a(attributeSet, C5284R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(com.bumptech.glide.f.h(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            p6.q();
            getEmojiTextViewHelper().a(attributeSet, C5284R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            p6.q();
            throw th;
        }
    }

    private C4764v getEmojiTextViewHelper() {
        if (this.f39489w == null) {
            this.f39489w = new C4764v(this);
        }
        return this.f39489w;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        V v6 = this.f39488v;
        if (v6 != null) {
            v6.b();
        }
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        b8.j jVar = this.f39486n;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        b8.j jVar = this.f39486n;
        if (jVar != null) {
            return (ColorStateList) jVar.f5604f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        b8.j jVar = this.f39486n;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f5605g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39488v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39488v.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w8.a.g(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().b(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        b8.j jVar = this.f39486n;
        if (jVar != null) {
            if (jVar.f5602d) {
                jVar.f5602d = false;
            } else {
                jVar.f5602d = true;
                jVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39488v;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v6 = this.f39488v;
        if (v6 != null) {
            v6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().c(z8);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39487u;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        b8.j jVar = this.f39486n;
        if (jVar != null) {
            jVar.f5604f = colorStateList;
            jVar.f5600b = true;
            jVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        b8.j jVar = this.f39486n;
        if (jVar != null) {
            jVar.f5605g = mode;
            jVar.f5601c = true;
            jVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v6 = this.f39488v;
        v6.l(colorStateList);
        v6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v6 = this.f39488v;
        v6.m(mode);
        v6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v6 = this.f39488v;
        if (v6 != null) {
            v6.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(com.bumptech.glide.f.h(getContext(), i));
    }
}
