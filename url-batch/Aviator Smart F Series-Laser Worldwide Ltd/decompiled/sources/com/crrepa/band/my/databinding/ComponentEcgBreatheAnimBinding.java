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
import com.crrepa.band.my.health.ecg.ecgbreatheanim.EcgBreatheView;

/* loaded from: classes2.dex */
public final class ComponentEcgBreatheAnimBinding implements ViewBinding {

    @NonNull
    public final EcgBreatheView obliqueEcgBreatheView;

    @NonNull
    public final EcgBreatheView positiveEcgBreatheView;

    @NonNull
    private final RelativeLayout rootView;

    private ComponentEcgBreatheAnimBinding(@NonNull RelativeLayout relativeLayout, @NonNull EcgBreatheView ecgBreatheView, @NonNull EcgBreatheView ecgBreatheView2) {
        this.rootView = relativeLayout;
        this.obliqueEcgBreatheView = ecgBreatheView;
        this.positiveEcgBreatheView = ecgBreatheView2;
    }

    @NonNull
    public static ComponentEcgBreatheAnimBinding bind(@NonNull View view) {
        int i8 = R.id.oblique_ecg_breathe_view;
        EcgBreatheView ecgBreatheView = (EcgBreatheView) ViewBindings.findChildViewById(view, R.id.oblique_ecg_breathe_view);
        if (ecgBreatheView != null) {
            i8 = R.id.positive_ecg_breathe_view;
            EcgBreatheView ecgBreatheView2 = (EcgBreatheView) ViewBindings.findChildViewById(view, R.id.positive_ecg_breathe_view);
            if (ecgBreatheView2 != null) {
                return new ComponentEcgBreatheAnimBinding((RelativeLayout) view, ecgBreatheView, ecgBreatheView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ComponentEcgBreatheAnimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ComponentEcgBreatheAnimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.component_ecg_breathe_anim, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
