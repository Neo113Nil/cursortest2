package com.google.android.material.internal;

import F.j;
import F.o;
import G0.f;
import H.a;
import K3.b;
import O.X;
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
import com.icefishing.icefishingliveapp.C5284R;
import java.util.WeakHashMap;
import l.n;
import l.y;
import m.C4761t0;
import w3.AbstractC5165d;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends AbstractC5165d implements y {

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f36190p0 = {R.attr.state_checked};

    /* renamed from: O, reason: collision with root package name */
    public int f36191O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f36192P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f36193Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f36194R;

    /* renamed from: S, reason: collision with root package name */
    public final CheckedTextView f36195S;

    /* renamed from: T, reason: collision with root package name */
    public FrameLayout f36196T;

    /* renamed from: U, reason: collision with root package name */
    public n f36197U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f36198V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f36199W;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f36200n0;

    /* renamed from: o0, reason: collision with root package name */
    public final f f36201o0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36194R = true;
        f fVar = new f(4, this);
        this.f36201o0 = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C5284R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C5284R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C5284R.id.design_menu_item_text);
        this.f36195S = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.o(checkedTextView, fVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f36196T == null) {
                this.f36196T = (FrameLayout) ((ViewStub) findViewById(C5284R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f36196T.removeAllViews();
            this.f36196T.addView(view);
        }
    }

    @Override // l.y
    public final void b(n nVar) {
        StateListDrawable stateListDrawable;
        this.f36197U = nVar;
        int i = nVar.f38993n;
        if (i > 0) {
            setId(i);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C5284R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f36190p0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = X.f2240a;
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f38997x);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.J);
        b.B(this, nVar.f38981K);
        n nVar2 = this.f36197U;
        CharSequence charSequence = nVar2.f38997x;
        CheckedTextView checkedTextView = this.f36195S;
        if (charSequence == null && nVar2.getIcon() == null && this.f36197U.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f36196T;
            if (frameLayout != null) {
                C4761t0 c4761t0 = (C4761t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c4761t0).width = -1;
                this.f36196T.setLayoutParams(c4761t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f36196T;
        if (frameLayout2 != null) {
            C4761t0 c4761t02 = (C4761t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c4761t02).width = -2;
            this.f36196T.setLayoutParams(c4761t02);
        }
    }

    @Override // l.y
    public n getItemData() {
        return this.f36197U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        n nVar = this.f36197U;
        if (nVar != null && nVar.isCheckable() && this.f36197U.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f36190p0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z8) {
        refreshDrawableState();
        if (this.f36193Q != z8) {
            this.f36193Q = z8;
            this.f36201o0.h(this.f36195S, 2048);
        }
    }

    public void setChecked(boolean z8) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f36195S;
        checkedTextView.setChecked(z8);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z8 && this.f36194R) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f36199W) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f36198V);
            }
            int i = this.f36191O;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f36192P) {
            if (this.f36200n0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o.f927a;
                Drawable a9 = j.a(resources, C5284R.drawable.navigation_empty_icon, theme);
                this.f36200n0 = a9;
                if (a9 != null) {
                    int i4 = this.f36191O;
                    a9.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f36200n0;
        }
        this.f36195S.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f36195S.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f36191O = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f36198V = colorStateList;
        this.f36199W = colorStateList != null;
        n nVar = this.f36197U;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f36195S.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z8) {
        this.f36192P = z8;
    }

    public void setTextAppearance(int i) {
        this.f36195S.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f36195S.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f36195S.setText(charSequence);
    }
}
