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

/* loaded from: classes2.dex */
public final class ActivityGoogleFitBinding implements ViewBinding {

    @NonNull
    public final Button btnConnect;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvGoogleFitConnected;

    private ActivityGoogleFitBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView) {
        this.rootView = coordinatorLayout;
        this.btnConnect = button;
        this.includeTitle = bandDataAppbarBinding;
        this.tvGoogleFitConnected = textView;
    }

    @NonNull
    public static ActivityGoogleFitBinding bind(@NonNull View view) {
        int i8 = R.id.btn_connect;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_connect);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_google_fit_connected);
                if (textView != null) {
                    return new ActivityGoogleFitBinding((CoordinatorLayout) view, button, bind, textView);
                }
                i8 = R.id.tv_google_fit_connected;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityGoogleFitBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGoogleFitBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_google_fit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
