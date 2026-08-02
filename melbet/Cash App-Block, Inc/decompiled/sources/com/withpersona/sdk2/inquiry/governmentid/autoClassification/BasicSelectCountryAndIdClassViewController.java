package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.squareup.cash.security.views.databinding.SecurityViewPasswordEntryBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class BasicSelectCountryAndIdClassViewController implements SelectCountryAndIdClassViewController {
    public final SecurityViewPasswordEntryBinding binding;
    public final Response inputSelectBottomSheetController;

    public BasicSelectCountryAndIdClassViewController(Context context, ViewGroup viewGroup) {
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.pi2_governmentid_select_country_and_id_class, viewGroup, false);
        int i = R.id.content_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.content_view);
        if (linearLayout != null) {
            i = R.id.continue_button;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.continue_button);
            if (personaMaterialButton != null) {
                i = R.id.country_selector;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.country_selector);
                if (textInputLayout != null) {
                    i = R.id.country_selector_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.country_selector_text);
                    if (textView != null) {
                        i = R.id.id_class_selector;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.id_class_selector);
                        if (textInputLayout2 != null) {
                            i = R.id.id_class_selector_text;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.id_class_selector_text);
                            if (textView2 != null) {
                                i = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i = R.id.title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                    if (textView3 != null) {
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                        this.binding = new SecurityViewPasswordEntryBinding(coordinatorLayout, linearLayout, personaMaterialButton, textInputLayout, textView, textInputLayout2, textView2, pi2NavigationBar, textView3);
                                        coordinatorLayout.getClass();
                                        this.inputSelectBottomSheetController = new Response(coordinatorLayout);
                                        return;
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
