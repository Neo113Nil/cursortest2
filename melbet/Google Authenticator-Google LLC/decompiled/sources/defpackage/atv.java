package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atv extends alk {
    public static final atv c = new atv();

    private atv() {
        super(7, 8);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
