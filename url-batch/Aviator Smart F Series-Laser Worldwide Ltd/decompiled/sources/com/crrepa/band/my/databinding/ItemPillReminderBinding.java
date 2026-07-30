package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;
import com.moyoung.dafit.module.common.widgets.NoTouchRecyclerView;

/* loaded from: classes2.dex */
public final class ItemPillReminderBinding implements ViewBinding {

    @NonNull
    public final NoTouchRecyclerView rcvReminderTimeList;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final SwitchButton sbtnPillReminderState;

    @NonNull
    public final TextView tvPillName;

    @NonNull
    public final TextView tvReminderRepeat;

    @NonNull
    public final TextView tvReminderTimes;

    private ItemPillReminderBinding(@NonNull CardView cardView, @NonNull NoTouchRecyclerView noTouchRecyclerView, @NonNull SwitchButton switchButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = cardView;
        this.rcvReminderTimeList = noTouchRecyclerView;
        this.sbtnPillReminderState = switchButton;
        this.tvPillName = textView;
        this.tvReminderRepeat = textView2;
        this.tvReminderTimes = textView3;
    }

    @NonNull
    public static ItemPillReminderBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_reminder_time_list;
        NoTouchRecyclerView noTouchRecyclerView = (NoTouchRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_reminder_time_list);
        if (noTouchRecyclerView != null) {
            i8 = R.id.sbtn_pill_reminder_state;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_pill_reminder_state);
            if (switchButton != null) {
                i8 = R.id.tv_pill_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pill_name);
                if (textView != null) {
                    i8 = R.id.tv_reminder_repeat;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_repeat);
                    if (textView2 != null) {
                        i8 = R.id.tv_reminder_times;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_times);
                        if (textView3 != null) {
                            return new ItemPillReminderBinding((CardView) view, noTouchRecyclerView, switchButton, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemPillReminderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemPillReminderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_pill_reminder, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
