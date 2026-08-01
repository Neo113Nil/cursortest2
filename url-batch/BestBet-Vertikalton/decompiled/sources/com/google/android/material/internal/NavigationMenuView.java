package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.InterfaceC0172B;
import k.MenuC0189m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0172B {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.InterfaceC0172B
    public final void c(MenuC0189m menuC0189m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
