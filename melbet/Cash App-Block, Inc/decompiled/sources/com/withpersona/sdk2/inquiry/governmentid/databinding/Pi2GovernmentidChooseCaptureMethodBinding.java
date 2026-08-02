package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidChooseCaptureMethodBinding implements ViewBinding {
    public final TextView body;
    public final PersonaMaterialButton cameraButton;
    public final ThemeableLottieAnimationView idImage;
    public final View idImageContainer;
    public final ConstraintLayout imageViewContainer;
    public final CardView localImage;
    public final Pi2NavigationBar navigationBar;
    public final CoordinatorLayout rootView;
    public final TextView title;
    public final PersonaMaterialButton uploadButton;

    public Pi2GovernmentidChooseCaptureMethodBinding(CoordinatorLayout coordinatorLayout, TextView textView, PersonaMaterialButton personaMaterialButton, ThemeableLottieAnimationView themeableLottieAnimationView, View view, ConstraintLayout constraintLayout, CardView cardView, Pi2NavigationBar pi2NavigationBar, TextView textView2, PersonaMaterialButton personaMaterialButton2) {
        this.rootView = coordinatorLayout;
        this.body = textView;
        this.cameraButton = personaMaterialButton;
        this.idImage = themeableLottieAnimationView;
        this.idImageContainer = view;
        this.imageViewContainer = constraintLayout;
        this.localImage = cardView;
        this.navigationBar = pi2NavigationBar;
        this.title = textView2;
        this.uploadButton = personaMaterialButton2;
    }

    public static Pi2GovernmentidChooseCaptureMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_governmentid_choose_capture_method, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.body);
        if (textView != null) {
            i = R.id.camera_button;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.camera_button);
            if (personaMaterialButton != null) {
                i = R.id.id_image;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.id_image);
                if (themeableLottieAnimationView != null) {
                    i = R.id.id_image_container;
                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.id_image_container);
                    if (findChildViewById != null) {
                        i = R.id.image_view_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.image_view_container);
                        if (constraintLayout != null) {
                            i = R.id.local_image;
                            CardView cardView = (CardView) ViewBindings.findChildViewById(inflate, R.id.local_image);
                            if (cardView != null) {
                                i = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i = R.id.title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                    if (textView2 != null) {
                                        i = R.id.upload_button;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.upload_button);
                                        if (personaMaterialButton2 != null) {
                                            return new Pi2GovernmentidChooseCaptureMethodBinding((CoordinatorLayout) inflate, textView, personaMaterialButton, themeableLottieAnimationView, findChildViewById, constraintLayout, cardView, pi2NavigationBar, textView2, personaMaterialButton2);
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
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
