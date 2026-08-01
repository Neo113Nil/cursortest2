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
import defpackage.e90;
import defpackage.eu;
import defpackage.qq;
import defpackage.r60;
import defpackage.su;
import defpackage.v00;
import defpackage.x9;
import defpackage.zj;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends zj implements su {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public eu G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final x9 K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        x9 x9Var = new x9(3, this);
        this.K = x9Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.awerser.monnit.betplay.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.awerser.monnit.betplay.R.id.design_menu_item_text);
        this.E = checkedTextView;
        e90.m(checkedTextView, x9Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.awerser.monnit.betplay.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // defpackage.su
    public final void c(eu euVar) {
        StateListDrawable stateListDrawable;
        this.G = euVar;
        int i = euVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(euVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.awerser.monnit.betplay.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(euVar.isCheckable());
        setChecked(euVar.isChecked());
        setEnabled(euVar.isEnabled());
        setTitle(euVar.e);
        setIcon(euVar.getIcon());
        setActionView(euVar.getActionView());
        setContentDescription(euVar.q);
        r60.a(this, euVar.r);
        eu euVar2 = this.G;
        CharSequence charSequence = euVar2.e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && euVar2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                qq qqVar = (qq) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) qqVar).width = -1;
                this.F.setLayoutParams(qqVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            qq qqVar2 = (qq) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) qqVar2).width = -2;
            this.F.setLayoutParams(qqVar2);
        }
    }

    @Override // defpackage.su
    public eu getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        eu euVar = this.G;
        if (euVar != null && euVar.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.C != z) {
            this.C = z;
            this.K.sendAccessibilityEvent(this.E, 2048);
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
                ThreadLocal threadLocal = v00.a;
                Drawable drawable2 = resources.getDrawable(com.awerser.monnit.betplay.R.drawable.navigation_empty_icon, theme);
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
        eu euVar = this.G;
        if (euVar != null) {
            setIcon(euVar.getIcon());
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
