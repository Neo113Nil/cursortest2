package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentGpsTrainingGoalBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvGoalList;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCustom;

    @NonNull
    public final TextView tvGoal;

    @NonNull
    public final TextView tvGoalUnit;

    private FragmentGpsTrainingGoalBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.rcvGoalList = recyclerView;
        this.tvCustom = textView;
        this.tvGoal = textView2;
        this.tvGoalUnit = textView3;
    }

    @NonNull
    public static FragmentGpsTrainingGoalBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_goal_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_goal_list);
        if (recyclerView != null) {
            i8 = R.id.tv_custom;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_custom);
            if (textView != null) {
                i8 = R.id.tv_goal;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal);
                if (textView2 != null) {
                    i8 = R.id.tv_goal_unit;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal_unit);
                    if (textView3 != null) {
                        return new FragmentGpsTrainingGoalBinding((LinearLayout) view, recyclerView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentGpsTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentGpsTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gps_training_goal, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
