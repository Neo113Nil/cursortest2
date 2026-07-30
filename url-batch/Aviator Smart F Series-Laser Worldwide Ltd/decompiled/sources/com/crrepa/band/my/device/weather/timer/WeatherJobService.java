package com.crrepa.band.my.device.weather.timer;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.orhanobut.logger.f;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public class WeatherJobService extends JobService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f.d("WeatherJobSchedulerService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f.d("WeatherJobSchedulerService onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        f.d("WeatherJobSchedulerService onStartCommand");
        return 2;
    }

    @Override // android.app.job.JobService
    @SuppressLint({"CheckResult"})
    public boolean onStartJob(JobParameters jobParameters) {
        f.d("WeatherJobSchedulerService onStartJob");
        f.d("WeatherJobSchedulerService sendWeatherInfo");
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            f.d("WeatherJobSchedulerService establishConnection");
            com.crrepa.band.my.ble.band.connect.a.connect();
            return false;
        }
        i4.getInstance().sendWeatherInfo(getApplicationContext());
        d.getInstance().syncTodayHeartRate();
        d.getInstance().syncTodayTemp();
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        f.d("WeatherJobSchedulerService onStopJob");
        return false;
    }
}
