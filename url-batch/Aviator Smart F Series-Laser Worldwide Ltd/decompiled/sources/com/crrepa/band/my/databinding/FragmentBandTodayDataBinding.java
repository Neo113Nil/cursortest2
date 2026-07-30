package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentBandTodayDataBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvBandData;

    @NonNull
    public final SwipeRefreshLayout refreshLayout;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTodayDate;

    private FragmentBandTodayDataBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.rcvBandData = recyclerView;
        this.refreshLayout = swipeRefreshLayout;
        this.tvTodayDate = textView;
    }

    @NonNull
    public static FragmentBandTodayDataBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_band_data;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_band_data);
        if (recyclerView != null) {
            i8 = R.id.refresh_layout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.refresh_layout);
            if (swipeRefreshLayout != null) {
                i8 = R.id.tv_today_date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_today_date);
                if (textView != null) {
                    return new FragmentBandTodayDataBinding((LinearLayout) view, recyclerView, swipeRefreshLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBandTodayDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBandTodayDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_band_today_data, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
