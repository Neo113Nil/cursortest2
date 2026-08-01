package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.j;
import e2.a;
import l.y;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class CheckableImageButton extends y implements Checkable {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f979l = {R.attr.state_checked};
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f980j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f981k;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.imageButtonStyle);
        this.f980j = true;
        this.f981k = true;
        l0.m(this, new j(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f979l) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f3175f);
        setChecked(aVar.f1171h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f1171h = this.i;
        return aVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f980j != z3) {
            this.f980j = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f980j || this.i == z3) {
            return;
        }
        this.i = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.f981k = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f981k) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }
}
