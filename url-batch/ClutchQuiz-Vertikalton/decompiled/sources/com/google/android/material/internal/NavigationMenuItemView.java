package com.google.android.material.internal;

import A0.f;
import B.k;
import B.r;
import D.a;
import I0.d;
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
import k.C0169o;
import k.InterfaceC0180z;
import l.C0244v0;
import l.d1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements InterfaceC0180z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1929G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1930A;

    /* renamed from: B, reason: collision with root package name */
    public C0169o f1931B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1932C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1933D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1934E;
    public final f F;

    /* renamed from: v, reason: collision with root package name */
    public int f1935v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1936w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1937x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1938y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1939z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1938y = true;
        f fVar = new f(2, this);
        this.F = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.clutchquizarena.app.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.clutchquizarena.app.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.clutchquizarena.app.R.id.design_menu_item_text);
        this.f1939z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.l(checkedTextView, fVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1930A == null) {
                this.f1930A = (FrameLayout) ((ViewStub) findViewById(com.clutchquizarena.app.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1930A.removeAllViews();
            this.f1930A.addView(view);
        }
    }

    @Override // k.InterfaceC0180z
    public final void a(C0169o c0169o) {
        StateListDrawable stateListDrawable;
        this.f1931B = c0169o;
        int i = c0169o.f2773a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0169o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.clutchquizarena.app.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1929G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f365a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0169o.isCheckable());
        setChecked(c0169o.isChecked());
        setEnabled(c0169o.isEnabled());
        setTitle(c0169o.f2776e);
        setIcon(c0169o.getIcon());
        setActionView(c0169o.getActionView());
        setContentDescription(c0169o.f2786q);
        d1.a(this, c0169o.f2787r);
        C0169o c0169o2 = this.f1931B;
        CharSequence charSequence = c0169o2.f2776e;
        CheckedTextView checkedTextView = this.f1939z;
        if (charSequence == null && c0169o2.getIcon() == null && this.f1931B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1930A;
            if (frameLayout != null) {
                C0244v0 c0244v0 = (C0244v0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0244v0).width = -1;
                this.f1930A.setLayoutParams(c0244v0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1930A;
        if (frameLayout2 != null) {
            C0244v0 c0244v02 = (C0244v0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0244v02).width = -2;
            this.f1930A.setLayoutParams(c0244v02);
        }
    }

    @Override // k.InterfaceC0180z
    public C0169o getItemData() {
        return this.f1931B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0169o c0169o = this.f1931B;
        if (c0169o != null && c0169o.isCheckable() && this.f1931B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1929G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1937x != z2) {
            this.f1937x = z2;
            this.F.h(this.f1939z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1939z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1938y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1933D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f1932C);
            }
            int i = this.f1935v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1936w) {
            if (this.f1934E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f69a;
                Drawable a2 = k.a(resources, com.clutchquizarena.app.R.drawable.navigation_empty_icon, theme);
                this.f1934E = a2;
                if (a2 != null) {
                    int i2 = this.f1935v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1934E;
        }
        this.f1939z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1939z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1935v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1932C = colorStateList;
        this.f1933D = colorStateList != null;
        C0169o c0169o = this.f1931B;
        if (c0169o != null) {
            setIcon(c0169o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1939z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1936w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1939z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1939z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1939z.setText(charSequence);
    }
}
