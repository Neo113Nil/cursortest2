package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.c5;
import defpackage.e90;
import defpackage.x9;
import defpackage.y9;
import defpackage.z9;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class CheckableImageButton extends c5 implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;
    public y9 l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.awerser.monnit.betplay.R.attr.imageButtonStyle);
        this.j = true;
        this.k = true;
        e90.m(this, new x9(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), m) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z9 z9Var = (z9) parcelable;
        super.onRestoreInstanceState(z9Var.getSuperState());
        setChecked(z9Var.f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z9 z9Var = new z9(super.onSaveInstanceState());
        z9Var.f = this.i;
        return z9Var;
    }

    public void setCheckable(boolean z) {
        if (this.j != z) {
            this.j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.j || this.i == z) {
            return;
        }
        this.i = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        y9 y9Var;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (y9Var = this.l) == null) {
            return;
        }
        y9Var.b();
    }

    public void setOnFocusableChangedListener(y9 y9Var) {
        this.l = y9Var;
    }

    public void setPressable(boolean z) {
        this.k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }
}
