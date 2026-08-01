package p;

import a4.j;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.cf;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import kotlin.collections.o0;
import n0.m2;
import p2.d0;
import r6.g;
import s.h0;
import s.p0;
import s.r;
import s7.a4;
import s7.c0;
import s7.e0;
import s7.j4;
import s7.k4;
import s7.l3;
import s7.m;
import s7.q1;
import s7.q2;
import s7.r0;
import s7.s2;
import s7.t0;
import s7.v0;
import s7.w2;
import s7.x0;
import s7.z0;
import s8.f;
import t5.o;
import t5.p;
import te.a1;
import w7.h;
import w7.n;
import x0.i;
import x0.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements m6.b, s2, x0, OnCompleteListener {

    /* renamed from: s, reason: collision with root package name */
    public static e f7586s;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7587d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7588e;

    /* renamed from: i, reason: collision with root package name */
    public Object f7589i;

    /* renamed from: r, reason: collision with root package name */
    public Object f7590r;

    public e(int i3) {
        this.f7587d = i3;
        int i10 = 16;
        switch (i3) {
            case j.LONG_FIELD_NUMBER /* 4 */:
                this.f7590r = new c0(i10);
                break;
            case 12:
                this.f7588e = new WeakHashMap();
                this.f7589i = new WeakHashMap();
                this.f7590r = new WeakHashMap();
                break;
            case 14:
                List list = Collections.EMPTY_LIST;
                this.f7588e = list;
                this.f7589i = list;
                break;
            case 15:
                this.f7588e = new AtomicReference(i.f10236b);
                this.f7589i = new Object();
                break;
            default:
                this.f7588e = new r(16);
                long[] jArr = p0.f8356a;
                this.f7589i = new h0();
                this.f7590r = new c0(i10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // s7.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i3, Throwable th, byte[] bArr) {
        w2 w2Var;
        AtomicReference atomicReference;
        q2 q2Var = (q2) this.f7588e;
        q2Var.s();
        a4 a4Var = (a4) this.f7590r;
        if (i3 != 200 && i3 != 204) {
            if (i3 == 304) {
                i3 = 304;
            }
            v0 v0Var = ((q1) q2Var.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(a4Var.f8504d), Integer.valueOf(i3), th);
            w2Var = !Arrays.asList(((String) e0.f8652u.a(null)).split(",")).contains(String.valueOf(i3)) ? w2.BACKOFF : w2.FAILURE;
            atomicReference = (AtomicReference) this.f7589i;
            l3 o6 = ((q1) q2Var.f1478d).o();
            long j = a4Var.f8504d;
            s7.d dVar = new s7.d(w2Var.f9090d, j, a4Var.f8509t);
            o6.s();
            o6.t();
            o6.G(new cf((Object) o6, (Object) o6.I(true), (Object) dVar, 11));
            v0 v0Var2 = ((q1) q2Var.f1478d).f8937t;
            q1.l(v0Var2);
            v0Var2.B.c(Long.valueOf(j), w2Var, "[sgtm] Updated status for row_id");
            synchronized (atomicReference) {
                atomicReference.set(w2Var);
                atomicReference.notifyAll();
            }
            return;
        }
        if (th == null) {
            v0 v0Var3 = ((q1) q2Var.f1478d).f8937t;
            q1.l(v0Var3);
            v0Var3.B.b(Long.valueOf(a4Var.f8504d), "[sgtm] Upload succeeded for row_id");
            w2Var = w2.SUCCESS;
            atomicReference = (AtomicReference) this.f7589i;
            l3 o62 = ((q1) q2Var.f1478d).o();
            long j3 = a4Var.f8504d;
            s7.d dVar2 = new s7.d(w2Var.f9090d, j3, a4Var.f8509t);
            o62.s();
            o62.t();
            o62.G(new cf((Object) o62, (Object) o62.I(true), (Object) dVar2, 11));
            v0 v0Var22 = ((q1) q2Var.f1478d).f8937t;
            q1.l(v0Var22);
            v0Var22.B.c(Long.valueOf(j3), w2Var, "[sgtm] Updated status for row_id");
            synchronized (atomicReference) {
            }
        }
        v0 v0Var4 = ((q1) q2Var.f1478d).f8937t;
        q1.l(v0Var4);
        v0Var4.f9053w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(a4Var.f8504d), Integer.valueOf(i3), th);
        if (!Arrays.asList(((String) e0.f8652u.a(null)).split(",")).contains(String.valueOf(i3))) {
        }
        atomicReference = (AtomicReference) this.f7589i;
        l3 o622 = ((q1) q2Var.f1478d).o();
        long j32 = a4Var.f8504d;
        s7.d dVar22 = new s7.d(w2Var.f9090d, j32, a4Var.f8509t);
        o622.s();
        o622.t();
        o622.G(new cf((Object) o622, (Object) o622.I(true), (Object) dVar22, 11));
        v0 v0Var222 = ((q1) q2Var.f1478d).f8937t;
        q1.l(v0Var222);
        v0Var222.B.c(Long.valueOf(j32), w2Var, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.String] */
    @Override // s7.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String str, int i3, Throwable th, byte[] bArr, Map map) {
        switch (this.f7587d) {
            case j.BYTES_FIELD_NUMBER /* 8 */:
                ((j4) this.f7590r).z(true, i3, th, bArr, (String) this.f7588e, (ArrayList) this.f7589i, map);
                return;
            default:
                long j = ((k4) this.f7589i).f8797a;
                j4 j4Var = (j4) this.f7590r;
                String str2 = (String) this.f7588e;
                j4Var.d().s();
                j4Var.l0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Throwable th2) {
                        j4Var.I = false;
                        j4Var.O();
                        throw th2;
                    }
                }
                if (i3 != 200) {
                    if (i3 == 204) {
                        i3 = 204;
                    }
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    ?? substring = str3.substring(0, Math.min(32, str3.length()));
                    t0 t0Var = j4Var.b().f9055y;
                    Integer valueOf = Integer.valueOf(i3);
                    if (th == null) {
                        th = substring;
                    }
                    t0Var.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th);
                    m mVar = j4Var.f8762i;
                    j4.T(mVar);
                    mVar.E(Long.valueOf(j));
                    j4Var.N();
                    j4Var.I = false;
                    j4Var.O();
                    return;
                }
                if (th == null) {
                    m mVar2 = j4Var.f8762i;
                    j4.T(mVar2);
                    mVar2.z(Long.valueOf(j));
                    j4Var.b().B.c(str2, Integer.valueOf(i3), "Successfully uploaded batch from upload queue. appId, status");
                    z0 z0Var = j4Var.f8761e;
                    j4.T(z0Var);
                    if (z0Var.w()) {
                        m mVar3 = j4Var.f8762i;
                        j4.T(mVar3);
                        if (mVar3.y(str2)) {
                            j4Var.t(str2);
                            j4Var.I = false;
                            j4Var.O();
                            return;
                        }
                    }
                    j4Var.N();
                    j4Var.I = false;
                    j4Var.O();
                    return;
                }
                String str32 = new String(bArr, StandardCharsets.UTF_8);
                ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
                t0 t0Var2 = j4Var.b().f9055y;
                Integer valueOf2 = Integer.valueOf(i3);
                if (th == null) {
                }
                t0Var2.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th);
                m mVar4 = j4Var.f8762i;
                j4.T(mVar4);
                mVar4.E(Long.valueOf(j));
                j4Var.N();
                j4Var.I = false;
                j4Var.O();
                return;
        }
    }

    public boolean c(String str) {
        z5.b bVar;
        boolean z10;
        str.getClass();
        synchronized (this.f7590r) {
            try {
                z5.b[] bVarArr = (z5.b[]) this.f7589i;
                int length = bVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i3];
                    bVar.getClass();
                    Object obj = bVar.f10860d;
                    if (obj != null && bVar.b(obj) && bVar.f10859c.contains(str)) {
                        break;
                    }
                    i3++;
                }
                if (bVar != null) {
                    o.d().a(y5.c.f10623a, "Work " + str + " constrained by " + bVar.getClass().getSimpleName());
                }
                z10 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public p d() {
        p pVar = new p((UUID) this.f7588e, (c6.p) this.f7589i, (LinkedHashSet) this.f7590r);
        t5.d dVar = ((c6.p) this.f7589i).j;
        boolean z10 = !dVar.f9299h.isEmpty() || dVar.f9296d || dVar.f9294b || dVar.f9295c;
        c6.p pVar2 = (c6.p) this.f7589i;
        if (pVar2.f1853q) {
            if (z10) {
                a1.e("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (pVar2.g > 0) {
                a1.e("Expedited jobs cannot be delayed");
                return null;
            }
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.f7588e = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        c6.p pVar3 = (c6.p) this.f7589i;
        pVar3.getClass();
        String str = pVar3.f1841c;
        int i3 = pVar3.f1840b;
        String str2 = pVar3.f1842d;
        t5.e eVar = new t5.e(pVar3.f1843e);
        t5.e eVar2 = new t5.e(pVar3.f1844f);
        long j = pVar3.g;
        long j3 = pVar3.f1845h;
        long j10 = pVar3.f1846i;
        t5.d dVar2 = pVar3.j;
        dVar2.getClass();
        this.f7589i = new c6.p(uuid, i3, str, str2, eVar, eVar2, j, j3, j10, new t5.d(dVar2.f9293a, dVar2.f9294b, dVar2.f9295c, dVar2.f9296d, dVar2.f9297e, dVar2.f9298f, dVar2.g, dVar2.f9299h), pVar3.f1847k, pVar3.f1848l, pVar3.f1849m, pVar3.f1850n, pVar3.f1851o, pVar3.f1852p, pVar3.f1853q, pVar3.f1854r, pVar3.f1855s, 524288, 0);
        return pVar;
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f7588e;
        f fVar = new f(byteArrayOutputStream, hashMap, (HashMap) this.f7589i, (p8.d) this.f7590r);
        p8.d dVar = (p8.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new p8.b("No encoder for " + obj.getClass());
    }

    public boolean f() {
        if (((m2) this.f7588e).getValue() != this.f7590r) {
            return true;
        }
        e eVar = (e) this.f7589i;
        return eVar != null && eVar.f();
    }

    public void g(Collection collection) {
        collection.getClass();
        synchronized (this.f7590r) {
            try {
                for (z5.b bVar : (z5.b[]) this.f7589i) {
                    if (bVar.f10861e != null) {
                        bVar.f10861e = null;
                        bVar.d(null, bVar.f10860d);
                    }
                }
                for (z5.b bVar2 : (z5.b[]) this.f7589i) {
                    bVar2.c(collection);
                }
                for (z5.b bVar3 : (z5.b[]) this.f7589i) {
                    if (bVar3.f10861e != this) {
                        bVar3.f10861e = this;
                        bVar3.d(this, bVar3.f10860d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gd.a
    public Object get() {
        switch (this.f7587d) {
            case 2:
                return new e((Context) ((gd.a) this.f7588e).get(), (g) ((gd.a) this.f7589i).get(), (q6.a) ((k5.c) this.f7590r).get(), 3);
            default:
                long b10 = i.b();
                if (b10 == k.f10240a) {
                    return this.f7590r;
                }
                x0.j jVar = (x0.j) ((AtomicReference) this.f7588e).get();
                int a9 = jVar.a(b10);
                if (a9 >= 0) {
                    return jVar.f10239c[a9];
                }
                return null;
        }
    }

    public void h() {
        synchronized (this.f7590r) {
            for (z5.b bVar : (z5.b[]) this.f7589i) {
                ArrayList arrayList = bVar.f10858b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f10857a.b(bVar);
                }
            }
        }
    }

    public void i(k6.i iVar, int i3, boolean z10) {
        q6.a aVar = (q6.a) this.f7590r;
        Context context = (Context) this.f7588e;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f5464a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        h6.d dVar = iVar.f5466c;
        adler32.update(allocate.putInt(u6.a.a(dVar)).array());
        byte[] bArr = iVar.f5465b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i3) {
                        k7.e.l("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((g) this.f7589i).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(u6.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i3));
            Set set = ((q6.b) aVar.f8028b.get(dVar)).f8031c;
            if (set.contains(q6.c.f8032d)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(q6.c.f8034i)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(q6.c.f8033e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", u6.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, longValue, i3)), valueOf, Integer.valueOf(i3)};
            String v10 = k7.e.v("JobInfoScheduler");
            if (Log.isLoggable(v10, 3)) {
                Log.d(v10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void j(Object obj) {
        long b10 = i.b();
        if (b10 == k.f10240a) {
            this.f7590r = obj;
            return;
        }
        synchronized (this.f7589i) {
            x0.j jVar = (x0.j) ((AtomicReference) this.f7588e).get();
            int a9 = jVar.a(b10);
            if (a9 < 0) {
                ((AtomicReference) this.f7588e).set(jVar.b(b10, obj));
            } else {
                jVar.f10239c[a9] = obj;
            }
        }
    }

    public void k(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        ((c6.p) this.f7589i).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((c6.p) this.f7589i).g) {
            return;
        }
        a1.e("The given initial delay is too large and will cause an overflow!");
    }

    public synchronized void l(int i3, int i10, long j, long j3) {
        ((q1) this.f7588e).f8942y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f7590r;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        n c10 = ((e7.d) this.f7589i).c(new c7.n(0, Arrays.asList(new c7.k(36301, i3, 0, j, j3, null, null, 0, i10))));
        r0 r0Var = new r0(this, elapsedRealtime, 0);
        c10.getClass();
        c10.c(h.f10118a, r0Var);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        y6.c cVar = (y6.c) this.f7588e;
        String str = (String) this.f7589i;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f7590r;
        s.r0 r0Var = cVar.f10634a;
        synchronized (r0Var) {
            r0Var.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public /* synthetic */ e(j4 j4Var, String str, Object obj, int i3) {
        this.f7587d = i3;
        this.f7588e = str;
        this.f7589i = obj;
        this.f7590r = j4Var;
    }

    public e(Context context, q1 q1Var) {
        this.f7587d = 6;
        this.f7590r = new AtomicLong(-1L);
        this.f7589i = new e7.d(context, e7.d.f3954l, new c7.o("measurement:api"), a7.i.f325c);
        this.f7588e = q1Var;
    }

    public e(Class cls) {
        this.f7587d = 13;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.f7588e = randomUUID;
        String uuid = ((UUID) this.f7588e).toString();
        uuid.getClass();
        this.f7589i = new c6.p(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0.a(1));
        linkedHashSet.add(strArr[0]);
        this.f7590r = linkedHashSet;
        ((c6.p) this.f7589i).f1842d = OverwritingInputMerger.class.getName();
    }

    public e(c6.i iVar, y5.b bVar) {
        this.f7587d = 16;
        iVar.getClass();
        a6.g gVar = (a6.g) iVar.f1820a;
        gVar.getClass();
        z5.a aVar = new z5.a(gVar, 0);
        a6.a aVar2 = (a6.a) iVar.f1821b;
        aVar2.getClass();
        z5.a aVar3 = new z5.a(aVar2, 1);
        a6.g gVar2 = (a6.g) iVar.f1823d;
        gVar2.getClass();
        z5.a aVar4 = new z5.a(gVar2, 4);
        a6.g gVar3 = (a6.g) iVar.f1822c;
        gVar3.getClass();
        z5.b[] bVarArr = {aVar, aVar3, aVar4, new z5.a(gVar3, 2), new z5.a(gVar3, 3), new z5.d(gVar3), new z5.c(gVar3)};
        this.f7588e = bVar;
        this.f7589i = bVarArr;
        this.f7590r = new Object();
    }

    public e(d0 d0Var, e eVar) {
        this.f7587d = 11;
        this.f7588e = d0Var;
        this.f7589i = eVar;
        this.f7590r = d0Var.getValue();
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i3) {
        this.f7587d = i3;
        this.f7588e = obj;
        this.f7589i = obj2;
        this.f7590r = obj3;
    }
}
