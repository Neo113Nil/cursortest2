package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityStravaMainBinding implements ViewBinding {

    @NonNull
    public final Button btnConnect;

    @NonNull
    public final Button btnUnbind;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final ShadowLayout shadowConnect;

    @NonNull
    public final ShadowLayout shadowUnbind;

    @NonNull
    public final TextView tvStravaConnected;

    private ActivityStravaMainBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull Button button2, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull TextView textView) {
        this.rootView = coordinatorLayout;
        this.btnConnect = button;
        this.btnUnbind = button2;
        this.includeTitle = bandDataAppbarBinding;
        this.shadowConnect = shadowLayout;
        this.shadowUnbind = shadowLayout2;
        this.tvStravaConnected = textView;
    }

    @NonNull
    public static ActivityStravaMainBinding bind(@NonNull View view) {
        int i8 = R.id.btn_connect;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_connect);
        if (button != null) {
            i8 = R.id.btn_unbind;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_unbind);
            if (button2 != null) {
                i8 = R.id.include_title;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
                if (findChildViewById != null) {
                    BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                    i8 = R.id.shadow_connect;
                    ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_connect);
                    if (shadowLayout != null) {
                        i8 = R.id.shadow_unbind;
                        ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_unbind);
                        if (shadowLayout2 != null) {
                            i8 = R.id.tv_strava_connected;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_strava_connected);
                            if (textView != null) {
                                return new ActivityStravaMainBinding((CoordinatorLayout) view, button, button2, bind, shadowLayout, shadowLayout2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStravaMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStravaMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_strava_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
