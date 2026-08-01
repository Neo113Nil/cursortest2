package com.google.android.material.internal;

import B.k;
import B.r;
import D0.a;
import D0.f;
import K.T;
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
import k.C0168o;
import k.InterfaceC0179z;
import l.C0244w0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0179z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1877G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1878A;

    /* renamed from: B, reason: collision with root package name */
    public C0168o f1879B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1880C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1881D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1882E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1883v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1884w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1885x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1886y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1887z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1886y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.winworm.neongrid.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.winworm.neongrid.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.winworm.neongrid.R.id.design_menu_item_text);
        this.f1887z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1878A == null) {
                this.f1878A = (FrameLayout) ((ViewStub) findViewById(com.winworm.neongrid.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1878A.removeAllViews();
            this.f1878A.addView(view);
        }
    }

    @Override // k.InterfaceC0179z
    public final void a(C0168o c0168o) {
        StateListDrawable stateListDrawable;
        this.f1879B = c0168o;
        int i = c0168o.f2740a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0168o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.winworm.neongrid.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1877G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f440a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0168o.isCheckable());
        setChecked(c0168o.isChecked());
        setEnabled(c0168o.isEnabled());
        setTitle(c0168o.f2743e);
        setIcon(c0168o.getIcon());
        setActionView(c0168o.getActionView());
        setContentDescription(c0168o.f2753q);
        e1.a(this, c0168o.f2754r);
        C0168o c0168o2 = this.f1879B;
        CharSequence charSequence = c0168o2.f2743e;
        CheckedTextView checkedTextView = this.f1887z;
        if (charSequence == null && c0168o2.getIcon() == null && this.f1879B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1878A;
            if (frameLayout != null) {
                C0244w0 c0244w0 = (C0244w0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0244w0).width = -1;
                this.f1878A.setLayoutParams(c0244w0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1878A;
        if (frameLayout2 != null) {
            C0244w0 c0244w02 = (C0244w0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0244w02).width = -2;
            this.f1878A.setLayoutParams(c0244w02);
        }
    }

    @Override // k.InterfaceC0179z
    public C0168o getItemData() {
        return this.f1879B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0168o c0168o = this.f1879B;
        if (c0168o != null && c0168o.isCheckable() && this.f1879B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1877G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1885x != z2) {
            this.f1885x = z2;
            this.F.h(this.f1887z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1887z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1886y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1881D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1880C);
            }
            int i = this.f1883v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1884w) {
            if (this.f1882E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f58a;
                Drawable a2 = k.a(resources, com.winworm.neongrid.R.drawable.navigation_empty_icon, theme);
                this.f1882E = a2;
                if (a2 != null) {
                    int i2 = this.f1883v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1882E;
        }
        this.f1887z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1887z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1883v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1880C = colorStateList;
        this.f1881D = colorStateList != null;
        C0168o c0168o = this.f1879B;
        if (c0168o != null) {
            setIcon(c0168o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1887z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1884w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1887z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1887z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1887z.setText(charSequence);
    }
}
