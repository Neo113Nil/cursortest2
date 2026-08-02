package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidInstructionsBinding implements ViewBinding {
    public final ConstraintLayout governmentidHeaderImageContainer;
    public final ImageView imageviewGovernmentidHeaderImage;
    public final View listDivider;
    public final Pi2NavigationBar navigationBar;
    public final RecyclerView recyclerviewGovernmentidIdlist;
    public final CoordinatorLayout rootView;
    public final TextView textviewGovernmentidInstructionsBody;
    public final TextView textviewGovernmentidInstructionsDisclaimer;
    public final TextView textviewGovernmentidInstructionsTitle;
    public final TextView textviewGovernmentidInstructionslistheader;

    public Pi2GovernmentidInstructionsBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, ImageView imageView, View view, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = coordinatorLayout;
        this.governmentidHeaderImageContainer = constraintLayout;
        this.imageviewGovernmentidHeaderImage = imageView;
        this.listDivider = view;
        this.navigationBar = pi2NavigationBar;
        this.recyclerviewGovernmentidIdlist = recyclerView;
        this.textviewGovernmentidInstructionsBody = textView;
        this.textviewGovernmentidInstructionsDisclaimer = textView2;
        this.textviewGovernmentidInstructionsTitle = textView3;
        this.textviewGovernmentidInstructionslistheader = textView4;
    }

    public static Pi2GovernmentidInstructionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_governmentid_instructions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.governmentid_header_bottom_barrier;
        if (((Barrier) ViewBindings.findChildViewById(inflate, R.id.governmentid_header_bottom_barrier)) != null) {
            i = R.id.governmentid_header_image_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.governmentid_header_image_container);
            if (constraintLayout != null) {
                i = R.id.imageview_governmentid_header_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.imageview_governmentid_header_image);
                if (imageView != null) {
                    i = R.id.list_divider;
                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.list_divider);
                    if (findChildViewById != null) {
                        i = R.id.navigation_bar;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                        if (pi2NavigationBar != null) {
                            i = R.id.recyclerview_governmentid_idlist;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(inflate, R.id.recyclerview_governmentid_idlist);
                            if (recyclerView != null) {
                                i = R.id.textview_governmentid_instructions_body;
                                TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_governmentid_instructions_body);
                                if (textView != null) {
                                    i = R.id.textview_governmentid_instructions_disclaimer;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_governmentid_instructions_disclaimer);
                                    if (textView2 != null) {
                                        i = R.id.textview_governmentid_instructions_title;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_governmentid_instructions_title);
                                        if (textView3 != null) {
                                            i = R.id.textview_governmentid_instructionslistheader;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_governmentid_instructionslistheader);
                                            if (textView4 != null) {
                                                return new Pi2GovernmentidInstructionsBinding((CoordinatorLayout) inflate, constraintLayout, imageView, findChildViewById, pi2NavigationBar, recyclerView, textView, textView2, textView3, textView4);
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
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
