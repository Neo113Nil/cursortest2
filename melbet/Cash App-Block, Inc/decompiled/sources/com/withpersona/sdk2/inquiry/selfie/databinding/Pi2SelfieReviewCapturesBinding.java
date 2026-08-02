package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2SelfieReviewCapturesBinding implements ViewBinding {
    public final TextView body;
    public final Pi2NavigationBar navigationBar;
    public final RecyclerView recyclerView;
    public final PersonaMaterialButton retakeButton;
    public final ConstraintLayout rootView;
    public final TextView title;
    public final PersonaMaterialButton usePhotosButton;

    public Pi2SelfieReviewCapturesBinding(ConstraintLayout constraintLayout, TextView textView, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, PersonaMaterialButton personaMaterialButton, TextView textView2, PersonaMaterialButton personaMaterialButton2) {
        this.rootView = constraintLayout;
        this.body = textView;
        this.navigationBar = pi2NavigationBar;
        this.recyclerView = recyclerView;
        this.retakeButton = personaMaterialButton;
        this.title = textView2;
        this.usePhotosButton = personaMaterialButton2;
    }

    public static Pi2SelfieReviewCapturesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_selfie_review_captures, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.body);
        if (textView != null) {
            i = R.id.footer_container;
            if (((ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.footer_container)) != null) {
                i = R.id.navigation_bar;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                if (pi2NavigationBar != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(inflate, R.id.recycler_view);
                    if (recyclerView != null) {
                        i = R.id.retake_button;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.retake_button);
                        if (personaMaterialButton != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                            if (textView2 != null) {
                                i = R.id.use_photos_button;
                                PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.use_photos_button);
                                if (personaMaterialButton2 != null) {
                                    return new Pi2SelfieReviewCapturesBinding((ConstraintLayout) inflate, textView, pi2NavigationBar, recyclerView, personaMaterialButton, textView2, personaMaterialButton2);
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
