package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.w;
import l5.f;
import q3.k0;
import r5.a;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class CheckableImageButton extends w implements Checkable {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f1929j = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public boolean f1930g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1931h;
    public boolean i;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.imageButtonStyle);
        this.f1931h = true;
        this.i = true;
        k0.k(this, new f(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1930g;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f1930g ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1929j) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f7877d);
        setChecked(aVar.f6614f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f6614f = this.f1930g;
        return aVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f1931h != z3) {
            this.f1931h = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f1931h || this.f1930g == z3) {
            return;
        }
        this.f1930g = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.i = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.i) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1930g);
    }
}
