package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import defpackage.fhp;
import defpackage.fjw;
import defpackage.fny;
import defpackage.fob;
import defpackage.frj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialDivider extends View {
    private final fob a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.a = new fob();
        TypedArray a = fjw.a(context2, attributeSet, fhp.a, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.b = a.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.d = a.getDimensionPixelOffset(2, 0);
        this.e = a.getDimensionPixelOffset(1, 0);
        a(fny.e(context2, a, 0).getDefaultColor());
        a.recycle();
    }

    public final void a(int i) {
        if (this.c != i) {
            this.c = i;
            this.a.M(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.e : this.d;
        if (z) {
            width = getWidth();
            i = this.d;
        } else {
            width = getWidth();
            i = this.e;
        }
        int i3 = width - i;
        fob fobVar = this.a;
        fobVar.setBounds(i2, 0, i3, getBottom() - getTop());
        fobVar.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
