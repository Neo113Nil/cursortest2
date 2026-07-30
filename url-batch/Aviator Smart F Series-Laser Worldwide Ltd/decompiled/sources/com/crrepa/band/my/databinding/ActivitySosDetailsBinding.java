package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivitySosDetailsBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBack;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnSos;

    private ActivitySosDetailsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SwitchButton switchButton) {
        this.rootView = linearLayout;
        this.ivBack = imageView;
        this.sbtnSos = switchButton;
    }

    @NonNull
    public static ActivitySosDetailsBinding bind(@NonNull View view) {
        int i8 = R.id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
        if (imageView != null) {
            i8 = R.id.sbtn_sos;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_sos);
            if (switchButton != null) {
                return new ActivitySosDetailsBinding((LinearLayout) view, imageView, switchButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivitySosDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivitySosDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_sos_details, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
