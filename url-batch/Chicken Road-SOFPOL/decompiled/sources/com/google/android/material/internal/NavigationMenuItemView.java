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
import h3.k;
import k.j;
import k.p;
import l.a1;
import l5.f;
import m.a;
import q3.k0;
import r5.d;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements p {
    public static final int[] J = {R.attr.state_checked};
    public boolean A;
    public final boolean B;
    public final CheckedTextView C;
    public FrameLayout D;
    public j E;
    public ColorStateList F;
    public boolean G;
    public Drawable H;
    public final f I;

    /* renamed from: y, reason: collision with root package name */
    public int f1933y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1934z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = true;
        f fVar = new f(this, 2);
        this.I = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.snovikpovik.vuevnxsj.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.snovikpovik.vuevnxsj.R.id.design_menu_item_text);
        this.C = checkedTextView;
        k0.k(checkedTextView, fVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(com.snovikpovik.vuevnxsj.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    @Override // k.p
    public final void b(j jVar) {
        StateListDrawable stateListDrawable;
        this.E = jVar;
        int i = jVar.f4089a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.snovikpovik.vuevnxsj.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.f4093e);
        setIcon(jVar.getIcon());
        View view = jVar.f4113z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(jVar.f4104q);
        a.Q(this, jVar.f4105r);
        j jVar2 = this.E;
        CharSequence charSequence = jVar2.f4093e;
        CheckedTextView checkedTextView = this.C;
        if (charSequence == null && jVar2.getIcon() == null) {
            View view2 = this.E.f4113z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.D;
                if (frameLayout != null) {
                    a1 a1Var = (a1) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) a1Var).width = -1;
                    this.D.setLayoutParams(a1Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.D;
        if (frameLayout2 != null) {
            a1 a1Var2 = (a1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) a1Var2).width = -2;
            this.D.setLayoutParams(a1Var2);
        }
    }

    @Override // k.p
    public j getItemData() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        j jVar = this.E;
        if (jVar != null && jVar.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.A != z3) {
            this.A = z3;
            this.I.h(this.C, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.C;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.B) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.F);
            }
            int i = this.f1933y;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1934z) {
            if (this.H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = k.f3150a;
                Drawable drawable2 = resources.getDrawable(com.snovikpovik.vuevnxsj.R.drawable.navigation_empty_icon, theme);
                this.H = drawable2;
                if (drawable2 != null) {
                    int i8 = this.f1933y;
                    drawable2.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.H;
        }
        this.C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.C.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1933y = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        j jVar = this.E;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.C.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f1934z = z3;
    }

    public void setTextAppearance(int i) {
        this.C.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }
}
