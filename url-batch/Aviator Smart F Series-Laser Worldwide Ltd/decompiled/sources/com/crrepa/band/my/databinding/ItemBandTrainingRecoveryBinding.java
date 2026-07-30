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
public final class ItemBandTrainingRecoveryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvRecoveryPercent;

    @NonNull
    public final TextView tvSyncTime;

    private ItemBandTrainingRecoveryBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivContinue = imageView;
        this.llValue = linearLayout;
        this.tvRecoveryPercent = textView;
        this.tvSyncTime = textView2;
    }

    @NonNull
    public static ItemBandTrainingRecoveryBinding bind(@NonNull View view) {
        int i8 = R.id.iv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_continue);
        if (imageView != null) {
            i8 = R.id.ll_value;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_value);
            if (linearLayout != null) {
                i8 = R.id.tv_recovery_percent;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_recovery_percent);
                if (textView != null) {
                    i8 = R.id.tv_sync_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sync_time);
                    if (textView2 != null) {
                        return new ItemBandTrainingRecoveryBinding((RelativeLayout) view, imageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandTrainingRecoveryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandTrainingRecoveryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_training_recovery, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
