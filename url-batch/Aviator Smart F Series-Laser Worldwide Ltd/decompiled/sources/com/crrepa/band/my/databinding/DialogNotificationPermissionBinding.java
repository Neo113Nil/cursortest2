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
public final class DialogNotificationPermissionBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCalenderGoSetting;

    @NonNull
    public final TextView tvCalenderRefuse;

    @NonNull
    public final TextView tvCalenderTip;

    @NonNull
    public final TextView tvCalenderTitle;

    private DialogNotificationPermissionBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.tvCalenderGoSetting = textView;
        this.tvCalenderRefuse = textView2;
        this.tvCalenderTip = textView3;
        this.tvCalenderTitle = textView4;
    }

    @NonNull
    public static DialogNotificationPermissionBinding bind(@NonNull View view) {
        int i8 = R.id.tv_calender_go_setting;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calender_go_setting);
        if (textView != null) {
            i8 = R.id.tv_calender_refuse;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calender_refuse);
            if (textView2 != null) {
                i8 = R.id.tv_calender_tip;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calender_tip);
                if (textView3 != null) {
                    i8 = R.id.tv_calender_title;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calender_title);
                    if (textView4 != null) {
                        return new DialogNotificationPermissionBinding((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogNotificationPermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogNotificationPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_notification_permission, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
