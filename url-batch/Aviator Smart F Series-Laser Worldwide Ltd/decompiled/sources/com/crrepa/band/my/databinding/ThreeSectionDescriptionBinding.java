package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ThreeSectionDescriptionBinding implements ViewBinding {

    @NonNull
    public final ImageView ivFirstSection;

    @NonNull
    public final ImageView ivSecondSection;

    @NonNull
    public final ImageView ivThirdSection;

    @NonNull
    public final LinearLayout llFirstSection;

    @NonNull
    public final LinearLayout llThirdSection;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sleepDegreeView;

    @NonNull
    public final TextView tvFirstSection;

    @NonNull
    public final TextView tvSecondSection;

    @NonNull
    public final TextView tvThirdSection;

    private ThreeSectionDescriptionBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivFirstSection = imageView;
        this.ivSecondSection = imageView2;
        this.ivThirdSection = imageView3;
        this.llFirstSection = linearLayout2;
        this.llThirdSection = linearLayout3;
        this.sleepDegreeView = linearLayout4;
        this.tvFirstSection = textView;
        this.tvSecondSection = textView2;
        this.tvThirdSection = textView3;
    }

    @NonNull
    public static ThreeSectionDescriptionBinding bind(@NonNull View view) {
        int i8 = R.id.iv_first_section;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_first_section);
        if (imageView != null) {
            i8 = R.id.iv_second_section;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_second_section);
            if (imageView2 != null) {
                i8 = R.id.iv_third_section;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_third_section);
                if (imageView3 != null) {
                    i8 = R.id.ll_first_section;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_first_section);
                    if (linearLayout != null) {
                        i8 = R.id.ll_third_section;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_third_section);
                        if (linearLayout2 != null) {
                            LinearLayout linearLayout3 = (LinearLayout) view;
                            i8 = R.id.tv_first_section;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_section);
                            if (textView != null) {
                                i8 = R.id.tv_second_section;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_second_section);
                                if (textView2 != null) {
                                    i8 = R.id.tv_third_section;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_third_section);
                                    if (textView3 != null) {
                                        return new ThreeSectionDescriptionBinding(linearLayout3, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3);
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
    public static ThreeSectionDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ThreeSectionDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.three_section_description, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
