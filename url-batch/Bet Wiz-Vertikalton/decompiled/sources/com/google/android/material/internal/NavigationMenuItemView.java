package com.google.android.material.internal;

import B.k;
import B.r;
import C0.a;
import C0.f;
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
import k.C0162o;
import k.InterfaceC0173z;
import l.C0250w0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0173z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1821G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1822A;

    /* renamed from: B, reason: collision with root package name */
    public C0162o f1823B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1824C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1825D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1826E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1827v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1828w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1829x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1830y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1831z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1830y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.neonpulse.gridlogic.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.neonpulse.gridlogic.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.neonpulse.gridlogic.R.id.design_menu_item_text);
        this.f1831z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1822A == null) {
                this.f1822A = (FrameLayout) ((ViewStub) findViewById(com.neonpulse.gridlogic.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1822A.removeAllViews();
            this.f1822A.addView(view);
        }
    }

    @Override // k.InterfaceC0173z
    public final void a(C0162o c0162o) {
        StateListDrawable stateListDrawable;
        this.f1823B = c0162o;
        int i = c0162o.f2688a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0162o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.neonpulse.gridlogic.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1821G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f422a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0162o.isCheckable());
        setChecked(c0162o.isChecked());
        setEnabled(c0162o.isEnabled());
        setTitle(c0162o.f2691e);
        setIcon(c0162o.getIcon());
        setActionView(c0162o.getActionView());
        setContentDescription(c0162o.f2701q);
        e1.a(this, c0162o.f2702r);
        C0162o c0162o2 = this.f1823B;
        CharSequence charSequence = c0162o2.f2691e;
        CheckedTextView checkedTextView = this.f1831z;
        if (charSequence == null && c0162o2.getIcon() == null && this.f1823B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1822A;
            if (frameLayout != null) {
                C0250w0 c0250w0 = (C0250w0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0250w0).width = -1;
                this.f1822A.setLayoutParams(c0250w0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1822A;
        if (frameLayout2 != null) {
            C0250w0 c0250w02 = (C0250w0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0250w02).width = -2;
            this.f1822A.setLayoutParams(c0250w02);
        }
    }

    @Override // k.InterfaceC0173z
    public C0162o getItemData() {
        return this.f1823B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0162o c0162o = this.f1823B;
        if (c0162o != null && c0162o.isCheckable() && this.f1823B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1821G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1829x != z2) {
            this.f1829x = z2;
            this.F.h(this.f1831z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1831z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1830y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1825D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1824C);
            }
            int i = this.f1827v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1828w) {
            if (this.f1826E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f38a;
                Drawable a2 = k.a(resources, com.neonpulse.gridlogic.R.drawable.navigation_empty_icon, theme);
                this.f1826E = a2;
                if (a2 != null) {
                    int i2 = this.f1827v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1826E;
        }
        this.f1831z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1831z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1827v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1824C = colorStateList;
        this.f1825D = colorStateList != null;
        C0162o c0162o = this.f1823B;
        if (c0162o != null) {
            setIcon(c0162o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1831z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1828w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1831z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1831z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1831z.setText(charSequence);
    }
}
