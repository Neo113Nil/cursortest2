package com.google.android.material.internal;

import B.k;
import B.r;
import D0.a;
import D0.f;
import K.T;
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
import k.C0166o;
import k.InterfaceC0177z;
import l.C0241w0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0177z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1845G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1846A;

    /* renamed from: B, reason: collision with root package name */
    public C0166o f1847B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1848C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1849D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1850E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1851v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1852w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1853x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1854y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1855z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1854y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.playbag.tripgear.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.playbag.tripgear.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.playbag.tripgear.R.id.design_menu_item_text);
        this.f1855z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1846A == null) {
                this.f1846A = (FrameLayout) ((ViewStub) findViewById(com.playbag.tripgear.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1846A.removeAllViews();
            this.f1846A.addView(view);
        }
    }

    @Override // k.InterfaceC0177z
    public final void a(C0166o c0166o) {
        StateListDrawable stateListDrawable;
        this.f1847B = c0166o;
        int i = c0166o.f2712a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0166o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.playbag.tripgear.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1845G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f423a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0166o.isCheckable());
        setChecked(c0166o.isChecked());
        setEnabled(c0166o.isEnabled());
        setTitle(c0166o.f2715e);
        setIcon(c0166o.getIcon());
        setActionView(c0166o.getActionView());
        setContentDescription(c0166o.f2725q);
        e1.a(this, c0166o.f2726r);
        C0166o c0166o2 = this.f1847B;
        CharSequence charSequence = c0166o2.f2715e;
        CheckedTextView checkedTextView = this.f1855z;
        if (charSequence == null && c0166o2.getIcon() == null && this.f1847B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1846A;
            if (frameLayout != null) {
                C0241w0 c0241w0 = (C0241w0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0241w0).width = -1;
                this.f1846A.setLayoutParams(c0241w0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1846A;
        if (frameLayout2 != null) {
            C0241w0 c0241w02 = (C0241w0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0241w02).width = -2;
            this.f1846A.setLayoutParams(c0241w02);
        }
    }

    @Override // k.InterfaceC0177z
    public C0166o getItemData() {
        return this.f1847B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0166o c0166o = this.f1847B;
        if (c0166o != null && c0166o.isCheckable() && this.f1847B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1845G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1853x != z2) {
            this.f1853x = z2;
            this.F.h(this.f1855z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1855z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1854y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1849D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1848C);
            }
            int i = this.f1851v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1852w) {
            if (this.f1850E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f44a;
                Drawable a2 = k.a(resources, com.playbag.tripgear.R.drawable.navigation_empty_icon, theme);
                this.f1850E = a2;
                if (a2 != null) {
                    int i2 = this.f1851v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1850E;
        }
        this.f1855z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1855z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1851v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1848C = colorStateList;
        this.f1849D = colorStateList != null;
        C0166o c0166o = this.f1847B;
        if (c0166o != null) {
            setIcon(c0166o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1855z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1852w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1855z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1855z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1855z.setText(charSequence);
    }
}
