package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.e5;
import defpackage.hb;
import defpackage.hm0;
import defpackage.ib;
import defpackage.m8;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class CheckableImageButton extends e5 implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;
    public hb l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.trembin.nirefon.betfury.R.attr.imageButtonStyle);
        this.j = true;
        this.k = true;
        hm0.m(this, new m8(2, this));
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
        if (!(parcelable instanceof ib)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ib ibVar = (ib) parcelable;
        super.onRestoreInstanceState(ibVar.f);
        setChecked(ibVar.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ib ibVar = new ib(super.onSaveInstanceState());
        ibVar.h = this.i;
        return ibVar;
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
        hb hbVar;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (hbVar = this.l) == null) {
            return;
        }
        hbVar.a();
    }

    public void setOnFocusableChangedListener(hb hbVar) {
        this.l = hbVar;
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
