package androidx.appcompat.widget;

import E.A;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fc.barca.football.R;
import g.AbstractC0328a;
import h.AbstractC0337a;
import java.lang.reflect.Field;
import l.w0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f2000a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2002c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2003d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2004e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f2005g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f2006h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f2007i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2008j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2009k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2010l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f4992d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0337a.a(context, resourceId);
        Field field = A.f243a;
        setBackground(drawable);
        this.f2008j = obtainStyledAttributes.getResourceId(5, 0);
        this.f2009k = obtainStyledAttributes.getResourceId(4, 0);
        this.f2000a = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i3, int i4, int i5, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f2005g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2005g = linearLayout;
            this.f2006h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2007i = (TextView) this.f2005g.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f2008j;
            if (i3 != 0) {
                this.f2006h.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f2009k;
            if (i4 != 0) {
                this.f2007i.setTextAppearance(getContext(), i4);
            }
        }
        this.f2006h.setText(this.f2003d);
        this.f2007i.setText(this.f2004e);
        boolean isEmpty = TextUtils.isEmpty(this.f2003d);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2004e);
        this.f2007i.setVisibility(!isEmpty2 ? 0 : 8);
        this.f2005g.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f2005g.getParent() == null) {
            addView(this.f2005g);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            super.setVisibility(i3);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2000a;
    }

    public CharSequence getSubtitle() {
        return this.f2004e;
    }

    public CharSequence getTitle() {
        return this.f2003d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0328a.f4989a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2002c = false;
        }
        if (!this.f2002c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2002c = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2002c = false;
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f2003d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        boolean a3 = w0.a(this);
        int paddingRight = a3 ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f2005g;
        if (linearLayout != null && this.f == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f2005g, paddingRight, paddingTop, paddingTop2, a3);
        }
        View view = this.f;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a3);
        }
        if (a3) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int i5 = this.f2000a;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f2005g;
        if (linearLayout != null && this.f == null) {
            if (this.f2010l) {
                this.f2005g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f2005g.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f2005g.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            int i10 = i9 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f2000a > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i11) {
                i11 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2001b = false;
        }
        if (!this.f2001b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2001b = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2001b = false;
        return true;
    }

    public void setContentHeight(int i3) {
        this.f2000a = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f = view;
        if (view != null && (linearLayout = this.f2005g) != null) {
            removeView(linearLayout);
            this.f2005g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2004e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2003d = charSequence;
        a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2010l) {
            requestLayout();
        }
        this.f2010l = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
