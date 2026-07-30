package com.crrepa.band.my.device.calendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityCalendarEventBinding;
import com.crrepa.band.my.device.calendar.model.BandCalendarEventRemindDetailEvent;
import com.crrepa.band.my.health.widgets.dialog.c;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class CalendarEventActivity extends BaseVBActivity<ActivityCalendarEventBinding> {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void deleteCalendarFromWatch() {
        com.crrepa.band.my.device.calendar.utils.a.getInstance().clearCalendarEvent();
        BandCalendarEventProvider.close();
        finish();
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) CalendarEventActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initOnClickListener$1(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        int eventTimeOfPosition = BandCalendarEventProvider.getEventTimeOfPosition(i8);
        BandCalendarEventProvider.saveEventTime(eventTimeOfPosition);
        i4.getInstance().sendCalendarEventReminderTime(true, eventTimeOfPosition);
        setReminderTime(eventTimeOfPosition);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        int eventTime = BandCalendarEventProvider.getEventTime();
        List<String> eventTimeList = BandCalendarEventProvider.getEventTimeList(this);
        new MaterialDialog.e(this).title(R.string.calendar_remind_time).items(eventTimeList).itemsCallbackSingleChoice(BandCalendarEventProvider.getEventTimePosition(eventTime), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.calendar.b
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initOnClickListener$1;
                lambda$initOnClickListener$1 = CalendarEventActivity.this.lambda$initOnClickListener$1(materialDialog, view2, i8, charSequence);
                return lambda$initOnClickListener$1;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$3(View view) {
        com.crrepa.band.my.health.widgets.dialog.c cVar = new com.crrepa.band.my.health.widgets.dialog.c(this);
        cVar.setOnDoneClickListener(new c.a() { // from class: com.crrepa.band.my.device.calendar.c
            @Override // com.crrepa.band.my.health.widgets.dialog.c.a
            public final void onClick() {
                CalendarEventActivity.this.deleteCalendarFromWatch();
            }
        });
        cVar.show();
        cVar.setTitle(getString(R.string.unsync_calendar_dialog_title));
        cVar.setContent(getString(R.string.unsync_calendar_dialog_content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setReminderStateListener$4(CompoundButton compoundButton, boolean z7) {
        setEventReminderState(z7);
        BandCalendarEventProvider.saveReminderState(z7);
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityCalendarEventBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityCalendarEventBinding) vb).includeTitle.tvTitle, ((ActivityCalendarEventBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityCalendarEventBinding) this.binding).includeTitle.toolbar);
    }

    private void setCalendarEventDetail() {
        setEventReminderState(BandCalendarEventProvider.getReminderState());
        setReminderTime(BandCalendarEventProvider.getEventTime());
        i4.getInstance().queryCalendarEventReminderTime();
    }

    private void setEventReminderState(boolean z7) {
        ((ActivityCalendarEventBinding) this.binding).sbtnReminder.setCheckedNoEvent(z7);
        if (z7) {
            ((ActivityCalendarEventBinding) this.binding).reminderTime.setVisibility(0);
        } else {
            ((ActivityCalendarEventBinding) this.binding).reminderTime.setVisibility(8);
        }
    }

    private void setReminderStateListener() {
        ((ActivityCalendarEventBinding) this.binding).sbtnReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.calendar.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                CalendarEventActivity.this.lambda$setReminderStateListener$4(compoundButton, z7);
            }
        });
    }

    private void setReminderTime(int i8) {
        if (i8 == 0) {
            ((ActivityCalendarEventBinding) this.binding).tvReminderTime.setText(R.string.calendar_at_the_beginning);
        } else {
            ((ActivityCalendarEventBinding) this.binding).tvReminderTime.setText(getString(R.string.calendar_minutes_in_advance, Integer.valueOf(i8)));
        }
    }

    private void setTitle() {
        ((ActivityCalendarEventBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityCalendarEventBinding) this.binding).includeTitle.tvTitle.setText(R.string.calendar_alarm_title);
        ((ActivityCalendarEventBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.calendar_alarm_title);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        setActionBar();
        setTitle();
        setCalendarEventDetail();
        setReminderStateListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityCalendarEventBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.calendar.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarEventActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityCalendarEventBinding) this.binding).reminderTime.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.calendar.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarEventActivity.this.lambda$initOnClickListener$2(view);
            }
        });
        ((ActivityCalendarEventBinding) this.binding).btnUnsyncCalendarEvent.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.calendar.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarEventActivity.this.lambda$initOnClickListener$3(view);
            }
        });
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onCalendarEventRemindDetailEvent(BandCalendarEventRemindDetailEvent bandCalendarEventRemindDetailEvent) {
        setEventReminderState(bandCalendarEventRemindDetailEvent.isEnable());
        setReminderTime(bandCalendarEventRemindDetailEvent.getMinutes());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        i4.getInstance().sendCalendarEventReminderTime(BandCalendarEventProvider.getReminderState(), BandCalendarEventProvider.getEventTime());
    }
}
