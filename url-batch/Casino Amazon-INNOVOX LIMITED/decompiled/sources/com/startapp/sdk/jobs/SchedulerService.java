package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.internal.hf;
import com.startapp.sdk.internal.k5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class SchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    protected ExecutorService f532a;
    private final a b = new a(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f532a = Executors.newSingleThreadExecutor(new k5("scheduler"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f532a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f532a == null) {
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
        return this.b.a(this, extras.getStringArray("extraKeyTags"), new hf(this, jobParameters), bundle);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
