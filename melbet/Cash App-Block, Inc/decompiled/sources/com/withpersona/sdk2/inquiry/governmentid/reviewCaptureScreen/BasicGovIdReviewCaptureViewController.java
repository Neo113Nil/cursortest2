package com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class BasicGovIdReviewCaptureViewController implements GovIdReviewCaptureViewController {
    public final Pi2GovernmentidReviewBinding binding;
    public final ConstraintSet constraintSet;
    public View currentOverlayAssetView;
    public boolean isProcessing;

    public BasicGovIdReviewCaptureViewController(Context context, ViewGroup viewGroup) {
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.pi2_governmentid_review, viewGroup, false);
        int i = R.id.accept_button;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.accept_button);
        if (personaMaterialButton != null) {
            i = R.id.animations_played;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(inflate, R.id.animations_played);
            if (checkBox != null) {
                i = R.id.camera_screen_content;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(inflate, R.id.camera_screen_content);
                if (coordinatorLayout != null) {
                    i = R.id.camera_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.camera_view);
                    if (constraintLayout != null) {
                        i = R.id.disclaimer;
                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.disclaimer);
                        if (textView != null) {
                            i = R.id.disclaimer_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.disclaimer_icon);
                            if (imageView != null) {
                                i = R.id.disclaimer_view;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.disclaimer_view);
                                if (linearLayout != null) {
                                    i = R.id.flash_screen;
                                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.flash_screen);
                                    if (findChildViewById != null) {
                                        i = R.id.flow_layout;
                                        Flow flow = (Flow) ViewBindings.findChildViewById(inflate, R.id.flow_layout);
                                        if (flow != null) {
                                            i = R.id.navigation_bar;
                                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                            if (pi2NavigationBar != null) {
                                                i = R.id.overlay;
                                                View findChildViewById2 = ViewBindings.findChildViewById(inflate, R.id.overlay);
                                                if (findChildViewById2 != null) {
                                                    i = R.id.overlay_guide;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.overlay_guide);
                                                    if (imageView2 != null) {
                                                        i = R.id.overlay_hint;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.overlay_hint);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.overlay_icon;
                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.overlay_icon);
                                                            if (themeableLottieAnimationView != null) {
                                                                i = R.id.overlay_icon_container;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.overlay_icon_container);
                                                                if (constraintLayout3 != null) {
                                                                    i = R.id.overlay_text;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.overlay_text);
                                                                    if (textView2 != null) {
                                                                        i = R.id.processing;
                                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.processing);
                                                                        if (frameLayout != null) {
                                                                            i = R.id.progress_bar;
                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                                                                            if (progressBar != null) {
                                                                                i = R.id.retry_button;
                                                                                PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.retry_button);
                                                                                if (personaMaterialButton2 != null) {
                                                                                    i = R.id.review_image;
                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.review_image);
                                                                                    if (imageView3 != null) {
                                                                                        i = R.id.spotlight_view;
                                                                                        SpotlightView spotlightView = (SpotlightView) ViewBindings.findChildViewById(inflate, R.id.spotlight_view);
                                                                                        if (spotlightView != null) {
                                                                                            i = R.id.spotlight_view2;
                                                                                            if (((SpotlightView) ViewBindings.findChildViewById(inflate, R.id.spotlight_view2)) != null) {
                                                                                                i = R.id.title;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                                                                                if (textView3 != null) {
                                                                                                    this.binding = new Pi2GovernmentidReviewBinding((FrameLayout) inflate, personaMaterialButton, checkBox, coordinatorLayout, constraintLayout, textView, imageView, linearLayout, findChildViewById, flow, pi2NavigationBar, findChildViewById2, imageView2, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView2, frameLayout, progressBar, personaMaterialButton2, imageView3, spotlightView, textView3);
                                                                                                    this.constraintSet = new ConstraintSet();
                                                                                                    return;
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
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }
}
