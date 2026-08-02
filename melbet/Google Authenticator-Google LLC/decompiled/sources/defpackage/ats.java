package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ats extends alk {
    public static final ats c = new ats();

    private ats() {
        super(3, 4);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
