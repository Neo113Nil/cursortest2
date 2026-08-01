package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.ads.NativeAdLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivitySplashBinding implements ViewBinding {
    public final ConstraintLayout adFbLayout;
    public final FrameLayout adFrame;
    public final MaterialCardView adLayout;
    public final LinearProgressIndicator animationView;
    public final TextView appName;
    public final Guideline guideline;
    public final TextView loadingText;
    public final NativeAdLayout nativeAdContainer;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout shimmerViewContainer;
    public final ShimmerFrameLayout shimmerViewContainer1;
    public final ImageView splashIcon;
    public final TextView startButton;
    public final TextView textView2;

    private ActivitySplashBinding(ConstraintLayout rootView, ConstraintLayout adFbLayout, FrameLayout adFrame, MaterialCardView adLayout, LinearProgressIndicator animationView, TextView appName, Guideline guideline, TextView loadingText, NativeAdLayout nativeAdContainer, ShimmerFrameLayout shimmerViewContainer, ShimmerFrameLayout shimmerViewContainer1, ImageView splashIcon, TextView startButton, TextView textView2) {
        this.rootView = rootView;
        this.adFbLayout = adFbLayout;
        this.adFrame = adFrame;
        this.adLayout = adLayout;
        this.animationView = animationView;
        this.appName = appName;
        this.guideline = guideline;
        this.loadingText = loadingText;
        this.nativeAdContainer = nativeAdContainer;
        this.shimmerViewContainer = shimmerViewContainer;
        this.shimmerViewContainer1 = shimmerViewContainer1;
        this.splashIcon = splashIcon;
        this.startButton = startButton;
        this.textView2 = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySplashBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivitySplashBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_splash, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySplashBinding bind(View rootView) {
        int i = R.id.ad_fb_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.ad_fb_layout);
        if (constraintLayout != null) {
            i = R.id.adFrame;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.adFrame);
            if (frameLayout != null) {
                i = R.id.adLayout;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.adLayout);
                if (materialCardView != null) {
                    i = R.id.animationView;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(rootView, R.id.animationView);
                    if (linearProgressIndicator != null) {
                        i = R.id.app_name;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.app_name);
                        if (textView != null) {
                            i = R.id.guideline;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guideline);
                            if (guideline != null) {
                                i = R.id.loadingText;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loadingText);
                                if (textView2 != null) {
                                    i = R.id.native_ad_container;
                                    NativeAdLayout nativeAdLayout = (NativeAdLayout) ViewBindings.findChildViewById(rootView, R.id.native_ad_container);
                                    if (nativeAdLayout != null) {
                                        i = R.id.shimmer_view_container;
                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container);
                                        if (shimmerFrameLayout != null) {
                                            i = R.id.shimmer_view_container1;
                                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container1);
                                            if (shimmerFrameLayout2 != null) {
                                                i = R.id.splash_icon;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.splash_icon);
                                                if (imageView != null) {
                                                    i = R.id.startButton;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.startButton);
                                                    if (textView3 != null) {
                                                        i = R.id.textView2;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView2);
                                                        if (textView4 != null) {
                                                            return new ActivitySplashBinding((ConstraintLayout) rootView, constraintLayout, frameLayout, materialCardView, linearProgressIndicator, textView, guideline, textView2, nativeAdLayout, shimmerFrameLayout, shimmerFrameLayout2, imageView, textView3, textView4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
