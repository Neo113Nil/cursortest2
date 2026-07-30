package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityGuidanceSetGenderBinding implements ViewBinding {

    @NonNull
    public final TextView btnNext;

    @NonNull
    public final IncludeGuidanceTopViewBinding includeTop;

    @NonNull
    public final LinearLayout llFemale;

    @NonNull
    public final LinearLayout llMale;

    @NonNull
    public final LinearLayout rlBottom;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvFemale;

    @NonNull
    public final TextView tvMale;

    @NonNull
    public final TextView tvTitle;

    private ActivityGuidanceSetGenderBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull IncludeGuidanceTopViewBinding includeGuidanceTopViewBinding, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.btnNext = textView;
        this.includeTop = includeGuidanceTopViewBinding;
        this.llFemale = linearLayout;
        this.llMale = linearLayout2;
        this.rlBottom = linearLayout3;
        this.tvContent = textView2;
        this.tvFemale = textView3;
        this.tvMale = textView4;
        this.tvTitle = textView5;
    }

    @NonNull
    public static ActivityGuidanceSetGenderBinding bind(@NonNull View view) {
        int i8 = R.id.btn_next;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_next);
        if (textView != null) {
            i8 = R.id.include_top;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_top);
            if (findChildViewById != null) {
                IncludeGuidanceTopViewBinding bind = IncludeGuidanceTopViewBinding.bind(findChildViewById);
                i8 = R.id.ll_female;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_female);
                if (linearLayout != null) {
                    i8 = R.id.ll_male;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_male);
                    if (linearLayout2 != null) {
                        i8 = R.id.rl_bottom;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_bottom);
                        if (linearLayout3 != null) {
                            i8 = R.id.tv_content;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                            if (textView2 != null) {
                                i8 = R.id.tv_female;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_female);
                                if (textView3 != null) {
                                    i8 = R.id.tv_male;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_male);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_title;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                        if (textView5 != null) {
                                            return new ActivityGuidanceSetGenderBinding((RelativeLayout) view, textView, bind, linearLayout, linearLayout2, linearLayout3, textView2, textView3, textView4, textView5);
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
    public static ActivityGuidanceSetGenderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGuidanceSetGenderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_guidance_set_gender, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
