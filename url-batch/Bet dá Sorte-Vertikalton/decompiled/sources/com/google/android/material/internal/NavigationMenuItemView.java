package com.google.android.material.internal;

import B.k;
import B.r;
import G0.a;
import G0.f;
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
import k.C0159o;
import k.InterfaceC0170z;
import l.C0242v0;
import l.d1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0170z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1850G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1851A;

    /* renamed from: B, reason: collision with root package name */
    public C0159o f1852B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1853C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1854D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1855E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1856v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1857w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1858x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1859y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1860z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1859y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.glasspulse.glasspulse.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.glasspulse.glasspulse.R.id.design_menu_item_text);
        this.f1860z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1851A == null) {
                this.f1851A = (FrameLayout) ((ViewStub) findViewById(com.glasspulse.glasspulse.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1851A.removeAllViews();
            this.f1851A.addView(view);
        }
    }

    @Override // k.InterfaceC0170z
    public final void a(C0159o c0159o) {
        StateListDrawable stateListDrawable;
        this.f1852B = c0159o;
        int i = c0159o.f2675a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0159o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.glasspulse.glasspulse.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1850G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f351a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0159o.isCheckable());
        setChecked(c0159o.isChecked());
        setEnabled(c0159o.isEnabled());
        setTitle(c0159o.f2678e);
        setIcon(c0159o.getIcon());
        setActionView(c0159o.getActionView());
        setContentDescription(c0159o.f2688q);
        d1.a(this, c0159o.f2689r);
        C0159o c0159o2 = this.f1852B;
        CharSequence charSequence = c0159o2.f2678e;
        CheckedTextView checkedTextView = this.f1860z;
        if (charSequence == null && c0159o2.getIcon() == null && this.f1852B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1851A;
            if (frameLayout != null) {
                C0242v0 c0242v0 = (C0242v0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0242v0).width = -1;
                this.f1851A.setLayoutParams(c0242v0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1851A;
        if (frameLayout2 != null) {
            C0242v0 c0242v02 = (C0242v0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0242v02).width = -2;
            this.f1851A.setLayoutParams(c0242v02);
        }
    }

    @Override // k.InterfaceC0170z
    public C0159o getItemData() {
        return this.f1852B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0159o c0159o = this.f1852B;
        if (c0159o != null && c0159o.isCheckable() && this.f1852B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1850G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1858x != z2) {
            this.f1858x = z2;
            this.F.h(this.f1860z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1860z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1859y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1854D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1853C);
            }
            int i = this.f1856v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1857w) {
            if (this.f1855E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f66a;
                Drawable a2 = k.a(resources, com.glasspulse.glasspulse.R.drawable.navigation_empty_icon, theme);
                this.f1855E = a2;
                if (a2 != null) {
                    int i2 = this.f1856v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1855E;
        }
        this.f1860z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1860z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1856v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1853C = colorStateList;
        this.f1854D = colorStateList != null;
        C0159o c0159o = this.f1852B;
        if (c0159o != null) {
            setIcon(c0159o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1860z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1857w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1860z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1860z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1860z.setText(charSequence);
    }
}
