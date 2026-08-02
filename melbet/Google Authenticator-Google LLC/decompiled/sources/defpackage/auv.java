package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auv extends alk {
    public auv() {
        super(23, 24);
    }

    @Override // defpackage.alk
    public final void b(ana anaVar) {
        yj.o(anaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
