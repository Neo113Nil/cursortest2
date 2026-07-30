package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentBandNewVersionBinding implements ViewBinding {

    @NonNull
    public final View border;

    @NonNull
    public final Button btnFirmwareUpgrade;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvFirmwareBetaHint;

    @NonNull
    public final TextView tvFirmwareDescribe;

    @NonNull
    public final TextView tvFirmwareVersion;

    private FragmentBandNewVersionBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.border = view;
        this.btnFirmwareUpgrade = button;
        this.tvFirmwareBetaHint = textView;
        this.tvFirmwareDescribe = textView2;
        this.tvFirmwareVersion = textView3;
    }

    @NonNull
    public static FragmentBandNewVersionBinding bind(@NonNull View view) {
        int i8 = R.id.border;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.border);
        if (findChildViewById != null) {
            i8 = R.id.btn_firmware_upgrade;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_firmware_upgrade);
            if (button != null) {
                i8 = R.id.tv_firmware_beta_hint;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_firmware_beta_hint);
                if (textView != null) {
                    i8 = R.id.tv_firmware_describe;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_firmware_describe);
                    if (textView2 != null) {
                        i8 = R.id.tv_firmware_version;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_firmware_version);
                        if (textView3 != null) {
                            return new FragmentBandNewVersionBinding((LinearLayout) view, findChildViewById, button, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBandNewVersionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBandNewVersionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_band_new_version, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
