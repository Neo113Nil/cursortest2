package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aut extends alk {
    public aut() {
        super(20, 21);
    }

    @Override // defpackage.alk
    public final void b(ana anaVar) {
        yj.o(anaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
