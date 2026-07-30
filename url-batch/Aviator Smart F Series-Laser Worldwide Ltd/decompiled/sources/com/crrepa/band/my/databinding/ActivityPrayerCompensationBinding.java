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
public final class ActivityPrayerCompensationBinding implements ViewBinding {

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final RecyclerView rvPrayerCompensationList;

    @NonNull
    public final BandDataAppbarBinding topBar;

    private ActivityPrayerCompensationBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull BandDataAppbarBinding bandDataAppbarBinding) {
        this.rootView = coordinatorLayout;
        this.rvPrayerCompensationList = recyclerView;
        this.topBar = bandDataAppbarBinding;
    }

    @NonNull
    public static ActivityPrayerCompensationBinding bind(@NonNull View view) {
        int i8 = R.id.rv_prayer_compensation_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_prayer_compensation_list);
        if (recyclerView != null) {
            i8 = R.id.top_bar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_bar);
            if (findChildViewById != null) {
                return new ActivityPrayerCompensationBinding((CoordinatorLayout) view, recyclerView, BandDataAppbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityPrayerCompensationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPrayerCompensationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_prayer_compensation, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
