package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auq extends alk {
    public auq() {
        super(17, 18);
    }

    @Override // defpackage.alk
    public final void b(ana anaVar) {
        yj.o(anaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        yj.o(anaVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
