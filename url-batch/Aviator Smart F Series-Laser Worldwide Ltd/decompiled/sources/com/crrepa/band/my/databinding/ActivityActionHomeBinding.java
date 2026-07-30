package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityActionHomeBinding implements ViewBinding {

    @NonNull
    public final Button btnActionEdit;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final ImageView ivAction;

    @NonNull
    public final ImageView ivFeature;

    @NonNull
    public final ImageView ivFeatureContinue;

    @NonNull
    public final ImageView ivWatch;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvActionDescribe;

    @NonNull
    public final TextView tvActionTitle;

    @NonNull
    public final TextView tvFeature;

    @NonNull
    public final TextView tvFeatureDescribe;

    private ActivityActionHomeBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = coordinatorLayout;
        this.btnActionEdit = button;
        this.includeTitle = bandDataAppbarBinding;
        this.ivAction = imageView;
        this.ivFeature = imageView2;
        this.ivFeatureContinue = imageView3;
        this.ivWatch = imageView4;
        this.tvActionDescribe = textView;
        this.tvActionTitle = textView2;
        this.tvFeature = textView3;
        this.tvFeatureDescribe = textView4;
    }

    @NonNull
    public static ActivityActionHomeBinding bind(@NonNull View view) {
        int i8 = R.id.btn_action_edit;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_action_edit);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.iv_action;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_action);
                if (imageView != null) {
                    i8 = R.id.iv_feature;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_feature);
                    if (imageView2 != null) {
                        i8 = R.id.iv_feature_continue;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_feature_continue);
                        if (imageView3 != null) {
                            i8 = R.id.iv_watch;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch);
                            if (imageView4 != null) {
                                i8 = R.id.tv_action_describe;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_describe);
                                if (textView != null) {
                                    i8 = R.id.tv_action_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_title);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_feature;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_feature);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_feature_describe;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_feature_describe);
                                            if (textView4 != null) {
                                                return new ActivityActionHomeBinding((CoordinatorLayout) view, button, bind, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4);
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
    public static ActivityActionHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityActionHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_action_home, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
