package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC0152A;
import l.MenuC0169m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0152A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // l.InterfaceC0152A
    public final void a(MenuC0169m menuC0169m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
