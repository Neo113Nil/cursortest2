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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ia implements gf {

    /* renamed from: a, reason: collision with root package name */
    public final JobScheduler f274a;
    public final ComponentName b;
    public final boolean c;

    public ia(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            throw new IllegalStateException();
        }
        this.f274a = jobScheduler;
        this.b = new ComponentName(context, (Class<?>) cls);
        this.c = m0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
    }

    @Override // com.startapp.sdk.internal.gf
    public final boolean a(pd pdVar, long j) {
        JobInfo.Builder builder = new JobInfo.Builder(Math.abs(Arrays.hashCode(pdVar.f380a)), this.b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", pdVar.b.toString());
        persistableBundle.putStringArray("extraKeyTags", pdVar.f380a);
        builder.setExtras(persistableBundle);
        JobRequest$Network jobRequest$Network = pdVar.c;
        if (jobRequest$Network != null) {
            builder.setRequiredNetworkType(jobRequest$Network == JobRequest$Network.UNMETERED ? 2 : jobRequest$Network == JobRequest$Network.ANY ? 1 : 0);
        }
        if (this.c) {
            builder.setPersisted(true);
        }
        return this.f274a.schedule(builder.setPeriodic(j, JobInfo.getMinFlexMillis()).build()) == 1;
    }

    public final ArrayList a() {
        List<JobInfo> list;
        try {
            list = this.f274a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JobInfo jobInfo : list) {
            if (this.b.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.startapp.sdk.internal.gf
    public final boolean a(int i) {
        ArrayList a2 = a();
        if (a2 == null) {
            return false;
        }
        try {
            int size = a2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = a2.get(i2);
                i2++;
                if (((JobInfo) obj).getId() == i) {
                    this.f274a.cancel(i);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
