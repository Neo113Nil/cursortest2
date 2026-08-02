package androidx.appcompat.widget;

import E.H;
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
import com.rockchicken.pump.up.road.R;
import f.AbstractC0410a;
import g.AbstractC0432a;
import java.lang.reflect.Field;
import k.t0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f4330a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4331b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4332c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f4333d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4334e;

    /* renamed from: f, reason: collision with root package name */
    public View f4335f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f4336g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f4337h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f4338i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4339j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4340k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4341l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8473d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0432a.a(context, resourceId);
        Field field = H.f375a;
        setBackground(drawable);
        this.f4339j = obtainStyledAttributes.getResourceId(5, 0);
        this.f4340k = obtainStyledAttributes.getResourceId(4, 0);
        this.f4330a = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i4, int i5, int i6, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f4336g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4336g = linearLayout;
            this.f4337h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4338i = (TextView) this.f4336g.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f4339j;
            if (i4 != 0) {
                this.f4337h.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f4340k;
            if (i5 != 0) {
                this.f4338i.setTextAppearance(getContext(), i5);
            }
        }
        this.f4337h.setText(this.f4333d);
        this.f4338i.setText(this.f4334e);
        boolean isEmpty = TextUtils.isEmpty(this.f4333d);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4334e);
        this.f4338i.setVisibility(!isEmpty2 ? 0 : 8);
        this.f4336g.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f4336g.getParent() == null) {
            addView(this.f4336g);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            super.setVisibility(i4);
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
        return this.f4330a;
    }

    public CharSequence getSubtitle() {
        return this.f4334e;
    }

    public CharSequence getTitle() {
        return this.f4333d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0410a.f8470a, R.attr.actionBarStyle, 0);
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
            this.f4332c = false;
        }
        if (!this.f4332c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4332c = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4332c = false;
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
        accessibilityEvent.setContentDescription(this.f4333d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        boolean a3 = t0.a(this);
        int paddingRight = a3 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f4336g;
        if (linearLayout != null && this.f4335f == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f4336g, paddingRight, paddingTop, paddingTop2, a3);
        }
        View view = this.f4335f;
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
    public final void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.f4330a;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f4336g;
        if (linearLayout != null && this.f4335f == null) {
            if (this.f4341l) {
                this.f4336g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f4336g.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f4336g.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f4335f;
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
            this.f4335f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f4330a > 0) {
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
            this.f4331b = false;
        }
        if (!this.f4331b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4331b = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4331b = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.f4330a = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4335f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4335f = view;
        if (view != null && (linearLayout = this.f4336g) != null) {
            removeView(linearLayout);
            this.f4336g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4334e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4333d = charSequence;
        a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f4341l) {
            requestLayout();
        }
        this.f4341l = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
