package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityAllahNamesBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvNames;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final BandDataAppbarBinding topBar;

    private ActivityAllahNamesBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull BandDataAppbarBinding bandDataAppbarBinding) {
        this.rootView = coordinatorLayout;
        this.rcvNames = recyclerView;
        this.topBar = bandDataAppbarBinding;
    }

    @NonNull
    public static ActivityAllahNamesBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_names;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_names);
        if (recyclerView != null) {
            i8 = R.id.top_bar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_bar);
            if (findChildViewById != null) {
                return new ActivityAllahNamesBinding((CoordinatorLayout) view, recyclerView, BandDataAppbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityAllahNamesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAllahNamesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_allah_names, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
