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
public final class ItemNetCitySearchBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCityAfterName;

    @NonNull
    public final TextView tvCitySearchName;

    private ItemNetCitySearchBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.tvCityAfterName = textView;
        this.tvCitySearchName = textView2;
    }

    @NonNull
    public static ItemNetCitySearchBinding bind(@NonNull View view) {
        int i8 = R.id.tv_city_after_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_city_after_name);
        if (textView != null) {
            i8 = R.id.tv_city_search_name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_city_search_name);
            if (textView2 != null) {
                return new ItemNetCitySearchBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemNetCitySearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNetCitySearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_net_city_search, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
