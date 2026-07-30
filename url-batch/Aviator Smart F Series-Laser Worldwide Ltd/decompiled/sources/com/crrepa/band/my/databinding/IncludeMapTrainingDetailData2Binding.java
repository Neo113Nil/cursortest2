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
public final class IncludeMapTrainingDetailData2Binding implements ViewBinding {

    @NonNull
    public final ImageView ivTrainingHr;

    @NonNull
    public final ImageView ivTrainingHrTips;

    @NonNull
    public final LinearLayout llTrainingDetailData;

    @NonNull
    public final LinearLayout llTrainingHr;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTrainingDetail1;

    @NonNull
    public final TextView tvTrainingDetail3;

    @NonNull
    public final TextView tvTrainingDetailName1;

    @NonNull
    public final TextView tvTrainingDetailName3;

    @NonNull
    public final TextView tvTrainingHr;

    private IncludeMapTrainingDetailData2Binding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.ivTrainingHr = imageView;
        this.ivTrainingHrTips = imageView2;
        this.llTrainingDetailData = linearLayout2;
        this.llTrainingHr = linearLayout3;
        this.tvTrainingDetail1 = textView;
        this.tvTrainingDetail3 = textView2;
        this.tvTrainingDetailName1 = textView3;
        this.tvTrainingDetailName3 = textView4;
        this.tvTrainingHr = textView5;
    }

    @NonNull
    public static IncludeMapTrainingDetailData2Binding bind(@NonNull View view) {
        int i8 = R.id.iv_training_hr;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_hr);
        if (imageView != null) {
            i8 = R.id.iv_training_hr_tips;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_hr_tips);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = R.id.ll_training_hr;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_training_hr);
                if (linearLayout2 != null) {
                    i8 = R.id.tv_training_detail_1;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_1);
                    if (textView != null) {
                        i8 = R.id.tv_training_detail_3;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_3);
                        if (textView2 != null) {
                            i8 = R.id.tv_training_detail_name_1;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_name_1);
                            if (textView3 != null) {
                                i8 = R.id.tv_training_detail_name_3;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_detail_name_3);
                                if (textView4 != null) {
                                    i8 = R.id.tv_training_hr;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_hr);
                                    if (textView5 != null) {
                                        return new IncludeMapTrainingDetailData2Binding(linearLayout, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
    public static IncludeMapTrainingDetailData2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeMapTrainingDetailData2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_map_training_detail_data_2, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
