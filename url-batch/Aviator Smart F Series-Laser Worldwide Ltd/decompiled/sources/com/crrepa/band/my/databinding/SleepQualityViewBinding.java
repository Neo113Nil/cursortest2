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

/* loaded from: classes2.dex */
public final class SleepQualityViewBinding implements ViewBinding {

    @NonNull
    public final SleepQualitySegmentViewBinding includeSleepQualitySegment;

    @NonNull
    public final ImageView ivHelp;

    @NonNull
    public final RelativeLayout rlValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvSleepQuality;

    @NonNull
    public final TextView tvSleepQualityTitle;

    private SleepQualityViewBinding(@NonNull LinearLayout linearLayout, @NonNull SleepQualitySegmentViewBinding sleepQualitySegmentViewBinding, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.includeSleepQualitySegment = sleepQualitySegmentViewBinding;
        this.ivHelp = imageView;
        this.rlValue = relativeLayout;
        this.tvSleepQuality = textView;
        this.tvSleepQualityTitle = textView2;
    }

    @NonNull
    public static SleepQualityViewBinding bind(@NonNull View view) {
        int i8 = R.id.include_sleep_quality_segment;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_sleep_quality_segment);
        if (findChildViewById != null) {
            SleepQualitySegmentViewBinding bind = SleepQualitySegmentViewBinding.bind(findChildViewById);
            i8 = R.id.iv_help;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_help);
            if (imageView != null) {
                i8 = R.id.rl_value;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_value);
                if (relativeLayout != null) {
                    i8 = R.id.tv_sleep_quality;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_quality);
                    if (textView != null) {
                        i8 = R.id.tv_sleep_quality_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sleep_quality_title);
                        if (textView2 != null) {
                            return new SleepQualityViewBinding((LinearLayout) view, bind, imageView, relativeLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SleepQualityViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepQualityViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_quality_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
