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
public final class ActivityTrainingAnalysisMainBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCalendar;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivTrainingLoadContinue;

    @NonNull
    public final View line;

    @NonNull
    public final RelativeLayout rlAcwr;

    @NonNull
    public final RelativeLayout rlTrainingLoad;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAcwrTitle;

    @NonNull
    public final TextView tvTrainingAcwr;

    @NonNull
    public final TextView tvTrainingLoad;

    @NonNull
    public final TextView tvTrainingLoadLongTerm;

    @NonNull
    public final TextView tvTrainingLoadShortTerm;

    @NonNull
    public final TextView tvTrainingStatus;

    @NonNull
    public final TextView tvTrainingStatusTitle;

    private ActivityTrainingAnalysisMainBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = linearLayout;
        this.ivCalendar = imageView;
        this.ivClose = imageView2;
        this.ivTrainingLoadContinue = imageView3;
        this.line = view;
        this.rlAcwr = relativeLayout;
        this.rlTrainingLoad = relativeLayout2;
        this.tvAcwrTitle = textView;
        this.tvTrainingAcwr = textView2;
        this.tvTrainingLoad = textView3;
        this.tvTrainingLoadLongTerm = textView4;
        this.tvTrainingLoadShortTerm = textView5;
        this.tvTrainingStatus = textView6;
        this.tvTrainingStatusTitle = textView7;
    }

    @NonNull
    public static ActivityTrainingAnalysisMainBinding bind(@NonNull View view) {
        int i8 = R.id.iv_calendar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_calendar);
        if (imageView != null) {
            i8 = R.id.iv_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView2 != null) {
                i8 = R.id.iv_training_load_continue;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_load_continue);
                if (imageView3 != null) {
                    i8 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i8 = R.id.rl_acwr;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_acwr);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_training_load;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_training_load);
                            if (relativeLayout2 != null) {
                                i8 = R.id.tv_acwr_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_acwr_title);
                                if (textView != null) {
                                    i8 = R.id.tv_training_acwr;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_acwr);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_training_load;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_load);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_training_load_long_term;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_load_long_term);
                                            if (textView4 != null) {
                                                i8 = R.id.tv_training_load_short_term;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_load_short_term);
                                                if (textView5 != null) {
                                                    i8 = R.id.tv_training_status;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_status);
                                                    if (textView6 != null) {
                                                        i8 = R.id.tv_training_status_title;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_status_title);
                                                        if (textView7 != null) {
                                                            return new ActivityTrainingAnalysisMainBinding((LinearLayout) view, imageView, imageView2, imageView3, findChildViewById, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static ActivityTrainingAnalysisMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingAnalysisMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_analysis_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
