package e0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import d0.j;
import d0.m;
import d0.p;
import d0.t;
import d0.u;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class i extends t {

    /* renamed from: j, reason: collision with root package name */
    private static final String f15790j = d0.j.f("WorkManagerImpl");

    /* renamed from: k, reason: collision with root package name */
    private static i f15791k = null;

    /* renamed from: l, reason: collision with root package name */
    private static i f15792l = null;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f15793m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f15794a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.a f15795b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f15796c;

    /* renamed from: d, reason: collision with root package name */
    private n0.a f15797d;

    /* renamed from: e, reason: collision with root package name */
    private List<e> f15798e;

    /* renamed from: f, reason: collision with root package name */
    private d f15799f;

    /* renamed from: g, reason: collision with root package name */
    private m0.e f15800g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15801h;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f15802i;

    public i(Context context, androidx.work.a aVar, n0.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.f15495a));
    }

    public i(Context context, androidx.work.a aVar, n0.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        d0.j.e(new j.a(aVar.j()));
        List<e> g7 = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, g7, new d(context, aVar, aVar2, workDatabase, g7));
    }

    public i(Context context, androidx.work.a aVar, n0.a aVar2, boolean z6) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.c(), z6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (e0.i.f15792l != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        e0.i.f15792l = new e0.i(r4, r5, new n0.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        e0.i.f15791k = e0.i.f15792l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Context context, androidx.work.a aVar) {
        synchronized (f15793m) {
            i iVar = f15791k;
            if (iVar != null && f15792l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    @Deprecated
    public static i j() {
        synchronized (f15793m) {
            i iVar = f15791k;
            if (iVar != null) {
                return iVar;
            }
            return f15792l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i k(Context context) {
        i j7;
        synchronized (f15793m) {
            j7 = j();
            if (j7 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((a.c) applicationContext).a());
                j7 = k(applicationContext);
            }
        }
        return j7;
    }

    private void q(Context context, androidx.work.a aVar, n0.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15794a = applicationContext;
        this.f15795b = aVar;
        this.f15797d = aVar2;
        this.f15796c = workDatabase;
        this.f15798e = list;
        this.f15799f = dVar;
        this.f15800g = new m0.e(workDatabase);
        this.f15801h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f15797d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // d0.t
    public m a(String str) {
        m0.a d7 = m0.a.d(str, this);
        this.f15797d.b(d7);
        return d7.e();
    }

    @Override // d0.t
    public m c(List<? extends u> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public m f(UUID uuid) {
        m0.a b7 = m0.a.b(uuid, this);
        this.f15797d.b(b7);
        return b7.e();
    }

    public List<e> g(Context context, androidx.work.a aVar, n0.a aVar2) {
        return Arrays.asList(f.a(context, this), new f0.b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f15794a;
    }

    public androidx.work.a i() {
        return this.f15795b;
    }

    public m0.e l() {
        return this.f15800g;
    }

    public d m() {
        return this.f15799f;
    }

    public List<e> n() {
        return this.f15798e;
    }

    public WorkDatabase o() {
        return this.f15796c;
    }

    public n0.a p() {
        return this.f15797d;
    }

    public void r() {
        synchronized (f15793m) {
            this.f15801h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f15802i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f15802i = null;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            g0.b.a(h());
        }
        o().B().u();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f15793m) {
            this.f15802i = pendingResult;
            if (this.f15801h) {
                pendingResult.finish();
                this.f15802i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f15797d.b(new m0.h(this, str, aVar));
    }

    public void w(String str) {
        this.f15797d.b(new m0.i(this, str, true));
    }

    public void x(String str) {
        this.f15797d.b(new m0.i(this, str, false));
    }
}
