package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.view.SwitchButton;

/* loaded from: classes2.dex */
public final class ItemMuslimPrayReminderBinding implements ViewBinding {

    @NonNull
    public final ImageView ivPrayTime;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SwitchButton sbtnPrayerReminder;

    @NonNull
    public final TextView tvPrayName;

    private ItemMuslimPrayReminderBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull SwitchButton switchButton, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivPrayTime = imageView;
        this.sbtnPrayerReminder = switchButton;
        this.tvPrayName = textView;
    }

    @NonNull
    public static ItemMuslimPrayReminderBinding bind(@NonNull View view) {
        int i8 = R.id.iv_pray_time;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_pray_time);
        if (imageView != null) {
            i8 = R.id.sbtn_prayer_reminder;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_prayer_reminder);
            if (switchButton != null) {
                i8 = R.id.tv_pray_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pray_name);
                if (textView != null) {
                    return new ItemMuslimPrayReminderBinding((RelativeLayout) view, imageView, switchButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMuslimPrayReminderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMuslimPrayReminderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_muslim_pray_reminder, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
