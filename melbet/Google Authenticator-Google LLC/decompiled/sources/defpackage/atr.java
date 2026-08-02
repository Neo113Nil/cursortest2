package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atr extends alk {
    public static final atr c = new atr();

    private atr() {
        super(1, 2);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        amjVar.e("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        amjVar.e("DROP TABLE IF EXISTS alarmInfo");
        amjVar.e("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
