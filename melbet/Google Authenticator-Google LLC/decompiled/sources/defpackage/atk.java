package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atk extends ajz {
    @Override // defpackage.ajz
    public final void a(amj amjVar) {
        amjVar.b();
        try {
            amjVar.e("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - aul.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            amjVar.f();
        } finally {
            amjVar.d();
        }
    }
}
