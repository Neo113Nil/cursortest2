package androidx.work.impl.workers;

import G0.A;
import G0.EnumC0101a;
import G0.e;
import G0.h;
import G0.p;
import G0.t;
import G0.z;
import O6.g;
import P0.f;
import P0.i;
import P0.l;
import P0.q;
import P0.s;
import V6.b;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import h0.C0465k;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final p a() {
        C0465k c0465k;
        int q4;
        int q7;
        int q8;
        int q9;
        int q10;
        int q11;
        int q12;
        int q13;
        int q14;
        int q15;
        int q16;
        i iVar;
        l lVar;
        s sVar;
        H0.p a7 = H0.p.a(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(a7, "getInstance(applicationContext)");
        WorkDatabase workDatabase = a7.f920c;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        q t6 = workDatabase.t();
        l r7 = workDatabase.r();
        s u7 = workDatabase.u();
        i p7 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t6.getClass();
        C0465k g7 = C0465k.g(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        g7.r(currentTimeMillis, 1);
        WorkDatabase_Impl workDatabase_Impl = t6.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = b.J(workDatabase_Impl, g7);
        try {
            q4 = f.q(J7, "id");
            q7 = f.q(J7, "state");
            q8 = f.q(J7, "worker_class_name");
            q9 = f.q(J7, "input_merger_class_name");
            q10 = f.q(J7, "input");
            q11 = f.q(J7, "output");
            q12 = f.q(J7, "initial_delay");
            q13 = f.q(J7, "interval_duration");
            q14 = f.q(J7, "flex_duration");
            q15 = f.q(J7, "run_attempt_count");
            q16 = f.q(J7, "backoff_policy");
            c0465k = g7;
        } catch (Throwable th) {
            th = th;
            c0465k = g7;
        }
        try {
            int q17 = f.q(J7, "backoff_delay_duration");
            int q18 = f.q(J7, "last_enqueue_time");
            int q19 = f.q(J7, "minimum_retention_duration");
            int q20 = f.q(J7, "schedule_requested_at");
            int q21 = f.q(J7, "run_in_foreground");
            int q22 = f.q(J7, "out_of_quota_policy");
            int q23 = f.q(J7, "period_count");
            int q24 = f.q(J7, "generation");
            int q25 = f.q(J7, "required_network_type");
            int q26 = f.q(J7, "requires_charging");
            int q27 = f.q(J7, "requires_device_idle");
            int q28 = f.q(J7, "requires_battery_not_low");
            int q29 = f.q(J7, "requires_storage_not_low");
            int q30 = f.q(J7, "trigger_content_update_delay");
            int q31 = f.q(J7, "trigger_max_content_delay");
            int q32 = f.q(J7, "content_uri_triggers");
            int i2 = q19;
            ArrayList arrayList = new ArrayList(J7.getCount());
            while (J7.moveToNext()) {
                byte[] bArr = null;
                String string = J7.isNull(q4) ? null : J7.getString(q4);
                A U4 = g.U(J7.getInt(q7));
                String string2 = J7.isNull(q8) ? null : J7.getString(q8);
                String string3 = J7.isNull(q9) ? null : J7.getString(q9);
                h a8 = h.a(J7.isNull(q10) ? null : J7.getBlob(q10));
                h a9 = h.a(J7.isNull(q11) ? null : J7.getBlob(q11));
                long j = J7.getLong(q12);
                long j7 = J7.getLong(q13);
                long j8 = J7.getLong(q14);
                int i5 = J7.getInt(q15);
                EnumC0101a R4 = g.R(J7.getInt(q16));
                long j9 = J7.getLong(q17);
                long j10 = J7.getLong(q18);
                int i7 = i2;
                long j11 = J7.getLong(i7);
                int i8 = q18;
                int i9 = q20;
                long j12 = J7.getLong(i9);
                q20 = i9;
                int i10 = q21;
                boolean z7 = J7.getInt(i10) != 0;
                q21 = i10;
                int i11 = q22;
                z T4 = g.T(J7.getInt(i11));
                q22 = i11;
                int i12 = q23;
                int i13 = J7.getInt(i12);
                q23 = i12;
                int i14 = q24;
                int i15 = J7.getInt(i14);
                q24 = i14;
                int i16 = q25;
                t S7 = g.S(J7.getInt(i16));
                q25 = i16;
                int i17 = q26;
                boolean z8 = J7.getInt(i17) != 0;
                q26 = i17;
                int i18 = q27;
                boolean z9 = J7.getInt(i18) != 0;
                q27 = i18;
                int i19 = q28;
                boolean z10 = J7.getInt(i19) != 0;
                q28 = i19;
                int i20 = q29;
                boolean z11 = J7.getInt(i20) != 0;
                q29 = i20;
                int i21 = q30;
                long j13 = J7.getLong(i21);
                q30 = i21;
                int i22 = q31;
                long j14 = J7.getLong(i22);
                q31 = i22;
                int i23 = q32;
                if (!J7.isNull(i23)) {
                    bArr = J7.getBlob(i23);
                }
                q32 = i23;
                arrayList.add(new P0.p(string, U4, string2, string3, a8, a9, j, j7, j8, new e(S7, z8, z9, z10, z11, j13, j14, g.y(bArr)), i5, R4, j9, j10, j11, j12, z7, T4, i13, i15));
                q18 = i8;
                i2 = i7;
            }
            J7.close();
            c0465k.h();
            ArrayList c7 = t6.c();
            ArrayList a10 = t6.a();
            if (arrayList.isEmpty()) {
                iVar = p7;
                lVar = r7;
                sVar = u7;
            } else {
                G0.s d7 = G0.s.d();
                String str = T0.b.f2562a;
                d7.e(str, "Recently completed work:\n\n");
                iVar = p7;
                lVar = r7;
                sVar = u7;
                G0.s.d().e(str, T0.b.a(lVar, sVar, iVar, arrayList));
            }
            if (!c7.isEmpty()) {
                G0.s d8 = G0.s.d();
                String str2 = T0.b.f2562a;
                d8.e(str2, "Running work:\n\n");
                G0.s.d().e(str2, T0.b.a(lVar, sVar, iVar, c7));
            }
            if (!a10.isEmpty()) {
                G0.s d9 = G0.s.d();
                String str3 = T0.b.f2562a;
                d9.e(str3, "Enqueued work:\n\n");
                G0.s.d().e(str3, T0.b.a(lVar, sVar, iVar, a10));
            }
            p a11 = G0.q.a();
            Intrinsics.checkNotNullExpressionValue(a11, "success()");
            return a11;
        } catch (Throwable th2) {
            th = th2;
            J7.close();
            c0465k.h();
            throw th;
        }
    }
}
