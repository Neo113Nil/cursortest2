package u0;

import a.AbstractC0219a;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import m1.AbstractC0521b;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f6020a;

    /* renamed from: b, reason: collision with root package name */
    public final C0672b f6021b;

    /* renamed from: c, reason: collision with root package name */
    public final C0678h f6022c;

    /* renamed from: d, reason: collision with root package name */
    public final C0678h f6023d;

    /* renamed from: e, reason: collision with root package name */
    public final C0678h f6024e;

    /* renamed from: f, reason: collision with root package name */
    public final C0678h f6025f;

    /* renamed from: g, reason: collision with root package name */
    public final C0678h f6026g;

    /* renamed from: h, reason: collision with root package name */
    public final C0678h f6027h;

    /* renamed from: i, reason: collision with root package name */
    public final C0678h f6028i;

    /* renamed from: j, reason: collision with root package name */
    public final C0678h f6029j;

    /* renamed from: k, reason: collision with root package name */
    public final C0678h f6030k;

    public C0687q(WorkDatabase_Impl workDatabase_Impl) {
        this.f6020a = workDatabase_Impl;
        this.f6021b = new C0672b(workDatabase_Impl, 5);
        new C0678h(workDatabase_Impl, 8);
        this.f6022c = new C0678h(workDatabase_Impl, 9);
        this.f6023d = new C0678h(workDatabase_Impl, 10);
        this.f6024e = new C0678h(workDatabase_Impl, 11);
        this.f6025f = new C0678h(workDatabase_Impl, 12);
        this.f6026g = new C0678h(workDatabase_Impl, 13);
        this.f6027h = new C0678h(workDatabase_Impl, 14);
        this.f6028i = new C0678h(workDatabase_Impl, 15);
        this.f6029j = new C0678h(workDatabase_Impl, 4);
        this.f6030k = new C0678h(workDatabase_Impl, 5);
        new C0678h(workDatabase_Impl, 6);
        new C0678h(workDatabase_Impl, 7);
    }

    public final ArrayList a() {
        Q.k kVar;
        Q.k e4 = Q.k.e("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        e4.t(200, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
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
            int q17 = AbstractC0219a.q(m4, "backoff_delay_duration");
            int q18 = AbstractC0219a.q(m4, "last_enqueue_time");
            kVar = e4;
            try {
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
                    l0.g a7 = l0.g.a(m4.isNull(q10) ? null : m4.getBlob(q10));
                    l0.g a8 = l0.g.a(m4.isNull(q11) ? null : m4.getBlob(q11));
                    long j4 = m4.getLong(q12);
                    long j7 = m4.getLong(q13);
                    long j8 = m4.getLong(q14);
                    int i8 = m4.getInt(q15);
                    int p4 = AbstractC0521b.p(m4.getInt(q16));
                    long j9 = m4.getLong(q17);
                    long j10 = m4.getLong(q18);
                    int i9 = i7;
                    long j11 = m4.getLong(i9);
                    int i10 = q6;
                    int i11 = q20;
                    long j12 = m4.getLong(i11);
                    q20 = i11;
                    int i12 = q21;
                    boolean z5 = m4.getInt(i12) != 0;
                    q21 = i12;
                    int i13 = q22;
                    int r6 = AbstractC0521b.r(m4.getInt(i13));
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
                    arrayList.add(new C0686p(string, s6, string2, string3, a7, a8, j4, j7, j8, new l0.d(q33, z6, z7, z8, z9, j13, j14, AbstractC0521b.e(bArr)), i8, p4, j9, j10, j11, j12, z5, r6, i15, i17));
                    q6 = i10;
                    i7 = i9;
                }
                m4.close();
                kVar.g();
                return arrayList;
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

    public final ArrayList b(int i7) {
        Q.k kVar;
        Q.k e4 = Q.k.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e4.t(i7, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
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
            int q17 = AbstractC0219a.q(m4, "backoff_delay_duration");
            int q18 = AbstractC0219a.q(m4, "last_enqueue_time");
            kVar = e4;
            try {
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
                int i8 = q19;
                ArrayList arrayList = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    byte[] bArr = null;
                    String string = m4.isNull(q6) ? null : m4.getString(q6);
                    int s6 = AbstractC0521b.s(m4.getInt(q7));
                    String string2 = m4.isNull(q8) ? null : m4.getString(q8);
                    String string3 = m4.isNull(q9) ? null : m4.getString(q9);
                    l0.g a7 = l0.g.a(m4.isNull(q10) ? null : m4.getBlob(q10));
                    l0.g a8 = l0.g.a(m4.isNull(q11) ? null : m4.getBlob(q11));
                    long j4 = m4.getLong(q12);
                    long j7 = m4.getLong(q13);
                    long j8 = m4.getLong(q14);
                    int i9 = m4.getInt(q15);
                    int p4 = AbstractC0521b.p(m4.getInt(q16));
                    long j9 = m4.getLong(q17);
                    long j10 = m4.getLong(q18);
                    int i10 = i8;
                    long j11 = m4.getLong(i10);
                    int i11 = q6;
                    int i12 = q20;
                    long j12 = m4.getLong(i12);
                    q20 = i12;
                    int i13 = q21;
                    boolean z5 = m4.getInt(i13) != 0;
                    q21 = i13;
                    int i14 = q22;
                    int r6 = AbstractC0521b.r(m4.getInt(i14));
                    q22 = i14;
                    int i15 = q23;
                    int i16 = m4.getInt(i15);
                    q23 = i15;
                    int i17 = q24;
                    int i18 = m4.getInt(i17);
                    q24 = i17;
                    int i19 = q25;
                    int q33 = AbstractC0521b.q(m4.getInt(i19));
                    q25 = i19;
                    int i20 = q26;
                    boolean z6 = m4.getInt(i20) != 0;
                    q26 = i20;
                    int i21 = q27;
                    boolean z7 = m4.getInt(i21) != 0;
                    q27 = i21;
                    int i22 = q28;
                    boolean z8 = m4.getInt(i22) != 0;
                    q28 = i22;
                    int i23 = q29;
                    boolean z9 = m4.getInt(i23) != 0;
                    q29 = i23;
                    int i24 = q30;
                    long j13 = m4.getLong(i24);
                    q30 = i24;
                    int i25 = q31;
                    long j14 = m4.getLong(i25);
                    q31 = i25;
                    int i26 = q32;
                    if (!m4.isNull(i26)) {
                        bArr = m4.getBlob(i26);
                    }
                    q32 = i26;
                    arrayList.add(new C0686p(string, s6, string2, string3, a7, a8, j4, j7, j8, new l0.d(q33, z6, z7, z8, z9, j13, j14, AbstractC0521b.e(bArr)), i9, p4, j9, j10, j11, j12, z5, r6, i16, i18));
                    q6 = i11;
                    i8 = i10;
                }
                m4.close();
                kVar.g();
                return arrayList;
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

    public final ArrayList c() {
        Q.k kVar;
        int q6;
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
        Q.k e4 = Q.k.e("SELECT * FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            q6 = AbstractC0219a.q(m4, "id");
            q7 = AbstractC0219a.q(m4, "state");
            q8 = AbstractC0219a.q(m4, "worker_class_name");
            q9 = AbstractC0219a.q(m4, "input_merger_class_name");
            q10 = AbstractC0219a.q(m4, "input");
            q11 = AbstractC0219a.q(m4, "output");
            q12 = AbstractC0219a.q(m4, "initial_delay");
            q13 = AbstractC0219a.q(m4, "interval_duration");
            q14 = AbstractC0219a.q(m4, "flex_duration");
            q15 = AbstractC0219a.q(m4, "run_attempt_count");
            q16 = AbstractC0219a.q(m4, "backoff_policy");
            q17 = AbstractC0219a.q(m4, "backoff_delay_duration");
            q18 = AbstractC0219a.q(m4, "last_enqueue_time");
            kVar = e4;
        } catch (Throwable th) {
            th = th;
            kVar = e4;
        }
        try {
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
                l0.g a7 = l0.g.a(m4.isNull(q10) ? null : m4.getBlob(q10));
                l0.g a8 = l0.g.a(m4.isNull(q11) ? null : m4.getBlob(q11));
                long j4 = m4.getLong(q12);
                long j7 = m4.getLong(q13);
                long j8 = m4.getLong(q14);
                int i8 = m4.getInt(q15);
                int p4 = AbstractC0521b.p(m4.getInt(q16));
                long j9 = m4.getLong(q17);
                long j10 = m4.getLong(q18);
                int i9 = i7;
                long j11 = m4.getLong(i9);
                int i10 = q6;
                int i11 = q20;
                long j12 = m4.getLong(i11);
                q20 = i11;
                int i12 = q21;
                boolean z5 = m4.getInt(i12) != 0;
                q21 = i12;
                int i13 = q22;
                int r6 = AbstractC0521b.r(m4.getInt(i13));
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
                arrayList.add(new C0686p(string, s6, string2, string3, a7, a8, j4, j7, j8, new l0.d(q33, z6, z7, z8, z9, j13, j14, AbstractC0521b.e(bArr)), i8, p4, j9, j10, j11, j12, z5, r6, i15, i17));
                q6 = i10;
                i7 = i9;
            }
            m4.close();
            kVar.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m4.close();
            kVar.g();
            throw th;
        }
    }

    public final ArrayList d() {
        Q.k kVar;
        int q6;
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
        Q.k e4 = Q.k.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            q6 = AbstractC0219a.q(m4, "id");
            q7 = AbstractC0219a.q(m4, "state");
            q8 = AbstractC0219a.q(m4, "worker_class_name");
            q9 = AbstractC0219a.q(m4, "input_merger_class_name");
            q10 = AbstractC0219a.q(m4, "input");
            q11 = AbstractC0219a.q(m4, "output");
            q12 = AbstractC0219a.q(m4, "initial_delay");
            q13 = AbstractC0219a.q(m4, "interval_duration");
            q14 = AbstractC0219a.q(m4, "flex_duration");
            q15 = AbstractC0219a.q(m4, "run_attempt_count");
            q16 = AbstractC0219a.q(m4, "backoff_policy");
            q17 = AbstractC0219a.q(m4, "backoff_delay_duration");
            q18 = AbstractC0219a.q(m4, "last_enqueue_time");
            kVar = e4;
        } catch (Throwable th) {
            th = th;
            kVar = e4;
        }
        try {
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
                l0.g a7 = l0.g.a(m4.isNull(q10) ? null : m4.getBlob(q10));
                l0.g a8 = l0.g.a(m4.isNull(q11) ? null : m4.getBlob(q11));
                long j4 = m4.getLong(q12);
                long j7 = m4.getLong(q13);
                long j8 = m4.getLong(q14);
                int i8 = m4.getInt(q15);
                int p4 = AbstractC0521b.p(m4.getInt(q16));
                long j9 = m4.getLong(q17);
                long j10 = m4.getLong(q18);
                int i9 = i7;
                long j11 = m4.getLong(i9);
                int i10 = q6;
                int i11 = q20;
                long j12 = m4.getLong(i11);
                q20 = i11;
                int i12 = q21;
                boolean z5 = m4.getInt(i12) != 0;
                q21 = i12;
                int i13 = q22;
                int r6 = AbstractC0521b.r(m4.getInt(i13));
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
                arrayList.add(new C0686p(string, s6, string2, string3, a7, a8, j4, j7, j8, new l0.d(q33, z6, z7, z8, z9, j13, j14, AbstractC0521b.e(bArr)), i8, p4, j9, j10, j11, j12, z5, r6, i15, i17));
                q6 = i10;
                i7 = i9;
            }
            m4.close();
            kVar.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m4.close();
            kVar.g();
            throw th;
        }
    }

    public final int e(String str) {
        Q.k e4 = Q.k.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e4.o(1);
        } else {
            e4.B(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            int i7 = 0;
            if (m4.moveToFirst()) {
                Integer valueOf = m4.isNull(0) ? null : Integer.valueOf(m4.getInt(0));
                if (valueOf != null) {
                    i7 = AbstractC0521b.s(valueOf.intValue());
                }
            }
            return i7;
        } finally {
            m4.close();
            e4.g();
        }
    }

    public final ArrayList f(String str) {
        Q.k e4 = Q.k.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e4.o(1);
        } else {
            e4.B(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            return arrayList;
        } finally {
            m4.close();
            e4.g();
        }
    }

    public final C0686p g(String str) {
        Q.k kVar;
        int q6;
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
        Q.k e4 = Q.k.e("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            e4.o(1);
        } else {
            e4.B(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            q6 = AbstractC0219a.q(m4, "id");
            q7 = AbstractC0219a.q(m4, "state");
            q8 = AbstractC0219a.q(m4, "worker_class_name");
            q9 = AbstractC0219a.q(m4, "input_merger_class_name");
            q10 = AbstractC0219a.q(m4, "input");
            q11 = AbstractC0219a.q(m4, "output");
            q12 = AbstractC0219a.q(m4, "initial_delay");
            q13 = AbstractC0219a.q(m4, "interval_duration");
            q14 = AbstractC0219a.q(m4, "flex_duration");
            q15 = AbstractC0219a.q(m4, "run_attempt_count");
            q16 = AbstractC0219a.q(m4, "backoff_policy");
            q17 = AbstractC0219a.q(m4, "backoff_delay_duration");
            q18 = AbstractC0219a.q(m4, "last_enqueue_time");
            kVar = e4;
        } catch (Throwable th) {
            th = th;
            kVar = e4;
        }
        try {
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
            C0686p c0686p = null;
            byte[] blob = null;
            if (m4.moveToFirst()) {
                String string = m4.isNull(q6) ? null : m4.getString(q6);
                int s6 = AbstractC0521b.s(m4.getInt(q7));
                String string2 = m4.isNull(q8) ? null : m4.getString(q8);
                String string3 = m4.isNull(q9) ? null : m4.getString(q9);
                l0.g a7 = l0.g.a(m4.isNull(q10) ? null : m4.getBlob(q10));
                l0.g a8 = l0.g.a(m4.isNull(q11) ? null : m4.getBlob(q11));
                long j4 = m4.getLong(q12);
                long j7 = m4.getLong(q13);
                long j8 = m4.getLong(q14);
                int i7 = m4.getInt(q15);
                int p4 = AbstractC0521b.p(m4.getInt(q16));
                long j9 = m4.getLong(q17);
                long j10 = m4.getLong(q18);
                long j11 = m4.getLong(q19);
                long j12 = m4.getLong(q20);
                boolean z5 = m4.getInt(q21) != 0;
                int r6 = AbstractC0521b.r(m4.getInt(q22));
                int i8 = m4.getInt(q23);
                int i9 = m4.getInt(q24);
                int q33 = AbstractC0521b.q(m4.getInt(q25));
                boolean z6 = m4.getInt(q26) != 0;
                boolean z7 = m4.getInt(q27) != 0;
                boolean z8 = m4.getInt(q28) != 0;
                boolean z9 = m4.getInt(q29) != 0;
                long j13 = m4.getLong(q30);
                long j14 = m4.getLong(q31);
                if (!m4.isNull(q32)) {
                    blob = m4.getBlob(q32);
                }
                c0686p = new C0686p(string, s6, string2, string3, a7, a8, j4, j7, j8, new l0.d(q33, z6, z7, z8, z9, j13, j14, AbstractC0521b.e(blob)), i7, p4, j9, j10, j11, j12, z5, r6, i8, i9);
            }
            m4.close();
            kVar.g();
            return c0686p;
        } catch (Throwable th2) {
            th = th2;
            m4.close();
            kVar.g();
            throw th;
        }
    }

    public final void h(long j4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        C0678h c0678h = this.f6029j;
        V.i a7 = c0678h.a();
        a7.t(j4, 1);
        if (str == null) {
            a7.o(2);
        } else {
            a7.B(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            c0678h.n(a7);
        }
    }

    public final void i(long j4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        C0678h c0678h = this.f6026g;
        V.i a7 = c0678h.a();
        a7.t(j4, 1);
        if (str == null) {
            a7.o(2);
        } else {
            a7.B(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            c0678h.n(a7);
        }
    }

    public final void j(String str, l0.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        C0678h c0678h = this.f6025f;
        V.i a7 = c0678h.a();
        byte[] c7 = l0.g.c(gVar);
        if (c7 == null) {
            a7.o(1);
        } else {
            a7.A(1, c7);
        }
        if (str == null) {
            a7.o(2);
        } else {
            a7.B(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            c0678h.n(a7);
        }
    }

    public final void k(String str, int i7) {
        WorkDatabase_Impl workDatabase_Impl = this.f6020a;
        workDatabase_Impl.b();
        C0678h c0678h = this.f6023d;
        V.i a7 = c0678h.a();
        a7.t(AbstractC0521b.D(i7), 1);
        if (str == null) {
            a7.o(2);
        } else {
            a7.B(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            c0678h.n(a7);
        }
    }
}
