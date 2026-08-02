package com.startapp.sdk.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class bb implements yf {

    /* renamed from: a, reason: collision with root package name */
    public final JobScheduler f6710a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f6711b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6712c;

    public bb(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            throw new IllegalStateException();
        }
        this.f6710a = jobScheduler;
        this.f6711b = new ComponentName(context, (Class<?>) cls);
        this.f6712c = p0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(de deVar, long j4) {
        JobInfo.Builder builder = new JobInfo.Builder(Math.abs(Arrays.hashCode(deVar.f6809a)), this.f6711b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", deVar.f6810b.toString());
        persistableBundle.putStringArray("extraKeyTags", deVar.f6809a);
        builder.setExtras(persistableBundle);
        JobRequest$Network jobRequest$Network = deVar.f6811c;
        if (jobRequest$Network != null) {
            builder.setRequiredNetworkType(jobRequest$Network == JobRequest$Network.UNMETERED ? 2 : jobRequest$Network == JobRequest$Network.ANY ? 1 : 0);
        }
        if (this.f6712c) {
            builder.setPersisted(true);
        }
        return this.f6710a.schedule(builder.setPeriodic(j4, JobInfo.getMinFlexMillis()).build()) == 1;
    }

    public final ArrayList a() {
        List<JobInfo> list;
        try {
            list = this.f6710a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JobInfo jobInfo : list) {
            if (this.f6711b.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(int i4) {
        ArrayList a3 = a();
        if (a3 == null) {
            return false;
        }
        try {
            int size = a3.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = a3.get(i5);
                i5++;
                if (((JobInfo) obj).getId() == i4) {
                    this.f6710a.cancel(i4);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
