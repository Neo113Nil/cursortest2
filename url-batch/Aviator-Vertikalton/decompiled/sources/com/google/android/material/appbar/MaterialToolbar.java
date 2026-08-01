package com.google.android.material.appbar;

import B0.o;
import B0.p;
import H0.g;
import K.L;
import K.X;
import M0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.fortuneink.neonpad.R;
import i1.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k.MenuC0200m;
import n0.AbstractC0303a;
import q1.d;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1734c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: U, reason: collision with root package name */
    public Integer f1735U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1736V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1737W;

    /* renamed from: a0, reason: collision with root package name */
    public ImageView.ScaleType f1738a0;

    /* renamed from: b0, reason: collision with root package name */
    public Boolean f1739b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f2 = o.f(context2, attributeSet, AbstractC0303a.f3646s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f2.hasValue(2)) {
            setNavigationIconTint(f2.getColor(2, -1));
        }
        this.f1736V = f2.getBoolean(4, false);
        this.f1737W = f2.getBoolean(3, false);
        int i = f2.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1734c0;
            if (i < scaleTypeArr.length) {
                this.f1738a0 = scaleTypeArr[i];
            }
        }
        if (f2.hasValue(0)) {
            this.f1739b0 = Boolean.valueOf(f2.getBoolean(0, false));
        }
        f2.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : m.l(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.j(valueOf);
            gVar.h(context2);
            WeakHashMap weakHashMap = X.f418a;
            gVar.i(L.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1738a0;
    }

    public Integer getNavigationIconTint() {
        return this.f1735U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC0200m;
        if (z2) {
            ((MenuC0200m) menu).w();
        }
        super.m(i);
        if (z2) {
            ((MenuC0200m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            d.V(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f1736V || this.f1737W) {
            ArrayList d2 = o.d(this, getTitle());
            boolean isEmpty = d2.isEmpty();
            p pVar = o.f149c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(d2, pVar);
            ArrayList d3 = o.d(this, getSubtitle());
            TextView textView2 = d3.isEmpty() ? null : (TextView) Collections.max(d3, pVar);
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
                if (this.f1736V && textView != null) {
                    x(textView, pair);
                }
                if (this.f1737W && textView2 != null) {
                    x(textView2, pair);
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
            Boolean bool = this.f1739b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1738a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f1739b0;
        if (bool == null || bool.booleanValue() != z2) {
            this.f1739b0 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1738a0 != scaleType) {
            this.f1738a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f1735U != null) {
            drawable = drawable.mutate();
            D.a.g(drawable, this.f1735U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f1735U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f1737W != z2) {
            this.f1737W = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f1736V != z2) {
            this.f1736V = z2;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
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
