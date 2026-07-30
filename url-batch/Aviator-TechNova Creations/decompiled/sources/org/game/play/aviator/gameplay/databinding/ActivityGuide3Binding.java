package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityGuide3Binding implements ViewBinding {
    public final AppCompatButton btn3;
    public final LinearLayout contentLayout;
    public final ImageView ivBackground;
    public final LinearLayout llAge1;
    public final LinearLayout llAge2;
    public final LinearLayout llAge3;
    public final LinearLayout llAge4;
    public final LinearLayout llHeader;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final TextView tvAgeTitle;
    public final TextView tvNativeAd;

    private ActivityGuide3Binding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btn3 = appCompatButton;
        this.contentLayout = linearLayout;
        this.ivBackground = imageView;
        this.llAge1 = linearLayout2;
        this.llAge2 = linearLayout3;
        this.llAge3 = linearLayout4;
        this.llAge4 = linearLayout5;
        this.llHeader = linearLayout6;
        this.main = relativeLayout2;
        this.rlNativeAd = relativeLayout3;
        this.tvAgeTitle = textView;
        this.tvNativeAd = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGuide3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGuide3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_guide3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGuide3Binding bind(View view) {
        int i = R.id.btn3;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.contentLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ivBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.llAge1;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.llAge2;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout3 != null) {
                            i = R.id.llAge3;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout4 != null) {
                                i = R.id.llAge4;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout5 != null) {
                                    i = R.id.llHeader;
                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout6 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i = R.id.rlNativeAd;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout2 != null) {
                                            i = R.id.tvAgeTitle;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.tvNativeAd;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    return new ActivityGuide3Binding(relativeLayout, appCompatButton, linearLayout, imageView, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout, relativeLayout2, textView, textView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
