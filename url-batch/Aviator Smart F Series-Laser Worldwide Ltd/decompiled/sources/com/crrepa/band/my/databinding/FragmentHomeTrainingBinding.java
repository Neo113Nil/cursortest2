package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.widgets.GpsSignalView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class FragmentHomeTrainingBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flMap;

    @NonNull
    public final MapView googleMapView;

    @NonNull
    public final GpsSignalView gpsSignalView;

    @NonNull
    public final ImageView ivCover;

    @NonNull
    public final ImageView ivIndoorRunning;

    @NonNull
    public final TextView ivLocation;

    @NonNull
    public final ImageView ivNoPermissions;

    @NonNull
    public final TextView ivSetting;

    @NonNull
    public final ImageView ivTrainingGuidanceClose;

    @NonNull
    public final ImageView ivTrainingType;

    @NonNull
    public final RelativeLayout rlRecord;

    @NonNull
    public final RelativeLayout rlTrainingGuidance;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout slShootRunning;

    @NonNull
    public final ShadowLayout slShootWalking;

    @NonNull
    public final TabLayout tabTrainingRunning;

    @NonNull
    public final TabLayout tabTrainingType;

    @NonNull
    public final TabLayout tabTrainingWalking;

    @NonNull
    public final TextView tvBandConnectState;

    @NonNull
    public final TextView tvGoal;

    @NonNull
    public final TextView tvRecordMore;

    @NonNull
    public final TextView tvStart;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTotalDuration;

    @NonNull
    public final TextView tvTotalDurationHint;

    @NonNull
    public final TextView tvTotalDurationUnit;

    @NonNull
    public final TextView tvTotalTimes;

    @NonNull
    public final TextView tvTotalTimesHint;

    @NonNull
    public final TextView tvTotalTimesUnit;

    @NonNull
    public final TextView tvTrainingGuidance;

    @NonNull
    public final TextView tvTrainingGuidanceBtn;

    @NonNull
    public final TextView tvWearTips;

    @NonNull
    public final TextView tvWeather;

    @NonNull
    public final View viewBorder;

    private FragmentHomeTrainingBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull MapView mapView, @NonNull GpsSignalView gpsSignalView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull TabLayout tabLayout, @NonNull TabLayout tabLayout2, @NonNull TabLayout tabLayout3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull View view) {
        this.rootView = relativeLayout;
        this.flMap = frameLayout;
        this.googleMapView = mapView;
        this.gpsSignalView = gpsSignalView;
        this.ivCover = imageView;
        this.ivIndoorRunning = imageView2;
        this.ivLocation = textView;
        this.ivNoPermissions = imageView3;
        this.ivSetting = textView2;
        this.ivTrainingGuidanceClose = imageView4;
        this.ivTrainingType = imageView5;
        this.rlRecord = relativeLayout2;
        this.rlTrainingGuidance = relativeLayout3;
        this.slShootRunning = shadowLayout;
        this.slShootWalking = shadowLayout2;
        this.tabTrainingRunning = tabLayout;
        this.tabTrainingType = tabLayout2;
        this.tabTrainingWalking = tabLayout3;
        this.tvBandConnectState = textView3;
        this.tvGoal = textView4;
        this.tvRecordMore = textView5;
        this.tvStart = textView6;
        this.tvTitle = textView7;
        this.tvTotalDuration = textView8;
        this.tvTotalDurationHint = textView9;
        this.tvTotalDurationUnit = textView10;
        this.tvTotalTimes = textView11;
        this.tvTotalTimesHint = textView12;
        this.tvTotalTimesUnit = textView13;
        this.tvTrainingGuidance = textView14;
        this.tvTrainingGuidanceBtn = textView15;
        this.tvWearTips = textView16;
        this.tvWeather = textView17;
        this.viewBorder = view;
    }

    @NonNull
    public static FragmentHomeTrainingBinding bind(@NonNull View view) {
        int i8 = R.id.fl_map;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_map);
        if (frameLayout != null) {
            i8 = R.id.google_map_view;
            MapView mapView = (MapView) ViewBindings.findChildViewById(view, R.id.google_map_view);
            if (mapView != null) {
                i8 = R.id.gps_signal_view;
                GpsSignalView gpsSignalView = (GpsSignalView) ViewBindings.findChildViewById(view, R.id.gps_signal_view);
                if (gpsSignalView != null) {
                    i8 = R.id.iv_cover;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cover);
                    if (imageView != null) {
                        i8 = R.id.iv_indoor_running;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_indoor_running);
                        if (imageView2 != null) {
                            i8 = R.id.iv_location;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.iv_location);
                            if (textView != null) {
                                i8 = R.id.iv_no_permissions;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_no_permissions);
                                if (imageView3 != null) {
                                    i8 = R.id.iv_setting;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.iv_setting);
                                    if (textView2 != null) {
                                        i8 = R.id.iv_training_guidance_close;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_guidance_close);
                                        if (imageView4 != null) {
                                            i8 = R.id.iv_training_type;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_type);
                                            if (imageView5 != null) {
                                                i8 = R.id.rl_record;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_record);
                                                if (relativeLayout != null) {
                                                    i8 = R.id.rl_training_guidance;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_training_guidance);
                                                    if (relativeLayout2 != null) {
                                                        i8 = R.id.sl_shoot_running;
                                                        ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_shoot_running);
                                                        if (shadowLayout != null) {
                                                            i8 = R.id.sl_shoot_walking;
                                                            ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_shoot_walking);
                                                            if (shadowLayout2 != null) {
                                                                i8 = R.id.tab_training_running;
                                                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_training_running);
                                                                if (tabLayout != null) {
                                                                    i8 = R.id.tab_training_type;
                                                                    TabLayout tabLayout2 = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_training_type);
                                                                    if (tabLayout2 != null) {
                                                                        i8 = R.id.tab_training_walking;
                                                                        TabLayout tabLayout3 = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_training_walking);
                                                                        if (tabLayout3 != null) {
                                                                            i8 = R.id.tv_band_connect_state;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_band_connect_state);
                                                                            if (textView3 != null) {
                                                                                i8 = R.id.tv_goal;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal);
                                                                                if (textView4 != null) {
                                                                                    i8 = R.id.tv_record_more;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_record_more);
                                                                                    if (textView5 != null) {
                                                                                        i8 = R.id.tv_start;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start);
                                                                                        if (textView6 != null) {
                                                                                            i8 = R.id.tv_title;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                                            if (textView7 != null) {
                                                                                                i8 = R.id.tv_total_duration;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_duration);
                                                                                                if (textView8 != null) {
                                                                                                    i8 = R.id.tv_total_duration_hint;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_duration_hint);
                                                                                                    if (textView9 != null) {
                                                                                                        i8 = R.id.tv_total_duration_unit;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_duration_unit);
                                                                                                        if (textView10 != null) {
                                                                                                            i8 = R.id.tv_total_times;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_times);
                                                                                                            if (textView11 != null) {
                                                                                                                i8 = R.id.tv_total_times_hint;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_times_hint);
                                                                                                                if (textView12 != null) {
                                                                                                                    i8 = R.id.tv_total_times_unit;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_total_times_unit);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i8 = R.id.tv_training_guidance;
                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_guidance);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i8 = R.id.tv_training_guidance_btn;
                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_guidance_btn);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i8 = R.id.tv_wear_tips;
                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_wear_tips);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    i8 = R.id.tv_weather;
                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weather);
                                                                                                                                    if (textView17 != null) {
                                                                                                                                        i8 = R.id.view_border;
                                                                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_border);
                                                                                                                                        if (findChildViewById != null) {
                                                                                                                                            return new FragmentHomeTrainingBinding((RelativeLayout) view, frameLayout, mapView, gpsSignalView, imageView, imageView2, textView, imageView3, textView2, imageView4, imageView5, relativeLayout, relativeLayout2, shadowLayout, shadowLayout2, tabLayout, tabLayout2, tabLayout3, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, findChildViewById);
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
    public static FragmentHomeTrainingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentHomeTrainingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home_training, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
