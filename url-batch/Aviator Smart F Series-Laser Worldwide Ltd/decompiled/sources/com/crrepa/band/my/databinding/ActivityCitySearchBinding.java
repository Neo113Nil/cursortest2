package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityCitySearchBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llSearchView;

    @NonNull
    public final RecyclerView rcvCityList;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SearchView searchview;

    @NonNull
    public final TextView tvCancel;

    private ActivityCitySearchBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SearchView searchView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.llSearchView = linearLayout;
        this.rcvCityList = recyclerView;
        this.searchview = searchView;
        this.tvCancel = textView;
    }

    @NonNull
    public static ActivityCitySearchBinding bind(@NonNull View view) {
        int i8 = R.id.ll_search_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_search_view);
        if (linearLayout != null) {
            i8 = R.id.rcv_city_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_city_list);
            if (recyclerView != null) {
                i8 = R.id.searchview;
                SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, R.id.searchview);
                if (searchView != null) {
                    i8 = R.id.tv_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                    if (textView != null) {
                        return new ActivityCitySearchBinding((RelativeLayout) view, linearLayout, recyclerView, searchView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityCitySearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCitySearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_city_search, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
