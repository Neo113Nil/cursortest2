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
import b4.l;
import com.gdmhkmf.belbet.R;
import i2.o;
import java.util.ArrayList;
import java.util.Collections;
import o2.j;
import u2.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f902e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f903a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f904b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageView.ScaleType f905c0;
    public Boolean d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray e4 = o.e(context2, attributeSet, q1.a.C, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (e4.hasValue(2)) {
            setNavigationIconTint(e4.getColor(2, -1));
        }
        this.f903a0 = e4.getBoolean(6, false);
        this.f904b0 = e4.getBoolean(5, false);
        int i = e4.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f902e0;
            if (i < scaleTypeArr.length) {
                this.f905c0 = scaleTypeArr[i];
            }
        }
        if (e4.hasValue(0)) {
            this.d0 = Boolean.valueOf(e4.getBoolean(0, false));
        }
        e4.recycle();
        o2.o a5 = o2.o.g(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).a();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : l.t(background);
        if (valueOf != null) {
            j jVar = new j(a5);
            jVar.r(valueOf);
            jVar.n(context2);
            jVar.q(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f905c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            l.f0(this, (j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i, i4, i5, i6);
        a0.j jVar = o.f2064c;
        int i7 = 0;
        ImageView imageView2 = null;
        if (this.f903a0 || this.f904b0) {
            ArrayList d = o.d(this, getTitle());
            TextView textView = d.isEmpty() ? null : (TextView) Collections.min(d, jVar);
            ArrayList d5 = o.d(this, getSubtitle());
            TextView textView2 = d5.isEmpty() ? null : (TextView) Collections.max(d5, jVar);
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
                if (this.f903a0 && textView != null) {
                    u(textView, pair);
                }
                if (this.f904b0 && textView2 != null) {
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
            ImageView.ScaleType scaleType = this.f905c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).q(f5);
        }
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.d0;
        if (bool == null || bool.booleanValue() != z4) {
            this.d0 = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f905c0 != scaleType) {
            this.f905c0 = scaleType;
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

    public void setSubtitleCentered(boolean z4) {
        if (this.f904b0 != z4) {
            this.f904b0 = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.f903a0 != z4) {
            this.f903a0 = z4;
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
