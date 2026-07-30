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
import com.crrepa.band.my.health.widgets.ScaleView;

/* loaded from: classes2.dex */
public final class ActivityGuidanceSetWeightBinding implements ViewBinding {

    @NonNull
    public final TextView btnNext;

    @NonNull
    public final IncludeGuidanceTopViewBinding includeTop;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final LinearLayout layoutWeight;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ScaleView scale;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvUnit;

    @NonNull
    public final TextView tvValue;

    private ActivityGuidanceSetWeightBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull IncludeGuidanceTopViewBinding includeGuidanceTopViewBinding, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ScaleView scaleView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.btnNext = textView;
        this.includeTop = includeGuidanceTopViewBinding;
        this.ivBack = imageView;
        this.layoutWeight = linearLayout;
        this.scale = scaleView;
        this.tvContent = textView2;
        this.tvTitle = textView3;
        this.tvUnit = textView4;
        this.tvValue = textView5;
    }

    @NonNull
    public static ActivityGuidanceSetWeightBinding bind(@NonNull View view) {
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
                    i8 = R.id.layout_weight;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_weight);
                    if (linearLayout != null) {
                        i8 = R.id.scale;
                        ScaleView scaleView = (ScaleView) ViewBindings.findChildViewById(view, R.id.scale);
                        if (scaleView != null) {
                            i8 = R.id.tv_content;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                            if (textView2 != null) {
                                i8 = R.id.tv_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                if (textView3 != null) {
                                    i8 = R.id.tv_unit;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unit);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_value;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value);
                                        if (textView5 != null) {
                                            return new ActivityGuidanceSetWeightBinding((RelativeLayout) view, textView, bind, imageView, linearLayout, scaleView, textView2, textView3, textView4, textView5);
                                        }
                                    }
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
    public static ActivityGuidanceSetWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGuidanceSetWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_guidance_set_weight, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
