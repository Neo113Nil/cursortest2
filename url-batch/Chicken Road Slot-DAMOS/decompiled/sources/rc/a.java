package rc;

import ha.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void run(d dVar) {
        dVar.getClass();
        dVar.getOs().delete("outcome", "name = \"os__session_duration\" AND (session_time = 0 OR session_time IS NULL)", null);
    }
}
