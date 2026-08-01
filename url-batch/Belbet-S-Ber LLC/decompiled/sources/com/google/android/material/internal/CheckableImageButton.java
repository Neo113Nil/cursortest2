package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.n;
import i2.b;
import i2.c;
import l.v;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class CheckableImageButton extends v implements Checkable {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1171m = {R.attr.state_checked};
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1172j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1173k;

    /* renamed from: l, reason: collision with root package name */
    public b f1174l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gdmhkmf.belbet.R.attr.imageButtonStyle);
        this.f1172j = true;
        this.f1173k = true;
        p0.m(this, new n(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1171m) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f1174l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f3386f);
        setChecked(cVar.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.h = this.i;
        return cVar;
    }

    public void setCheckable(boolean z4) {
        if (this.f1172j != z4) {
            this.f1172j = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f1172j || this.i == z4) {
            return;
        }
        this.i = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z4) {
        b bVar;
        boolean isFocusable = isFocusable();
        super.setFocusable(z4);
        if (isFocusable == z4 || (bVar = this.f1174l) == null) {
            return;
        }
        bVar.a();
    }

    public void setOnFocusableChangedListener(b bVar) {
        this.f1174l = bVar;
    }

    public void setPressable(boolean z4) {
        this.f1173k = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f1173k) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }
}
