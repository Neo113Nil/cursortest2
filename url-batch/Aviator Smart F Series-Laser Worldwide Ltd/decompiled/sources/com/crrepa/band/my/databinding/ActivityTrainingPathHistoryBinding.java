package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityTrainingPathHistoryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RecyclerView rcvTrainingHistory;

    @NonNull
    public final RelativeLayout rlMaxTimePerDay;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlTrainingRecordsTab;

    @NonNull
    public final TextView tvCaloriesUnit;

    @NonNull
    public final TextView tvMaxTimePerDay;

    @NonNull
    public final TextView tvMaxTimePerDayTitle;

    @NonNull
    public final TextView tvTimeUnit;

    @NonNull
    public final TextView tvTimesUnit;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTotalCalories;

    @NonNull
    public final TextView tvTotalCaloriesTitle;

    @NonNull
    public final TextView tvTotalExerciseTime;

    @NonNull
    public final TextView tvTotalTimes;

    @NonNull
    public final TextView tvTotalTimesTitle;

    private ActivityTrainingPathHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.rootView = linearLayout;
        this.ivTitleBack = imageView;
        this.rcvTrainingHistory = recyclerView;
        this.rlMaxTimePerDay = relativeLayout;
        this.tlTrainingRecordsTab = tabLayout;
        this.tvCaloriesUnit = textView;
        this.tvMaxTimePerDay = textView2;
        this.tvMaxTimePerDayTitle = textView3;
        this.tvTimeUnit = textView4;
        this.tvTimesUnit = textView5;
        this.tvTitle = textView6;
        this.tvTotalCalories = textView7;
        this.tvTotalCaloriesTitle = textView8;
        this.tvTotalExerciseTime = textView9;
        this.tvTotalTimes = textView10;
        this.tvTotalTimesTitle = textView11;
    }

    @NonNull
    public static ActivityTrainingPathHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.rcv_training_history;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_training_history);
            if (recyclerView != null) {
                i8 = R.id.rl_max_time_per_day;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_max_time_per_day);
                if (relativeLayout != null) {
                    i8 = R.id.tl_training_records_tab;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_training_records_tab);
                    if (tabLayout != null) {
                        i8 = R.id.tv_calories_unit;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calories_unit);
                        if (textView != null) {
                            i8 = R.id.tv_max_time_per_day;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_time_per_day);
                            if (textView2 != null) {
                                i8 = R.id.tv_max_time_per_day_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_time_per_day_title);
                                if (textView3 != null) {
                                    i8 = R.id.tv_time_unit;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_unit);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_times_unit;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_times_unit);
                                        if (textView5 != null) {
                                            i8 = R.id.tv_title;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                            if (textView6 != null) {
                                                i8 = R.id.tv_total_calories;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_calories);
                                                if (textView7 != null) {
                                                    i8 = R.id.tv_total_calories_title;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_calories_title);
                                                    if (textView8 != null) {
                                                        i8 = R.id.tv_total_exercise_time;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_exercise_time);
                                                        if (textView9 != null) {
                                                            i8 = R.id.tv_total_times;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_times);
                                                            if (textView10 != null) {
                                                                i8 = R.id.tv_total_times_title;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_times_title);
                                                                if (textView11 != null) {
                                                                    return new ActivityTrainingPathHistoryBinding((LinearLayout) view, imageView, recyclerView, relativeLayout, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityTrainingPathHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingPathHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_path_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
