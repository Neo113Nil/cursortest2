package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements MenuBuilder.b, m, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1736a = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private MenuBuilder f1737b;

    /* renamed from: c, reason: collision with root package name */
    private int f1738c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f1736a, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.view.menu.m
    public void initialize(MenuBuilder menuBuilder) {
        this.f1737b = menuBuilder;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.v7.view.menu.MenuBuilder.b
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.f1737b.a(menuItemImpl, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((MenuItemImpl) getAdapter().getItem(i));
    }

    public int getWindowAnimations() {
        return this.f1738c;
    }
}
