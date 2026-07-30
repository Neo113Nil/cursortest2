package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class TodaySyncDataWeightBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDataType;

    @NonNull
    public final TextView tvDateFirstPart;

    @NonNull
    public final TextView tvDateFirstPartUnit;

    @NonNull
    public final TextView tvSyncTime;

    @NonNull
    public final TextView tvTodayDataDescription;

    private TodaySyncDataWeightBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.tvDataType = textView;
        this.tvDateFirstPart = textView2;
        this.tvDateFirstPartUnit = textView3;
        this.tvSyncTime = textView4;
        this.tvTodayDataDescription = textView5;
    }

    @NonNull
    public static TodaySyncDataWeightBinding bind(@NonNull View view) {
        int i8 = R.id.tv_data_type;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data_type);
        if (textView != null) {
            i8 = R.id.tv_date_first_part;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_first_part);
            if (textView2 != null) {
                i8 = R.id.tv_date_first_part_unit;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_first_part_unit);
                if (textView3 != null) {
                    i8 = R.id.tv_sync_time;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sync_time);
                    if (textView4 != null) {
                        i8 = R.id.tv_today_data_description;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_today_data_description);
                        if (textView5 != null) {
                            return new TodaySyncDataWeightBinding((RelativeLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static TodaySyncDataWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TodaySyncDataWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.today_sync_data_weight, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
