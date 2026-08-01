package com.google.android.material.internal;

import a2.a;
import a2.h;
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
import b0.m;
import j.o;
import j.z;
import k.a3;
import k.t1;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends h implements z {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public o G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final a K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        a aVar = new a(1, this);
        this.K = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.gglhk.bofio.fortunetiger.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.gglhk.bofio.fortunetiger.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.gglhk.bofio.fortunetiger.R.id.design_menu_item_text);
        this.E = checkedTextView;
        j0.m(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.gglhk.bofio.fortunetiger.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // j.z
    public final void b(o oVar) {
        StateListDrawable stateListDrawable;
        this.G = oVar;
        int i4 = oVar.f2211a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.gglhk.bofio.fortunetiger.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f2214e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f2224q);
        a3.a(this, oVar.f2225r);
        o oVar2 = this.G;
        CharSequence charSequence = oVar2.f2214e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && oVar2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                t1 t1Var = (t1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) t1Var).width = -1;
                this.F.setLayoutParams(t1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            t1 t1Var2 = (t1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) t1Var2).width = -2;
            this.F.setLayoutParams(t1Var2);
        }
    }

    @Override // j.z
    public o getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        o oVar = this.G;
        if (oVar != null && oVar.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.C != z3) {
            this.C = z3;
            this.K.h(this.E, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
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
            int i4 = this.A;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.B) {
            if (this.J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = m.f716a;
                Drawable drawable2 = resources.getDrawable(com.gglhk.bofio.fortunetiger.R.drawable.navigation_empty_icon, theme);
                this.J = drawable2;
                if (drawable2 != null) {
                    int i5 = this.A;
                    drawable2.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.J;
        }
        this.E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.E.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.A = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        o oVar = this.G;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.E.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.B = z3;
    }

    public void setTextAppearance(int i4) {
        this.E.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }
}
