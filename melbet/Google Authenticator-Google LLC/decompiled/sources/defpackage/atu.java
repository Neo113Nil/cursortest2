package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atu extends alk {
    public static final atu c = new atu();

    private atu() {
        super(6, 7);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
