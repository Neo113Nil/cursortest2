package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.a8;
import defpackage.ic0;
import defpackage.na;
import defpackage.oa;
import defpackage.v4;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class CheckableImageButton extends v4 implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;
    public na l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.imageButtonStyle);
        this.j = true;
        this.k = true;
        ic0.m(this, new a8(2, this));
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
        if (!(parcelable instanceof oa)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oa oaVar = (oa) parcelable;
        super.onRestoreInstanceState(oaVar.f);
        setChecked(oaVar.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        oa oaVar = new oa(super.onSaveInstanceState());
        oaVar.h = this.i;
        return oaVar;
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
        na naVar;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (naVar = this.l) == null) {
            return;
        }
        naVar.b();
    }

    public void setOnFocusableChangedListener(na naVar) {
        this.l = naVar;
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
