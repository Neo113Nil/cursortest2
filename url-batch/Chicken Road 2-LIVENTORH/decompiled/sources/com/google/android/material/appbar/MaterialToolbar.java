package com.google.android.material.appbar;

import a.y;
import a0.i;
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
import com.oriondriftchasers.arordrft.R;
import e2.o;
import java.util.ArrayList;
import java.util.Collections;
import l2.j;
import q2.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f791e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f792a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f793b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageView.ScaleType f794c0;
    public Boolean d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f2 = o.f(context2, attributeSet, n1.a.f2832y, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f2.hasValue(2)) {
            setNavigationIconTint(f2.getColor(2, -1));
        }
        this.f792a0 = f2.getBoolean(4, false);
        this.f793b0 = f2.getBoolean(3, false);
        int i = f2.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f791e0;
            if (i < scaleTypeArr.length) {
                this.f794c0 = scaleTypeArr[i];
            }
        }
        if (f2.hasValue(0)) {
            this.d0 = Boolean.valueOf(f2.getBoolean(0, false));
        }
        f2.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : y.C(background);
        if (valueOf != null) {
            j jVar = new j();
            jVar.q(valueOf);
            jVar.m(context2);
            jVar.p(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f794c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            h.a.k0(this, (j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i, i4, i5, i6);
        i iVar = o.f1236c;
        int i7 = 0;
        ImageView imageView2 = null;
        if (this.f792a0 || this.f793b0) {
            ArrayList e4 = o.e(this, getTitle());
            TextView textView = e4.isEmpty() ? null : (TextView) Collections.min(e4, iVar);
            ArrayList e5 = o.e(this, getSubtitle());
            TextView textView2 = e5.isEmpty() ? null : (TextView) Collections.max(e5, iVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f792a0 && textView != null) {
                    u(textView, pair);
                }
                if (this.f793b0 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i7 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i7++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f794c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).p(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.d0;
        if (bool == null || bool.booleanValue() != z3) {
            this.d0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f794c0 != scaleType) {
            this.f794c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.W = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f793b0 != z3) {
            this.f793b0 = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f792a0 != z3) {
            this.f792a0 = z3;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i4 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i4, textView.getBottom());
    }
}
