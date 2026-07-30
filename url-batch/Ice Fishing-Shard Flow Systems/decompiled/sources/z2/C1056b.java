package z2;

import com.onesignal.session.internal.outcomes.impl.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v2.f;
import y2.InterfaceC1026c;
import y2.InterfaceC1027d;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056b implements InterfaceC1027d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public C1056b(f _application) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        this._application = _application;
        this.lock = new Object();
    }

    @Override // y2.InterfaceC1027d
    public InterfaceC1026c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                try {
                    if (this.osDatabase == null) {
                        this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                    }
                    Unit unit = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c cVar = this.osDatabase;
        Intrinsics.b(cVar);
        return cVar;
    }
}
