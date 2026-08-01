package com.google.android.material.internal;

import B0.a;
import B0.c;
import K.X;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0300z;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0300z implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1916g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f1917d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1918e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1919f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckyarcade.spinthrow.R.attr.imageButtonStyle);
        this.f1918e = true;
        this.f1919f = true;
        X.l(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1917d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f1917d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1916g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f736a);
        setChecked(cVar.f64c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f64c = this.f1917d;
        return cVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1918e != z2) {
            this.f1918e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1918e || this.f1917d == z2) {
            return;
        }
        this.f1917d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1919f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1919f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1917d);
    }
}
