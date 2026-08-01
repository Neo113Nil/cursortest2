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
import defpackage.a8;
import defpackage.ex;
import defpackage.ic0;
import defpackage.im;
import defpackage.k30;
import defpackage.qw;
import defpackage.rs;
import defpackage.t90;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends im implements ex {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public qw G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final a8 K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        a8 a8Var = new a8(5, this);
        this.K = a8Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.moontiko.really.admiralcasino.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.moontiko.really.admiralcasino.R.id.design_menu_item_text);
        this.E = checkedTextView;
        ic0.m(checkedTextView, a8Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.moontiko.really.admiralcasino.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // defpackage.ex
    public final void c(qw qwVar) {
        StateListDrawable stateListDrawable;
        this.G = qwVar;
        int i = qwVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(qwVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.moontiko.really.admiralcasino.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(qwVar.isCheckable());
        setChecked(qwVar.isChecked());
        setEnabled(qwVar.isEnabled());
        setTitle(qwVar.e);
        setIcon(qwVar.getIcon());
        setActionView(qwVar.getActionView());
        setContentDescription(qwVar.q);
        t90.a(this, qwVar.r);
        qw qwVar2 = this.G;
        CharSequence charSequence = qwVar2.e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && qwVar2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                rs rsVar = (rs) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) rsVar).width = -1;
                this.F.setLayoutParams(rsVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            rs rsVar2 = (rs) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) rsVar2).width = -2;
            this.F.setLayoutParams(rsVar2);
        }
    }

    @Override // defpackage.ex
    public qw getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        qw qwVar = this.G;
        if (qwVar != null && qwVar.isCheckable() && this.G.isChecked()) {
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
                ThreadLocal threadLocal = k30.a;
                Drawable drawable2 = resources.getDrawable(com.moontiko.really.admiralcasino.R.drawable.navigation_empty_icon, theme);
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
        qw qwVar = this.G;
        if (qwVar != null) {
            setIcon(qwVar.getIcon());
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
