package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ViewViewLoadMoreBinding implements ViewBinding {

    @NonNull
    public final FrameLayout loadMoreLoadCompleteView;

    @NonNull
    public final FrameLayout loadMoreLoadEndView;

    @NonNull
    public final FrameLayout loadMoreLoadFailView;

    @NonNull
    public final LinearLayout loadMoreLoadingView;

    @NonNull
    public final ProgressBar loadingProgress;

    @NonNull
    public final TextView loadingText;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvPrompt;

    private ViewViewLoadMoreBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.loadMoreLoadCompleteView = frameLayout2;
        this.loadMoreLoadEndView = frameLayout3;
        this.loadMoreLoadFailView = frameLayout4;
        this.loadMoreLoadingView = linearLayout;
        this.loadingProgress = progressBar;
        this.loadingText = textView;
        this.tvPrompt = textView2;
    }

    @NonNull
    public static ViewViewLoadMoreBinding bind(@NonNull View view) {
        int i8 = R.id.load_more_load_complete_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_complete_view);
        if (frameLayout != null) {
            i8 = R.id.load_more_load_end_view;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_end_view);
            if (frameLayout2 != null) {
                i8 = R.id.load_more_load_fail_view;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_fail_view);
                if (frameLayout3 != null) {
                    i8 = R.id.load_more_loading_view;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.load_more_loading_view);
                    if (linearLayout != null) {
                        i8 = R.id.loading_progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                        if (progressBar != null) {
                            i8 = R.id.loading_text;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.loading_text);
                            if (textView != null) {
                                i8 = R.id.tv_prompt;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prompt);
                                if (textView2 != null) {
                                    return new ViewViewLoadMoreBinding((FrameLayout) view, frameLayout, frameLayout2, frameLayout3, linearLayout, progressBar, textView, textView2);
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
    public static ViewViewLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewViewLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_view_load_more, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
