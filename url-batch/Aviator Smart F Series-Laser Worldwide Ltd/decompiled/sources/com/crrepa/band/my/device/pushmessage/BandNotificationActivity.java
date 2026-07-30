package com.crrepa.band.my.device.pushmessage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.common.receiver.PhoneStateReceiver;
import com.crrepa.band.my.databinding.ActivityBandNotificationBinding;
import com.crrepa.band.my.device.pushmessage.BandNotificationAdapter;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.MessageModel;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.h0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.w;
import com.moyoung.instructions.utils.InstructionsType;
import java.util.List;

/* loaded from: classes2.dex */
public class BandNotificationActivity extends BaseRequestPermissionActivity<ActivityBandNotificationBinding> implements com.crrepa.band.my.device.pushmessage.c {
    private static final String BIOJUET = "BIOJUET";
    private final com.crrepa.band.my.device.pushmessage.presenter.a presenter = new com.crrepa.band.my.device.pushmessage.presenter.a();
    private final BandNotificationAdapter notificationAdapter = new BandNotificationAdapter();
    private boolean showMIUISmsPermission = true;
    private boolean showMIUIDeviceInfoPermission = true;
    private boolean isOnNotificationAccessSetting = false;

    class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            BandNotificationActivity.this.startNotificationAccess(R.string.restart_notification_listener_tips);
        }
    }

    class b implements BandNotificationAdapter.b {
        b() {
        }

        @Override // com.crrepa.band.my.device.pushmessage.BandNotificationAdapter.b
        public void onCheckedChanged(int i8, int i9, boolean z7) {
            if (z7) {
                BandNotificationActivity.this.presenter.needsPermission(i9);
            }
            if (i9 == 128) {
                BandNotificationActivity.this.presenter.sendOtherMessageState(z7);
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_open", z7);
            MessageModel item = BandNotificationActivity.this.notificationAdapter.getItem(i8);
            String string = item != null ? BandNotificationActivity.this.getString(item.getName()) : "";
            com.orhanobut.logger.f.d("notificationName: " + string);
            bundle.putString("notification_name", string);
            s0.logEvent("开关_通知", bundle);
        }
    }

    class c implements PermissionDescriptionDialog.b {
        c() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通知使用权限", true);
            BandNotificationActivity.this.startNotificationAccess(R.string.notification_listener_tips);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通知使用权限", false);
            BandNotificationActivity.this.presenter.rejectNotificationAccess();
        }
    }

    class d implements PermissionDescriptionDialog.b {
        d() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("电话", true);
            com.crrepa.band.my.device.pushmessage.b.enableCallPermissionWithPermissionCheck(BandNotificationActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("电话", false);
            BandNotificationActivity.this.renderMessageState(0, false);
        }
    }

    class e implements PermissionDescriptionDialog.b {
        e() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("短信", true);
            com.crrepa.band.my.device.pushmessage.b.enableSmsNotificationWithPermissionCheck(BandNotificationActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("短信", false);
            BandNotificationActivity.this.renderMessageState(1, false);
        }
    }

    private String[] getCallPermissions() {
        return 26 <= Build.VERSION.SDK_INT ? new String[]{"android.permission.READ_CALL_LOG", "android.permission.CALL_PHONE", "android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE", "android.permission.ANSWER_PHONE_CALLS"} : new String[]{"android.permission.READ_CALL_LOG", "android.permission.CALL_PHONE", "android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"};
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) BandNotificationActivity.class);
    }

    private void initMessageList() {
        ((ActivityBandNotificationBinding) this.binding).rcvMessageList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityBandNotificationBinding) this.binding).rcvMessageList.setAdapter(this.notificationAdapter);
        this.notificationAdapter.setOnItemCheckedChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    private void setAccessibilityHint() {
        ((ActivityBandNotificationBinding) this.binding).tvAccessibilityHint.setText(h0.getBuilder(getString(R.string.message_accessibility_before)).append(getString(R.string.accessibility)).setClickSpan(new a()).append(getString(R.string.message_accessibility_after)).create());
        ((ActivityBandNotificationBinding) this.binding).tvAccessibilityHint.setMovementMethod(q1.a.getInstance());
        ((ActivityBandNotificationBinding) this.binding).tvAccessibilityHint.setFocusable(false);
        ((ActivityBandNotificationBinding) this.binding).tvAccessibilityHint.setClickable(false);
        ((ActivityBandNotificationBinding) this.binding).tvAccessibilityHint.setLongClickable(false);
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityBandNotificationBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityBandNotificationBinding) vb).includeTitle.tvTitle, ((ActivityBandNotificationBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityBandNotificationBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivityBandNotificationBinding) this.binding).includeTitle.tvTitle.setText(R.string.notification);
        ((ActivityBandNotificationBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.notification);
        ((ActivityBandNotificationBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    private void showCallPermissionDialog() {
        PermissionDescriptionDialog.builderMultiplePermission().setPermissions(getCallPermissions()).setIcon(R$drawable.popup_phone).setTitle(R.string.permission_notification_call_title).setContent(R.string.permission_notification_call_content).setOnClickListener(new d()).build(this).show();
    }

    private void showNotificationAccessPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_notification).setTitle(R.string.permission_notification_title).setContent(R.string.permission_notification_content).setOnClickListener(new c()).build(this).show();
    }

    private void showSmsPermissionDialog() {
        PermissionDescriptionDialog.builderMultiplePermission().setPermissions("android.permission.READ_SMS", "android.permission.READ_CONTACTS").setIcon(R$drawable.popup_message).setTitle(R.string.permission_notification_SMS_title).setContent(R.string.permission_notification_SMS_content).setOnClickListener(new e()).build(this).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startNotificationAccess(int i8) {
        q1.b.openNotificationAccess(this);
        r0.showLong(this, String.format(getString(i8), getString(R.string.app_name)));
        this.isOnNotificationAccessSetting = true;
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void disableNotificationListenerService() {
        if (this.isOnNotificationAccessSetting) {
            com.crrepa.band.my.home.guidance.c.systemPermission("通知使用权限", false);
        }
        List<MessageModel> data = this.notificationAdapter.getData();
        for (MessageModel messageModel : data) {
            int type = messageModel.getType();
            if (type != 0 && type != 1) {
                messageModel.setEnable(false);
            }
        }
        this.notificationAdapter.setNewData(data);
    }

    void enableAnswerCallPermission() {
        com.crrepa.band.my.home.guidance.c.systemPermission("电话", true);
        if (this.showMIUIDeviceInfoPermission && com.moyoung.dafit.module.common.utils.a.isMIUI()) {
            this.showMIUIDeviceInfoPermission = false;
            w.goPermissionSettings(this);
            r0.showLong(this, getString(R.string.miui_phone_state_permission));
        }
    }

    void enableCallPermission() {
        if (26 <= Build.VERSION.SDK_INT) {
            com.orhanobut.logger.f.d("requestAnswerCallPermission");
            com.crrepa.band.my.device.pushmessage.b.enableAnswerCallPermissionWithPermissionCheck(this);
        } else {
            com.crrepa.band.my.home.guidance.c.systemPermission("电话", true);
        }
        PhoneStateReceiver.register(this);
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void enableNotificationListenerService() {
        if (this.isOnNotificationAccessSetting) {
            com.crrepa.band.my.home.guidance.c.systemPermission("通知使用权限", true);
        }
    }

    void enableSmsNotification() {
        com.crrepa.band.my.home.guidance.c.systemPermission("短信", true);
        if (this.showMIUISmsPermission && com.moyoung.dafit.module.common.utils.a.isMIUI()) {
            this.showMIUISmsPermission = false;
            w.goPermissionSettings(this);
            r0.showLong(this, getString(R.string.miui_customize_sms_permission));
        }
        f.register(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        this.presenter.setContext(this);
        setActionBar();
        setTitle();
        setAccessibilityHint();
        initMessageList();
        this.presenter.getMessageList();
        com.moyoung.instructions.c.hook(InstructionsType.NOTIFICATIONS, findViewById(R.id.tv_instruction_hint));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityBandNotificationBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.pushmessage.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandNotificationActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        super.onBackPressedSupport();
        this.presenter.saveMessageState(this.notificationAdapter.getData());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        if (iArr == null) {
            iArr = new int[0];
        }
        com.crrepa.band.my.device.pushmessage.b.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        this.isOnNotificationAccessSetting = false;
        s0.logPage(getClass(), "消息推送");
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void renderMessageList(List<MessageModel> list) {
        this.notificationAdapter.setNewData(list);
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void renderMessageState(int i8, boolean z7) {
        List<MessageModel> data = this.notificationAdapter.getData();
        int i9 = 0;
        while (true) {
            if (i9 >= data.size()) {
                i9 = -1;
                break;
            } else if (data.get(i9).getType() == i8) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            data.get(i9).setEnable(z7);
            this.notificationAdapter.notifyItemChanged(i9);
        }
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void renderNotificationListenerDialog() {
        showNotificationAccessPermissionDialog();
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void requestCallPermission() {
        if (q7.b.hasSelfPermissions(this, getCallPermissions())) {
            enableCallPermission();
        } else {
            showCallPermissionDialog();
        }
    }

    @Override // com.crrepa.band.my.device.pushmessage.c
    public void requestSMSPermission() {
        if (q7.b.hasSelfPermissions(this, "android.permission.READ_SMS", "android.permission.READ_CONTACTS")) {
            enableSmsNotification();
        } else {
            showSmsPermissionDialog();
        }
    }

    void showDeniedForAnswerCall() {
        com.crrepa.band.my.home.guidance.c.systemPermission("电话", false);
        renderMessageState(0, false);
    }

    void showDeniedForCall() {
        com.crrepa.band.my.home.guidance.c.systemPermission("电话", false);
        renderMessageState(0, false);
    }

    void showDeniedForSMS() {
        com.crrepa.band.my.home.guidance.c.systemPermission("短信", false);
        renderMessageState(1, false);
    }

    void showNeverAskForAnswerCall() {
        if (TextUtils.equals(Build.BRAND, BIOJUET)) {
            return;
        }
        renderMessageState(0, false);
        c0.jumpAppDetailsSetting(this);
    }

    void showNeverAskForCall() {
        renderMessageState(0, false);
        c0.jumpAppDetailsSetting(this);
    }

    void showNeverAskForSMS() {
        renderMessageState(1, false);
        c0.jumpAppDetailsSetting(this);
    }

    void showRationaleForAnswerCall(q7.a aVar) {
        aVar.proceed();
    }
}
