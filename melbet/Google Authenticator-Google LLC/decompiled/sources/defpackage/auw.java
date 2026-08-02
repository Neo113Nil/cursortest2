package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auw extends aka {
    final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auw(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.aka
    public final void a(ana anaVar) {
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yj.o(anaVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        yj.o(anaVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        yj.o(anaVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        yj.o(anaVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yj.o(anaVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yj.o(anaVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        yj.o(anaVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.aka
    public final void b(ana anaVar) {
        yj.o(anaVar, "DROP TABLE IF EXISTS `Dependency`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `WorkSpec`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `WorkTag`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `WorkName`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `WorkProgress`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.aka
    public final void c(ana anaVar) {
        yj.o(anaVar, "PRAGMA foreign_keys = ON");
        this.d.t(anaVar);
    }

    @Override // defpackage.aka
    public final void d(ana anaVar) {
        abf.h(anaVar);
    }

    @Override // defpackage.aka
    public final jxu g(ana anaVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new alv("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new alv("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new alw("WorkSpec", "CASCADE", "CASCADE", ixc.b("work_spec_id"), ixc.b("id")));
        linkedHashSet.add(new alw("WorkSpec", "CASCADE", "CASCADE", ixc.b("prerequisite_id"), ixc.b("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new alx("index_Dependency_work_spec_id", false, ixc.b("work_spec_id"), ixc.b("ASC")));
        linkedHashSet2.add(new alx("index_Dependency_prerequisite_id", false, ixc.b("prerequisite_id"), ixc.b("ASC")));
        aly alyVar = new aly("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        aly d = afn.d(anaVar, "Dependency");
        if (!ajz.h(alyVar, d)) {
            return new jxu(false, a.ae(d, alyVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new alv("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new alv("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new alv("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new alv("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new alv("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new alv("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new alv("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new alv("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new alv("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new alv("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new alv("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new alv("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new alv("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new alv("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new alv("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new alv("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new alv("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new alv("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new alv("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new alv("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new alv("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new alv("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new alv("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new alv("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new alv("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new alv("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new alv("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new alv("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new alv("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new alv("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new alv("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new alv("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new alv("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new alx("index_WorkSpec_schedule_requested_at", false, ixc.b("schedule_requested_at"), ixc.b("ASC")));
        linkedHashSet4.add(new alx("index_WorkSpec_last_enqueue_time", false, ixc.b("last_enqueue_time"), ixc.b("ASC")));
        aly alyVar2 = new aly("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        aly d2 = afn.d(anaVar, "WorkSpec");
        if (!ajz.h(alyVar2, d2)) {
            return new jxu(false, a.ae(d2, alyVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new alv("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new alv("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new alw("WorkSpec", "CASCADE", "CASCADE", ixc.b("work_spec_id"), ixc.b("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new alx("index_WorkTag_work_spec_id", false, ixc.b("work_spec_id"), ixc.b("ASC")));
        aly alyVar3 = new aly("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        aly d3 = afn.d(anaVar, "WorkTag");
        if (!ajz.h(alyVar3, d3)) {
            return new jxu(false, a.ae(d3, alyVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new alv("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new alv("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new alv("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new alw("WorkSpec", "CASCADE", "CASCADE", ixc.b("work_spec_id"), ixc.b("id")));
        aly alyVar4 = new aly("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        aly d4 = afn.d(anaVar, "SystemIdInfo");
        if (!ajz.h(alyVar4, d4)) {
            return new jxu(false, a.ae(d4, alyVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new alv("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new alv("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new alw("WorkSpec", "CASCADE", "CASCADE", ixc.b("work_spec_id"), ixc.b("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new alx("index_WorkName_work_spec_id", false, ixc.b("work_spec_id"), ixc.b("ASC")));
        aly alyVar5 = new aly("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        aly d5 = afn.d(anaVar, "WorkName");
        if (!ajz.h(alyVar5, d5)) {
            return new jxu(false, a.ae(d5, alyVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new alv("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new alv("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new alw("WorkSpec", "CASCADE", "CASCADE", ixc.b("work_spec_id"), ixc.b("id")));
        aly alyVar6 = new aly("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        aly d6 = afn.d(anaVar, "WorkProgress");
        if (!ajz.h(alyVar6, d6)) {
            return new jxu(false, a.ae(d6, alyVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new alv("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new alv("long_value", "INTEGER", false, 0, null, 1));
        aly alyVar7 = new aly("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        aly d7 = afn.d(anaVar, "Preference");
        return !ajz.h(alyVar7, d7) ? new jxu(false, a.ae(d7, alyVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new jxu(true, (String) null);
    }

    @Override // defpackage.aka
    public final void e() {
    }

    @Override // defpackage.aka
    public final void f() {
    }
}
