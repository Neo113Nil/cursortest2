package com.startapp.sdk.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bb implements yf {

    /* renamed from: a, reason: collision with root package name */
    public final JobScheduler f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f3604b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3605c;

    public bb(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            throw new IllegalStateException();
        }
        this.f3603a = jobScheduler;
        this.f3604b = new ComponentName(context, (Class<?>) cls);
        this.f3605c = p0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(de deVar, long j3) {
        JobInfo.Builder builder = new JobInfo.Builder(Math.abs(Arrays.hashCode(deVar.f3695a)), this.f3604b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", deVar.f3696b.toString());
        persistableBundle.putStringArray("extraKeyTags", deVar.f3695a);
        builder.setExtras(persistableBundle);
        JobRequest$Network jobRequest$Network = deVar.f3697c;
        if (jobRequest$Network != null) {
            builder.setRequiredNetworkType(jobRequest$Network == JobRequest$Network.UNMETERED ? 2 : jobRequest$Network == JobRequest$Network.ANY ? 1 : 0);
        }
        if (this.f3605c) {
            builder.setPersisted(true);
        }
        return this.f3603a.schedule(builder.setPeriodic(j3, JobInfo.getMinFlexMillis()).build()) == 1;
    }

    public final ArrayList a() {
        List<JobInfo> list;
        try {
            list = this.f3603a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JobInfo jobInfo : list) {
            if (this.f3604b.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(int i3) {
        ArrayList a3 = a();
        if (a3 == null) {
            return false;
        }
        try {
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == i3) {
                    this.f3603a.cancel(i3);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
