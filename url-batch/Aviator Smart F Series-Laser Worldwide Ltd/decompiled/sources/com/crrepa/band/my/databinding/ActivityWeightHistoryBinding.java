package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityWeightHistoryBinding implements ViewBinding {

    @NonNull
    public final AppToolbarBinding includeAppToolbar;

    @NonNull
    public final SwipeRecyclerView rcvWeightRecords;

    @NonNull
    private final LinearLayout rootView;

    private ActivityWeightHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull AppToolbarBinding appToolbarBinding, @NonNull SwipeRecyclerView swipeRecyclerView) {
        this.rootView = linearLayout;
        this.includeAppToolbar = appToolbarBinding;
        this.rcvWeightRecords = swipeRecyclerView;
    }

    @NonNull
    public static ActivityWeightHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.include_app_toolbar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_app_toolbar);
        if (findChildViewById != null) {
            AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
            SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_weight_records);
            if (swipeRecyclerView != null) {
                return new ActivityWeightHistoryBinding((LinearLayout) view, bind, swipeRecyclerView);
            }
            i8 = R.id.rcv_weight_records;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityWeightHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWeightHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_weight_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
