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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class IncludeTrainingPathRecordDetailBinding implements ViewBinding {

    @NonNull
    public final ImageView ivDataOrigin;

    @NonNull
    public final ImageView ivWeather;

    @NonNull
    public final RecyclerView rcvTrainingInfo;

    @NonNull
    public final RelativeLayout rlSpeedRange;

    @NonNull
    public final RelativeLayout rlTrainingTopData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDistance;

    @NonNull
    public final TextView tvDistanceUnit;

    @NonNull
    public final TextView tvSlow;

    @NonNull
    public final TextView tvTemp;

    @NonNull
    public final TextView tvTime;

    private IncludeTrainingPathRecordDetailBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.ivDataOrigin = imageView;
        this.ivWeather = imageView2;
        this.rcvTrainingInfo = recyclerView;
        this.rlSpeedRange = relativeLayout;
        this.rlTrainingTopData = relativeLayout2;
        this.tvDistance = textView;
        this.tvDistanceUnit = textView2;
        this.tvSlow = textView3;
        this.tvTemp = textView4;
        this.tvTime = textView5;
    }

    @NonNull
    public static IncludeTrainingPathRecordDetailBinding bind(@NonNull View view) {
        int i8 = R.id.iv_data_origin;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_data_origin);
        if (imageView != null) {
            i8 = R.id.iv_weather;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_weather);
            if (imageView2 != null) {
                i8 = R.id.rcv_training_info;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_training_info);
                if (recyclerView != null) {
                    i8 = R.id.rl_speed_range;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_speed_range);
                    if (relativeLayout != null) {
                        i8 = R.id.rl_training_top_data;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_training_top_data);
                        if (relativeLayout2 != null) {
                            i8 = R.id.tv_distance;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_distance);
                            if (textView != null) {
                                i8 = R.id.tv_distance_unit;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_distance_unit);
                                if (textView2 != null) {
                                    i8 = R.id.tv_slow;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_slow);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_temp;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_temp);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_time;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                                            if (textView5 != null) {
                                                return new IncludeTrainingPathRecordDetailBinding((LinearLayout) view, imageView, imageView2, recyclerView, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5);
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
    public static IncludeTrainingPathRecordDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeTrainingPathRecordDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_training_path_record_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
