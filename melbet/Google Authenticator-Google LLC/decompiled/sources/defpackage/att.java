package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class att extends alk {
    public static final att c = new att();

    private att() {
        super(4, 5);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        amjVar.e("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
