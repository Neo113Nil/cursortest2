package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemGpsTrainingOneDistancePaceBinding implements ViewBinding {

    @NonNull
    public final ProgressBar pb;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvIndex;

    @NonNull
    public final TextView tvProgress;

    private ItemGpsTrainingOneDistancePaceBinding(@NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.pb = progressBar;
        this.tvIndex = textView;
        this.tvProgress = textView2;
    }

    @NonNull
    public static ItemGpsTrainingOneDistancePaceBinding bind(@NonNull View view) {
        int i8 = R.id.pb;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb);
        if (progressBar != null) {
            i8 = R.id.tv_index;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_index);
            if (textView != null) {
                i8 = R.id.tv_progress;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress);
                if (textView2 != null) {
                    return new ItemGpsTrainingOneDistancePaceBinding((RelativeLayout) view, progressBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemGpsTrainingOneDistancePaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemGpsTrainingOneDistancePaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_gps_training_one_distance_pace, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
