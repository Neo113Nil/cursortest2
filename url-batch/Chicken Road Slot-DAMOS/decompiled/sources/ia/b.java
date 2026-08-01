package ia;

import com.onesignal.session.internal.outcomes.impl.o;
import ea.f;
import ha.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public b(f fVar) {
        fVar.getClass();
        this._application = fVar;
        this.lock = new Object();
    }

    @Override // ha.d
    public ha.c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                }
            }
        }
        c cVar = this.osDatabase;
        cVar.getClass();
        return cVar;
    }
}
