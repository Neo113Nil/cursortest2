package com.anythink.basead.exoplayer.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class PlatformScheduler implements c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8878b = "PlatformScheduler";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8879c = "service_action";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8880d = "service_package";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8881e = "requirements";

    /* renamed from: f, reason: collision with root package name */
    private final int f8882f;

    /* renamed from: g, reason: collision with root package name */
    private final ComponentName f8883g;

    /* renamed from: h, reason: collision with root package name */
    private final JobScheduler f8884h;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            if (!new a(extras.getInt(PlatformScheduler.f8881e)).a(this)) {
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString(PlatformScheduler.f8879c);
            af.a((Context) this, new Intent(string).setPackage(extras.getString(PlatformScheduler.f8880d)));
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    private PlatformScheduler(Context context, int i) {
        this.f8882f = i;
        this.f8883g = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.f8884h = (JobScheduler) context.getSystemService("jobscheduler");
    }

    private static void b() {
    }

    private static /* synthetic */ void c() {
    }

    @Override // com.anythink.basead.exoplayer.scheduler.c
    public final boolean a(a aVar, String str, String str2) {
        int i;
        JobInfo.Builder builder = new JobInfo.Builder(this.f8882f, this.f8883g);
        int a9 = aVar.a();
        if (a9 == 0) {
            i = 0;
        } else if (a9 != 1) {
            i = 2;
            if (a9 != 2) {
                i = 3;
                if (a9 != 3) {
                    i = 4;
                    if (a9 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    if (af.f8503a < 26) {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f8503a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i = 1;
        }
        builder.setRequiredNetworkType(i);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f8879c, str2);
        persistableBundle.putString(f8880d, str);
        persistableBundle.putInt(f8881e, aVar.d());
        builder.setExtras(persistableBundle);
        return this.f8884h.schedule(builder.build()) == 1;
    }

    @Override // com.anythink.basead.exoplayer.scheduler.c
    public final boolean a() {
        this.f8884h.cancel(this.f8882f);
        return true;
    }

    private static JobInfo a(int i, ComponentName componentName, a aVar, String str, String str2) {
        int i4;
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        int a9 = aVar.a();
        if (a9 == 0) {
            i4 = 0;
        } else if (a9 != 1) {
            i4 = 2;
            if (a9 != 2) {
                i4 = 3;
                if (a9 != 3) {
                    i4 = 4;
                    if (a9 == 4) {
                        if (af.f8503a < 26) {
                            throw new UnsupportedOperationException();
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f8503a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i4 = 1;
        }
        builder.setRequiredNetworkType(i4);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f8879c, str);
        persistableBundle.putString(f8880d, str2);
        persistableBundle.putInt(f8881e, aVar.d());
        builder.setExtras(persistableBundle);
        return builder.build();
    }
}
