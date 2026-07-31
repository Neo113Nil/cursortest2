package com.google.android.material.appbar;

import a6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.snovikpovik.vuevnxsj.R;
import d3.g;
import i3.f;
import java.util.ArrayList;
import java.util.Collections;
import r2.o;
import r5.k;
import w5.j;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1811b0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer T;
    public boolean U;
    public boolean V;
    public ImageView.ScaleType W;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f1812a0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray e8 = k.e(context2, attributeSet, f5.a.f2750p, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (e8.hasValue(2)) {
            setNavigationIconTint(e8.getColor(2, -1));
        }
        this.U = e8.getBoolean(4, false);
        this.V = e8.getBoolean(3, false);
        int i = e8.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1811b0;
            if (i < scaleTypeArr.length) {
                this.W = scaleTypeArr[i];
            }
        }
        if (e8.hasValue(0)) {
            this.f1812a0 = Boolean.valueOf(e8.getBoolean(0, false));
        }
        e8.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : (Build.VERSION.SDK_INT < 29 || !f.s(background)) ? null : f.g(background).getColorStateList();
        if (valueOf != null) {
            j jVar = new j();
            jVar.n(valueOf);
            jVar.k(context2);
            jVar.m(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    public Integer getNavigationIconTint() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            o.n0(this, (j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i, i8, i9, i10);
        g gVar = k.f6679c;
        int i11 = 0;
        ImageView imageView2 = null;
        if (this.U || this.V) {
            ArrayList d8 = k.d(this, getTitle());
            TextView textView = d8.isEmpty() ? null : (TextView) Collections.min(d8, gVar);
            ArrayList d9 = k.d(this, getSubtitle());
            TextView textView2 = d9.isEmpty() ? null : (TextView) Collections.max(d9, gVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i12 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i12 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i12 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.U && textView != null) {
                    t(textView, pair);
                }
                if (this.V && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i11);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i11++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1812a0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).m(f6);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f1812a0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f1812a0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.T != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.T.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.T = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.V != z3) {
            this.V = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.U != z3) {
            this.U = z3;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i8 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i8 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i8, textView.getBottom());
    }
}
