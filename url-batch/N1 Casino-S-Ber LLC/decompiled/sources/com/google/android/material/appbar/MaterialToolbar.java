package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.derinko.gbini.n1casino.R;
import defpackage.ct;
import defpackage.d20;
import defpackage.e70;
import defpackage.ja;
import defpackage.o8;
import defpackage.vx;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] h0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer c0;
    public boolean d0;
    public boolean e0;
    public ImageView.ScaleType f0;
    public Boolean g0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray W = o8.W(context2, attributeSet, vx.B, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (W.hasValue(2)) {
            setNavigationIconTint(W.getColor(2, -1));
        }
        this.d0 = W.getBoolean(6, false);
        this.e0 = W.getBoolean(5, false);
        int i = W.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = h0;
            if (i < scaleTypeArr.length) {
                this.f0 = scaleTypeArr[i];
            }
        }
        if (W.hasValue(0)) {
            this.g0 = Boolean.valueOf(W.getBoolean(0, false));
        }
        W.recycle();
        d20 a = d20.g(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).a();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : zo.r(background);
        if (valueOf != null) {
            ct ctVar = new ct(a);
            ctVar.r(valueOf);
            ctVar.n(context2);
            ctVar.q(getElevation());
            setBackground(ctVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f0;
    }

    public Integer getNavigationIconTint() {
        return this.c0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ct) {
            o8.m0(this, (ct) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ja jaVar = zo.m;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.d0 || this.e0) {
            ArrayList w = zo.w(this, getTitle());
            TextView textView = w.isEmpty() ? null : (TextView) Collections.min(w, jaVar);
            ArrayList w2 = zo.w(this, getSubtitle());
            TextView textView2 = w2.isEmpty() ? null : (TextView) Collections.max(w2, jaVar);
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
                if (this.d0 && textView != null) {
                    w(textView, pair);
                }
                if (this.e0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.g0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ct) {
            ((ct) background).q(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.g0;
        if (bool == null || bool.booleanValue() != z) {
            this.g0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f0 != scaleType) {
            this.f0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.c0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.c0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.c0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
