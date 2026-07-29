package com.google.android.material.internal;

import B.k;
import B.r;
import B0.a;
import B0.g;
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
import k.C0159o;
import k.InterfaceC0170z;
import l.C0269x0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends g implements InterfaceC0170z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1719G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1720A;

    /* renamed from: B, reason: collision with root package name */
    public C0159o f1721B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1722C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1723D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1724E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1725v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1726w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1727x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1728y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1729z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1728y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.luckyreads.bookshelf.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.luckyreads.bookshelf.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.luckyreads.bookshelf.R.id.design_menu_item_text);
        this.f1729z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1720A == null) {
                this.f1720A = (FrameLayout) ((ViewStub) findViewById(com.luckyreads.bookshelf.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1720A.removeAllViews();
            this.f1720A.addView(view);
        }
    }

    @Override // k.InterfaceC0170z
    public final void a(C0159o c0159o) {
        StateListDrawable stateListDrawable;
        this.f1721B = c0159o;
        int i = c0159o.f2691a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0159o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.luckyreads.bookshelf.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1719G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f381a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0159o.isCheckable());
        setChecked(c0159o.isChecked());
        setEnabled(c0159o.isEnabled());
        setTitle(c0159o.f2694e);
        setIcon(c0159o.getIcon());
        setActionView(c0159o.getActionView());
        setContentDescription(c0159o.f2704q);
        e1.a(this, c0159o.f2705r);
        C0159o c0159o2 = this.f1721B;
        CharSequence charSequence = c0159o2.f2694e;
        CheckedTextView checkedTextView = this.f1729z;
        if (charSequence == null && c0159o2.getIcon() == null && this.f1721B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1720A;
            if (frameLayout != null) {
                C0269x0 c0269x0 = (C0269x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0269x0).width = -1;
                this.f1720A.setLayoutParams(c0269x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1720A;
        if (frameLayout2 != null) {
            C0269x0 c0269x02 = (C0269x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0269x02).width = -2;
            this.f1720A.setLayoutParams(c0269x02);
        }
    }

    @Override // k.InterfaceC0170z
    public C0159o getItemData() {
        return this.f1721B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0159o c0159o = this.f1721B;
        if (c0159o != null && c0159o.isCheckable() && this.f1721B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1719G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1727x != z2) {
            this.f1727x = z2;
            this.F.h(this.f1729z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1729z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1728y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1723D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1722C);
            }
            int i = this.f1725v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1726w) {
            if (this.f1724E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f43a;
                Drawable a2 = k.a(resources, com.luckyreads.bookshelf.R.drawable.navigation_empty_icon, theme);
                this.f1724E = a2;
                if (a2 != null) {
                    int i2 = this.f1725v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1724E;
        }
        this.f1729z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1729z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1725v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1722C = colorStateList;
        this.f1723D = colorStateList != null;
        C0159o c0159o = this.f1721B;
        if (c0159o != null) {
            setIcon(c0159o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1729z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1726w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1729z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1729z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1729z.setText(charSequence);
    }
}
