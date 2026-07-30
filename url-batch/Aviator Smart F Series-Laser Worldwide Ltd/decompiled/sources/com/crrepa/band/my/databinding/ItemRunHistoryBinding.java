package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemRunHistoryBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llRunInfo;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvRunConsuming;

    @NonNull
    public final TextView tvRunDate;

    @NonNull
    public final TextView tvRunDistance;

    @NonNull
    public final TextView tvRunSpeed;

    private ItemRunHistoryBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.llRunInfo = linearLayout;
        this.tvRunConsuming = textView;
        this.tvRunDate = textView2;
        this.tvRunDistance = textView3;
        this.tvRunSpeed = textView4;
    }

    @NonNull
    public static ItemRunHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.ll_run_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_run_info);
        if (linearLayout != null) {
            i8 = R.id.tv_run_consuming;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_consuming);
            if (textView != null) {
                i8 = R.id.tv_run_date;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_date);
                if (textView2 != null) {
                    i8 = R.id.tv_run_distance;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_distance);
                    if (textView3 != null) {
                        i8 = R.id.tv_run_speed;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_speed);
                        if (textView4 != null) {
                            return new ItemRunHistoryBinding((RelativeLayout) view, linearLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemRunHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemRunHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_run_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
