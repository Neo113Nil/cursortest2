package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemNaviRoutesDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llNaviDetail;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDistance;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvRouteNumber;

    private ItemNaviRoutesDetailBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.llNaviDetail = linearLayout2;
        this.tvDistance = textView;
        this.tvDuration = textView2;
        this.tvRouteNumber = textView3;
    }

    @NonNull
    public static ItemNaviRoutesDetailBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.tv_distance;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_distance);
        if (textView != null) {
            i8 = R.id.tv_duration;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_duration);
            if (textView2 != null) {
                i8 = R.id.tv_route_number;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_route_number);
                if (textView3 != null) {
                    return new ItemNaviRoutesDetailBinding(linearLayout, linearLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemNaviRoutesDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNaviRoutesDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_navi_routes_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
