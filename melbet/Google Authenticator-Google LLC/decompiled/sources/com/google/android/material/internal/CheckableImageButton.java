package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import defpackage.fim;
import defpackage.fin;
import defpackage.fio;
import defpackage.hz;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckableImageButton extends hz implements Checkable {
    private static final int[] e = {R.attr.state_checked};
    public boolean a;
    public boolean b;
    public boolean c;
    public fin d;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = true;
        yq.l(this, new fim(this));
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), e) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        this.d = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fio)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fio fioVar = (fio) parcelable;
        super.onRestoreInstanceState(fioVar.d);
        setChecked(fioVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        fio fioVar = new fio(super.onSaveInstanceState());
        fioVar.a = this.a;
        return fioVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setFocusable(boolean z) {
        fin finVar;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (finVar = this.d) == null) {
            return;
        }
        finVar.a();
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.c) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
