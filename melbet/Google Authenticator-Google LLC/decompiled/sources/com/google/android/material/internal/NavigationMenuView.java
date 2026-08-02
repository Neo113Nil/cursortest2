package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.gd;
import defpackage.gr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements gr {
    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Y(new LinearLayoutManager(1));
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.gr
    public final void a(gd gdVar) {
    }
}
