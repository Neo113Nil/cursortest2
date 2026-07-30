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
import com.crrepa.band.my.health.widgets.BoDisplayView;

/* loaded from: classes2.dex */
public final class ItemBandBloodOxygenBinding implements ViewBinding {

    @NonNull
    public final BoDisplayView boDisplayView;

    @NonNull
    private final RelativeLayout rootView;

    private ItemBandBloodOxygenBinding(@NonNull RelativeLayout relativeLayout, @NonNull BoDisplayView boDisplayView) {
        this.rootView = relativeLayout;
        this.boDisplayView = boDisplayView;
    }

    @NonNull
    public static ItemBandBloodOxygenBinding bind(@NonNull View view) {
        BoDisplayView boDisplayView = (BoDisplayView) ViewBindings.findChildViewById(view, R.id.bo_display_view);
        if (boDisplayView != null) {
            return new ItemBandBloodOxygenBinding((RelativeLayout) view, boDisplayView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.bo_display_view)));
    }

    @NonNull
    public static ItemBandBloodOxygenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandBloodOxygenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_blood_oxygen, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
