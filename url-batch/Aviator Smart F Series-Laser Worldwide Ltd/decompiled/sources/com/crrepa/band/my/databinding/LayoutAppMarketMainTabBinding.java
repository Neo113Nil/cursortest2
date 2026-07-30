package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutAppMarketMainTabBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDot;

    @NonNull
    public final TextView tvTitle;

    private LayoutAppMarketMainTabBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.tvDot = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static LayoutAppMarketMainTabBinding bind(@NonNull View view) {
        int i8 = R.id.tv_dot;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dot);
        if (textView != null) {
            i8 = R.id.tv_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
            if (textView2 != null) {
                return new LayoutAppMarketMainTabBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutAppMarketMainTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutAppMarketMainTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_app_market_main_tab, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
