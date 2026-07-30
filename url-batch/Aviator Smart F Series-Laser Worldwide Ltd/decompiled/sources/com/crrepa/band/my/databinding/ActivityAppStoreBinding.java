package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.webview.DWebView;

/* loaded from: classes2.dex */
public final class ActivityAppStoreBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DWebView webview;

    private ActivityAppStoreBinding(@NonNull LinearLayout linearLayout, @NonNull DWebView dWebView) {
        this.rootView = linearLayout;
        this.webview = dWebView;
    }

    @NonNull
    public static ActivityAppStoreBinding bind(@NonNull View view) {
        DWebView dWebView = (DWebView) ViewBindings.findChildViewById(view, R.id.webview);
        if (dWebView != null) {
            return new ActivityAppStoreBinding((LinearLayout) view, dWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.webview)));
    }

    @NonNull
    public static ActivityAppStoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAppStoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_app_store, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
