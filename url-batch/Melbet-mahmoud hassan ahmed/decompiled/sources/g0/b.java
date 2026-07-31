package g0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d0.j;
import d0.n;
import d0.s;
import e0.e;
import e0.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l0.g;
import l0.p;
import l0.q;
import m0.c;

/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: j, reason: collision with root package name */
    private static final String f16221j = j.f("SystemJobScheduler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f16222f;

    /* renamed from: g, reason: collision with root package name */
    private final JobScheduler f16223g;

    /* renamed from: h, reason: collision with root package name */
    private final i f16224h;

    /* renamed from: i, reason: collision with root package name */
    private final a f16225i;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f16222f = context;
        this.f16224h = iVar;
        this.f16223g = jobScheduler;
        this.f16225i = aVar;
    }

    public static void a(Context context) {
        List<JobInfo> g7;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g7 = g(context, jobScheduler)) == null || g7.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = g7.iterator();
        while (it.hasNext()) {
            c(jobScheduler, it.next().getId());
        }
    }

    private static void c(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            j.c().b(f16221j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    private static List<Integer> e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g7 = g(context, jobScheduler);
        if (g7 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g7) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            j.c().b(f16221j, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g7 = g(context, jobScheduler);
        List<String> a7 = iVar.o().y().a();
        boolean z6 = false;
        HashSet hashSet = new HashSet(g7 != null ? g7.size() : 0);
        if (g7 != null && !g7.isEmpty()) {
            for (JobInfo jobInfo : g7) {
                String h7 = h(jobInfo);
                if (TextUtils.isEmpty(h7)) {
                    c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h7);
                }
            }
        }
        Iterator<String> it = a7.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                j.c().a(f16221j, "Reconciling jobs", new Throwable[0]);
                z6 = true;
                break;
            }
        }
        if (z6) {
            WorkDatabase o7 = iVar.o();
            o7.c();
            try {
                q B = o7.B();
                Iterator<String> it2 = a7.iterator();
                while (it2.hasNext()) {
                    B.d(it2.next(), -1L);
                }
                o7.r();
            } finally {
                o7.g();
            }
        }
        return z6;
    }

    @Override // e0.e
    public void b(String str) {
        List<Integer> e7 = e(this.f16222f, this.f16223g, str);
        if (e7 == null || e7.isEmpty()) {
            return;
        }
        Iterator<Integer> it = e7.iterator();
        while (it.hasNext()) {
            c(this.f16223g, it.next().intValue());
        }
        this.f16224h.o().y().c(str);
    }

    @Override // e0.e
    public void d(p... pVarArr) {
        List<Integer> e7;
        WorkDatabase o7 = this.f16224h.o();
        c cVar = new c(o7);
        for (p pVar : pVarArr) {
            o7.c();
            try {
                p l7 = o7.B().l(pVar.f18477a);
                if (l7 == null) {
                    j.c().h(f16221j, "Skipping scheduling " + pVar.f18477a + " because it's no longer in the DB", new Throwable[0]);
                } else if (l7.f18478b != s.ENQUEUED) {
                    j.c().h(f16221j, "Skipping scheduling " + pVar.f18477a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    g b7 = o7.y().b(pVar.f18477a);
                    int d7 = b7 != null ? b7.f18455b : cVar.d(this.f16224h.i().i(), this.f16224h.i().g());
                    if (b7 == null) {
                        this.f16224h.o().y().d(new g(pVar.f18477a, d7));
                    }
                    j(pVar, d7);
                    if (Build.VERSION.SDK_INT == 23 && (e7 = e(this.f16222f, this.f16223g, pVar.f18477a)) != null) {
                        int indexOf = e7.indexOf(Integer.valueOf(d7));
                        if (indexOf >= 0) {
                            e7.remove(indexOf);
                        }
                        j(pVar, !e7.isEmpty() ? e7.get(0).intValue() : cVar.d(this.f16224h.i().i(), this.f16224h.i().g()));
                    }
                }
                o7.r();
                o7.g();
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    @Override // e0.e
    public boolean f() {
        return true;
    }

    public void j(p pVar, int i7) {
        JobInfo a7 = this.f16225i.a(pVar, i7);
        j c7 = j.c();
        String str = f16221j;
        c7.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f18477a, Integer.valueOf(i7)), new Throwable[0]);
        try {
            if (this.f16223g.schedule(a7) == 0) {
                j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f18477a), new Throwable[0]);
                if (pVar.f18493q && pVar.f18494r == n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f18493q = false;
                    j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f18477a), new Throwable[0]);
                    j(pVar, i7);
                }
            }
        } catch (IllegalStateException e7) {
            List<JobInfo> g7 = g(this.f16222f, this.f16223g);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g7 != null ? g7.size() : 0), Integer.valueOf(this.f16224h.o().B().r().size()), Integer.valueOf(this.f16224h.i().h()));
            j.c().b(f16221j, format, new Throwable[0]);
            throw new IllegalStateException(format, e7);
        } catch (Throwable th) {
            j.c().b(f16221j, String.format("Unable to schedule %s", pVar), th);
        }
    }
}
