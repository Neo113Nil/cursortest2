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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemTrainingHistoryInfoBinding implements ViewBinding {

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final ImageView ivDataOrigin;

    @NonNull
    public final ImageView ivTraining;

    @NonNull
    public final LinearLayout llDate;

    @NonNull
    public final LinearLayout llGomoreTitle;

    @NonNull
    public final RelativeLayout rlTrainingRecords;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvGomoreTitle;

    @NonNull
    public final TextView tvTrainingCalories;

    @NonNull
    public final TextView tvTrainingDate;

    @NonNull
    public final TextView tvTrainingDistance;

    @NonNull
    public final TextView tvTrainingDuration;

    @NonNull
    public final TextView tvTrainingHr;

    @NonNull
    public final TextView tvTrainingName;

    @NonNull
    public final TextView tvTrainingPace;

    @NonNull
    public final TextView tvTrainingTime;

    private ItemTrainingHistoryInfoBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.rootView = relativeLayout;
        this.ivContinue = imageView;
        this.ivDataOrigin = imageView2;
        this.ivTraining = imageView3;
        this.llDate = linearLayout;
        this.llGomoreTitle = linearLayout2;
        this.rlTrainingRecords = relativeLayout2;
        this.tvGomoreTitle = textView;
        this.tvTrainingCalories = textView2;
        this.tvTrainingDate = textView3;
        this.tvTrainingDistance = textView4;
        this.tvTrainingDuration = textView5;
        this.tvTrainingHr = textView6;
        this.tvTrainingName = textView7;
        this.tvTrainingPace = textView8;
        this.tvTrainingTime = textView9;
    }

    @NonNull
    public static ItemTrainingHistoryInfoBinding bind(@NonNull View view) {
        int i8 = R.id.iv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_continue);
        if (imageView != null) {
            i8 = R.id.iv_data_origin;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_data_origin);
            if (imageView2 != null) {
                i8 = R.id.iv_training;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training);
                if (imageView3 != null) {
                    i8 = R.id.ll_date;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_date);
                    if (linearLayout != null) {
                        i8 = R.id.ll_gomore_title;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_gomore_title);
                        if (linearLayout2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i8 = R.id.tv_gomore_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gomore_title);
                            if (textView != null) {
                                i8 = R.id.tv_training_calories;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_calories);
                                if (textView2 != null) {
                                    i8 = R.id.tv_training_date;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_date);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_training_distance;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_distance);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_training_duration;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_duration);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_training_hr;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_hr);
                                                if (textView6 != null) {
                                                    i8 = R.id.tv_training_name;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_name);
                                                    if (textView7 != null) {
                                                        i8 = R.id.tv_training_pace;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_pace);
                                                        if (textView8 != null) {
                                                            i8 = R.id.tv_training_time;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_time);
                                                            if (textView9 != null) {
                                                                return new ItemTrainingHistoryInfoBinding(relativeLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static ItemTrainingHistoryInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemTrainingHistoryInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_training_history_info, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
