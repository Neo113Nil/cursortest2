package com.google.android.material.internal;

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
import defpackage.fiv;
import defpackage.fja;
import defpackage.gf;
import defpackage.gq;
import defpackage.ka;
import defpackage.uy;
import defpackage.wv;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends fiv implements gq {
    private static final int[] o = {R.attr.state_checked};
    public int c;
    public boolean d;
    public boolean e;
    public boolean i;
    public final CheckedTextView j;
    public FrameLayout k;
    public gf l;
    public ColorStateList m;
    public boolean n;
    private Drawable p;
    private final wv q;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        fja fjaVar = new fja(this);
        this.q = fjaVar;
        r(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.authenticator2.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.c = context.getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.apps.authenticator2.R.id.design_menu_item_text);
        this.j = checkedTextView;
        yq.l(checkedTextView, fjaVar);
    }

    @Override // defpackage.gq
    public final gf a() {
        return this.l;
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            if (this.n) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.m);
            }
            int i = this.c;
            drawable.setBounds(0, 0, i, i);
        } else if (this.d) {
            if (this.p == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = uy.a;
                Drawable drawable2 = resources.getDrawable(com.google.android.apps.authenticator2.R.drawable.navigation_empty_icon, theme);
                this.p = drawable2;
                if (drawable2 != null) {
                    int i2 = this.c;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.p;
        }
        this.j.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // defpackage.gq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gq
    public final void f(gf gfVar) {
        StateListDrawable stateListDrawable;
        this.l = gfVar;
        int i = gfVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != gfVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.authenticator2.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(o, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean isCheckable = gfVar.isCheckable();
        refreshDrawableState();
        if (this.e != isCheckable) {
            this.e = isCheckable;
            this.q.e(this.j, 2048);
        }
        boolean isChecked = gfVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.j;
        checkedTextView.setChecked(isChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (isChecked && this.i) ? 1 : 0);
        setEnabled(gfVar.isEnabled());
        checkedTextView.setText(gfVar.d);
        b(gfVar.getIcon());
        View actionView = gfVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.android.apps.authenticator2.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(gfVar.l);
        setTooltipText(gfVar.m);
        gf gfVar2 = this.l;
        if (gfVar2.d == null && gfVar2.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                ka kaVar = (ka) frameLayout.getLayoutParams();
                kaVar.width = -1;
                this.k.setLayoutParams(kaVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            ka kaVar2 = (ka) frameLayout2.getLayoutParams();
            kaVar2.width = -2;
            this.k.setLayoutParams(kaVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        gf gfVar = this.l;
        if (gfVar != null && gfVar.isCheckable() && gfVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, o);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
