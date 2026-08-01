package androidx.work.impl.workers;

import a4.j;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c6.f;
import c6.i;
import c6.p;
import c6.q;
import c6.s;
import cf.c;
import g6.b;
import i7.a;
import java.util.ArrayList;
import kotlin.Metadata;
import t5.d;
import t5.e;
import t5.l;
import t5.o;
import u5.m;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, j.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final l a() {
        z zVar;
        i iVar;
        c6.l lVar;
        s sVar;
        WorkDatabase workDatabase = m.a(getApplicationContext()).f9651c;
        workDatabase.getClass();
        q B = workDatabase.B();
        c6.l z10 = workDatabase.z();
        s C = workDatabase.C();
        i y3 = workDatabase.y();
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        B.getClass();
        z a9 = z.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a9.f(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) B.f1857a;
        workDatabase_Impl.b();
        Cursor E = c.E(workDatabase_Impl, a9);
        try {
            int F = f.F(E, "id");
            int F2 = f.F(E, "state");
            int F3 = f.F(E, "worker_class_name");
            int F4 = f.F(E, "input_merger_class_name");
            int F5 = f.F(E, "input");
            int F6 = f.F(E, "output");
            int F7 = f.F(E, "initial_delay");
            int F8 = f.F(E, "interval_duration");
            int F9 = f.F(E, "flex_duration");
            int F10 = f.F(E, "run_attempt_count");
            int F11 = f.F(E, "backoff_policy");
            zVar = a9;
            try {
                int F12 = f.F(E, "backoff_delay_duration");
                int F13 = f.F(E, "last_enqueue_time");
                int F14 = f.F(E, "minimum_retention_duration");
                int F15 = f.F(E, "schedule_requested_at");
                int F16 = f.F(E, "run_in_foreground");
                int F17 = f.F(E, "out_of_quota_policy");
                int F18 = f.F(E, "period_count");
                int F19 = f.F(E, "generation");
                int F20 = f.F(E, "required_network_type");
                int F21 = f.F(E, "requires_charging");
                int F22 = f.F(E, "requires_device_idle");
                int F23 = f.F(E, "requires_battery_not_low");
                int F24 = f.F(E, "requires_storage_not_low");
                int F25 = f.F(E, "trigger_content_update_delay");
                int F26 = f.F(E, "trigger_max_content_delay");
                int F27 = f.F(E, "content_uri_triggers");
                int i3 = F14;
                ArrayList arrayList = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    byte[] bArr = null;
                    String string = E.isNull(F) ? null : E.getString(F);
                    int U = a.U(E.getInt(F2));
                    String string2 = E.isNull(F3) ? null : E.getString(F3);
                    String string3 = E.isNull(F4) ? null : E.getString(F4);
                    e a10 = e.a(E.isNull(F5) ? null : E.getBlob(F5));
                    e a11 = e.a(E.isNull(F6) ? null : E.getBlob(F6));
                    long j = E.getLong(F7);
                    long j3 = E.getLong(F8);
                    long j10 = E.getLong(F9);
                    int i10 = E.getInt(F10);
                    int R = a.R(E.getInt(F11));
                    long j11 = E.getLong(F12);
                    long j12 = E.getLong(F13);
                    int i11 = i3;
                    long j13 = E.getLong(i11);
                    int i12 = F13;
                    int i13 = F15;
                    long j14 = E.getLong(i13);
                    F15 = i13;
                    int i14 = F16;
                    boolean z11 = E.getInt(i14) != 0;
                    F16 = i14;
                    int i15 = F17;
                    int T = a.T(E.getInt(i15));
                    F17 = i15;
                    int i16 = F18;
                    int i17 = E.getInt(i16);
                    F18 = i16;
                    int i18 = F19;
                    int i19 = E.getInt(i18);
                    F19 = i18;
                    int i20 = F20;
                    int S = a.S(E.getInt(i20));
                    F20 = i20;
                    int i21 = F21;
                    boolean z12 = E.getInt(i21) != 0;
                    F21 = i21;
                    int i22 = F22;
                    boolean z13 = E.getInt(i22) != 0;
                    F22 = i22;
                    int i23 = F23;
                    boolean z14 = E.getInt(i23) != 0;
                    F23 = i23;
                    int i24 = F24;
                    boolean z15 = E.getInt(i24) != 0;
                    F24 = i24;
                    int i25 = F25;
                    long j15 = E.getLong(i25);
                    F25 = i25;
                    int i26 = F26;
                    long j16 = E.getLong(i26);
                    F26 = i26;
                    int i27 = F27;
                    if (!E.isNull(i27)) {
                        bArr = E.getBlob(i27);
                    }
                    F27 = i27;
                    arrayList.add(new p(string, U, string2, string3, a10, a11, j, j3, j10, new d(S, z12, z13, z14, z15, j15, j16, a.o(bArr)), i10, R, j11, j12, j13, j14, z11, T, i17, i19));
                    F13 = i12;
                    i3 = i11;
                }
                E.close();
                zVar.d();
                ArrayList g = B.g();
                ArrayList e2 = B.e();
                if (arrayList.isEmpty()) {
                    iVar = y3;
                    lVar = z10;
                    sVar = C;
                } else {
                    o d10 = o.d();
                    String str = b.f4275a;
                    d10.e(str, "Recently completed work:\n\n");
                    iVar = y3;
                    lVar = z10;
                    sVar = C;
                    o.d().e(str, b.a(lVar, sVar, iVar, arrayList));
                }
                if (!g.isEmpty()) {
                    o d11 = o.d();
                    String str2 = b.f4275a;
                    d11.e(str2, "Running work:\n\n");
                    o.d().e(str2, b.a(lVar, sVar, iVar, g));
                }
                if (!e2.isEmpty()) {
                    o d12 = o.d();
                    String str3 = b.f4275a;
                    d12.e(str3, "Enqueued work:\n\n");
                    o.d().e(str3, b.a(lVar, sVar, iVar, e2));
                }
                return t5.m.a();
            } catch (Throwable th) {
                th = th;
                E.close();
                zVar.d();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = a9;
        }
    }
}
