package com.google.android.material.appbar;

import a2.p;
import a2.q;
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
import com.gglhk.bofio.fortunetiger.R;
import g2.j;
import g2.o;
import java.util.ArrayList;
import java.util.Collections;
import k3.m;
import l2.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1165e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;
    public boolean a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1166b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageView.ScaleType f1167c0;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f1168d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray e4 = p.e(context2, attributeSet, l1.a.f2878x, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (e4.hasValue(2)) {
            setNavigationIconTint(e4.getColor(2, -1));
        }
        this.a0 = e4.getBoolean(6, false);
        this.f1166b0 = e4.getBoolean(5, false);
        int i4 = e4.getInt(1, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1165e0;
            if (i4 < scaleTypeArr.length) {
                this.f1167c0 = scaleTypeArr[i4];
            }
        }
        if (e4.hasValue(0)) {
            this.f1168d0 = Boolean.valueOf(e4.getBoolean(0, false));
        }
        e4.recycle();
        o a4 = o.f(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).a();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : m0.a.i(background);
        if (valueOf != null) {
            j jVar = new j(a4);
            jVar.q(valueOf);
            jVar.m(context2);
            jVar.p(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1167c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            m.S(this, (j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i4, i5, i6, i7);
        q qVar = p.c;
        int i8 = 0;
        ImageView imageView2 = null;
        if (this.a0 || this.f1166b0) {
            ArrayList d4 = p.d(this, getTitle());
            TextView textView = d4.isEmpty() ? null : (TextView) Collections.min(d4, qVar);
            ArrayList d5 = p.d(this, getSubtitle());
            TextView textView2 = d5.isEmpty() ? null : (TextView) Collections.max(d5, qVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i9 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i9 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i9 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.a0 && textView != null) {
                    u(textView, pair);
                }
                if (this.f1166b0 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i8 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i8);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i8++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1168d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1167c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).p(f4);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f1168d0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f1168d0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1167c0 != scaleType) {
            this.f1167c0 = scaleType;
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

    public void setNavigationIconTint(int i4) {
        this.W = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f1166b0 != z3) {
            this.f1166b0 = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.a0 != z3) {
            this.a0 = z3;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i4 += max;
            i5 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i4, textView.getTop(), i5, textView.getBottom());
    }
}
