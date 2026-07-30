package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.map.MapContainer;
import com.crrepa.band.my.training.map.view.GpsTrackView;
import com.google.android.gms.maps.MapView;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityTrainingPathBinding implements ViewBinding {

    @NonNull
    public final Button btnShoot;

    @NonNull
    public final LinearLayout flContent;

    @NonNull
    public final MapContainer flMap;

    @NonNull
    public final MapView googleMapView;

    @NonNull
    public final GpsTrackView gpsTrackView;

    @NonNull
    public final IncludeTrainingPathRecordDetailBinding includeDetail;

    @NonNull
    public final IncludeTrainingPathElevationBinding includeElevation;

    @NonNull
    public final LayoutGomoreSportEnergySourceBinding includeEnergySource;

    @NonNull
    public final IncludeTrainingPathHeartRateChartBinding includeHrChart;

    @NonNull
    public final IncludeTrainingPathHeartRateZoneBinding includeHrZone;

    @NonNull
    public final IncludeTrainingPathOneDistancePaceBinding includeOneDistancePace;

    @NonNull
    public final IncludeTrainingPathRealTimePaceBinding includeRealTimePace;

    @NonNull
    public final LayoutGomoreSportRecoveryTimeBinding includeRecoveryTime;

    @NonNull
    public final LayoutGomoreSportRunningPoseBinding includeRunningPose;

    @NonNull
    public final IncludeTrainingPathStepsBinding includeSteps;

    @NonNull
    public final LayoutGomoreSportTrainingEffectBinding includeTrainingEffect;

    @NonNull
    public final LayoutGomoreSportVo2maxBinding includeVo2max;

    @NonNull
    public final ImageView ivLocation;

    @NonNull
    public final ImageView ivShare;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    public final LinearLayout llGomoreTitle;

    @NonNull
    public final LinearLayout llReplay;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final ShadowLayout slShoot;

    @NonNull
    public final TextView tvGomoreTitle;

    @NonNull
    public final TextView tvTitle;

    private ActivityTrainingPathBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull MapContainer mapContainer, @NonNull MapView mapView, @NonNull GpsTrackView gpsTrackView, @NonNull IncludeTrainingPathRecordDetailBinding includeTrainingPathRecordDetailBinding, @NonNull IncludeTrainingPathElevationBinding includeTrainingPathElevationBinding, @NonNull LayoutGomoreSportEnergySourceBinding layoutGomoreSportEnergySourceBinding, @NonNull IncludeTrainingPathHeartRateChartBinding includeTrainingPathHeartRateChartBinding, @NonNull IncludeTrainingPathHeartRateZoneBinding includeTrainingPathHeartRateZoneBinding, @NonNull IncludeTrainingPathOneDistancePaceBinding includeTrainingPathOneDistancePaceBinding, @NonNull IncludeTrainingPathRealTimePaceBinding includeTrainingPathRealTimePaceBinding, @NonNull LayoutGomoreSportRecoveryTimeBinding layoutGomoreSportRecoveryTimeBinding, @NonNull LayoutGomoreSportRunningPoseBinding layoutGomoreSportRunningPoseBinding, @NonNull IncludeTrainingPathStepsBinding includeTrainingPathStepsBinding, @NonNull LayoutGomoreSportTrainingEffectBinding layoutGomoreSportTrainingEffectBinding, @NonNull LayoutGomoreSportVo2maxBinding layoutGomoreSportVo2maxBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull RelativeLayout relativeLayout, @NonNull NestedScrollView nestedScrollView, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.btnShoot = button;
        this.flContent = linearLayout2;
        this.flMap = mapContainer;
        this.googleMapView = mapView;
        this.gpsTrackView = gpsTrackView;
        this.includeDetail = includeTrainingPathRecordDetailBinding;
        this.includeElevation = includeTrainingPathElevationBinding;
        this.includeEnergySource = layoutGomoreSportEnergySourceBinding;
        this.includeHrChart = includeTrainingPathHeartRateChartBinding;
        this.includeHrZone = includeTrainingPathHeartRateZoneBinding;
        this.includeOneDistancePace = includeTrainingPathOneDistancePaceBinding;
        this.includeRealTimePace = includeTrainingPathRealTimePaceBinding;
        this.includeRecoveryTime = layoutGomoreSportRecoveryTimeBinding;
        this.includeRunningPose = layoutGomoreSportRunningPoseBinding;
        this.includeSteps = includeTrainingPathStepsBinding;
        this.includeTrainingEffect = layoutGomoreSportTrainingEffectBinding;
        this.includeVo2max = layoutGomoreSportVo2maxBinding;
        this.ivLocation = imageView;
        this.ivShare = imageView2;
        this.ivTitleBack = imageView3;
        this.llContent = linearLayout3;
        this.llGomoreTitle = linearLayout4;
        this.llReplay = linearLayout5;
        this.rlTitle = relativeLayout;
        this.scrollView = nestedScrollView;
        this.slShoot = shadowLayout;
        this.tvGomoreTitle = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ActivityTrainingPathBinding bind(@NonNull View view) {
        int i8 = R.id.btn_shoot;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_shoot);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.fl_map;
            MapContainer mapContainer = (MapContainer) ViewBindings.findChildViewById(view, R.id.fl_map);
            if (mapContainer != null) {
                i8 = R.id.google_map_view;
                MapView mapView = (MapView) ViewBindings.findChildViewById(view, R.id.google_map_view);
                if (mapView != null) {
                    i8 = R.id.gpsTrackView;
                    GpsTrackView gpsTrackView = (GpsTrackView) ViewBindings.findChildViewById(view, R.id.gpsTrackView);
                    if (gpsTrackView != null) {
                        i8 = R.id.include_detail;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_detail);
                        if (findChildViewById != null) {
                            IncludeTrainingPathRecordDetailBinding bind = IncludeTrainingPathRecordDetailBinding.bind(findChildViewById);
                            i8 = R.id.include_elevation;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_elevation);
                            if (findChildViewById2 != null) {
                                IncludeTrainingPathElevationBinding bind2 = IncludeTrainingPathElevationBinding.bind(findChildViewById2);
                                i8 = R.id.include_energy_source;
                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_energy_source);
                                if (findChildViewById3 != null) {
                                    LayoutGomoreSportEnergySourceBinding bind3 = LayoutGomoreSportEnergySourceBinding.bind(findChildViewById3);
                                    i8 = R.id.include_hr_chart;
                                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_hr_chart);
                                    if (findChildViewById4 != null) {
                                        IncludeTrainingPathHeartRateChartBinding bind4 = IncludeTrainingPathHeartRateChartBinding.bind(findChildViewById4);
                                        i8 = R.id.include_hr_zone;
                                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_hr_zone);
                                        if (findChildViewById5 != null) {
                                            IncludeTrainingPathHeartRateZoneBinding bind5 = IncludeTrainingPathHeartRateZoneBinding.bind(findChildViewById5);
                                            i8 = R.id.include_one_distance_pace;
                                            View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_one_distance_pace);
                                            if (findChildViewById6 != null) {
                                                IncludeTrainingPathOneDistancePaceBinding bind6 = IncludeTrainingPathOneDistancePaceBinding.bind(findChildViewById6);
                                                i8 = R.id.include_real_time_pace;
                                                View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_real_time_pace);
                                                if (findChildViewById7 != null) {
                                                    IncludeTrainingPathRealTimePaceBinding bind7 = IncludeTrainingPathRealTimePaceBinding.bind(findChildViewById7);
                                                    i8 = R.id.include_recovery_time;
                                                    View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.include_recovery_time);
                                                    if (findChildViewById8 != null) {
                                                        LayoutGomoreSportRecoveryTimeBinding bind8 = LayoutGomoreSportRecoveryTimeBinding.bind(findChildViewById8);
                                                        i8 = R.id.include_running_pose;
                                                        View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.include_running_pose);
                                                        if (findChildViewById9 != null) {
                                                            LayoutGomoreSportRunningPoseBinding bind9 = LayoutGomoreSportRunningPoseBinding.bind(findChildViewById9);
                                                            i8 = R.id.include_steps;
                                                            View findChildViewById10 = ViewBindings.findChildViewById(view, R.id.include_steps);
                                                            if (findChildViewById10 != null) {
                                                                IncludeTrainingPathStepsBinding bind10 = IncludeTrainingPathStepsBinding.bind(findChildViewById10);
                                                                i8 = R.id.include_training_effect;
                                                                View findChildViewById11 = ViewBindings.findChildViewById(view, R.id.include_training_effect);
                                                                if (findChildViewById11 != null) {
                                                                    LayoutGomoreSportTrainingEffectBinding bind11 = LayoutGomoreSportTrainingEffectBinding.bind(findChildViewById11);
                                                                    i8 = R.id.include_vo2max;
                                                                    View findChildViewById12 = ViewBindings.findChildViewById(view, R.id.include_vo2max);
                                                                    if (findChildViewById12 != null) {
                                                                        LayoutGomoreSportVo2maxBinding bind12 = LayoutGomoreSportVo2maxBinding.bind(findChildViewById12);
                                                                        i8 = R.id.iv_location;
                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_location);
                                                                        if (imageView != null) {
                                                                            i8 = R.id.iv_share;
                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_share);
                                                                            if (imageView2 != null) {
                                                                                i8 = R.id.iv_title_back;
                                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                                                                                if (imageView3 != null) {
                                                                                    i8 = R.id.ll_content;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
                                                                                    if (linearLayout2 != null) {
                                                                                        i8 = R.id.ll_gomore_title;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_gomore_title);
                                                                                        if (linearLayout3 != null) {
                                                                                            i8 = R.id.ll_replay;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_replay);
                                                                                            if (linearLayout4 != null) {
                                                                                                i8 = R.id.rl_title;
                                                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
                                                                                                if (relativeLayout != null) {
                                                                                                    i8 = R.id.scrollView;
                                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                                    if (nestedScrollView != null) {
                                                                                                        i8 = R.id.sl_shoot;
                                                                                                        ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_shoot);
                                                                                                        if (shadowLayout != null) {
                                                                                                            i8 = R.id.tv_gomore_title;
                                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gomore_title);
                                                                                                            if (textView != null) {
                                                                                                                i8 = R.id.tv_title;
                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                                                                if (textView2 != null) {
                                                                                                                    return new ActivityTrainingPathBinding(linearLayout, button, linearLayout, mapContainer, mapView, gpsTrackView, bind, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9, bind10, bind11, bind12, imageView, imageView2, imageView3, linearLayout2, linearLayout3, linearLayout4, relativeLayout, nestedScrollView, shadowLayout, textView, textView2);
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
    public static ActivityTrainingPathBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingPathBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_path, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
