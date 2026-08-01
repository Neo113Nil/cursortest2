package com.google.android.material.internal;

import B.j;
import B.q;
import D.a;
import D0.e;
import K.Q;
import L0.d;
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
import k.C0192p;
import k.InterfaceC0171A;
import l.C0265v0;
import l.d1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements InterfaceC0171A {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f2326G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f2327A;

    /* renamed from: B, reason: collision with root package name */
    public C0192p f2328B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2329C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2330D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f2331E;
    public final e F;

    /* renamed from: v, reason: collision with root package name */
    public int f2332v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2333w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2334x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2335y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f2336z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2335y = true;
        e eVar = new e(2, this);
        this.F = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.fortunequest.neontrack.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.fortunequest.neontrack.R.id.design_menu_item_text);
        this.f2336z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Q.l(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2327A == null) {
                this.f2327A = (FrameLayout) ((ViewStub) findViewById(com.fortunequest.neontrack.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2327A.removeAllViews();
            this.f2327A.addView(view);
        }
    }

    @Override // k.InterfaceC0171A
    public final void a(C0192p c0192p) {
        StateListDrawable stateListDrawable;
        this.f2328B = c0192p;
        int i = c0192p.f3191a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0192p.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.fortunequest.neontrack.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2326G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Q.f578a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0192p.isCheckable());
        setChecked(c0192p.isChecked());
        setEnabled(c0192p.isEnabled());
        setTitle(c0192p.f3194e);
        setIcon(c0192p.getIcon());
        setActionView(c0192p.getActionView());
        setContentDescription(c0192p.f3204q);
        d1.a(this, c0192p.f3205r);
        C0192p c0192p2 = this.f2328B;
        CharSequence charSequence = c0192p2.f3194e;
        CheckedTextView checkedTextView = this.f2336z;
        if (charSequence == null && c0192p2.getIcon() == null && this.f2328B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2327A;
            if (frameLayout != null) {
                C0265v0 c0265v0 = (C0265v0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0265v0).width = -1;
                this.f2327A.setLayoutParams(c0265v0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2327A;
        if (frameLayout2 != null) {
            C0265v0 c0265v02 = (C0265v0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0265v02).width = -2;
            this.f2327A.setLayoutParams(c0265v02);
        }
    }

    @Override // k.InterfaceC0171A
    public C0192p getItemData() {
        return this.f2328B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0192p c0192p = this.f2328B;
        if (c0192p != null && c0192p.isCheckable() && this.f2328B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2326G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2334x != z2) {
            this.f2334x = z2;
            this.F.h(this.f2336z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2336z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2335y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2330D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f2329C);
            }
            int i = this.f2332v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2333w) {
            if (this.f2331E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = q.f54a;
                Drawable a2 = j.a(resources, com.fortunequest.neontrack.R.drawable.navigation_empty_icon, theme);
                this.f2331E = a2;
                if (a2 != null) {
                    int i2 = this.f2332v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2331E;
        }
        this.f2336z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f2336z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2332v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2329C = colorStateList;
        this.f2330D = colorStateList != null;
        C0192p c0192p = this.f2328B;
        if (c0192p != null) {
            setIcon(c0192p.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2336z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2333w = z2;
    }

    public void setTextAppearance(int i) {
        this.f2336z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2336z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2336z.setText(charSequence);
    }
}
