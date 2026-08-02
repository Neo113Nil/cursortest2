package com.withpersona.sdk2.inquiry.permissions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;

/* loaded from: classes9.dex */
public final class Pi2RequestPermissionRationaleBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final ConstraintLayout bottomSheetContent;
    public final Flow flowLayout;
    public final TextView message;
    public final PersonaMaterialButton negativeButton;
    public final PersonaMaterialButton positiveButton;
    public final CoordinatorLayout rootView;
    public final View tintScreen;
    public final TextView title;

    public Pi2RequestPermissionRationaleBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, Flow flow, TextView textView, PersonaMaterialButton personaMaterialButton, PersonaMaterialButton personaMaterialButton2, View view, TextView textView2) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = frameLayout;
        this.bottomSheetContent = constraintLayout;
        this.flowLayout = flow;
        this.message = textView;
        this.negativeButton = personaMaterialButton;
        this.positiveButton = personaMaterialButton2;
        this.tintScreen = view;
        this.title = textView2;
    }

    public static Pi2RequestPermissionRationaleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_request_permission_rationale, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet);
        if (frameLayout != null) {
            i = R.id.bottom_sheet_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet_content);
            if (constraintLayout != null) {
                i = R.id.flow_layout;
                Flow flow = (Flow) ViewBindings.findChildViewById(inflate, R.id.flow_layout);
                if (flow != null) {
                    i = R.id.message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.message);
                    if (textView != null) {
                        i = R.id.negative_button;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.negative_button);
                        if (personaMaterialButton != null) {
                            i = R.id.positive_button;
                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.positive_button);
                            if (personaMaterialButton2 != null) {
                                i = R.id.tint_screen;
                                View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.tint_screen);
                                if (findChildViewById != null) {
                                    i = R.id.title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                    if (textView2 != null) {
                                        return new Pi2RequestPermissionRationaleBinding((CoordinatorLayout) inflate, frameLayout, constraintLayout, flow, textView, personaMaterialButton, personaMaterialButton2, findChildViewById, textView2);
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
