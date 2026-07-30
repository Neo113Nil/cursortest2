package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentBandLatestVersionBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDeviceFirmwareVersion;

    @NonNull
    public final TextView tvDeviceMacaddr;

    @NonNull
    public final TextView tvDeviceUserId;

    private FragmentBandLatestVersionBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.tvDeviceFirmwareVersion = textView;
        this.tvDeviceMacaddr = textView2;
        this.tvDeviceUserId = textView3;
    }

    @NonNull
    public static FragmentBandLatestVersionBinding bind(@NonNull View view) {
        int i8 = R.id.tv_device_firmware_version;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_firmware_version);
        if (textView != null) {
            i8 = R.id.tv_device_macaddr;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_macaddr);
            if (textView2 != null) {
                i8 = R.id.tv_device_user_id;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_user_id);
                if (textView3 != null) {
                    return new FragmentBandLatestVersionBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBandLatestVersionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBandLatestVersionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_band_latest_version, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
