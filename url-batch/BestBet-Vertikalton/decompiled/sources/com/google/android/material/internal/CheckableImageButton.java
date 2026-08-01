package com.google.android.material.internal;

import D0.e;
import K.Q;
import L0.a;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0268x;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0268x implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2323g = {R.attr.state_checked};
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2325f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortunequest.neontrack.R.attr.imageButtonStyle);
        this.f2324e = true;
        this.f2325f = true;
        Q.l(this, new e(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f2323g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f986a);
        setChecked(aVar.f699c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f699c = this.d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f2324e != z2) {
            this.f2324e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f2324e || this.d == z2) {
            return;
        }
        this.d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2325f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2325f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
