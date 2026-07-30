package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class BandLastStatisticsBinding implements ViewBinding {

    @NonNull
    public final BandDataViewBinding includeBandData;

    @NonNull
    public final ImageView ivHelp;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDataType;

    @NonNull
    public final TextView tvSyncDate;

    private BandLastStatisticsBinding(@NonNull RelativeLayout relativeLayout, @NonNull BandDataViewBinding bandDataViewBinding, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.includeBandData = bandDataViewBinding;
        this.ivHelp = imageView;
        this.tvDataType = textView;
        this.tvSyncDate = textView2;
    }

    @NonNull
    public static BandLastStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.include_band_data;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_band_data);
        if (findChildViewById != null) {
            BandDataViewBinding bind = BandDataViewBinding.bind(findChildViewById);
            i8 = R.id.iv_help;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_help);
            if (imageView != null) {
                i8 = R.id.tv_data_type;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data_type);
                if (textView != null) {
                    i8 = R.id.tv_sync_date;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sync_date);
                    if (textView2 != null) {
                        return new BandLastStatisticsBinding((RelativeLayout) view, bind, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static BandLastStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BandLastStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.band_last_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
