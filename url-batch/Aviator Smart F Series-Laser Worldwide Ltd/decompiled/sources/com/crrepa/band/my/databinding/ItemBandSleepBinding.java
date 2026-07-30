package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemBandSleepBinding implements ViewBinding {

    @NonNull
    public final SleepTimeDistributedBinding includeChart;

    @NonNull
    public final NotDataHintViewBinding includeNoData;

    @NonNull
    public final TodaySyncDataBinding includeSyncData;

    @NonNull
    public final View lineNoData;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SleepNapCardBinding sleepNapCard;

    private ItemBandSleepBinding(@NonNull RelativeLayout relativeLayout, @NonNull SleepTimeDistributedBinding sleepTimeDistributedBinding, @NonNull NotDataHintViewBinding notDataHintViewBinding, @NonNull TodaySyncDataBinding todaySyncDataBinding, @NonNull View view, @NonNull SleepNapCardBinding sleepNapCardBinding) {
        this.rootView = relativeLayout;
        this.includeChart = sleepTimeDistributedBinding;
        this.includeNoData = notDataHintViewBinding;
        this.includeSyncData = todaySyncDataBinding;
        this.lineNoData = view;
        this.sleepNapCard = sleepNapCardBinding;
    }

    @NonNull
    public static ItemBandSleepBinding bind(@NonNull View view) {
        int i8 = R.id.include_chart;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_chart);
        if (findChildViewById != null) {
            SleepTimeDistributedBinding bind = SleepTimeDistributedBinding.bind(findChildViewById);
            i8 = R.id.include_no_data;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_no_data);
            if (findChildViewById2 != null) {
                NotDataHintViewBinding bind2 = NotDataHintViewBinding.bind(findChildViewById2);
                i8 = R.id.include_sync_data;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_sync_data);
                if (findChildViewById3 != null) {
                    TodaySyncDataBinding bind3 = TodaySyncDataBinding.bind(findChildViewById3);
                    i8 = R.id.line_no_data;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.line_no_data);
                    if (findChildViewById4 != null) {
                        i8 = R.id.sleep_nap_card;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.sleep_nap_card);
                        if (findChildViewById5 != null) {
                            return new ItemBandSleepBinding((RelativeLayout) view, bind, bind2, bind3, findChildViewById4, SleepNapCardBinding.bind(findChildViewById5));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandSleepBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandSleepBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_sleep, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
