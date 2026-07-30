package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentAppMarketMyAppsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    public final LinearLayout llEmpty;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final RecyclerView rvLatestApps;

    @NonNull
    public final RecyclerView rvToBeUpdateApps;

    @NonNull
    public final TextView tvLatestAppsTitle;

    @NonNull
    public final TextView tvToBeUpdateAppsTitle;

    private FragmentAppMarketMyAppsBinding(@NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = nestedScrollView;
        this.llContent = linearLayout;
        this.llEmpty = linearLayout2;
        this.rvLatestApps = recyclerView;
        this.rvToBeUpdateApps = recyclerView2;
        this.tvLatestAppsTitle = textView;
        this.tvToBeUpdateAppsTitle = textView2;
    }

    @NonNull
    public static FragmentAppMarketMyAppsBinding bind(@NonNull View view) {
        int i8 = R.id.ll_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
        if (linearLayout != null) {
            i8 = R.id.ll_empty;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty);
            if (linearLayout2 != null) {
                i8 = R.id.rv_latest_apps;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_latest_apps);
                if (recyclerView != null) {
                    i8 = R.id.rv_to_be_update_apps;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_to_be_update_apps);
                    if (recyclerView2 != null) {
                        i8 = R.id.tv_latest_apps_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_latest_apps_title);
                        if (textView != null) {
                            i8 = R.id.tv_to_be_update_apps_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_to_be_update_apps_title);
                            if (textView2 != null) {
                                return new FragmentAppMarketMyAppsBinding((NestedScrollView) view, linearLayout, linearLayout2, recyclerView, recyclerView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentAppMarketMyAppsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentAppMarketMyAppsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_app_market_my_apps, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
