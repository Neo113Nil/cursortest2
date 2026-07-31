package androidx.work.impl.workers;

import Q.k;
import a.AbstractC0219a;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import l0.d;
import l0.g;
import l0.n;
import l0.q;
import m0.o;
import m1.AbstractC0521b;
import u0.C0679i;
import u0.C0682l;
import u0.C0686p;
import u0.C0687q;
import u0.C0689s;
import y0.AbstractC0756b;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        i.e(context, "context");
        i.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final n a() {
        k kVar;
        C0679i c0679i;
        C0682l c0682l;
        C0689s c0689s;
        WorkDatabase workDatabase = o.a(getApplicationContext()).f5375c;
        i.d(workDatabase, "workManager.workDatabase");
        C0687q t6 = workDatabase.t();
        C0682l r6 = workDatabase.r();
        C0689s u6 = workDatabase.u();
        C0679i p4 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t6.getClass();
        k e4 = k.e("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        e4.t(currentTimeMillis, 1);
        WorkDatabase_Impl workDatabase_Impl = t6.f6020a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            int q6 = AbstractC0219a.q(m4, "id");
            int q7 = AbstractC0219a.q(m4, "state");
            int q8 = AbstractC0219a.q(m4, "worker_class_name");
            int q9 = AbstractC0219a.q(m4, "input_merger_class_name");
            int q10 = AbstractC0219a.q(m4, "input");
            int q11 = AbstractC0219a.q(m4, "output");
            int q12 = AbstractC0219a.q(m4, "initial_delay");
            int q13 = AbstractC0219a.q(m4, "interval_duration");
            int q14 = AbstractC0219a.q(m4, "flex_duration");
            int q15 = AbstractC0219a.q(m4, "run_attempt_count");
            int q16 = AbstractC0219a.q(m4, "backoff_policy");
            kVar = e4;
            try {
                int q17 = AbstractC0219a.q(m4, "backoff_delay_duration");
                int q18 = AbstractC0219a.q(m4, "last_enqueue_time");
                int q19 = AbstractC0219a.q(m4, "minimum_retention_duration");
                int q20 = AbstractC0219a.q(m4, "schedule_requested_at");
                int q21 = AbstractC0219a.q(m4, "run_in_foreground");
                int q22 = AbstractC0219a.q(m4, "out_of_quota_policy");
                int q23 = AbstractC0219a.q(m4, "period_count");
                int q24 = AbstractC0219a.q(m4, "generation");
                int q25 = AbstractC0219a.q(m4, "required_network_type");
                int q26 = AbstractC0219a.q(m4, "requires_charging");
                int q27 = AbstractC0219a.q(m4, "requires_device_idle");
                int q28 = AbstractC0219a.q(m4, "requires_battery_not_low");
                int q29 = AbstractC0219a.q(m4, "requires_storage_not_low");
                int q30 = AbstractC0219a.q(m4, "trigger_content_update_delay");
                int q31 = AbstractC0219a.q(m4, "trigger_max_content_delay");
                int q32 = AbstractC0219a.q(m4, "content_uri_triggers");
                int i7 = q19;
                ArrayList arrayList = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    byte[] bArr = null;
                    String string = m4.isNull(q6) ? null : m4.getString(q6);
                    int s6 = AbstractC0521b.s(m4.getInt(q7));
                    String string2 = m4.isNull(q8) ? null : m4.getString(q8);
                    String string3 = m4.isNull(q9) ? null : m4.getString(q9);
                    g a7 = g.a(m4.isNull(q10) ? null : m4.getBlob(q10));
                    g a8 = g.a(m4.isNull(q11) ? null : m4.getBlob(q11));
                    long j4 = m4.getLong(q12);
                    long j7 = m4.getLong(q13);
                    long j8 = m4.getLong(q14);
                    int i8 = m4.getInt(q15);
                    int p6 = AbstractC0521b.p(m4.getInt(q16));
                    long j9 = m4.getLong(q17);
                    long j10 = m4.getLong(q18);
                    int i9 = i7;
                    long j11 = m4.getLong(i9);
                    int i10 = q18;
                    int i11 = q20;
                    long j12 = m4.getLong(i11);
                    q20 = i11;
                    int i12 = q21;
                    boolean z5 = m4.getInt(i12) != 0;
                    q21 = i12;
                    int i13 = q22;
                    int r7 = AbstractC0521b.r(m4.getInt(i13));
                    q22 = i13;
                    int i14 = q23;
                    int i15 = m4.getInt(i14);
                    q23 = i14;
                    int i16 = q24;
                    int i17 = m4.getInt(i16);
                    q24 = i16;
                    int i18 = q25;
                    int q33 = AbstractC0521b.q(m4.getInt(i18));
                    q25 = i18;
                    int i19 = q26;
                    boolean z6 = m4.getInt(i19) != 0;
                    q26 = i19;
                    int i20 = q27;
                    boolean z7 = m4.getInt(i20) != 0;
                    q27 = i20;
                    int i21 = q28;
                    boolean z8 = m4.getInt(i21) != 0;
                    q28 = i21;
                    int i22 = q29;
                    boolean z9 = m4.getInt(i22) != 0;
                    q29 = i22;
                    int i23 = q30;
                    long j13 = m4.getLong(i23);
                    q30 = i23;
                    int i24 = q31;
                    long j14 = m4.getLong(i24);
                    q31 = i24;
                    int i25 = q32;
                    if (!m4.isNull(i25)) {
                        bArr = m4.getBlob(i25);
                    }
                    q32 = i25;
                    arrayList.add(new C0686p(string, s6, string2, string3, a7, a8, j4, j7, j8, new d(q33, z6, z7, z8, z9, j13, j14, AbstractC0521b.e(bArr)), i8, p6, j9, j10, j11, j12, z5, r7, i15, i17));
                    q18 = i10;
                    i7 = i9;
                }
                m4.close();
                kVar.g();
                ArrayList c7 = t6.c();
                ArrayList a9 = t6.a();
                if (arrayList.isEmpty()) {
                    c0679i = p4;
                    c0682l = r6;
                    c0689s = u6;
                } else {
                    q d7 = q.d();
                    String str = AbstractC0756b.f6224a;
                    d7.e(str, "Recently completed work:\n\n");
                    c0679i = p4;
                    c0682l = r6;
                    c0689s = u6;
                    q.d().e(str, AbstractC0756b.a(c0682l, c0689s, c0679i, arrayList));
                }
                if (!c7.isEmpty()) {
                    q d8 = q.d();
                    String str2 = AbstractC0756b.f6224a;
                    d8.e(str2, "Running work:\n\n");
                    q.d().e(str2, AbstractC0756b.a(c0682l, c0689s, c0679i, c7));
                }
                if (!a9.isEmpty()) {
                    q d9 = q.d();
                    String str3 = AbstractC0756b.f6224a;
                    d9.e(str3, "Enqueued work:\n\n");
                    q.d().e(str3, AbstractC0756b.a(c0682l, c0689s, c0679i, a9));
                }
                return l0.o.a();
            } catch (Throwable th) {
                th = th;
                m4.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = e4;
        }
    }
}
