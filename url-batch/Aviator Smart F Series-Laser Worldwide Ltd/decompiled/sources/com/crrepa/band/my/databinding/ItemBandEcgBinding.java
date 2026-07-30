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
import com.crrepa.band.my.health.ecg.view.EcgView;

/* loaded from: classes2.dex */
public final class ItemBandEcgBinding implements ViewBinding {

    @NonNull
    public final EcgView ecgview;

    @NonNull
    private final RelativeLayout rootView;

    private ItemBandEcgBinding(@NonNull RelativeLayout relativeLayout, @NonNull EcgView ecgView) {
        this.rootView = relativeLayout;
        this.ecgview = ecgView;
    }

    @NonNull
    public static ItemBandEcgBinding bind(@NonNull View view) {
        EcgView ecgView = (EcgView) ViewBindings.findChildViewById(view, R.id.ecgview);
        if (ecgView != null) {
            return new ItemBandEcgBinding((RelativeLayout) view, ecgView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.ecgview)));
    }

    @NonNull
    public static ItemBandEcgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandEcgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_ecg, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
