package com.dancingbogo.skyrolline.commons;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.cmplay.base.util.h;
import com.cmplay.internalpush.f;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.R;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.dancingbogo.skyrolline.util.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class RollingSkyService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static int f4574a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    BroadcastReceiver f4575b = new BroadcastReceiver() { // from class: com.dancingbogo.skyrolline.commons.RollingSkyService.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            b.b("RollingSkyService", "onReceive");
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b.b("RollingSkyService", "screen unlock");
                RollingSkyService.this.a();
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private RemoteViews f4576c;

    /* renamed from: d, reason: collision with root package name */
    private NotificationManager f4577d;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("command_start_key");
            if (!TextUtils.equals("command_start_getclouddata", stringExtra)) {
                if (TextUtils.equals("report_inner_push_video_infoc", stringExtra)) {
                    String stringExtra2 = intent.getStringExtra("report_key_table_name");
                    String stringExtra3 = intent.getStringExtra("report_str_params");
                    boolean booleanExtra = intent.getBooleanExtra("report_is_force", false);
                    f.a(stringExtra2, stringExtra3, booleanExtra);
                    h.a("internal_push", "report_inner_push  strTableName:" + stringExtra2 + "  isForce:" + booleanExtra + "  strParams:" + stringExtra3);
                } else if (TextUtils.equals("command_start_report_dmc_fb_info", stringExtra)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("id", intent.getStringExtra("id"));
                    hashMap.put("name", intent.getStringExtra("name"));
                    hashMap.put("gender", intent.getStringExtra("gender"));
                    int intExtra = intent.getIntExtra("age_min", -1);
                    if (-1 != intExtra) {
                        hashMap.put("age_min", Integer.valueOf(intExtra));
                    }
                    int intExtra2 = intent.getIntExtra("age_max", -1);
                    if (-1 != intExtra2) {
                        hashMap.put("age_max", Integer.valueOf(intExtra2));
                    }
                }
            }
            if (intent.getBooleanExtra("start_level_notification_48", false)) {
                a();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public void a() {
        boolean a2 = com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).a("key_opened_v48", false);
        int a3 = com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).a("key_update_notification_show_v48", 0);
        if (a2 || a3 >= 2) {
            return;
        }
        GameApp.f4485a.getResources().getConfiguration().locale.getLanguage();
        long a4 = com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).a("key_update_time_v48", 0L);
        if (a3 == 0) {
            b.b("RollingSkyService", "showcount = 0 ");
            b();
            com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).b("key_update_notification_show_v48", 1);
            if (a4 == 0) {
                com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).b("key_update_time_v48", System.currentTimeMillis());
                return;
            }
            return;
        }
        if (a3 == 1) {
            System.currentTimeMillis();
            b.b("RollingSkyService", "showcount = 1");
            if (System.currentTimeMillis() - a4 >= f4574a * 2) {
                b();
                com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).b("key_update_notification_show_v48", 2);
            }
        }
    }

    public void b() {
        b.b("RollingSkyService", "showNewLevelNotification");
        if (this.f4577d == null) {
            this.f4577d = (NotificationManager) getSystemService("notification");
        }
        this.f4576c = new RemoteViews(getPackageName(), R.layout.rolling_sky_tag_little_remote_view);
        a(GameApp.f4485a);
        NativeUtil.getInstance().reportInfoc("rollingsky_games_notification", "style0=2&action=1", true);
    }

    private void a(Context context) {
        Notification build = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.rs_tag_notification_small_icon).setDeleteIntent(PendingIntent.getBroadcast(this, 1000, new Intent("NotificationDeletedBroadcast_Action"), 0)).build();
        build.contentView = this.f4576c;
        build.flags = 16;
        Intent intent = new Intent(context, (Class<?>) AppActivity.class);
        intent.putExtra(AppActivity.FROM_SOURCE_NOTIFICATION, true);
        intent.putExtra(AppActivity.FROM_SOURCE_NOTIFICATION_JUMP_LEVEL, 48);
        build.contentIntent = PendingIntent.getActivity(this, 0, intent, 134217728);
        this.f4577d.notify(1000, build);
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(this.f4575b, intentFilter);
    }
}
