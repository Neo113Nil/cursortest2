package B0;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0307i;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import s0.C1416d;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f193a;

    /* renamed from: b, reason: collision with root package name */
    public final b f194b;

    /* renamed from: c, reason: collision with root package name */
    public final h f195c;

    /* renamed from: d, reason: collision with root package name */
    public final h f196d;

    /* renamed from: e, reason: collision with root package name */
    public final h f197e;

    /* renamed from: f, reason: collision with root package name */
    public final h f198f;

    /* renamed from: g, reason: collision with root package name */
    public final h f199g;

    /* renamed from: h, reason: collision with root package name */
    public final h f200h;

    /* renamed from: i, reason: collision with root package name */
    public final h f201i;

    /* renamed from: j, reason: collision with root package name */
    public final h f202j;

    /* renamed from: k, reason: collision with root package name */
    public final h f203k;

    public r(WorkDatabase_Impl workDatabase_Impl) {
        this.f193a = workDatabase_Impl;
        this.f194b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f195c = new h(workDatabase_Impl, 9);
        this.f196d = new h(workDatabase_Impl, 10);
        this.f197e = new h(workDatabase_Impl, 11);
        this.f198f = new h(workDatabase_Impl, 12);
        this.f199g = new h(workDatabase_Impl, 13);
        this.f200h = new h(workDatabase_Impl, 14);
        this.f201i = new h(workDatabase_Impl, 15);
        this.f202j = new h(workDatabase_Impl, 4);
        this.f203k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }

    public final ArrayList a() {
        X.k kVar;
        int i2;
        boolean z;
        int i3;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        X.k c2 = X.k.c(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c2.t(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            int T2 = K1.b.T(m6, OutcomeConstants.OUTCOME_ID);
            int T5 = K1.b.T(m6, "state");
            int T6 = K1.b.T(m6, "worker_class_name");
            int T7 = K1.b.T(m6, "input_merger_class_name");
            int T8 = K1.b.T(m6, "input");
            int T9 = K1.b.T(m6, "output");
            int T10 = K1.b.T(m6, "initial_delay");
            int T11 = K1.b.T(m6, "interval_duration");
            int T12 = K1.b.T(m6, "flex_duration");
            int T13 = K1.b.T(m6, "run_attempt_count");
            int T14 = K1.b.T(m6, "backoff_policy");
            int T15 = K1.b.T(m6, "backoff_delay_duration");
            int T16 = K1.b.T(m6, "last_enqueue_time");
            int T17 = K1.b.T(m6, "minimum_retention_duration");
            kVar = c2;
            try {
                int T18 = K1.b.T(m6, "schedule_requested_at");
                int T19 = K1.b.T(m6, "run_in_foreground");
                int T20 = K1.b.T(m6, "out_of_quota_policy");
                int T21 = K1.b.T(m6, "period_count");
                int T22 = K1.b.T(m6, "generation");
                int T23 = K1.b.T(m6, "required_network_type");
                int T24 = K1.b.T(m6, "requires_charging");
                int T25 = K1.b.T(m6, "requires_device_idle");
                int T26 = K1.b.T(m6, "requires_battery_not_low");
                int T27 = K1.b.T(m6, "requires_storage_not_low");
                int T28 = K1.b.T(m6, "trigger_content_update_delay");
                int T29 = K1.b.T(m6, "trigger_max_content_delay");
                int T30 = K1.b.T(m6, "content_uri_triggers");
                int i9 = T17;
                ArrayList arrayList = new ArrayList(m6.getCount());
                while (m6.moveToNext()) {
                    String string = m6.isNull(T2) ? null : m6.getString(T2);
                    int E5 = f.E(m6.getInt(T5));
                    String string2 = m6.isNull(T6) ? null : m6.getString(T6);
                    String string3 = m6.isNull(T7) ? null : m6.getString(T7);
                    s0.g a6 = s0.g.a(m6.isNull(T8) ? null : m6.getBlob(T8));
                    s0.g a7 = s0.g.a(m6.isNull(T9) ? null : m6.getBlob(T9));
                    long j2 = m6.getLong(T10);
                    long j6 = m6.getLong(T11);
                    long j7 = m6.getLong(T12);
                    int i10 = m6.getInt(T13);
                    int B5 = f.B(m6.getInt(T14));
                    long j8 = m6.getLong(T15);
                    long j9 = m6.getLong(T16);
                    int i11 = i9;
                    long j10 = m6.getLong(i11);
                    int i12 = T2;
                    int i13 = T18;
                    long j11 = m6.getLong(i13);
                    T18 = i13;
                    int i14 = T19;
                    if (m6.getInt(i14) != 0) {
                        T19 = i14;
                        i2 = T20;
                        z = true;
                    } else {
                        T19 = i14;
                        i2 = T20;
                        z = false;
                    }
                    int D5 = f.D(m6.getInt(i2));
                    T20 = i2;
                    int i15 = T21;
                    int i16 = m6.getInt(i15);
                    T21 = i15;
                    int i17 = T22;
                    int i18 = m6.getInt(i17);
                    T22 = i17;
                    int i19 = T23;
                    int C2 = f.C(m6.getInt(i19));
                    T23 = i19;
                    int i20 = T24;
                    if (m6.getInt(i20) != 0) {
                        T24 = i20;
                        i3 = T25;
                        z5 = true;
                    } else {
                        T24 = i20;
                        i3 = T25;
                        z5 = false;
                    }
                    if (m6.getInt(i3) != 0) {
                        T25 = i3;
                        i6 = T26;
                        z6 = true;
                    } else {
                        T25 = i3;
                        i6 = T26;
                        z6 = false;
                    }
                    if (m6.getInt(i6) != 0) {
                        T26 = i6;
                        i7 = T27;
                        z7 = true;
                    } else {
                        T26 = i6;
                        i7 = T27;
                        z7 = false;
                    }
                    if (m6.getInt(i7) != 0) {
                        T27 = i7;
                        i8 = T28;
                        z8 = true;
                    } else {
                        T27 = i7;
                        i8 = T28;
                        z8 = false;
                    }
                    long j12 = m6.getLong(i8);
                    T28 = i8;
                    int i21 = T29;
                    long j13 = m6.getLong(i21);
                    T29 = i21;
                    int i22 = T30;
                    T30 = i22;
                    arrayList.add(new q(string, E5, string2, string3, a6, a7, j2, j6, j7, new C1416d(C2, z5, z6, z7, z8, j12, j13, f.d(m6.isNull(i22) ? null : m6.getBlob(i22))), i10, B5, j8, j9, j10, j11, z, D5, i16, i18));
                    T2 = i12;
                    i9 = i11;
                }
                m6.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m6.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = c2;
        }
    }

    public final ArrayList b(int i2) {
        X.k kVar;
        int i3;
        boolean z;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        X.k c2 = X.k.c(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c2.t(1, i2);
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            int T2 = K1.b.T(m6, OutcomeConstants.OUTCOME_ID);
            int T5 = K1.b.T(m6, "state");
            int T6 = K1.b.T(m6, "worker_class_name");
            int T7 = K1.b.T(m6, "input_merger_class_name");
            int T8 = K1.b.T(m6, "input");
            int T9 = K1.b.T(m6, "output");
            int T10 = K1.b.T(m6, "initial_delay");
            int T11 = K1.b.T(m6, "interval_duration");
            int T12 = K1.b.T(m6, "flex_duration");
            int T13 = K1.b.T(m6, "run_attempt_count");
            int T14 = K1.b.T(m6, "backoff_policy");
            int T15 = K1.b.T(m6, "backoff_delay_duration");
            int T16 = K1.b.T(m6, "last_enqueue_time");
            int T17 = K1.b.T(m6, "minimum_retention_duration");
            kVar = c2;
            try {
                int T18 = K1.b.T(m6, "schedule_requested_at");
                int T19 = K1.b.T(m6, "run_in_foreground");
                int T20 = K1.b.T(m6, "out_of_quota_policy");
                int T21 = K1.b.T(m6, "period_count");
                int T22 = K1.b.T(m6, "generation");
                int T23 = K1.b.T(m6, "required_network_type");
                int T24 = K1.b.T(m6, "requires_charging");
                int T25 = K1.b.T(m6, "requires_device_idle");
                int T26 = K1.b.T(m6, "requires_battery_not_low");
                int T27 = K1.b.T(m6, "requires_storage_not_low");
                int T28 = K1.b.T(m6, "trigger_content_update_delay");
                int T29 = K1.b.T(m6, "trigger_max_content_delay");
                int T30 = K1.b.T(m6, "content_uri_triggers");
                int i10 = T17;
                ArrayList arrayList = new ArrayList(m6.getCount());
                while (m6.moveToNext()) {
                    String string = m6.isNull(T2) ? null : m6.getString(T2);
                    int E5 = f.E(m6.getInt(T5));
                    String string2 = m6.isNull(T6) ? null : m6.getString(T6);
                    String string3 = m6.isNull(T7) ? null : m6.getString(T7);
                    s0.g a6 = s0.g.a(m6.isNull(T8) ? null : m6.getBlob(T8));
                    s0.g a7 = s0.g.a(m6.isNull(T9) ? null : m6.getBlob(T9));
                    long j2 = m6.getLong(T10);
                    long j6 = m6.getLong(T11);
                    long j7 = m6.getLong(T12);
                    int i11 = m6.getInt(T13);
                    int B5 = f.B(m6.getInt(T14));
                    long j8 = m6.getLong(T15);
                    long j9 = m6.getLong(T16);
                    int i12 = i10;
                    long j10 = m6.getLong(i12);
                    int i13 = T2;
                    int i14 = T18;
                    long j11 = m6.getLong(i14);
                    T18 = i14;
                    int i15 = T19;
                    if (m6.getInt(i15) != 0) {
                        T19 = i15;
                        i3 = T20;
                        z = true;
                    } else {
                        T19 = i15;
                        i3 = T20;
                        z = false;
                    }
                    int D5 = f.D(m6.getInt(i3));
                    T20 = i3;
                    int i16 = T21;
                    int i17 = m6.getInt(i16);
                    T21 = i16;
                    int i18 = T22;
                    int i19 = m6.getInt(i18);
                    T22 = i18;
                    int i20 = T23;
                    int C2 = f.C(m6.getInt(i20));
                    T23 = i20;
                    int i21 = T24;
                    if (m6.getInt(i21) != 0) {
                        T24 = i21;
                        i6 = T25;
                        z5 = true;
                    } else {
                        T24 = i21;
                        i6 = T25;
                        z5 = false;
                    }
                    if (m6.getInt(i6) != 0) {
                        T25 = i6;
                        i7 = T26;
                        z6 = true;
                    } else {
                        T25 = i6;
                        i7 = T26;
                        z6 = false;
                    }
                    if (m6.getInt(i7) != 0) {
                        T26 = i7;
                        i8 = T27;
                        z7 = true;
                    } else {
                        T26 = i7;
                        i8 = T27;
                        z7 = false;
                    }
                    if (m6.getInt(i8) != 0) {
                        T27 = i8;
                        i9 = T28;
                        z8 = true;
                    } else {
                        T27 = i8;
                        i9 = T28;
                        z8 = false;
                    }
                    long j12 = m6.getLong(i9);
                    T28 = i9;
                    int i22 = T29;
                    long j13 = m6.getLong(i22);
                    T29 = i22;
                    int i23 = T30;
                    T30 = i23;
                    arrayList.add(new q(string, E5, string2, string3, a6, a7, j2, j6, j7, new C1416d(C2, z5, z6, z7, z8, j12, j13, f.d(m6.isNull(i23) ? null : m6.getBlob(i23))), i11, B5, j8, j9, j10, j11, z, D5, i17, i19));
                    T2 = i13;
                    i10 = i12;
                }
                m6.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m6.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = c2;
        }
    }

    public final ArrayList c() {
        X.k kVar;
        int T2;
        int T5;
        int T6;
        int T7;
        int T8;
        int T9;
        int T10;
        int T11;
        int T12;
        int T13;
        int T14;
        int T15;
        int T16;
        int T17;
        int i2;
        boolean z;
        int i3;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        X.k c2 = X.k.c(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            T2 = K1.b.T(m6, OutcomeConstants.OUTCOME_ID);
            T5 = K1.b.T(m6, "state");
            T6 = K1.b.T(m6, "worker_class_name");
            T7 = K1.b.T(m6, "input_merger_class_name");
            T8 = K1.b.T(m6, "input");
            T9 = K1.b.T(m6, "output");
            T10 = K1.b.T(m6, "initial_delay");
            T11 = K1.b.T(m6, "interval_duration");
            T12 = K1.b.T(m6, "flex_duration");
            T13 = K1.b.T(m6, "run_attempt_count");
            T14 = K1.b.T(m6, "backoff_policy");
            T15 = K1.b.T(m6, "backoff_delay_duration");
            T16 = K1.b.T(m6, "last_enqueue_time");
            T17 = K1.b.T(m6, "minimum_retention_duration");
            kVar = c2;
        } catch (Throwable th) {
            th = th;
            kVar = c2;
        }
        try {
            int T18 = K1.b.T(m6, "schedule_requested_at");
            int T19 = K1.b.T(m6, "run_in_foreground");
            int T20 = K1.b.T(m6, "out_of_quota_policy");
            int T21 = K1.b.T(m6, "period_count");
            int T22 = K1.b.T(m6, "generation");
            int T23 = K1.b.T(m6, "required_network_type");
            int T24 = K1.b.T(m6, "requires_charging");
            int T25 = K1.b.T(m6, "requires_device_idle");
            int T26 = K1.b.T(m6, "requires_battery_not_low");
            int T27 = K1.b.T(m6, "requires_storage_not_low");
            int T28 = K1.b.T(m6, "trigger_content_update_delay");
            int T29 = K1.b.T(m6, "trigger_max_content_delay");
            int T30 = K1.b.T(m6, "content_uri_triggers");
            int i9 = T17;
            ArrayList arrayList = new ArrayList(m6.getCount());
            while (m6.moveToNext()) {
                String string = m6.isNull(T2) ? null : m6.getString(T2);
                int E5 = f.E(m6.getInt(T5));
                String string2 = m6.isNull(T6) ? null : m6.getString(T6);
                String string3 = m6.isNull(T7) ? null : m6.getString(T7);
                s0.g a6 = s0.g.a(m6.isNull(T8) ? null : m6.getBlob(T8));
                s0.g a7 = s0.g.a(m6.isNull(T9) ? null : m6.getBlob(T9));
                long j2 = m6.getLong(T10);
                long j6 = m6.getLong(T11);
                long j7 = m6.getLong(T12);
                int i10 = m6.getInt(T13);
                int B5 = f.B(m6.getInt(T14));
                long j8 = m6.getLong(T15);
                long j9 = m6.getLong(T16);
                int i11 = i9;
                long j10 = m6.getLong(i11);
                int i12 = T2;
                int i13 = T18;
                long j11 = m6.getLong(i13);
                T18 = i13;
                int i14 = T19;
                if (m6.getInt(i14) != 0) {
                    T19 = i14;
                    i2 = T20;
                    z = true;
                } else {
                    T19 = i14;
                    i2 = T20;
                    z = false;
                }
                int D5 = f.D(m6.getInt(i2));
                T20 = i2;
                int i15 = T21;
                int i16 = m6.getInt(i15);
                T21 = i15;
                int i17 = T22;
                int i18 = m6.getInt(i17);
                T22 = i17;
                int i19 = T23;
                int C2 = f.C(m6.getInt(i19));
                T23 = i19;
                int i20 = T24;
                if (m6.getInt(i20) != 0) {
                    T24 = i20;
                    i3 = T25;
                    z5 = true;
                } else {
                    T24 = i20;
                    i3 = T25;
                    z5 = false;
                }
                if (m6.getInt(i3) != 0) {
                    T25 = i3;
                    i6 = T26;
                    z6 = true;
                } else {
                    T25 = i3;
                    i6 = T26;
                    z6 = false;
                }
                if (m6.getInt(i6) != 0) {
                    T26 = i6;
                    i7 = T27;
                    z7 = true;
                } else {
                    T26 = i6;
                    i7 = T27;
                    z7 = false;
                }
                if (m6.getInt(i7) != 0) {
                    T27 = i7;
                    i8 = T28;
                    z8 = true;
                } else {
                    T27 = i7;
                    i8 = T28;
                    z8 = false;
                }
                long j12 = m6.getLong(i8);
                T28 = i8;
                int i21 = T29;
                long j13 = m6.getLong(i21);
                T29 = i21;
                int i22 = T30;
                T30 = i22;
                arrayList.add(new q(string, E5, string2, string3, a6, a7, j2, j6, j7, new C1416d(C2, z5, z6, z7, z8, j12, j13, f.d(m6.isNull(i22) ? null : m6.getBlob(i22))), i10, B5, j8, j9, j10, j11, z, D5, i16, i18));
                T2 = i12;
                i9 = i11;
            }
            m6.close();
            kVar.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m6.close();
            kVar.g();
            throw th;
        }
    }

    public final ArrayList d() {
        X.k kVar;
        int T2;
        int T5;
        int T6;
        int T7;
        int T8;
        int T9;
        int T10;
        int T11;
        int T12;
        int T13;
        int T14;
        int T15;
        int T16;
        int T17;
        int i2;
        boolean z;
        int i3;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        X.k c2 = X.k.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            T2 = K1.b.T(m6, OutcomeConstants.OUTCOME_ID);
            T5 = K1.b.T(m6, "state");
            T6 = K1.b.T(m6, "worker_class_name");
            T7 = K1.b.T(m6, "input_merger_class_name");
            T8 = K1.b.T(m6, "input");
            T9 = K1.b.T(m6, "output");
            T10 = K1.b.T(m6, "initial_delay");
            T11 = K1.b.T(m6, "interval_duration");
            T12 = K1.b.T(m6, "flex_duration");
            T13 = K1.b.T(m6, "run_attempt_count");
            T14 = K1.b.T(m6, "backoff_policy");
            T15 = K1.b.T(m6, "backoff_delay_duration");
            T16 = K1.b.T(m6, "last_enqueue_time");
            T17 = K1.b.T(m6, "minimum_retention_duration");
            kVar = c2;
        } catch (Throwable th) {
            th = th;
            kVar = c2;
        }
        try {
            int T18 = K1.b.T(m6, "schedule_requested_at");
            int T19 = K1.b.T(m6, "run_in_foreground");
            int T20 = K1.b.T(m6, "out_of_quota_policy");
            int T21 = K1.b.T(m6, "period_count");
            int T22 = K1.b.T(m6, "generation");
            int T23 = K1.b.T(m6, "required_network_type");
            int T24 = K1.b.T(m6, "requires_charging");
            int T25 = K1.b.T(m6, "requires_device_idle");
            int T26 = K1.b.T(m6, "requires_battery_not_low");
            int T27 = K1.b.T(m6, "requires_storage_not_low");
            int T28 = K1.b.T(m6, "trigger_content_update_delay");
            int T29 = K1.b.T(m6, "trigger_max_content_delay");
            int T30 = K1.b.T(m6, "content_uri_triggers");
            int i9 = T17;
            ArrayList arrayList = new ArrayList(m6.getCount());
            while (m6.moveToNext()) {
                String string = m6.isNull(T2) ? null : m6.getString(T2);
                int E5 = f.E(m6.getInt(T5));
                String string2 = m6.isNull(T6) ? null : m6.getString(T6);
                String string3 = m6.isNull(T7) ? null : m6.getString(T7);
                s0.g a6 = s0.g.a(m6.isNull(T8) ? null : m6.getBlob(T8));
                s0.g a7 = s0.g.a(m6.isNull(T9) ? null : m6.getBlob(T9));
                long j2 = m6.getLong(T10);
                long j6 = m6.getLong(T11);
                long j7 = m6.getLong(T12);
                int i10 = m6.getInt(T13);
                int B5 = f.B(m6.getInt(T14));
                long j8 = m6.getLong(T15);
                long j9 = m6.getLong(T16);
                int i11 = i9;
                long j10 = m6.getLong(i11);
                int i12 = T2;
                int i13 = T18;
                long j11 = m6.getLong(i13);
                T18 = i13;
                int i14 = T19;
                if (m6.getInt(i14) != 0) {
                    T19 = i14;
                    i2 = T20;
                    z = true;
                } else {
                    T19 = i14;
                    i2 = T20;
                    z = false;
                }
                int D5 = f.D(m6.getInt(i2));
                T20 = i2;
                int i15 = T21;
                int i16 = m6.getInt(i15);
                T21 = i15;
                int i17 = T22;
                int i18 = m6.getInt(i17);
                T22 = i17;
                int i19 = T23;
                int C2 = f.C(m6.getInt(i19));
                T23 = i19;
                int i20 = T24;
                if (m6.getInt(i20) != 0) {
                    T24 = i20;
                    i3 = T25;
                    z5 = true;
                } else {
                    T24 = i20;
                    i3 = T25;
                    z5 = false;
                }
                if (m6.getInt(i3) != 0) {
                    T25 = i3;
                    i6 = T26;
                    z6 = true;
                } else {
                    T25 = i3;
                    i6 = T26;
                    z6 = false;
                }
                if (m6.getInt(i6) != 0) {
                    T26 = i6;
                    i7 = T27;
                    z7 = true;
                } else {
                    T26 = i6;
                    i7 = T27;
                    z7 = false;
                }
                if (m6.getInt(i7) != 0) {
                    T27 = i7;
                    i8 = T28;
                    z8 = true;
                } else {
                    T27 = i7;
                    i8 = T28;
                    z8 = false;
                }
                long j12 = m6.getLong(i8);
                T28 = i8;
                int i21 = T29;
                long j13 = m6.getLong(i21);
                T29 = i21;
                int i22 = T30;
                T30 = i22;
                arrayList.add(new q(string, E5, string2, string3, a6, a7, j2, j6, j7, new C1416d(C2, z5, z6, z7, z8, j12, j13, f.d(m6.isNull(i22) ? null : m6.getBlob(i22))), i10, B5, j8, j9, j10, j11, z, D5, i16, i18));
                T2 = i12;
                i9 = i11;
            }
            m6.close();
            kVar.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m6.close();
            kVar.g();
            throw th;
        }
    }

    public final int e(String str) {
        X.k c2 = X.k.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c2.j(1);
        } else {
            c2.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Integer num = null;
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            int i2 = 0;
            if (m6.moveToFirst()) {
                if (!m6.isNull(0)) {
                    num = Integer.valueOf(m6.getInt(0));
                }
                if (num != null) {
                    i2 = f.E(num.intValue());
                }
            }
            return i2;
        } finally {
            m6.close();
            c2.g();
        }
    }

    public final ArrayList f(String str) {
        X.k c2 = X.k.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c2.j(1);
        } else {
            c2.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            ArrayList arrayList = new ArrayList(m6.getCount());
            while (m6.moveToNext()) {
                arrayList.add(m6.isNull(0) ? null : m6.getString(0));
            }
            return arrayList;
        } finally {
            m6.close();
            c2.g();
        }
    }

    public final q g(String str) {
        X.k kVar;
        int T2;
        int T5;
        int T6;
        int T7;
        int T8;
        int T9;
        int T10;
        int T11;
        int T12;
        int T13;
        int T14;
        int T15;
        int T16;
        int T17;
        q qVar;
        boolean z;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        X.k c2 = X.k.c(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            c2.j(1);
        } else {
            c2.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            T2 = K1.b.T(m6, OutcomeConstants.OUTCOME_ID);
            T5 = K1.b.T(m6, "state");
            T6 = K1.b.T(m6, "worker_class_name");
            T7 = K1.b.T(m6, "input_merger_class_name");
            T8 = K1.b.T(m6, "input");
            T9 = K1.b.T(m6, "output");
            T10 = K1.b.T(m6, "initial_delay");
            T11 = K1.b.T(m6, "interval_duration");
            T12 = K1.b.T(m6, "flex_duration");
            T13 = K1.b.T(m6, "run_attempt_count");
            T14 = K1.b.T(m6, "backoff_policy");
            T15 = K1.b.T(m6, "backoff_delay_duration");
            T16 = K1.b.T(m6, "last_enqueue_time");
            T17 = K1.b.T(m6, "minimum_retention_duration");
            kVar = c2;
        } catch (Throwable th) {
            th = th;
            kVar = c2;
        }
        try {
            int T18 = K1.b.T(m6, "schedule_requested_at");
            int T19 = K1.b.T(m6, "run_in_foreground");
            int T20 = K1.b.T(m6, "out_of_quota_policy");
            int T21 = K1.b.T(m6, "period_count");
            int T22 = K1.b.T(m6, "generation");
            int T23 = K1.b.T(m6, "required_network_type");
            int T24 = K1.b.T(m6, "requires_charging");
            int T25 = K1.b.T(m6, "requires_device_idle");
            int T26 = K1.b.T(m6, "requires_battery_not_low");
            int T27 = K1.b.T(m6, "requires_storage_not_low");
            int T28 = K1.b.T(m6, "trigger_content_update_delay");
            int T29 = K1.b.T(m6, "trigger_max_content_delay");
            int T30 = K1.b.T(m6, "content_uri_triggers");
            if (m6.moveToFirst()) {
                String string = m6.isNull(T2) ? null : m6.getString(T2);
                int E5 = f.E(m6.getInt(T5));
                String string2 = m6.isNull(T6) ? null : m6.getString(T6);
                String string3 = m6.isNull(T7) ? null : m6.getString(T7);
                s0.g a6 = s0.g.a(m6.isNull(T8) ? null : m6.getBlob(T8));
                s0.g a7 = s0.g.a(m6.isNull(T9) ? null : m6.getBlob(T9));
                long j2 = m6.getLong(T10);
                long j6 = m6.getLong(T11);
                long j7 = m6.getLong(T12);
                int i9 = m6.getInt(T13);
                int B5 = f.B(m6.getInt(T14));
                long j8 = m6.getLong(T15);
                long j9 = m6.getLong(T16);
                long j10 = m6.getLong(T17);
                long j11 = m6.getLong(T18);
                if (m6.getInt(T19) != 0) {
                    i2 = T20;
                    z = true;
                } else {
                    z = false;
                    i2 = T20;
                }
                int D5 = f.D(m6.getInt(i2));
                int i10 = m6.getInt(T21);
                int i11 = m6.getInt(T22);
                int C2 = f.C(m6.getInt(T23));
                if (m6.getInt(T24) != 0) {
                    i3 = T25;
                    z5 = true;
                } else {
                    z5 = false;
                    i3 = T25;
                }
                if (m6.getInt(i3) != 0) {
                    i6 = T26;
                    z6 = true;
                } else {
                    z6 = false;
                    i6 = T26;
                }
                if (m6.getInt(i6) != 0) {
                    i7 = T27;
                    z7 = true;
                } else {
                    z7 = false;
                    i7 = T27;
                }
                if (m6.getInt(i7) != 0) {
                    i8 = T28;
                    z8 = true;
                } else {
                    z8 = false;
                    i8 = T28;
                }
                qVar = new q(string, E5, string2, string3, a6, a7, j2, j6, j7, new C1416d(C2, z5, z6, z7, z8, m6.getLong(i8), m6.getLong(T29), f.d(m6.isNull(T30) ? null : m6.getBlob(T30))), i9, B5, j8, j9, j10, j11, z, D5, i10, i11);
            } else {
                qVar = null;
            }
            m6.close();
            kVar.g();
            return qVar;
        } catch (Throwable th2) {
            th = th2;
            m6.close();
            kVar.g();
            throw th;
        }
    }

    public final void h(long j2, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        h hVar = this.f202j;
        C0307i a6 = hVar.a();
        a6.t(1, j2);
        if (str == null) {
            a6.j(2);
        } else {
            a6.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a6);
        }
    }

    public final void i(long j2, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        h hVar = this.f199g;
        C0307i a6 = hVar.a();
        a6.t(1, j2);
        if (str == null) {
            a6.j(2);
        } else {
            a6.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a6);
        }
    }

    public final void j(String str, s0.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        h hVar = this.f198f;
        C0307i a6 = hVar.a();
        byte[] c2 = s0.g.c(gVar);
        if (c2 == null) {
            a6.j(1);
        } else {
            a6.w(1, c2);
        }
        if (str == null) {
            a6.j(2);
        } else {
            a6.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a6);
        }
    }

    public final void k(int i2, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f193a;
        workDatabase_Impl.b();
        h hVar = this.f196d;
        C0307i a6 = hVar.a();
        a6.t(1, f.K(i2));
        if (str == null) {
            a6.j(2);
        } else {
            a6.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a6);
        }
    }
}
