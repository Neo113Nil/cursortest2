package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atn extends alk {
    public static final atn c = new atn();

    private atn() {
        super(11, 12);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
