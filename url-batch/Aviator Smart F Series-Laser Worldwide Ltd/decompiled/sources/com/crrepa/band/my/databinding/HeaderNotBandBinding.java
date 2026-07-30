package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class HeaderNotBandBinding implements ViewBinding {

    @NonNull
    public final Button btnBoundBand;

    @NonNull
    private final RelativeLayout rootView;

    private HeaderNotBandBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button) {
        this.rootView = relativeLayout;
        this.btnBoundBand = button;
    }

    @NonNull
    public static HeaderNotBandBinding bind(@NonNull View view) {
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_bound_band);
        if (button != null) {
            return new HeaderNotBandBinding((RelativeLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.btn_bound_band)));
    }

    @NonNull
    public static HeaderNotBandBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HeaderNotBandBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.header_not_band, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
