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
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ViewCityWeatherBinding implements ViewBinding {

    @NonNull
    public final ContinueArrowBinding arrowLocation;

    @NonNull
    public final ContinueArrowBinding arrowWeatherTempSystem;

    @NonNull
    public final LinearLayout llWeather;

    @NonNull
    public final RelativeLayout rlWeatherLocation;

    @NonNull
    public final RelativeLayout rlWeatherTempSystem;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnWeather;

    @NonNull
    public final TextView tvLocation;

    @NonNull
    public final TextView tvWeatherTempSystem;

    private ViewCityWeatherBinding(@NonNull LinearLayout linearLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull ContinueArrowBinding continueArrowBinding2, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SwitchButton switchButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.arrowLocation = continueArrowBinding;
        this.arrowWeatherTempSystem = continueArrowBinding2;
        this.llWeather = linearLayout2;
        this.rlWeatherLocation = relativeLayout;
        this.rlWeatherTempSystem = relativeLayout2;
        this.sbtnWeather = switchButton;
        this.tvLocation = textView;
        this.tvWeatherTempSystem = textView2;
    }

    @NonNull
    public static ViewCityWeatherBinding bind(@NonNull View view) {
        int i8 = R.id.arrow_location;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.arrow_location);
        if (findChildViewById != null) {
            ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
            i8 = R.id.arrow_weather_temp_system;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.arrow_weather_temp_system);
            if (findChildViewById2 != null) {
                ContinueArrowBinding bind2 = ContinueArrowBinding.bind(findChildViewById2);
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = R.id.rl_weather_location;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_weather_location);
                if (relativeLayout != null) {
                    i8 = R.id.rl_weather_temp_system;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_weather_temp_system);
                    if (relativeLayout2 != null) {
                        i8 = R.id.sbtn_weather;
                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_weather);
                        if (switchButton != null) {
                            i8 = R.id.tv_location;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_location);
                            if (textView != null) {
                                i8 = R.id.tv_weather_temp_system;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weather_temp_system);
                                if (textView2 != null) {
                                    return new ViewCityWeatherBinding(linearLayout, bind, bind2, linearLayout, relativeLayout, relativeLayout2, switchButton, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewCityWeatherBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewCityWeatherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_city_weather, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
