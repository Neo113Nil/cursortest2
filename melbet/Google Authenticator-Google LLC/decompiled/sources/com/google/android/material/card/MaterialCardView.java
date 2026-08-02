package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.Cfor;
import defpackage.acu;
import defpackage.fgn;
import defpackage.fgo;
import defpackage.fhq;
import defpackage.fjw;
import defpackage.fny;
import defpackage.fob;
import defpackage.fog;
import defpackage.foy;
import defpackage.frj;
import defpackage.pz;
import defpackage.qa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialCardView extends pz implements Checkable, Cfor {
    private static final int[] h = {R.attr.state_checkable};
    private static final int[] i = {R.attr.state_checked};
    private static final int[] j = {R.attr.state_hovered};
    public final fgn f;
    public boolean g;
    private boolean k;

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(frj.a(context, attributeSet, i2, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_CardView), attributeSet, i2);
        foy f;
        this.g = false;
        this.k = true;
        TypedArray a = fjw.a(getContext(), attributeSet, fgo.a, i2, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_CardView, new int[0]);
        fgn fgnVar = new fgn(this, attributeSet, i2);
        this.f = fgnVar;
        fgnVar.e(((qa) this.e.a).e);
        fgnVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        fgnVar.i();
        fgnVar.p = fny.e(fgnVar.b.getContext(), a, 11);
        if (fgnVar.p == null) {
            fgnVar.p = ColorStateList.valueOf(-1);
        }
        fgnVar.j = a.getDimensionPixelSize(12, 0);
        boolean z = a.getBoolean(0, false);
        fgnVar.u = z;
        fgnVar.b.setLongClickable(z);
        fgnVar.n = fny.e(fgnVar.b.getContext(), a, 6);
        Drawable f2 = fny.f(fgnVar.b.getContext(), a, 2);
        if (f2 != null) {
            fgnVar.l = f2.mutate();
            fgnVar.l.setTintList(fgnVar.n);
            fgnVar.f(fgnVar.b.g, false);
        } else {
            fgnVar.l = fgn.a;
        }
        LayerDrawable layerDrawable = fgnVar.r;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.apps.authenticator2.R.id.mtrl_card_checked_layer_id, fgnVar.l);
        }
        fgnVar.h = a.getDimensionPixelSize(5, 0);
        fgnVar.g = a.getDimensionPixelSize(4, 0);
        fgnVar.i = a.getInteger(3, 8388661);
        fgnVar.m = fny.e(fgnVar.b.getContext(), a, 7);
        if (fgnVar.m == null) {
            fgnVar.m = ColorStateList.valueOf(fhq.c(fgnVar.b, com.google.android.apps.authenticator2.R.attr.colorControlHighlight));
        }
        ColorStateList e = fny.e(fgnVar.b.getContext(), a, 1);
        fgnVar.e.M(e == null ? ColorStateList.valueOf(0) : e);
        Drawable drawable = fgnVar.q;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(fgnVar.m);
        }
        fgnVar.d.L(((View) fgnVar.b.e.b).getElevation());
        fgnVar.e.S(fgnVar.j, fgnVar.p);
        super.setBackgroundDrawable(fgnVar.d(fgnVar.d));
        fgnVar.k = fgnVar.n() ? fgnVar.c() : fgnVar.e;
        fgnVar.b.setForeground(fgnVar.d(fgnVar.k));
        if (fgnVar.f == -1.0f && (f = foy.f(fgnVar.b.getContext(), a, 8)) != null) {
            acu q = fny.q(fgnVar.b.getContext(), com.google.android.apps.authenticator2.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            fgnVar.d.K(q);
            fgnVar.e.K(q);
            fob fobVar = fgnVar.s;
            if (fobVar != null) {
                fobVar.K(q);
            }
            fgnVar.g(f);
        }
        a.recycle();
    }

    @Override // defpackage.Cfor
    public final void bz(fog fogVar) {
        RectF rectF = new RectF();
        fgn fgnVar = this.f;
        rectF.set(fgnVar.d.getBounds());
        setClipToOutline(fogVar.g(rectF));
        fgnVar.g(fogVar);
    }

    public final void c(float f) {
        qa qaVar = (qa) this.e.a;
        if (f != qaVar.a) {
            qaVar.a = f;
            qaVar.a(null);
            qaVar.invalidateSelf();
        }
        fgn fgnVar = this.f;
        fgnVar.f = f;
        fgnVar.g(fgnVar.o.a().c(f));
        fgnVar.k.invalidateSelf();
        if (fgnVar.m() || fgnVar.l()) {
            fgnVar.i();
        }
        if (fgnVar.m()) {
            if (!fgnVar.t) {
                super.setBackgroundDrawable(fgnVar.d(fgnVar.d));
            }
            fgnVar.b.setForeground(fgnVar.d(fgnVar.k));
        }
    }

    public final boolean e() {
        fgn fgnVar = this.f;
        return fgnVar != null && fgnVar.u;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fgn fgnVar = this.f;
        fgnVar.h();
        fhq.y(this, fgnVar.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 8);
        if (e()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        if (this.g) {
            mergeDrawableStates(onCreateDrawableState, i);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                mergeDrawableStates(onCreateDrawableState, PRESSED_STATE_SET);
            }
            if (isHovered()) {
                mergeDrawableStates(onCreateDrawableState, j);
            }
            if (isEnabled()) {
                mergeDrawableStates(onCreateDrawableState, ENABLED_STATE_SET);
            }
            if (isFocused()) {
                mergeDrawableStates(onCreateDrawableState, FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                mergeDrawableStates(onCreateDrawableState, SELECTED_STATE_SET);
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.g);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.g);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        fgn fgnVar = this.f;
        if (fgnVar.r != null) {
            MaterialCardView materialCardView = fgnVar.b;
            if (materialCardView.a) {
                float b = fgnVar.b();
                i4 = (int) Math.ceil(b + b);
                float a = fgnVar.a();
                i5 = (int) Math.ceil(a + a);
            } else {
                i4 = 0;
                i5 = 0;
            }
            int i6 = fgnVar.k() ? ((measuredWidth - fgnVar.g) - fgnVar.h) - i5 : fgnVar.g;
            int i7 = fgnVar.j() ? fgnVar.g : ((measuredHeight - fgnVar.g) - fgnVar.h) - i4;
            int i8 = fgnVar.k() ? fgnVar.g : ((measuredWidth - fgnVar.g) - fgnVar.h) - i5;
            int i9 = fgnVar.j() ? ((measuredHeight - fgnVar.g) - fgnVar.h) - i4 : fgnVar.g;
            int layoutDirection = materialCardView.getLayoutDirection();
            fgnVar.r.setLayerInset(2, layoutDirection != 1 ? i6 : i8, i9, layoutDirection == 1 ? i6 : i8, i7);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            fgn fgnVar = this.f;
            if (!fgnVar.t) {
                fgnVar.t = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.g != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        fgn fgnVar = this.f;
        if (fgnVar != null) {
            fgnVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (e() && isEnabled()) {
            this.g = !this.g;
            refreshDrawableState();
            fgn fgnVar = this.f;
            Drawable drawable = fgnVar.q;
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                int i2 = bounds.bottom;
                fgnVar.q.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
                fgnVar.q.setBounds(bounds.left, bounds.top, bounds.right, i2);
            }
            fgnVar.f(this.g, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
