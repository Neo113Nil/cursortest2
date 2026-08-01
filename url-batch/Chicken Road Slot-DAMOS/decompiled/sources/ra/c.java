package ra;

import androidx.lifecycle.d0;
import ba.d;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private final d services;

    public c(d dVar) {
        dVar.getClass();
        this.services = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStart$lambda$2(c cVar) {
        cVar.getClass();
        Iterator it = cVar.services.getAllServices(b.class).iterator();
        while (it.hasNext()) {
            ((b) it.next()).start();
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(a.class).iterator();
        while (it.hasNext()) {
            ((a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        new Thread(new d0(17, this)).start();
    }
}
