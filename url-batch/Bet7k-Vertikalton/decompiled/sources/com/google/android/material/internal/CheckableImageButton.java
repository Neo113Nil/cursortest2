package com.google.android.material.internal;

import B0.a;
import B0.c;
import K.T;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0272z;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0272z implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1718g = {R.attr.state_checked};
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1719e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1720f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.shotwins.games.R.attr.imageButtonStyle);
        this.f1719e = true;
        this.f1720f = true;
        T.l(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1718g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f674a);
        setChecked(cVar.f56c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f56c = this.d;
        return cVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1719e != z2) {
            this.f1719e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1719e || this.d == z2) {
            return;
        }
        this.d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1720f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1720f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
