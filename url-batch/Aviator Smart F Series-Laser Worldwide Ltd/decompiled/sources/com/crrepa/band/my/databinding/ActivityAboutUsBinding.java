package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityAboutUsBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout appScore;

    @NonNull
    public final LinearLayout llLogo;

    @NonNull
    public final RelativeLayout privacyPolicy;

    @NonNull
    public final RelativeLayout rlBetaFirmwareUpdate;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final RelativeLayout softwareLicense;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    @NonNull
    public final TextView tvAppVerison;

    private ActivityAboutUsBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView) {
        this.rootView = coordinatorLayout;
        this.appScore = relativeLayout;
        this.llLogo = linearLayout;
        this.privacyPolicy = relativeLayout2;
        this.rlBetaFirmwareUpdate = relativeLayout3;
        this.softwareLicense = relativeLayout4;
        this.titleBar = bandDataAppbarBinding;
        this.tvAppVerison = textView;
    }

    @NonNull
    public static ActivityAboutUsBinding bind(@NonNull View view) {
        int i8 = R.id.app_score;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.app_score);
        if (relativeLayout != null) {
            i8 = R.id.ll_logo;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_logo);
            if (linearLayout != null) {
                i8 = R.id.privacy_policy;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.privacy_policy);
                if (relativeLayout2 != null) {
                    i8 = R.id.rl_beta_firmware_update;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_beta_firmware_update);
                    if (relativeLayout3 != null) {
                        i8 = R.id.software_license;
                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.software_license);
                        if (relativeLayout4 != null) {
                            i8 = R.id.title_bar;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
                            if (findChildViewById != null) {
                                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                                i8 = R.id.tv_app_verison;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_verison);
                                if (textView != null) {
                                    return new ActivityAboutUsBinding((CoordinatorLayout) view, relativeLayout, linearLayout, relativeLayout2, relativeLayout3, relativeLayout4, bind, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityAboutUsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAboutUsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_about_us, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
