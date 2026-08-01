package com.google.android.material.internal;

import B.k;
import B.r;
import B0.a;
import B0.g;
import K.X;
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
import k.C0204o;
import k.InterfaceC0215z;
import l.C0297x0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends g implements InterfaceC0215z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1920G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1921A;

    /* renamed from: B, reason: collision with root package name */
    public C0204o f1922B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1923C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1924D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1925E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1926v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1927w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1928x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1929y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1930z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1929y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.luckyarcade.spinthrow.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.luckyarcade.spinthrow.R.id.design_menu_item_text);
        this.f1930z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1921A == null) {
                this.f1921A = (FrameLayout) ((ViewStub) findViewById(com.luckyarcade.spinthrow.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1921A.removeAllViews();
            this.f1921A.addView(view);
        }
    }

    @Override // k.InterfaceC0215z
    public final void a(C0204o c0204o) {
        StateListDrawable stateListDrawable;
        this.f1922B = c0204o;
        int i = c0204o.f3089a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0204o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.luckyarcade.spinthrow.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1920G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = X.f419a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0204o.isCheckable());
        setChecked(c0204o.isChecked());
        setEnabled(c0204o.isEnabled());
        setTitle(c0204o.f3093e);
        setIcon(c0204o.getIcon());
        setActionView(c0204o.getActionView());
        setContentDescription(c0204o.f3103q);
        e1.a(this, c0204o.f3104r);
        C0204o c0204o2 = this.f1922B;
        CharSequence charSequence = c0204o2.f3093e;
        CheckedTextView checkedTextView = this.f1930z;
        if (charSequence == null && c0204o2.getIcon() == null && this.f1922B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1921A;
            if (frameLayout != null) {
                C0297x0 c0297x0 = (C0297x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0297x0).width = -1;
                this.f1921A.setLayoutParams(c0297x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1921A;
        if (frameLayout2 != null) {
            C0297x0 c0297x02 = (C0297x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0297x02).width = -2;
            this.f1921A.setLayoutParams(c0297x02);
        }
    }

    @Override // k.InterfaceC0215z
    public C0204o getItemData() {
        return this.f1922B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0204o c0204o = this.f1922B;
        if (c0204o != null && c0204o.isCheckable() && this.f1922B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1920G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1928x != z2) {
            this.f1928x = z2;
            this.F.h(this.f1930z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1930z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1929y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1924D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1923C);
            }
            int i = this.f1926v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1927w) {
            if (this.f1925E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f49a;
                Drawable a2 = k.a(resources, com.luckyarcade.spinthrow.R.drawable.navigation_empty_icon, theme);
                this.f1925E = a2;
                if (a2 != null) {
                    int i2 = this.f1926v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1925E;
        }
        this.f1930z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1930z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1926v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1923C = colorStateList;
        this.f1924D = colorStateList != null;
        C0204o c0204o = this.f1922B;
        if (c0204o != null) {
            setIcon(c0204o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1930z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1927w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1930z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1930z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1930z.setText(charSequence);
    }
}
