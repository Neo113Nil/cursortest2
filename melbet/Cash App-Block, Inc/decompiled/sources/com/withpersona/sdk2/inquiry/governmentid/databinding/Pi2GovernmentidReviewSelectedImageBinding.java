package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidReviewSelectedImageBinding implements ViewBinding {
    public final TextView body;
    public final PersonaMaterialButton chooseNewPhotoButton;
    public final ImageView fileIcon;
    public final TextView fileNameTextview;
    public final ImageView imageView;
    public final Pi2NavigationBar navigationBar;
    public final CoordinatorLayout rootView;
    public final TextView title;
    public final ButtonWithLoadingIndicator usePhotoButton;

    public Pi2GovernmentidReviewSelectedImageBinding(CoordinatorLayout coordinatorLayout, TextView textView, PersonaMaterialButton personaMaterialButton, ImageView imageView, TextView textView2, ImageView imageView2, Pi2NavigationBar pi2NavigationBar, TextView textView3, ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.rootView = coordinatorLayout;
        this.body = textView;
        this.chooseNewPhotoButton = personaMaterialButton;
        this.fileIcon = imageView;
        this.fileNameTextview = textView2;
        this.imageView = imageView2;
        this.navigationBar = pi2NavigationBar;
        this.title = textView3;
        this.usePhotoButton = buttonWithLoadingIndicator;
    }

    public static Pi2GovernmentidReviewSelectedImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_governmentid_review_selected_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.body);
        if (textView != null) {
            i = R.id.choose_new_photo_button;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.choose_new_photo_button);
            if (personaMaterialButton != null) {
                i = R.id.file_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.file_icon);
                if (imageView != null) {
                    i = R.id.file_name_textview;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.file_name_textview);
                    if (textView2 != null) {
                        i = R.id.image_view;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.image_view);
                        if (imageView2 != null) {
                            i = R.id.image_view_container;
                            if (((CardView) ViewBindings.findChildViewById(inflate, R.id.image_view_container)) != null) {
                                i = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i = R.id.title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                    if (textView3 != null) {
                                        i = R.id.use_photo_button;
                                        ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) ViewBindings.findChildViewById(inflate, R.id.use_photo_button);
                                        if (buttonWithLoadingIndicator != null) {
                                            return new Pi2GovernmentidReviewSelectedImageBinding((CoordinatorLayout) inflate, textView, personaMaterialButton, imageView, textView2, imageView2, pi2NavigationBar, textView3, buttonWithLoadingIndicator);
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
