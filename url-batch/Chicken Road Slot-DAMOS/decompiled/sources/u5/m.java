package u5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import c6.q;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.cf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.i0;
import t5.u;
import z4.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends u {

    /* renamed from: k, reason: collision with root package name */
    public static m f9646k;

    /* renamed from: l, reason: collision with root package name */
    public static m f9647l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f9648m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9649a;

    /* renamed from: b, reason: collision with root package name */
    public final t5.b f9650b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f9651c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.n f9652d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9653e;

    /* renamed from: f, reason: collision with root package name */
    public final e f9654f;
    public final d6.f g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9655h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f9656i;
    public final c6.i j;

    static {
        t5.o.f("WorkManagerImpl");
        f9646k = null;
        f9647l = null;
        f9648m = new Object();
    }

    public m(Context context, t5.b bVar, a1.n nVar) {
        r a9;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        d6.l lVar = (d6.l) nVar.f41i;
        applicationContext.getClass();
        lVar.getClass();
        int i3 = 11;
        if (z10) {
            a9 = new r(applicationContext, WorkDatabase.class, null);
            a9.f10821i = true;
        } else {
            a9 = z4.m.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            a9.f10820h = new b1.h(i3, applicationContext);
        }
        a9.f10819f = lVar;
        a9.f10817d.add(b.f9612a);
        a9.a(d.g);
        a9.a(new f(applicationContext, 2, 3));
        a9.a(d.f9616h);
        a9.a(d.f9617i);
        a9.a(new f(applicationContext, 5, 6));
        a9.a(d.j);
        a9.a(d.f9618k);
        a9.a(d.f9619l);
        a9.a(new f(applicationContext));
        a9.a(new f(applicationContext, 10, 11));
        a9.a(d.f9613d);
        a9.a(d.f9614e);
        a9.a(d.f9615f);
        a9.f10827p = false;
        a9.f10828q = true;
        WorkDatabase workDatabase = (WorkDatabase) a9.b();
        Context applicationContext2 = context.getApplicationContext();
        t5.o oVar = new t5.o(bVar.f9288f);
        synchronized (t5.o.f9312b) {
            t5.o.f9313c = oVar;
        }
        c6.i iVar = new c6.i(applicationContext2, nVar);
        this.j = iVar;
        String str = h.f9635a;
        x5.b bVar2 = new x5.b(applicationContext2, this);
        d6.j.a(applicationContext2, SystemJobService.class, true);
        t5.o.d().a(h.f9635a, "Created SystemJobScheduler and enabled SystemJobService");
        List asList = Arrays.asList(bVar2, new v5.b(applicationContext2, bVar, iVar, this));
        e eVar = new e(context, bVar, nVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f9649a = applicationContext3;
        this.f9650b = bVar;
        this.f9652d = nVar;
        this.f9651c = workDatabase;
        this.f9653e = asList;
        this.f9654f = eVar;
        this.g = new d6.f(workDatabase, 1);
        this.f9655h = false;
        if (l.a(applicationContext3)) {
            i0.l("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        this.f9652d.a(new d6.d(applicationContext3, this));
    }

    public static m a(Context context) {
        m mVar;
        Object obj = f9648m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    mVar = f9646k;
                    if (mVar == null) {
                        mVar = f9647l;
                    }
                }
                return mVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (mVar != null) {
            return mVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (u5.m.f9647l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        u5.m.f9647l = new u5.m(r4, r5, new a1.n(r5.f9284b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        u5.m.f9646k = u5.m.f9647l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, t5.b bVar) {
        synchronized (f9648m) {
            try {
                m mVar = f9646k;
                if (mVar != null && f9647l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void c() {
        synchronized (f9648m) {
            try {
                this.f9655h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f9656i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f9656i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList c10;
        String str = x5.b.f10510s;
        Context context = this.f9649a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (c10 = x5.b.c(context, jobScheduler)) != null && !c10.isEmpty()) {
            int size = c10.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = c10.get(i3);
                i3++;
                x5.b.b(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f9651c;
        q B = workDatabase.B();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) B.f1857a;
        workDatabase_Impl.b();
        c6.h hVar = (c6.h) B.f1865k;
        k5.k a9 = hVar.a();
        workDatabase_Impl.c();
        try {
            a9.a();
            workDatabase_Impl.u();
            workDatabase_Impl.h();
            hVar.c(a9);
            h.a(this.f9650b, workDatabase, this.f9653e);
        } catch (Throwable th) {
            workDatabase_Impl.h();
            hVar.c(a9);
            throw th;
        }
    }

    public final void e(i iVar, p.e eVar) {
        cf cfVar = new cf(2);
        cfVar.f2202e = this;
        cfVar.f2203i = iVar;
        cfVar.f2204r = eVar;
        this.f9652d.a(cfVar);
    }
}
