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
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ItemBandAlarmBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout rlTime;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SwitchButton sbtnAlarm;

    @NonNull
    public final TextView tvAlarmRepeat;

    @NonNull
    public final TextView tvAlarmTime;

    @NonNull
    public final TextView tvTimeNoon;

    private ItemBandAlarmBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SwitchButton switchButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.rlTime = relativeLayout2;
        this.sbtnAlarm = switchButton;
        this.tvAlarmRepeat = textView;
        this.tvAlarmTime = textView2;
        this.tvTimeNoon = textView3;
    }

    @NonNull
    public static ItemBandAlarmBinding bind(@NonNull View view) {
        int i8 = R.id.rl_time;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_time);
        if (relativeLayout != null) {
            i8 = R.id.sbtn_alarm;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_alarm);
            if (switchButton != null) {
                i8 = R.id.tv_alarm_repeat;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_alarm_repeat);
                if (textView != null) {
                    i8 = R.id.tv_alarm_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_alarm_time);
                    if (textView2 != null) {
                        i8 = R.id.tv_time_noon;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_noon);
                        if (textView3 != null) {
                            return new ItemBandAlarmBinding((RelativeLayout) view, relativeLayout, switchButton, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandAlarmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandAlarmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_alarm, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
