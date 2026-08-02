package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2DocumentReviewBinding implements ViewBinding {
    public final TextView body;
    public final TextView disclaimer;
    public final Pi2NavigationBar navigationBar;
    public final RecyclerView reviewItemList;
    public final CoordinatorLayout rootView;
    public final PersonaMaterialButton submitButton;
    public final TextView title;

    public Pi2DocumentReviewBinding(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, PersonaMaterialButton personaMaterialButton, TextView textView3) {
        this.rootView = coordinatorLayout;
        this.body = textView;
        this.disclaimer = textView2;
        this.navigationBar = pi2NavigationBar;
        this.reviewItemList = recyclerView;
        this.submitButton = personaMaterialButton;
        this.title = textView3;
    }

    public static Pi2DocumentReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_document_review, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.body);
        if (textView != null) {
            i = R.id.bottom_guideline;
            if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.bottom_guideline)) != null) {
                i = R.id.disclaimer;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.disclaimer);
                if (textView2 != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.left_guideline)) != null) {
                        i = R.id.navigation_bar;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                        if (pi2NavigationBar != null) {
                            i = R.id.review_item_list;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(inflate, R.id.review_item_list);
                            if (recyclerView != null) {
                                i = R.id.right_guideline;
                                if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.right_guideline)) != null) {
                                    i = R.id.submit_button;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.submit_button);
                                    if (personaMaterialButton != null) {
                                        i = R.id.title;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                        if (textView3 != null) {
                                            return new Pi2DocumentReviewBinding((CoordinatorLayout) inflate, textView, textView2, pi2NavigationBar, recyclerView, personaMaterialButton, textView3);
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
