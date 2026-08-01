package com.google.android.material.internal;

import a2.a;
import a2.b;
import a2.d;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import k.w;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class CheckableImageButton extends w implements Checkable {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1363m = {R.attr.state_checked};

    /* renamed from: i, reason: collision with root package name */
    public boolean f1364i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1365j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1366k;

    /* renamed from: l, reason: collision with root package name */
    public b f1367l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.imageButtonStyle);
        this.f1365j = true;
        this.f1366k = true;
        j0.m(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1364i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        return this.f1364i ? View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), f1363m) : super.onCreateDrawableState(i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f1367l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f3016f);
        setChecked(dVar.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.h = this.f1364i;
        return dVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f1365j != z3) {
            this.f1365j = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f1365j || this.f1364i == z3) {
            return;
        }
        this.f1364i = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z3) {
        b bVar;
        boolean isFocusable = isFocusable();
        super.setFocusable(z3);
        if (isFocusable == z3 || (bVar = this.f1367l) == null) {
            return;
        }
        bVar.a();
    }

    public void setOnFocusableChangedListener(b bVar) {
        this.f1367l = bVar;
    }

    public void setPressable(boolean z3) {
        this.f1366k = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f1366k) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1364i);
    }
}
