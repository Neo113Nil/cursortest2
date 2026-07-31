package androidx.work.impl;

import androidx.room.h;
import androidx.room.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import l0.b;
import l0.e;
import l0.h;
import l0.k;
import l0.l;
import l0.n;
import l0.o;
import l0.q;
import l0.r;
import l0.t;
import l0.u;
import v.c;
import v.f;
import w.c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    private volatile q f1451m;

    /* renamed from: n, reason: collision with root package name */
    private volatile b f1452n;

    /* renamed from: o, reason: collision with root package name */
    private volatile t f1453o;

    /* renamed from: p, reason: collision with root package name */
    private volatile h f1454p;

    /* renamed from: q, reason: collision with root package name */
    private volatile k f1455q;

    /* renamed from: r, reason: collision with root package name */
    private volatile n f1456r;

    /* renamed from: s, reason: collision with root package name */
    private volatile e f1457s;

    class a extends i.a {
        a(int i7) {
            super(i7);
        }

        @Override // androidx.room.i.a
        public void a(w.b bVar) {
            bVar.k("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.k("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.k("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.k("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.k("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.k("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.k("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.k("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.k("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.i.a
        public void b(w.b bVar) {
            bVar.k("DROP TABLE IF EXISTS `Dependency`");
            bVar.k("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.k("DROP TABLE IF EXISTS `WorkTag`");
            bVar.k("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.k("DROP TABLE IF EXISTS `WorkName`");
            bVar.k("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.k("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.h) WorkDatabase_Impl.this).f1308h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f1308h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f1308h.get(i7)).b(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        protected void c(w.b bVar) {
            if (((androidx.room.h) WorkDatabase_Impl.this).f1308h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f1308h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f1308h.get(i7)).a(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(w.b bVar) {
            ((androidx.room.h) WorkDatabase_Impl.this).f1301a = bVar;
            bVar.k("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (((androidx.room.h) WorkDatabase_Impl.this).f1308h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f1308h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f1308h.get(i7)).c(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void e(w.b bVar) {
        }

        @Override // androidx.room.i.a
        public void f(w.b bVar) {
            c.a(bVar);
        }

        @Override // androidx.room.i.a
        protected i.b g(w.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            f fVar = new f("Dependency", hashMap, hashSet, hashSet2);
            f a7 = f.a(bVar, "Dependency");
            if (!fVar.equals(a7)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a7);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new f.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            f fVar2 = new f("WorkSpec", hashMap2, hashSet3, hashSet4);
            f a8 = f.a(bVar, "WorkSpec");
            if (!fVar2.equals(a8)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a8);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            f fVar3 = new f("WorkTag", hashMap3, hashSet5, hashSet6);
            f a9 = f.a(bVar, "WorkTag");
            if (!fVar3.equals(a9)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a9);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            f fVar4 = new f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            f a10 = f.a(bVar, "SystemIdInfo");
            if (!fVar4.equals(a10)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a10);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            f fVar5 = new f("WorkName", hashMap5, hashSet8, hashSet9);
            f a11 = f.a(bVar, "WorkName");
            if (!fVar5.equals(a11)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a11);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            f fVar6 = new f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            f a12 = f.a(bVar, "WorkProgress");
            if (!fVar6.equals(a12)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a12);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            f fVar7 = new f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            f a13 = f.a(bVar, "Preference");
            if (fVar7.equals(a13)) {
                return new i.b(true, null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a13);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f1456r != null) {
            return this.f1456r;
        }
        synchronized (this) {
            if (this.f1456r == null) {
                this.f1456r = new o(this);
            }
            nVar = this.f1456r;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f1451m != null) {
            return this.f1451m;
        }
        synchronized (this) {
            if (this.f1451m == null) {
                this.f1451m = new r(this);
            }
            qVar = this.f1451m;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f1453o != null) {
            return this.f1453o;
        }
        synchronized (this) {
            if (this.f1453o == null) {
                this.f1453o = new u(this);
            }
            tVar = this.f1453o;
        }
        return tVar;
    }

    @Override // androidx.room.h
    protected androidx.room.e e() {
        return new androidx.room.e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.h
    protected w.c f(androidx.room.a aVar) {
        return aVar.f1237a.a(c.b.a(aVar.f1238b).c(aVar.f1239c).b(new i(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f1452n != null) {
            return this.f1452n;
        }
        synchronized (this) {
            if (this.f1452n == null) {
                this.f1452n = new l0.c(this);
            }
            bVar = this.f1452n;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e x() {
        e eVar;
        if (this.f1457s != null) {
            return this.f1457s;
        }
        synchronized (this) {
            if (this.f1457s == null) {
                this.f1457s = new l0.f(this);
            }
            eVar = this.f1457s;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public l0.h y() {
        l0.h hVar;
        if (this.f1454p != null) {
            return this.f1454p;
        }
        synchronized (this) {
            if (this.f1454p == null) {
                this.f1454p = new l0.i(this);
            }
            hVar = this.f1454p;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f1455q != null) {
            return this.f1455q;
        }
        synchronized (this) {
            if (this.f1455q == null) {
                this.f1455q = new l(this);
            }
            kVar = this.f1455q;
        }
        return kVar;
    }
}
