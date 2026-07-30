package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.MyNestedScrollView;
import com.crrepa.band.my.training.map.view.MYMapView;

/* loaded from: classes2.dex */
public final class FragmentTrainingStatisticsBinding implements ViewBinding {

    @NonNull
    public final BandDataViewBinding includeBandData;

    @NonNull
    public final BasketballHeartRateStatisticsViewBinding includeBasketballHeartRateStatistics;

    @NonNull
    public final IncludeTrainingPathElevationBinding includeElevation;

    @NonNull
    public final LayoutGomoreSportEnergySourceBinding includeEnergySource;

    @NonNull
    public final LayoutGomoreSportDetailBinding includeGomoreSportDetail;

    @NonNull
    public final HeartRateAnalysisViewBinding includeHeartRateAnalysis;

    @NonNull
    public final FragmentHeartRateDayStatisticsBinding includeHeartRateDayStatistics;

    @NonNull
    public final IncludeTrainingPathOneDistancePaceBinding includeOneDistancePace;

    @NonNull
    public final IncludeTrainingPathRealTimePaceBinding includeRealTimePace;

    @NonNull
    public final LayoutGomoreSportRecoveryTimeBinding includeRecoveryTime;

    @NonNull
    public final RunHeartRateStatisticsViewBinding includeRunHeartRateStatistics;

    @NonNull
    public final LayoutGomoreSportRunningPoseBinding includeRunningPose;

    @NonNull
    public final IncludeTrainingPathStepsBinding includeStepsChart;

    @NonNull
    public final LayoutGomoreSportSwimmingPoseBinding includeSwimmingPose;

    @NonNull
    public final LayoutGomoreSportTrainingEffectBinding includeTrainingEffect;

    @NonNull
    public final LayoutGomoreSportVo2maxBinding includeVo2max;

    @NonNull
    public final MYMapView mapView;

    @NonNull
    private final MyNestedScrollView rootView;

    @NonNull
    public final MyNestedScrollView scrollWheelTraining;

    @NonNull
    public final TextView tvDataType;

    @NonNull
    public final TextView tvSyncDate;

    private FragmentTrainingStatisticsBinding(@NonNull MyNestedScrollView myNestedScrollView, @NonNull BandDataViewBinding bandDataViewBinding, @NonNull BasketballHeartRateStatisticsViewBinding basketballHeartRateStatisticsViewBinding, @NonNull IncludeTrainingPathElevationBinding includeTrainingPathElevationBinding, @NonNull LayoutGomoreSportEnergySourceBinding layoutGomoreSportEnergySourceBinding, @NonNull LayoutGomoreSportDetailBinding layoutGomoreSportDetailBinding, @NonNull HeartRateAnalysisViewBinding heartRateAnalysisViewBinding, @NonNull FragmentHeartRateDayStatisticsBinding fragmentHeartRateDayStatisticsBinding, @NonNull IncludeTrainingPathOneDistancePaceBinding includeTrainingPathOneDistancePaceBinding, @NonNull IncludeTrainingPathRealTimePaceBinding includeTrainingPathRealTimePaceBinding, @NonNull LayoutGomoreSportRecoveryTimeBinding layoutGomoreSportRecoveryTimeBinding, @NonNull RunHeartRateStatisticsViewBinding runHeartRateStatisticsViewBinding, @NonNull LayoutGomoreSportRunningPoseBinding layoutGomoreSportRunningPoseBinding, @NonNull IncludeTrainingPathStepsBinding includeTrainingPathStepsBinding, @NonNull LayoutGomoreSportSwimmingPoseBinding layoutGomoreSportSwimmingPoseBinding, @NonNull LayoutGomoreSportTrainingEffectBinding layoutGomoreSportTrainingEffectBinding, @NonNull LayoutGomoreSportVo2maxBinding layoutGomoreSportVo2maxBinding, @NonNull MYMapView mYMapView, @NonNull MyNestedScrollView myNestedScrollView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = myNestedScrollView;
        this.includeBandData = bandDataViewBinding;
        this.includeBasketballHeartRateStatistics = basketballHeartRateStatisticsViewBinding;
        this.includeElevation = includeTrainingPathElevationBinding;
        this.includeEnergySource = layoutGomoreSportEnergySourceBinding;
        this.includeGomoreSportDetail = layoutGomoreSportDetailBinding;
        this.includeHeartRateAnalysis = heartRateAnalysisViewBinding;
        this.includeHeartRateDayStatistics = fragmentHeartRateDayStatisticsBinding;
        this.includeOneDistancePace = includeTrainingPathOneDistancePaceBinding;
        this.includeRealTimePace = includeTrainingPathRealTimePaceBinding;
        this.includeRecoveryTime = layoutGomoreSportRecoveryTimeBinding;
        this.includeRunHeartRateStatistics = runHeartRateStatisticsViewBinding;
        this.includeRunningPose = layoutGomoreSportRunningPoseBinding;
        this.includeStepsChart = includeTrainingPathStepsBinding;
        this.includeSwimmingPose = layoutGomoreSportSwimmingPoseBinding;
        this.includeTrainingEffect = layoutGomoreSportTrainingEffectBinding;
        this.includeVo2max = layoutGomoreSportVo2maxBinding;
        this.mapView = mYMapView;
        this.scrollWheelTraining = myNestedScrollView2;
        this.tvDataType = textView;
        this.tvSyncDate = textView2;
    }

    @NonNull
    public static FragmentTrainingStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_band_data;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_band_data);
        if (findChildViewById != null) {
            BandDataViewBinding bind = BandDataViewBinding.bind(findChildViewById);
            i8 = R.id.include_basketball_heart_rate_statistics;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_basketball_heart_rate_statistics);
            if (findChildViewById2 != null) {
                BasketballHeartRateStatisticsViewBinding bind2 = BasketballHeartRateStatisticsViewBinding.bind(findChildViewById2);
                i8 = R.id.include_elevation;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_elevation);
                if (findChildViewById3 != null) {
                    IncludeTrainingPathElevationBinding bind3 = IncludeTrainingPathElevationBinding.bind(findChildViewById3);
                    i8 = R.id.include_energy_source;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_energy_source);
                    if (findChildViewById4 != null) {
                        LayoutGomoreSportEnergySourceBinding bind4 = LayoutGomoreSportEnergySourceBinding.bind(findChildViewById4);
                        i8 = R.id.include_gomore_sport_detail;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_gomore_sport_detail);
                        if (findChildViewById5 != null) {
                            LayoutGomoreSportDetailBinding bind5 = LayoutGomoreSportDetailBinding.bind(findChildViewById5);
                            i8 = R.id.include_heart_rate_analysis;
                            View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_heart_rate_analysis);
                            if (findChildViewById6 != null) {
                                HeartRateAnalysisViewBinding bind6 = HeartRateAnalysisViewBinding.bind(findChildViewById6);
                                i8 = R.id.include_heart_rate_day_statistics;
                                View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_heart_rate_day_statistics);
                                if (findChildViewById7 != null) {
                                    FragmentHeartRateDayStatisticsBinding bind7 = FragmentHeartRateDayStatisticsBinding.bind(findChildViewById7);
                                    i8 = R.id.include_one_distance_pace;
                                    View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.include_one_distance_pace);
                                    if (findChildViewById8 != null) {
                                        IncludeTrainingPathOneDistancePaceBinding bind8 = IncludeTrainingPathOneDistancePaceBinding.bind(findChildViewById8);
                                        i8 = R.id.include_real_time_pace;
                                        View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.include_real_time_pace);
                                        if (findChildViewById9 != null) {
                                            IncludeTrainingPathRealTimePaceBinding bind9 = IncludeTrainingPathRealTimePaceBinding.bind(findChildViewById9);
                                            i8 = R.id.include_recovery_time;
                                            View findChildViewById10 = ViewBindings.findChildViewById(view, R.id.include_recovery_time);
                                            if (findChildViewById10 != null) {
                                                LayoutGomoreSportRecoveryTimeBinding bind10 = LayoutGomoreSportRecoveryTimeBinding.bind(findChildViewById10);
                                                i8 = R.id.include_run_heart_rate_statistics;
                                                View findChildViewById11 = ViewBindings.findChildViewById(view, R.id.include_run_heart_rate_statistics);
                                                if (findChildViewById11 != null) {
                                                    RunHeartRateStatisticsViewBinding bind11 = RunHeartRateStatisticsViewBinding.bind(findChildViewById11);
                                                    i8 = R.id.include_running_pose;
                                                    View findChildViewById12 = ViewBindings.findChildViewById(view, R.id.include_running_pose);
                                                    if (findChildViewById12 != null) {
                                                        LayoutGomoreSportRunningPoseBinding bind12 = LayoutGomoreSportRunningPoseBinding.bind(findChildViewById12);
                                                        i8 = R.id.include_steps_chart;
                                                        View findChildViewById13 = ViewBindings.findChildViewById(view, R.id.include_steps_chart);
                                                        if (findChildViewById13 != null) {
                                                            IncludeTrainingPathStepsBinding bind13 = IncludeTrainingPathStepsBinding.bind(findChildViewById13);
                                                            i8 = R.id.include_swimming_pose;
                                                            View findChildViewById14 = ViewBindings.findChildViewById(view, R.id.include_swimming_pose);
                                                            if (findChildViewById14 != null) {
                                                                LayoutGomoreSportSwimmingPoseBinding bind14 = LayoutGomoreSportSwimmingPoseBinding.bind(findChildViewById14);
                                                                i8 = R.id.include_training_effect;
                                                                View findChildViewById15 = ViewBindings.findChildViewById(view, R.id.include_training_effect);
                                                                if (findChildViewById15 != null) {
                                                                    LayoutGomoreSportTrainingEffectBinding bind15 = LayoutGomoreSportTrainingEffectBinding.bind(findChildViewById15);
                                                                    i8 = R.id.include_vo2max;
                                                                    View findChildViewById16 = ViewBindings.findChildViewById(view, R.id.include_vo2max);
                                                                    if (findChildViewById16 != null) {
                                                                        LayoutGomoreSportVo2maxBinding bind16 = LayoutGomoreSportVo2maxBinding.bind(findChildViewById16);
                                                                        i8 = R.id.map_view;
                                                                        MYMapView mYMapView = (MYMapView) ViewBindings.findChildViewById(view, R.id.map_view);
                                                                        if (mYMapView != null) {
                                                                            MyNestedScrollView myNestedScrollView = (MyNestedScrollView) view;
                                                                            i8 = R.id.tv_data_type;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data_type);
                                                                            if (textView != null) {
                                                                                i8 = R.id.tv_sync_date;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sync_date);
                                                                                if (textView2 != null) {
                                                                                    return new FragmentTrainingStatisticsBinding(myNestedScrollView, bind, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9, bind10, bind11, bind12, bind13, bind14, bind15, bind16, mYMapView, myNestedScrollView, textView, textView2);
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
    public static FragmentTrainingStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public MyNestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentTrainingStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_training_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
