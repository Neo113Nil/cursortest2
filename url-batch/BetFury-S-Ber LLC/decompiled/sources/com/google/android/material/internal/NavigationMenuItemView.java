package com.google.android.material.internal;

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
import defpackage.hm0;
import defpackage.i20;
import defpackage.m8;
import defpackage.op;
import defpackage.qx;
import defpackage.s90;
import defpackage.u10;
import defpackage.zi0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends op implements i20 {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public u10 G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final m8 K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        m8 m8Var = new m8(5, this);
        this.K = m8Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.trembin.nirefon.betfury.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.trembin.nirefon.betfury.R.id.design_menu_item_text);
        this.E = checkedTextView;
        hm0.m(checkedTextView, m8Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.trembin.nirefon.betfury.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // defpackage.i20
    public final void c(u10 u10Var) {
        StateListDrawable stateListDrawable;
        this.G = u10Var;
        int i = u10Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(u10Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.trembin.nirefon.betfury.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(u10Var.isCheckable());
        setChecked(u10Var.isChecked());
        setEnabled(u10Var.isEnabled());
        setTitle(u10Var.e);
        setIcon(u10Var.getIcon());
        setActionView(u10Var.getActionView());
        setContentDescription(u10Var.q);
        zi0.a(this, u10Var.r);
        u10 u10Var2 = this.G;
        CharSequence charSequence = u10Var2.e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && u10Var2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                qx qxVar = (qx) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) qxVar).width = -1;
                this.F.setLayoutParams(qxVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            qx qxVar2 = (qx) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) qxVar2).width = -2;
            this.F.setLayoutParams(qxVar2);
        }
    }

    @Override // defpackage.i20
    public u10 getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        u10 u10Var = this.G;
        if (u10Var != null && u10Var.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.C != z) {
            this.C = z;
            this.K.h(this.E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.H);
            }
            int i = this.A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.B) {
            if (this.J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = s90.a;
                Drawable drawable2 = resources.getDrawable(com.trembin.nirefon.betfury.R.drawable.navigation_empty_icon, theme);
                this.J = drawable2;
                if (drawable2 != null) {
                    int i2 = this.A;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.J;
        }
        this.E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.A = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        u10 u10Var = this.G;
        if (u10Var != null) {
            setIcon(u10Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.B = z;
    }

    public void setTextAppearance(int i) {
        this.E.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }
}
