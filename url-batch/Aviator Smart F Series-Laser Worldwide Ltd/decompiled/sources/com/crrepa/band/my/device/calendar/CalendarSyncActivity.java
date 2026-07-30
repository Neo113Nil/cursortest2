package com.crrepa.band.my.device.calendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivitySyncCalendarBinding;
import com.crrepa.band.my.device.calendar.model.CalendarPermissionChangeEvent;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class CalendarSyncActivity extends BaseRequestPermissionActivity<ActivitySyncCalendarBinding> {

    class a implements PermissionDescriptionDialog.b {
        a() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("日历", true);
            k.syncCalendarWithPermissionCheck(CalendarSyncActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("日历", false);
            CalendarSyncActivity.this.finish();
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) CalendarSyncActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        k.syncCalendarWithPermissionCheck(this);
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivitySyncCalendarBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivitySyncCalendarBinding) vb).includeTitle.tvTitle, ((ActivitySyncCalendarBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivitySyncCalendarBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivitySyncCalendarBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivitySyncCalendarBinding) this.binding).includeTitle.tvTitle.setText(R.string.sync_calendar_title);
        ((ActivitySyncCalendarBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.sync_calendar_title);
    }

    private void showCalendarPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_calendar).setTitle(R.string.permission_calendar_title).setContent(R.string.permission_calendar_content).setOnClickListener(new a()).build(this).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setActionBar();
        setTitle();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivitySyncCalendarBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.calendar.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarSyncActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivitySyncCalendarBinding) this.binding).btnSyncCalendarEvent.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.calendar.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarSyncActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    void onNeverAskAgain() {
        c0.jumpAppDetailsSetting(this);
    }

    void onPermissionDenied() {
        com.crrepa.band.my.home.guidance.c.systemPermission("日历", false);
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        k.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "日程提醒页");
    }

    @SuppressLint({"IntentReset", "CheckResult"})
    void syncCalendar() {
        com.crrepa.band.my.home.guidance.c.systemPermission("日历", true);
        com.crrepa.band.my.device.calendar.utils.a.getInstance().sendAllCalendarEvent(this);
        org.greenrobot.eventbus.c.getDefault().post(new CalendarPermissionChangeEvent());
        BandCalendarEventProvider.saveReminderState(false);
        startActivity(CalendarEventActivity.getCallingIntent(this));
        finish();
    }
}
