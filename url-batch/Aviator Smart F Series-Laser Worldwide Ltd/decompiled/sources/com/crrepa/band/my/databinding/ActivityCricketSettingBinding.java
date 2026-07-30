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
public final class ActivityCricketSettingBinding implements ViewBinding {

    @NonNull
    public final ContinueArrowBinding displayStartTime;

    @NonNull
    public final BandHistoryTitleBinding includedTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnScoreReminder;

    @NonNull
    public final RelativeLayout startReminder;

    @NonNull
    public final TextView tvStartTime;

    private ActivityCricketSettingBinding(@NonNull LinearLayout linearLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull BandHistoryTitleBinding bandHistoryTitleBinding, @NonNull SwitchButton switchButton, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.displayStartTime = continueArrowBinding;
        this.includedTitle = bandHistoryTitleBinding;
        this.sbtnScoreReminder = switchButton;
        this.startReminder = relativeLayout;
        this.tvStartTime = textView;
    }

    @NonNull
    public static ActivityCricketSettingBinding bind(@NonNull View view) {
        int i8 = R.id.display_start_time;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.display_start_time);
        if (findChildViewById != null) {
            ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
            i8 = R.id.included_title;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.included_title);
            if (findChildViewById2 != null) {
                BandHistoryTitleBinding bind2 = BandHistoryTitleBinding.bind(findChildViewById2);
                i8 = R.id.sbtn_score_reminder;
                SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_score_reminder);
                if (switchButton != null) {
                    i8 = R.id.start_reminder;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.start_reminder);
                    if (relativeLayout != null) {
                        i8 = R.id.tv_start_time;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_time);
                        if (textView != null) {
                            return new ActivityCricketSettingBinding((LinearLayout) view, bind, bind2, switchButton, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityCricketSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCricketSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_cricket_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
