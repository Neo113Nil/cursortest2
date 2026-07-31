package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snovikpovik.vuevnxsj.R;
import h.a;
import l.p2;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f366d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f367e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f368f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f369g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f370h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f371j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f372k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f373l;

    /* renamed from: m, reason: collision with root package name */
    public final int f374m;

    /* renamed from: n, reason: collision with root package name */
    public final int f375n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f376o;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3052d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : h0.a.D(context, resourceId));
        this.f374m = obtainStyledAttributes.getResourceId(5, 0);
        this.f375n = obtainStyledAttributes.getResourceId(4, 0);
        this.f366d = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i, int i8, int i9, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z3) {
            view.layout(i - measuredWidth, i10, i, measuredHeight + i10);
        } else {
            view.layout(i, i10, i + measuredWidth, measuredHeight + i10);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f371j == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f371j = linearLayout;
            this.f372k = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f373l = (TextView) this.f371j.findViewById(R.id.action_bar_subtitle);
            int i = this.f374m;
            if (i != 0) {
                this.f372k.setTextAppearance(getContext(), i);
            }
            int i8 = this.f375n;
            if (i8 != 0) {
                this.f373l.setTextAppearance(getContext(), i8);
            }
        }
        this.f372k.setText(this.f369g);
        this.f373l.setText(this.f370h);
        boolean isEmpty = TextUtils.isEmpty(this.f369g);
        boolean isEmpty2 = TextUtils.isEmpty(this.f370h);
        this.f373l.setVisibility(!isEmpty2 ? 0 : 8);
        this.f371j.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f371j.getParent() == null) {
            addView(this.f371j);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
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
        return this.f366d;
    }

    public CharSequence getSubtitle() {
        return this.f370h;
    }

    public CharSequence getTitle() {
        return this.f369g;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f3049a, R.attr.actionBarStyle, 0);
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
            this.f368f = false;
        }
        if (!this.f368f) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f368f = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f368f = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        boolean z7 = p2.f4378a;
        boolean z8 = getLayoutDirection() == 1;
        int paddingRight = z8 ? (i9 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f371j;
        if (linearLayout != null && this.i == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f371j, paddingRight, paddingTop, paddingTop2, z8);
        }
        View view = this.i;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, z8);
        }
        if (z8) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i9 = this.f366d;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f371j;
        if (linearLayout != null && this.i == null) {
            if (this.f376o) {
                this.f371j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f371j.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f371j.setVisibility(z3 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.i;
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
            this.i.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f366d > 0) {
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
            this.f367e = false;
        }
        if (!this.f367e) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f367e = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f367e = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f366d = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.i;
        if (view2 != null) {
            removeView(view2);
        }
        this.i = view;
        if (view != null && (linearLayout = this.f371j) != null) {
            removeView(linearLayout);
            this.f371j = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f370h = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f369g = charSequence;
        a();
        k0.l(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f376o) {
            requestLayout();
        }
        this.f376o = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
