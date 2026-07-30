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
public final class ItemWorldClockBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCity;

    @NonNull
    public final TextView tvTime;

    @NonNull
    public final TextView tvTimeZone;

    private ItemWorldClockBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.tvCity = textView;
        this.tvTime = textView2;
        this.tvTimeZone = textView3;
    }

    @NonNull
    public static ItemWorldClockBinding bind(@NonNull View view) {
        int i8 = R.id.tv_city;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_city);
        if (textView != null) {
            i8 = R.id.tv_time;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
            if (textView2 != null) {
                i8 = R.id.tv_time_zone;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_zone);
                if (textView3 != null) {
                    return new ItemWorldClockBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemWorldClockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWorldClockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_world_clock, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
