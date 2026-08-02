package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import defpackage.ffg;
import defpackage.fhq;
import defpackage.fhr;
import defpackage.fjw;
import defpackage.fjx;
import defpackage.fob;
import defpackage.fog;
import defpackage.frj;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] A = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private boolean B;
    private boolean C;
    private ImageView.ScaleType D;
    private Boolean E;
    public Integer z;

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray a = fjw.a(context2, attributeSet, ffg.c, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (a.hasValue(2)) {
            this.z = Integer.valueOf(a.getColor(2, -1));
            Drawable e = e();
            if (e != null) {
                q(e);
            }
        }
        this.B = a.getBoolean(6, false);
        this.C = a.getBoolean(5, false);
        int i2 = a.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.D = A[i2];
        }
        if (a.hasValue(0)) {
            this.E = Boolean.valueOf(a.getBoolean(0, false));
        }
        a.recycle();
        fog fogVar = new fog(fog.k(context2, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar));
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : fhr.b(background);
        if (valueOf != null) {
            fob fobVar = new fob(fogVar);
            fobVar.M(valueOf);
            fobVar.J(context2);
            fobVar.L(getElevation());
            setBackground(fobVar);
        }
    }

    private final void B(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fhq.x(this);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.B || this.C) {
            List c = fjx.c(this, this.o);
            TextView textView = c.isEmpty() ? null : (TextView) Collections.min(c, fjx.a);
            List c2 = fjx.c(this, this.p);
            TextView textView2 = c2.isEmpty() ? null : (TextView) Collections.max(c2, fjx.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.B && textView != null) {
                    B(textView, pair);
                }
                if (this.C && textView2 != null) {
                    B(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.d;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.E;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.D;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void q(Drawable drawable) {
        if (drawable != null && this.z != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.z.intValue());
        }
        super.q(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fhq.w(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
