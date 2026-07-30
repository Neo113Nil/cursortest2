package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityCalendarEventBinding implements ViewBinding {

    @NonNull
    public final Button btnUnsyncCalendarEvent;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final RelativeLayout reminderTime;

    @NonNull
    public final ContinueArrowBinding reminderTimeArrow;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwitchButton sbtnReminder;

    @NonNull
    public final TextView tvReminderTime;

    private ActivityCalendarEventBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull RelativeLayout relativeLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull SwitchButton switchButton, @NonNull TextView textView) {
        this.rootView = coordinatorLayout;
        this.btnUnsyncCalendarEvent = button;
        this.includeTitle = bandDataAppbarBinding;
        this.reminderTime = relativeLayout;
        this.reminderTimeArrow = continueArrowBinding;
        this.sbtnReminder = switchButton;
        this.tvReminderTime = textView;
    }

    @NonNull
    public static ActivityCalendarEventBinding bind(@NonNull View view) {
        int i8 = R.id.btn_unsync_calendar_event;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_unsync_calendar_event);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.reminderTime;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.reminderTime);
                if (relativeLayout != null) {
                    i8 = R.id.reminderTime_arrow;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.reminderTime_arrow);
                    if (findChildViewById2 != null) {
                        ContinueArrowBinding bind2 = ContinueArrowBinding.bind(findChildViewById2);
                        i8 = R.id.sbtn_reminder;
                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_reminder);
                        if (switchButton != null) {
                            i8 = R.id.tv_reminderTime;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminderTime);
                            if (textView != null) {
                                return new ActivityCalendarEventBinding((CoordinatorLayout) view, button, bind, relativeLayout, bind2, switchButton, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityCalendarEventBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCalendarEventBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_calendar_event, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
