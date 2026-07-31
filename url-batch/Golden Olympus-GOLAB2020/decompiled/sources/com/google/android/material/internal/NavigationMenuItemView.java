package com.google.android.material.internal;

import B.w;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.e0;
import androidx.core.content.res.f;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import androidx.core.widget.j;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.ironsource.mediationsdk.metadata.a;
import e.AbstractC2405a;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final C1280a accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private g itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                J.a aVar = (J.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.actionArea.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            J.a aVar2 = (J.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.actionArea.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC2405a.f36206t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void initialize(g gVar, int i4) {
        this.itemData = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            AbstractC1281a0.s0(this, createDefaultBackground());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        e0.a(this, gVar.getTooltipText());
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        g gVar = this.itemData;
        if (gVar != null && gVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.checkable != z4) {
            this.checkable = z4;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, a.f17688n);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        this.textView.setChecked(z4);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
                androidx.core.graphics.drawable.a.i(drawable, this.iconTintList);
            }
            int i4 = this.iconSize;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable e4 = f.e(getResources(), R$drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = e4;
                if (e4 != null) {
                    int i5 = this.iconSize;
                    e4.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.emptyDrawable;
        }
        j.j(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.textView.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.iconSize = i4;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        g gVar = this.itemData;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.textView.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.needsEmptyIcon = z4;
    }

    public void setTextAppearance(int i4) {
        j.p(this.textView, i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        C1280a c1280a = new C1280a() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.C1280a
            public void onInitializeAccessibilityNodeInfo(View view, w wVar) {
                super.onInitializeAccessibilityNodeInfo(view, wVar);
                wVar.i0(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c1280a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC1281a0.o0(checkedTextView, c1280a);
    }
}
