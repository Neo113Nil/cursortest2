package u5;

import z4.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9612a = new b();

    @Override // z4.s
    public final void a(k5.d dVar) {
        dVar.getClass();
        dVar.a();
        try {
            dVar.j("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            dVar.p();
        } finally {
            dVar.i();
        }
    }
}
