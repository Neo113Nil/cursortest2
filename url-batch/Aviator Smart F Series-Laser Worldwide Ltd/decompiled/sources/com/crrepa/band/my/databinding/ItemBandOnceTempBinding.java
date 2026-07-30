package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemBandOnceTempBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    private ItemBandOnceTempBinding(@NonNull RelativeLayout relativeLayout) {
        this.rootView = relativeLayout;
    }

    @NonNull
    public static ItemBandOnceTempBinding bind(@NonNull View view) {
        if (view != null) {
            return new ItemBandOnceTempBinding((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ItemBandOnceTempBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandOnceTempBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_once_temp, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
