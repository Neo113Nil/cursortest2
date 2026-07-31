package ru.rustore.sdk.metrics.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import n2.EnumC3267b;
import ru.rustore.sdk.metrics.BuildConfig;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43768a;

    /* renamed from: b, reason: collision with root package name */
    public final d f43769b;

    public u0(Context context, d getJobRepeatIntervalUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getJobRepeatIntervalUseCase, "getJobRepeatIntervalUseCase");
        this.f43768a = context;
        this.f43769b = getJobRepeatIntervalUseCase;
    }

    public final void a() {
        Object systemService = this.f43768a.getSystemService((Class<Object>) JobScheduler.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService(JobScheduler::class.java)");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        Intrinsics.checkNotNullExpressionValue(allPendingJobs, "jobScheduler.allPendingJobs");
        if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
            Iterator<T> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == 88123556) {
                    return;
                }
            }
        }
        ComponentName componentName = new ComponentName(this.f43768a, (Class<?>) SendMetricsEventJobService.class);
        List<JobInfo> allPendingJobs2 = jobScheduler.getAllPendingJobs();
        Intrinsics.checkNotNullExpressionValue(allPendingJobs2, "jobScheduler.allPendingJobs");
        int i4 = 0;
        if (!(allPendingJobs2 instanceof Collection) || !allPendingJobs2.isEmpty()) {
            Iterator<T> it2 = allPendingJobs2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((JobInfo) it2.next()).getService(), componentName) && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        JobInfo.Builder builder = new JobInfo.Builder(88123556, componentName);
        this.f43769b.f43697a.f43704a.getClass();
        a.C0233a c0233a = kotlin.time.a.f41281c;
        JobInfo.Builder persisted = builder.setPeriodic(kotlin.time.a.n(kotlin.time.b.s(Integer.parseInt(BuildConfig.JOB_REPEAT_INTERVAL_MINUTES), EnumC3267b.f41383g))).setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("pending_jobs_count", i4);
        jobScheduler.schedule(persisted.setExtras(persistableBundle).build());
    }
}
