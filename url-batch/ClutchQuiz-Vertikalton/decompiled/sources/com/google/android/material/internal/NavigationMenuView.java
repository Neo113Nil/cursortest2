package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.InterfaceC0150A;
import k.MenuC0167m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0150A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.InterfaceC0150A
    public final void c(MenuC0167m menuC0167m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
