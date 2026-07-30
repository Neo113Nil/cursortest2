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
public final class ActivityGuide4Binding implements ViewBinding {
    public final AppCompatButton btn4;
    public final LinearLayout btnFemale;
    public final LinearLayout btnMale;
    public final LinearLayout contentLayout;
    public final ImageView ivBackground;
    public final ImageView ivFemale;
    public final ImageView ivMale;
    public final LinearLayout llHeader;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final TextView tvGenderTitle;
    public final TextView tvNativeAd;

    private ActivityGuide4Binding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout4, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btn4 = appCompatButton;
        this.btnFemale = linearLayout;
        this.btnMale = linearLayout2;
        this.contentLayout = linearLayout3;
        this.ivBackground = imageView;
        this.ivFemale = imageView2;
        this.ivMale = imageView3;
        this.llHeader = linearLayout4;
        this.main = relativeLayout2;
        this.rlNativeAd = relativeLayout3;
        this.tvGenderTitle = textView;
        this.tvNativeAd = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGuide4Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGuide4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_guide4, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGuide4Binding bind(View view) {
        int i = R.id.btn4;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btnFemale;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.btnMale;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.contentLayout;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.ivBackground;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.ivFemale;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.ivMale;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.llHeader;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout4 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i = R.id.rlNativeAd;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout2 != null) {
                                            i = R.id.tvGenderTitle;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.tvNativeAd;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    return new ActivityGuide4Binding(relativeLayout, appCompatButton, linearLayout, linearLayout2, linearLayout3, imageView, imageView2, imageView3, linearLayout4, relativeLayout, relativeLayout2, textView, textView2);
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
