package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class AppToolbarBinding implements ViewBinding {

    @NonNull
    private final Toolbar rootView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final TextView tvToolbarTitle;

    private AppToolbarBinding(@NonNull Toolbar toolbar, @NonNull Toolbar toolbar2, @NonNull TextView textView) {
        this.rootView = toolbar;
        this.toolbar = toolbar2;
        this.tvToolbarTitle = textView;
    }

    @NonNull
    public static AppToolbarBinding bind(@NonNull View view) {
        Toolbar toolbar = (Toolbar) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title);
        if (textView != null) {
            return new AppToolbarBinding(toolbar, toolbar, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_toolbar_title)));
    }

    @NonNull
    public static AppToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Toolbar getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AppToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.app_toolbar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
