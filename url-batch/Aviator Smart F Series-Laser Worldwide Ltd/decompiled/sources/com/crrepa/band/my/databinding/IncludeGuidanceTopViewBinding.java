package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class IncludeGuidanceTopViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llProgress;

    @NonNull
    public final ProgressBar pb;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvSkip;

    @NonNull
    public final TextView tvTips;

    private IncludeGuidanceTopViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.llProgress = linearLayout;
        this.pb = progressBar;
        this.tvProgress = textView;
        this.tvSkip = textView2;
        this.tvTips = textView3;
    }

    @NonNull
    public static IncludeGuidanceTopViewBinding bind(@NonNull View view) {
        int i8 = R.id.ll_progress;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_progress);
        if (linearLayout != null) {
            i8 = R.id.pb;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb);
            if (progressBar != null) {
                i8 = R.id.tv_progress;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress);
                if (textView != null) {
                    i8 = R.id.tv_skip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_skip);
                    if (textView2 != null) {
                        i8 = R.id.tv_tips;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tips);
                        if (textView3 != null) {
                            return new IncludeGuidanceTopViewBinding((RelativeLayout) view, linearLayout, progressBar, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeGuidanceTopViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeGuidanceTopViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_guidance_top_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
