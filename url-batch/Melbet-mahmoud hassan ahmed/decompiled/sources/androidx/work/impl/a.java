package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static u.a f1459a = new C0030a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static u.a f1460b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static u.a f1461c = new c(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static u.a f1462d = new d(6, 7);

    /* renamed from: e, reason: collision with root package name */
    public static u.a f1463e = new e(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static u.a f1464f = new f(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static u.a f1465g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    class C0030a extends u.a {
        C0030a(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.k("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.k("DROP TABLE IF EXISTS alarmInfo");
            bVar.k("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    class b extends u.a {
        b(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.k("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    class c extends u.a {
        c(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.k("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    class d extends u.a {
        d(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    class e extends u.a {
        e(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    class f extends u.a {
        f(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    class g extends u.a {
        g(int i7, int i8) {
            super(i7, i8);
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends u.a {

        /* renamed from: c, reason: collision with root package name */
        final Context f1466c;

        public h(Context context, int i7, int i8) {
            super(i7, i8);
            this.f1466c = context;
        }

        @Override // u.a
        public void a(w.b bVar) {
            if (this.f22384b >= 10) {
                bVar.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f1466c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends u.a {

        /* renamed from: c, reason: collision with root package name */
        final Context f1467c;

        public i(Context context) {
            super(9, 10);
            this.f1467c = context;
        }

        @Override // u.a
        public void a(w.b bVar) {
            bVar.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            m0.e.b(this.f1467c, bVar);
            m0.c.a(this.f1467c, bVar);
        }
    }
}
