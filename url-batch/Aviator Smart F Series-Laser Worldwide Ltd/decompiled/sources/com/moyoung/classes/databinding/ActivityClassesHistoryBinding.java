package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ActivityClassesHistoryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvHistory;

    @NonNull
    public final TabLayout tbRecords;

    @NonNull
    public final TextView tvCaloriesUnit;

    @NonNull
    public final TextView tvTimeUnit;

    @NonNull
    public final TextView tvTimesUnit;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTotalKcalTitle;

    @NonNull
    public final TextView tvTotalSpentKcal;

    @NonNull
    public final TextView tvTotalSpentTime;

    @NonNull
    public final TextView tvTotalTimes;

    @NonNull
    public final TextView tvTotalTimesTitle;

    private ActivityClassesHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.rootView = linearLayout;
        this.ivTitleBack = imageView;
        this.rvHistory = recyclerView;
        this.tbRecords = tabLayout;
        this.tvCaloriesUnit = textView;
        this.tvTimeUnit = textView2;
        this.tvTimesUnit = textView3;
        this.tvTitle = textView4;
        this.tvTotalKcalTitle = textView5;
        this.tvTotalSpentKcal = textView6;
        this.tvTotalSpentTime = textView7;
        this.tvTotalTimes = textView8;
        this.tvTotalTimesTitle = textView9;
    }

    @NonNull
    public static ActivityClassesHistoryBinding bind(@NonNull View view) {
        int i8 = R$id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.rv_history;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
            if (recyclerView != null) {
                i8 = R$id.tb_records;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i8);
                if (tabLayout != null) {
                    i8 = R$id.tv_calories_unit;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView != null) {
                        i8 = R$id.tv_time_unit;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView2 != null) {
                            i8 = R$id.tv_times_unit;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView3 != null) {
                                i8 = R$id.tv_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView4 != null) {
                                    i8 = R$id.tv_total_kcal_title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView5 != null) {
                                        i8 = R$id.tv_total_spent_kcal;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView6 != null) {
                                            i8 = R$id.tv_total_spent_time;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView7 != null) {
                                                i8 = R$id.tv_total_times;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                if (textView8 != null) {
                                                    i8 = R$id.tv_total_times_title;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                    if (textView9 != null) {
                                                        return new ActivityClassesHistoryBinding((LinearLayout) view, imageView, recyclerView, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static ActivityClassesHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityClassesHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_classes_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
