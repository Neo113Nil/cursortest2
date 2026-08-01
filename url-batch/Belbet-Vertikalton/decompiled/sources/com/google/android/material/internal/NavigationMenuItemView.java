package com.google.android.material.internal;

import D.j;
import D.q;
import H0.a;
import H0.f;
import M.P;
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
import m.C0231o;
import m.InterfaceC0242z;
import n.C0313z0;
import n.j1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0242z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f2439G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f2440A;

    /* renamed from: B, reason: collision with root package name */
    public C0231o f2441B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2442C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2443D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f2444E;

    /* renamed from: F, reason: collision with root package name */
    public final a f2445F;

    /* renamed from: v, reason: collision with root package name */
    public int f2446v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2447w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2448x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2449y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f2450z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2449y = true;
        a aVar = new a(1, this);
        this.f2445F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.winpower.neonfit.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.winpower.neonfit.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.winpower.neonfit.R.id.design_menu_item_text);
        this.f2450z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        P.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2440A == null) {
                this.f2440A = (FrameLayout) ((ViewStub) findViewById(com.winpower.neonfit.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2440A.removeAllViews();
            this.f2440A.addView(view);
        }
    }

    @Override // m.InterfaceC0242z
    public final void a(C0231o c0231o) {
        StateListDrawable stateListDrawable;
        this.f2441B = c0231o;
        int i = c0231o.f3375a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0231o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.winpower.neonfit.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2439G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = P.f711a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0231o.isCheckable());
        setChecked(c0231o.isChecked());
        setEnabled(c0231o.isEnabled());
        setTitle(c0231o.e);
        setIcon(c0231o.getIcon());
        setActionView(c0231o.getActionView());
        setContentDescription(c0231o.f3388q);
        j1.a(this, c0231o.f3389r);
        C0231o c0231o2 = this.f2441B;
        CharSequence charSequence = c0231o2.e;
        CheckedTextView checkedTextView = this.f2450z;
        if (charSequence == null && c0231o2.getIcon() == null && this.f2441B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2440A;
            if (frameLayout != null) {
                C0313z0 c0313z0 = (C0313z0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0313z0).width = -1;
                this.f2440A.setLayoutParams(c0313z0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2440A;
        if (frameLayout2 != null) {
            C0313z0 c0313z02 = (C0313z0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0313z02).width = -2;
            this.f2440A.setLayoutParams(c0313z02);
        }
    }

    @Override // m.InterfaceC0242z
    public C0231o getItemData() {
        return this.f2441B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0231o c0231o = this.f2441B;
        if (c0231o != null && c0231o.isCheckable() && this.f2441B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2439G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2448x != z2) {
            this.f2448x = z2;
            this.f2445F.h(this.f2450z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2450z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2449y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2443D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                F.a.h(drawable, this.f2442C);
            }
            int i = this.f2446v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2447w) {
            if (this.f2444E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = q.f192a;
                Drawable a2 = j.a(resources, com.winpower.neonfit.R.drawable.navigation_empty_icon, theme);
                this.f2444E = a2;
                if (a2 != null) {
                    int i2 = this.f2446v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2444E;
        }
        this.f2450z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f2450z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2446v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2442C = colorStateList;
        this.f2443D = colorStateList != null;
        C0231o c0231o = this.f2441B;
        if (c0231o != null) {
            setIcon(c0231o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2450z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2447w = z2;
    }

    public void setTextAppearance(int i) {
        this.f2450z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2450z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2450z.setText(charSequence);
    }
}
