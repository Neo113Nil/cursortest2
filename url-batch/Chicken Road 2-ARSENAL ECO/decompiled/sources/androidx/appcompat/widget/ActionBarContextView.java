package androidx.appcompat.widget;

import D.D;
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
import com.strategylink.Row.Five.R;
import g.AbstractC0389a;
import h.AbstractC0401a;
import java.lang.reflect.Field;
import k.y0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public int f3259f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3260g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3261h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f3262i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3263j;

    /* renamed from: k, reason: collision with root package name */
    public View f3264k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f3265l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f3266m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f3267n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3268o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3269p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3270q;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4257d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0401a.a(context, resourceId);
        Field field = D.f240a;
        setBackground(drawable);
        this.f3268o = obtainStyledAttributes.getResourceId(5, 0);
        this.f3269p = obtainStyledAttributes.getResourceId(4, 0);
        this.f3259f = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i7, int i8, int i9, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z5) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f3265l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3265l = linearLayout;
            this.f3266m = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3267n = (TextView) this.f3265l.findViewById(R.id.action_bar_subtitle);
            int i7 = this.f3268o;
            if (i7 != 0) {
                this.f3266m.setTextAppearance(getContext(), i7);
            }
            int i8 = this.f3269p;
            if (i8 != 0) {
                this.f3267n.setTextAppearance(getContext(), i8);
            }
        }
        this.f3266m.setText(this.f3262i);
        this.f3267n.setText(this.f3263j);
        boolean isEmpty = TextUtils.isEmpty(this.f3262i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f3263j);
        this.f3267n.setVisibility(!isEmpty2 ? 0 : 8);
        this.f3265l.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f3265l.getParent() == null) {
            addView(this.f3265l);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            super.setVisibility(i7);
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
        return this.f3259f;
    }

    public CharSequence getSubtitle() {
        return this.f3263j;
    }

    public CharSequence getTitle() {
        return this.f3262i;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0389a.f4254a, R.attr.actionBarStyle, 0);
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
            this.f3261h = false;
        }
        if (!this.f3261h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3261h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3261h = false;
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
        accessibilityEvent.setContentDescription(this.f3262i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        boolean a7 = y0.a(this);
        int paddingRight = a7 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f3265l;
        if (linearLayout != null && this.f3264k == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f3265l, paddingRight, paddingTop, paddingTop2, a7);
        }
        View view = this.f3264k;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a7);
        }
        if (a7) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int i9 = this.f3259f;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f3265l;
        if (linearLayout != null && this.f3264k == null) {
            if (this.f3270q) {
                this.f3265l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f3265l.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f3265l.setVisibility(z5 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f3264k;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.f3264k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f3259f > 0) {
            setMeasuredDimension(size, i9);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3260g = false;
        }
        if (!this.f3260g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3260g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3260g = false;
        return true;
    }

    public void setContentHeight(int i7) {
        this.f3259f = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3264k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3264k = view;
        if (view != null && (linearLayout = this.f3265l) != null) {
            removeView(linearLayout);
            this.f3265l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3263j = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3262i = charSequence;
        a();
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f3270q) {
            requestLayout();
        }
        this.f3270q = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
