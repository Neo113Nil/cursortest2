package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityStartAppBinding implements ViewBinding {
    public final LinearLayout btnStartApp;
    public final ImageView ivBackground;
    public final LinearLayout llContent;
    public final RelativeLayout main;
    public final LinearLayout privacypolicy;
    public final LinearLayout rateus;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final LinearLayout shareapp;
    public final TextView tvNativeAd;

    private ActivityStartAppBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, RelativeLayout relativeLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout3, LinearLayout linearLayout5, TextView textView) {
        this.rootView = relativeLayout;
        this.btnStartApp = linearLayout;
        this.ivBackground = imageView;
        this.llContent = linearLayout2;
        this.main = relativeLayout2;
        this.privacypolicy = linearLayout3;
        this.rateus = linearLayout4;
        this.rlNativeAd = relativeLayout3;
        this.shareapp = linearLayout5;
        this.tvNativeAd = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityStartAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityStartAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_start_app, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityStartAppBinding bind(View view) {
        int i = R.id.btnStartApp;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ivBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.llContent;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.privacypolicy;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.rateus;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.rlNativeAd;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.shareapp;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout5 != null) {
                                    i = R.id.tvNativeAd;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new ActivityStartAppBinding(relativeLayout, linearLayout, imageView, linearLayout2, relativeLayout, linearLayout3, linearLayout4, relativeLayout2, linearLayout5, textView);
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
