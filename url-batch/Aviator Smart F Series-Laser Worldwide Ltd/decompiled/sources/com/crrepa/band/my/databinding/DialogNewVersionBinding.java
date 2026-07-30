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
public final class DialogNewVersionBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llNoReminder;

    @NonNull
    public final LinearLayout llRemindLater;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAppNameVersion;

    @NonNull
    public final TextView tvChangeLog;

    @NonNull
    public final TextView tvNoReminder;

    @NonNull
    public final TextView tvRemindLater;

    @NonNull
    public final TextView tvUpdate;

    private DialogNewVersionBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.llNoReminder = linearLayout2;
        this.llRemindLater = linearLayout3;
        this.tvAppNameVersion = textView;
        this.tvChangeLog = textView2;
        this.tvNoReminder = textView3;
        this.tvRemindLater = textView4;
        this.tvUpdate = textView5;
    }

    @NonNull
    public static DialogNewVersionBinding bind(@NonNull View view) {
        int i8 = R.id.ll_no_reminder;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_reminder);
        if (linearLayout != null) {
            i8 = R.id.ll_remind_later;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_remind_later);
            if (linearLayout2 != null) {
                i8 = R.id.tv_app_name_version;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_version);
                if (textView != null) {
                    i8 = R.id.tv_change_log;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_change_log);
                    if (textView2 != null) {
                        i8 = R.id.tv_no_reminder;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_reminder);
                        if (textView3 != null) {
                            i8 = R.id.tv_remind_later;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_remind_later);
                            if (textView4 != null) {
                                i8 = R.id.tv_update;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_update);
                                if (textView5 != null) {
                                    return new DialogNewVersionBinding((LinearLayout) view, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
    public static DialogNewVersionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogNewVersionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_new_version, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
