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
import l.C0230A;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0230A implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1938g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f1939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1940e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1941f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortuneink.neonpad.R.attr.imageButtonStyle);
        this.f1940e = true;
        this.f1941f = true;
        X.l(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1939d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f1939d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1938g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f735a);
        setChecked(cVar.f64c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f64c = this.f1939d;
        return cVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1940e != z2) {
            this.f1940e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1940e || this.f1939d == z2) {
            return;
        }
        this.f1939d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1941f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1941f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1939d);
    }
}
