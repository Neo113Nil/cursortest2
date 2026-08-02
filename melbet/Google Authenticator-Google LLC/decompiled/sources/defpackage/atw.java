package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atw extends alk {
    public static final atw c = new atw();

    private atw() {
        super(8, 9);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
