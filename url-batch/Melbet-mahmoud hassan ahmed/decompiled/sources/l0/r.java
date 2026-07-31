package l0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import l0.p;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18497a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<p> f18498b;

    /* renamed from: c, reason: collision with root package name */
    private final t.d f18499c;

    /* renamed from: d, reason: collision with root package name */
    private final t.d f18500d;

    /* renamed from: e, reason: collision with root package name */
    private final t.d f18501e;

    /* renamed from: f, reason: collision with root package name */
    private final t.d f18502f;

    /* renamed from: g, reason: collision with root package name */
    private final t.d f18503g;

    /* renamed from: h, reason: collision with root package name */
    private final t.d f18504h;

    /* renamed from: i, reason: collision with root package name */
    private final t.d f18505i;

    /* renamed from: j, reason: collision with root package name */
    private final t.d f18506j;

    class a extends t.a<p> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, p pVar) {
            String str = pVar.f18477a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            fVar.z(2, v.j(pVar.f18478b));
            String str2 = pVar.f18479c;
            if (str2 == null) {
                fVar.o(3);
            } else {
                fVar.l(3, str2);
            }
            String str3 = pVar.f18480d;
            if (str3 == null) {
                fVar.o(4);
            } else {
                fVar.l(4, str3);
            }
            byte[] k7 = androidx.work.b.k(pVar.f18481e);
            if (k7 == null) {
                fVar.o(5);
            } else {
                fVar.F(5, k7);
            }
            byte[] k8 = androidx.work.b.k(pVar.f18482f);
            if (k8 == null) {
                fVar.o(6);
            } else {
                fVar.F(6, k8);
            }
            fVar.z(7, pVar.f18483g);
            fVar.z(8, pVar.f18484h);
            fVar.z(9, pVar.f18485i);
            fVar.z(10, pVar.f18487k);
            fVar.z(11, v.a(pVar.f18488l));
            fVar.z(12, pVar.f18489m);
            fVar.z(13, pVar.f18490n);
            fVar.z(14, pVar.f18491o);
            fVar.z(15, pVar.f18492p);
            fVar.z(16, pVar.f18493q ? 1L : 0L);
            fVar.z(17, v.i(pVar.f18494r));
            d0.b bVar = pVar.f18486j;
            if (bVar != null) {
                fVar.z(18, v.h(bVar.b()));
                fVar.z(19, bVar.g() ? 1L : 0L);
                fVar.z(20, bVar.h() ? 1L : 0L);
                fVar.z(21, bVar.f() ? 1L : 0L);
                fVar.z(22, bVar.i() ? 1L : 0L);
                fVar.z(23, bVar.c());
                fVar.z(24, bVar.d());
                byte[] c7 = v.c(bVar.a());
                if (c7 != null) {
                    fVar.F(25, c7);
                    return;
                }
            } else {
                fVar.o(18);
                fVar.o(19);
                fVar.o(20);
                fVar.o(21);
                fVar.o(22);
                fVar.o(23);
                fVar.o(24);
            }
            fVar.o(25);
        }
    }

    class b extends t.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class c extends t.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class d extends t.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    class e extends t.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class f extends t.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class g extends t.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class h extends t.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class i extends t.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f18497a = hVar;
        this.f18498b = new a(hVar);
        this.f18499c = new b(hVar);
        this.f18500d = new c(hVar);
        this.f18501e = new d(hVar);
        this.f18502f = new e(hVar);
        this.f18503g = new f(hVar);
        this.f18504h = new g(hVar);
        this.f18505i = new h(hVar);
        this.f18506j = new i(hVar);
    }

    @Override // l0.q
    public void a(String str) {
        this.f18497a.b();
        w.f a7 = this.f18499c.a();
        if (str == null) {
            a7.o(1);
        } else {
            a7.l(1, str);
        }
        this.f18497a.c();
        try {
            a7.m();
            this.f18497a.r();
        } finally {
            this.f18497a.g();
            this.f18499c.f(a7);
        }
    }

    @Override // l0.q
    public List<p> b() {
        t.c cVar;
        t.c h7 = t.c.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "required_network_type");
            int b9 = v.b.b(b7, "requires_charging");
            int b10 = v.b.b(b7, "requires_device_idle");
            int b11 = v.b.b(b7, "requires_battery_not_low");
            int b12 = v.b.b(b7, "requires_storage_not_low");
            int b13 = v.b.b(b7, "trigger_content_update_delay");
            int b14 = v.b.b(b7, "trigger_max_content_delay");
            int b15 = v.b.b(b7, "content_uri_triggers");
            int b16 = v.b.b(b7, "id");
            int b17 = v.b.b(b7, "state");
            int b18 = v.b.b(b7, "worker_class_name");
            int b19 = v.b.b(b7, "input_merger_class_name");
            int b20 = v.b.b(b7, "input");
            int b21 = v.b.b(b7, "output");
            cVar = h7;
            try {
                int b22 = v.b.b(b7, "initial_delay");
                int b23 = v.b.b(b7, "interval_duration");
                int b24 = v.b.b(b7, "flex_duration");
                int b25 = v.b.b(b7, "run_attempt_count");
                int b26 = v.b.b(b7, "backoff_policy");
                int b27 = v.b.b(b7, "backoff_delay_duration");
                int b28 = v.b.b(b7, "period_start_time");
                int b29 = v.b.b(b7, "minimum_retention_duration");
                int b30 = v.b.b(b7, "schedule_requested_at");
                int b31 = v.b.b(b7, "run_in_foreground");
                int b32 = v.b.b(b7, "out_of_quota_policy");
                int i7 = b21;
                ArrayList arrayList = new ArrayList(b7.getCount());
                while (b7.moveToNext()) {
                    String string = b7.getString(b16);
                    int i8 = b16;
                    String string2 = b7.getString(b18);
                    int i9 = b18;
                    d0.b bVar = new d0.b();
                    int i10 = b8;
                    bVar.k(v.e(b7.getInt(b8)));
                    bVar.m(b7.getInt(b9) != 0);
                    bVar.n(b7.getInt(b10) != 0);
                    bVar.l(b7.getInt(b11) != 0);
                    bVar.o(b7.getInt(b12) != 0);
                    int i11 = b9;
                    int i12 = b10;
                    bVar.p(b7.getLong(b13));
                    bVar.q(b7.getLong(b14));
                    bVar.j(v.b(b7.getBlob(b15)));
                    p pVar = new p(string, string2);
                    pVar.f18478b = v.g(b7.getInt(b17));
                    pVar.f18480d = b7.getString(b19);
                    pVar.f18481e = androidx.work.b.g(b7.getBlob(b20));
                    int i13 = i7;
                    pVar.f18482f = androidx.work.b.g(b7.getBlob(i13));
                    i7 = i13;
                    int i14 = b22;
                    pVar.f18483g = b7.getLong(i14);
                    int i15 = b20;
                    int i16 = b23;
                    pVar.f18484h = b7.getLong(i16);
                    int i17 = b11;
                    int i18 = b24;
                    pVar.f18485i = b7.getLong(i18);
                    int i19 = b25;
                    pVar.f18487k = b7.getInt(i19);
                    int i20 = b26;
                    pVar.f18488l = v.d(b7.getInt(i20));
                    b24 = i18;
                    int i21 = b27;
                    pVar.f18489m = b7.getLong(i21);
                    int i22 = b28;
                    pVar.f18490n = b7.getLong(i22);
                    b28 = i22;
                    int i23 = b29;
                    pVar.f18491o = b7.getLong(i23);
                    int i24 = b30;
                    pVar.f18492p = b7.getLong(i24);
                    int i25 = b31;
                    pVar.f18493q = b7.getInt(i25) != 0;
                    int i26 = b32;
                    pVar.f18494r = v.f(b7.getInt(i26));
                    pVar.f18486j = bVar;
                    arrayList.add(pVar);
                    b32 = i26;
                    b9 = i11;
                    b20 = i15;
                    b22 = i14;
                    b23 = i16;
                    b25 = i19;
                    b30 = i24;
                    b16 = i8;
                    b18 = i9;
                    b8 = i10;
                    b31 = i25;
                    b29 = i23;
                    b10 = i12;
                    b27 = i21;
                    b11 = i17;
                    b26 = i20;
                }
                b7.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b7.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = h7;
        }
    }

    @Override // l0.q
    public boolean c() {
        boolean z6 = false;
        t.c h7 = t.c.h("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            if (b7.moveToFirst()) {
                if (b7.getInt(0) != 0) {
                    z6 = true;
                }
            }
            return z6;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.q
    public int d(String str, long j7) {
        this.f18497a.b();
        w.f a7 = this.f18504h.a();
        a7.z(1, j7);
        if (str == null) {
            a7.o(2);
        } else {
            a7.l(2, str);
        }
        this.f18497a.c();
        try {
            int m7 = a7.m();
            this.f18497a.r();
            return m7;
        } finally {
            this.f18497a.g();
            this.f18504h.f(a7);
        }
    }

    @Override // l0.q
    public List<String> e(String str) {
        t.c h7 = t.c.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            ArrayList arrayList = new ArrayList(b7.getCount());
            while (b7.moveToNext()) {
                arrayList.add(b7.getString(0));
            }
            return arrayList;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.q
    public List<p.b> f(String str) {
        t.c h7 = t.c.h("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "id");
            int b9 = v.b.b(b7, "state");
            ArrayList arrayList = new ArrayList(b7.getCount());
            while (b7.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f18495a = b7.getString(b8);
                bVar.f18496b = v.g(b7.getInt(b9));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.q
    public List<p> g(long j7) {
        t.c cVar;
        t.c h7 = t.c.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        h7.z(1, j7);
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "required_network_type");
            int b9 = v.b.b(b7, "requires_charging");
            int b10 = v.b.b(b7, "requires_device_idle");
            int b11 = v.b.b(b7, "requires_battery_not_low");
            int b12 = v.b.b(b7, "requires_storage_not_low");
            int b13 = v.b.b(b7, "trigger_content_update_delay");
            int b14 = v.b.b(b7, "trigger_max_content_delay");
            int b15 = v.b.b(b7, "content_uri_triggers");
            int b16 = v.b.b(b7, "id");
            int b17 = v.b.b(b7, "state");
            int b18 = v.b.b(b7, "worker_class_name");
            int b19 = v.b.b(b7, "input_merger_class_name");
            int b20 = v.b.b(b7, "input");
            int b21 = v.b.b(b7, "output");
            cVar = h7;
            try {
                int b22 = v.b.b(b7, "initial_delay");
                int b23 = v.b.b(b7, "interval_duration");
                int b24 = v.b.b(b7, "flex_duration");
                int b25 = v.b.b(b7, "run_attempt_count");
                int b26 = v.b.b(b7, "backoff_policy");
                int b27 = v.b.b(b7, "backoff_delay_duration");
                int b28 = v.b.b(b7, "period_start_time");
                int b29 = v.b.b(b7, "minimum_retention_duration");
                int b30 = v.b.b(b7, "schedule_requested_at");
                int b31 = v.b.b(b7, "run_in_foreground");
                int b32 = v.b.b(b7, "out_of_quota_policy");
                int i7 = b21;
                ArrayList arrayList = new ArrayList(b7.getCount());
                while (b7.moveToNext()) {
                    String string = b7.getString(b16);
                    int i8 = b16;
                    String string2 = b7.getString(b18);
                    int i9 = b18;
                    d0.b bVar = new d0.b();
                    int i10 = b8;
                    bVar.k(v.e(b7.getInt(b8)));
                    bVar.m(b7.getInt(b9) != 0);
                    bVar.n(b7.getInt(b10) != 0);
                    bVar.l(b7.getInt(b11) != 0);
                    bVar.o(b7.getInt(b12) != 0);
                    int i11 = b9;
                    int i12 = b10;
                    bVar.p(b7.getLong(b13));
                    bVar.q(b7.getLong(b14));
                    bVar.j(v.b(b7.getBlob(b15)));
                    p pVar = new p(string, string2);
                    pVar.f18478b = v.g(b7.getInt(b17));
                    pVar.f18480d = b7.getString(b19);
                    pVar.f18481e = androidx.work.b.g(b7.getBlob(b20));
                    int i13 = i7;
                    pVar.f18482f = androidx.work.b.g(b7.getBlob(i13));
                    int i14 = b22;
                    i7 = i13;
                    pVar.f18483g = b7.getLong(i14);
                    int i15 = b19;
                    int i16 = b23;
                    pVar.f18484h = b7.getLong(i16);
                    int i17 = b11;
                    int i18 = b24;
                    pVar.f18485i = b7.getLong(i18);
                    int i19 = b25;
                    pVar.f18487k = b7.getInt(i19);
                    int i20 = b26;
                    pVar.f18488l = v.d(b7.getInt(i20));
                    b24 = i18;
                    int i21 = b27;
                    pVar.f18489m = b7.getLong(i21);
                    int i22 = b28;
                    pVar.f18490n = b7.getLong(i22);
                    b28 = i22;
                    int i23 = b29;
                    pVar.f18491o = b7.getLong(i23);
                    int i24 = b30;
                    pVar.f18492p = b7.getLong(i24);
                    int i25 = b31;
                    pVar.f18493q = b7.getInt(i25) != 0;
                    int i26 = b32;
                    pVar.f18494r = v.f(b7.getInt(i26));
                    pVar.f18486j = bVar;
                    arrayList.add(pVar);
                    b9 = i11;
                    b32 = i26;
                    b19 = i15;
                    b22 = i14;
                    b23 = i16;
                    b25 = i19;
                    b30 = i24;
                    b16 = i8;
                    b18 = i9;
                    b8 = i10;
                    b31 = i25;
                    b29 = i23;
                    b10 = i12;
                    b27 = i21;
                    b11 = i17;
                    b26 = i20;
                }
                b7.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b7.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = h7;
        }
    }

    @Override // l0.q
    public d0.s h(String str) {
        t.c h7 = t.c.h("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            return b7.moveToFirst() ? v.g(b7.getInt(0)) : null;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.q
    public void i(p pVar) {
        this.f18497a.b();
        this.f18497a.c();
        try {
            this.f18498b.h(pVar);
            this.f18497a.r();
        } finally {
            this.f18497a.g();
        }
    }

    @Override // l0.q
    public int j(d0.s sVar, String... strArr) {
        this.f18497a.b();
        StringBuilder b7 = v.e.b();
        b7.append("UPDATE workspec SET state=");
        b7.append("?");
        b7.append(" WHERE id IN (");
        v.e.a(b7, strArr.length);
        b7.append(")");
        w.f d7 = this.f18497a.d(b7.toString());
        d7.z(1, v.j(sVar));
        int i7 = 2;
        for (String str : strArr) {
            if (str == null) {
                d7.o(i7);
            } else {
                d7.l(i7, str);
            }
            i7++;
        }
        this.f18497a.c();
        try {
            int m7 = d7.m();
            this.f18497a.r();
            return m7;
        } finally {
            this.f18497a.g();
        }
    }

    @Override // l0.q
    public List<p> k(int i7) {
        t.c cVar;
        t.c h7 = t.c.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        h7.z(1, i7);
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "required_network_type");
            int b9 = v.b.b(b7, "requires_charging");
            int b10 = v.b.b(b7, "requires_device_idle");
            int b11 = v.b.b(b7, "requires_battery_not_low");
            int b12 = v.b.b(b7, "requires_storage_not_low");
            int b13 = v.b.b(b7, "trigger_content_update_delay");
            int b14 = v.b.b(b7, "trigger_max_content_delay");
            int b15 = v.b.b(b7, "content_uri_triggers");
            int b16 = v.b.b(b7, "id");
            int b17 = v.b.b(b7, "state");
            int b18 = v.b.b(b7, "worker_class_name");
            int b19 = v.b.b(b7, "input_merger_class_name");
            int b20 = v.b.b(b7, "input");
            int b21 = v.b.b(b7, "output");
            cVar = h7;
            try {
                int b22 = v.b.b(b7, "initial_delay");
                int b23 = v.b.b(b7, "interval_duration");
                int b24 = v.b.b(b7, "flex_duration");
                int b25 = v.b.b(b7, "run_attempt_count");
                int b26 = v.b.b(b7, "backoff_policy");
                int b27 = v.b.b(b7, "backoff_delay_duration");
                int b28 = v.b.b(b7, "period_start_time");
                int b29 = v.b.b(b7, "minimum_retention_duration");
                int b30 = v.b.b(b7, "schedule_requested_at");
                int b31 = v.b.b(b7, "run_in_foreground");
                int b32 = v.b.b(b7, "out_of_quota_policy");
                int i8 = b21;
                ArrayList arrayList = new ArrayList(b7.getCount());
                while (b7.moveToNext()) {
                    String string = b7.getString(b16);
                    int i9 = b16;
                    String string2 = b7.getString(b18);
                    int i10 = b18;
                    d0.b bVar = new d0.b();
                    int i11 = b8;
                    bVar.k(v.e(b7.getInt(b8)));
                    bVar.m(b7.getInt(b9) != 0);
                    bVar.n(b7.getInt(b10) != 0);
                    bVar.l(b7.getInt(b11) != 0);
                    bVar.o(b7.getInt(b12) != 0);
                    int i12 = b9;
                    int i13 = b10;
                    bVar.p(b7.getLong(b13));
                    bVar.q(b7.getLong(b14));
                    bVar.j(v.b(b7.getBlob(b15)));
                    p pVar = new p(string, string2);
                    pVar.f18478b = v.g(b7.getInt(b17));
                    pVar.f18480d = b7.getString(b19);
                    pVar.f18481e = androidx.work.b.g(b7.getBlob(b20));
                    int i14 = i8;
                    pVar.f18482f = androidx.work.b.g(b7.getBlob(i14));
                    i8 = i14;
                    int i15 = b22;
                    pVar.f18483g = b7.getLong(i15);
                    int i16 = b19;
                    int i17 = b23;
                    pVar.f18484h = b7.getLong(i17);
                    int i18 = b11;
                    int i19 = b24;
                    pVar.f18485i = b7.getLong(i19);
                    int i20 = b25;
                    pVar.f18487k = b7.getInt(i20);
                    int i21 = b26;
                    pVar.f18488l = v.d(b7.getInt(i21));
                    b24 = i19;
                    int i22 = b27;
                    pVar.f18489m = b7.getLong(i22);
                    int i23 = b28;
                    pVar.f18490n = b7.getLong(i23);
                    b28 = i23;
                    int i24 = b29;
                    pVar.f18491o = b7.getLong(i24);
                    int i25 = b30;
                    pVar.f18492p = b7.getLong(i25);
                    int i26 = b31;
                    pVar.f18493q = b7.getInt(i26) != 0;
                    int i27 = b32;
                    pVar.f18494r = v.f(b7.getInt(i27));
                    pVar.f18486j = bVar;
                    arrayList.add(pVar);
                    b32 = i27;
                    b9 = i12;
                    b19 = i16;
                    b22 = i15;
                    b23 = i17;
                    b25 = i20;
                    b30 = i25;
                    b16 = i9;
                    b18 = i10;
                    b8 = i11;
                    b31 = i26;
                    b29 = i24;
                    b10 = i13;
                    b27 = i22;
                    b11 = i18;
                    b26 = i21;
                }
                b7.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b7.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = h7;
        }
    }

    @Override // l0.q
    public p l(String str) {
        t.c cVar;
        p pVar;
        t.c h7 = t.c.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "required_network_type");
            int b9 = v.b.b(b7, "requires_charging");
            int b10 = v.b.b(b7, "requires_device_idle");
            int b11 = v.b.b(b7, "requires_battery_not_low");
            int b12 = v.b.b(b7, "requires_storage_not_low");
            int b13 = v.b.b(b7, "trigger_content_update_delay");
            int b14 = v.b.b(b7, "trigger_max_content_delay");
            int b15 = v.b.b(b7, "content_uri_triggers");
            int b16 = v.b.b(b7, "id");
            int b17 = v.b.b(b7, "state");
            int b18 = v.b.b(b7, "worker_class_name");
            int b19 = v.b.b(b7, "input_merger_class_name");
            int b20 = v.b.b(b7, "input");
            int b21 = v.b.b(b7, "output");
            cVar = h7;
            try {
                int b22 = v.b.b(b7, "initial_delay");
                int b23 = v.b.b(b7, "interval_duration");
                int b24 = v.b.b(b7, "flex_duration");
                int b25 = v.b.b(b7, "run_attempt_count");
                int b26 = v.b.b(b7, "backoff_policy");
                int b27 = v.b.b(b7, "backoff_delay_duration");
                int b28 = v.b.b(b7, "period_start_time");
                int b29 = v.b.b(b7, "minimum_retention_duration");
                int b30 = v.b.b(b7, "schedule_requested_at");
                int b31 = v.b.b(b7, "run_in_foreground");
                int b32 = v.b.b(b7, "out_of_quota_policy");
                if (b7.moveToFirst()) {
                    String string = b7.getString(b16);
                    String string2 = b7.getString(b18);
                    d0.b bVar = new d0.b();
                    bVar.k(v.e(b7.getInt(b8)));
                    bVar.m(b7.getInt(b9) != 0);
                    bVar.n(b7.getInt(b10) != 0);
                    bVar.l(b7.getInt(b11) != 0);
                    bVar.o(b7.getInt(b12) != 0);
                    bVar.p(b7.getLong(b13));
                    bVar.q(b7.getLong(b14));
                    bVar.j(v.b(b7.getBlob(b15)));
                    p pVar2 = new p(string, string2);
                    pVar2.f18478b = v.g(b7.getInt(b17));
                    pVar2.f18480d = b7.getString(b19);
                    pVar2.f18481e = androidx.work.b.g(b7.getBlob(b20));
                    pVar2.f18482f = androidx.work.b.g(b7.getBlob(b21));
                    pVar2.f18483g = b7.getLong(b22);
                    pVar2.f18484h = b7.getLong(b23);
                    pVar2.f18485i = b7.getLong(b24);
                    pVar2.f18487k = b7.getInt(b25);
                    pVar2.f18488l = v.d(b7.getInt(b26));
                    pVar2.f18489m = b7.getLong(b27);
                    pVar2.f18490n = b7.getLong(b28);
                    pVar2.f18491o = b7.getLong(b29);
                    pVar2.f18492p = b7.getLong(b30);
                    pVar2.f18493q = b7.getInt(b31) != 0;
                    pVar2.f18494r = v.f(b7.getInt(b32));
                    pVar2.f18486j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b7.close();
                cVar.u();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b7.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = h7;
        }
    }

    @Override // l0.q
    public int m(String str) {
        this.f18497a.b();
        w.f a7 = this.f18503g.a();
        if (str == null) {
            a7.o(1);
        } else {
            a7.l(1, str);
        }
        this.f18497a.c();
        try {
            int m7 = a7.m();
            this.f18497a.r();
            return m7;
        } finally {
            this.f18497a.g();
            this.f18503g.f(a7);
        }
    }

    @Override // l0.q
    public List<String> n(String str) {
        t.c h7 = t.c.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            ArrayList arrayList = new ArrayList(b7.getCount());
            while (b7.moveToNext()) {
                arrayList.add(b7.getString(0));
            }
            return arrayList;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.q
    public List<androidx.work.b> o(String str) {
        t.c h7 = t.c.h("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            ArrayList arrayList = new ArrayList(b7.getCount());
            while (b7.moveToNext()) {
                arrayList.add(androidx.work.b.g(b7.getBlob(0)));
            }
            return arrayList;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.q
    public int p(String str) {
        this.f18497a.b();
        w.f a7 = this.f18502f.a();
        if (str == null) {
            a7.o(1);
        } else {
            a7.l(1, str);
        }
        this.f18497a.c();
        try {
            int m7 = a7.m();
            this.f18497a.r();
            return m7;
        } finally {
            this.f18497a.g();
            this.f18502f.f(a7);
        }
    }

    @Override // l0.q
    public void q(String str, long j7) {
        this.f18497a.b();
        w.f a7 = this.f18501e.a();
        a7.z(1, j7);
        if (str == null) {
            a7.o(2);
        } else {
            a7.l(2, str);
        }
        this.f18497a.c();
        try {
            a7.m();
            this.f18497a.r();
        } finally {
            this.f18497a.g();
            this.f18501e.f(a7);
        }
    }

    @Override // l0.q
    public List<p> r() {
        t.c cVar;
        t.c h7 = t.c.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "required_network_type");
            int b9 = v.b.b(b7, "requires_charging");
            int b10 = v.b.b(b7, "requires_device_idle");
            int b11 = v.b.b(b7, "requires_battery_not_low");
            int b12 = v.b.b(b7, "requires_storage_not_low");
            int b13 = v.b.b(b7, "trigger_content_update_delay");
            int b14 = v.b.b(b7, "trigger_max_content_delay");
            int b15 = v.b.b(b7, "content_uri_triggers");
            int b16 = v.b.b(b7, "id");
            int b17 = v.b.b(b7, "state");
            int b18 = v.b.b(b7, "worker_class_name");
            int b19 = v.b.b(b7, "input_merger_class_name");
            int b20 = v.b.b(b7, "input");
            int b21 = v.b.b(b7, "output");
            cVar = h7;
            try {
                int b22 = v.b.b(b7, "initial_delay");
                int b23 = v.b.b(b7, "interval_duration");
                int b24 = v.b.b(b7, "flex_duration");
                int b25 = v.b.b(b7, "run_attempt_count");
                int b26 = v.b.b(b7, "backoff_policy");
                int b27 = v.b.b(b7, "backoff_delay_duration");
                int b28 = v.b.b(b7, "period_start_time");
                int b29 = v.b.b(b7, "minimum_retention_duration");
                int b30 = v.b.b(b7, "schedule_requested_at");
                int b31 = v.b.b(b7, "run_in_foreground");
                int b32 = v.b.b(b7, "out_of_quota_policy");
                int i7 = b21;
                ArrayList arrayList = new ArrayList(b7.getCount());
                while (b7.moveToNext()) {
                    String string = b7.getString(b16);
                    int i8 = b16;
                    String string2 = b7.getString(b18);
                    int i9 = b18;
                    d0.b bVar = new d0.b();
                    int i10 = b8;
                    bVar.k(v.e(b7.getInt(b8)));
                    bVar.m(b7.getInt(b9) != 0);
                    bVar.n(b7.getInt(b10) != 0);
                    bVar.l(b7.getInt(b11) != 0);
                    bVar.o(b7.getInt(b12) != 0);
                    int i11 = b9;
                    int i12 = b10;
                    bVar.p(b7.getLong(b13));
                    bVar.q(b7.getLong(b14));
                    bVar.j(v.b(b7.getBlob(b15)));
                    p pVar = new p(string, string2);
                    pVar.f18478b = v.g(b7.getInt(b17));
                    pVar.f18480d = b7.getString(b19);
                    pVar.f18481e = androidx.work.b.g(b7.getBlob(b20));
                    int i13 = i7;
                    pVar.f18482f = androidx.work.b.g(b7.getBlob(i13));
                    i7 = i13;
                    int i14 = b22;
                    pVar.f18483g = b7.getLong(i14);
                    int i15 = b20;
                    int i16 = b23;
                    pVar.f18484h = b7.getLong(i16);
                    int i17 = b11;
                    int i18 = b24;
                    pVar.f18485i = b7.getLong(i18);
                    int i19 = b25;
                    pVar.f18487k = b7.getInt(i19);
                    int i20 = b26;
                    pVar.f18488l = v.d(b7.getInt(i20));
                    b24 = i18;
                    int i21 = b27;
                    pVar.f18489m = b7.getLong(i21);
                    int i22 = b28;
                    pVar.f18490n = b7.getLong(i22);
                    b28 = i22;
                    int i23 = b29;
                    pVar.f18491o = b7.getLong(i23);
                    int i24 = b30;
                    pVar.f18492p = b7.getLong(i24);
                    int i25 = b31;
                    pVar.f18493q = b7.getInt(i25) != 0;
                    int i26 = b32;
                    pVar.f18494r = v.f(b7.getInt(i26));
                    pVar.f18486j = bVar;
                    arrayList.add(pVar);
                    b32 = i26;
                    b9 = i11;
                    b20 = i15;
                    b22 = i14;
                    b23 = i16;
                    b25 = i19;
                    b30 = i24;
                    b16 = i8;
                    b18 = i9;
                    b8 = i10;
                    b31 = i25;
                    b29 = i23;
                    b10 = i12;
                    b27 = i21;
                    b11 = i17;
                    b26 = i20;
                }
                b7.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b7.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = h7;
        }
    }

    @Override // l0.q
    public List<p> s(int i7) {
        t.c cVar;
        t.c h7 = t.c.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        h7.z(1, i7);
        this.f18497a.b();
        Cursor b7 = v.c.b(this.f18497a, h7, false, null);
        try {
            int b8 = v.b.b(b7, "required_network_type");
            int b9 = v.b.b(b7, "requires_charging");
            int b10 = v.b.b(b7, "requires_device_idle");
            int b11 = v.b.b(b7, "requires_battery_not_low");
            int b12 = v.b.b(b7, "requires_storage_not_low");
            int b13 = v.b.b(b7, "trigger_content_update_delay");
            int b14 = v.b.b(b7, "trigger_max_content_delay");
            int b15 = v.b.b(b7, "content_uri_triggers");
            int b16 = v.b.b(b7, "id");
            int b17 = v.b.b(b7, "state");
            int b18 = v.b.b(b7, "worker_class_name");
            int b19 = v.b.b(b7, "input_merger_class_name");
            int b20 = v.b.b(b7, "input");
            int b21 = v.b.b(b7, "output");
            cVar = h7;
            try {
                int b22 = v.b.b(b7, "initial_delay");
                int b23 = v.b.b(b7, "interval_duration");
                int b24 = v.b.b(b7, "flex_duration");
                int b25 = v.b.b(b7, "run_attempt_count");
                int b26 = v.b.b(b7, "backoff_policy");
                int b27 = v.b.b(b7, "backoff_delay_duration");
                int b28 = v.b.b(b7, "period_start_time");
                int b29 = v.b.b(b7, "minimum_retention_duration");
                int b30 = v.b.b(b7, "schedule_requested_at");
                int b31 = v.b.b(b7, "run_in_foreground");
                int b32 = v.b.b(b7, "out_of_quota_policy");
                int i8 = b21;
                ArrayList arrayList = new ArrayList(b7.getCount());
                while (b7.moveToNext()) {
                    String string = b7.getString(b16);
                    int i9 = b16;
                    String string2 = b7.getString(b18);
                    int i10 = b18;
                    d0.b bVar = new d0.b();
                    int i11 = b8;
                    bVar.k(v.e(b7.getInt(b8)));
                    bVar.m(b7.getInt(b9) != 0);
                    bVar.n(b7.getInt(b10) != 0);
                    bVar.l(b7.getInt(b11) != 0);
                    bVar.o(b7.getInt(b12) != 0);
                    int i12 = b9;
                    int i13 = b10;
                    bVar.p(b7.getLong(b13));
                    bVar.q(b7.getLong(b14));
                    bVar.j(v.b(b7.getBlob(b15)));
                    p pVar = new p(string, string2);
                    pVar.f18478b = v.g(b7.getInt(b17));
                    pVar.f18480d = b7.getString(b19);
                    pVar.f18481e = androidx.work.b.g(b7.getBlob(b20));
                    int i14 = i8;
                    pVar.f18482f = androidx.work.b.g(b7.getBlob(i14));
                    i8 = i14;
                    int i15 = b22;
                    pVar.f18483g = b7.getLong(i15);
                    int i16 = b19;
                    int i17 = b23;
                    pVar.f18484h = b7.getLong(i17);
                    int i18 = b11;
                    int i19 = b24;
                    pVar.f18485i = b7.getLong(i19);
                    int i20 = b25;
                    pVar.f18487k = b7.getInt(i20);
                    int i21 = b26;
                    pVar.f18488l = v.d(b7.getInt(i21));
                    b24 = i19;
                    int i22 = b27;
                    pVar.f18489m = b7.getLong(i22);
                    int i23 = b28;
                    pVar.f18490n = b7.getLong(i23);
                    b28 = i23;
                    int i24 = b29;
                    pVar.f18491o = b7.getLong(i24);
                    int i25 = b30;
                    pVar.f18492p = b7.getLong(i25);
                    int i26 = b31;
                    pVar.f18493q = b7.getInt(i26) != 0;
                    int i27 = b32;
                    pVar.f18494r = v.f(b7.getInt(i27));
                    pVar.f18486j = bVar;
                    arrayList.add(pVar);
                    b32 = i27;
                    b9 = i12;
                    b19 = i16;
                    b22 = i15;
                    b23 = i17;
                    b25 = i20;
                    b30 = i25;
                    b16 = i9;
                    b18 = i10;
                    b8 = i11;
                    b31 = i26;
                    b29 = i24;
                    b10 = i13;
                    b27 = i22;
                    b11 = i18;
                    b26 = i21;
                }
                b7.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b7.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = h7;
        }
    }

    @Override // l0.q
    public void t(String str, androidx.work.b bVar) {
        this.f18497a.b();
        w.f a7 = this.f18500d.a();
        byte[] k7 = androidx.work.b.k(bVar);
        if (k7 == null) {
            a7.o(1);
        } else {
            a7.F(1, k7);
        }
        if (str == null) {
            a7.o(2);
        } else {
            a7.l(2, str);
        }
        this.f18497a.c();
        try {
            a7.m();
            this.f18497a.r();
        } finally {
            this.f18497a.g();
            this.f18500d.f(a7);
        }
    }

    @Override // l0.q
    public int u() {
        this.f18497a.b();
        w.f a7 = this.f18505i.a();
        this.f18497a.c();
        try {
            int m7 = a7.m();
            this.f18497a.r();
            return m7;
        } finally {
            this.f18497a.g();
            this.f18505i.f(a7);
        }
    }
}
