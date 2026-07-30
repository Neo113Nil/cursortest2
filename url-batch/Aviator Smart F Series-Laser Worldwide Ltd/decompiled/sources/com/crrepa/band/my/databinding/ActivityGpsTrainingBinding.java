package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityGpsTrainingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RecyclerView rcvGpsTraining;

    @NonNull
    private final LinearLayout rootView;

    private ActivityGpsTrainingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.ivTitleBack = imageView;
        this.rcvGpsTraining = recyclerView;
    }

    @NonNull
    public static ActivityGpsTrainingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.rcv_gps_training;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_gps_training);
            if (recyclerView != null) {
                return new ActivityGpsTrainingBinding((LinearLayout) view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityGpsTrainingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGpsTrainingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_gps_training, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
