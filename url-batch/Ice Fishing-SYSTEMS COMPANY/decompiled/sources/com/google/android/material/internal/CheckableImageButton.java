package com.google.android.material.internal;

import G0.f;
import O.X;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.icefishing.icefishingliveapp.C5284R;
import m.C4766w;
import w3.C5162a;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C4766w implements Checkable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f36186z = {R.attr.state_checked};

    /* renamed from: w, reason: collision with root package name */
    public boolean f36187w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f36188x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f36189y;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.imageButtonStyle);
        this.f36188x = true;
        this.f36189y = true;
        X.o(this, new f(3, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36187w;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f36187w ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f36186z) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5162a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5162a c5162a = (C5162a) parcelable;
        super.onRestoreInstanceState(c5162a.f3318n);
        setChecked(c5162a.f41594v);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C5162a c5162a = new C5162a(super.onSaveInstanceState());
        c5162a.f41594v = this.f36187w;
        return c5162a;
    }

    public void setCheckable(boolean z8) {
        if (this.f36188x != z8) {
            this.f36188x = z8;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (!this.f36188x || this.f36187w == z8) {
            return;
        }
        this.f36187w = z8;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z8) {
        this.f36189y = z8;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        if (this.f36189y) {
            super.setPressed(z8);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36187w);
    }
}
