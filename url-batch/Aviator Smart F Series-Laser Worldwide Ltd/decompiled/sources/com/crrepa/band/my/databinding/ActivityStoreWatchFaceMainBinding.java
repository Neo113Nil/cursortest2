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
public final class ActivityStoreWatchFaceMainBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding layoutTitle;

    @NonNull
    public final RecyclerView rcvWatchFace;

    @NonNull
    private final CoordinatorLayout rootView;

    private ActivityStoreWatchFaceMainBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull RecyclerView recyclerView) {
        this.rootView = coordinatorLayout;
        this.layoutTitle = bandDataAppbarBinding;
        this.rcvWatchFace = recyclerView;
    }

    @NonNull
    public static ActivityStoreWatchFaceMainBinding bind(@NonNull View view) {
        int i8 = R.id.layout_title;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.layout_title);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_watch_face);
            if (recyclerView != null) {
                return new ActivityStoreWatchFaceMainBinding((CoordinatorLayout) view, bind, recyclerView);
            }
            i8 = R.id.rcv_watch_face;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStoreWatchFaceMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStoreWatchFaceMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_store_watch_face_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
