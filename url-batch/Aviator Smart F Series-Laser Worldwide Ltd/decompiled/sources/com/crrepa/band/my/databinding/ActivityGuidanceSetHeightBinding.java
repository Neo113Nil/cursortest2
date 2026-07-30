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
import com.crrepa.band.my.health.widgets.VerticalScaleView;

/* loaded from: classes2.dex */
public final class ActivityGuidanceSetHeightBinding implements ViewBinding {

    @NonNull
    public final TextView btnNext;

    @NonNull
    public final IncludeGuidanceTopViewBinding includeTop;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivPointer;

    @NonNull
    public final LinearLayout rlBottom;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final VerticalScaleView scale;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvHeight;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvUnit;

    @NonNull
    public final TextView tvValue;

    private ActivityGuidanceSetHeightBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull IncludeGuidanceTopViewBinding includeGuidanceTopViewBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull VerticalScaleView verticalScaleView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = relativeLayout;
        this.btnNext = textView;
        this.includeTop = includeGuidanceTopViewBinding;
        this.ivBack = imageView;
        this.ivPointer = imageView2;
        this.rlBottom = linearLayout;
        this.scale = verticalScaleView;
        this.tvContent = textView2;
        this.tvHeight = textView3;
        this.tvTitle = textView4;
        this.tvUnit = textView5;
        this.tvValue = textView6;
    }

    @NonNull
    public static ActivityGuidanceSetHeightBinding bind(@NonNull View view) {
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
                    i8 = R.id.iv_pointer;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_pointer);
                    if (imageView2 != null) {
                        i8 = R.id.rl_bottom;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_bottom);
                        if (linearLayout != null) {
                            i8 = R.id.scale;
                            VerticalScaleView verticalScaleView = (VerticalScaleView) ViewBindings.findChildViewById(view, R.id.scale);
                            if (verticalScaleView != null) {
                                i8 = R.id.tv_content;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                                if (textView2 != null) {
                                    i8 = R.id.tv_height;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_height);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_unit;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unit);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_value;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value);
                                                if (textView6 != null) {
                                                    return new ActivityGuidanceSetHeightBinding((RelativeLayout) view, textView, bind, imageView, imageView2, linearLayout, verticalScaleView, textView2, textView3, textView4, textView5, textView6);
                                                }
                                            }
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
    public static ActivityGuidanceSetHeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGuidanceSetHeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_guidance_set_height, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
