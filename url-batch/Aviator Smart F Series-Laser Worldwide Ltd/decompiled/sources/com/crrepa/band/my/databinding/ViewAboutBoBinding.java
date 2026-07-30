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
public final class ViewAboutBoBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHelp;

    @NonNull
    public final LinearLayout llAboutBo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAboutBo;

    @NonNull
    public final TextView tvBoConent;

    @NonNull
    public final TextView tvBoSecondContent;

    @NonNull
    public final TextView tvLearnBo;

    private ViewAboutBoBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.ivHelp = imageView;
        this.llAboutBo = linearLayout2;
        this.tvAboutBo = textView;
        this.tvBoConent = textView2;
        this.tvBoSecondContent = textView3;
        this.tvLearnBo = textView4;
    }

    @NonNull
    public static ViewAboutBoBinding bind(@NonNull View view) {
        int i8 = R.id.iv_help;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_help);
        if (imageView != null) {
            i8 = R.id.ll_about_bo;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_about_bo);
            if (linearLayout != null) {
                i8 = R.id.tv_about_bo;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_about_bo);
                if (textView != null) {
                    i8 = R.id.tv_bo_conent;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bo_conent);
                    if (textView2 != null) {
                        i8 = R.id.tv_bo_second_content;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bo_second_content);
                        if (textView3 != null) {
                            i8 = R.id.tv_learn_bo;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_learn_bo);
                            if (textView4 != null) {
                                return new ViewAboutBoBinding((LinearLayout) view, imageView, linearLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewAboutBoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewAboutBoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_about_bo, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
