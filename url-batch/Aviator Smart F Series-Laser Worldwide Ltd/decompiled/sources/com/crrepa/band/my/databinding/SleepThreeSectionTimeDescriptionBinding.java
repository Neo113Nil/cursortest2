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
public final class SleepThreeSectionTimeDescriptionBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sleepTimeDistributeView;

    @NonNull
    public final TextView tvAwakeHour;

    @NonNull
    public final TextView tvAwakeMinute;

    @NonNull
    public final TextView tvLightHour;

    @NonNull
    public final TextView tvLightMinute;

    @NonNull
    public final TextView tvRestfulHour;

    @NonNull
    public final TextView tvRestfulMinute;

    private SleepThreeSectionTimeDescriptionBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.sleepTimeDistributeView = linearLayout2;
        this.tvAwakeHour = textView;
        this.tvAwakeMinute = textView2;
        this.tvLightHour = textView3;
        this.tvLightMinute = textView4;
        this.tvRestfulHour = textView5;
        this.tvRestfulMinute = textView6;
    }

    @NonNull
    public static SleepThreeSectionTimeDescriptionBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.tv_awake_hour;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_awake_hour);
        if (textView != null) {
            i8 = R.id.tv_awake_minute;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_awake_minute);
            if (textView2 != null) {
                i8 = R.id.tv_light_hour;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_light_hour);
                if (textView3 != null) {
                    i8 = R.id.tv_light_minute;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_light_minute);
                    if (textView4 != null) {
                        i8 = R.id.tv_restful_hour;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_restful_hour);
                        if (textView5 != null) {
                            i8 = R.id.tv_restful_minute;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_restful_minute);
                            if (textView6 != null) {
                                return new SleepThreeSectionTimeDescriptionBinding(linearLayout, linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SleepThreeSectionTimeDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepThreeSectionTimeDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_three_section_time_description, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
