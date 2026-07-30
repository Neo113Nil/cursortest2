package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityPhysiologicalGuideBinding implements ViewBinding {

    @NonNull
    public final Button btnPhysiologicalStart;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final FrameLayout physiologicalGuideContent;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private ActivityPhysiologicalGuideBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.btnPhysiologicalStart = button;
        this.ivTitleBack = imageView;
        this.physiologicalGuideContent = frameLayout;
        this.tvTitle = textView;
    }

    @NonNull
    public static ActivityPhysiologicalGuideBinding bind(@NonNull View view) {
        int i8 = R.id.btn_physiological_start;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_physiological_start);
        if (button != null) {
            i8 = R.id.iv_title_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
            if (imageView != null) {
                i8 = R.id.physiological_guide_content;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.physiological_guide_content);
                if (frameLayout != null) {
                    i8 = R.id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView != null) {
                        return new ActivityPhysiologicalGuideBinding((RelativeLayout) view, button, imageView, frameLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityPhysiologicalGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPhysiologicalGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_physiological_guide, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
