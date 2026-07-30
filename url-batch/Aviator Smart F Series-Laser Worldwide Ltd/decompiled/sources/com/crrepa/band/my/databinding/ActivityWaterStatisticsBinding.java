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
import com.crrepa.band.my.health.widgets.WaveView;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityWaterStatisticsBinding implements ViewBinding {

    @NonNull
    public final ImageView ivWaterNoRecord;

    @NonNull
    public final LinearLayout llWaterAddIntake;

    @NonNull
    public final LinearLayout llWaterAddIntake100;

    @NonNull
    public final LinearLayout llWaterAddIntake200;

    @NonNull
    public final LinearLayout llWaterAddIntake400;

    @NonNull
    public final LinearLayout llWaterStatistics;

    @NonNull
    public final LinearLayout llWaterTotalIntake;

    @NonNull
    public final SwipeRecyclerView rcvWaterRecords;

    @NonNull
    public final RelativeLayout rlWaterData;

    @NonNull
    public final RelativeLayout rlWaterNoRecord;

    @NonNull
    public final RelativeLayout rlWaterRecords;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAddWater;

    @NonNull
    public final TextView tvWaterAddIntake100;

    @NonNull
    public final TextView tvWaterAddIntake200;

    @NonNull
    public final TextView tvWaterAddIntake400;

    @NonNull
    public final TextView tvWaterGoal;

    @NonNull
    public final TextView tvWaterPercentage;

    @NonNull
    public final TextView tvWaterPercentageNote;

    @NonNull
    public final TextView tvWaterRecordTitle;

    @NonNull
    public final TextView tvWaterTotalIntake;

    @NonNull
    public final TextView tvWaterUnit;

    @NonNull
    public final AppToolbarBinding waterStatisticsBar;

    @NonNull
    public final WaveView wvWater;

    private ActivityWaterStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull AppToolbarBinding appToolbarBinding, @NonNull WaveView waveView) {
        this.rootView = linearLayout;
        this.ivWaterNoRecord = imageView;
        this.llWaterAddIntake = linearLayout2;
        this.llWaterAddIntake100 = linearLayout3;
        this.llWaterAddIntake200 = linearLayout4;
        this.llWaterAddIntake400 = linearLayout5;
        this.llWaterStatistics = linearLayout6;
        this.llWaterTotalIntake = linearLayout7;
        this.rcvWaterRecords = swipeRecyclerView;
        this.rlWaterData = relativeLayout;
        this.rlWaterNoRecord = relativeLayout2;
        this.rlWaterRecords = relativeLayout3;
        this.tvAddWater = textView;
        this.tvWaterAddIntake100 = textView2;
        this.tvWaterAddIntake200 = textView3;
        this.tvWaterAddIntake400 = textView4;
        this.tvWaterGoal = textView5;
        this.tvWaterPercentage = textView6;
        this.tvWaterPercentageNote = textView7;
        this.tvWaterRecordTitle = textView8;
        this.tvWaterTotalIntake = textView9;
        this.tvWaterUnit = textView10;
        this.waterStatisticsBar = appToolbarBinding;
        this.wvWater = waveView;
    }

    @NonNull
    public static ActivityWaterStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.iv_water_no_record;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_water_no_record);
        if (imageView != null) {
            i8 = R.id.ll_water_add_intake;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_add_intake);
            if (linearLayout != null) {
                i8 = R.id.ll_water_add_intake_100;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_add_intake_100);
                if (linearLayout2 != null) {
                    i8 = R.id.ll_water_add_intake_200;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_add_intake_200);
                    if (linearLayout3 != null) {
                        i8 = R.id.ll_water_add_intake_400;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_add_intake_400);
                        if (linearLayout4 != null) {
                            LinearLayout linearLayout5 = (LinearLayout) view;
                            i8 = R.id.ll_water_total_intake;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_total_intake);
                            if (linearLayout6 != null) {
                                i8 = R.id.rcv_water_records;
                                SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_water_records);
                                if (swipeRecyclerView != null) {
                                    i8 = R.id.rl_water_data;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_water_data);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_water_no_record;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_water_no_record);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.rl_water_records;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_water_records);
                                            if (relativeLayout3 != null) {
                                                i8 = R.id.tv_add_water;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add_water);
                                                if (textView != null) {
                                                    i8 = R.id.tv_water_add_intake_100;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_add_intake_100);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_water_add_intake_200;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_add_intake_200);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_water_add_intake_400;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_add_intake_400);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_water_goal;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_goal);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_water_percentage;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_percentage);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_water_percentage_note;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_percentage_note);
                                                                        if (textView7 != null) {
                                                                            i8 = R.id.tv_water_record_title;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_record_title);
                                                                            if (textView8 != null) {
                                                                                i8 = R.id.tv_water_total_intake;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_total_intake);
                                                                                if (textView9 != null) {
                                                                                    i8 = R.id.tv_water_unit;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_unit);
                                                                                    if (textView10 != null) {
                                                                                        i8 = R.id.water_statistics_bar;
                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.water_statistics_bar);
                                                                                        if (findChildViewById != null) {
                                                                                            AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
                                                                                            i8 = R.id.wv_water;
                                                                                            WaveView waveView = (WaveView) ViewBindings.findChildViewById(view, R.id.wv_water);
                                                                                            if (waveView != null) {
                                                                                                return new ActivityWaterStatisticsBinding(linearLayout5, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, swipeRecyclerView, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, bind, waveView);
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
    public static ActivityWaterStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWaterStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_water_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
