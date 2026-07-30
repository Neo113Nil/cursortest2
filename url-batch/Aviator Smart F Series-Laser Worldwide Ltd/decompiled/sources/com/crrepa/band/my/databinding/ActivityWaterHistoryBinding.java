package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class ActivityWaterHistoryBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llWaterHistory;

    @NonNull
    public final LinearLayout llWaterTotalIntake;

    @NonNull
    public final SwipeRecyclerView rcvWaterRecords;

    @NonNull
    public final RelativeLayout rlWaterData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvWaterGoal;

    @NonNull
    public final TextView tvWaterPercentage;

    @NonNull
    public final TextView tvWaterPercentageNote;

    @NonNull
    public final TextView tvWaterTotalIntake;

    @NonNull
    public final TextView tvWaterUnit;

    @NonNull
    public final AppToolbarBinding waterHistoryBar;

    @NonNull
    public final WaveView wvWater;

    private ActivityWaterHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull AppToolbarBinding appToolbarBinding, @NonNull WaveView waveView) {
        this.rootView = linearLayout;
        this.llWaterHistory = linearLayout2;
        this.llWaterTotalIntake = linearLayout3;
        this.rcvWaterRecords = swipeRecyclerView;
        this.rlWaterData = relativeLayout;
        this.tvWaterGoal = textView;
        this.tvWaterPercentage = textView2;
        this.tvWaterPercentageNote = textView3;
        this.tvWaterTotalIntake = textView4;
        this.tvWaterUnit = textView5;
        this.waterHistoryBar = appToolbarBinding;
        this.wvWater = waveView;
    }

    @NonNull
    public static ActivityWaterHistoryBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.ll_water_total_intake;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_water_total_intake);
        if (linearLayout2 != null) {
            i8 = R.id.rcv_water_records;
            SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_water_records);
            if (swipeRecyclerView != null) {
                i8 = R.id.rl_water_data;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_water_data);
                if (relativeLayout != null) {
                    i8 = R.id.tv_water_goal;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_goal);
                    if (textView != null) {
                        i8 = R.id.tv_water_percentage;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_percentage);
                        if (textView2 != null) {
                            i8 = R.id.tv_water_percentage_note;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_percentage_note);
                            if (textView3 != null) {
                                i8 = R.id.tv_water_total_intake;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_total_intake);
                                if (textView4 != null) {
                                    i8 = R.id.tv_water_unit;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_unit);
                                    if (textView5 != null) {
                                        i8 = R.id.water_history_bar;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.water_history_bar);
                                        if (findChildViewById != null) {
                                            AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
                                            i8 = R.id.wv_water;
                                            WaveView waveView = (WaveView) ViewBindings.findChildViewById(view, R.id.wv_water);
                                            if (waveView != null) {
                                                return new ActivityWaterHistoryBinding(linearLayout, linearLayout, linearLayout2, swipeRecyclerView, relativeLayout, textView, textView2, textView3, textView4, textView5, bind, waveView);
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
    public static ActivityWaterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWaterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_water_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
