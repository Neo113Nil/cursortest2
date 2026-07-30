package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentBandFirmwareUpgradeBinding implements ViewBinding {

    @NonNull
    public final Button btnUpgradeComplete;

    @NonNull
    public final ImageView ivUpgradeAnimation;

    @NonNull
    public final ProgressBar pbUpgradePercent;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvUpgradePercent;

    @NonNull
    public final TextView tvUpgradeState;

    private FragmentBandFirmwareUpgradeBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.btnUpgradeComplete = button;
        this.ivUpgradeAnimation = imageView;
        this.pbUpgradePercent = progressBar;
        this.tvUpgradePercent = textView;
        this.tvUpgradeState = textView2;
    }

    @NonNull
    public static FragmentBandFirmwareUpgradeBinding bind(@NonNull View view) {
        int i8 = R.id.btn_upgrade_complete;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_upgrade_complete);
        if (button != null) {
            i8 = R.id.iv_upgrade_animation;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_upgrade_animation);
            if (imageView != null) {
                i8 = R.id.pb_upgrade_percent;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_upgrade_percent);
                if (progressBar != null) {
                    i8 = R.id.tv_upgrade_percent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_upgrade_percent);
                    if (textView != null) {
                        i8 = R.id.tv_upgrade_state;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_upgrade_state);
                        if (textView2 != null) {
                            return new FragmentBandFirmwareUpgradeBinding((LinearLayout) view, button, imageView, progressBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBandFirmwareUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBandFirmwareUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_band_firmware_upgrade, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
