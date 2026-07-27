package androidx.appcompat.widget;

import E.G;
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
import com.chickyneer.roadway.R;
import g.AbstractC0444a;
import h.AbstractC0477a;
import java.lang.reflect.Field;
import l.t0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f4118a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4119b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4120c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f4121d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4122e;

    /* renamed from: f, reason: collision with root package name */
    public View f4123f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f4124g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f4125h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f4126i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4127j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4128k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4129l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5696d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0477a.a(context, resourceId);
        Field field = G.f566a;
        setBackground(drawable);
        this.f4127j = obtainStyledAttributes.getResourceId(5, 0);
        this.f4128k = obtainStyledAttributes.getResourceId(4, 0);
        this.f4118a = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i2, int i3, int i6, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i7, i2, measuredHeight + i7);
        } else {
            view.layout(i2, i7, i2 + measuredWidth, measuredHeight + i7);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f4124g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4124g = linearLayout;
            this.f4125h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4126i = (TextView) this.f4124g.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f4127j;
            if (i2 != 0) {
                this.f4125h.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f4128k;
            if (i3 != 0) {
                this.f4126i.setTextAppearance(getContext(), i3);
            }
        }
        this.f4125h.setText(this.f4121d);
        this.f4126i.setText(this.f4122e);
        boolean isEmpty = TextUtils.isEmpty(this.f4121d);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4122e);
        this.f4126i.setVisibility(!isEmpty2 ? 0 : 8);
        this.f4124g.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f4124g.getParent() == null) {
            addView(this.f4124g);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
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
        return this.f4118a;
    }

    public CharSequence getSubtitle() {
        return this.f4122e;
    }

    public CharSequence getTitle() {
        return this.f4121d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0444a.f5693a, R.attr.actionBarStyle, 0);
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
            this.f4120c = false;
        }
        if (!this.f4120c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4120c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4120c = false;
        }
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
        accessibilityEvent.setContentDescription(this.f4121d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        boolean a6 = t0.a(this);
        int paddingRight = a6 ? (i6 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f4124g;
        if (linearLayout != null && this.f4123f == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f4124g, paddingRight, paddingTop, paddingTop2, a6);
        }
        View view = this.f4123f;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a6);
        }
        if (a6) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i6 = this.f4118a;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f4124g;
        if (linearLayout != null && this.f4123f == null) {
            if (this.f4129l) {
                this.f4124g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f4124g.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f4124g.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f4123f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = Math.min(i10, i7);
            }
            this.f4123f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f4118a > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4119b = false;
        }
        if (!this.f4119b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4119b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4119b = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f4118a = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4123f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4123f = view;
        if (view != null && (linearLayout = this.f4124g) != null) {
            removeView(linearLayout);
            this.f4124g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4122e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4121d = charSequence;
        a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f4129l) {
            requestLayout();
        }
        this.f4129l = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
