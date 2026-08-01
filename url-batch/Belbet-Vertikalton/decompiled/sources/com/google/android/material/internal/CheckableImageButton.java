package com.google.android.material.internal;

import H0.a;
import H0.c;
import M.P;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import n.C0310y;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0310y implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2436g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f2437d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2438f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winpower.neonfit.R.attr.imageButtonStyle);
        this.e = true;
        this.f2438f = true;
        P.l(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2437d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f2437d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f2436g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f1148a);
        setChecked(cVar.f461c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f461c = this.f2437d;
        return cVar;
    }

    public void setCheckable(boolean z2) {
        if (this.e != z2) {
            this.e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.e || this.f2437d == z2) {
            return;
        }
        this.f2437d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2438f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2438f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2437d);
    }
}
