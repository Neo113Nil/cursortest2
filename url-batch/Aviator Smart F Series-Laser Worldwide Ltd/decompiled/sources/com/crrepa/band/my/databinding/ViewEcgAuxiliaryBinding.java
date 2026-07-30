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
public final class ViewEcgAuxiliaryBinding implements ViewBinding {

    @NonNull
    public final Button btnSeeEcgDiagnosis;

    @NonNull
    public final RelativeLayout llEcgAuxiliaryContent;

    @NonNull
    private final RelativeLayout rootView;

    private ViewEcgAuxiliaryBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.btnSeeEcgDiagnosis = button;
        this.llEcgAuxiliaryContent = relativeLayout2;
    }

    @NonNull
    public static ViewEcgAuxiliaryBinding bind(@NonNull View view) {
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_see_ecg_diagnosis);
        if (button == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.btn_see_ecg_diagnosis)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new ViewEcgAuxiliaryBinding(relativeLayout, button, relativeLayout);
    }

    @NonNull
    public static ViewEcgAuxiliaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewEcgAuxiliaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_ecg_auxiliary, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
