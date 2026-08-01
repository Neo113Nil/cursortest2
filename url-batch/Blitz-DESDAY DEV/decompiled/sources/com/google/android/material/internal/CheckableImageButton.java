package com.google.android.material.internal;

import F0.a;
import F0.c;
import M.Q;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0222y;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0222y implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1929g = {R.attr.state_checked};
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1930e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1931f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.neondrop.R.attr.imageButtonStyle);
        this.f1930e = true;
        this.f1931f = true;
        Q.l(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1929g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f802a);
        setChecked(cVar.f240c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f240c = this.d;
        return cVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1930e != z2) {
            this.f1930e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1930e || this.d == z2) {
            return;
        }
        this.d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1931f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1931f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
