package H0;

import android.content.ContentValues;
import android.text.TextUtils;
import i0.AbstractC0540a;
import kotlin.jvm.internal.Intrinsics;
import m0.C0684c;

/* loaded from: classes.dex */
public final class d extends AbstractC0540a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f873d = new d(11, 12, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final d f874e = new d(12, 13, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final d f875f = new d(15, 16, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final d f876g = new d(1, 2, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final d f877h = new d(3, 4, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final d f878i = new d(4, 5, 5);
    public static final d j = new d(6, 7, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final d f879k = new d(7, 8, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final d f880l = new d(8, 9, 8);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i5, int i7) {
        super(i2, i5);
        this.f881c = i7;
    }

    @Override // i0.AbstractC0540a
    public final void a(C0684c db) {
        switch (this.f881c) {
            case 0:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                db.j("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                db.j("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                db.j("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                db.j("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                db.j("DROP TABLE `SystemIdInfo`");
                db.j("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                db.j("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                db.j("DROP TABLE IF EXISTS alarmInfo");
                db.j("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                db.j("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 9:
                db.j("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                db.j("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                db.j("DROP TABLE `WorkSpec`");
                db.j("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                db.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                db.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            default:
                db.j("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                db.j("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                db.j("DROP TABLE `WorkSpec`");
                db.j("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                db.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                db.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues values = new ContentValues(1);
                values.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                db.getClass();
                Intrinsics.checkNotNullParameter("WorkSpec", "table");
                Intrinsics.checkNotNullParameter(values, "values");
                if (values.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                int size = values.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb = new StringBuilder("UPDATE ");
                sb.append(C0684c.f6488i[3]);
                sb.append("WorkSpec SET ");
                int i2 = 0;
                for (String str : values.keySet()) {
                    sb.append(i2 > 0 ? "," : "");
                    sb.append(str);
                    objArr2[i2] = values.get(str);
                    sb.append("=?");
                    i2++;
                }
                for (int i5 = size; i5 < length; i5++) {
                    objArr2[i5] = objArr[i5 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                m0.j statement = db.g(sb2);
                Intrinsics.checkNotNullParameter(statement, "statement");
                int length2 = objArr2.length;
                int i7 = 0;
                while (i7 < length2) {
                    Object obj = objArr2[i7];
                    i7++;
                    if (obj == null) {
                        statement.l(i7);
                    } else if (obj instanceof byte[]) {
                        statement.D((byte[]) obj, i7);
                    } else if (obj instanceof Float) {
                        statement.m(i7, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        statement.m(i7, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        statement.r(((Number) obj).longValue(), i7);
                    } else if (obj instanceof Integer) {
                        statement.r(((Number) obj).intValue(), i7);
                    } else if (obj instanceof Short) {
                        statement.r(((Number) obj).shortValue(), i7);
                    } else if (obj instanceof Byte) {
                        statement.r(((Number) obj).byteValue(), i7);
                    } else if (obj instanceof String) {
                        statement.f(i7, (String) obj);
                    } else {
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        statement.r(((Boolean) obj).booleanValue() ? 1L : 0L, i7);
                    }
                }
                statement.f6518e.executeUpdateDelete();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d() {
        super(14, 15);
        this.f881c = 10;
    }
}
