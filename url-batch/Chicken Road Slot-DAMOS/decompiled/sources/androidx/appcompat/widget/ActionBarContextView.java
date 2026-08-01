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
import com.appsflyer.R;
import i.a;
import kotlin.collections.i0;
import m.j2;
import o3.c0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f403d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f404e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405i;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f406r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f407s;

    /* renamed from: t, reason: collision with root package name */
    public View f408t;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f409u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f410v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f411w;

    /* renamed from: x, reason: collision with root package name */
    public final int f412x;

    /* renamed from: y, reason: collision with root package name */
    public final int f413y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f414z;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4543d, i3, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : w.v(context, resourceId));
        this.f412x = obtainStyledAttributes.getResourceId(5, 0);
        this.f413y = obtainStyledAttributes.getResourceId(4, 0);
        this.f403d = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i3, int i10, int i11, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z10) {
            view.layout(i3 - measuredWidth, i12, i3, measuredHeight + i12);
        } else {
            view.layout(i3, i12, i3 + measuredWidth, measuredHeight + i12);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f409u == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f409u = linearLayout;
            this.f410v = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f411w = (TextView) this.f409u.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f412x;
            if (i3 != 0) {
                this.f410v.setTextAppearance(getContext(), i3);
            }
            int i10 = this.f413y;
            if (i10 != 0) {
                this.f411w.setTextAppearance(getContext(), i10);
            }
        }
        this.f410v.setText(this.f406r);
        this.f411w.setText(this.f407s);
        boolean isEmpty = TextUtils.isEmpty(this.f406r);
        boolean isEmpty2 = TextUtils.isEmpty(this.f407s);
        this.f411w.setVisibility(!isEmpty2 ? 0 : 8);
        this.f409u.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f409u.getParent() == null) {
            addView(this.f409u);
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
        return this.f403d;
    }

    public CharSequence getSubtitle() {
        return this.f407s;
    }

    public CharSequence getTitle() {
        return this.f406r;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f4540a, R.attr.actionBarStyle, 0);
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
            this.f405i = false;
        }
        if (!this.f405i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f405i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f405i = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11 = j2.f6117a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i11 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f409u;
        if (linearLayout != null && this.f408t == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f409u, paddingRight, paddingTop, paddingTop2, z12);
        }
        View view = this.f408t;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, z12);
        }
        if (z12) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            i0.l(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            i0.l(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i3);
        int i11 = this.f403d;
        if (i11 <= 0) {
            i11 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i12 = i11 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f409u;
        if (linearLayout != null && this.f408t == null) {
            if (this.f414z) {
                this.f409u.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f409u.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f409u.setVisibility(z10 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f408t;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                i12 = Math.min(i15, i12);
            }
            this.f408t.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(i12, i16));
        }
        if (this.f403d > 0) {
            setMeasuredDimension(size, i11);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f404e = false;
        }
        if (!this.f404e) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f404e = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f404e = false;
        return true;
    }

    public void setContentHeight(int i3) {
        this.f403d = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f408t;
        if (view2 != null) {
            removeView(view2);
        }
        this.f408t = view;
        if (view != null && (linearLayout = this.f409u) != null) {
            removeView(linearLayout);
            this.f409u = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f407s = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f406r = charSequence;
        a();
        c0.e(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f414z) {
            requestLayout();
        }
        this.f414z = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
