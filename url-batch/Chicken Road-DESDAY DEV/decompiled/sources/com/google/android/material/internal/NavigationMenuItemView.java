package com.google.android.material.internal;

import B.k;
import B.r;
import C0.a;
import C0.f;
import K.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import k.C0163o;
import k.InterfaceC0174z;
import l.C0253x0;
import l.f1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0174z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1784G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1785A;

    /* renamed from: B, reason: collision with root package name */
    public C0163o f1786B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1787C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1788D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1789E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1790v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1791w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1792x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1793y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1794z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1793y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.playgen.securelock.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.playgen.securelock.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.playgen.securelock.R.id.design_menu_item_text);
        this.f1794z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1785A == null) {
                this.f1785A = (FrameLayout) ((ViewStub) findViewById(com.playgen.securelock.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1785A.removeAllViews();
            this.f1785A.addView(view);
        }
    }

    @Override // k.InterfaceC0174z
    public final void a(C0163o c0163o) {
        StateListDrawable stateListDrawable;
        this.f1786B = c0163o;
        int i = c0163o.f2639a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0163o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.playgen.securelock.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1784G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f369a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0163o.isCheckable());
        setChecked(c0163o.isChecked());
        setEnabled(c0163o.isEnabled());
        setTitle(c0163o.f2642e);
        setIcon(c0163o.getIcon());
        setActionView(c0163o.getActionView());
        setContentDescription(c0163o.f2652q);
        f1.a(this, c0163o.f2653r);
        C0163o c0163o2 = this.f1786B;
        CharSequence charSequence = c0163o2.f2642e;
        CheckedTextView checkedTextView = this.f1794z;
        if (charSequence == null && c0163o2.getIcon() == null && this.f1786B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1785A;
            if (frameLayout != null) {
                C0253x0 c0253x0 = (C0253x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0253x0).width = -1;
                this.f1785A.setLayoutParams(c0253x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1785A;
        if (frameLayout2 != null) {
            C0253x0 c0253x02 = (C0253x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0253x02).width = -2;
            this.f1785A.setLayoutParams(c0253x02);
        }
    }

    @Override // k.InterfaceC0174z
    public C0163o getItemData() {
        return this.f1786B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0163o c0163o = this.f1786B;
        if (c0163o != null && c0163o.isCheckable() && this.f1786B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1784G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1792x != z2) {
            this.f1792x = z2;
            this.F.h(this.f1794z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1794z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1793y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1788D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1787C);
            }
            int i = this.f1790v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1791w) {
            if (this.f1789E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f40a;
                Drawable a2 = k.a(resources, com.playgen.securelock.R.drawable.navigation_empty_icon, theme);
                this.f1789E = a2;
                if (a2 != null) {
                    int i2 = this.f1790v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1789E;
        }
        this.f1794z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1794z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1790v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1787C = colorStateList;
        this.f1788D = colorStateList != null;
        C0163o c0163o = this.f1786B;
        if (c0163o != null) {
            setIcon(c0163o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1794z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1791w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1794z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1794z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1794z.setText(charSequence);
    }
}
