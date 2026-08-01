package com.google.android.material.internal;

import C.k;
import C.r;
import E0.a;
import E0.f;
import L.T;
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
import l.C0171o;
import l.InterfaceC0182z;
import m.A0;
import m.k1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0182z {
    public static final int[] G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1945A;

    /* renamed from: B, reason: collision with root package name */
    public C0171o f1946B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1947C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1948D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1949E;

    /* renamed from: F, reason: collision with root package name */
    public final a f1950F;

    /* renamed from: v, reason: collision with root package name */
    public int f1951v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1952w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1953x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1954y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1955z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1954y = true;
        a aVar = new a(1, this);
        this.f1950F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.winfour.winrandom.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.winfour.winrandom.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.winfour.winrandom.R.id.design_menu_item_text);
        this.f1955z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1945A == null) {
                this.f1945A = (FrameLayout) ((ViewStub) findViewById(com.winfour.winrandom.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1945A.removeAllViews();
            this.f1945A.addView(view);
        }
    }

    @Override // l.InterfaceC0182z
    public final void c(C0171o c0171o) {
        StateListDrawable stateListDrawable;
        this.f1946B = c0171o;
        int i = c0171o.f2843a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0171o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.winfour.winrandom.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f490a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0171o.isCheckable());
        setChecked(c0171o.isChecked());
        setEnabled(c0171o.isEnabled());
        setTitle(c0171o.f2846e);
        setIcon(c0171o.getIcon());
        setActionView(c0171o.getActionView());
        setContentDescription(c0171o.f2857q);
        k1.a(this, c0171o.f2858r);
        C0171o c0171o2 = this.f1946B;
        CharSequence charSequence = c0171o2.f2846e;
        CheckedTextView checkedTextView = this.f1955z;
        if (charSequence == null && c0171o2.getIcon() == null && this.f1946B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1945A;
            if (frameLayout != null) {
                A0 a02 = (A0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) a02).width = -1;
                this.f1945A.setLayoutParams(a02);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1945A;
        if (frameLayout2 != null) {
            A0 a03 = (A0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) a03).width = -2;
            this.f1945A.setLayoutParams(a03);
        }
    }

    @Override // l.InterfaceC0182z
    public C0171o getItemData() {
        return this.f1946B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0171o c0171o = this.f1946B;
        if (c0171o != null && c0171o.isCheckable() && this.f1946B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1953x != z2) {
            this.f1953x = z2;
            this.f1950F.h(this.f1955z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1955z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1954y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1948D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                E.a.h(drawable, this.f1947C);
            }
            int i = this.f1951v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1952w) {
            if (this.f1949E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f99a;
                Drawable a2 = k.a(resources, com.winfour.winrandom.R.drawable.navigation_empty_icon, theme);
                this.f1949E = a2;
                if (a2 != null) {
                    int i2 = this.f1951v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1949E;
        }
        this.f1955z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1955z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1951v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1947C = colorStateList;
        this.f1948D = colorStateList != null;
        C0171o c0171o = this.f1946B;
        if (c0171o != null) {
            setIcon(c0171o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1955z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1952w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1955z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1955z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1955z.setText(charSequence);
    }
}
