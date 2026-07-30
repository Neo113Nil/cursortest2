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
public final class ItemAddBandBinding implements ViewBinding {

    @NonNull
    public final Button btnAddBand;

    @NonNull
    private final RelativeLayout rootView;

    private ItemAddBandBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button) {
        this.rootView = relativeLayout;
        this.btnAddBand = button;
    }

    @NonNull
    public static ItemAddBandBinding bind(@NonNull View view) {
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_add_band);
        if (button != null) {
            return new ItemAddBandBinding((RelativeLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.btn_add_band)));
    }

    @NonNull
    public static ItemAddBandBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemAddBandBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_add_band, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
