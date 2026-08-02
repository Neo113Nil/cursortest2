package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avs implements atz {
    public static final /* synthetic */ int a = 0;
    private static final String b = asq.b("SystemJobScheduler");
    private final Context c;
    private final JobScheduler d;
    private final avr e;
    private final WorkDatabase f;
    private final arv g;

    public avs(Context context, WorkDatabase workDatabase, arv arvVar) {
        JobScheduler a2 = avq.a(context);
        avr avrVar = new avr(context, arvVar.l);
        this.c = context;
        this.d = a2;
        this.e = avrVar;
        this.f = workDatabase;
        this.g = arvVar;
    }

    public static axl a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new axl(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b2 = avq.b(jobScheduler);
        if (b2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b2.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b2) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            asq.a().d(b, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.atz
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.c;
        JobScheduler jobScheduler = this.d;
        List<JobInfo> e = e(context, jobScheduler);
        if (e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : e) {
                axl a2 = a(jobInfo);
                if (a2 != null && str.equals(a2.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            asq.a();
            f(jobScheduler, intValue);
        }
        this.f.z().d(str);
    }

    @Override // defpackage.atz
    public final void c(axt... axtVarArr) {
        int intValue;
        WorkDatabase workDatabase = this.f;
        brn brnVar = new brn(workDatabase, (char[]) null);
        for (axt axtVar : axtVarArr) {
            workDatabase.m();
            try {
                axu C = workDatabase.C();
                String str = axtVar.b;
                axt c = C.c(str);
                if (c == null) {
                    asq.a().e(b, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (c.c != atb.a) {
                    asq.a().e(b, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    axl u = abf.u(axtVar);
                    axh a2 = workDatabase.z().a(u);
                    if (a2 != null) {
                        intValue = a2.c;
                    } else {
                        Object e = ((ajw) brnVar.a).e(new avc(brnVar, 3));
                        e.getClass();
                        intValue = ((Number) e).intValue();
                    }
                    if (a2 == null) {
                        workDatabase.z().c(new axh(u.a, u.b, intValue));
                    }
                    g(axtVar, intValue);
                    workDatabase.p();
                }
                workDatabase.n();
            } catch (Throwable th) {
                this.f.n();
                throw th;
            }
        }
    }

    @Override // defpackage.atz
    public final boolean d() {
        return true;
    }

    public final void g(axt axtVar, int i) {
        int i2;
        String str;
        ary aryVar = axtVar.k;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = axtVar.b;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", axtVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", axtVar.d());
        avr avrVar = this.e;
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, avrVar.a).setRequiresCharging(aryVar.c);
        boolean z = aryVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest a2 = aryVar.a();
        if (a2 != null) {
            extras.getClass();
            extras.setRequiredNetwork(a2);
        } else {
            int i3 = aryVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i2 = 2;
                        if (i4 != 2) {
                            i2 = 3;
                            if (i4 != 3) {
                                i2 = 4;
                                if (i4 != 4) {
                                    asq.a();
                                    Objects.toString(yo.e(i3));
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z) {
            extras.setBackoffCriteria(axtVar.n, axtVar.m == art.b ? 0 : 1);
        }
        long max = Math.max(axtVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!axtVar.r && avrVar.b) {
            extras.setImportantWhileForeground(true);
        }
        if (aryVar.b()) {
            for (arx arxVar : aryVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(arxVar.a, arxVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(aryVar.g);
            extras.setTriggerContentMaxDelay(aryVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(aryVar.e);
        extras.setRequiresStorageNotLow(aryVar.f);
        int i5 = axtVar.l;
        if (Build.VERSION.SDK_INT >= 31 && axtVar.r && i5 <= 0 && max <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = axtVar.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo build = extras.build();
        asq.a();
        String str3 = axtVar.d;
        try {
            if (this.d.schedule(build) == 0) {
                asq.a().e(b, "Unable to schedule work ID " + str2);
                if (axtVar.r && axtVar.z == 1) {
                    axtVar.r = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", str2);
                    asq.a();
                    g(axtVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.c;
            WorkDatabase workDatabase = this.f;
            arv arvVar = this.g;
            int i6 = avq.a;
            int size = workDatabase.C().i().size();
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler a3 = avq.a(context);
                List b2 = avq.b(a3);
                if (b2 != null) {
                    List e2 = e(context, a3);
                    int size2 = e2 != null ? b2.size() - e2.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List e3 = e(context, (JobScheduler) systemService);
                    int size3 = e3 != null ? e3.size() : 0;
                    str4 = ixc.y(ixc.K(new String[]{b2.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                List e4 = e(context, avq.a(context));
                if (e4 != null) {
                    str4 = e4.size() + " jobs from WorkManager";
                }
            }
            String str6 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + str4 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + arvVar.k + ".";
            asq.a().c(b, str6);
            IllegalStateException illegalStateException = new IllegalStateException(str6, e);
            wo woVar = arvVar.g;
            if (woVar == null) {
                throw illegalStateException;
            }
            woVar.a(illegalStateException);
        } catch (Throwable th) {
            asq a4 = asq.a();
            String str7 = b;
            Objects.toString(axtVar);
            a4.d(str7, "Unable to schedule ".concat(String.valueOf(axtVar)), th);
        }
    }
}
