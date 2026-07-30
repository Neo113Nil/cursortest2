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
import com.crrepa.band.my.training.widgets.GpsSignalView;
import com.crrepa.band.my.training.widgets.RectangleProgressView;
import com.google.android.gms.maps.MapView;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityMapTrainingBinding implements ViewBinding {

    @NonNull
    public final Button btnScreenLock;

    @NonNull
    public final Button btnTrainingEnd;

    @NonNull
    public final Button btnTrainingPause;

    @NonNull
    public final MapView googleMapView;

    @NonNull
    public final GpsSignalView gpsSignalView;

    @NonNull
    public final IncludeMapTrainingDetailData1Binding includeData1;

    @NonNull
    public final IncludeMapTrainingDetailData2Binding includeData2;

    @NonNull
    public final ImageView ivLocation;

    @NonNull
    public final ImageView ivSetting;

    @NonNull
    public final View lineTrainingDefault;

    @NonNull
    public final LinearLayout llTrainingDetail;

    @NonNull
    public final LinearLayout llTrainingState;

    @NonNull
    public final RectangleProgressView progressViewUnlock;

    @NonNull
    public final ProgressBar progressbarTrainingGoal;

    @NonNull
    public final RelativeLayout rlCountDownTimer;

    @NonNull
    public final RelativeLayout rlMapContainer;

    @NonNull
    public final RelativeLayout rlScreenUnlock;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout shadowTrainingEnd;

    @NonNull
    public final TextView tvCountDown;

    @NonNull
    public final TextView tvTimeGoalValue;

    @NonNull
    public final TextView tvTrainingCurrentValue;

    @NonNull
    public final TextView tvTrainingGoalAchieved;

    @NonNull
    public final TextView tvTrainingGoalValue;

    @NonNull
    public final ImageView viewSignalWeak;

    private ActivityMapTrainingBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull MapView mapView, @NonNull GpsSignalView gpsSignalView, @NonNull IncludeMapTrainingDetailData1Binding includeMapTrainingDetailData1Binding, @NonNull IncludeMapTrainingDetailData2Binding includeMapTrainingDetailData2Binding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RectangleProgressView rectangleProgressView, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ImageView imageView3) {
        this.rootView = relativeLayout;
        this.btnScreenLock = button;
        this.btnTrainingEnd = button2;
        this.btnTrainingPause = button3;
        this.googleMapView = mapView;
        this.gpsSignalView = gpsSignalView;
        this.includeData1 = includeMapTrainingDetailData1Binding;
        this.includeData2 = includeMapTrainingDetailData2Binding;
        this.ivLocation = imageView;
        this.ivSetting = imageView2;
        this.lineTrainingDefault = view;
        this.llTrainingDetail = linearLayout;
        this.llTrainingState = linearLayout2;
        this.progressViewUnlock = rectangleProgressView;
        this.progressbarTrainingGoal = progressBar;
        this.rlCountDownTimer = relativeLayout2;
        this.rlMapContainer = relativeLayout3;
        this.rlScreenUnlock = relativeLayout4;
        this.shadowTrainingEnd = shadowLayout;
        this.tvCountDown = textView;
        this.tvTimeGoalValue = textView2;
        this.tvTrainingCurrentValue = textView3;
        this.tvTrainingGoalAchieved = textView4;
        this.tvTrainingGoalValue = textView5;
        this.viewSignalWeak = imageView3;
    }

    @NonNull
    public static ActivityMapTrainingBinding bind(@NonNull View view) {
        int i8 = R.id.btn_screen_lock;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_screen_lock);
        if (button != null) {
            i8 = R.id.btn_training_end;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_training_end);
            if (button2 != null) {
                i8 = R.id.btn_training_pause;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_training_pause);
                if (button3 != null) {
                    i8 = R.id.google_map_view;
                    MapView mapView = (MapView) ViewBindings.findChildViewById(view, R.id.google_map_view);
                    if (mapView != null) {
                        i8 = R.id.gps_signal_view;
                        GpsSignalView gpsSignalView = (GpsSignalView) ViewBindings.findChildViewById(view, R.id.gps_signal_view);
                        if (gpsSignalView != null) {
                            i8 = R.id.include_data_1;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_data_1);
                            if (findChildViewById != null) {
                                IncludeMapTrainingDetailData1Binding bind = IncludeMapTrainingDetailData1Binding.bind(findChildViewById);
                                i8 = R.id.include_data_2;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_data_2);
                                if (findChildViewById2 != null) {
                                    IncludeMapTrainingDetailData2Binding bind2 = IncludeMapTrainingDetailData2Binding.bind(findChildViewById2);
                                    i8 = R.id.iv_location;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_location);
                                    if (imageView != null) {
                                        i8 = R.id.iv_setting;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_setting);
                                        if (imageView2 != null) {
                                            i8 = R.id.line_training_default;
                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.line_training_default);
                                            if (findChildViewById3 != null) {
                                                i8 = R.id.ll_training_detail;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_detail);
                                                if (linearLayout != null) {
                                                    i8 = R.id.ll_training_state;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_state);
                                                    if (linearLayout2 != null) {
                                                        i8 = R.id.progress_view_unlock;
                                                        RectangleProgressView rectangleProgressView = (RectangleProgressView) ViewBindings.findChildViewById(view, R.id.progress_view_unlock);
                                                        if (rectangleProgressView != null) {
                                                            i8 = R.id.progressbar_training_goal;
                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressbar_training_goal);
                                                            if (progressBar != null) {
                                                                i8 = R.id.rl_count_down_timer;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_count_down_timer);
                                                                if (relativeLayout != null) {
                                                                    i8 = R.id.rl_map_container;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_map_container);
                                                                    if (relativeLayout2 != null) {
                                                                        i8 = R.id.rl_screen_unlock;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_screen_unlock);
                                                                        if (relativeLayout3 != null) {
                                                                            i8 = R.id.shadow_training_end;
                                                                            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_training_end);
                                                                            if (shadowLayout != null) {
                                                                                i8 = R.id.tv_count_down;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count_down);
                                                                                if (textView != null) {
                                                                                    i8 = R.id.tv_time_goal_value;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_goal_value);
                                                                                    if (textView2 != null) {
                                                                                        i8 = R.id.tv_training_current_value;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_current_value);
                                                                                        if (textView3 != null) {
                                                                                            i8 = R.id.tv_training_goal_achieved;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_goal_achieved);
                                                                                            if (textView4 != null) {
                                                                                                i8 = R.id.tv_training_goal_value;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_goal_value);
                                                                                                if (textView5 != null) {
                                                                                                    i8 = R.id.view_signal_weak;
                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.view_signal_weak);
                                                                                                    if (imageView3 != null) {
                                                                                                        return new ActivityMapTrainingBinding((RelativeLayout) view, button, button2, button3, mapView, gpsSignalView, bind, bind2, imageView, imageView2, findChildViewById3, linearLayout, linearLayout2, rectangleProgressView, progressBar, relativeLayout, relativeLayout2, relativeLayout3, shadowLayout, textView, textView2, textView3, textView4, textView5, imageView3);
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
    public static ActivityMapTrainingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMapTrainingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_map_training, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
