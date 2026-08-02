package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.internal.u5;
import com.startapp.sdk.internal.zf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class SchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    protected ExecutorService f4902a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4903b = new a(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f4902a = Executors.newSingleThreadExecutor(new u5("scheduler"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f4902a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f4902a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f4903b.a(this, extras.getStringArray("extraKeyTags"), new zf(this, jobParameters), bundle);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
