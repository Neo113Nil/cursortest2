package u5;

import android.content.ContentValues;
import android.text.TextUtils;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends c5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f9613d = new d(11, 12, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final d f9614e = new d(12, 13, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final d f9615f = new d(15, 16, 2);
    public static final d g = new d(1, 2, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final d f9616h = new d(3, 4, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final d f9617i = new d(4, 5, 5);
    public static final d j = new d(6, 7, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final d f9618k = new d(7, 8, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final d f9619l = new d(8, 9, 8);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d() {
        super(14, 15);
        this.f9620c = 10;
    }

    @Override // c5.a
    public final void a(k5.d dVar) {
        switch (this.f9620c) {
            case 0:
                dVar.getClass();
                dVar.j("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                dVar.getClass();
                dVar.j("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                dVar.j("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                dVar.getClass();
                dVar.j("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                dVar.j("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                dVar.j("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                dVar.j("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                dVar.j("DROP TABLE `SystemIdInfo`");
                dVar.j("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                dVar.getClass();
                dVar.j("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                dVar.j("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                dVar.j("DROP TABLE IF EXISTS alarmInfo");
                dVar.j("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                dVar.getClass();
                dVar.j("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                dVar.getClass();
                dVar.j("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                dVar.j("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                dVar.getClass();
                dVar.j("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                dVar.getClass();
                dVar.j("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                dVar.getClass();
                dVar.j("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 9:
                dVar.j("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                dVar.j("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                dVar.j("DROP TABLE `WorkSpec`");
                dVar.j("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                dVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                dVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            default:
                dVar.j("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                dVar.j("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                dVar.j("DROP TABLE `WorkSpec`");
                dVar.j("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                dVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                dVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                dVar.j("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                dVar.getClass();
                if (contentValues.size() == 0) {
                    a1.e("Empty values");
                    return;
                }
                int size = contentValues.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb2 = new StringBuilder("UPDATE ");
                sb2.append(k5.d.f5406e[3]);
                sb2.append("WorkSpec SET ");
                int i3 = 0;
                for (String str : contentValues.keySet()) {
                    sb2.append(i3 > 0 ? "," : "");
                    sb2.append(str);
                    objArr2[i3] = contentValues.get(str);
                    sb2.append("=?");
                    i3++;
                }
                for (int i10 = size; i10 < length; i10++) {
                    objArr2[i10] = objArr[i10 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                k5.k h10 = dVar.h(sb2.toString());
                int length2 = objArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    Object obj = objArr2[i11];
                    i11++;
                    if (obj == null) {
                        h10.r(i11);
                    } else if (obj instanceof byte[]) {
                        h10.D(i11, (byte[]) obj);
                    } else if (obj instanceof Float) {
                        h10.n(((Number) obj).floatValue(), i11);
                    } else if (obj instanceof Double) {
                        h10.n(((Number) obj).doubleValue(), i11);
                    } else if (obj instanceof Long) {
                        h10.f(i11, ((Number) obj).longValue());
                    } else if (obj instanceof Integer) {
                        h10.f(i11, ((Number) obj).intValue());
                    } else if (obj instanceof Short) {
                        h10.f(i11, ((Number) obj).shortValue());
                    } else if (obj instanceof Byte) {
                        h10.f(i11, ((Number) obj).byteValue());
                    } else if (obj instanceof String) {
                        h10.l(i11, (String) obj);
                    } else {
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        h10.f(i11, ((Boolean) obj).booleanValue() ? 1L : 0L);
                    }
                }
                h10.f5437e.executeUpdateDelete();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i10, int i11) {
        super(i3, i10);
        this.f9620c = i11;
    }
}
