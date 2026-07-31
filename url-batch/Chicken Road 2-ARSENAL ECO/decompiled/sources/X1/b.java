package X1;

import T1.f;
import W1.d;
import com.onesignal.session.internal.outcomes.impl.o;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public b(f _application) {
        i.e(_application, "_application");
        this._application = _application;
        this.lock = new Object();
    }

    @Override // W1.d
    public W1.c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                }
            }
        }
        c cVar = this.osDatabase;
        i.b(cVar);
        return cVar;
    }
}
