package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker;

/* loaded from: classes2.dex */
public final class ActivityGuidanceSetAgeBinding implements ViewBinding {

    @NonNull
    public final TextView btnNext;

    @NonNull
    public final IncludeGuidanceTopViewBinding includeTop;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final LinearLayout rlBottom;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final WheelDatePicker wpDate;

    private ActivityGuidanceSetAgeBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull IncludeGuidanceTopViewBinding includeGuidanceTopViewBinding, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WheelDatePicker wheelDatePicker) {
        this.rootView = relativeLayout;
        this.btnNext = textView;
        this.includeTop = includeGuidanceTopViewBinding;
        this.ivBack = imageView;
        this.rlBottom = linearLayout;
        this.tvContent = textView2;
        this.tvTitle = textView3;
        this.wpDate = wheelDatePicker;
    }

    @NonNull
    public static ActivityGuidanceSetAgeBinding bind(@NonNull View view) {
        int i8 = R.id.btn_next;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_next);
        if (textView != null) {
            i8 = R.id.include_top;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_top);
            if (findChildViewById != null) {
                IncludeGuidanceTopViewBinding bind = IncludeGuidanceTopViewBinding.bind(findChildViewById);
                i8 = R.id.iv_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView != null) {
                    i8 = R.id.rl_bottom;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_bottom);
                    if (linearLayout != null) {
                        i8 = R.id.tv_content;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                        if (textView2 != null) {
                            i8 = R.id.tv_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView3 != null) {
                                i8 = R.id.wp_date;
                                WheelDatePicker wheelDatePicker = (WheelDatePicker) ViewBindings.findChildViewById(view, R.id.wp_date);
                                if (wheelDatePicker != null) {
                                    return new ActivityGuidanceSetAgeBinding((RelativeLayout) view, textView, bind, imageView, linearLayout, textView2, textView3, wheelDatePicker);
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
    public static ActivityGuidanceSetAgeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGuidanceSetAgeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_guidance_set_age, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
