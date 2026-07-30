package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.widgets.RectangleProgressView;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityNoMapTrainingBinding implements ViewBinding {

    @NonNull
    public final Button btnScreenLock;

    @NonNull
    public final Button btnTrainingEnd;

    @NonNull
    public final Button btnTrainingPause;

    @NonNull
    public final ImageView ivTrainingHr;

    @NonNull
    public final ImageView ivTrainingHrTips;

    @NonNull
    public final View lineTrainingDefault;

    @NonNull
    public final LinearLayout llTrainingDetail;

    @NonNull
    public final LinearLayout llTrainingHr;

    @NonNull
    public final LinearLayout llTrainingState;

    @NonNull
    public final RectangleProgressView progressViewUnlock;

    @NonNull
    public final ProgressBar progressbarTrainingGoal;

    @NonNull
    public final RelativeLayout rlCountDownTimer;

    @NonNull
    public final RelativeLayout rlScreenUnlock;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout shadowTrainingEnd;

    @NonNull
    public final TextView tvCountDown;

    @NonNull
    public final TextView tvTrainingCurrentValue;

    @NonNull
    public final TextView tvTrainingDetail1;

    @NonNull
    public final TextView tvTrainingDetail2;

    @NonNull
    public final TextView tvTrainingDetail3;

    @NonNull
    public final TextView tvTrainingDetailName1;

    @NonNull
    public final TextView tvTrainingDetailName2;

    @NonNull
    public final TextView tvTrainingDetailName3;

    @NonNull
    public final TextView tvTrainingGoalAchieved;

    @NonNull
    public final TextView tvTrainingGoalValue;

    @NonNull
    public final TextView tvTrainingHr;

    private ActivityNoMapTrainingBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RectangleProgressView rectangleProgressView, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.rootView = relativeLayout;
        this.btnScreenLock = button;
        this.btnTrainingEnd = button2;
        this.btnTrainingPause = button3;
        this.ivTrainingHr = imageView;
        this.ivTrainingHrTips = imageView2;
        this.lineTrainingDefault = view;
        this.llTrainingDetail = linearLayout;
        this.llTrainingHr = linearLayout2;
        this.llTrainingState = linearLayout3;
        this.progressViewUnlock = rectangleProgressView;
        this.progressbarTrainingGoal = progressBar;
        this.rlCountDownTimer = relativeLayout2;
        this.rlScreenUnlock = relativeLayout3;
        this.shadowTrainingEnd = shadowLayout;
        this.tvCountDown = textView;
        this.tvTrainingCurrentValue = textView2;
        this.tvTrainingDetail1 = textView3;
        this.tvTrainingDetail2 = textView4;
        this.tvTrainingDetail3 = textView5;
        this.tvTrainingDetailName1 = textView6;
        this.tvTrainingDetailName2 = textView7;
        this.tvTrainingDetailName3 = textView8;
        this.tvTrainingGoalAchieved = textView9;
        this.tvTrainingGoalValue = textView10;
        this.tvTrainingHr = textView11;
    }

    @NonNull
    public static ActivityNoMapTrainingBinding bind(@NonNull View view) {
        int i8 = R.id.btn_screen_lock;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_screen_lock);
        if (button != null) {
            i8 = R.id.btn_training_end;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_training_end);
            if (button2 != null) {
                i8 = R.id.btn_training_pause;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_training_pause);
                if (button3 != null) {
                    i8 = R.id.iv_training_hr;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_hr);
                    if (imageView != null) {
                        i8 = R.id.iv_training_hr_tips;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_hr_tips);
                        if (imageView2 != null) {
                            i8 = R.id.line_training_default;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_training_default);
                            if (findChildViewById != null) {
                                i8 = R.id.ll_training_detail;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_detail);
                                if (linearLayout != null) {
                                    i8 = R.id.ll_training_hr;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_hr);
                                    if (linearLayout2 != null) {
                                        i8 = R.id.ll_training_state;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_state);
                                        if (linearLayout3 != null) {
                                            i8 = R.id.progress_view_unlock;
                                            RectangleProgressView rectangleProgressView = (RectangleProgressView) ViewBindings.findChildViewById(view, R.id.progress_view_unlock);
                                            if (rectangleProgressView != null) {
                                                i8 = R.id.progressbar_training_goal;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressbar_training_goal);
                                                if (progressBar != null) {
                                                    i8 = R.id.rl_count_down_timer;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_count_down_timer);
                                                    if (relativeLayout != null) {
                                                        i8 = R.id.rl_screen_unlock;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_screen_unlock);
                                                        if (relativeLayout2 != null) {
                                                            i8 = R.id.shadow_training_end;
                                                            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_training_end);
                                                            if (shadowLayout != null) {
                                                                i8 = R.id.tv_count_down;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count_down);
                                                                if (textView != null) {
                                                                    i8 = R.id.tv_training_current_value;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_current_value);
                                                                    if (textView2 != null) {
                                                                        i8 = R.id.tv_training_detail_1;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_1);
                                                                        if (textView3 != null) {
                                                                            i8 = R.id.tv_training_detail_2;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_2);
                                                                            if (textView4 != null) {
                                                                                i8 = R.id.tv_training_detail_3;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_3);
                                                                                if (textView5 != null) {
                                                                                    i8 = R.id.tv_training_detail_name_1;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_name_1);
                                                                                    if (textView6 != null) {
                                                                                        i8 = R.id.tv_training_detail_name_2;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_name_2);
                                                                                        if (textView7 != null) {
                                                                                            i8 = R.id.tv_training_detail_name_3;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_name_3);
                                                                                            if (textView8 != null) {
                                                                                                i8 = R.id.tv_training_goal_achieved;
                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_goal_achieved);
                                                                                                if (textView9 != null) {
                                                                                                    i8 = R.id.tv_training_goal_value;
                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_goal_value);
                                                                                                    if (textView10 != null) {
                                                                                                        i8 = R.id.tv_training_hr;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_hr);
                                                                                                        if (textView11 != null) {
                                                                                                            return new ActivityNoMapTrainingBinding((RelativeLayout) view, button, button2, button3, imageView, imageView2, findChildViewById, linearLayout, linearLayout2, linearLayout3, rectangleProgressView, progressBar, relativeLayout, relativeLayout2, shadowLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
    public static ActivityNoMapTrainingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityNoMapTrainingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_no_map_training, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
