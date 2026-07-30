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
public final class ActivityStravaOauthBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvOauthFailed;

    @NonNull
    public final TextView tvOauthFailedTips;

    @NonNull
    public final TextView tvOauthIng;

    private ActivityStravaOauthBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivTitleBack = imageView;
        this.tvOauthFailed = textView;
        this.tvOauthFailedTips = textView2;
        this.tvOauthIng = textView3;
    }

    @NonNull
    public static ActivityStravaOauthBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.tv_oauth_failed;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_oauth_failed);
            if (textView != null) {
                i8 = R.id.tv_oauth_failed_tips;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_oauth_failed_tips);
                if (textView2 != null) {
                    i8 = R.id.tv_oauth_ing;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_oauth_ing);
                    if (textView3 != null) {
                        return new ActivityStravaOauthBinding((LinearLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStravaOauthBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStravaOauthBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_strava_oauth, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
