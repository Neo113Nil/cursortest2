package com.trembin.nirefon.betfury.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.trembin.nirefon.betfury.R;
import defpackage.bd0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ActivityMain2Binding {
    public final LinearLayout emptyState;
    public final FloatingActionButton fab;
    public final RecyclerView recyclerView;
    private final CoordinatorLayout rootView;
    public final MaterialToolbar toolbar;

    private ActivityMain2Binding(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, FloatingActionButton floatingActionButton, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.rootView = coordinatorLayout;
        this.emptyState = linearLayout;
        this.fab = floatingActionButton;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
    }

    public static ActivityMain2Binding bind(View view) {
        int i = R.id.emptyState;
        LinearLayout linearLayout = (LinearLayout) bd0.d(view, R.id.emptyState);
        if (linearLayout != null) {
            i = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) bd0.d(view, R.id.fab);
            if (floatingActionButton != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) bd0.d(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) bd0.d(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        return new ActivityMain2Binding((CoordinatorLayout) view, linearLayout, floatingActionButton, recyclerView, materialToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityMain2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMain2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
