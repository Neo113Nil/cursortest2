package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityPrivacyPolicyBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout slAgree;

    @NonNull
    public final TextView tvAgree;

    @NonNull
    public final TextView tvDescription;

    private ActivityPrivacyPolicyBinding(@NonNull RelativeLayout relativeLayout, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.slAgree = shadowLayout;
        this.tvAgree = textView;
        this.tvDescription = textView2;
    }

    @NonNull
    public static ActivityPrivacyPolicyBinding bind(@NonNull View view) {
        int i8 = R.id.sl_agree;
        ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_agree);
        if (shadowLayout != null) {
            i8 = R.id.tv_agree;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_agree);
            if (textView != null) {
                i8 = R.id.tv_description;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                if (textView2 != null) {
                    return new ActivityPrivacyPolicyBinding((RelativeLayout) view, shadowLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityPrivacyPolicyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPrivacyPolicyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_privacy_policy, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
