package m1;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.device.camera.GoogleCameraActivity;
import com.crrepa.band.my.device.cricket.CricketActivity;
import com.crrepa.band.my.device.pushmessage.notification.notification.e;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private static final int CAMERA_IDENTIFIER = 4;
    public static final int CHAT_GPT_IDENTIFIER = 8;
    private static final int CRICKET_GAME_IDENTIFIER = 7;
    public static final int DEFAULT_IDENTIFIER = 1;
    private static final int DOWNLOAD_IDENTIFIER = 2;
    private static final int FIND_PHONE_IDENTIFIER = 3;
    private static final int GOAL_ARCHIVED_IDENTIFIER = 5;
    public static final int GPS_TRAINING_STARTING_IDENTIFIER = 6;
    public static final int WATER_IDENTIFIER = 16;
    private static final int WATER_REMINDER_IDENTIFIER = 9;

    private static Notification buildNotification(Context context, String str, int i8, boolean z7) {
        return e.with(context).load(2).title(context.getString(R.string.app_name)).message(str).smallIcon(R.mipmap.ic_notification).flags(4).identifier(i8).autoCancel(z7).ongoing(true).simple().build();
    }

    public static void hideChatNotification(Context context) {
        e.with(context).cancel(8);
    }

    public static void hideDownloadFileNotification(Context context) {
        e.with(context).cancel(2);
    }

    public static void hideFindPhoneNotidication(Context context) {
        e.with(context).cancel(3);
    }

    public static void hideGPSNotification(Context context) {
        e.with(context).cancel(6);
    }

    public static void hideGoalArchivedNotification(Context context) {
        e.with(context).cancel(5);
    }

    public static void hideStepsNotification(Context context) {
        e.with(context).cancel(1);
    }

    public static void hideWaterNotification(Context context) {
        e.with(context).cancel(16);
    }

    public static void hideWaterReminderNotification(Context context) {
        e.with(context).cancel(9);
    }

    public static void showBluetoothDisableNotification(Context context) {
        showNotification(context, context.getString(R.string.notification_bluetooth_disable), 1);
    }

    public static void showCameraNotification(Context context) {
        e.with(context).load(5).title(R.string.app_name).message(R.string.camera_notification_message).smallIcon(R.mipmap.ic_notification).flags(-1).autoCancel(true).when(System.currentTimeMillis()).identifier(4).click(GoogleCameraActivity.class).simple().build();
    }

    public static Notification showChatNotification(Context context) {
        return showNotification(context, context.getString(R.string.da_gpt_running_hint), 8);
    }

    public static void showCricketGameNotification(Context context, int i8, String str, String str2) {
        e.with(context).load(5).title(str).message(str2).smallIcon(R.mipmap.ic_notification).flags(-1).identifier(i8).autoCancel(true).when(System.currentTimeMillis()).click(CricketActivity.class).simple().build();
    }

    public static void showDownloadFailNotification(Context context, String str) {
        buildNotification(context, str, 2, true);
    }

    public static void showDownloadFileProgressNotification(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showNotification(context, str, 2);
    }

    public static void showFindPhoneNotidication(Context context) {
        e.with(context).load(4).title(R.string.app_name).message(R.string.find_phone).smallIcon(R.mipmap.ic_notification).flags(-1).identifier(3).click(MainActivity.class).simple().build();
    }

    public static Notification showGPSNotification(Context context) {
        return showNotification(context, context.getString(R.string.gps_training_started_tips), 6);
    }

    public static void showGoalArchivedNotification(Context context) {
        e.with(context).load(4).title(R.string.app_name).message(R.string.training_goal_achieved).smallIcon(R.mipmap.ic_notification).flags(-1).identifier(5).simple().build();
    }

    private static Notification showNotification(Context context, String str, int i8) {
        return buildNotification(context, str, i8, false);
    }

    public static Notification showStepsNotification(Context context, int i8) {
        return showNotification(context, String.format(context.getString(R.string.current_steps), Integer.valueOf(i8), Integer.valueOf(GoalsSettingDaoProxy.getInstance().getTodayGoalSteps())), 1);
    }

    public static Notification showWaterNotification(Context context) {
        return e.with(context).load(5).title(R.string.app_name).message(context.getString(R.string.water_notification_turning_hint)).smallIcon(R.mipmap.ic_notification).flags(-1).identifier(16).autoCancel(true).when(System.currentTimeMillis()).simple().build();
    }

    public static void showWaterReminderNotification(Context context) {
        e.with(context).load(5).title(R.string.app_name).message(WaterProvider.getAppPromptTip(context)).smallIcon(R.mipmap.ic_notification).flags(-1).identifier(9).autoCancel(true).when(System.currentTimeMillis()).simple().build();
    }

    public static Notification showStepsNotification(Context context) {
        Step step = StepsDaoProxy.getInstance().getStep(new Date());
        return showStepsNotification(context, step != null ? step.getSteps().intValue() : 0);
    }
}
