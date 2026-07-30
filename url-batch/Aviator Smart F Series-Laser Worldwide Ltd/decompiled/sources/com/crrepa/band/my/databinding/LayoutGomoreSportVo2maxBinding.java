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

/* loaded from: classes2.dex */
public final class LayoutGomoreSportVo2maxBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout rlGomoreSportVo2max;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvVo2max;

    @NonNull
    public final TextView tvVo2maxTitle;

    private LayoutGomoreSportVo2maxBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.rlGomoreSportVo2max = relativeLayout2;
        this.tvVo2max = textView;
        this.tvVo2maxTitle = textView2;
    }

    @NonNull
    public static LayoutGomoreSportVo2maxBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i8 = R.id.tv_vo2max;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_vo2max);
        if (textView != null) {
            i8 = R.id.tv_vo2max_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_vo2max_title);
            if (textView2 != null) {
                return new LayoutGomoreSportVo2maxBinding(relativeLayout, relativeLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutGomoreSportVo2maxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutGomoreSportVo2maxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_gomore_sport_vo2max, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
