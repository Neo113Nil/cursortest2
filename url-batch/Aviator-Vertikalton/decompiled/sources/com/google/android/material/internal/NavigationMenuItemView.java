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
import k.C0202o;
import k.InterfaceC0213z;
import l.C0297y0;
import l.f1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends g implements InterfaceC0213z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1942G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1943A;

    /* renamed from: B, reason: collision with root package name */
    public C0202o f1944B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1945C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1946D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1947E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1948v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1949w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1950x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1951y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1952z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1951y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.fortuneink.neonpad.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.fortuneink.neonpad.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.fortuneink.neonpad.R.id.design_menu_item_text);
        this.f1952z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1943A == null) {
                this.f1943A = (FrameLayout) ((ViewStub) findViewById(com.fortuneink.neonpad.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1943A.removeAllViews();
            this.f1943A.addView(view);
        }
    }

    @Override // k.InterfaceC0213z
    public final void a(C0202o c0202o) {
        StateListDrawable stateListDrawable;
        this.f1944B = c0202o;
        int i = c0202o.f3085a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0202o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.fortuneink.neonpad.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1942G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = X.f418a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0202o.isCheckable());
        setChecked(c0202o.isChecked());
        setEnabled(c0202o.isEnabled());
        setTitle(c0202o.f3089e);
        setIcon(c0202o.getIcon());
        setActionView(c0202o.getActionView());
        setContentDescription(c0202o.f3099q);
        f1.a(this, c0202o.f3100r);
        C0202o c0202o2 = this.f1944B;
        CharSequence charSequence = c0202o2.f3089e;
        CheckedTextView checkedTextView = this.f1952z;
        if (charSequence == null && c0202o2.getIcon() == null && this.f1944B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1943A;
            if (frameLayout != null) {
                C0297y0 c0297y0 = (C0297y0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0297y0).width = -1;
                this.f1943A.setLayoutParams(c0297y0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1943A;
        if (frameLayout2 != null) {
            C0297y0 c0297y02 = (C0297y0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0297y02).width = -2;
            this.f1943A.setLayoutParams(c0297y02);
        }
    }

    @Override // k.InterfaceC0213z
    public C0202o getItemData() {
        return this.f1944B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0202o c0202o = this.f1944B;
        if (c0202o != null && c0202o.isCheckable() && this.f1944B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1942G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1950x != z2) {
            this.f1950x = z2;
            this.F.h(this.f1952z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1952z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1951y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1946D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1945C);
            }
            int i = this.f1948v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1949w) {
            if (this.f1947E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f49a;
                Drawable a2 = k.a(resources, com.fortuneink.neonpad.R.drawable.navigation_empty_icon, theme);
                this.f1947E = a2;
                if (a2 != null) {
                    int i2 = this.f1948v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1947E;
        }
        this.f1952z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1952z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1948v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1945C = colorStateList;
        this.f1946D = colorStateList != null;
        C0202o c0202o = this.f1944B;
        if (c0202o != null) {
            setIcon(c0202o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1952z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1949w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1952z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1952z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1952z.setText(charSequence);
    }
}
