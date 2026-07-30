package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemGpsTrainingGoalBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llGpsTrainingGoal;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTrainingGoal;

    @NonNull
    public final TextView tvTrainingGoalHint;

    private ItemGpsTrainingGoalBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.llGpsTrainingGoal = linearLayout2;
        this.tvTrainingGoal = textView;
        this.tvTrainingGoalHint = textView2;
    }

    @NonNull
    public static ItemGpsTrainingGoalBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.tv_training_goal;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_goal);
        if (textView != null) {
            i8 = R.id.tv_training_goal_hint;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_goal_hint);
            if (textView2 != null) {
                return new ItemGpsTrainingGoalBinding(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemGpsTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemGpsTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_gps_training_goal, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
