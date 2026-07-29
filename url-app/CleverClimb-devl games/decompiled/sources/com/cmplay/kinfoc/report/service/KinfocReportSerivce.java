package com.cmplay.kinfoc.report.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.cmplay.kinfoc.report.e;
import com.cmplay.kinfoc.report.service.NetWorkChangeReceiver;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class KinfocReportSerivce extends Service {

    /* renamed from: c, reason: collision with root package name */
    private static long f4416c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f4417d = TimeUnit.HOURS.toMillis(6);

    /* renamed from: a, reason: collision with root package name */
    private NetWorkChangeReceiver.a f4418a = new NetWorkChangeReceiver.a() { // from class: com.cmplay.kinfoc.report.service.KinfocReportSerivce.1
        @Override // com.cmplay.kinfoc.report.service.NetWorkChangeReceiver.a
        public void a(int i) {
            if (KInfocReportManager.getInstance() != null) {
                if (i == 3 || i == 6 || i == 5 || i == 2 || i == 1) {
                    KInfocReportManager.getInstance().OnNetworkOk();
                } else {
                    KInfocReportManager.getInstance().OnNetworkGone();
                }
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private boolean f4419b = false;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    public void a() {
        f4416c = System.currentTimeMillis();
        AlarmManager alarmManager = (AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) KinfocReportSerivce.class);
        intent.putExtra("command_start_report", "start_report");
        try {
            alarmManager.cancel(PendingIntent.getService(getApplicationContext(), 1001, intent, Build.VERSION.SDK_INT <= 19 ? 134217728 : 268435456));
        } catch (Throwable unused) {
        }
        try {
            alarmManager.setRepeating(0, System.currentTimeMillis() + TapjoyConstants.TIMER_INCREMENT, 21600000L, PendingIntent.getService(getApplicationContext(), 1001, intent, 134217728));
        } catch (Throwable unused2) {
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (e.f4415a) {
            Log.d("drptsvr", "调用了：onStartCommand----isCreated=" + this.f4419b);
        }
        if (intent != null) {
            if (!this.f4419b || 0 == KInfocReportManager.getInstance().getmNativeReportMgr()) {
                this.f4419b = true;
                if (intent.getBooleanExtra("from_unity", false) || KInfocReportManager.getInstance() == null) {
                    if (e.f4415a) {
                        Log.d("drptsvr", "启动后台init----");
                    }
                    try {
                        Class.forName("com.cmplay.internalpush.f").getMethod("init", Context.class).invoke(null, this);
                        if (e.f4415a) {
                            Log.d("drptsvr", "反射的形式调用CMPlaySDK.init() 服务进程初始化");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (e.f4415a) {
                            Log.d("drptsvr", "反射的形式调用CMPlaySDK.init() 始化失败 ！！！");
                        }
                        e.a(this, intent.getStringExtra("channel"), intent.getStringExtra("childChannel"), intent.getStringExtra("fmtPath"), intent.getStringExtra("inner_fmtPath"), intent.getIntExtra("nCommonID", 0), intent.getIntExtra("inner_nCommonID", 0), intent.getIntExtra("nMyID", 0), intent.getIntExtra("inner_nMyID", 0), intent.getStringExtra("rptUrl"), intent.getStringExtra("inner_rptUrl"));
                    }
                }
                if (e.f4415a) {
                    Log.d("drptsvr", "CreateReportService-----");
                }
                if (KInfocReportManager.getInstance() != null) {
                    KInfocReportManager.getInstance().CreateReportService();
                }
                NetWorkChangeReceiver.a(this.f4418a);
            }
            if (TextUtils.equals(intent.getStringExtra("command_start_report"), "start_report") && System.currentTimeMillis() - f4416c >= 5000) {
                c();
            }
            a(intent);
        }
        return 1;
    }

    private void c() {
        if (KInfocReportManager.getInstance() != null) {
            if (System.currentTimeMillis() - b() < f4417d) {
                return;
            }
            a(System.currentTimeMillis());
            KInfocReportManager.getInstance().ReportBackgroundActive();
        }
    }

    private void a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
        }
        switch (extras.getInt("extra_type")) {
            case 2:
                KInfocReportManager.getInstance().reportGameStop(extras.getLong("time"));
                break;
            case 3:
                KInfocReportManager.getInstance().OnCacheRefresh(extras.getString("table"));
                break;
            case 4:
                String string = extras.getString("channel");
                String string2 = extras.getString("appsflyerDeviceId");
                String string3 = extras.getString("adId");
                KInfocReportManager.getInstance();
                KInfocReportManager.notifyedUpdateChannel(string, string2, string3);
                break;
            case 5:
                String string4 = extras.getString("tableName");
                String string5 = extras.getString("data");
                KInfocReportManager.getInstance();
                KInfocReportManager.reportData(string4, string5);
                break;
            case 6:
                a();
                break;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        NetWorkChangeReceiver.b(this.f4418a);
        super.onDestroy();
    }

    public long b() {
        SharedPreferences sharedPreferences = getSharedPreferences("com.cmplay.kinfoc.svr", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("svr_rpt_time", 0L);
        }
        return 0L;
    }

    public void a(long j) {
        SharedPreferences sharedPreferences = getSharedPreferences("com.cmplay.kinfoc.svr", 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("svr_rpt_time", j);
            a(edit);
        }
    }

    private void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
