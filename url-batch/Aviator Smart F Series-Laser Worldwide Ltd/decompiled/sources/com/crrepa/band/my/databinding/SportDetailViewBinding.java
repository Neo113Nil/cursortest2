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
public final class SportDetailViewBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvActivityCalorie;

    @NonNull
    public final TextView tvActivityDistance;

    @NonNull
    public final TextView tvActivityTime;

    private SportDetailViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.tvActivityCalorie = textView;
        this.tvActivityDistance = textView2;
        this.tvActivityTime = textView3;
    }

    @NonNull
    public static SportDetailViewBinding bind(@NonNull View view) {
        int i8 = R.id.tv_activity_calorie;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_activity_calorie);
        if (textView != null) {
            i8 = R.id.tv_activity_distance;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_activity_distance);
            if (textView2 != null) {
                i8 = R.id.tv_activity_time;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_activity_time);
                if (textView3 != null) {
                    return new SportDetailViewBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SportDetailViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SportDetailViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sport_detail_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
