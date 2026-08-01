package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.aa;
import defpackage.ba;
import defpackage.l4;
import defpackage.o7;
import defpackage.x80;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class CheckableImageButton extends l4 implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;
    public aa l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.derinko.gbini.n1casino.R.attr.imageButtonStyle);
        this.j = true;
        this.k = true;
        x80.m(this, new o7(2, this));
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
        if (!(parcelable instanceof ba)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ba baVar = (ba) parcelable;
        super.onRestoreInstanceState(baVar.f);
        setChecked(baVar.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ba baVar = new ba(super.onSaveInstanceState());
        baVar.h = this.i;
        return baVar;
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
        aa aaVar;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (aaVar = this.l) == null) {
            return;
        }
        aaVar.b();
    }

    public void setOnFocusableChangedListener(aa aaVar) {
        this.l = aaVar;
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
