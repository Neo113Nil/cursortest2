package P0;

import G0.A;
import G0.EnumC0101a;
import G0.t;
import G0.z;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import h0.C0465k;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f2239a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2240b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2241c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2242d;

    /* renamed from: e, reason: collision with root package name */
    public final h f2243e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2244f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2245g;

    /* renamed from: h, reason: collision with root package name */
    public final h f2246h;

    /* renamed from: i, reason: collision with root package name */
    public final h f2247i;
    public final h j;

    /* renamed from: k, reason: collision with root package name */
    public final h f2248k;

    public q(WorkDatabase_Impl database) {
        this.f2239a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f2240b = new b(database, 5);
        Intrinsics.checkNotNullParameter(database, "database");
        new h(database, 8);
        this.f2241c = new h(database, 9);
        this.f2242d = new h(database, 10);
        this.f2243e = new h(database, 11);
        this.f2244f = new h(database, 12);
        this.f2245g = new h(database, 13);
        this.f2246h = new h(database, 14);
        this.f2247i = new h(database, 15);
        this.j = new h(database, 4);
        this.f2248k = new h(database, 5);
        new h(database, 6);
        new h(database, 7);
    }

    public final ArrayList a() {
        C0465k c0465k;
        C0465k g7 = C0465k.g(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        g7.r(200, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            int q4 = f.q(J7, "id");
            int q7 = f.q(J7, "state");
            int q8 = f.q(J7, "worker_class_name");
            int q9 = f.q(J7, "input_merger_class_name");
            int q10 = f.q(J7, "input");
            int q11 = f.q(J7, "output");
            int q12 = f.q(J7, "initial_delay");
            int q13 = f.q(J7, "interval_duration");
            int q14 = f.q(J7, "flex_duration");
            int q15 = f.q(J7, "run_attempt_count");
            int q16 = f.q(J7, "backoff_policy");
            int q17 = f.q(J7, "backoff_delay_duration");
            int q18 = f.q(J7, "last_enqueue_time");
            c0465k = g7;
            try {
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
                    A U4 = O6.g.U(J7.getInt(q7));
                    String string2 = J7.isNull(q8) ? null : J7.getString(q8);
                    String string3 = J7.isNull(q9) ? null : J7.getString(q9);
                    G0.h a7 = G0.h.a(J7.isNull(q10) ? null : J7.getBlob(q10));
                    G0.h a8 = G0.h.a(J7.isNull(q11) ? null : J7.getBlob(q11));
                    long j = J7.getLong(q12);
                    long j7 = J7.getLong(q13);
                    long j8 = J7.getLong(q14);
                    int i5 = J7.getInt(q15);
                    EnumC0101a R4 = O6.g.R(J7.getInt(q16));
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
                    z T4 = O6.g.T(J7.getInt(i11));
                    q22 = i11;
                    int i12 = q23;
                    int i13 = J7.getInt(i12);
                    q23 = i12;
                    int i14 = q24;
                    int i15 = J7.getInt(i14);
                    q24 = i14;
                    int i16 = q25;
                    t S7 = O6.g.S(J7.getInt(i16));
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
                    arrayList.add(new p(string, U4, string2, string3, a7, a8, j, j7, j8, new G0.e(S7, z8, z9, z10, z11, j13, j14, O6.g.y(bArr)), i5, R4, j9, j10, j11, j12, z7, T4, i13, i15));
                    q18 = i8;
                    i2 = i7;
                }
                J7.close();
                c0465k.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                J7.close();
                c0465k.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0465k = g7;
        }
    }

    public final ArrayList b(int i2) {
        C0465k c0465k;
        C0465k g7 = C0465k.g(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        g7.r(i2, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            int q4 = f.q(J7, "id");
            int q7 = f.q(J7, "state");
            int q8 = f.q(J7, "worker_class_name");
            int q9 = f.q(J7, "input_merger_class_name");
            int q10 = f.q(J7, "input");
            int q11 = f.q(J7, "output");
            int q12 = f.q(J7, "initial_delay");
            int q13 = f.q(J7, "interval_duration");
            int q14 = f.q(J7, "flex_duration");
            int q15 = f.q(J7, "run_attempt_count");
            int q16 = f.q(J7, "backoff_policy");
            int q17 = f.q(J7, "backoff_delay_duration");
            int q18 = f.q(J7, "last_enqueue_time");
            c0465k = g7;
            try {
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
                int i5 = q19;
                ArrayList arrayList = new ArrayList(J7.getCount());
                while (J7.moveToNext()) {
                    byte[] bArr = null;
                    String string = J7.isNull(q4) ? null : J7.getString(q4);
                    A U4 = O6.g.U(J7.getInt(q7));
                    String string2 = J7.isNull(q8) ? null : J7.getString(q8);
                    String string3 = J7.isNull(q9) ? null : J7.getString(q9);
                    G0.h a7 = G0.h.a(J7.isNull(q10) ? null : J7.getBlob(q10));
                    G0.h a8 = G0.h.a(J7.isNull(q11) ? null : J7.getBlob(q11));
                    long j = J7.getLong(q12);
                    long j7 = J7.getLong(q13);
                    long j8 = J7.getLong(q14);
                    int i7 = J7.getInt(q15);
                    EnumC0101a R4 = O6.g.R(J7.getInt(q16));
                    long j9 = J7.getLong(q17);
                    long j10 = J7.getLong(q18);
                    int i8 = i5;
                    long j11 = J7.getLong(i8);
                    int i9 = q18;
                    int i10 = q20;
                    long j12 = J7.getLong(i10);
                    q20 = i10;
                    int i11 = q21;
                    boolean z7 = J7.getInt(i11) != 0;
                    q21 = i11;
                    int i12 = q22;
                    z T4 = O6.g.T(J7.getInt(i12));
                    q22 = i12;
                    int i13 = q23;
                    int i14 = J7.getInt(i13);
                    q23 = i13;
                    int i15 = q24;
                    int i16 = J7.getInt(i15);
                    q24 = i15;
                    int i17 = q25;
                    t S7 = O6.g.S(J7.getInt(i17));
                    q25 = i17;
                    int i18 = q26;
                    boolean z8 = J7.getInt(i18) != 0;
                    q26 = i18;
                    int i19 = q27;
                    boolean z9 = J7.getInt(i19) != 0;
                    q27 = i19;
                    int i20 = q28;
                    boolean z10 = J7.getInt(i20) != 0;
                    q28 = i20;
                    int i21 = q29;
                    boolean z11 = J7.getInt(i21) != 0;
                    q29 = i21;
                    int i22 = q30;
                    long j13 = J7.getLong(i22);
                    q30 = i22;
                    int i23 = q31;
                    long j14 = J7.getLong(i23);
                    q31 = i23;
                    int i24 = q32;
                    if (!J7.isNull(i24)) {
                        bArr = J7.getBlob(i24);
                    }
                    q32 = i24;
                    arrayList.add(new p(string, U4, string2, string3, a7, a8, j, j7, j8, new G0.e(S7, z8, z9, z10, z11, j13, j14, O6.g.y(bArr)), i7, R4, j9, j10, j11, j12, z7, T4, i14, i16));
                    q18 = i9;
                    i5 = i8;
                }
                J7.close();
                c0465k.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                J7.close();
                c0465k.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0465k = g7;
        }
    }

    public final ArrayList c() {
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
        int q17;
        int q18;
        C0465k g7 = C0465k.g(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
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
            q17 = f.q(J7, "backoff_delay_duration");
            q18 = f.q(J7, "last_enqueue_time");
            c0465k = g7;
        } catch (Throwable th) {
            th = th;
            c0465k = g7;
        }
        try {
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
                A U4 = O6.g.U(J7.getInt(q7));
                String string2 = J7.isNull(q8) ? null : J7.getString(q8);
                String string3 = J7.isNull(q9) ? null : J7.getString(q9);
                G0.h a7 = G0.h.a(J7.isNull(q10) ? null : J7.getBlob(q10));
                G0.h a8 = G0.h.a(J7.isNull(q11) ? null : J7.getBlob(q11));
                long j = J7.getLong(q12);
                long j7 = J7.getLong(q13);
                long j8 = J7.getLong(q14);
                int i5 = J7.getInt(q15);
                EnumC0101a R4 = O6.g.R(J7.getInt(q16));
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
                z T4 = O6.g.T(J7.getInt(i11));
                q22 = i11;
                int i12 = q23;
                int i13 = J7.getInt(i12);
                q23 = i12;
                int i14 = q24;
                int i15 = J7.getInt(i14);
                q24 = i14;
                int i16 = q25;
                t S7 = O6.g.S(J7.getInt(i16));
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
                arrayList.add(new p(string, U4, string2, string3, a7, a8, j, j7, j8, new G0.e(S7, z8, z9, z10, z11, j13, j14, O6.g.y(bArr)), i5, R4, j9, j10, j11, j12, z7, T4, i13, i15));
                q18 = i8;
                i2 = i7;
            }
            J7.close();
            c0465k.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            J7.close();
            c0465k.h();
            throw th;
        }
    }

    public final ArrayList d() {
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
        int q17;
        int q18;
        C0465k g7 = C0465k.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
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
            q17 = f.q(J7, "backoff_delay_duration");
            q18 = f.q(J7, "last_enqueue_time");
            c0465k = g7;
        } catch (Throwable th) {
            th = th;
            c0465k = g7;
        }
        try {
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
                A U4 = O6.g.U(J7.getInt(q7));
                String string2 = J7.isNull(q8) ? null : J7.getString(q8);
                String string3 = J7.isNull(q9) ? null : J7.getString(q9);
                G0.h a7 = G0.h.a(J7.isNull(q10) ? null : J7.getBlob(q10));
                G0.h a8 = G0.h.a(J7.isNull(q11) ? null : J7.getBlob(q11));
                long j = J7.getLong(q12);
                long j7 = J7.getLong(q13);
                long j8 = J7.getLong(q14);
                int i5 = J7.getInt(q15);
                EnumC0101a R4 = O6.g.R(J7.getInt(q16));
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
                z T4 = O6.g.T(J7.getInt(i11));
                q22 = i11;
                int i12 = q23;
                int i13 = J7.getInt(i12);
                q23 = i12;
                int i14 = q24;
                int i15 = J7.getInt(i14);
                q24 = i14;
                int i16 = q25;
                t S7 = O6.g.S(J7.getInt(i16));
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
                arrayList.add(new p(string, U4, string2, string3, a7, a8, j, j7, j8, new G0.e(S7, z8, z9, z10, z11, j13, j14, O6.g.y(bArr)), i5, R4, j9, j10, j11, j12, z7, T4, i13, i15));
                q18 = i8;
                i2 = i7;
            }
            J7.close();
            c0465k.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            J7.close();
            c0465k.h();
            throw th;
        }
    }

    public final A e(String str) {
        C0465k g7 = C0465k.g(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            g7.l(1);
        } else {
            g7.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            A a7 = null;
            if (J7.moveToFirst()) {
                Integer valueOf = J7.isNull(0) ? null : Integer.valueOf(J7.getInt(0));
                if (valueOf != null) {
                    a7 = O6.g.U(valueOf.intValue());
                }
            }
            return a7;
        } finally {
            J7.close();
            g7.h();
        }
    }

    public final ArrayList f(String str) {
        C0465k g7 = C0465k.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            g7.l(1);
        } else {
            g7.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            ArrayList arrayList = new ArrayList(J7.getCount());
            while (J7.moveToNext()) {
                arrayList.add(J7.isNull(0) ? null : J7.getString(0));
            }
            return arrayList;
        } finally {
            J7.close();
            g7.h();
        }
    }

    public final p g(String str) {
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
        int q17;
        int q18;
        C0465k g7 = C0465k.g(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            g7.l(1);
        } else {
            g7.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
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
            q17 = f.q(J7, "backoff_delay_duration");
            q18 = f.q(J7, "last_enqueue_time");
            c0465k = g7;
        } catch (Throwable th) {
            th = th;
            c0465k = g7;
        }
        try {
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
            p pVar = null;
            byte[] blob = null;
            if (J7.moveToFirst()) {
                String string = J7.isNull(q4) ? null : J7.getString(q4);
                A U4 = O6.g.U(J7.getInt(q7));
                String string2 = J7.isNull(q8) ? null : J7.getString(q8);
                String string3 = J7.isNull(q9) ? null : J7.getString(q9);
                G0.h a7 = G0.h.a(J7.isNull(q10) ? null : J7.getBlob(q10));
                G0.h a8 = G0.h.a(J7.isNull(q11) ? null : J7.getBlob(q11));
                long j = J7.getLong(q12);
                long j7 = J7.getLong(q13);
                long j8 = J7.getLong(q14);
                int i2 = J7.getInt(q15);
                EnumC0101a R4 = O6.g.R(J7.getInt(q16));
                long j9 = J7.getLong(q17);
                long j10 = J7.getLong(q18);
                long j11 = J7.getLong(q19);
                long j12 = J7.getLong(q20);
                boolean z7 = J7.getInt(q21) != 0;
                z T4 = O6.g.T(J7.getInt(q22));
                int i5 = J7.getInt(q23);
                int i7 = J7.getInt(q24);
                t S7 = O6.g.S(J7.getInt(q25));
                boolean z8 = J7.getInt(q26) != 0;
                boolean z9 = J7.getInt(q27) != 0;
                boolean z10 = J7.getInt(q28) != 0;
                boolean z11 = J7.getInt(q29) != 0;
                long j13 = J7.getLong(q30);
                long j14 = J7.getLong(q31);
                if (!J7.isNull(q32)) {
                    blob = J7.getBlob(q32);
                }
                pVar = new p(string, U4, string2, string3, a7, a8, j, j7, j8, new G0.e(S7, z8, z9, z10, z11, j13, j14, O6.g.y(blob)), i2, R4, j9, j10, j11, j12, z7, T4, i5, i7);
            }
            J7.close();
            c0465k.h();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            J7.close();
            c0465k.h();
            throw th;
        }
    }

    public final void h(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        h hVar = this.j;
        m0.j a7 = hVar.a();
        a7.r(j, 1);
        if (str == null) {
            a7.l(2);
        } else {
            a7.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a7);
        }
    }

    public final void i(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        h hVar = this.f2245g;
        m0.j a7 = hVar.a();
        a7.r(j, 1);
        if (str == null) {
            a7.l(2);
        } else {
            a7.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a7);
        }
    }

    public final void j(String str, G0.h hVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        h hVar2 = this.f2244f;
        m0.j a7 = hVar2.a();
        byte[] c7 = G0.h.c(hVar);
        if (c7 == null) {
            a7.l(1);
        } else {
            a7.D(c7, 1);
        }
        if (str == null) {
            a7.l(2);
        } else {
            a7.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar2.d(a7);
        }
    }

    public final void k(A a7, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f2239a;
        workDatabase_Impl.b();
        h hVar = this.f2242d;
        m0.j a8 = hVar.a();
        a8.r(O6.g.Y(a7), 1);
        if (str == null) {
            a8.l(2);
        } else {
            a8.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a8.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a8);
        }
    }
}
