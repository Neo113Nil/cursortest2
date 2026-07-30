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

/* loaded from: classes2.dex */
public final class TodayPhysiologicalDataBinding implements ViewBinding {

    @NonNull
    public final LinearLayout inBandData;

    @NonNull
    public final LinearLayout llDataType;

    @NonNull
    public final RelativeLayout rlData;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDataType;

    @NonNull
    public final TextView tvPhysiologicalDescription;

    @NonNull
    public final TextView tvSyncTime;

    @NonNull
    public final TextView tvTodayDataDescription;

    private TodayPhysiologicalDataBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.inBandData = linearLayout;
        this.llDataType = linearLayout2;
        this.rlData = relativeLayout2;
        this.tvDataType = textView;
        this.tvPhysiologicalDescription = textView2;
        this.tvSyncTime = textView3;
        this.tvTodayDataDescription = textView4;
    }

    @NonNull
    public static TodayPhysiologicalDataBinding bind(@NonNull View view) {
        int i8 = R.id.in_band_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.in_band_data);
        if (linearLayout != null) {
            i8 = R.id.ll_data_type;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_data_type);
            if (linearLayout2 != null) {
                i8 = R.id.rl_data;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_data);
                if (relativeLayout != null) {
                    i8 = R.id.tv_data_type;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data_type);
                    if (textView != null) {
                        i8 = R.id.tv_physiological_description;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_description);
                        if (textView2 != null) {
                            i8 = R.id.tv_sync_time;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sync_time);
                            if (textView3 != null) {
                                i8 = R.id.tv_today_data_description;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_today_data_description);
                                if (textView4 != null) {
                                    return new TodayPhysiologicalDataBinding((RelativeLayout) view, linearLayout, linearLayout2, relativeLayout, textView, textView2, textView3, textView4);
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
    public static TodayPhysiologicalDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TodayPhysiologicalDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.today_physiological_data, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
