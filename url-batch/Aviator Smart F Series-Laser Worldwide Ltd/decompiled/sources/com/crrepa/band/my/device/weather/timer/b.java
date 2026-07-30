package com.crrepa.band.my.device.weather.timer;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class b {
    private static final long WEATHER_FLEX_MILLIS = 300000;
    private static final int WEATHER_JOB_ID = 1;
    private static final long WEATHER_PERIOD = 3600000;

    /* renamed from: com.crrepa.band.my.device.weather.timer.b$b, reason: collision with other inner class name */
    private static class C0196b {
        private static b INSTANCE = new b();

        private C0196b() {
        }
    }

    public static b getInstance() {
        return C0196b.INSTANCE;
    }

    @RequiresApi(api = 21)
    private void schedule(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.cancel(1);
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(context.getPackageName(), WeatherJobService.class.getName()));
        if (24 <= Build.VERSION.SDK_INT) {
            builder.setPeriodic(WEATHER_PERIOD, 300000L);
        } else {
            builder.setPeriodic(WEATHER_PERIOD);
        }
        builder.setRequiredNetworkType(1);
        f.d("WeatherJobScheduler schedule: " + jobScheduler.schedule(builder.build()));
    }

    public void start(Context context) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() == null) {
            return;
        }
        schedule(context);
    }

    public void stop(Context context) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(1);
    }

    private b() {
    }
}
