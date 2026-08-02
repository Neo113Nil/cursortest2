package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2NavigationBarBinding implements ViewBinding {
    public final /* synthetic */ int $r8$classId;
    public final View navBarBackButton;
    public final View navBarCancelButton;
    public final View navBarHelpButton;
    public final ViewGroup rootView;

    public /* synthetic */ Pi2NavigationBarBinding(ViewGroup viewGroup, View view, View view2, View view3, int i) {
        this.$r8$classId = i;
        this.rootView = viewGroup;
        this.navBarBackButton = view;
        this.navBarCancelButton = view2;
        this.navBarHelpButton = view3;
    }

    public static Pi2NavigationBarBinding inflate(LayoutInflater layoutInflater, Pi2NavigationBar pi2NavigationBar) {
        layoutInflater.inflate(R.layout.pi2_navigation_bar, pi2NavigationBar);
        int i = R.id.nav_bar_back_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(pi2NavigationBar, R.id.nav_bar_back_button);
        if (imageView != null) {
            i = R.id.nav_bar_cancel_button;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(pi2NavigationBar, R.id.nav_bar_cancel_button);
            if (imageView2 != null) {
                i = R.id.nav_bar_help_button;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(pi2NavigationBar, R.id.nav_bar_help_button);
                if (imageView3 != null) {
                    return new Pi2NavigationBarBinding(pi2NavigationBar, imageView, imageView2, imageView3, 0);
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(pi2NavigationBar.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        int i = this.$r8$classId;
        ViewGroup viewGroup = this.rootView;
        switch (i) {
            case 0:
                return (Pi2NavigationBar) viewGroup;
            case 1:
                return (ScrollView) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }
}
