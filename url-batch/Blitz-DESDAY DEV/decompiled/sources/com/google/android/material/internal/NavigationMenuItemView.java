package com.google.android.material.internal;

import D.k;
import D.r;
import F0.a;
import F0.f;
import M.Q;
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
import k.o;
import k.z;
import l.C0221x0;
import l.f1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1932G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1933A;

    /* renamed from: B, reason: collision with root package name */
    public o f1934B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1935C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1936D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1937E;

    /* renamed from: F, reason: collision with root package name */
    public final a f1938F;

    /* renamed from: v, reason: collision with root package name */
    public int f1939v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1940w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1941x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1942y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1943z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1942y = true;
        a aVar = new a(1, this);
        this.f1938F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.winfour.neondrop.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.winfour.neondrop.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.winfour.neondrop.R.id.design_menu_item_text);
        this.f1943z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Q.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1933A == null) {
                this.f1933A = (FrameLayout) ((ViewStub) findViewById(com.winfour.neondrop.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1933A.removeAllViews();
            this.f1933A.addView(view);
        }
    }

    @Override // k.z
    public final void a(o oVar) {
        StateListDrawable stateListDrawable;
        this.f1934B = oVar;
        int i = oVar.f2792a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.winfour.neondrop.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1932G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Q.f513a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f2795e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f2805q);
        f1.a(this, oVar.f2806r);
        o oVar2 = this.f1934B;
        CharSequence charSequence = oVar2.f2795e;
        CheckedTextView checkedTextView = this.f1943z;
        if (charSequence == null && oVar2.getIcon() == null && this.f1934B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1933A;
            if (frameLayout != null) {
                C0221x0 c0221x0 = (C0221x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0221x0).width = -1;
                this.f1933A.setLayoutParams(c0221x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1933A;
        if (frameLayout2 != null) {
            C0221x0 c0221x02 = (C0221x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0221x02).width = -2;
            this.f1933A.setLayoutParams(c0221x02);
        }
    }

    @Override // k.z
    public o getItemData() {
        return this.f1934B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f1934B;
        if (oVar != null && oVar.isCheckable() && this.f1934B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1932G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1941x != z2) {
            this.f1941x = z2;
            this.f1938F.h(this.f1943z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1943z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1942y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1936D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                F.a.h(drawable, this.f1935C);
            }
            int i = this.f1939v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1940w) {
            if (this.f1937E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f146a;
                Drawable a2 = k.a(resources, com.winfour.neondrop.R.drawable.navigation_empty_icon, theme);
                this.f1937E = a2;
                if (a2 != null) {
                    int i2 = this.f1939v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1937E;
        }
        this.f1943z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1943z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1939v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1935C = colorStateList;
        this.f1936D = colorStateList != null;
        o oVar = this.f1934B;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1943z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1940w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1943z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1943z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1943z.setText(charSequence);
    }
}
